package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.jsb.method.SubscribeBulletinMethod$handle$1", f = "SubscribeBulletinMethod.kt", l = {51}, m = "invokeSuspend")
public final class C604590NnV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ User LLJ;
    public final /* synthetic */ CompletionBlock<InterfaceC604600NnW> LLJI;
    public final /* synthetic */ C604630NnZ LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C604590NnV(C19EG c19eg, long j, String str, boolean z, Map<String, String> map, String str2, String str3, User user, CompletionBlock<InterfaceC604600NnW> completionBlock, C604630NnZ c604630NnZ, InterfaceC1364105Vn<? super C604590NnV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = j;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = map;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = user;
        this.LLJI = completionBlock;
        this.LLJIJIL = c604630NnZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604590NnV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String containerID;
        Integer numLJ;
        Object objLJIIIIZZ = obj;
        C1C7U.LIZ("SubscribeBulletinMethod@7544.handle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIIIIZZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIIIZZ);
            C618910OPh c618910OPh = C618910OPh.LIZ;
            C19EG c19eg = this.LLILLJJLI;
            long j = this.LLILLL;
            String str = this.LLILZ;
            boolean z = this.LLILZIL;
            Map<String, String> map = this.LLILZLL;
            String str2 = this.LLIZ;
            String str3 = this.LLIZLLLIL;
            User user = this.LLJ;
            AwS588S0100000_9 awS588S0100000_9 = new AwS588S0100000_9(this.LLJI, (CompletionBlock<InterfaceC604600NnW>) 18);
            this.LL = 1;
            objLJIIIIZZ = c618910OPh.LJIIIIZZ(c19eg, j, str, z, map, str2, str3, user, awS588S0100000_9, this);
            if (objLJIIIIZZ == objLJFF) {
                C1C7U.LIZIZ("SubscribeBulletinMethod@7544.handle$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) objLJIIIIZZ).booleanValue();
        CompletionBlock<InterfaceC604600NnW> completionBlock = this.LLJI;
        InterfaceC634840OvC interfaceC634840OvC = this.LLJIJIL.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC604600NnW.class, containerID);
        InterfaceC604600NnW interfaceC604600NnW = (InterfaceC604600NnW) xBaseModelLIZJ;
        if (zBooleanValue) {
            numLJ = C2286608xc.LJ(1);
        } else {
            numLJ = C2286608xc.LJ(0);
        }
        interfaceC604600NnW.setSuccess(numLJ);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubscribeBulletinMethod@7544.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

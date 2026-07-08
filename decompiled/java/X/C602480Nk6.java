package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.lynx.spark.core.communicate.jsb.EcSearchMixInsertCardMethod$handle$1", f = "EcSearchMixInsertCardMethod.kt", l = {25}, m = "invokeSuspend")
public final class C602480Nk6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMixVSearchAbility LLILLJJLI;
    public final /* synthetic */ InterfaceC602810Nkd LLILLL;
    public final /* synthetic */ C602490Nk7 LLILZ;
    public final /* synthetic */ CompletionBlock<InterfaceC602510Nk9> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C602480Nk6(IMixVSearchAbility iMixVSearchAbility, InterfaceC602810Nkd interfaceC602810Nkd, C602490Nk7 c602490Nk7, CompletionBlock<InterfaceC602510Nk9> completionBlock, InterfaceC1364105Vn<? super C602480Nk6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMixVSearchAbility;
        this.LLILLL = interfaceC602810Nkd;
        this.LLILZ = c602490Nk7;
        this.LLILZIL = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C602480Nk6(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String containerID;
        C1C7U.LIZ("EcSearchMixInsertCardMethod@4e76.handle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String containerID2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                IMixVSearchAbility iMixVSearchAbility = this.LLILLJJLI;
                InterfaceC602810Nkd interfaceC602810Nkd = this.LLILLL;
                this.LL = 1;
                obj = iMixVSearchAbility.OP0(interfaceC602810Nkd, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EcSearchMixInsertCardMethod@4e76.handle$1");
                    return objLJFF;
                }
            }
            Pair pair = (Pair) obj;
            InterfaceC634840OvC interfaceC634840OvC = this.LLILZ.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC602510Nk9.class, containerID);
            InterfaceC602510Nk9 interfaceC602510Nk9 = (InterfaceC602510Nk9) xBaseModelLIZJ;
            interfaceC602510Nk9.setSuccess((Boolean) pair.getFirst());
            interfaceC602510Nk9.setMessage((String) pair.getSecond());
            this.LLILZIL.onSuccess((InterfaceC602510Nk9) xBaseModelLIZJ, "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            InterfaceC634840OvC interfaceC634840OvC2 = this.LLILZ.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID2 = interfaceC634840OvC2.getContainerID();
            }
            InterfaceC602510Nk9 interfaceC602510Nk92 = (InterfaceC602510Nk9) C1909107dp.LIZJ(InterfaceC602510Nk9.class, containerID2);
            interfaceC602510Nk92.setSuccess(false);
            interfaceC602510Nk92.setMessage(th.getMessage());
            this.LLILZIL.onSuccess(interfaceC602510Nk92, "");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchMixInsertCardMethod@4e76.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

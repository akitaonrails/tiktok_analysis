package X;

import com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ln3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler$executeShare$1$1$preShareLinkJob$1", f = "BaseChannelShareHandler.kt", l = {129}, m = "invokeSuspend")
public final class C1371350ln3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ BaseChannelShareHandler<BaseSharePackage> LLILLJJLI;
    public final /* synthetic */ InterfaceC1369790lkX LLILLL;
    public final /* synthetic */ BaseSharePackage LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371350ln3(BaseChannelShareHandler<BaseSharePackage> baseChannelShareHandler, InterfaceC1369790lkX interfaceC1369790lkX, BaseSharePackage baseSharePackage, InterfaceC1364105Vn<? super C1371350ln3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseChannelShareHandler;
        this.LLILLL = interfaceC1369790lkX;
        this.LLILZ = baseSharePackage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1371350ln3(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseChannelShareHandler@1053.executeShare$1$1$preShareLinkJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            BaseChannelShareHandler<BaseSharePackage> baseChannelShareHandler = this.LLILLJJLI;
            InterfaceC1369790lkX interfaceC1369790lkX = this.LLILLL;
            BaseSharePackage baseSharePackage = this.LLILZ;
            this.LL = 1;
            obj = baseChannelShareHandler.LJIIIZ(interfaceC1369790lkX, baseSharePackage, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseChannelShareHandler@1053.executeShare$1$1$preShareLinkJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BaseChannelShareHandler@1053.executeShare$1$1$preShareLinkJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0dZI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.playable.CommercePlayableLogger$logPlayableShow$1", f = "CommercePlayableLogger.kt", l = {}, m = "invokeSuspend")
public final class C1055300dZI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1055330dZL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055300dZI(C1055330dZL c1055330dZL, InterfaceC1364105Vn<? super C1055300dZI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1055330dZL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1055300dZI(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommercePlayableLogger@a31c.logPlayableShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1055330dZL c1055330dZL = this.LL;
        C1055310dZJ.LIZ.getClass();
        c1055330dZL.logAd(C1055310dZJ.LIZIZ, new AwS595S0100000_16(this.LL, 28));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommercePlayableLogger@a31c.logPlayableShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

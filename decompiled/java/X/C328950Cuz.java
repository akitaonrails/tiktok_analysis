package X;

import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Cuz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.video.doublecolumn.TakoDoubleColumnVideoShareVM$syncQueryAweme$2$1$1", f = "TakoDoubleColumnVideoShareVM.kt", l = {}, m = "invokeSuspend")
public final class C328950Cuz extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super BatchDetailList>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC20236714Gf<BatchDetailList> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C328950Cuz(InterfaceC20236714Gf<? super BatchDetailList> interfaceC20236714Gf, InterfaceC1364105Vn<? super C328950Cuz> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoDoubleColumnVideoShareVM@381b.syncQueryAweme$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC20236714Gf<BatchDetailList> interfaceC20236714Gf = this.LL;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoDoubleColumnVideoShareVM@381b.syncQueryAweme$2$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super BatchDetailList> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C328950Cuz(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

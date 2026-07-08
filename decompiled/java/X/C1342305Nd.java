package X;

import com.ss.android.ugc.gamora.recorder.control.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Nd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.control.FullHorizontalCarrouselRecordDockBarScene$updateUploadLabelAnimationShowCount$1", f = "FullHorizontalCarrouselRecordDockBarScene.kt", l = {}, m = "invokeSuspend")
public final class C1342305Nd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ h LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342305Nd(h hVar, InterfaceC1364105Vn<? super C1342305Nd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = hVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1342305Nd(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullHorizontalCarrouselRecordDockBarScene@605b.updateUploadLabelAnimationShowCount$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL.LLLILZ.LIZ.getInt("fwhc_launch_count_key", 0);
        this.LL.LLLILZ.LIZ.storeInt("fwhc_launch_count_key", i + 1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullHorizontalCarrouselRecordDockBarScene@605b.updateUploadLabelAnimationShowCount$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

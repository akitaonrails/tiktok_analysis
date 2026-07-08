package X;

import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.component.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0miR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ui.component.RecordLogicComponent$onRecordMonitor$1$invoke$1", f = "RecordApiComponent.kt", l = {}, m = "invokeSuspend")
public final class C1406930miR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0LAB LL;
    public final /* synthetic */ u LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1406930miR(C0LAB c0lab, u uVar, InterfaceC1364105Vn<? super C1406930miR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0lab;
        this.LLILLJJLI = uVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1406930miR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordLogicComponent@69c3.onRecordMonitor$1$invoke$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0LAB c0lab = this.LL;
        u uVar = this.LLILLJJLI;
        c0lab.LIZ(1, "is_composer");
        c0lab.LIZLLL(uVar.c3(), "beautify_used");
        if (C294160Bfy.LIZ()) {
            ComposerBeautyBuriedInfo composerBeautyBuriedInfoK4 = uVar.K4();
            MBeautyStateInfo mBeautyStateInfoO4 = uVar.O4();
            c0lab.LJ("beautify_info", C1409940mnI.LJ(composerBeautyBuriedInfoK4));
            c0lab.LIZ(C1409940mnI.LIZJ(composerBeautyBuriedInfoK4, mBeautyStateInfoO4), "beautify_status");
        }
        C20684815ws.LJIILLIIL("record_frame_rate_info", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordLogicComponent@69c3.onRecordMonitor$1$invoke$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import nv7.c0;

/* JADX INFO: renamed from: X.0To7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.view.CameraViewKt$CameraView$1$1$1", f = "CameraView.kt", l = {121}, m = "invokeSuspend")
public final class C757850To7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;
    public final /* synthetic */ C05P0<Integer> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757850To7(C05P0<Boolean> c05p0, C05P0<Integer> c05p02, InterfaceC1364105Vn<? super C757850To7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C757850To7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CameraViewKt@2f1.CameraView$1$1$1");
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
            if (this.LLILLJJLI.getValue().booleanValue()) {
                C1677050tk7 c1677050tk7 = C1666870tTh.LIZ;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                    C1C7U.LIZIZ("CameraViewKt@2f1.CameraView$1$1$1");
                    return objLJFF;
                }
            }
            this.LLILLL.setValue(Integer.valueOf(c0.LIZ.o2()));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CameraViewKt@2f1.CameraView$1$1$1");
            return unit;
        }
        this.LLILLJJLI.setValue(Boolean.FALSE);
        AnonymousClass0515.LIZIZ(true, "camera_toolbar_text_shown");
        this.LLILLL.setValue(Integer.valueOf(c0.LIZ.o2()));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CameraViewKt@2f1.CameraView$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

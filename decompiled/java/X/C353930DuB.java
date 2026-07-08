package X;

import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.effect.SlowMotionNLEHandler$replaceSlotWithNewVideo$1$1$1", f = "SlowMotionNLEHandler.kt", l = {}, m = "invokeSuspend")
public final class C353930DuB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C353920DuA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353930DuB(C353920DuA c353920DuA, InterfaceC1364105Vn<? super C353930DuB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c353920DuA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353930DuB(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SlowMotionNLEHandler@531b.replaceSlotWithNewVideo$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ.commit();
        this.LL.LJI.onProgress(100);
        this.LL.LJI.onComplete();
        INLEPlayer iNLEPlayer = this.LL.LIZIZ;
        if (iNLEPlayer != null) {
            C2286608xc.LJ(iNLEPlayer.stop());
        }
        INLEPlayer iNLEPlayer2 = this.LL.LIZIZ;
        if (iNLEPlayer2 != null) {
            C2286608xc.LJ(iNLEPlayer2.preload());
        }
        INLEPlayer iNLEPlayer3 = this.LL.LIZIZ;
        if (iNLEPlayer3 != null) {
            C2286608xc.LJ(iNLEPlayer3.play());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SlowMotionNLEHandler@531b.replaceSlotWithNewVideo$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

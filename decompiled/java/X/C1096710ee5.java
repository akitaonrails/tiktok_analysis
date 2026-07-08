package X;

import com.bytedance.android.livesdk.game.model.GuessTaskPackInfo;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ee5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.points.PointsShortTouchViewModel$doContinueUpdateDurationTask$1$2", f = "PointsShortTouchViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1096710ee5 extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super GuessTaskPackInfo>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C1096710ee5(InterfaceC1364105Vn<? super C1096710ee5> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PointsShortTouchViewModel@559d.doContinueUpdateDurationTask$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20441214yg.LJI("PointsShortTouchMgr", (Throwable) this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PointsShortTouchViewModel@559d.doContinueUpdateDurationTask$1$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super GuessTaskPackInfo> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1096710ee5 c1096710ee5 = new C1096710ee5(interfaceC1364105Vn);
        c1096710ee5.LL = th;
        return c1096710ee5.invokeSuspend(Unit.LIZ);
    }
}

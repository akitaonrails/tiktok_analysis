package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Lu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.VideoChosenResultFromAddSceneImpl$resizeImageIfNeeded$3", f = "VideoChosenResultFromAddSceneImpl.kt", l = {}, m = "invokeSuspend")
public final class C2358009Lu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C536080L0s LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2358009Lu(C536080L0s c536080L0s, InterfaceC1364105Vn<? super C2358009Lu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c536080L0s;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2358009Lu(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoChosenResultFromAddSceneImpl@77d1.resizeImageIfNeeded$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJFF();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoChosenResultFromAddSceneImpl@77d1.resizeImageIfNeeded$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

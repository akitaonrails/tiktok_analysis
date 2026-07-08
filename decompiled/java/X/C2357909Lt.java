package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.VideoChosenResultFromAddSceneImpl$compressVideoIfNeeded$2", f = "VideoChosenResultFromAddSceneImpl.kt", l = {}, m = "invokeSuspend")
public final class C2357909Lt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C536080L0s LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2357909Lt(C536080L0s c536080L0s, InterfaceC1364105Vn<? super C2357909Lt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c536080L0s;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2357909Lt(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoChosenResultFromAddSceneImpl@77d1.compressVideoIfNeeded$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJFF();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoChosenResultFromAddSceneImpl@77d1.compressVideoIfNeeded$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

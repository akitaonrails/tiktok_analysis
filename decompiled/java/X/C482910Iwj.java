package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Iwj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.live.LivePodcastDataManager$preRequestPodcastData$1$1", f = "LivePodcastDataManager.kt", l = {}, m = "invokeSuspend")
public final class C482910Iwj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C482910Iwj(InterfaceC1364105Vn<? super C482910Iwj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C482910Iwj(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LivePodcastDataManager@2f90.preRequestPodcastData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C783820Uou.LIZ.getClass();
        C783820Uou.LIZIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LivePodcastDataManager@2f90.preRequestPodcastData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C482910Iwj(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

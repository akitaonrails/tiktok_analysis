package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.controller.PcsVideoPlayerViewController$getOnUIPlayListener$1$onPlayCompleted$1", f = "PcsVideoPlayerViewController.kt", l = {}, m = "invokeSuspend")
public final class C490840JMs extends C09AX implements Function2<C0N0Y, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0JO7 LLILLJJLI;
    public final /* synthetic */ C490810JMp LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C490840JMs(C0JO7 c0jo7, C490810JMp c490810JMp, InterfaceC1364105Vn<? super C490840JMs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0jo7;
        this.LLILLL = c490810JMp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C490840JMs c490840JMs = new C490840JMs(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c490840JMs.LL = obj;
        return c490840JMs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C490810JMp c490810JMp;
        C0JO7 c0jo7;
        String currentSourceID;
        C0N0Y c0n0yLIZLLL;
        C1C7U.LIZ("PcsVideoPlayerViewController@65f8.getOnUIPlayListener$1$onPlayCompleted$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0N0Y c0n0y = (C0N0Y) this.LL;
        c0n0y.LJJIIJZLJL();
        if (this.LLILLJJLI.LLILZIL.LIZIZ.LIZ.LIZ && (c0jo7 = (c490810JMp = this.LLILLL).LL) != null && (currentSourceID = c0jo7.getCurrentSourceID()) != null && (c0n0yLIZLLL = c490810JMp.LIZLLL(currentSourceID)) != null) {
            C490750JMj.LJ(c0n0yLIZLLL, c490810JMp.LLILZ, new C424601ky(null));
        }
        c0n0y.seek(0.0f);
        c0n0y.LJIILLIIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsVideoPlayerViewController@65f8.getOnUIPlayListener$1$onPlayCompleted$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0N0Y c0n0y, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0n0y, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

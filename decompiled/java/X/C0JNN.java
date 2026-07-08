package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JNN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.PcsVideoPlayerView$initObserver$1", f = "PcsVideoPlayerView.kt", l = {}, m = "invokeSuspend")
public final class C0JNN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0JO7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JNN(C0JO7 c0jo7, InterfaceC1364105Vn<? super C0JNN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0jo7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0JNN c0jnn = new C0JNN(this.LLILLJJLI, interfaceC1364105Vn);
        c0jnn.LL = obj;
        return c0jnn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsVideoPlayerView@8926.initObserver$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0JNM(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0JNJ(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0JNS(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0JNG(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0JNO(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0JNR(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0JNT(this.LLILLJJLI, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsVideoPlayerView@8926.initObserver$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

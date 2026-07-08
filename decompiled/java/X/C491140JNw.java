package X;

import Y.AgS288S0100000_7;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayLandscapeLayout$initObserver$1$5", f = "PlayerOverlayLandscapeLayout.kt", l = {190}, m = "invokeSuspend")
public final class C491140JNw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C490990JNh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491140JNw(C490990JNh c490990JNh, InterfaceC1364105Vn<? super C491140JNw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c490990JNh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C491140JNw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayerOverlayLandscapeLayout@1994.initObserver$1$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC332260D0u<Integer> interfaceC332260D0u = this.LLILLJJLI.getPlayerChannel().LIZLLL;
            AgS288S0100000_7 agS288S0100000_7 = new AgS288S0100000_7(this.LLILLJJLI, 23);
            this.LL = 1;
            if (interfaceC332260D0u.collect(agS288S0100000_7, this) == objLJFF) {
                C1C7U.LIZIZ("PlayerOverlayLandscapeLayout@1994.initObserver$1$5");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

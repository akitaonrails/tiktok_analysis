package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0JNI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.PcsVideoPlayerView$initObserver$1$1$1$1", f = "PcsVideoPlayerView.kt", l = {}, m = "invokeSuspend")
public final class C0JNI extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0JO7 LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JNI(C0JO7 c0jo7, float f, InterfaceC1364105Vn<? super C0JNI> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c0jo7;
        this.LLILLJJLI = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JNI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsVideoPlayerView@8926.initObserver$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0JO7 c0jo7 = this.LL;
        C0JNK c0jnk = c0jo7.LLILZLL;
        if (c0jnk != null) {
            c0jnk.LIZ(this.LLILLJJLI, c0jo7.getPlayerChannel().LIZ());
        }
        C0JO7 c0jo72 = this.LL;
        C0JNK c0jnk2 = c0jo72.LLILZLL;
        if (c0jnk2 != null) {
            c0jnk2.LJJLIIIIJ(c0jo72.getPlayerChannel().LIZ());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsVideoPlayerView@8926.initObserver$1$1$1$1");
        return unit;
    }
}

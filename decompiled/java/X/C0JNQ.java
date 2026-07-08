package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0JNQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.PcsVideoPlayerView$initObserver$1$3$1$1", f = "PcsVideoPlayerView.kt", l = {}, m = "invokeSuspend")
public final class C0JNQ extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C0JO7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JNQ(boolean z, C0JO7 c0jo7, InterfaceC1364105Vn<? super C0JNQ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c0jo7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JNQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsVideoPlayerView@8926.initObserver$1$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            Iterator<C0JNP> it2 = this.LLILLJJLI.LLIZLLLIL.iterator();
            while (it2.hasNext()) {
                it2.next().JG();
            }
        } else {
            Iterator<C0JNP> it3 = this.LLILLJJLI.LLIZLLLIL.iterator();
            while (it3.hasNext()) {
                it3.next().XI();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsVideoPlayerView@8926.initObserver$1$3$1$1");
        return unit;
    }
}

package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JO0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.view.PcsVideoSeekbarView$tryMinimizeSeekbar$1", f = "PcsVideoSeekbarView.kt", l = {170, 171}, m = "invokeSuspend")
public final class C0JO0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C491160JNy LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JO0(C491160JNy c491160JNy, InterfaceC1364105Vn<? super C0JO0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c491160JNy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JO0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsVideoSeekbarView@3e6a.tryMinimizeSeekbar$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PcsVideoSeekbarView@3e6a.tryMinimizeSeekbar$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("PcsVideoSeekbarView@3e6a.tryMinimizeSeekbar$1");
                return objLJFF;
            }
        }
        C0JO1 c0jo1 = new C0JO1(this.LLILLJJLI, null);
        this.LL = 2;
        if (C490750JMj.LIZJ(this, c0jo1) == objLJFF) {
            C1C7U.LIZIZ("PcsVideoSeekbarView@3e6a.tryMinimizeSeekbar$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PcsVideoSeekbarView@3e6a.tryMinimizeSeekbar$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

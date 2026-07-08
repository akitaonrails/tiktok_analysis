package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.usercommunication.PNSVideoPlayerListener$initSwipeUpGuideListener$1", f = "PNSVideoPlayerListener.kt", l = {}, m = "invokeSuspend")
public final class C716830S9x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ LifecycleOwner LLILLL;
    public final /* synthetic */ C1916800zyo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C716830S9x(Context context, LifecycleOwner lifecycleOwner, C1916800zyo c1916800zyo, InterfaceC1364105Vn<? super C716830S9x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = c1916800zyo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C716830S9x c716830S9x = new C716830S9x(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c716830S9x.LL = obj;
        return c716830S9x;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PNSVideoPlayerListener@961f.initSwipeUpGuideListener$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LLILLJJLI;
        LifecycleOwner lifecycleOwner = this.LLILLL;
        final C1916800zyo c1916800zyo = this.LLILZ;
        try {
            C0SHX.LIZ(context, lifecycleOwner).LJIIIZ("swipe_up_guide", new C0T3B() { // from class: X.0S9y
                @Override // X.C0T3B
                public final void LIZ() {
                }

                @Override // X.C0T3B
                public final void LIZIZ() {
                    C1916800zyo c1916800zyo2 = c1916800zyo;
                    c1916800zyo2.LL--;
                }
            });
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C1916800zyo c1916800zyo2 = this.LLILZ;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c1916800zyo2.LLIZLLLIL = false;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PNSVideoPlayerListener@961f.initSwipeUpGuideListener$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

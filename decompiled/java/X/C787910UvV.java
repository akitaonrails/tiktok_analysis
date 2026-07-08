package X;

import Y.ARunnableS82S0200000_13;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0UvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787910UvV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC425720Gmg LLILLJJLI;
    public final /* synthetic */ FrameLayout LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C787910UvV(View view, ViewTreeObserverOnGlobalLayoutListenerC425720Gmg viewTreeObserverOnGlobalLayoutListenerC425720Gmg, FrameLayout frameLayout, Function0<Unit> function0, View view2) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = viewTreeObserverOnGlobalLayoutListenerC425720Gmg;
        this.LLILLL = frameLayout;
        this.LLILZ = function0;
        this.LLILZIL = view2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        C786410Ut5.C3(this.LL.getViewTreeObserver(), this.LLILLJJLI);
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            HandlerHook.viewPost(frameLayout, new ARunnableS82S0200000_13(this.LLILZIL, frameLayout, 109));
        }
        C787920UvW.LIZIZ = false;
        Function0<Unit> function0 = this.LLILZ;
        if (function0 == null) {
            return null;
        }
        function0.invoke();
        return Unit.LIZ;
    }
}

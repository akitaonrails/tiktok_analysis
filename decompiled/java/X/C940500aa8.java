package X;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aa8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940500aa8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ FrameLayout LL;
    public final /* synthetic */ C940470aa5 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C940500aa8(FrameLayout frameLayout, C940470aa5 c940470aa5, int i, int i2, int i3) {
        super(0);
        this.LL = frameLayout;
        this.LLILLJJLI = c940470aa5;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        if (!Intrinsics.LJFF(this.LL, this.LLILLJJLI.LLIZLLLIL)) {
            C940470aa5 c940470aa5 = this.LLILLJJLI;
            InterfaceC937900aVw interfaceC937900aVw = c940470aa5.LLIZ;
            if (interfaceC937900aVw != null) {
                interfaceC937900aVw.LJJJJJL(c940470aa5);
            }
            InterfaceC937900aVw interfaceC937900aVw2 = this.LLILLJJLI.LLIZ;
            if (interfaceC937900aVw2 != null) {
                interfaceC937900aVw2.LLIZ(this.LLILLL);
            }
            this.LLILLJJLI.LLJJIJIL = new Pair<>(Integer.valueOf(this.LLILZ), Integer.valueOf(this.LLILZIL));
            FrameLayout frameLayout = this.LLILLJJLI.LLIZLLLIL;
            if (frameLayout != null && (viewTreeObserver2 = frameLayout.getViewTreeObserver()) != null) {
                ViewTreeObserverOnGlobalLayoutListenerC940540aaC viewTreeObserverOnGlobalLayoutListenerC940540aaC = this.LLILLJJLI.LLJL;
                viewTreeObserver2.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC940540aaC);
                C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnGlobalLayoutListenerC940540aaC, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            C940470aa5 c940470aa52 = this.LLILLJJLI;
            FrameLayout frameLayout2 = this.LL;
            c940470aa52.LLIZLLLIL = frameLayout2;
            c940470aa52.LLJJ = this.LLILLL;
            if (frameLayout2 != null && (viewTreeObserver = frameLayout2.getViewTreeObserver()) != null) {
                ViewTreeObserverOnGlobalLayoutListenerC940540aaC viewTreeObserverOnGlobalLayoutListenerC940540aaC2 = this.LLILLJJLI.LLJL;
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC940540aaC2);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC940540aaC2, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
        C940470aa5 c940470aa53 = this.LLILLJJLI;
        int i = c940470aa53.LLJJ;
        int i2 = this.LLILLL;
        if (i != i2) {
            InterfaceC937900aVw interfaceC937900aVw3 = c940470aa53.LLIZ;
            if (interfaceC937900aVw3 != null) {
                interfaceC937900aVw3.LJJZZI(i2);
            }
            this.LLILLJJLI.LLJJ = this.LLILLL;
        }
        return Unit.LIZ;
    }
}

package X;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.DanmakuSwitchAssem;

/* JADX INFO: renamed from: X.0IDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class ViewTreeObserverOnPreDrawListenerC462850IDb implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            case 3:
                return onPreDraw$3(this);
            case 4:
                return onPreDraw$4(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC462850IDb viewTreeObserverOnPreDrawListenerC462850IDb) {
        C430560GuU c430560GuU = (C430560GuU) viewTreeObserverOnPreDrawListenerC462850IDb.l0;
        if (!c430560GuU.LLJJJJ && c430560GuU.LLJJJJLIIL != null) {
            C786410Ut5.D3(c430560GuU.getViewTreeObserver(), ((C430560GuU) viewTreeObserverOnPreDrawListenerC462850IDb.l0).LLJJJJLIIL);
            return true;
        }
        if (c430560GuU.LLJJJJLIIL != null) {
            C786410Ut5.D3(c430560GuU.getViewTreeObserver(), ((C430560GuU) viewTreeObserverOnPreDrawListenerC462850IDb.l0).LLJJJJLIIL);
        }
        C430560GuU c430560GuU2 = (C430560GuU) viewTreeObserverOnPreDrawListenerC462850IDb.l0;
        c430560GuU2.LJJJJL(c430560GuU2.getWidth());
        ((C430560GuU) viewTreeObserverOnPreDrawListenerC462850IDb.l0).LLJJJJ = false;
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC462850IDb viewTreeObserverOnPreDrawListenerC462850IDb) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewTreeObserver viewTreeObserver;
        LinearLayout linearLayout = ((DanmakuSwitchAssem) viewTreeObserverOnPreDrawListenerC462850IDb.l0).LLLFFI;
        if (linearLayout != null && (viewTreeObserver = linearLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC462850IDb);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC462850IDb, ViewTreeObserver.OnPreDrawListener.class);
        }
        LinearLayout linearLayout2 = ((DanmakuSwitchAssem) viewTreeObserverOnPreDrawListenerC462850IDb.l0).LLLFFI;
        if (linearLayout2 != null) {
            int width = linearLayout2.getWidth();
            DanmakuSwitchAssem danmakuSwitchAssem = (DanmakuSwitchAssem) viewTreeObserverOnPreDrawListenerC462850IDb.l0;
            if (width > 0 && width < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(160))) {
                ViewGroup.LayoutParams layoutParams = danmakuSwitchAssem.LJJIJL().getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    if (marginLayoutParams2.getMarginEnd() == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) {
                        return true;
                    }
                    marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    C786410Ut5.W5(danmakuSwitchAssem.LJJIJL(), marginLayoutParams2);
                    return false;
                }
            }
        }
        ViewGroup.LayoutParams layoutParams2 = ((DanmakuSwitchAssem) viewTreeObserverOnPreDrawListenerC462850IDb.l0).LJJIJL().getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            DanmakuSwitchAssem danmakuSwitchAssem2 = (DanmakuSwitchAssem) viewTreeObserverOnPreDrawListenerC462850IDb.l0;
            if (marginLayoutParams.getMarginEnd() != C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96))) {
                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96)));
                C786410Ut5.W5(danmakuSwitchAssem2.LJJIJL(), marginLayoutParams);
                return false;
            }
        }
        return true;
    }

    public static final boolean onPreDraw$2(ViewTreeObserverOnPreDrawListenerC462850IDb viewTreeObserverOnPreDrawListenerC462850IDb) {
        C786410Ut5.D3(((C0HCH) viewTreeObserverOnPreDrawListenerC462850IDb.l0).LLILZIL.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC462850IDb);
        ((C0HCH) viewTreeObserverOnPreDrawListenerC462850IDb.l0).LLILZIL.getLayoutParams().height = C814420VxA.LIZIZ((((C0HCH) viewTreeObserverOnPreDrawListenerC462850IDb.l0).LLILZIL.getMeasuredWidth() * 243.0f) / 390.0f);
        ((C0HCH) viewTreeObserverOnPreDrawListenerC462850IDb.l0).LLILZIL.requestLayout();
        return true;
    }

    public static final boolean onPreDraw$3(ViewTreeObserverOnPreDrawListenerC462850IDb viewTreeObserverOnPreDrawListenerC462850IDb) {
        ((C428890Grn) viewTreeObserverOnPreDrawListenerC462850IDb.l0).O0();
        return true;
    }

    public static final boolean onPreDraw$4(ViewTreeObserverOnPreDrawListenerC462850IDb viewTreeObserverOnPreDrawListenerC462850IDb) throws Throwable {
        C786410Ut5.D3(((C0HJ0) viewTreeObserverOnPreDrawListenerC462850IDb.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC462850IDb);
        ((C0HJ0) viewTreeObserverOnPreDrawListenerC462850IDb.l0).LJJJJLL();
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC462850IDb(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

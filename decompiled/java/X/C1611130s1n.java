package X;

import Y.ARunnableS28S1200000_24;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0s1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611130s1n extends C09AY implements Function2<View, MotionEvent, Boolean> {
    public final /* synthetic */ C1611120s1m LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611130s1n(C1611120s1m c1611120s1m) {
        super(2);
        this.LL = c1611120s1m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(View view, MotionEvent motionEvent) {
        Aweme aweme;
        View view2 = view;
        MotionEvent motionEvent2 = motionEvent;
        boolean z = false;
        if (motionEvent2.getAction() == 0) {
            this.LL.LLIZLLLIL = System.currentTimeMillis();
            C19EG activity = this.LL.LIZJ().getActivity();
            if (activity != null) {
                aweme = C680080Qly.LIZIZ(activity).LLJILJILJ;
            } else {
                aweme = null;
            }
            String strF3 = this.LL.LIZJ().f3();
            C1611120s1m c1611120s1m = this.LL;
            c1611120s1m.getClass();
            if (C286170BJn.LIZ() != 1 && C286170BJn.LIZ() != 3) {
                C1ER1 c1er1 = C1ER1.LIZIZ;
                C0QDS c0qdsLJII = c1611120s1m.LJII(aweme, strF3, c1er1.LLJLILLLLZIIL());
                c1611120s1m.LLJIJIL = c0qdsLJII;
                c1er1.LJLJJLL(c0qdsLJII);
            } else {
                C823050WQl.LIZLLL().execute(new ARunnableS28S1200000_24(aweme, strF3, c1611120s1m, 3));
            }
            C688420QzQ.LIZIZ.LIZLLL("search_icon");
            C1ER1.LIZIZ.LLJILLL();
        } else if (motionEvent2.getAction() == 3) {
            C1ER1.LIZIZ.LLJJJJJIL(this.LL.LLIZLLLIL, "search_icon", true);
        } else if (motionEvent2.getAction() == 1) {
            int scaledTouchSlop = ViewConfiguration.get(view2.getContext()).getScaledTouchSlop();
            float x = motionEvent2.getX();
            float y = motionEvent2.getY();
            C688420QzQ.LIZIZ.LIZJ("search_icon");
            C1ER1 c1er12 = C1ER1.LIZIZ;
            this.LL.getClass();
            float f = -scaledTouchSlop;
            if (x >= f && y >= f && x < (view2.getRight() - view2.getLeft()) + scaledTouchSlop && y < (view2.getBottom() - view2.getTop()) + scaledTouchSlop) {
                z = true;
            }
            c1er12.LLJJJJJIL(this.LL.LLIZLLLIL, "search_icon", !z);
        }
        return Boolean.FALSE;
    }
}

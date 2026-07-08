package Y;

import X.C09RD;
import X.C09RE;
import X.C12ES;
import X.C1C7U;
import X.C417850GZz;
import X.C786410Ut5;
import X.C930540aK4;
import X.C937980aW4;
import X.C977590bXx;
import X.C977620bY0;
import X.EnumC919170a1j;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public class ARunnableS9S0310000_15 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        View view;
        ViewGroup viewGroup;
        if (this.z3 && !((C937980aW4) this.l0).LJIIIZ().containsKey((View) this.l1)) {
            C786410Ut5.LJJJLZIJ((View) this.l1, (ViewGroup) this.l2);
            return;
        }
        C937980aW4 c937980aW4 = (C937980aW4) this.l0;
        View view2 = (View) this.l1;
        ViewGroup viewGroup2 = (ViewGroup) this.l2;
        c937980aW4.getClass();
        Object parent = viewGroup2.getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return;
        }
        ViewParent parent2 = view.getParent();
        if (!(parent2 instanceof ViewGroup) || (viewGroup = (ViewGroup) parent2) == null) {
            return;
        }
        int iLJIIIIZZ = (int) c937980aW4.LJIIIIZZ();
        final int stroke_width = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE.getSTROKE_WIDTH();
        final float f = iLJIIIIZZ;
        viewGroup2.setOutlineProvider(new ViewOutlineProvider(f, stroke_width) { // from class: X.0Ga0
            public final float LIZ;
            public final int LIZIZ;

            {
                this.LIZ = f;
                this.LIZIZ = stroke_width;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view3, Outline outline) {
                outline.setRoundRect(new Rect(view3.getPaddingLeft() - this.LIZIZ, view3.getPaddingTop() - this.LIZIZ, (view3.getWidth() - view3.getPaddingRight()) + this.LIZIZ, (view3.getHeight() - view3.getPaddingBottom()) + this.LIZIZ), this.LIZ);
            }
        });
        viewGroup2.setClipToOutline(true);
        Iterator<View> it2 = new C09RD(viewGroup2).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                c937980aW4.LLILLJJLI.LIZ(c937980aW4.LJIIIIZZ());
                int stroke_width2 = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE.getSTROKE_WIDTH() / 2;
                int i = stroke_width2 * 2;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(viewGroup2.getWidth() + i, viewGroup2.getHeight() + i);
                layoutParams.leftMargin = view.getLeft() - stroke_width2;
                layoutParams.topMargin = view.getTop() - stroke_width2;
                C786410Ut5.W5(view2, layoutParams);
                view2.setBackground(c937980aW4.LJIIL(view2));
                C12ES.LJIILL(0, view2);
                C930540aK4.LJJIL(-1, view2, viewGroup);
                c937980aW4.LJIIIZ().put(view2, viewGroup2);
                return;
            }
            C417850GZz.LIZ((int) c937980aW4.LJIIIIZZ(), (View) c09re.next());
        }
    }

    public static final void run$0(ARunnableS9S0310000_15 aRunnableS9S0310000_15) {
        boolean zLIZ;
        C1C7U.LIZ("RoundCornerStyle@1068.handleStyleInner$2");
        try {
            aRunnableS9S0310000_15.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RoundCornerStyle@1068.handleStyleInner$2");
    }

    public static final void run$1(ARunnableS9S0310000_15 aRunnableS9S0310000_15) {
        boolean zLIZ;
        C1C7U.LIZ("TeamMatchInviterViewModel@38a2.sendInvite$1");
        try {
            ((C977590bXx) aRunnableS9S0310000_15.l0).LJIILJJIL(aRunnableS9S0310000_15.z3, (Long) aRunnableS9S0310000_15.l1, (EnumC919170a1j) aRunnableS9S0310000_15.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TeamMatchInviterViewModel@38a2.sendInvite$1");
    }

    public static final void run$2(ARunnableS9S0310000_15 aRunnableS9S0310000_15) {
        boolean zLIZ;
        C1C7U.LIZ("TwoMatchInviterViewModel@1a1b.sendInvite$3");
        try {
            ((C977620bY0) aRunnableS9S0310000_15.l0).LJIJJLI(aRunnableS9S0310000_15.z3, (Long) aRunnableS9S0310000_15.l1, (EnumC919170a1j) aRunnableS9S0310000_15.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TwoMatchInviterViewModel@1a1b.sendInvite$3");
    }

    public ARunnableS9S0310000_15(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z3 = z;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

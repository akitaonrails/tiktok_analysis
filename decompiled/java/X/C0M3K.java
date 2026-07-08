package X;

import Y.ARunnableS108S0100000_8;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M3K, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M3K implements C0M3F {
    public final ViewGroup LIZ;
    public final TuxIconView LIZIZ;
    public final Set<View> LIZJ = new LinkedHashSet();
    public final Set<String> LIZLLL = new LinkedHashSet();
    public boolean LJ;

    public final void LIZIZ() {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        HandlerHook.viewPost(this.LIZIZ, new ARunnableS108S0100000_8(this, 126));
    }

    @Override // X.C0M3F
    public final boolean LJ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        TextView textView;
        boolean z = false;
        if (!this.LIZLLL.isEmpty()) {
            return false;
        }
        if (this.LIZIZ.isAttachedToWindow() && this.LIZIZ.getWidth() != 0 && this.LIZIZ.getHeight() != 0) {
            Iterator<T> it2 = this.LIZJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                View view = (View) it2.next();
                if (view.getVisibility() == 0 && view.getWidth() != 0 && view.getHeight() != 0 && (!(view instanceof TextView) || (textView = (TextView) view) == null || textView.length() != 0)) {
                    float fLJIIIIZZ = LJIIIIZZ(view);
                    float fLJIIIIZZ2 = LJIIIIZZ(this.LIZIZ);
                    float width = view.getWidth() + fLJIIIIZZ;
                    ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
                    if (width >= fLJIIIIZZ2 - ((!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) == null) ? 0 : marginLayoutParams4.leftMargin)) {
                        float width2 = fLJIIIIZZ2 + this.LIZIZ.getWidth();
                        ViewGroup.LayoutParams layoutParams2 = this.LIZIZ.getLayoutParams();
                        if (fLJIIIIZZ <= width2 + ((!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) ? 0 : marginLayoutParams3.rightMargin)) {
                            float fLJIIIZ = LJIIIZ(view);
                            float fLJIIIZ2 = LJIIIZ(this.LIZIZ);
                            float height = view.getHeight() + fLJIIIZ;
                            ViewGroup.LayoutParams layoutParams3 = this.LIZIZ.getLayoutParams();
                            if (height >= fLJIIIZ2 - ((!(layoutParams3 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) == null) ? 0 : marginLayoutParams2.topMargin)) {
                                float height2 = fLJIIIZ2 + this.LIZIZ.getHeight();
                                ViewGroup.LayoutParams layoutParams4 = this.LIZIZ.getLayoutParams();
                                if (fLJIIIZ <= height2 + ((!(layoutParams4 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) == null) ? 0 : marginLayoutParams.bottomMargin)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return !z;
    }

    public final void LJII() {
        C786410Ut5.LLLLLLZZ(this.LIZIZ, LJ() ? 0 : 8);
        this.LJ = false;
    }

    @Override // X.C0M3F
    public final void LIZ(View view) {
        this.LIZJ.add(view);
        LIZIZ();
    }

    @Override // X.C0M3F
    public final void LIZJ(String str) {
        this.LIZLLL.add(str);
        LIZIZ();
    }

    @Override // X.C0M3F
    public final void LIZLLL(String str) {
        this.LIZLLL.remove(str);
        LIZIZ();
    }

    @Override // X.C0M3F
    public final void LJFF(C0M0J c0m0j) {
        if (c0m0j == null) {
            LIZJ(C0M3B.NOT_FROM_TARGET_MODE.getValue());
        } else {
            LIZLLL(C0M3B.NOT_FROM_TARGET_MODE.getValue());
            LJI(c0m0j);
        }
    }

    public final void LJI(C0M0J c0m0j) {
        int i;
        TuxIconView tuxIconView = this.LIZIZ;
        int i2 = C0M0K.LIZ[c0m0j.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = R.raw.icon_ai_portrait_fill;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i = R.raw.icon_ai_self;
            }
        } else {
            i = R.raw.icon_templates_cards_fill;
        }
        tuxIconView.setIconRes(i);
    }

    public final float LJIIIIZZ(View view) {
        if (Intrinsics.LJFF(view, this.LIZ)) {
            return 0.0f;
        }
        return view.getX() + LJIIIIZZ((View) view.getParent());
    }

    public final float LJIIIZ(View view) {
        if (Intrinsics.LJFF(view, this.LIZ)) {
            return 0.0f;
        }
        return view.getY() + LJIIIZ((View) view.getParent());
    }

    public C0M3K(ViewGroup viewGroup, TuxIconView tuxIconView) {
        this.LIZ = viewGroup;
        this.LIZIZ = tuxIconView;
        viewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC580900MqO(this, 4));
        LJII();
    }
}

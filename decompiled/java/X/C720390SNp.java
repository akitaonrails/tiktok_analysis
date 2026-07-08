package X;

import Y.ARunnableS111S0100000_11;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720390SNp implements C0M3E {
    public final ViewGroup LIZ;
    public final TuxIconView LIZIZ;
    public final Set<View> LIZJ = new LinkedHashSet();
    public final Set<String> LIZLLL = new LinkedHashSet();
    public boolean LJ;

    public final void LJI() {
        if (this.LIZIZ.getTranslationX() != 0.0f) {
            C786410Ut5.Uc(this.LIZIZ, 0.0f);
        }
        if (this.LIZIZ.getTranslationY() != 0.0f) {
            C786410Ut5.vd(this.LIZIZ, 0.0f);
        }
        this.LIZIZ.requestLayout();
    }

    public final void LJII() {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        HandlerHook.viewPost(this.LIZIZ, new ARunnableS111S0100000_11(this, 142));
    }

    public final void LJIIIIZZ() {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        TextView textView;
        if (!this.LIZLLL.isEmpty()) {
            i = 8;
            break;
        }
        if (this.LIZIZ.isAttachedToWindow() && this.LIZIZ.getWidth() != 0 && this.LIZIZ.getHeight() != 0) {
            for (View view : this.LIZJ) {
                if (view.getVisibility() == 0 && view.getWidth() != 0 && view.getHeight() != 0 && (!(view instanceof TextView) || (textView = (TextView) view) == null || textView.length() != 0)) {
                    float fLJIIIZ = LJIIIZ(view);
                    float fLJIIIZ2 = LJIIIZ(this.LIZIZ);
                    float width = view.getWidth() + fLJIIIZ;
                    ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
                    if (width >= fLJIIIZ2 - ((!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) == null) ? 0 : marginLayoutParams4.leftMargin)) {
                        float width2 = fLJIIIZ2 + this.LIZIZ.getWidth();
                        ViewGroup.LayoutParams layoutParams2 = this.LIZIZ.getLayoutParams();
                        if (fLJIIIZ <= width2 + ((!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) ? 0 : marginLayoutParams3.rightMargin)) {
                            float fLJIIJ = LJIIJ(view);
                            float fLJIIJ2 = LJIIJ(this.LIZIZ);
                            float height = view.getHeight() + fLJIIJ;
                            ViewGroup.LayoutParams layoutParams3 = this.LIZIZ.getLayoutParams();
                            if (height >= fLJIIJ2 - ((!(layoutParams3 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) == null) ? 0 : marginLayoutParams2.topMargin)) {
                                float height2 = fLJIIJ2 + this.LIZIZ.getHeight();
                                ViewGroup.LayoutParams layoutParams4 = this.LIZIZ.getLayoutParams();
                                if (fLJIIJ <= height2 + ((!(layoutParams4 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) == null) ? 0 : marginLayoutParams.bottomMargin)) {
                                    i = 8;
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
        i = 0;
        if (this.LIZIZ.getVisibility() != i) {
            C786410Ut5.LLLLLLZZ(this.LIZIZ, i);
        }
        if (((Boolean) C277540AuG.LIZ.getValue()).booleanValue()) {
            LJI();
        }
        this.LJ = false;
    }

    @Override // X.C0M3E
    public final void LIZ(View view) {
        this.LIZJ.add(view);
        LJII();
    }

    @Override // X.C0M3E
    public final void LIZIZ(boolean z) {
        if (z) {
            LIZLLL(C0M3C.NOT_POST_MODE.getValue());
        } else {
            LIZJ(C0M3C.NOT_POST_MODE.getValue());
        }
    }

    @Override // X.C0M3E
    public final void LIZJ(String str) {
        this.LIZLLL.add(str);
        LJII();
    }

    @Override // X.C0M3E
    public final void LIZLLL(String str) {
        this.LIZLLL.remove(str);
        LJII();
    }

    @Override // X.C0M3E
    public final void LJ(Aweme aweme) {
        boolean z;
        C0M0M c0m0m;
        if (!AwemeExtKt.isPhotoMode(aweme) && !C0NC0.LIZ(aweme)) {
            z = false;
        } else {
            z = true;
        }
        LIZIZ(z);
        if (C720360SNm.LJIIL(aweme)) {
            c0m0m = C0M0M.TEXT;
        } else if (C721220SQu.LJ(aweme)) {
            c0m0m = C0M0M.LIVE_PHOTO;
        } else {
            c0m0m = C0M0M.PHOTO;
        }
        LJFF(c0m0m);
    }

    @Override // X.C0M3E
    public final void LJFF(C0M0M c0m0m) {
        int i;
        TuxIconView tuxIconView = this.LIZIZ;
        if (c0m0m == C0M0M.TEXT) {
            i = R.raw.icon_horizontal_bars;
        } else if (c0m0m == C0M0M.LIVE_PHOTO) {
            i = R.raw.icon_live_photo;
        } else {
            i = R.raw.icon_square_corner_border_fill;
        }
        tuxIconView.setIconRes(i);
    }

    public final float LJIIIZ(View view) {
        if (Intrinsics.LJFF(view, this.LIZ)) {
            return 0.0f;
        }
        return view.getX() + LJIIIZ((View) view.getParent());
    }

    public final float LJIIJ(View view) {
        if (Intrinsics.LJFF(view, this.LIZ)) {
            return 0.0f;
        }
        return view.getY() + LJIIJ((View) view.getParent());
    }

    public C720390SNp(ViewGroup viewGroup, TuxIconView tuxIconView) {
        this.LIZ = viewGroup;
        this.LIZIZ = tuxIconView;
        viewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC738740SyO(this, 13));
        LJIIIIZZ();
        if (((Boolean) C277540AuG.LIZ.getValue()).booleanValue()) {
            LJI();
        }
    }
}

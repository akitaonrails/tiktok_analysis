package X;

import Y.ACListenerS139S0100000_4;
import Y.ALAdapterS1S0200000_4;
import Y.ARunnableS73S0200000_4;
import Y.AUListenerS253S0100000_2;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DEV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DEV {
    public final C0DD8 LIZ;
    public final C0DH8 LIZIZ;
    public final PdpViewModel LIZJ;
    public Boolean LIZLLL;
    public ValueAnimator LJ;

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C332470D1p r18) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DEV.LIZJ(X.0D1p):void");
    }

    public final void LIZLLL(C332870D3d c332870D3d) {
        int i;
        View viewFindViewById = this.LIZ.LL.findViewById(R.id.amu);
        View viewFindViewById2 = this.LIZ.LL.findViewById(R.id.amt);
        if (c332870D3d == null) {
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
                return;
            }
            return;
        }
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
        }
        TuxTextView tuxTextView = (TuxTextView) this.LIZ.LL.findViewById(R.id.z2_);
        if (tuxTextView != null) {
            String str = c332870D3d.summary;
            if (str != null && !a0.LJJJIL(str)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
            if (viewFindViewById2 != null) {
                Boolean bool = this.LIZLLL;
                if (bool != null && !Intrinsics.LJFF(bool, Boolean.valueOf(c332870D3d.isExpanded()))) {
                    LIZ(viewFindViewById2, tuxTextView, c332870D3d, true);
                } else {
                    LIZ(viewFindViewById2, tuxTextView, c332870D3d, false);
                }
                this.LIZLLL = Boolean.valueOf(c332870D3d.isExpanded());
            }
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.LIZ.LL.findViewById(R.id.z29);
        String str2 = c332870D3d.sourceCountText;
        if (str2 != null && !a0.LJJJIL(str2)) {
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
                tuxTextView2.setText(c332870D3d.sourceCountText);
            }
        } else if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        ViewGroup viewGroup = (ViewGroup) this.LIZ.LL.findViewById(R.id.amv);
        if (!c332870D3d.tags.isEmpty()) {
            if (viewGroup != null) {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, viewGroup);
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, null);
                viewGroup.removeAllViews();
                for (C332550D1x c332550D1x : c332870D3d.tags) {
                    TextView textView = (TextView) C786410Ut5.Td(C786410Ut5.ne(this.LIZ.LL.getContext()), R.layout.i4j, viewGroup, false);
                    textView.setText(c332550D1x.text);
                    viewGroup.addView(textView);
                }
                return;
            }
            return;
        }
        if (viewGroup != null) {
            int visibility2 = viewGroup.getVisibility();
            viewGroup.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, viewGroup);
        }
    }

    public final void LJ(C332570D1z c332570D1z) {
        int i;
        int i2;
        View viewFindViewById = this.LIZ.LL.findViewById(R.id.tfu);
        TuxTextView tuxTextView = (TuxTextView) this.LIZ.LL.findViewById(R.id.z53);
        C1203340hQ4 c1203340hQ4 = (C1203340hQ4) this.LIZ.LL.findViewById(R.id.srf);
        TuxTextView tuxTextView2 = (TuxTextView) this.LIZ.LL.findViewById(R.id.z5w);
        TuxTextView tuxTextView3 = (TuxTextView) this.LIZ.LL.findViewById(R.id.z68);
        TuxTextView tuxTextView4 = (TuxTextView) this.LIZ.LL.findViewById(R.id.z46);
        int i3 = 8;
        if (c332570D1z == null) {
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
                return;
            }
            return;
        }
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        if (c1203340hQ4 != null) {
            int visibility = c1203340hQ4.getVisibility();
            c1203340hQ4.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c1203340hQ4);
        }
        if (tuxTextView != null) {
            tuxTextView.setText(c332570D1z.ratingText);
        }
        if (c1203340hQ4 != null) {
            c1203340hQ4.setValue(c332570D1z.rating);
        }
        boolean z = c332570D1z.reviewCountVisible;
        if (tuxTextView2 != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, i2);
        }
        if (tuxTextView3 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView3, i);
        }
        if (tuxTextView4 != null) {
            if (z) {
                i3 = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView4, i3);
        }
        if (z && tuxTextView3 != null) {
            tuxTextView3.setText(c332570D1z.reviewCountText);
        }
    }

    public final void LIZIZ(TuxTextView tuxTextView, C332870D3d c332870D3d) {
        C786410Ut5.h9(tuxTextView, null);
        String str = c332870D3d.summary;
        if (str == null) {
            str = "";
        }
        if (c332870D3d.isExpanded()) {
            tuxTextView.setMaxLines(Integer.MAX_VALUE);
            tuxTextView.setEllipsize(null);
            tuxTextView.setText(str);
            C786410Ut5.h9(tuxTextView, new ACListenerS139S0100000_4(this, 87));
            return;
        }
        tuxTextView.setMaxLines(4);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setText(str);
        HandlerHook.viewPost(tuxTextView, new ARunnableS73S0200000_4(tuxTextView, this, 35));
    }

    public final void LJFF(C332460D1o c332460D1o, boolean z) {
        View viewFindViewById = this.LIZ.LL.findViewById(R.id.tug);
        View viewFindViewById2 = this.LIZ.LL.findViewById(R.id.m7g);
        int i = 0;
        if ((c332460D1o != null && (!c332460D1o.previewReviews.isEmpty())) || 0 != 0) {
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            this.LIZIZ.LLLI(c332460D1o.previewReviews);
            if (viewFindViewById2 != null) {
                if (!z) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, viewFindViewById2);
                return;
            }
            return;
        }
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
    }

    public C0DEV(C0DD8 c0dd8, C0DH8 c0dh8, PdpViewModel pdpViewModel) {
        this.LIZ = c0dd8;
        this.LIZIZ = c0dh8;
        this.LIZJ = pdpViewModel;
    }

    public final void LIZ(View view, TuxTextView tuxTextView, C332870D3d c332870D3d, boolean z) {
        ValueAnimator valueAnimator = this.LJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z && view.getWidth() > 0 && view.getHeight() > 0) {
            int height = view.getHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams.height != height) {
                layoutParams.height = height;
                C786410Ut5.W5(view, layoutParams);
            }
            LIZIZ(tuxTextView, c332870D3d);
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            if (height == measuredHeight) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2.height != -2) {
                    layoutParams2.height = -2;
                    C786410Ut5.W5(view, layoutParams2);
                    return;
                }
                return;
            }
            long jAbs = ((long) Math.abs(measuredHeight - height)) * 2;
            if (jAbs > 300) {
                jAbs = 300;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, measuredHeight);
            valueAnimatorOfInt.setInterpolator(new C12DM());
            valueAnimatorOfInt.setDuration(jAbs);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(view, 30));
            valueAnimatorOfInt.addListener(new ALAdapterS1S0200000_4(this, view, 2));
            valueAnimatorOfInt.start();
            this.LJ = valueAnimatorOfInt;
            return;
        }
        LIZIZ(tuxTextView, c332870D3d);
    }
}

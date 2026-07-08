package X;

import Y.ARunnableS32S0201000_27;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yED, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849470yED {
    public final TextView LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final Function0<String> LJFF;
    public Boolean LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public EnumC1849480yEE LJIIJ;
    public int LJIIJJI;
    public ViewTreeObserverOnGlobalLayoutListenerC1849500yEG LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;

    public final int LJI() {
        int iLJII;
        int width = (this.LIZJ.getWidth() - this.LIZJ.getPaddingLeft()) - this.LIZJ.getPaddingRight();
        if (width > 0 && (iLJII = ((width - LJII()) - this.LIZ.getPaddingLeft()) - this.LIZ.getPaddingRight()) >= 0) {
            return iLJII;
        }
        return 0;
    }

    public final int LJII() {
        View view = this.LIZLLL;
        int width = (view == null || view.getVisibility() != 0 || view.getWidth() <= 0) ? 0 : view.getWidth();
        View view2 = this.LIZLLL;
        return (view2 == null || view2.getVisibility() != 0) ? width : width + LJIIL();
    }

    public final String LJIIIZ() {
        Integer numValueOf;
        ViewGroup viewGroup;
        View view = this.LJ;
        int width = view != null ? view.getWidth() : -1;
        View view2 = this.LJ;
        int childCount = (!(view2 instanceof ViewGroup) || (viewGroup = (ViewGroup) view2) == null) ? -1 : viewGroup.getChildCount();
        View view3 = this.LIZLLL;
        int width2 = view3 != null ? view3.getWidth() : -1;
        View view4 = this.LIZLLL;
        int visibility = view4 != null ? view4.getVisibility() : -1;
        int visibility2 = this.LIZ.getVisibility();
        String str = "other";
        String str2 = visibility2 != 0 ? visibility2 != 4 ? visibility2 != 8 ? "other" : "gone" : "invisible" : "visible";
        View view5 = this.LIZIZ;
        if (view5 != null && (numValueOf = Integer.valueOf(view5.getVisibility())) != null) {
            if (numValueOf.intValue() == 0) {
                str = "visible";
            } else if (numValueOf.intValue() == 4) {
                str = "invisible";
            } else if (numValueOf.intValue() == 8) {
                str = "gone";
            }
        }
        return "subInfoW=" + this.LIZJ.getWidth() + " descW=" + this.LIZ.getWidth() + " leadingW=" + width2 + " leadingVis=" + visibility + " collectW=" + width + " collectChild=" + childCount + " desc=" + str2 + " divider=" + str + " segmentedMode=" + this.LJIIJ;
    }

    public final void LJIIJJI() {
        ViewTreeObserverOnGlobalLayoutListenerC1849500yEG viewTreeObserverOnGlobalLayoutListenerC1849500yEG = this.LJIIL;
        if (viewTreeObserverOnGlobalLayoutListenerC1849500yEG != null && this.LIZJ.getViewTreeObserver().isAlive()) {
            C786410Ut5.C3(this.LIZJ.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1849500yEG);
        }
        this.LJIIL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032 A[PHI: r1 r2
      0x0032: PHI (r1v4 java.lang.String) = (r1v1 java.lang.String), (r1v5 java.lang.String) binds: [B:28:0x0047, B:20:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r2v3 android.widget.TextView) = (r2v2 android.widget.TextView), (r2v4 android.widget.TextView) binds: [B:28:0x0047, B:20:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038 A[PHI: r1
      0x0038: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:28:0x0047, B:22:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIL() {
        /*
            r3 = this;
            android.view.View r2 = r3.LIZIZ
            r0 = 0
            if (r2 != 0) goto L6
            return r0
        L6:
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L17
            int r0 = r2.getWidth()
            if (r0 <= 0) goto L17
            int r0 = r2.getWidth()
            return r0
        L17:
            boolean r1 = r2 instanceof android.widget.TextView
            r0 = 0
            if (r1 == 0) goto L44
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L45
            java.lang.CharSequence r0 = r2.getText()
            if (r0 == 0) goto L45
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L45
            int r0 = r1.length()
            if (r0 <= 0) goto L45
        L32:
            android.text.TextPaint r0 = r2.getPaint()
            if (r0 != 0) goto L3e
        L38:
            android.widget.TextView r0 = r3.LIZ
            android.text.TextPaint r0 = r0.getPaint()
        L3e:
            float r0 = r0.measureText(r1)
            int r0 = (int) r0
            return r0
        L44:
            r2 = r0
        L45:
            java.lang.String r1 = " · "
            if (r2 == 0) goto L38
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1849470yED.LJIIL():int");
    }

    public final void LJIILL() {
        View view = this.LIZLLL;
        if (view != null && view.getVisibility() == 0 && this.LIZ.getVisibility() == 0) {
            View view2 = this.LIZIZ;
            if (view2 != null) {
                C337180DJs.LIZJ(view2);
                return;
            }
            return;
        }
        View view3 = this.LIZIZ;
        if (view3 != null) {
            C337180DJs.LIZ(view3);
        }
    }

    public final int LJIIIIZZ() {
        int iLJI = LJI();
        int width = (this.LIZ.getWidth() - this.LIZ.getPaddingLeft()) - this.LIZ.getPaddingRight();
        if (iLJI > 0) {
            return width > 0 ? Math.min(iLJI, width) : iLJI;
        }
        if (width > 0) {
            return width;
        }
        return 0;
    }

    public final String LJIILLIIL() {
        int iLJI = LJI();
        int width = (this.LIZ.getWidth() - this.LIZ.getPaddingLeft()) - this.LIZ.getPaddingRight();
        int iLJIIIIZZ = LJIIIIZZ();
        int width2 = (this.LIZJ.getWidth() - this.LIZJ.getPaddingLeft()) - this.LIZJ.getPaddingRight();
        int iLJII = LJII();
        View view = this.LIZLLL;
        int iLJIIL = 0;
        if (view != null && view.getVisibility() == 0) {
            iLJIIL = LJIIL();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rowW=");
        sbLIZ.append(width2);
        sbLIZ.append(" usedBySiblings=");
        sbLIZ.append(iLJII);
        sbLIZ.append(" reservedDividerW=");
        sbLIZ.append(iLJIIL);
        sbLIZ.append(" computedMaxW=");
        sbLIZ.append(iLJI);
        sbLIZ.append(" descTvInnerW=");
        sbLIZ.append(width);
        sbLIZ.append(" finalMaxW=");
        sbLIZ.append(iLJIIIIZZ);
        sbLIZ.append(" lastAppliedMaxW=");
        sbLIZ.append(this.LJIIJJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(String str) {
        String string = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIILIIL++;
        int i = this.LJIILIIL;
        LJIIJJI();
        this.LJIIJJI = 0;
        this.LJIILJJIL = 0;
        if (str.length() == 0) {
            this.LJII = null;
            getClass();
            LIZIZ(i, null, false);
            return;
        }
        CharSequence text = this.LIZ.getText();
        if (text != null) {
            string = text.toString();
        }
        boolean z = !Intrinsics.LJFF(string, str);
        this.LIZ.setText(str);
        if (Intrinsics.LJFF(this.LJI, Boolean.TRUE)) {
            if (this.LIZ.getVisibility() != 0) {
                C337180DJs.LIZJ(this.LIZ);
                LJIILL();
            }
        } else {
            C337180DJs.LIZ(this.LIZ);
            View view = this.LIZIZ;
            if (view != null) {
                C337180DJs.LIZ(view);
            }
        }
        this.LJII = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mode=single text=");
        sbLIZ.append(str);
        sbLIZ.append(" textChanged=");
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(LJIIIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        LJIILJJIL(i);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0yEG, android.view.ViewTreeObserver$OnGlobalLayoutListener, java.lang.Object] */
    public final void LJIILJJIL(final int i) {
        LJIIJJI();
        ?? r3 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0yEG
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.LL.LJIILIIL(i, this);
            }
        };
        this.LJIIL = r3;
        LJIIIZ();
        C786410Ut5.x3(this.LIZJ.getViewTreeObserver(), r3);
        HandlerHook.viewPost(this.LIZJ, new ARunnableS32S0201000_27(i, this, r3, 7));
    }

    public static String LJ(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" · ");
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public final void LIZJ(String str, String str2) {
        boolean z;
        boolean z2;
        String string;
        EnumC1849480yEE enumC1849480yEE;
        String strLJ;
        String string2;
        EnumC1849480yEE enumC1849480yEE2;
        if (Intrinsics.LJFF(this.LJIIIIZZ, str) && !Intrinsics.LJFF(this.LJIIIZ, str2) && str2 != null && str2.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (enumC1849480yEE2 = this.LJIIJ) != null) {
            int i = C1849490yEF.LIZ[enumC1849480yEE2.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (this.LIZ.getVisibility() != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("mode=FULL descNotVisible primary=");
                        sbLIZ.append(str);
                        sbLIZ.append(" trailing=");
                        sbLIZ.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        getClass();
                    } else {
                        int iLJIIIIZZ = LJIIIIZZ();
                        if (iLJIIIIZZ <= 0) {
                            this.LJIIIZ = str2;
                            int i2 = this.LJIILIIL + 1;
                            this.LJIILIIL = i2;
                            LJIILJJIL(i2);
                        } else {
                            LIZLLL(iLJIIIIZZ, this.LJIILIIL, str, str2);
                            this.LJIIIZ = str2;
                        }
                    }
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("mode=PRIMARY_ONLY primary=");
                sbLIZ2.append(str);
                sbLIZ2.append(" trailing=");
                sbLIZ2.append(str2);
                C2188811AlT.LIZIZ(sbLIZ2);
                getClass();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("mode=PRIMARY_ONLY primary=");
                sbLIZ3.append(str);
                sbLIZ3.append(" trailing=");
                sbLIZ3.append(str2);
                C2188811AlT.LIZIZ(sbLIZ3);
                int i3 = this.LJIILIIL + 1;
                this.LJIILIIL = i3;
                LJIIJJI();
                this.LJIIJJI = 0;
                this.LJIILJJIL = 0;
                LJIILJJIL(i3);
            }
            this.LJIIIZ = str2;
            return;
        }
        if (Intrinsics.LJFF(this.LJIIIIZZ, str) && Intrinsics.LJFF(this.LJIIIZ, str2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && Intrinsics.LJFF(this.LJIIIIZZ, str) && Intrinsics.LJFF(this.LJIIIZ, str2) && this.LIZ.getVisibility() == 0 && (enumC1849480yEE = this.LJIIJ) != null) {
            int i4 = C1849490yEF.LIZ[enumC1849480yEE.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    strLJ = LJ(str, str2);
                }
            } else {
                strLJ = str;
            }
            CharSequence text = this.LIZ.getText();
            if (text != null) {
                string2 = text.toString();
            } else {
                string2 = null;
            }
            if (Intrinsics.LJFF(string2, strLJ)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("primary=");
                sbLIZ4.append(str);
                sbLIZ4.append(" trailing=");
                sbLIZ4.append(str2);
                sbLIZ4.append(" mode=");
                sbLIZ4.append(this.LJIIJ);
                C2188811AlT.LIZIZ(sbLIZ4);
                int i5 = this.LJIILIIL + 1;
                this.LJIILIIL = i5;
                LJIIJJI();
                this.LJIIJJI = 0;
                this.LJIILJJIL = 0;
                LJIILJJIL(i5);
                return;
            }
        }
        this.LJII = null;
        this.LJIIIIZZ = str;
        this.LJIIIZ = str2;
        this.LJIILIIL++;
        int i6 = this.LJIILIIL;
        LJIIJJI();
        this.LJIIJJI = 0;
        this.LJIILJJIL = 0;
        if (str.length() == 0 && (str2 == null || str2.length() == 0)) {
            this.LJIIJ = null;
            LIZIZ(i6, null, false);
            return;
        }
        String strLJ2 = LJ(str, str2);
        CharSequence text2 = this.LIZ.getText();
        if (text2 != null) {
            string = text2.toString();
        } else {
            string = null;
        }
        Intrinsics.LJFF(string, strLJ2);
        this.LIZ.setText(strLJ2);
        if (Intrinsics.LJFF(this.LJI, Boolean.TRUE)) {
            if (this.LIZ.getVisibility() != 0) {
                C337180DJs.LIZJ(this.LIZ);
                LJIILL();
            }
        } else {
            C337180DJs.LIZ(this.LIZ);
            View view = this.LIZIZ;
            if (view != null) {
                C337180DJs.LIZ(view);
            }
        }
        this.LJIIJ = null;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("mode=segmented primary=");
        sbLIZ5.append(str);
        sbLIZ5.append(" trailing=");
        sbLIZ5.append(str2);
        sbLIZ5.append(" displayText=");
        sbLIZ5.append(strLJ2);
        sbLIZ5.append(' ');
        sbLIZ5.append(LJIIIZ());
        C2188811AlT.LIZIZ(sbLIZ5);
        LJIILJJIL(i6);
    }

    public final void LJIILIIL(int i, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        boolean z;
        String str;
        View view;
        View view2;
        if (i != this.LJIILIIL) {
            if (this.LJIIL == onGlobalLayoutListener) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gen=");
                sbLIZ.append(i);
                sbLIZ.append(" current=");
                sbLIZ.append(this.LJIILIIL);
                C2188811AlT.LIZIZ(sbLIZ);
                getClass();
                LJIIJJI();
                return;
            }
            return;
        }
        if (this.LJIIL != onGlobalLayoutListener) {
            return;
        }
        this.LJIILJJIL++;
        if (this.LIZJ.getWidth() <= 0 || (((view = this.LIZLLL) != null && view.getVisibility() == 0 && view.getWidth() <= 0) || (((view2 = this.LJ) != null && view2.getVisibility() == 0 && view2.getWidth() <= 0) || LJIIIIZZ() <= 0))) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("pass=");
            sbLIZ2.append(this.LJIILJJIL);
            sbLIZ2.append(" reason=");
            if (this.LIZJ.getWidth() <= 0) {
                str = "subInfoWidth=0";
            } else {
                View view3 = this.LIZLLL;
                if (view3 != null && view3.getVisibility() == 0 && view3.getWidth() <= 0) {
                    str = "leadingVisibleButWidth0";
                } else {
                    View view4 = this.LJ;
                    if (view4 != null && view4.getVisibility() == 0 && view4.getWidth() <= 0) {
                        str = "collectVisibleButWidth0";
                    } else if (LJIIIIZZ() <= 0) {
                        str = "descMaxWidth=0";
                    } else {
                        str = "unknown";
                    }
                }
            }
            sbLIZ2.append(str);
            sbLIZ2.append(' ');
            sbLIZ2.append(LJIIIZ());
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("pass=");
        sbLIZ3.append(this.LJIILJJIL);
        sbLIZ3.append(' ');
        sbLIZ3.append(LJIILLIIL());
        sbLIZ3.append(' ');
        sbLIZ3.append(LJIIIZ());
        C2188811AlT.LIZIZ(sbLIZ3);
        int iLJIIIIZZ = LJIIIIZZ();
        int i2 = this.LJIIJJI;
        if (i2 > 0 && iLJIIIIZZ > 0 && iLJIIIIZZ < i2) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("lastAppliedMaxWidth=");
            sbLIZ4.append(this.LJIIJJI);
            sbLIZ4.append(" maxWidth=");
            sbLIZ4.append(iLJIIIIZZ);
            sbLIZ4.append(' ');
            sbLIZ4.append(LJIILLIIL());
            C2188811AlT.LIZIZ(sbLIZ4);
            this.LJIIJJI = 0;
        }
        LJIIJJI();
        if (i != this.LJIILIIL) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("gen=");
            sbLIZ5.append(i);
            sbLIZ5.append(" current=");
            sbLIZ5.append(this.LJIILIIL);
            C2188811AlT.LIZIZ(sbLIZ5);
            getClass();
            return;
        }
        int iLJIIIIZZ2 = LJIIIIZZ();
        if (iLJIIIIZZ2 <= 0) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("maxWidth=0 ");
            sbLIZ6.append(LJIILLIIL());
            C2188811AlT.LIZIZ(sbLIZ6);
            LJIILJJIL(i);
            return;
        }
        String str2 = this.LJIIIIZZ;
        if (str2 != null) {
            LIZLLL(iLJIIIIZZ2, i, str2, this.LJIIIZ);
            this.LJIIJJI = iLJIIIIZZ2;
            return;
        }
        String str3 = this.LJII;
        if (str3 == null) {
            return;
        }
        C246600xM c246600xMLJFF = LJFF(iLJIIIIZZ2, this.LIZ, str3);
        boolean z2 = c246600xMLJFF.LJFF;
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("maxWidth=");
        sbLIZ7.append(iLJIIIIZZ2);
        sbLIZ7.append(" text=");
        sbLIZ7.append(str3);
        sbLIZ7.append(" metrics=");
        sbLIZ7.append(c246600xMLJFF);
        sbLIZ7.append(' ');
        sbLIZ7.append(LJIIIZ());
        C2188811AlT.LIZIZ(sbLIZ7);
        LIZIZ(i, str3, true ^ z2);
        this.LJIIJJI = iLJIIIIZZ2;
    }

    public static C246600xM LJFF(int i, TextView textView, String str) {
        int ellipsisCount;
        float lineWidth;
        boolean z;
        if (str.length() != 0 && i > 0) {
            float fMeasureText = textView.getPaint().measureText(str);
            int maxLines = textView.getMaxLines();
            if (maxLines < 1) {
                maxLines = 1;
            }
            TextUtils.TruncateAt ellipsize = textView.getEllipsize();
            if (ellipsize == null) {
                ellipsize = TextUtils.TruncateAt.END;
            }
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textView.getPaint(), i).setMaxLines(maxLines).setEllipsize(ellipsize).build();
            int lineCount = staticLayoutBuild.getLineCount();
            if (lineCount > 0) {
                ellipsisCount = staticLayoutBuild.getEllipsisCount(0);
                lineWidth = staticLayoutBuild.getLineWidth(0);
            } else {
                ellipsisCount = 0;
                lineWidth = 0.0f;
            }
            if (lineCount > maxLines || (lineCount > 0 && ellipsisCount > 0)) {
                z = true;
            } else {
                z = false;
            }
            return new C246600xM(z, i, lineCount, ellipsisCount, fMeasureText, lineWidth);
        }
        return new C246600xM(false, i, 0, 0, 0.0f, 0.0f);
    }

    public final void LIZIZ(final int i, final String str, final boolean z) {
        CharSequence text;
        if (i != this.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gen=");
            sbLIZ.append(i);
            sbLIZ.append(" current=");
            sbLIZ.append(this.LJIILIIL);
            sbLIZ.append(" visible=");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            getClass();
            return;
        }
        boolean z2 = true;
        if (!Intrinsics.LJFF(this.LJI, Boolean.valueOf(z))) {
            this.LJI = Boolean.valueOf(z);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("visible=");
            sbLIZ2.append(z);
            sbLIZ2.append(' ');
            sbLIZ2.append(LJIIIZ());
            C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("visible=");
            sbLIZ3.append(z);
            sbLIZ3.append(' ');
            sbLIZ3.append(LJIIIZ());
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (z) {
            if (str != null && str.length() != 0) {
                z2 = false;
            }
            String string = null;
            if (!z2) {
                CharSequence text2 = this.LIZ.getText();
                if (text2 != null) {
                    string = text2.toString();
                }
                if (!Intrinsics.LJFF(string, str)) {
                    this.LIZ.setText(str);
                }
            }
            C337180DJs.LIZJ(this.LIZ);
            LJIILL();
            if (str == null && ((text = this.LIZ.getText()) == null || (str = text.toString()) == null)) {
                str = "";
            }
            HandlerHook.viewPost(this.LIZ, new Runnable() { // from class: X.0yEC
                /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
                /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 250
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1849460yEC.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PoiBottomBarDescLayout@d4d1.applyDescVisibility$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PoiBottomBarDescLayout@d4d1.applyDescVisibility$1");
                }
            });
            return;
        }
        C337180DJs.LIZ(this.LIZ);
        View view = this.LIZIZ;
        if (view == null) {
            return;
        }
        C337180DJs.LIZ(view);
    }

    public final void LIZLLL(int i, int i2, String str, String str2) {
        boolean z;
        boolean z2;
        String string;
        if (i2 != this.LJIILIIL) {
            return;
        }
        String strLJ = LJ(str, str2);
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String string2 = null;
        if (z) {
            this.LJIIJ = null;
            LIZIZ(i2, null, false);
            return;
        }
        C246600xM c246600xMLJFF = LJFF(i, this.LIZ, strLJ);
        if (strLJ.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !c246600xMLJFF.LJFF) {
            this.LJIIJ = EnumC1849480yEE.LL;
            CharSequence text = this.LIZ.getText();
            if (text != null) {
                string2 = text.toString();
            }
            if (!Intrinsics.LJFF(string2, strLJ)) {
                this.LIZ.setText(strLJ);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("maxWidth=");
            sbLIZ.append(i);
            sbLIZ.append(" fullText=");
            sbLIZ.append(strLJ);
            sbLIZ.append(" metrics=");
            sbLIZ.append(c246600xMLJFF);
            sbLIZ.append(' ');
            sbLIZ.append(LJIIIZ());
            C2188811AlT.LIZIZ(sbLIZ);
            LIZIZ(i2, strLJ, true);
            return;
        }
        this.LJIIJ = EnumC1849480yEE.LLILLJJLI;
        CharSequence text2 = this.LIZ.getText();
        if (text2 != null) {
            string = text2.toString();
        } else {
            string = null;
        }
        if (!Intrinsics.LJFF(string, str)) {
            this.LIZ.setText(str);
        }
        C246600xM c246600xMLJFF2 = LJFF(i, this.LIZ, str);
        if (c246600xMLJFF2.LJFF) {
            this.LJIIJ = null;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("maxWidth=");
            sbLIZ2.append(i);
            sbLIZ2.append(" primary=");
            sbLIZ2.append(str);
            sbLIZ2.append(" primaryMetrics=");
            sbLIZ2.append(c246600xMLJFF2);
            sbLIZ2.append(' ');
            sbLIZ2.append(LJIIIZ());
            C2188811AlT.LIZIZ(sbLIZ2);
            LIZIZ(i2, null, false);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("maxWidth=");
        sbLIZ3.append(i);
        sbLIZ3.append(" primary=");
        sbLIZ3.append(str);
        sbLIZ3.append(" fullText=");
        sbLIZ3.append(strLJ);
        sbLIZ3.append(" fullMetrics=");
        sbLIZ3.append(c246600xMLJFF);
        sbLIZ3.append(" primaryMetrics=");
        sbLIZ3.append(c246600xMLJFF2);
        sbLIZ3.append(' ');
        sbLIZ3.append(LJIIIZ());
        C2188811AlT.LIZIZ(sbLIZ3);
        LIZIZ(i2, str, true);
    }

    public C1849470yED(TuxTextView tuxTextView, View view, View view2, View view3, View view4, Function0 function0) {
        this.LIZ = tuxTextView;
        this.LIZIZ = view;
        this.LIZJ = view2;
        this.LIZLLL = view3;
        this.LJ = view4;
        this.LJFF = function0;
    }
}

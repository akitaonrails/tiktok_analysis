package X;

import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0SPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721010SPz extends C425890Gmx {
    public final int LLJ;
    public final int LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public AwemeRawAd LLJILJILJ;

    private final int getDefaultBgColor() {
        return ((Number) this.LLJILJIL.getValue()).intValue();
    }

    private final int getDefaultTextColor() {
        return ((Number) this.LLJIJIL.getValue()).intValue();
    }

    private final int getTopMargin() {
        return ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AwemeRawAd awemeRawAd = this.LLJILJILJ;
        if (awemeRawAd == null) {
            return;
        }
        if (awemeRawAd.getShowLabelSeconds() <= 0) {
            setTopMargin(0);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(1.0f);
        } else {
            setTopMargin(-C341940Daq.LIZ(24.0d));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(0.0f);
            HandlerHook.viewPost(this, new ARunnableS111S0100000_11(this, 9));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002d A[PHI: r4
      0x002d: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:19:0x002a, B:8:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6) {
        /*
            r5 = this;
            r1 = 0
            if (r6 == 0) goto L28
            com.ss.android.ugc.aweme.commercialize.model.FakeAuthor r0 = r6.getFakeAuthor()
            if (r0 == 0) goto L29
            java.lang.String r4 = r0.getCategoryLabel()
        Ld:
            com.ss.android.ugc.aweme.commercialize.model.FakeAuthor r0 = r6.getFakeAuthor()
            if (r0 == 0) goto L2d
            java.lang.String r3 = r0.getRankLabel()
        L17:
            r2 = 0
            if (r4 == 0) goto L20
            int r0 = r4.length()
            if (r0 != 0) goto L2f
        L20:
            if (r3 == 0) goto L28
            int r0 = r3.length()
            if (r0 != 0) goto L2f
        L28:
            return
        L29:
            r4 = r1
            if (r6 == 0) goto L2d
            goto Ld
        L2d:
            r3 = r1
            goto L17
        L2f:
            r5.LLJILJILJ = r6
            com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker.recordViewRemovedPoint(r5, r1)
            r5.removeAllViews()
            if (r4 == 0) goto L44
            int r1 = r5.getDefaultTextColor()
            int r0 = r5.getDefaultBgColor()
            r5.LIZIZ(r1, r0, r4)
        L44:
            if (r3 == 0) goto L51
            int r1 = r5.getDefaultTextColor()
            int r0 = r5.getDefaultBgColor()
            r5.LIZIZ(r1, r0, r3)
        L51:
            int r0 = r5.getVisibility()
            r5.setVisibility(r2)
            X.C1602160rnK.LIZIZ(r0, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C721010SPz.LIZ(com.ss.android.ugc.aweme.feed.model.AwemeRawAd):void");
    }

    public final void setTopMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = i;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
    }

    public C721010SPz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJ = C341940Daq.LIZ(2.0d);
        int iLIZ = C341940Daq.LIZ(4.0d);
        this.LLJI = iLIZ;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1251));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1250));
        setSpaceH(iLIZ);
    }

    public final void LIZIZ(int i, int i2, String str) {
        C21279718Pj c21279718Pj = new C21279718Pj(getContext(), null, 4);
        addView(c21279718Pj);
        C426750GoL.LJIIIZ(c21279718Pj, 0, 0, Integer.valueOf(this.LLJ), 0, false, 16);
        C21279518Ph c21279518PhLIZ = C988900bqC.LIZ();
        c21279518PhLIZ.LJIIL(str);
        c21279518PhLIZ.LJIILJJIL(81);
        c21279518PhLIZ.LJIILIIL(i);
        c21279518PhLIZ.LIZ(i2);
        c21279518PhLIZ.LIZIZ(C341940Daq.LIZ(2.0d));
        C21279618Pi c21279618Pi = c21279518PhLIZ.LIZ;
        if (c21279618Pi != null) {
            c21279618Pi.LJIIIIZZ = -2;
        }
        c21279518PhLIZ.LIZLLL(C341940Daq.LIZ(16.0d));
        c21279518PhLIZ.LIZJ(TextUtils.TruncateAt.END);
        c21279518PhLIZ.LJI();
        c21279518PhLIZ.LJIIIIZZ(this.LLJI);
        c21279518PhLIZ.LJIIIZ(this.LLJI);
        C21279618Pi c21279618Pi2 = c21279518PhLIZ.LIZ;
        if (c21279618Pi2 != null) {
            c21279718Pj.LIZ(c21279618Pi2);
        }
    }
}

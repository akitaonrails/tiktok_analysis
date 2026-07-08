package X;

import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.StaticAtmosphereInfo;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187M, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C187M extends AbstractC19677411ym implements C184I {
    public boolean LJIIJJI;
    public StaticAtmosphereInfo LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public boolean LJIILLIIL;
    public float LJIIZILJ;
    public final float LJIJ;
    public final int LJIJI;

    @Override // X.C184I
    public final void LIZLLL() {
    }

    @Override // X.C187I
    public final int LJIILJJIL() {
        return -1;
    }

    @Override // X.C184I
    public final long LIZJ() {
        StaticAtmosphereInfo staticAtmosphereInfo = this.LJIIL;
        if (staticAtmosphereInfo != null) {
            return staticAtmosphereInfo.durationMs;
        }
        return 0L;
    }

    @Override // X.C187I
    public final Animator LJIILIIL() {
        TuxTextView tuxTextView = (TuxTextView) this.LJIILL.getValue();
        LinearLayout linearLayoutLJJ = LJJ();
        AnimatorSet animatorSet = new AnimatorSet();
        C786410Ut5.LJLZ(0, linearLayoutLJJ);
        C786410Ut5.R4(0.0f, linearLayoutLJJ);
        CharSequence text = tuxTextView.getText();
        if (text != null) {
            if (tuxTextView.getEllipsize() != TextUtils.TruncateAt.MARQUEE) {
                animatorSet.play(AnonymousClass1888.LIZ(linearLayoutLJJ, this.LJIJI, null, 12));
                return animatorSet;
            }
            AnimatorSet.Builder builderPlay = animatorSet.play(AnonymousClass1888.LIZ(linearLayoutLJJ, this.LJIJI, null, 12));
            TextPaint paint = tuxTextView.getPaint();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) text);
            sbLIZ.append("     ");
            int iMeasureText = (int) paint.measureText(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append((Object) text);
            sbLIZ2.append("     ");
            sbLIZ2.append((Object) text);
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ2));
            int[] iArr = new int[2];
            iArr[0] = 0;
            iArr[1] = C444960Hcc.LIZJ(this.LIZLLL) ? -iMeasureText : iMeasureText;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.setDuration((long) (((iMeasureText * 1.0f) / this.LJIIJ) * 1000));
            valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(tuxTextView, 118));
            valueAnimatorOfInt.setStartDelay(500L);
            builderPlay.before(valueAnimatorOfInt);
        }
        return animatorSet;
    }

    @Override // X.C187I
    public final boolean LJIIZILJ() {
        return this.LJIIJJI && AbstractC212220183e.LJII(LJJ()) && !LJIJ();
    }

    public final LinearLayout LJJ() {
        return (LinearLayout) this.LJIILIIL.getValue();
    }

    @Override // X.C187I
    public final Animator LJIIL() {
        return AnonymousClass1888.LIZIZ(LJJ(), this.LJIJI);
    }

    @Override // X.C187I
    public final void LJIJJLI(boolean z) {
        if (this.LJIIJJI) {
            AbstractC212220183e.LJIIIZ(LJJ(), z);
        }
        if (!z) {
            this.LJIIL = null;
        }
    }

    public C187M(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 698));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 694));
        this.LJIILL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 696));
        this.LJIILLIIL = true;
        this.LJIIZILJ = C418440Gaw.LIZIZ(54);
        this.LJIJ = C418440Gaw.LIZIZ(30);
        this.LJIJI = C679280Qkg.LIZ(24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0185, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0179 A[PHI: r3
      0x0179: PHI (r3v1 com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage) = 
      (r3v0 com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage)
      (r3v9 com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage)
     binds: [B:60:0x0175, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bd  */
    @Override // X.C187I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C187N LJIL(long r15, java.util.List<android.animation.Animator> r17) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187M.LJIL(long, java.util.List):X.187N");
    }
}

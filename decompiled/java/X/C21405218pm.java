package X;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.18pm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21405218pm extends LinearLayout {
    public final float LL;
    public final float LLILLJJLI;
    public final ImageView LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public Float LLILZLL;
    public Float LLIZ;
    public Long LLIZLLLIL;

    public final void LIZIZ() {
        Float f;
        if (this.LLILZIL && (f = this.LLILZLL) != null) {
            float fFloatValue = f.floatValue();
            Float f2 = this.LLIZ;
            if (f2 != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(fFloatValue, f2.floatValue());
                alphaAnimation.setInterpolator(new LinearInterpolator());
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setRepeatCount(-1);
                alphaAnimation.setRepeatMode(2);
                Long l = this.LLIZLLLIL;
                if (l != null) {
                    l.longValue();
                    alphaAnimation.setDuration(this.LLIZLLLIL.longValue());
                }
                this.LLILLL.startAnimation(alphaAnimation);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            LIZIZ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILLL.clearAnimation();
    }

    public final Long getDuration() {
        return this.LLIZLLLIL;
    }

    public final Float getFromAlpha() {
        return this.LLILZLL;
    }

    public final boolean getHasAnimation() {
        return this.LLILZIL;
    }

    public final String getSrc() {
        return this.LLILZ;
    }

    public final Float getToAlpha() {
        return this.LLIZ;
    }

    public C21405218pm(Context context) {
        super(context, null, 0);
        this.LL = 14.0f;
        this.LLILLJJLI = 14.0f;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f93, this, true);
        this.LLILLL = (ImageView) findViewById(R.id.ve0);
    }

    public final void LIZ(File file) {
        try {
            C0VSP c0vsp = new C0VSP(file);
            byte[] bArr = new byte[c0vsp.available()];
            c0vsp.read(bArr);
            C2257191DWj c2257191DWjLIZJ = C2257191DWj.LIZJ(new String(bArr, Charsets.UTF_8));
            if (c2257191DWjLIZJ != null) {
                C2255571DQd c2255571DQd = C2255571DQd.LIZJ;
                C1DXA c1dxa = c2257191DWjLIZJ.LIZ;
                if (c1dxa != null) {
                    c1dxa.LJIIIIZZ = c2255571DQd;
                } else {
                    throw new IllegalArgumentException("SVG document is empty");
                }
            }
            this.LLILLL.setImageDrawable(new PictureDrawable(c2257191DWjLIZJ.LJ(new C1DX7(this.LL, this.LLILLJJLI), null)));
            c0vsp.close();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void setDuration(Long l) {
        this.LLIZLLLIL = l;
    }

    public final void setFromAlpha(Float f) {
        this.LLILZLL = f;
    }

    public final void setHasAnimation(boolean z) {
        this.LLILZIL = z;
    }

    public final void setSrc(String str) {
        this.LLILZ = str;
    }

    public final void setToAlpha(Float f) {
        this.LLIZ = f;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            LIZIZ();
        } else {
            this.LLILLL.clearAnimation();
        }
    }
}

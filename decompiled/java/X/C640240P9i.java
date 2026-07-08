package X;

import Y.AObserverS175S0200000_10;
import Y.AObserverS214S0100000_10;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.ActivityCardThemeViewModel;

/* JADX INFO: renamed from: X.0P9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640240P9i extends Drawable {
    public final Fragment LIZ;
    public final C19EG LIZIZ;
    public final ActivityCardThemeViewModel LIZJ;
    public LinearGradient LIZLLL;
    public int LJ;
    public final int[] LJFF = {0, 0, 0};
    public float LJI;
    public final Paint LJII;
    public final Paint LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;

    public final void LIZIZ() {
        float[] fArr = {0.0f, this.LJI, 1.0f};
        int i = this.LJ;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.LJIIJ, new int[]{i, i, 0}, fArr, Shader.TileMode.CLAMP);
        this.LIZLLL = linearGradient;
        this.LJIIIIZZ.setShader(linearGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void LIZ() {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, this.LJFF, (float[]) null, Shader.TileMode.CLAMP);
        this.LIZLLL = linearGradient;
        this.LJIIIIZZ.setShader(linearGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LIZLLL == null) {
            LIZ();
        }
        float fWidth = getBounds().width();
        canvas.translate(0.0f, this.LJIIIZ * (-1.0f));
        canvas.drawRect(0.0f, 0.0f, fWidth, this.LJIIJ, this.LJIIIIZZ);
        if (this.LJ != 0) {
            canvas.drawRect(0.0f, 0.0f, fWidth, this.LJIIJ, this.LJII);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDraw, gradientEndPos = ");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", startPos = ");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", startColor = ");
        sbLIZ.append(this.LJ);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public C640240P9i(Fragment fragment, C19EG c19eg) {
        float fWQ2;
        this.LIZ = fragment;
        this.LIZIZ = c19eg;
        ActivityCardThemeViewModel activityCardThemeViewModel = this.LIZJ;
        if (activityCardThemeViewModel != null) {
            fWQ2 = activityCardThemeViewModel.wQ2();
        } else {
            fWQ2 = 0.0f;
        }
        this.LJI = fWQ2;
        this.LJII = new Paint();
        this.LJIIIIZZ = new Paint();
        if (c19eg != null) {
            ActivityCardThemeViewModel activityCardThemeViewModel2 = (ActivityCardThemeViewModel) C679340Qkm.LIZIZ(fragment, c19eg).get(ActivityCardThemeViewModel.class);
            this.LIZJ = activityCardThemeViewModel2;
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Fragment fragment2 = this.LIZ;
            C19EG c19eg2 = this.LIZIZ;
            sAFHelper.getClass();
            LifecycleOwner lifecycleOwnerLJJIIZ = SAFHelper.LJJIIZ(fragment2, c19eg2);
            if (activityCardThemeViewModel2 != null) {
                LiveData<C640160P9a> liveDataXQ2 = activityCardThemeViewModel2.xQ2();
                if (liveDataXQ2 != null) {
                    liveDataXQ2.observe(lifecycleOwnerLJJIIZ, new AObserverS214S0100000_10(this, 144));
                }
                LiveData liveData = (LiveData) activityCardThemeViewModel2.LLJILJILJ.getValue();
                if (liveData != null) {
                    liveData.observe(lifecycleOwnerLJJIIZ, new AObserverS214S0100000_10(this, 145));
                }
                ((LiveData) activityCardThemeViewModel2.LLJIJIL.getValue()).observe(lifecycleOwnerLJJIIZ, new AObserverS175S0200000_10(activityCardThemeViewModel2, this, 11));
            }
        }
    }
}

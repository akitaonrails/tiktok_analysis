package X;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Lns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C553860Lns {
    public C553850Lnr LIZ = new C553850Lnr();
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 821));
    public ValueAnimator LIZJ;
    public float LIZLLL;

    public final void LIZ(C0F7G c0f7g) {
        float[] fArrLLI;
        float strokeWidth$tools_ai_uikit_df_release = this.LIZ.getStrokeWidth$tools_ai_uikit_df_release();
        float cornerRadius$tools_ai_uikit_df_release = this.LIZ.getCornerRadius$tools_ai_uikit_df_release();
        int[] colors$tools_ai_uikit_df_release = this.LIZ.getColors$tools_ai_uikit_df_release();
        int[] angles$tools_ai_uikit_df_release = this.LIZ.getAngles$tools_ai_uikit_df_release();
        if (angles$tools_ai_uikit_df_release != null) {
            ArrayList arrayList = new ArrayList(angles$tools_ai_uikit_df_release.length);
            for (int i : angles$tools_ai_uikit_df_release) {
                arrayList.add(Float.valueOf(i / 360.0f));
            }
            fArrLLI = C13LP.LLI(arrayList);
        } else {
            fArrLLI = null;
        }
        c0f7g.LIZ(strokeWidth$tools_ai_uikit_df_release, cornerRadius$tools_ai_uikit_df_release, colors$tools_ai_uikit_df_release, fArrLLI, this.LIZ.getCenterOffsetX$tools_ai_uikit_df_release(), this.LIZ.getCenterOffsetY$tools_ai_uikit_df_release(), this.LIZ.getDynamicPosCalculate$tools_ai_uikit_df_release(), this.LIZ.getAlpha$tools_ai_uikit_df_release(), this.LIZ.getAnimate$tools_ai_uikit_df_release());
    }
}

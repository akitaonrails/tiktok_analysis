package X;

import android.text.SpannableString;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0vwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761490vwJ {
    public final TextView LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public final String LJ;
    public String LJFF = "  ...";
    public final float LJI;
    public float LJII;

    public final SpannableString LIZ(SpannableString spannableString) {
        boolean zLIZ;
        float fMeasureText;
        int i;
        if (this.LIZ.getLineCount() > this.LIZJ) {
            this.LIZLLL = true;
            TextPaint paint = this.LIZ.getPaint();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJFF);
            sbLIZ.append(this.LJ);
            float fMeasureText2 = paint.measureText(C2188811AlT.LIZIZ(sbLIZ));
            if (this.LJI > 0.0f) {
                fMeasureText2 = this.LIZ.getPaint().measureText(this.LJFF) + this.LJI;
            }
            if (this.LIZ.getLayout() == null) {
                return spannableString;
            }
            int i2 = (int) (this.LIZIZ - fMeasureText2);
            int lineStart = this.LIZ.getLayout().getLineStart(this.LIZJ - 1);
            int lineStart2 = this.LIZ.getLayout().getLineStart(this.LIZJ) - 1;
            try {
                SettingsManager.LIZLLL().getClass();
                zLIZ = SettingsManager.LIZ("ec_sea_pdp_title_width_settings", false);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, th, null);
                zLIZ = false;
            }
            if (zLIZ) {
                fMeasureText = this.LIZ.getLayout().getLineWidth(this.LIZJ - 1);
            } else {
                fMeasureText = this.LIZ.getPaint().measureText(spannableString.subSequence(lineStart, lineStart2).toString());
            }
            float f = i2;
            if (fMeasureText > f) {
                float f2 = fMeasureText - f;
                i = 1;
                while (true) {
                    if (i >= lineStart2) {
                        break;
                    }
                    float fMeasureText3 = this.LIZ.getPaint().measureText(spannableString.subSequence(lineStart2 - i, lineStart2).toString());
                    if (fMeasureText3 > f2) {
                        this.LJII = fMeasureText - fMeasureText3;
                        break;
                    }
                    i++;
                }
            } else {
                this.LJII = fMeasureText;
                i = 0;
            }
            int i3 = (lineStart2 - i) - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            return SpannableString.valueOf(spannableString.subSequence(0, i3));
        }
        return spannableString;
    }

    public C1761490vwJ(TextView textView, int i, String str, int i2, float f) {
        this.LIZJ = 4;
        this.LIZ = textView;
        this.LIZIZ = i;
        this.LJ = str;
        this.LIZJ = i2;
        this.LJI = f;
    }
}

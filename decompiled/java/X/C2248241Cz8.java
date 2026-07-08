package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1Cz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2248241Cz8 extends AbstractC2248231Cz7 {
    public final TextView LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC2248231Cz7
    public final Layout LJIIZILJ() {
        TextView textView = this.LJIJJLI;
        if (textView != 0) {
            return textView instanceof InterfaceC431030GvF ? ((InterfaceC431030GvF) textView).LJIIIIZZ() : textView.getLayout();
        }
        return null;
    }

    @Override // X.AbstractC2248231Cz7
    public final CharSequence LJIJ() {
        TextView textView = this.LJIJJLI;
        return textView != null ? textView.getText() : "";
    }

    public C2248241Cz8(TextView textView) {
        super(textView);
        this.LJIJJLI = textView;
    }

    @Override // X.InterfaceC1859950yV7
    public final void LJFF(int i) {
        this.LJJIIJZLJL = i;
    }

    @Override // X.InterfaceC1859950yV7
    public final void LJIIIIZZ(int i) {
        this.LJJIIJ = i;
    }

    @Override // X.InterfaceC1859950yV7
    public final void LJIILL(int i, int i2) {
        TextView textView = this.LJIJJLI;
        if (textView == null) {
            return;
        }
        int iLIZJ = C431170GvT.LIZJ(textView, i, i2);
        CharSequence charSequenceLJIJ = LJIJ();
        if (!TextUtils.isEmpty(charSequenceLJIJ) && iLIZJ >= 0) {
            if (iLIZJ >= charSequenceLJIJ.length()) {
                iLIZJ = charSequenceLJIJ.length() - 1;
            }
            Pair pairLIZ = C1860150yVR.LIZ(iLIZJ, this.LJIJJLI, charSequenceLJIJ.toString());
            this.LJIIJJI = ((Integer) pairLIZ.getFirst()).intValue();
            this.LJIIL = ((Integer) pairLIZ.getSecond()).intValue();
            LJJII();
            LJIIJ();
            this.LJIILL = true;
        }
    }

    @Override // X.AbstractC2248231Cz7
    public final void LJJIIJZLJL(int i, int i2, boolean z) {
        this.LJIJJLI.getLocationInWindow(this.LJFF);
        int[] iArr = this.LJFF;
        int iLIZJ = C431170GvT.LIZJ(this.LJIJJLI, i - iArr[0], i2 - iArr[1]);
        if (iLIZJ < 0) {
            return;
        }
        if (z) {
            this.LJIIJJI = iLIZJ;
        } else {
            this.LJIIL = iLIZJ;
        }
        if (this.LJIIJJI > this.LJIIL) {
            this.LJII.LIZ();
            this.LJIIIZ.LIZ();
            int i3 = this.LJIIJJI;
            this.LJIIJJI = this.LJIIL;
            this.LJIIL = i3;
        }
    }

    public final boolean LJJIIZ(Layout layout, int i, int i2) {
        TextView textView;
        if (layout == null || (textView = this.LJIJJLI) == null) {
            return false;
        }
        textView.getGlobalVisibleRect(this.LJI);
        int lineForOffset = layout.getLineForOffset(i);
        int lineForOffset2 = layout.getLineForOffset(i2);
        int iLJ = this.LJFF[1] + C431170GvT.LJ(this.LJIJJLI) + layout.getLineTop(lineForOffset);
        int iLJ2 = this.LJFF[1] + C431170GvT.LJ(this.LJIJJLI) + layout.getLineBottom(lineForOffset2);
        Rect rect = this.LJI;
        if (iLJ2 <= rect.top || iLJ >= rect.bottom - this.LJJIIJ) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC2248231Cz7
    public final void LJJI(Layout layout, int i, C2248181Cz2 c2248181Cz2, boolean z) {
        TextView textView;
        int lineEnd;
        float primaryHorizontal;
        int i2;
        if (layout != null && (textView = this.LJIJJLI) != null && c2248181Cz2 != null) {
            textView.getGlobalVisibleRect(this.LJI);
            int lineForOffset = layout.getLineForOffset(i);
            try {
                try {
                    primaryHorizontal = layout.getPrimaryHorizontal(i);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (z) {
                        lineEnd = layout.getLineStart(lineForOffset);
                    } else {
                        lineEnd = layout.getLineEnd(lineForOffset);
                    }
                    primaryHorizontal = layout.getPrimaryHorizontal(lineEnd);
                }
                i2 = (int) primaryHorizontal;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                i2 = 0;
            }
            int iLIZLLL = this.LJFF[0] + C431170GvT.LIZLLL(this.LJIJJLI) + i2;
            int iLJ = this.LJFF[1] + C431170GvT.LJ(this.LJIJJLI) + layout.getLineTop(lineForOffset);
            int iLJ2 = this.LJFF[1] + C431170GvT.LJ(this.LJIJJLI) + layout.getLineBottom(lineForOffset);
            int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
            if (z) {
                this.LJIL = iLIZLLL;
                this.LJJ = iLJ;
                this.LJJI = iLJ2;
            } else {
                this.LJJIFFI = iLIZLLL;
                this.LJJII = iLJ;
                this.LJJIII = iLJ2;
            }
            Rect rect = this.LJI;
            if (iLJ >= rect.top && iLJ2 <= rect.bottom && this.LJFF[1] != 0 && iLJ2 < Resources.getSystem().getDisplayMetrics().heightPixels - this.LJJIIJ && iLJ > this.LJJIIJZLJL) {
                c2248181Cz2.setOutArea(false);
            } else {
                c2248181Cz2.setOutArea(true);
            }
            c2248181Cz2.LIZJ(this.LJIJJLI, iLIZLLL, iLJ, lineBottom);
        }
    }
}

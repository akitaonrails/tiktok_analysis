package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

/* JADX INFO: renamed from: X.0kN6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316820kN6 extends MetricAffectingSpan {
    public final int LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1316820kN6.class != obj.getClass()) {
            return false;
        }
        C1316820kN6 c1316820kN6 = (C1316820kN6) obj;
        if (this.LL == c1316820kN6.LL && this.LLILLJJLI == c1316820kN6.LLILLJJLI) {
            return true;
        }
        return false;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C1316710kMv.LJIILIIL(textPaint, this.LLILLL, this.LL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, this.LLILZLL);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        C1316710kMv.LJIILIIL(textPaint, this.LLILLL, this.LL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, this.LLILZLL);
    }

    public C1316820kN6(int i, int i2, String str, String str2, String str3, boolean z) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = z;
    }
}

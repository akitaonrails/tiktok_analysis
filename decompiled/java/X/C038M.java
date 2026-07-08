package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CountdownAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Font;

/* JADX INFO: renamed from: X.038M, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C038M {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final int LIZJ;
    public int LIZLLL;

    public C038M(Context context, CountdownAttribute countdownAttribute, int i, int i2) {
        Integer numLIZ;
        CustomColor customColor;
        Font font;
        Integer numLIZ2 = null;
        if (countdownAttribute != null && (font = countdownAttribute.font) != null) {
            numLIZ = font.LIZ();
        } else {
            numLIZ = null;
        }
        this.LIZ = numLIZ;
        this.LIZJ = i;
        this.LIZLLL = i2;
        if (countdownAttribute != null && (customColor = countdownAttribute.fontColor) != null) {
            numLIZ2 = C038L.LIZ(customColor, context, null);
        }
        this.LIZIZ = numLIZ2;
    }
}

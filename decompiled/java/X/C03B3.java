package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Size;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.SpaceAttribute;

/* JADX INFO: renamed from: X.03B3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03B3 {
    public Integer LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final int LIZLLL;

    public C03B3() {
        this.LIZLLL = 2;
    }

    public C03B3(Context context, SpaceAttribute spaceAttribute) {
        Integer num;
        Integer num2;
        this();
        Size size = spaceAttribute.size;
        if (size != null) {
            num = size.width;
        } else {
            num = null;
        }
        this.LIZ = num;
        if (size != null) {
            num2 = size.height;
        } else {
            num2 = null;
        }
        this.LIZIZ = num2;
        CustomColor customColor = spaceAttribute.color;
        this.LIZJ = customColor != null ? C038L.LIZ(customColor, context, null) : null;
        Integer num3 = spaceAttribute.alignment;
        if (num3 != null) {
            this.LIZLLL = C03B6.LIZ(Integer.valueOf(num3.intValue()));
        }
    }
}

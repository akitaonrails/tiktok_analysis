package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.IconAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Size;

/* JADX INFO: renamed from: X.03B1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03B1 extends C03B4 {
    public final Drawable LJII;

    public C03B1(TuxIconDrawable tuxIconDrawable, IconAttribute iconAttribute, InterfaceC1631620sYq interfaceC1631620sYq, ECRichTextExtraInfo eCRichTextExtraInfo, boolean z) {
        Integer num;
        Integer num2;
        this.LJII = tuxIconDrawable;
        Size size = iconAttribute.size;
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
        Integer num3 = iconAttribute.alignment;
        if (num3 != null) {
            this.LIZLLL = C03B6.LIZ(Integer.valueOf(num3.intValue()));
        }
        String str = iconAttribute.link;
        this.LIZJ = str;
        if (z && (str == null || str.length() == 0)) {
            interfaceC1631620sYq = null;
        }
        this.LJ = interfaceC1631620sYq;
        this.LJFF = eCRichTextExtraInfo;
        this.LJI = z;
    }
}

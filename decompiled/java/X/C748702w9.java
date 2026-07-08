package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Font;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.IconAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Size;

/* JADX INFO: renamed from: X.02w9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C748702w9 {
    public static final Font LIZ(Integer num) {
        if (num == null) {
            return null;
        }
        num.intValue();
        return new Font(Integer.valueOf(C7736030k.LIZJ(num, null) % 10), Integer.valueOf((r2 / 10) - 1));
    }

    public static final ECRichTextAttribute LIZIZ(Icon icon) {
        return new ECRichTextAttribute(1, null, new IconAttribute(new Size(icon.getViewWidth(), icon.getViewHeight()), new com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon(icon.getIcon(), icon.getIconDark(), icon.getLink(), null), icon.getLink(), null), null, null, null);
    }
}

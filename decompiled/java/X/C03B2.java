package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.IconAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Size;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03B2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03B2 extends C03B4 {
    public final C03IT LJII;
    public final C03B7 LJIIIIZZ;

    public C03B2(IconAttribute iconAttribute, Context context, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq, ECRichTextExtraInfo eCRichTextExtraInfo, boolean z) {
        C03IT thumbFirstImageUrlModel;
        Integer num;
        Image imageLIZIZ;
        Icon icon = iconAttribute.icon;
        if (icon != null && (imageLIZIZ = C038L.LIZIZ(icon, context)) != null) {
            thumbFirstImageUrlModel = imageLIZIZ.toThumbFirstImageUrlModel();
        } else {
            thumbFirstImageUrlModel = null;
        }
        this.LJII = thumbFirstImageUrlModel;
        this.LJIIIIZZ = C03B7.LIZ;
        Size size = iconAttribute.size;
        if (size != null) {
            num = size.width;
        } else {
            num = null;
        }
        this.LIZ = num;
        this.LIZIZ = size != null ? size.height : null;
        Integer num2 = iconAttribute.alignment;
        if (num2 != null) {
            this.LIZLLL = C03B6.LIZ(Integer.valueOf(num2.intValue()));
        }
        this.LIZJ = iconAttribute.link;
        this.LJ = interfaceC1631620sYq;
        this.LJFF = eCRichTextExtraInfo;
        this.LJI = z;
    }
}

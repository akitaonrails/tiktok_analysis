package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselDesc;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Bn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C802503Bn extends LinearLayout {
    public static final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public PageHeaderCarouselContent LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;

    public C802503Bn(Context context) {
        super(context, null, 0);
        ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
        int i = LLILZLL;
        C426750GoL.LJIIL(this, Integer.valueOf(i), 0, Integer.valueOf(i), 0, 16);
        setGravity(17);
        setOrientation(0);
        SmartImageView smartImageView = new SmartImageView(context);
        C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(LLILZ, LLILZIL));
        this.LLILLJJLI = smartImageView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(LLIZ);
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setTuxFont(61);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.LLILLL = tuxTextView;
        addView(smartImageView);
        addView(tuxTextView);
    }

    public final void LIZ(PageHeaderCarouselContent pageHeaderCarouselContent) {
        String str;
        String str2;
        Image imageRequireImageForEcDarkMode;
        if (Intrinsics.LJFF(pageHeaderCarouselContent, this.LL)) {
            return;
        }
        this.LL = pageHeaderCarouselContent;
        C0H1U.LIZIZ(this.LLILLJJLI);
        C0H1U.LIZIZ(this.LLILLL);
        Icon icon = pageHeaderCarouselContent.pageHeaderCarouselIcon;
        int iLIZIZ = 0;
        if (icon != null && (imageRequireImageForEcDarkMode = icon.requireImageForEcDarkMode(getContext())) != null) {
            C12ES.LJIILL(0, this.LLILLJJLI);
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            C03IT imageUrlModel = imageRequireImageForEcDarkMode.toImageUrlModel();
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
            c1331670kl3LIZLLL.LJJ(this.LLILLJJLI);
            c1331670kl3LIZLLL.LJIIJJI();
        }
        PageHeaderCarouselDesc pageHeaderCarouselDesc = pageHeaderCarouselContent.pageHeaderCarouselDesc;
        if (pageHeaderCarouselDesc != null && (str = pageHeaderCarouselDesc.descText) != null) {
            C12ES.LJIILL(0, this.LLILLL);
            TuxTextView tuxTextView = this.LLILLL;
            if (C1744700vVE.LJ(getContext(), null)) {
                str2 = pageHeaderCarouselContent.pageHeaderCarouselDesc.textDarkColor;
            } else {
                str2 = pageHeaderCarouselContent.pageHeaderCarouselDesc.textColor;
            }
            if (str2 != null) {
                iLIZIZ = C0HEZ.LIZIZ(str2);
            }
            tuxTextView.setTextColor(iLIZIZ);
            C0H1U.LJIIL(this.LLILLL, str, true);
        }
    }
}

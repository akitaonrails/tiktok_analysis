package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Banner;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03Fl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C812703Fl extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    private final LinearLayout getBannerLayout() {
        return (LinearLayout) this.LL.getValue();
    }

    private final SmartImageView getRightsIcon() {
        return (SmartImageView) this.LLILLJJLI.getValue();
    }

    private final TuxTextView getRightsSubTitle() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final TuxTextView getRightsTitle() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    public C812703Fl(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1799));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1800));
        this.LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1801));
        this.LLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1802));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.amg, this, true);
    }

    public final void LIZ(Banner banner) {
        Image icon;
        C03IT imageUrlModel;
        if (C960203pA.LIZIZ(getContext())) {
            Icon icon2 = banner.icon;
            if (icon2 != null) {
                icon = icon2.getIconDark();
                if (icon == null && (imageUrlModel = icon.toImageUrlModel()) != null) {
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
                    c1331670kl3LIZLLL.LJJ(getRightsIcon());
                    C786410Ut5.h3(c1331670kl3LIZLLL);
                }
            }
            C0H1U.LIZIZ(getRightsIcon());
            C0H9H.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), getRightsTitle());
        } else {
            Icon icon3 = banner.icon;
            if (icon3 != null) {
                icon = icon3.getIcon();
                if (icon == null) {
                }
            }
            C0H1U.LIZIZ(getRightsIcon());
            C0H9H.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), getRightsTitle());
        }
        TextAttribute textAttribute = banner.title;
        if (textAttribute != null) {
            C0H1U.LJIIL(getRightsTitle(), textAttribute.text, true);
        }
        TextAttribute textAttribute2 = banner.subTitle;
        if (textAttribute2 != null) {
            C0H1U.LJIIL(getRightsSubTitle(), textAttribute2.text, true);
        }
        C786410Ut5.I7(new AjS40S0200000_1(this, banner, 99), getBannerLayout());
        C1748720vbi.LIZLLL(getBannerLayout(), new C049G(), new AwS580S0100000_1(banner, 1093));
    }

    public final void LIZIZ(Banner banner) {
        C1748720vbi.LIZLLL(getBannerLayout(), new C049H(), new AwS580S0100000_1(banner, 1092));
    }
}

package X;

import Y.ALAdapterS26S0100000_32;
import Y.ALAdapterS26S0200000_32;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.IconSize;
import java.util.List;

/* JADX INFO: renamed from: X.187o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212334187o extends LinearLayout {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public final C1765700w36 LLILLL;
    public final LinearLayout LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    public C212334187o(Context context) {
        super(context, null, 0);
        SmartImageView smartImageView = new SmartImageView(context);
        this.LL = smartImageView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.LLILLJJLI = tuxTextView;
        C1765700w36 c1765700w36 = new C1765700w36(context, null, 6);
        this.LLILLL = c1765700w36;
        LinearLayout linearLayout = new LinearLayout(context, null, 0);
        this.LLILZ = linearLayout;
        this.LLILZIL = true;
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        addView(smartImageView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), -2, 1.0f);
        layoutParams2.gravity = 16;
        addView(tuxTextView, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.setMarginStart(C679280Qkg.LIZ(0));
        layoutParams3.gravity = 16;
        addView(linearLayout, layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.setMarginStart(C679280Qkg.LIZ(4));
        layoutParams4.gravity = 16;
        linearLayout.addView(c1765700w36, layoutParams4);
        C786410Ut5.O(c1765700w36, 8);
    }

    public final void setCountDownMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (this.LLILZLL) {
            ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
            if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.setMarginStart(i);
            }
        }
        ViewGroup.LayoutParams layoutParams2 = this.LLILLL.getLayoutParams();
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    public void setCountDownShowStyle(Integer num) {
        if (num != null) {
            this.LLILLL.LJJJJL(num.intValue(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), "05:48:48");
        }
    }

    public void setCountDownText(long j) {
        if (j > 0 && j < 86400000) {
            if (this.LLILLL.getVisibility() != 0) {
                C786410Ut5.O(this.LLILLL, 0);
                if (this.LLILZIL) {
                    this.LLILZIL = false;
                    this.LLILLL.getLayoutParams().width = this.LLILLL.LJJJJJ();
                }
                this.LLILLL.setCountdownTimeMillis(j);
                return;
            }
            this.LLILLL.setCountdownTimeMillis(j);
            return;
        }
        C786410Ut5.O(this.LLILLL, 8);
    }

    public final void setCountDownTextColor(Integer num) {
        if (num != null) {
            this.LLILLL.setTextColor(num.intValue());
        }
    }

    public final void setCountDownTextFont(int i) {
        this.LLILLL.setTuxFont(i);
    }

    public final void setCountDownVisible(boolean z) {
        int i;
        C1765700w36 c1765700w36 = this.LLILLL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.O(c1765700w36, i);
    }

    public final void setCountDownWidth(int i) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = this.LLILLL.getLayoutParams();
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null && layoutParams.width != i) {
            layoutParams.width = i;
            C1765700w36 c1765700w36 = this.LLILLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1765700w36);
            c1765700w36.setLayoutParams(layoutParams);
        }
    }

    public final void setIconMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginEnd(i);
        }
    }

    public final void setPromotionIcon(C212337187r c212337187r) {
        if (c212337187r.LIZJ) {
            C786410Ut5.LLFF(8, this.LL);
            return;
        }
        Image image = c212337187r.LIZ;
        IconSize iconSize = c212337187r.LIZIZ;
        boolean z = c212337187r.LIZLLL;
        if (image != null && image.getUrls() != null) {
            C786410Ut5.LLFF(0, this.LL);
            if (z && C1744760vVK.LIZ()) {
                C786410Ut5.Jb(this.LL, 180.0f);
            } else {
                C786410Ut5.Jb(this.LL, 0.0f);
            }
            if (iconSize != null) {
                ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
                Integer num = iconSize.width;
                if (num != null) {
                    layoutParams.width = C679280Qkg.LIZ(num.intValue());
                }
                Integer num2 = iconSize.height;
                if (num2 != null) {
                    layoutParams.height = C679280Qkg.LIZ(num2.intValue());
                }
            }
            List<String> urls = image.getUrls();
            if (urls == null) {
                return;
            }
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            C03IT c03it = new C03IT(C0H1M.LIZ(urls, EnumC1769850w9n.LIVE_POP_CARD_LABEL_ICON));
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(c03it);
            c1331670kl3LIZLLL.LJJ(this.LL);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            return;
        }
        C786410Ut5.LLFF(8, this.LL);
    }

    public final void setPromotionMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    public void setPromotionText(String str) {
        if (str != null && str.length() != 0) {
            this.LLILLJJLI.setText(str);
            C786410Ut5.LLLLZLL(this.LLILLJJLI, 0);
            this.LLILLJJLI.requestLayout();
            return;
        }
        C786410Ut5.LLLLZLL(this.LLILLJJLI, 8);
    }

    public final void setPromotionTextColor(Integer num) {
        if (num != null) {
            this.LLILLJJLI.setTextColor(num.intValue());
        }
    }

    public final void setPromotionTextEllipsize(TextUtils.TruncateAt truncateAt) {
        this.LLILLJJLI.setEllipsize(truncateAt);
    }

    public final void setPromotionTextFont(int i) {
        this.LLILLJJLI.setTuxFont(i);
    }

    public final void setPromotionTextMarginStart(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    public final void LIZ(Long l, List list, boolean z) {
        if (z) {
            if (this.LLILLL.getVisibility() != 0 && list != null) {
                C1765700w36 c1765700w36 = this.LLILLL;
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(c1765700w36, "width", 0, c1765700w36.LJJJJJ());
                objectAnimatorOfInt.addListener(new ALAdapterS26S0200000_32(l, this, 8));
                list.add(objectAnimatorOfInt);
                return;
            }
            return;
        }
        if (this.LLILLL.getVisibility() == 8 || list == null) {
            return;
        }
        C1765700w36 c1765700w362 = this.LLILLL;
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(c1765700w362, "width", c1765700w362.LJJJJJ(), 0);
        objectAnimatorOfInt2.addListener(new ALAdapterS26S0100000_32(this, 16));
        list.add(objectAnimatorOfInt2);
    }
}

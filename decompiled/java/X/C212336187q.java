package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.IconSize;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212336187q extends LinearLayout {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public final C01GW LLILLL;

    private final TuxTextView getExtraTag() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    public C212336187q(Context context) {
        this(context, null, 0);
    }

    public final void LIZJ(C212337187r c212337187r) {
        int i;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("update promotion");
        Integer numValueOf = c212337187r.LJFF;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(c212337187r.LJ);
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numValueOf));
        Integer numValueOf2 = c212337187r.LJI;
        if (numValueOf2 == null) {
            numValueOf2 = Integer.valueOf(c212337187r.LJ);
        }
        boolean z = false;
        setPadding(iLIZIZ, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numValueOf2)), 0);
        LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c212337187r.LJII))), this.LL);
        LIZIZ(null, null, c212337187r.LIZIZ, false);
        Image image = c212337187r.LIZ;
        if (image != null && !c212337187r.LIZJ) {
            LIZIZ(image.getUrls(), image.getUri(), c212337187r.LIZIZ, c212337187r.LIZLLL);
        }
        C212339187t c212339187t = c212337187r.LJIIIIZZ;
        if (c212339187t != null) {
            setTagText(c212339187t.LIZ);
            setTagFont(c212339187t.LIZIZ);
            setTagColor(c212339187t.LIZJ);
        }
        if (indexOfChild(getExtraTag()) != -1) {
            z = true;
            setExtraTagText(null);
        }
        C212339187t c212339187t2 = c212337187r.LJIIIZ;
        if (c212339187t2 != null) {
            if (!z) {
                TuxTextView extraTag = getExtraTag();
                if (c212337187r.LJIIL == 1) {
                    i = 1;
                } else {
                    i = 2;
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 16;
                addView(extraTag, i, layoutParams);
                if (c212337187r.LJIIL == 1) {
                    LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c212337187r.LJII))), getExtraTag());
                } else {
                    LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c212337187r.LJII))), this.LLILLJJLI);
                }
            }
            setExtraTagText(c212339187t2.LIZ);
            setExtraTagFont(c212339187t2.LIZIZ);
            setExtraTagColor(c212339187t2.LIZJ);
        }
        setBackground(null);
        C212338187s c212338187s = c212337187r.LJIILIIL;
        if (c212338187s != null) {
            Integer num = c212338187s.LIZ;
            float f = c212338187s.LIZJ;
            Integer num2 = c212338187s.LIZIZ;
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c212338187s.LIZLLL)));
            C384050F3z c384050F3z = new C384050F3z();
            if (num2 != null) {
                c384050F3z.LJ = num2;
            }
            c384050F3z.LIZLLL = Integer.valueOf(C0H9I.LIZ(f));
            if (num != null) {
                c384050F3z.LIZ = num;
            }
            float f2 = iLIZIZ2;
            c384050F3z.LJIIJ = Float.valueOf(f2);
            c384050F3z.LJIIJJI = Float.valueOf(f2);
            c384050F3z.LJIIIIZZ = Float.valueOf(f2);
            c384050F3z.LJIIIZ = Float.valueOf(f2);
            setBackground(c384050F3z.LIZ(getContext()));
        }
        if (c212337187r.LJIILJJIL > 0) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c212337187r.LJIILJJIL)));
                requestLayout();
            } else {
                ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c212337187r.LJIILJJIL))));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void setExtraTagColor(int i) {
        getExtraTag().setTextColor(i);
    }

    public final void setExtraTagFont(int i) {
        getExtraTag().setTuxFont(i);
    }

    public final void setExtraTagText(String str) {
        if (str != null && str.length() != 0) {
            C786410Ut5.LLLLZLL(getExtraTag(), 0);
            getExtraTag().setText(str);
        } else {
            C786410Ut5.LLLLZLL(getExtraTag(), 8);
        }
    }

    public final void setTagColor(int i) {
        this.LLILLJJLI.setTextColor(i);
    }

    public final void setTagFont(int i) {
        this.LLILLJJLI.setTuxFont(i);
    }

    public final void setTagText(String str) {
        this.LLILLJJLI.setText(str);
    }

    public C212336187q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void LIZ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginEnd(i);
        }
    }

    public C212336187q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SmartImageView smartImageView = new SmartImageView(context);
        this.LL = smartImageView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = C452501pT.LIZIZ(new AwS576S0100000_32(context, 169));
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        addView(smartImageView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        addView(tuxTextView, layoutParams2);
    }

    public final void LIZIZ(List<String> list, String str, IconSize iconSize, boolean z) {
        if (iconSize != null) {
            ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
            Integer num = iconSize.width;
            if (num != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num.intValue())));
            }
            Integer num2 = iconSize.height;
            if (num2 != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num2.intValue())));
            }
        }
        if (z && C1744760vVK.LIZ()) {
            C786410Ut5.Jb(this.LL, 180.0f);
        } else {
            C786410Ut5.Jb(this.LL, 0.0f);
        }
        if (list != null) {
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            C03IT c03it = new C03IT(C0H1M.LIZ(list, EnumC1769850w9n.LIVE_POP_CARD_LABEL_ICON));
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(c03it);
            c1331670kl3LIZLLL.LJJ(this.LL);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c1331670kl3LIZLLL.LJIIIIZZ = iLIZIZ;
            c1331670kl3LIZLLL.LJIIIZ = iLIZIZ2;
            C786410Ut5.h3(c1331670kl3LIZLLL);
            C786410Ut5.LLFF(0, this.LL);
            return;
        }
        if (str != null) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL2.LJJ(this.LL);
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c1331670kl3LIZLLL2.LJIIIIZZ = iLIZIZ3;
            c1331670kl3LIZLLL2.LJIIIZ = iLIZIZ4;
            C786410Ut5.h3(c1331670kl3LIZLLL2);
            C786410Ut5.LLFF(0, this.LL);
            return;
        }
        C786410Ut5.LLFF(8, this.LL);
    }
}

package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo.SeaPdpCreatorVideoCardDTO;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS427S0200000_26;

/* JADX INFO: renamed from: X.0vs5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758870vs5 extends FrameLayout {
    public final SmartImageView LL;
    public final LinearLayout LLILLJJLI;
    public final C427660Gpo LLILLL;
    public final TuxTextView LLILZ;
    public final float LLILZIL;
    public SeaPdpCreatorVideoCardDTO LLILZLL;

    public C1758870vs5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final SeaPdpCreatorVideoCardDTO getData() {
        return this.LLILZLL;
    }

    public final void LIZ(SeaPdpCreatorVideoCardDTO seaPdpCreatorVideoCardDTO) {
        int i;
        if (seaPdpCreatorVideoCardDTO == null) {
            return;
        }
        Image image = seaPdpCreatorVideoCardDTO.poster;
        if (image != null) {
            C1334210kp9.LIZ(image, EnumC1769850w9n.PDP_CREATOR_VIDEO_CELL_IMAGE, null, null, null, null, 252);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
            ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
            int i2 = layoutParams.height;
            if (i2 > 0 && (i = layoutParams.width) > 0) {
                c1331670kl3LIZLLL.LJIIIIZZ = i;
                c1331670kl3LIZLLL.LJIIIZ = i2;
            }
            c1331670kl3LIZLLL.LIZLLL = true;
            c1331670kl3LIZLLL.LJJLIIIJJI = true;
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LIZLLL.LJJ(this.LL);
            c1331670kl3LIZLLL.LJIIJJI();
        }
        if (this.LLILLJJLI.getVisibility() == 0) {
            C1260120ite.LIZ(new ARunnableS116S0100000_16(new AwS427S0200000_26(this, seaPdpCreatorVideoCardDTO, 23), 46));
            this.LLILZ.setText(seaPdpCreatorVideoCardDTO.creatorName);
            this.LLILLL.setForeground(null);
        }
        this.LLILZLL = seaPdpCreatorVideoCardDTO;
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            C03DZ.LIZJ(this.LLILLJJLI);
        } else {
            C0H1U.LIZIZ(this.LLILLJJLI);
        }
    }

    public final void LIZJ(int i) {
        if (i <= 0) {
            return;
        }
        int i2 = (int) ((i / this.LLILZIL) + 0.5f);
        if (getLayoutParams() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        } else {
            if (i == getLayoutParams().width || getLayoutParams().height <= 0) {
                return;
            }
            getLayoutParams().width = i;
            getLayoutParams().height = i2;
            requestLayout();
        }
    }

    public C1758870vs5(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILZIL = 0.75f;
        C786410Ut5.Sd(R.layout.aw1, C786410Ut5.ne(context), this);
        this.LL = (SmartImageView) findViewById(R.id.l61);
        findViewById(R.id.l70);
        this.LLILLJJLI = (LinearLayout) findViewById(R.id.n9t);
        this.LLILLL = (C427660Gpo) findViewById(R.id.l5h);
        this.LLILZ = (TuxTextView) findViewById(R.id.z2b);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            setBackgroundColor(numLIZJ.intValue());
        }
        final float fLIZIZ = C0H9H.LIZIZ(10);
        setOutlineProvider(new ViewOutlineProvider(fLIZIZ) { // from class: X.0GZk
            public final float LIZ;

            {
                this.LIZ = fLIZIZ;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                if (view == null) {
                    return;
                }
                Rect rect = new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom());
                if (outline != null) {
                    outline.setRoundRect(rect, this.LIZ);
                }
            }
        });
        setClipToOutline(true);
    }
}

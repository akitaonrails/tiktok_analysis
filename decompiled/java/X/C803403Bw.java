package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03Bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C803403Bw extends ConstraintLayout {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public LinearLayout LLILLL;
    public LinearLayout LLILZ;
    public TuxTextView LLILZIL;
    public C03IW LLILZLL;

    public final C03IW getEtErrorTipsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hck);
            this.LLILZLL = (C03IW) callbackFindViewById;
        }
        return (C03IW) callbackFindViewById;
    }

    public final TuxIconView getIconAddressFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxm);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getLlAddressDetailContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n9s);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getLlEditContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n_4);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTvAddressCartEditFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.agl);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z4s);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final void setRichContentVisible(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        TuxIconView iconAddressFromXml = getIconAddressFromXml();
        int i5 = 0;
        if (iconAddressFromXml != null) {
            if (z) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            C786410Ut5.LJLLLLLL(i4, iconAddressFromXml);
        }
        TuxTextView tvNameFromXml = getTvNameFromXml();
        if (tvNameFromXml != null) {
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, tvNameFromXml);
        }
        LinearLayout llAddressDetailContainerFromXml = getLlAddressDetailContainerFromXml();
        if (llAddressDetailContainerFromXml != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, llAddressDetailContainerFromXml);
        }
        LinearLayout llEditContainerFromXml = getLlEditContainerFromXml();
        if (llEditContainerFromXml != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, llEditContainerFromXml);
        }
        C03IW etErrorTipsFromXml = getEtErrorTipsFromXml();
        if (etErrorTipsFromXml != null) {
            if (!(!z)) {
                i5 = 8;
            }
            C786410Ut5.LJLLLLLL(i5, etErrorTipsFromXml);
        }
    }

    public final void setEtErrorTipsFromXml(C03IW c03iw) {
        this.LLILZLL = c03iw;
    }

    public final void setIconAddressFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setLlAddressDetailContainerFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setLlEditContainerFromXml(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    public final void setTvAddressCartEditFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setTvNameFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public C803403Bw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C803403Bw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.aom, this, true);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca A[PHI: r12
      0x00ca: PHI (r12v1 com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText) = 
      (r12v0 com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText)
      (r12v4 com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText)
      (r12v4 com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText)
     binds: [B:54:0x00c6, B:49:0x00b9, B:51:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(int r19, com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo r20, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.HintInvalidDynamicMessage r21, com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r22, X.InterfaceC1631620sYq r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C803403Bw.e0(int, com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.HintInvalidDynamicMessage, com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText, X.0sYq, boolean, boolean):void");
    }
}

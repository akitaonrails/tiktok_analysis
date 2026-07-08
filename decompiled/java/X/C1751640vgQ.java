package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vgQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1751640vgQ extends ConstraintLayout {
    public SmartImageView LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public LinearLayout LLILZIL;

    public final SmartImageView getAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bh2);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final LinearLayout getHeaderInfoContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v72);
            this.LLILZIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getHeaderShopInfoTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jkg);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getOfficialLabelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pim);
            this.LLILLJJLI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getTvNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zym);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e0() {
        /*
            r6 = this;
            com.bytedance.lighten.loader.SmartImageView r0 = r6.getAvatarFromXml()
            r5 = 0
            if (r0 == 0) goto L78
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L78
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r4 = r1.getMarginStart()
        L15:
            com.bytedance.lighten.loader.SmartImageView r0 = r6.getAvatarFromXml()
            if (r0 == 0) goto L76
            int r0 = r0.getWidth()
        L1f:
            int r4 = r4 + r0
            android.widget.LinearLayout r0 = r6.getHeaderInfoContainerFromXml()
            if (r0 == 0) goto L74
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L74
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r3 = r1.getMarginStart()
        L34:
            com.bytedance.lighten.loader.SmartImageView r0 = r6.getOfficialLabelFromXml()
            if (r0 == 0) goto L72
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L72
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.getMarginStart()
        L48:
            com.bytedance.lighten.loader.SmartImageView r0 = r6.getOfficialLabelFromXml()
            if (r0 == 0) goto L70
            int r0 = r0.getWidth()
        L52:
            int r2 = r2 + r0
            android.widget.LinearLayout r0 = r6.getHeaderInfoContainerFromXml()
            if (r0 == 0) goto L67
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L67
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r5 = r1.getMarginEnd()
        L67:
            int r0 = r6.getMaxWidth()
            int r0 = r0 - r4
            int r0 = r0 - r3
            int r0 = r0 - r2
            int r0 = r0 - r5
            return r0
        L70:
            r0 = 0
            goto L52
        L72:
            r2 = 0
            goto L48
        L74:
            r3 = 0
            goto L34
        L76:
            r0 = 0
            goto L1f
        L78:
            r4 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1751640vgQ.e0():int");
    }

    public final void setAvatarFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setHeaderInfoContainerFromXml(LinearLayout linearLayout) {
        this.LLILZIL = linearLayout;
    }

    public final void setHeaderShopInfoTextFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setOfficialLabelFromXml(SmartImageView smartImageView) {
        this.LLILLJJLI = smartImageView;
    }

    public final void setTvNameFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public C1751640vgQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C954703oH.LIZ(context, R.layout.an4, this, true);
        setMaxWidth(C958103op.LIZLLL() / 2);
    }
}

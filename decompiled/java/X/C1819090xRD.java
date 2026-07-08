package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xRD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819090xRD extends LinearLayout {
    public int LL;
    public String LLILLJJLI;
    public final SmartImageView LLILLL;
    public final FrameLayout LLILZ;
    public final SmartImageView LLILZIL;
    public final TuxIconView LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxIconView LLIZLLLIL;

    public final void LIZIZ() {
        C786410Ut5.LLFF(8, this.LLILLL);
        C786410Ut5.LJZ(0, this.LLILZ);
        C786410Ut5.LLFF(4, this.LLILZIL);
        C786410Ut5.LLLLLLZZ(this.LLILZLL, 0);
        this.LLILZLL.setTintColor(this.LL);
        this.LLILZLL.invalidate();
    }

    public final TuxTextView getLabelView() {
        return this.LLIZ;
    }

    public C1819090xRD(Context context) {
        int iIntValue;
        super(context, null, 0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        this.LL = iIntValue;
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setImportantForAccessibility(2);
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.LLILLL = smartImageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(2);
        C786410Ut5.LJZ(8, frameLayout);
        this.LLILZ = frameLayout;
        SmartImageView smartImageView2 = new SmartImageView(context);
        smartImageView2.setImportantForAccessibility(2);
        smartImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.LLILZIL = smartImageView2;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setImportantForAccessibility(2);
        tuxIconView.setIconRes(R.raw.icon_gift_fill);
        tuxIconView.setTintColor(this.LL);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        this.LLILZLL = tuxIconView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setMaxLines(1);
        tuxTextView.setSingleLine(true);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setIncludeFontPadding(false);
        tuxTextView.setGravity(16);
        this.LLIZ = tuxTextView;
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        tuxIconView2.setImportantForAccessibility(2);
        this.LLIZLLLIL = tuxIconView2;
        setImportantForAccessibility(1);
        setOrientation(0);
        setGravity(16);
        setBaselineAligned(false);
        int iLIZ = LIZ(20.0f);
        SmartImageView smartImageView3 = this.LLILLL;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iLIZ, iLIZ);
        layoutParams.gravity = 16;
        layoutParams.setMarginEnd(LIZ(4.0f));
        C786410Ut5.G6(smartImageView3, layoutParams);
        FrameLayout frameLayout2 = this.LLILZ;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iLIZ, iLIZ);
        layoutParams2.gravity = 16;
        layoutParams2.setMarginEnd(LIZ(4.0f));
        C786410Ut5.a6(frameLayout2, layoutParams2);
        C786410Ut5.G6(this.LLILZIL, new FrameLayout.LayoutParams(iLIZ, iLIZ, 17));
        int iLIZ2 = LIZ(16.0f);
        C786410Ut5.M6(this.LLILZLL, new FrameLayout.LayoutParams(iLIZ2, iLIZ2, 17));
        frameLayout.addView(smartImageView2);
        frameLayout.addView(tuxIconView);
        TuxTextView tuxTextView2 = this.LLIZ;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginEnd(LIZ(2.0f));
        layoutParams3.gravity = 16;
        C786410Ut5.R6(tuxTextView2, layoutParams3);
        int iLIZ3 = LIZ(14.0f);
        TuxIconView tuxIconView3 = this.LLIZLLLIL;
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iLIZ3, iLIZ3);
        layoutParams4.gravity = 16;
        C786410Ut5.M6(tuxIconView3, layoutParams4);
        tuxIconView2.setIconRes(R.raw.icon_chevron_right_ltr);
        tuxIconView2.setTintColor(this.LL);
        addView(smartImageView);
        addView(frameLayout);
        addView(tuxTextView);
        addView(tuxIconView2);
        C786410Ut5.Z1(this, 8);
    }

    public final int LIZ(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }
}

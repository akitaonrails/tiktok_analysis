package Y;

import X.C16F5;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1631630sYr;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.bytedance.android.livesdk.ultralitemode.LiveAdaptiveLiteModeDialog;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS3S2100000_4 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C16F5 c16f5;
        int width;
        if (!((LiveAdaptiveLiteModeDialog) this.l2).isAdded() || ((LiveAdaptiveLiteModeDialog) this.l2).getContext() == null || (c16f5 = ((LiveAdaptiveLiteModeDialog) this.l2).LL) == null || c16f5.getLineCount() <= 2 || (width = (c16f5.getWidth() - c16f5.getPaddingLeft()) - c16f5.getPaddingRight()) <= 0) {
            return;
        }
        TextPaint paint = c16f5.getPaint();
        int length = this.s0.length();
        int i = 0;
        int i2 = 0;
        while (i <= length) {
            int i3 = (i + length) / 2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.s0.substring(0, i3));
            sbLIZ.append("...");
            SpannableStringBuilder spannableStringBuilderMR = ((LiveAdaptiveLiteModeDialog) this.l2).MR(C2188811AlT.LIZIZ(sbLIZ), this.s1);
            if (StaticLayout.Builder.obtain(spannableStringBuilderMR, 0, spannableStringBuilderMR.length(), paint, width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(c16f5.getLineSpacingExtra(), c16f5.getLineSpacingMultiplier()).setIncludePad(c16f5.getIncludeFontPadding()).build().getLineCount() <= 2) {
                i = i3 + 1;
                i2 = i3;
            } else {
                length = i3 - 1;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.s0.substring(0, i2));
        sbLIZ2.append("...");
        c16f5.setText(((LiveAdaptiveLiteModeDialog) this.l2).MR(C2188811AlT.LIZIZ(sbLIZ2), this.s1));
    }

    public static final void run$0(ARunnableS3S2100000_4 aRunnableS3S2100000_4) {
        InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) aRunnableS3S2100000_4.l2;
        String str = aRunnableS3S2100000_4.s0;
        String str2 = aRunnableS3S2100000_4.s1;
        C1C7U.LIZ("GameResourceProvider$download$2@b1e9.onFail$1L");
        if (interfaceC1631630sYr != null) {
            interfaceC1631630sYr.invoke(Boolean.FALSE, str, str2, null);
        }
        C1C7U.LIZIZ("GameResourceProvider$download$2@b1e9.onFail$1L");
    }

    public static final void run$1(ARunnableS3S2100000_4 aRunnableS3S2100000_4) {
        boolean zLIZ;
        C1C7U.LIZ("LiveAdaptiveLiteModeDialog@6392.buildContentInfo$3");
        try {
            aRunnableS3S2100000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveAdaptiveLiteModeDialog@6392.buildContentInfo$3");
    }

    public ARunnableS3S2100000_4(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}

package X;

import Y.ARunnableS70S0200000_1;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.IconAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Size;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03C8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03C8 {
    public static final void LIZIZ(TuxIconView tuxIconView, IconAttribute iconAttribute) {
        Icon icon;
        Image imageLIZIZ;
        C03IT thumbFirstImageUrlModel;
        int iLIZIZ;
        Integer num;
        Integer num2;
        if (iconAttribute != null && (icon = iconAttribute.icon) != null && (imageLIZIZ = C038L.LIZIZ(icon, tuxIconView.getContext())) != null && (thumbFirstImageUrlModel = imageLIZIZ.toThumbFirstImageUrlModel()) != null) {
            try {
                Size size = iconAttribute.size;
                ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                int iLIZIZ2 = 0;
                if (size != null && (num2 = size.width) != null) {
                    iLIZIZ = C0H9H.LIZIZ(num2.intValue());
                } else {
                    iLIZIZ = 0;
                }
                layoutParams.width = iLIZIZ;
                if (size != null && (num = size.height) != null) {
                    iLIZIZ2 = C0H9H.LIZIZ(num.intValue());
                }
                layoutParams.height = iLIZIZ2;
                C786410Ut5.M6(tuxIconView, layoutParams);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C823050WQl.LIZLLL().execute(new ARunnableS70S0200000_1(thumbFirstImageUrlModel, tuxIconView, 15));
        }
    }

    public static final void LIZJ(TextView textView, ECRichText eCRichText, String str, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq) {
        TextAttribute textAttribute;
        Integer num;
        textView.setText(LIZ(textView, eCRichText, str, interfaceC1631620sYq, null, false, 24));
        if (eCRichText != null && (textAttribute = eCRichText.textAttribute) != null && (num = textAttribute.lines) != null) {
            textView.setMaxLines(num.intValue());
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public static final void LJ(TextView textView, ECRichText eCRichText, String str, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq) {
        SpannableStringBuilder spannableStringBuilderLIZ = LIZ(textView, eCRichText, str, interfaceC1631620sYq, null, false, 24);
        int i = 0;
        if (spannableStringBuilderLIZ == null || spannableStringBuilderLIZ.length() == 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, textView);
        textView.setText(spannableStringBuilderLIZ);
    }

    public static final void LIZLLL(TuxTextView tuxTextView, ECRichText eCRichText, String str, InterfaceC1631620sYq interfaceC1631620sYq, boolean z) {
        Integer num;
        C03B0 c03b0 = new C03B0(tuxTextView, str);
        C03B0.LIZ(c03b0, eCRichText, interfaceC1631620sYq, null, z, null, null, 108);
        tuxTextView.setText(c03b0.LIZJ);
        TextAttribute textAttribute = eCRichText.textAttribute;
        if (textAttribute != null && (num = textAttribute.lines) != null) {
            tuxTextView.setMaxLines(num.intValue());
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public static SpannableStringBuilder LIZ(TextView textView, ECRichText eCRichText, String str, InterfaceC1631620sYq interfaceC1631620sYq, C431490Gvz c431490Gvz, boolean z, int i) {
        boolean z2 = z;
        C431490Gvz c431490Gvz2 = c431490Gvz;
        InterfaceC1631620sYq interfaceC1631620sYq2 = interfaceC1631620sYq;
        if ((i & 4) != 0) {
            interfaceC1631620sYq2 = null;
        }
        if ((i & 8) != 0) {
            c431490Gvz2 = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if (eCRichText == null) {
            return null;
        }
        C03B0 c03b0 = new C03B0(textView, str);
        C03B0.LIZ(c03b0, eCRichText, interfaceC1631620sYq2, null, z2, null, c431490Gvz2, 44);
        return c03b0.LIZJ;
    }
}

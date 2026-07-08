package X;

import Y.AComparatorS505S0100000_6;
import Y.AComparatorS523S0100000_26;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.ecommerce.settings.EcomAccessibilityConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0voH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756510voH {
    public static final void LIZ(final TextView textView, Spanned spanned) {
        ClickableSpan[] clickableSpanArr;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EcomAccessibilityConfig.Config config = EcomAccessibilityConfig.LIZ;
        EcomAccessibilityConfig.Config config2 = (EcomAccessibilityConfig.Config) c0c64LJIILLIIL.LJJII(EcomAccessibilityConfig.Config.class, config, "ec_accessibility_rich_text_fix", true);
        if (config2 != null) {
            config = config2;
        }
        if (!Intrinsics.LJFF(config.accessibilityRichTextFix, Boolean.TRUE)) {
            return;
        }
        if (spanned == null) {
            CharSequence text = textView.getText();
            if (text instanceof Spanned) {
                spanned = (Spanned) text;
            } else {
                return;
            }
        }
        if (spanned != null && (clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, textView.length(), ClickableSpan.class)) != null && clickableSpanArr.length != 0) {
            q0.LJIJ(textView, new AbstractC1324060kYm(textView) { // from class: X.14Kz
                public final TextView LJIILIIL;

                {
                    super(textView);
                    this.LJIILIIL = textView;
                }

                @Override // X.AbstractC1324060kYm
                public final void LIZJ(List<Integer> list) {
                    Spanned spanned2;
                    ClickableSpan[] clickableSpanArr2;
                    Object[] spans;
                    List listLJJLIIIIJ;
                    CharSequence text2 = this.LJIILIIL.getText();
                    if (text2 instanceof Spanned) {
                        spanned2 = (Spanned) text2;
                    } else {
                        spanned2 = null;
                    }
                    if (spanned2 == null || (spans = spanned2.getSpans(0, this.LJIILIIL.length(), ClickableSpan.class)) == null || (listLJJLIIIIJ = C13LQ.LJJLIIIIJ(new AComparatorS523S0100000_26(spanned2, 0), spans)) == null || (clickableSpanArr2 = (ClickableSpan[]) listLJJLIIIIJ.toArray(new ClickableSpan[0])) == null) {
                        clickableSpanArr2 = new ClickableSpan[0];
                    }
                    int length = clickableSpanArr2.length;
                    for (int i = 0; i < length; i++) {
                        ((ArrayList) list).add(Integer.valueOf(i));
                    }
                }

                @Override // X.AbstractC1324060kYm
                public final boolean LJFF(int i, int i2) {
                    Object[] array;
                    Spanned spanned2;
                    Object[] spans;
                    List listLJJLIIIIJ;
                    if (i2 != 16) {
                        return false;
                    }
                    CharSequence text2 = this.LJIILIIL.getText();
                    if (!(text2 instanceof Spanned) || (spanned2 = (Spanned) text2) == null || (spans = spanned2.getSpans(0, this.LJIILIIL.length(), ClickableSpan.class)) == null || (listLJJLIIIIJ = C13LQ.LJJLIIIIJ(new AComparatorS505S0100000_6(spanned2, 8), spans)) == null || (array = listLJJLIIIIJ.toArray(new ClickableSpan[0])) == null) {
                        array = new ClickableSpan[0];
                    }
                    ClickableSpan clickableSpan = (ClickableSpan) C13LQ.LJJIIZ(i, array);
                    if (clickableSpan != null) {
                        clickableSpan.onClick(this.LJIILIIL);
                        return true;
                    }
                    return true;
                }

                @Override // X.AbstractC1324060kYm
                public final void LJII(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    Spanned spanned2;
                    Object[] array;
                    int spanStart;
                    int spanEnd;
                    Object[] spans;
                    List listLJJLIIIIJ;
                    CharSequence text2 = this.LJIILIIL.getText();
                    if (text2 instanceof Spanned) {
                        spanned2 = (Spanned) text2;
                    } else {
                        spanned2 = null;
                    }
                    if (spanned2 == null || (spans = spanned2.getSpans(0, this.LJIILIIL.length(), ClickableSpan.class)) == null || (listLJJLIIIIJ = C13LQ.LJJLIIIIJ(new AComparatorS523S0100000_26(spanned2, 1), spans)) == null || (array = listLJJLIIIIJ.toArray(new ClickableSpan[0])) == null) {
                        array = new ClickableSpan[0];
                    }
                    Object objLJJIIZ = C13LQ.LJJIIZ(i, array);
                    if (spanned2 != null && objLJJIIZ != null) {
                        spanStart = spanned2.getSpanStart(objLJJIIZ);
                        spanEnd = spanned2.getSpanEnd(objLJJIIZ);
                        if (spanStart >= 0 && spanStart < spanEnd) {
                            accessibilityNodeInfoCompat.setContentDescription(spanned2.subSequence(spanStart, spanEnd));
                        }
                    } else {
                        spanStart = -1;
                        spanEnd = -1;
                    }
                    accessibilityNodeInfoCompat.setClickable(true);
                    accessibilityNodeInfoCompat.addAction(16);
                    Rect rect = new Rect();
                    Layout layout = this.LJIILIIL.getLayout();
                    if (layout != null && spanStart >= 0 && spanEnd > spanStart) {
                        Path path = new Path();
                        layout.getSelectionPath(spanStart, spanEnd, path);
                        RectF rectF = new RectF();
                        path.computeBounds(rectF, true);
                        if (!rectF.isEmpty()) {
                            rectF.round(rect);
                            rect.offset(this.LJIILIIL.getTotalPaddingLeft(), this.LJIILIIL.getTotalPaddingTop());
                        }
                    }
                    if (rect.isEmpty()) {
                        rect.set(0, 0, this.LJIILIIL.getWidth(), this.LJIILIIL.getHeight());
                    }
                    accessibilityNodeInfoCompat.setBoundsInParent(rect);
                }
            });
        }
    }
}

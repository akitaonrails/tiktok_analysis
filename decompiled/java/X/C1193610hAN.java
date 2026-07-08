package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.LsRichText;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.LsRichTextItem;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.TextAttribute;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hAN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193610hAN {
    public final Context LIZ;
    public final SpannableStringBuilder LIZIZ = new SpannableStringBuilder();
    public final String LIZJ = "￼";

    public C1193610hAN(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(LsRichText lsRichText, InterfaceC1193660hAS interfaceC1193660hAS) {
        String str;
        int length;
        int iIntValue;
        if (lsRichText != null && (str = lsRichText.template) != null && str.length() != 0) {
            try {
                this.LIZIZ.append((CharSequence) lsRichText.template);
                String str2 = lsRichText.attribute;
                if (str2 != null) {
                    C1227904rF.LIZ.getClass();
                    TextAttribute textAttribute = (TextAttribute) C1227904rF.LIZIZ(str2, TextAttribute.class);
                    SpannableStringBuilder spannableStringBuilder = this.LIZIZ;
                    C1193640hAQ.LIZJ(spannableStringBuilder, this.LIZ, null, textAttribute, interfaceC1193660hAS, lsRichText.extraInfo, 0, spannableStringBuilder.length());
                }
                List<LsRichTextItem> list = lsRichText.arguments;
                if (list != null) {
                    for (LsRichTextItem lsRichTextItem : list) {
                        String str3 = lsRichTextItem.placeholder;
                        if (str3 != null && str3.length() != 0) {
                            int length2 = 0;
                            while (true) {
                                int iLJJJ = a0.LJJJ(this.LIZIZ, lsRichTextItem.placeholder, length2, false, 4);
                                if (iLJJJ < 0) {
                                    break;
                                }
                                length2 = lsRichTextItem.placeholder.length() + iLJJJ;
                                Integer num = lsRichTextItem.type;
                                if (num != null && (iIntValue = num.intValue()) != 0) {
                                    if (iIntValue == 1) {
                                        length = this.LIZJ.length() + iLJJJ;
                                        C1193640hAQ.LIZ(this.LIZIZ, this.LIZ, lsRichTextItem.iconContent, iLJJJ, length2);
                                        length2 = length;
                                    }
                                } else {
                                    String str4 = lsRichTextItem.attribute;
                                    if (str4 != null) {
                                        C1227904rF.LIZ.getClass();
                                        TextAttribute textAttribute2 = (TextAttribute) C1227904rF.LIZIZ(str4, TextAttribute.class);
                                        length = str4.length() + iLJJJ;
                                        C1193640hAQ.LIZIZ(this.LIZIZ, this.LIZ, lsRichTextItem.textContent, textAttribute2, interfaceC1193660hAS, lsRichTextItem.extraInfo, iLJJJ, length2);
                                        length2 = length;
                                    }
                                }
                            }
                            if (length2 == 0) {
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}

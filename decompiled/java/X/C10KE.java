package X;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Arrays;
import kotlin.text.a0;
import kotlin.text.u;
import org.xml.sax.XMLReader;

/* JADX INFO: renamed from: X.10KE, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10KE {
    public static Spanned LIZIZ(String str, final Spannable... spannableArr) {
        int length = spannableArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = "";
        }
        int length2 = spannableArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            String string = spannableArr[i2].toString();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("<tux-span-");
            sbLIZ.append(i3);
            sbLIZ.append('>');
            sbLIZ.append(string);
            sbLIZ.append("</tux-span-");
            sbLIZ.append(i3);
            sbLIZ.append('>');
            strArr[i3] = C2188811AlT.LIZIZ(sbLIZ);
            i2++;
            i3++;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append((char) 8203);
        Object[] objArrCopyOf = Arrays.copyOf(strArr, length);
        sbLIZ2.append(C786410Ut5.j4(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        Html.TagHandler tagHandler = new Html.TagHandler(spannableArr) { // from class: X.15h2
            public final Spannable[] LIZ;

            {
                this.LIZ = spannableArr;
            }

            @Override // android.text.Html.TagHandler
            public final void handleTag(boolean z, String str2, Editable editable, XMLReader xMLReader) {
                if (u.LJJIIJZLJL(str2, "tux-span-", false) && !z) {
                    Spannable spannable = this.LIZ[CastIntegerProtector.valueOf((String) C13LP.LJJLIIIJJI(a0.LJJLIIIJILLIZJL(str2, new String[]{"-"}, 0, 6))).intValue()];
                    for (CharacterStyle characterStyle : (CharacterStyle[]) spannable.getSpans(0, spannable.length(), CharacterStyle.class)) {
                        int spanStart = spannable.getSpanStart(characterStyle);
                        int spanEnd = spannable.getSpanEnd(characterStyle);
                        if (editable.getSpanStart(characterStyle) < 0) {
                            int length3 = editable.length() - spannable.length();
                            editable.setSpan(characterStyle, spanStart + length3, spanEnd + length3, spannable.getSpanFlags(characterStyle));
                        }
                    }
                }
            }
        };
        if (Build.VERSION.SDK_INT >= 24) {
            return C19298810eo.LIZIZ(strLIZIZ, 0, null, tagHandler);
        }
        return Html.fromHtml(strLIZIZ, null, tagHandler);
    }

    public static Spanned LIZ(Context context, int i, Spannable... spannableArr) {
        return LIZIZ(context.getString(i), (Spannable[]) Arrays.copyOf(spannableArr, spannableArr.length));
    }
}

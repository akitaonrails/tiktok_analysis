package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.IconContent;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.TextAttribute;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.TextContent;
import java.util.List;
import java.util.Map;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0hAQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193640hAQ {
    public static final void LIZ(SpannableStringBuilder spannableStringBuilder, Context context, IconContent iconContent, int i, int i2) {
        String str;
        Integer numLJIIJJI;
        int iIntValue;
        List<String> listLIZ;
        String str2;
        Integer numLJIIJJI2;
        List<String> listLIZ2;
        String str3;
        if (iconContent != null && (str = iconContent.text) != null) {
            spannableStringBuilder.replace(i, i2, "￼");
            int i3 = i + 1;
            if (i3 > spannableStringBuilder.length()) {
                return;
            }
            C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(context, str);
            MatchResult matchResultFind$default = Regex.find$default(new Regex("height=(\\d+)"), str, 0, 2, null);
            if (matchResultFind$default != null && (listLIZ2 = matchResultFind$default.LIZ()) != null && (str3 = (String) ListProtector.get(listLIZ2, 1)) != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(str3);
            } else {
                numLJIIJJI = null;
            }
            int iIntValue2 = 14;
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 14;
            }
            MatchResult matchResultFind$default2 = Regex.find$default(new Regex("width=(\\d+)"), str, 0, 2, null);
            if (matchResultFind$default2 != null && (listLIZ = matchResultFind$default2.LIZ()) != null && (str2 = (String) ListProtector.get(listLIZ, 1)) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str2)) != null) {
                iIntValue2 = numLJIIJJI2.intValue();
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (c698190Ra5LJFF != null) {
                c419910GdJ.LIZ = c698190Ra5LJFF.LIZ;
                Integer num = c698190Ra5LJFF.LIZIZ;
                if (num != null) {
                    c419910GdJ.LIZLLL = Integer.valueOf(num.intValue());
                }
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
                C786410Ut5.q2(spannableStringBuilder, new C419890GdH(tuxIconDrawableLIZ, 2), i, i3, 33);
            }
        }
    }

    public static final void LIZIZ(SpannableStringBuilder spannableStringBuilder, Context context, TextContent textContent, TextAttribute textAttribute, InterfaceC1193660hAS interfaceC1193660hAS, Map<String, String> map, int i, int i2) {
        String str;
        if (textContent != null && (str = textContent.text) != null) {
            if (i >= 0 && i2 <= spannableStringBuilder.length() && i <= i2) {
                spannableStringBuilder.replace(i, i2, (CharSequence) str);
                int length = i + str.length();
                if (length > spannableStringBuilder.length()) {
                    return;
                }
                LIZJ(spannableStringBuilder, context, textContent, textAttribute, interfaceC1193660hAS, map, i, length);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid replace range start = ");
            sbLIZ.append(i);
            sbLIZ.append(", end = ");
            sbLIZ.append(i2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(android.text.SpannableStringBuilder r11, android.content.Context r12, com.ss.android.ugc.aweme.poi.uiwidget.richtext.TextContent r13, final com.ss.android.ugc.aweme.poi.uiwidget.richtext.TextAttribute r14, final X.InterfaceC1193660hAS r15, final java.util.Map r16, int r17, int r18) {
        /*
            r10 = r14
            java.lang.String r0 = r10.font
            boolean r0 = X.C123100dR.LIZ(r0)
            r2 = 33
            r3 = r18
            r4 = r17
            if (r0 == 0) goto L26
            X.01GW r0 = X.C2248361CzK.LIZ
            java.lang.String r0 = r10.font
            java.lang.Integer r0 = X.C2248361CzK.LIZIZ(r0)
            if (r0 == 0) goto L26
            int r5 = r0.intValue()
            X.0HcY r1 = new X.0HcY
            r0 = 0
            r1.<init>(r5, r0)
            X.C786410Ut5.q2(r11, r1, r4, r3, r2)
        L26:
            java.lang.String r0 = r10.fontColor
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L96
            X.01GW r0 = X.C2248361CzK.LIZ
            java.lang.String r0 = r10.fontColor
            java.lang.Integer r9 = X.C2248361CzK.LJ(r12, r0)
            if (r9 == 0) goto L96
            int r1 = r9.intValue()
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            X.C786410Ut5.q2(r11, r0, r4, r3, r2)
        L44:
            java.lang.String r0 = r10.bgColor
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L62
            X.01GW r0 = X.C2248361CzK.LIZ
            java.lang.String r0 = r10.bgColor
            java.lang.Integer r0 = X.C2248361CzK.LJ(r12, r0)
            if (r0 == 0) goto L62
            int r1 = r0.intValue()
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r1)
            X.C786410Ut5.q2(r11, r0, r4, r3, r2)
        L62:
            java.lang.Boolean r0 = r10.hasUnderline
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L74
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            X.C786410Ut5.q2(r11, r0, r4, r3, r2)
        L74:
            java.lang.Boolean r0 = r10.hasStrike
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L84
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            X.C786410Ut5.q2(r11, r0, r4, r3, r2)
        L84:
            if (r13 == 0) goto L95
            java.lang.String r7 = r13.link
            if (r7 == 0) goto L95
            X.0hAR r5 = new X.0hAR
            r8 = r16
            r6 = r15
            r5.<init>()
            X.C786410Ut5.q2(r11, r5, r4, r3, r2)
        L95:
            return
        L96:
            r9 = 0
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1193640hAQ.LIZJ(android.text.SpannableStringBuilder, android.content.Context, com.ss.android.ugc.aweme.poi.uiwidget.richtext.TextContent, com.ss.android.ugc.aweme.poi.uiwidget.richtext.TextAttribute, X.0hAS, java.util.Map, int, int):void");
    }
}

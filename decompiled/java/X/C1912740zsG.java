package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.InlineLink;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.TextWithInlineLink;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS115S0101000_7;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912740zsG {
    public static final Regex LIZ = new Regex("%(\\d+\\$)?s");

    public static CharSequence LIZ(TextWithInlineLink textWithInlineLink, final int i, final int i2, Function1 function1) {
        String str = textWithInlineLink.text;
        if (str == null) {
            str = "";
        }
        String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(str, "\\n", "\n", false), "\\r", "\r", false), "\r\n", "<br>", false), "\n", "<br>", false), "\r", "<br>", false);
        if (strLJJIFFI.length() == 0) {
            return new SpannableString("");
        }
        List list = textWithInlineLink.links;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            return new SpannableString(strLJJIFFI);
        }
        int iLJFF = C09RB.LJFF(Regex.findAll$default(LIZ, strLJJIFFI, 0, 2, null));
        int iMin = Math.min(iLJFF, list.size());
        if (iMin == 0) {
            return new SpannableString(strLJJIFFI);
        }
        Spannable[] spannableArr = new Spannable[iMin];
        for (int i3 = 0; i3 < iMin; i3++) {
            InlineLink inlineLink = (InlineLink) ListProtector.get(list, i3);
            String str2 = inlineLink.text;
            if (str2 == null) {
                str2 = "";
            }
            final AwS429S0200000_28 awS429S0200000_28 = new AwS429S0200000_28(function1, (Function1<? super InlineLink, Unit>) inlineLink, (InlineLink) 73);
            SpannableString spannableString = new SpannableString(str2);
            C786410Ut5.p2(spannableString, new ClickableSpan(i, i2, awS429S0200000_28) { // from class: X.0zsH
                public final int LL;
                public final int LLILLJJLI;
                public final Function0<Unit> LLILLL;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    this.LLILLL.invoke();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    int i4 = this.LL;
                    if (i4 != 0) {
                        textPaint.setColor(i4);
                    }
                    if (this.LLILLJJLI != 0) {
                        C444890HcV c444890HcV = new C444890HcV();
                        c444890HcV.LIZ(this.LLILLJJLI);
                        textPaint.setTypeface(c444890HcV.getTypeface());
                    }
                    textPaint.setUnderlineText(false);
                }

                {
                    this.LL = i;
                    this.LLILLJJLI = i2;
                    this.LLILLL = awS429S0200000_28;
                }
            }, 0, str2.length(), 33);
            spannableArr[i3] = spannableString;
        }
        if (iLJFF > iMin) {
            strLJJIFFI = LIZ.replace(strLJJIFFI, new AwS115S0101000_7(iMin, new C118300cf(), 4));
        }
        return C10KE.LIZIZ(strLJJIFFI, (Spannable[]) Arrays.copyOf(spannableArr, iMin));
    }
}

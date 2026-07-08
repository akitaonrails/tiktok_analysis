package X;

import android.content.Context;
import android.text.Spannable;
import android.text.Spanned;
import com.ss.android.ugc.aweme.feed.model.InlineLink;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS245S0300000_1;

/* JADX INFO: renamed from: X.03GZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GZ {
    public static Spanned LIZ(TextWithInlineLink textWithInlineLink, Context context, AFwS231S0000000_3 aFwS231S0000000_3, int i) {
        C444940Hca c444940Hca;
        if ((i & 2) != 0) {
            c444940Hca = new C444940Hca();
            c444940Hca.LIZLLL(1);
            c444940Hca.LIZIZ = false;
            c444940Hca.LIZIZ(43);
        } else {
            c444940Hca = null;
        }
        if ((i & 4) != 0) {
            aFwS231S0000000_3 = null;
        }
        ArrayList arrayList = new ArrayList();
        List<InlineLink> list = textWithInlineLink.links;
        if (list != null) {
            for (InlineLink inlineLink : list) {
                c444940Hca.LIZJ = inlineLink.text;
                c444940Hca.LJIIIIZZ = new AwS245S0300000_1(context, (Context) inlineLink, (InlineLink) aFwS231S0000000_3, (Function1<? super String, Unit>) 41);
                arrayList.add(c444940Hca.LIZ(context));
            }
        }
        String str = textWithInlineLink.text;
        if (str == null) {
            str = "";
        }
        Spannable[] spannableArr = (Spannable[]) arrayList.toArray(new Spannable[0]);
        return C10KE.LIZIZ(str, (Spannable[]) Arrays.copyOf(spannableArr, spannableArr.length));
    }
}

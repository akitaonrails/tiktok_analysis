package X;

import android.content.Context;
import android.text.SpannableString;
import com.ss.android.ugc.aweme.comment.widgets.CommentGroupChatSpan;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0Go1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426550Go1 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Context context, SpannableString spannableString, int i, int i2) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_bubble_left_right;
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1n);
        C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
        c419890GdHLIZIZ.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), C426750GoL.LIZLLL(context));
        C786410Ut5.p2(spannableString, c419890GdHLIZIZ, i, i2, 33);
    }

    public static SpannableString LIZ(Context context, String str, int i, long j, EnumC1244100iTo enumC1244100iTo) {
        String string;
        if (str.length() > 0) {
            string = C786410Ut5.j4(context.getString(2131831364), Arrays.copyOf(new Object[]{str}, 1));
        } else {
            string = context.getString(2131831401);
        }
        String str2 = "#" + string;
        SpannableString spannableString = new SpannableString(str2);
        LIZIZ(context, spannableString, 0, 1);
        C786410Ut5.p2(spannableString, new CommentGroupChatSpan(i, str2, j, string, enumC1244100iTo), 0, spannableString.length(), 33);
        C786410Ut5.p2(spannableString, new C444920HcY(42, false), 0, spannableString.length(), 33);
        return spannableString;
    }
}

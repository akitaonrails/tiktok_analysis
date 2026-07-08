package X;

import android.text.SpannableString;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS21S0001000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0Gwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C432090Gwx {
    public static C1721340utY LIZ;

    public static SpannableString LIZ(CharSequence charSequence, AwS21S0001000_6 awS21S0001000_6, Function1 function1, C1721330utX c1721330utX, int i) {
        C1721330utX c1721330utX2 = c1721330utX;
        if ((i & 2) != 0) {
            awS21S0001000_6 = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 16) != 0) {
            c1721330utX2 = new C1721330utX((Set) null, 3);
        }
        C1721340utY c1721340utY = LIZ;
        if (c1721340utY == null) {
            LIZ = new C1721340utY();
        } else {
            c1721340utY.LIZJ();
        }
        C1721340utY c1721340utY2 = LIZ;
        if (c1721340utY2 == null) {
            return null;
        }
        return c1721340utY2.LIZIZ(c1721330utX2, charSequence, new AwS585S0100000_6(awS21S0001000_6, (Function1<? super C1721380utc, ? extends List<? extends Object>>) 16), new AwS585S0100000_6(function1, (Function1<? super C1721380utc, ? extends List<? extends Object>>) 17), new AwS585S0100000_6((Function1) null, (Function1<? super C1721380utc, ? extends List<? extends Object>>) 18));
    }
}

package X;

import android.content.Context;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0sij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637750sij {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context, CutsameDataItem cutsameDataItem) {
        C19348710mr c19348710mr;
        CharSequence charSequence = "";
        if (cutsameDataItem == null) {
            return "";
        }
        long j = cutsameDataItem.usageAmount;
        int i = cutsameDataItem.maxMediaSize;
        if (j == 0) {
            if (i > 1) {
                return C786410Ut5.j4(context.getString(2131850011), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            }
            return C786410Ut5.j4(context.getString(2131850012), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        }
        Long lValueOf = Long.valueOf(j);
        if (lValueOf.longValue() < 10000) {
            c19348710mr = new C19348710mr(null, null, null, 15);
        } else {
            c19348710mr = new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13);
        }
        CharSequence charSequenceLIZ = C19374310qz.LIZ(lValueOf, c19348710mr, null, 1, 20);
        if (charSequenceLIZ != null) {
            charSequence = charSequenceLIZ;
        }
        String string = charSequence.toString();
        if (j > 1) {
            if (i > 1) {
                return C786410Ut5.j4(context.getString(2131850010), Arrays.copyOf(new Object[]{string, Integer.valueOf(i)}, 2));
            }
            return C786410Ut5.j4(context.getString(2131850008), Arrays.copyOf(new Object[]{string, Integer.valueOf(i)}, 2));
        }
        if (i > 1) {
            return C786410Ut5.j4(context.getString(2131850007), Arrays.copyOf(new Object[]{string, Integer.valueOf(i)}, 2));
        }
        return C786410Ut5.j4(context.getString(2131850009), Arrays.copyOf(new Object[]{string, Integer.valueOf(i)}, 2));
    }
}

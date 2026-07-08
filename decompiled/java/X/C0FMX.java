package X;

import Y.AComparatorS504S0100000_5;
import android.text.Editable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.mention.MentionSpanData;
import java.util.Arrays;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FMX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FMX {
    public static final /* synthetic */ int LIZ = 0;

    public static MentionSpanData[] LIZJ(Editable editable) {
        if (editable != null && editable.length() != 0) {
            MentionSpanData[] mentionSpanDataArr = (MentionSpanData[]) editable.getSpans(0, editable.length(), MentionSpanData.class);
            Arrays.sort(mentionSpanDataArr, new AComparatorS504S0100000_5(editable, 5));
            return mentionSpanDataArr;
        }
        return new MentionSpanData[0];
    }

    public static String LJ(String str) {
        return new Regex("\\s").replace(str, "");
    }

    public static void LIZ(int i, Editable editable) {
        if (editable == null) {
            return;
        }
        String strLIZLLL = LIZLLL(i, editable);
        if (strLIZLLL == null || strLIZLLL.length() == 0) {
            strLIZLLL = "";
        }
        editable.delete(i - strLIZLLL.length(), i);
    }

    public static String LIZLLL(int i, Editable editable) {
        boolean z;
        if (editable != null && editable.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && i != 0) {
            C531650Kt9 it2 = C13LZ.LJIILJJIL(0, i).iterator();
            Object obj = null;
            while (it2.LLILLL) {
                Object next = it2.next();
                Character chLJLLJ = C13LN.LJLLJ(((Number) next).intValue(), editable);
                if (chLJLLJ != null && chLJLLJ.charValue() == '@') {
                    obj = next;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                int iIntValue = num.intValue();
                MentionSpanData[] mentionSpanDataArr = (MentionSpanData[]) editable.getSpans(iIntValue, i, MentionSpanData.class);
                if (mentionSpanDataArr != null && mentionSpanDataArr.length != 0) {
                    return null;
                }
                String string = editable.subSequence(iIntValue + 1, i).toString();
                if (a0.LJJIIZI(string, "  ", false) || a0.LJJIJ(string, '\n')) {
                    return null;
                }
                String string2 = a0.LJLIIIL(string).toString();
                if (string2.length() > 24) {
                    return null;
                }
                return string2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0105 A[PHI: r9
      0x0105: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:46:0x0103, B:43:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.profile.model.User r16, X.C21410318qb r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FMX.LIZIZ(com.ss.android.ugc.aweme.profile.model.User, X.18qb, boolean):boolean");
    }
}

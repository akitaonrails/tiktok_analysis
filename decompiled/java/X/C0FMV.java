package X;

import Y.AComparatorS504S0100000_5;
import android.text.Editable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.hashtag.HashtagSpanData;
import java.util.Arrays;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FMV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FMV {
    public static final /* synthetic */ int LIZ = 0;

    public static HashtagSpanData[] LIZIZ(Editable editable) {
        if (editable != null && editable.length() != 0) {
            HashtagSpanData[] hashtagSpanDataArr = (HashtagSpanData[]) editable.getSpans(0, editable.length(), HashtagSpanData.class);
            Arrays.sort(hashtagSpanDataArr, new AComparatorS504S0100000_5(editable, 2));
            return hashtagSpanDataArr;
        }
        return new HashtagSpanData[0];
    }

    public static String LIZ(int i, Editable editable) {
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
                if (editable.charAt(((Number) next).intValue()) == '#') {
                    obj = next;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                int iIntValue = num.intValue();
                HashtagSpanData[] hashtagSpanDataArr = (HashtagSpanData[]) editable.getSpans(iIntValue, i, HashtagSpanData.class);
                if (hashtagSpanDataArr != null && hashtagSpanDataArr.length != 0) {
                    return null;
                }
                String string = editable.subSequence(iIntValue + 1, i).toString();
                if (a0.LJJIIZI(string, " ", false) || a0.LJJIJ(string, '\n')) {
                    return null;
                }
                return a0.LJLIIIL(string).toString();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.util.List r13, java.util.List r14, android.widget.EditText r15) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FMV.LIZJ(java.util.List, java.util.List, android.widget.EditText):void");
    }
}

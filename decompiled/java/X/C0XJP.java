package X;

import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0XJP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJP {
    public static int LIZ(String str, String str2) {
        if (str == null) {
            return -1;
        }
        Sequence sequenceFindAll$default = Regex.findAll$default(new Regex(str2), str, 0, 2, null);
        if (!sequenceFindAll$default.iterator().hasNext()) {
            return -1;
        }
        return ((MatchResult) C09RB.LJIIZILJ(sequenceFindAll$default)).LIZIZ().LL;
    }
}

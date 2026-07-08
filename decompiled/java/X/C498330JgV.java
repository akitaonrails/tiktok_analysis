package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0JgV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498330JgV {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(long j) {
        if (j < 0) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        if (j < 10000) {
            return String.valueOf(C19374310qz.LIZ(Long.valueOf(j), new C19348710mr(null, null, null, 15), null, 0, 28));
        }
        return String.valueOf(C19374310qz.LIZ(Long.valueOf(j), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28));
    }
}

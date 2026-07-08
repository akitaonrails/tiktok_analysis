package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0lp2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372580lp2 {
    public static final C1372580lp2 LIZ = new C1372580lp2();

    public static final String LIZ(long j) {
        if (C0BTW.LIZ()) {
            if (j < 0) {
                return CardStruct.IStatusCode.DEFAULT;
            }
            if (j < 10000) {
                return String.valueOf(C19374310qz.LIZ(Long.valueOf(j), new C19348710mr(null, null, null, 15), null, 0, 28));
            }
            return String.valueOf(C19374310qz.LIZ(Long.valueOf(j), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28));
        }
        return C1843500y4a.LIZIZ(j);
    }
}

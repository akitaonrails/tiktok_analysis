package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0low, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372520low {
    public static final C1372520low LIZ = new C1372520low();

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

    public static final String LIZIZ(Aweme aweme, long j) {
        if (C0BTW.LIZ()) {
            if (j < 0) {
                return CardStruct.IStatusCode.DEFAULT;
            }
            if (aweme != null && !C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
                return String.valueOf(C19374310qz.LIZ(Long.valueOf(j), null, null, 0, 30));
            }
            return LIZ(j);
        }
        return C1843500y4a.LIZIZ(j);
    }
}

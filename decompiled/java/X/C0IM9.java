package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0IM9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IM9 {
    public static final long LIZ(C0IMA c0ima) {
        Long l = c0ima.LIZIZ;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static final String LIZIZ(C0IMA c0ima) {
        Long l = c0ima.LIZIZ;
        if (l == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return l.toString();
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0C7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308560C7q {
    public static int LIZ(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0;
    }

    public static String LIZIZ(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}

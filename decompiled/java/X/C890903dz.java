package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03dz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C890903dz {
    public static final Boolean LIZ(String str) {
        if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return Boolean.FALSE;
        }
        if (Intrinsics.LJFF(str, "1")) {
            return Boolean.TRUE;
        }
        return null;
    }
}

package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PhY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651860PhY {
    public final C651880Pha LIZ;

    public C651860PhY(DynamicPatch dynamicPatch) {
        this.LIZ = new C651880Pha(dynamicPatch.schema);
    }

    public final boolean LIZ(String str, String str2) {
        C651880Pha c651880Pha = this.LIZ;
        if (Intrinsics.LJFF(c651880Pha.LIZIZ(), str) && Intrinsics.LJFF(c651880Pha.LIZ(), str2)) {
            return true;
        }
        return false;
    }
}

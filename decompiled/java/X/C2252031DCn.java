package X;

import com.ss.android.ugc.aweme.utils.RecommendConsumeParams;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DCn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252031DCn {
    public static int LIZIZ;
    public static int LIZJ;
    public static long LIZLLL;
    public static final C2252031DCn LIZ = new C2252031DCn();
    public static RecommendConsumeParams LJ = new RecommendConsumeParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    public static final ArrayList<String> LJFF = new ArrayList<>();

    public final synchronized long LIZLLL() {
        return LIZLLL;
    }

    public final synchronized void LIZ(long j) {
        LIZLLL += j;
    }

    public final synchronized int LIZIZ(boolean z) {
        if (z) {
            LIZJ++;
        }
        return LIZJ;
    }

    public final synchronized int LIZJ(boolean z) {
        if (z) {
            LIZIZ++;
        }
        return LIZIZ;
    }

    public static int LJ(Boolean bool, Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return (Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0) | (iIntValue << 1);
    }
}

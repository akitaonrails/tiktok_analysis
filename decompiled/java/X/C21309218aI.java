package X;

import com.ss.android.ugc.aweme.benchmark.BenchmarkInitRequest;

/* JADX INFO: renamed from: X.18aI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21309218aI {
    public static BenchmarkInitRequest.AnonymousClass1 LIZ;

    public static boolean LIZ(String str) {
        BenchmarkInitRequest.AnonymousClass1 anonymousClass1 = LIZ;
        if (anonymousClass1 == null || anonymousClass1.isHitSample(str, 0.01f)) {
            return true;
        }
        return false;
    }
}

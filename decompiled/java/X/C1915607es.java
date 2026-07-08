package X;

import com.ss.android.ugc.aweme.im.perf.fmp.IMMessageListFMPTrackerImpl;

/* JADX INFO: renamed from: X.07es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1915607es extends IMMessageListFMPTrackerImpl.FMPResult {
    public static final C1915607es INSTANCE = new C1915607es();

    public C1915607es() {
        super(null, C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), false);
    }

    public String toString() {
        return "FMPResult.Invalid";
    }

    private final Object readResolve() {
        return INSTANCE;
    }
}

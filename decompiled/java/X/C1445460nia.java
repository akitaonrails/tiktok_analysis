package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;

/* JADX INFO: renamed from: X.0nia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1445460nia {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AVPublishContentType.values().length];
        try {
            iArr[AVPublishContentType.Video.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AVPublishContentType.PhotoMovie.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}

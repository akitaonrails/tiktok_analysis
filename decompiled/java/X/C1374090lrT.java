package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;

/* JADX INFO: renamed from: X.0lrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public /* synthetic */ class C1374090lrT {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ShareContentType.values().length];
        try {
            iArr[ShareContentType.LINK_PLUS_PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[ShareContentType.LINK_PLUS_VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[ShareContentType.PHOTO.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[ShareContentType.VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[ShareContentType.LINK.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}

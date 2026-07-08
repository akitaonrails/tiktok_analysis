package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;

/* JADX INFO: renamed from: X.0msi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1413300msi {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[LivePhotoPreviewMode.values().length];
        try {
            iArr[LivePhotoPreviewMode.STATIC.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[LivePhotoPreviewMode.LIVE_PHOTO.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}

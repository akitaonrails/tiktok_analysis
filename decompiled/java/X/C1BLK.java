package X;

import com.ss.android.ugc.aweme.setting.services.StorageServiceImpl;

/* JADX INFO: renamed from: X.1BLK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLK {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(long j) {
        int i;
        C844470XAv.LIZ.getClass();
        long jLJ = C09N1.LJ(C844470XAv.LIZ());
        long jLIZ = StorageServiceImpl.LIZLLL().LIZ();
        if (j != ((long) 0) * 1048576 && j <= ((long) 1) * 1048576) {
            i = 200;
        } else {
            i = 500;
        }
        if (jLJ + jLIZ <= ((long) i) * 1048576) {
            return false;
        }
        return true;
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.BeatTrackingData;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.MusicSyncResult;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.SamiChorusRes;

/* JADX INFO: renamed from: X.14Lh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20249914Lh {
    public static final C20249914Lh LIZ = new C20249914Lh();
    public static final Gson LIZIZ = C7740030o.LIZ().getGson();

    public static BeatTrackingData LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                return (BeatTrackingData) LIZIZ.LJII(str, BeatTrackingData.class);
            }
            C0VSF c0vsf = new C0VSF(c0vsj);
            try {
                String strLIZJ = C08KC.LIZJ(c0vsf);
                C2107108Nh.LIZ(c0vsf, null);
                if (strLIZJ.length() == 0) {
                    return null;
                }
                try {
                    return (BeatTrackingData) LIZIZ.LJII(strLIZJ, BeatTrackingData.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Gson gson = LIZIZ;
                    return (BeatTrackingData) gson.LJII((String) gson.LJII(strLIZJ, String.class), BeatTrackingData.class);
                }
            } finally {
                th = th;
                try {
                } catch (Throwable th) {
                    while (true) {
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static SamiChorusRes LIZIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                return null;
            }
            C0VSF c0vsf = new C0VSF(c0vsj);
            try {
                String strLIZJ = C08KC.LIZJ(c0vsf);
                C2107108Nh.LIZ(c0vsf, null);
                if (strLIZJ.length() == 0) {
                    return null;
                }
                try {
                    return (SamiChorusRes) LIZIZ.LJII(strLIZJ, SamiChorusRes.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Gson gson = LIZIZ;
                    return (SamiChorusRes) gson.LJII((String) gson.LJII(strLIZJ, String.class), SamiChorusRes.class);
                }
            } finally {
                th = th;
                try {
                    try {
                    } catch (Throwable th) {
                        while (true) {
                        }
                    }
                } catch (Throwable th2) {
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static MusicSyncResult LIZJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                return (MusicSyncResult) LIZIZ.LJII(str, MusicSyncResult.class);
            }
            C0VSF c0vsf = new C0VSF(c0vsj);
            try {
                String strLIZJ = C08KC.LIZJ(c0vsf);
                C2107108Nh.LIZ(c0vsf, null);
                if (strLIZJ.length() == 0) {
                    return null;
                }
                try {
                    return (MusicSyncResult) LIZIZ.LJII(strLIZJ, MusicSyncResult.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Gson gson = LIZIZ;
                    return (MusicSyncResult) gson.LJII((String) gson.LJII(strLIZJ, String.class), MusicSyncResult.class);
                }
            } finally {
                th = th;
                try {
                } catch (Throwable th) {
                    while (true) {
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}

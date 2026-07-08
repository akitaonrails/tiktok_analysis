package X;

import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.UUID;

/* JADX INFO: renamed from: X.0uJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1699240uJu {
    public static final UUID LIZ = new UUID(-1301668207276963122L, -6645017420763422227L);
    public static boolean LIZIZ = false;
    public static String LIZJ = null;
    public static boolean LIZLLL = false;

    public static boolean LIZ() throws Throwable {
        MediaDrm mediaDrm;
        MediaDrm mediaDrm2 = null;
        try {
            try {
                try {
                    if (!LIZLLL) {
                        LIZLLL = true;
                        mediaDrm = new MediaDrm(LIZ);
                        try {
                            String propertyString = mediaDrm.getPropertyString("securityLevel");
                            LIZJ = propertyString;
                            LIZIZ = TextUtils.isEmpty(propertyString) ? false : true;
                            mediaDrm2 = mediaDrm;
                        } catch (UnsupportedSchemeException e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            if (mediaDrm != null) {
                                try {
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        mediaDrm.close();
                                        return false;
                                    }
                                    mediaDrm.release();
                                    return false;
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    return false;
                                }
                            }
                            return false;
                        } catch (Exception e3) {
                            e = e3;
                            TryCatchGuardChecker.doCheck(e);
                            try {
                                if (Class.forName("android.media.MediaDrmResetException").isInstance(e)) {
                                    if (mediaDrm != null) {
                                        try {
                                            if (Build.VERSION.SDK_INT >= 28) {
                                                mediaDrm.close();
                                                return false;
                                            }
                                            mediaDrm.release();
                                            return false;
                                        } catch (Exception e4) {
                                            TryCatchGuardChecker.doCheck(e4);
                                            return false;
                                        }
                                    }
                                    return false;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            if (e instanceof MediaDrm.MediaDrmStateException) {
                                if (mediaDrm != null) {
                                    try {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            mediaDrm.close();
                                            return false;
                                        }
                                        mediaDrm.release();
                                        return false;
                                    } catch (Exception e5) {
                                        TryCatchGuardChecker.doCheck(e5);
                                        return false;
                                    }
                                }
                                return false;
                            }
                            if (mediaDrm != null) {
                                try {
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        mediaDrm.close();
                                        return false;
                                    }
                                    mediaDrm.release();
                                    return false;
                                } catch (Exception e6) {
                                    TryCatchGuardChecker.doCheck(e6);
                                    return false;
                                }
                            }
                            return false;
                        }
                    }
                    boolean z = LIZIZ;
                    if (mediaDrm2 != null) {
                        try {
                            if (Build.VERSION.SDK_INT >= 28) {
                                mediaDrm2.close();
                                return z;
                            }
                            mediaDrm2.release();
                            return z;
                        } catch (Exception e7) {
                            TryCatchGuardChecker.doCheck(e7);
                        }
                    }
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    mediaDrm2 = mediaDrm;
                    TryCatchGuardChecker.doCheck(th);
                    if (mediaDrm2 != null) {
                        try {
                            if (Build.VERSION.SDK_INT >= 28) {
                                mediaDrm2.close();
                                throw th;
                            }
                            mediaDrm2.release();
                            throw th;
                        } catch (Exception e8) {
                            TryCatchGuardChecker.doCheck(e8);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (UnsupportedSchemeException e9) {
                e = e9;
                mediaDrm = mediaDrm2;
            } catch (Exception e10) {
                e = e10;
                mediaDrm = mediaDrm2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}

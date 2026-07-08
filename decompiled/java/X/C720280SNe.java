package X;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.experiment.CommentPhotoQualityOptimizationV2;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0SNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720280SNe {
    public static final C720280SNe LIZ = new C720280SNe();
    public static final AtomicInteger LIZIZ = new AtomicInteger(0);
    public static final AtomicInteger LIZJ = new AtomicInteger(0);
    public static volatile boolean LIZLLL;

    public static void LIZIZ() {
        if (LIZIZ.incrementAndGet() >= 2) {
            LIZLLL = true;
        }
    }

    public static void LIZ(C1331670kl3 c1331670kl3, float f) {
        final EnumC720130SMp enumC720130SMp;
        if (LIZLLL) {
            return;
        }
        try {
            if (f == 1.1f) {
                enumC720130SMp = EnumC720130SMp.TYPE_1_1;
            } else if (f != 1.2f) {
                if (f == 1.3f) {
                    enumC720130SMp = EnumC720130SMp.TYPE_1_3;
                } else if (f == 1.4f) {
                    enumC720130SMp = EnumC720130SMp.TYPE_1_4;
                } else if (f == 1.5f) {
                    enumC720130SMp = EnumC720130SMp.TYPE_1_5;
                } else if (f == 2.0f) {
                    enumC720130SMp = EnumC720130SMp.TYPE_2;
                } else {
                    enumC720130SMp = EnumC720130SMp.TYPE_1_1;
                }
            } else {
                enumC720130SMp = EnumC720130SMp.TYPE_1_2;
            }
            final C1331570kkt c1331570kkt = new C1331570kkt(enumC720130SMp);
            c1331670kl3.LJJIJIL(new InterfaceC1331800klG(enumC720130SMp, c1331570kkt) { // from class: X.0klH
                public final EnumC720130SMp LIZ;
                public final C1331570kkt LIZIZ;

                @Override // X.InterfaceC1331800klG
                public final String getKey() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CommentSR_");
                    sbLIZ.append(this.LIZ.name());
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = enumC720130SMp;
                    this.LIZIZ = c1331570kkt;
                }

                public static void LIZJ(int i, long j) {
                    if (i > 0 && SystemClock.elapsedRealtime() - j > i) {
                        C720280SNe.LIZ.getClass();
                        if (C720280SNe.LIZJ.incrementAndGet() >= 2) {
                            C720280SNe.LIZLLL = true;
                        }
                    }
                }

                @Override // X.InterfaceC1331800klG
                public final InterfaceC1332090klj LIZIZ(Bitmap bitmap, C0I7N c0i7n) {
                    int iIntValue;
                    long jElapsedRealtime;
                    Integer num;
                    C720280SNe.LIZ.getClass();
                    CommentPhotoQualityOptimizationV2.CommentPhotoQualityOptV2Config commentPhotoQualityOptV2ConfigLIZ = CommentPhotoQualityOptimizationV2.LIZ();
                    try {
                        try {
                            if (commentPhotoQualityOptV2ConfigLIZ != null && (num = commentPhotoQualityOptV2ConfigLIZ.srSlowThresholdMs) != null) {
                                iIntValue = num.intValue();
                                if (iIntValue > 0) {
                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                }
                                this.LIZIZ.getClass();
                                LIZJ(iIntValue, jElapsedRealtime);
                                return null;
                            }
                            iIntValue = 0;
                            this.LIZIZ.getClass();
                            LIZJ(iIntValue, jElapsedRealtime);
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C720280SNe.LIZ.getClass();
                            C720280SNe.LIZIZ();
                            C1331870klN c1331870klNLIZIZ = ((C1331760klC) c0i7n).LIZIZ(bitmap);
                            LIZJ(iIntValue, jElapsedRealtime);
                            return c1331870klNLIZIZ;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        LIZJ(iIntValue, jElapsedRealtime);
                        throw th;
                    }
                    jElapsedRealtime = 0;
                }

                @Override // X.InterfaceC1331800klG
                public final InterfaceC1332090klj LIZ(Bitmap bitmap, C0I7N c0i7n, Map<String, String> map) {
                    int iIntValue;
                    long jElapsedRealtime;
                    Integer num;
                    C720280SNe.LIZ.getClass();
                    CommentPhotoQualityOptimizationV2.CommentPhotoQualityOptV2Config commentPhotoQualityOptV2ConfigLIZ = CommentPhotoQualityOptimizationV2.LIZ();
                    try {
                        try {
                            if (commentPhotoQualityOptV2ConfigLIZ != null && (num = commentPhotoQualityOptV2ConfigLIZ.srSlowThresholdMs) != null) {
                                iIntValue = num.intValue();
                                if (iIntValue > 0) {
                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                }
                                InterfaceC1332090klj interfaceC1332090kljLIZ = this.LIZIZ.LIZ(bitmap, c0i7n, map);
                                LIZJ(iIntValue, jElapsedRealtime);
                                return interfaceC1332090kljLIZ;
                            }
                            iIntValue = 0;
                            InterfaceC1332090klj interfaceC1332090kljLIZ2 = this.LIZIZ.LIZ(bitmap, c0i7n, map);
                            LIZJ(iIntValue, jElapsedRealtime);
                            return interfaceC1332090kljLIZ2;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C720280SNe.LIZ.getClass();
                            C720280SNe.LIZIZ();
                            C1331870klN c1331870klNLIZIZ = ((C1331760klC) c0i7n).LIZIZ(bitmap);
                            LIZJ(iIntValue, jElapsedRealtime);
                            return c1331870klNLIZIZ;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        LIZJ(iIntValue, jElapsedRealtime);
                        throw th;
                    }
                    jElapsedRealtime = 0;
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ();
        } catch (LinkageError e2) {
            TryCatchGuardChecker.doCheck(e2);
            LIZIZ();
        }
    }
}

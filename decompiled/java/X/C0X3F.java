package X;

import android.os.Build;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.JatoXLConfig;
import com.bytedance.common.jato.memory.gcblocker.GcBlocker;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0X3F, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X3F {
    public static volatile C0X3I LIZ;

    public static C0X3I LIZ() {
        if (LIZ == null) {
            synchronized (C0X3F.class) {
                try {
                    if (LIZ == null) {
                        if (new C0VSJ("/data/local/tmp/disable-gcblocker").exists() || DeviceInfoUtils.LIZLLL() || DeviceInfoUtils.LJ() || JatoXL.getConfig() == null || !C2104908Ml.LIZIZ()) {
                            LIZ = new C0X3I() { // from class: X.0X3G
                                @Override // X.C0X3I
                                public final void LIZ(long j) {
                                }

                                @Override // X.C0X3I
                                public final void LIZIZ(int i, boolean z) {
                                }

                                @Override // X.C0X3I
                                public final void LIZJ(int i) {
                                }

                                @Override // X.C0X3I
                                public final void LIZLLL(String str) {
                                }

                                @Override // X.C0X3I
                                public final void LJ(String str) {
                                }
                            };
                        } else {
                            if (JatoXL.getConfig().isEnabledDalvikGcBlocker()) {
                                DeviceInfoUtils.LIZJ();
                            }
                            if (!JatoXL.getConfig().isEnabledArtGcBlocker() || Build.VERSION.SDK_INT < 24) {
                                LIZ = new C0X3I() { // from class: X.0X3G
                                    @Override // X.C0X3I
                                    public final void LIZ(long j) {
                                    }

                                    @Override // X.C0X3I
                                    public final void LIZIZ(int i, boolean z) {
                                    }

                                    @Override // X.C0X3I
                                    public final void LIZJ(int i) {
                                    }

                                    @Override // X.C0X3I
                                    public final void LIZLLL(String str) {
                                    }

                                    @Override // X.C0X3I
                                    public final void LJ(String str) {
                                    }
                                };
                            } else {
                                JatoXLConfig config = JatoXL.getConfig();
                                LIZ = new GcBlocker(config.getMaxGcBlockTimeout(), config.isLargeHeapApp(), config.getGcHeapLimit(), config.getIsSupportApex());
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}

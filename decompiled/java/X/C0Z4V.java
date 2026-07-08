package X;

import android.os.SystemClock;
import android.util.SparseIntArray;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.setting.IMUserPortraitDowngradeConfig;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0Z4V, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z4V {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C0Z4U LIZ;
    public final C0Z4X LIZIZ;
    public final C0Z4W LIZJ;

    public C0Z4V() {
        this(0);
    }

    public final void LJI() {
        this.LIZIZ.LIZIZ = true;
    }

    public C0Z4V(int i) {
        this.LIZ = new C0Z4U() { // from class: X.0Z4S
            public final Keva LIZ = KevaImpl.getRepo("reduce_pull_message_repo", 0);
            public final boolean LIZIZ;
            public final int[] LIZJ;

            @Override // X.C0Z4U
            public final boolean LIZLLL() {
                return (((Number) C287660BPg.LIZ.getValue()).intValue() & 1) != 0;
            }

            @Override // X.C0Z4U
            public final InterfaceC1493505sz LJ() {
                return C0I0B.LJFF.LIZIZ();
            }

            @Override // X.C0Z4U
            public final boolean LJI() {
                IIMUserPortraitManager iIMUserPortraitManager = (IIMUserPortraitManager) PluggableExtentionKt.pluggableSpiForReal(IIMUserPortraitManager.class);
                return iIMUserPortraitManager != null && iIMUserPortraitManager.LJIIIZ();
            }

            {
                C0I0B.LJFF.LIZJ();
                this.LIZIZ = C824390WVp.LIZJ(C894660Z7w.LIZ());
                this.LIZJ = C0YJ6.LIZ();
            }

            @Override // X.C0Z4U
            public final boolean LIZJ() {
                return ((Boolean) C0Z5L.LIZ().LIZ.getValue()).booleanValue();
            }

            @Override // X.C0Z4U
            public final boolean LJFF() {
                return (C300740Bqa.LIZ() & 1) != 0;
            }

            @Override // X.C0Z4U
            public final Keva LIZ() {
                return this.LIZ;
            }

            @Override // X.C0Z4U
            public final boolean LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.C0Z4U
            public final int[] LJII() {
                return this.LIZJ;
            }
        };
        this.LIZIZ = new C0Z4X();
        this.LIZJ = new C0Z4W(this);
    }

    public final long LIZ(int i) {
        long jLongValue;
        synchronized (this.LIZIZ) {
            try {
                if (i == -2) {
                    jLongValue = LJFF(this.LIZIZ.LJ);
                } else {
                    Long lLIZLLL = this.LIZIZ.LJ.LIZLLL(i);
                    if (lLIZLLL != null) {
                        jLongValue = lLIZLLL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jLongValue;
    }

    public final long LIZIZ(int i) {
        long jLongValue;
        synchronized (this.LIZIZ) {
            try {
                if (i == -2) {
                    jLongValue = LJFF(this.LIZIZ.LIZLLL);
                } else {
                    Long lLIZLLL = this.LIZIZ.LIZLLL.LIZLLL(i);
                    if (lLIZLLL != null) {
                        jLongValue = lLIZLLL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jLongValue;
    }

    public final long LJFF(C1119470fEn<Long> c1119470fEn) {
        long jLongValue;
        long jLongValue2;
        int[] iArrLJII = this.LIZ.LJII();
        int i = 1;
        if (iArrLJII.length == 0) {
            throw new NoSuchElementException();
        }
        Long lLIZLLL = c1119470fEn.LIZLLL(iArrLJII[0]);
        if (lLIZLLL != null) {
            jLongValue = lLIZLLL.longValue();
        } else {
            jLongValue = 0;
        }
        int length = iArrLJII.length - 1;
        if (1 <= length) {
            while (true) {
                Long lLIZLLL2 = c1119470fEn.LIZLLL(iArrLJII[i]);
                if (lLIZLLL2 != null) {
                    jLongValue2 = lLIZLLL2.longValue();
                } else {
                    jLongValue2 = 0;
                }
                if (jLongValue > jLongValue2) {
                    jLongValue = jLongValue2;
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return jLongValue;
    }

    public final void LJII(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.LIZIZ) {
            try {
                if (i == -2) {
                    for (int i2 : this.LIZ.LJII()) {
                        this.LIZIZ.LIZLLL.LJFF(i2, Long.valueOf(jCurrentTimeMillis));
                    }
                } else {
                    this.LIZIZ.LIZLLL.LJFF(i, Long.valueOf(jCurrentTimeMillis));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LIZJ(int i, int i2) {
        if (!this.LIZ.LJFF()) {
            return false;
        }
        long jLIZIZ = LIZIZ(i);
        long jLIZ = LIZ(i);
        int i3 = C0Z5L.LIZ().minPullMsgInterval;
        int i4 = C0Z5L.LIZ().minPullMsgSuccessInterval;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jLIZIZ >= i3 && jCurrentTimeMillis - jLIZ >= i4) {
            return false;
        }
        LJ(i, i2, "downgrade");
        return true;
    }

    public final boolean LIZLLL(int i, int i2) {
        if (!this.LIZ.LIZLLL() || !this.LIZ.LJI()) {
            return false;
        }
        long jLIZIZ = LIZIZ(i);
        long jLIZ = LIZ(i);
        C01GW c01gw = C0Z5N.LIZIZ;
        int i3 = ((IMUserPortraitDowngradeConfig) c01gw.getValue()).minPullMsgInterval;
        int i4 = ((IMUserPortraitDowngradeConfig) c01gw.getValue()).minPullMsgSuccessInterval;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jLIZIZ >= i3 && jCurrentTimeMillis - jLIZ >= i4) {
            return false;
        }
        LJ(i, i2, "user_portrait_downgrade");
        return true;
    }

    public final void LJIIIIZZ(int i, int i2) {
        SparseIntArray sparseIntArray = this.LIZJ.LIZ;
        sparseIntArray.put(i, sparseIntArray.get(i) + 1);
        this.LIZJ.LIZIZ.put(i, i2);
        this.LIZJ.LIZJ.put(i, SystemClock.uptimeMillis());
    }

    public final void LJ(int i, int i2, String str) {
        if (i == -2) {
            for (int i3 : this.LIZ.LJII()) {
                this.LIZJ.LIZ(i3, i2, str, null);
            }
            return;
        }
        this.LIZJ.LIZ(i, i2, str, null);
    }
}

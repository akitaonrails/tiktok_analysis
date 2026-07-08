package X;

import Y.AComparatorS32S0000000_13;
import Y.AComparatorS512S0100000_13;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.account.otl.OneTapLoginShareInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.ISOTLBlobReaderConfigService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AwS9S0110100_13;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845590XFd {
    public static final C845590XFd LIZ = new C845590XFd();
    public static final C2252321DDq LIZIZ;
    public static final AnonymousClass0951 LIZJ;
    public static final AtomicBoolean LIZLLL;
    public static final AtomicBoolean LJ;
    public static volatile C845600XFe LJFF;
    public static volatile C845600XFe LJI;
    public static volatile long LJII;

    static {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C845680XFm.LIZ);
        LIZIZ = c2252321DDqLIZ;
        LIZJ = C09IC.LIZIZ(c2252321DDqLIZ);
        LIZLLL = new AtomicBoolean(false);
        LJ = new AtomicBoolean(false);
    }

    public static void LIZJ(String str) {
        if (str.length() == 0 || C845580XFc.LIZJ(str)) {
            return;
        }
        try {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LIZLLL("SOTLTokenRepository");
            c1331670kl3LJIIIZ.LJJIII();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static AbstractC845670XFl LIZLLL(C0XFZ c0xfz) {
        boolean z;
        boolean z2;
        boolean z3;
        if (c0xfz instanceof C0XFX) {
            OneTapLoginShareInfo oneTapLoginShareInfo = ((C0XFX) c0xfz).LIZ;
            if (C845580XFc.LIZLLL(oneTapLoginShareInfo)) {
                LIZJ(oneTapLoginShareInfo.avatarUrl);
                return new C845650XFj(oneTapLoginShareInfo);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SingleAccountAppResult token invalid: userId=");
            boolean z4 = true;
            if (oneTapLoginShareInfo.userId.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(", idToken=");
            if (oneTapLoginShareInfo.idToken.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ.append(z2);
            sbLIZ.append(", deviceSecret=");
            if (oneTapLoginShareInfo.deviceSecret.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            sbLIZ.append(z3);
            sbLIZ.append(", username=");
            if (oneTapLoginShareInfo.username.length() <= 0) {
                z4 = false;
            }
            sbLIZ.append(z4);
            C2188811AlT.LIZIZ(sbLIZ);
            return C845700XFo.LIZ;
        }
        if (c0xfz instanceof C0XFY) {
            List<OneTapLoginShareInfo> list = ((C0XFY) c0xfz).LIZ;
            ArrayList arrayList = new ArrayList();
            for (OneTapLoginShareInfo oneTapLoginShareInfo2 : list) {
                if (C845580XFc.LIZLLL(oneTapLoginShareInfo2)) {
                    arrayList.add(oneTapLoginShareInfo2);
                }
            }
            OneTapLoginShareInfo oneTapLoginShareInfo3 = (OneTapLoginShareInfo) C13LP.LJJJLL(C13LP.LJLLLL(new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(9), 0), arrayList));
            if (oneTapLoginShareInfo3 != null) {
                LIZJ(oneTapLoginShareInfo3.avatarUrl);
                return new C845650XFj(oneTapLoginShareInfo3);
            }
            return C845700XFo.LIZ;
        }
        return C845700XFo.LIZ;
    }

    public static void LIZ(Context context, boolean z) {
        EnumC845610XFf enumC845610XFf;
        boolean z2;
        C2252321DDq c2252321DDq = LIZIZ;
        if (!(c2252321DDq.getValue() instanceof C845680XFm) && !z) {
            return;
        }
        c2252321DDq.setValue(C845690XFn.LIZ);
        LIZLLL.set(false);
        LJ.set(false);
        LJFF = null;
        LJI = null;
        if (z) {
            enumC845610XFf = EnumC845610XFf.FORCE_REFRESH;
        } else {
            enumC845610XFf = EnumC845610XFf.STARTUP;
        }
        IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
        if (iAccountLoginMethodsService != null && iAccountLoginMethodsService.LJIIJ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            C0XFT.LIZ(context, null, null, true, 20000L, false, null, C0WQK.LIZ, new AwS9S0110100_13(jUptimeMillis, enumC845610XFf, z2, 0), 102);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ(new C845560XFa(C0XFN.INTERNAL_ERROR, 0, null, "", "", null, 38), EnumC845640XFi.PROVIDER, jUptimeMillis, z2, enumC845610XFf);
        }
        if (z2) {
            try {
                final ISOTLBlobReaderConfigService iSOTLBlobReaderConfigService = (ISOTLBlobReaderConfigService) PluggableExtentionKt.pluggableSpi$default(ISOTLBlobReaderConfigService.class, false, false, false, 14, null);
                if (iSOTLBlobReaderConfigService != null) {
                    C0XFI.LIZJ = new C0XFJ() { // from class: X.0XFk
                        @Override // X.C0XFJ
                        public final C845830XGb LIZ(Map map) {
                            return iSOTLBlobReaderConfigService.executeGet("/passport/sotl/blobstore/get/", map);
                        }

                        @Override // X.C0XFJ
                        public final Pair<Boolean, String> getGaid(Context context2) {
                            return iSOTLBlobReaderConfigService.getGaid(context2);
                        }

                        @Override // X.C0XFJ
                        public final void sendEvent(String str, JSONObject jSONObject) {
                            iSOTLBlobReaderConfigService.sendEvent(str, jSONObject);
                        }
                    };
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0WQK.LIZ), null, null, new C0XFM(false, "", "", new AwS9S0110100_13(jUptimeMillis, enumC845610XFf, z2, 1), context, null), 3);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                LIZIZ(new C845560XFa(C0XFN.BLOB_UNKNOWN_ERROR, 0, null, "", "", null, 38), EnumC845640XFi.BLOB, jUptimeMillis, true, enumC845610XFf);
            }
        }
    }

    public static void LJFF(long j, EnumC845610XFf enumC845610XFf, boolean z) {
        C845600XFe c845600XFe = LJI;
        if (c845600XFe == null) {
            return;
        }
        if (z) {
            C845600XFe c845600XFe2 = LJFF;
            if (c845600XFe2 == null) {
                return;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C845620XFg(c845600XFe, c845600XFe2, enumC845610XFf, j, null), 3);
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C845630XFh(c845600XFe, enumC845610XFf, j, null), 3);
    }

    public static Long LJ(int i, int i2, long j, long j2) {
        if (i == 0) {
            if (i2 == 0) {
                if (j > j2) {
                    j = j2;
                }
                return Long.valueOf(j);
            }
            return Long.valueOf(j);
        }
        if (i2 == 0) {
            return Long.valueOf(j2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C0XFZ r10, X.EnumC845640XFi r11, long r12, boolean r14, X.EnumC845610XFf r15) {
        /*
            r0 = -1
            r8 = 0
            r4 = 0
            if (r14 != 0) goto L34
            long r6 = android.os.SystemClock.uptimeMillis()
            X.0XFe r5 = new X.0XFe
            long r2 = r6 - r12
            r5.<init>(r2, r10)
            X.C845590XFd.LJI = r5
            X.0XFf r2 = X.EnumC845610XFf.STARTUP
            if (r15 != r2) goto L24
            long r1 = X.C845590XFd.LJII
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L31
            long r6 = r6 - r1
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L31
            r0 = r6
        L24:
            LJFF(r0, r15, r4)
            X.0XFl r1 = LIZLLL(r10)
            X.1DDq r0 = X.C845590XFd.LIZIZ
            r0.setValue(r1)
            return
        L31:
            r0 = 0
            goto L24
        L34:
            long r6 = android.os.SystemClock.uptimeMillis()
            X.0XFe r5 = new X.0XFe
            long r2 = r6 - r12
            r5.<init>(r2, r10)
            X.0XFi r2 = X.EnumC845640XFi.BLOB
            if (r11 != r2) goto L65
            X.C845590XFd.LJFF = r5
        L45:
            X.0XFf r2 = X.EnumC845610XFf.STARTUP
            if (r15 != r2) goto L55
            long r1 = X.C845590XFd.LJII
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L62
            long r6 = r6 - r1
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L62
            r0 = r6
        L55:
            r3 = 1
            LJFF(r0, r15, r3)
            java.util.concurrent.atomic.AtomicBoolean r2 = X.C845590XFd.LIZLLL
            boolean r0 = r2.get()
            if (r0 == 0) goto L68
            return
        L62:
            r0 = 0
            goto L55
        L65:
            X.C845590XFd.LJI = r5
            goto L45
        L68:
            boolean r0 = r10 instanceof X.C0XFX
            if (r0 != 0) goto L81
            boolean r0 = r10 instanceof X.C0XFY
            if (r0 != 0) goto L81
            boolean r0 = r10 instanceof X.C845560XFa
            if (r0 == 0) goto L91
            r0 = r10
            X.0XFa r0 = (X.C845560XFa) r0
            X.0XFN r1 = r0.LIZ
            X.0XFN r0 = X.C0XFN.NO_AVAILABLE_TOKEN
            if (r1 == r0) goto L81
            X.0XFN r0 = X.C0XFN.NO_AVAILABLE_TT_INSTALLED
            if (r1 != r0) goto L91
        L81:
            boolean r0 = r2.compareAndSet(r4, r3)
            if (r0 == 0) goto L90
            X.0XFl r1 = LIZLLL(r10)
            X.1DDq r0 = X.C845590XFd.LIZIZ
            r0.setValue(r1)
        L90:
            return
        L91:
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C845590XFd.LJ
            boolean r0 = r0.compareAndSet(r4, r3)
            if (r0 != 0) goto L90
            X.0XFe r0 = X.C845590XFd.LJI
            if (r0 == 0) goto La2
            X.0XFZ r0 = r0.LIZIZ
            if (r0 == 0) goto La2
            r10 = r0
        La2:
            X.0XFl r1 = LIZLLL(r10)
            X.1DDq r0 = X.C845590XFd.LIZIZ
            r0.setValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C845590XFd.LIZIZ(X.0XFZ, X.0XFi, long, boolean, X.0XFf):void");
    }
}

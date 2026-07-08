package X;

import Y.ACallableS436S0100000_34;
import android.os.SystemClock;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218501BsG {
    public static final String LJJJ = UUID.randomUUID().toString();
    public static final C2218531BsJ LJJJI = new C2218531BsJ(0);
    public final EnumC1074240e3q LIZ;
    public final EnumC1995407rk LIZIZ;
    public final boolean LIZJ;
    public final MessageDigest LIZLLL;
    public final Function1<String, Unit> LJ;
    public final MessageDigest LJFF;
    public final Function1<String, Unit> LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public final int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public int LJJIJL;
    public boolean LJJIJLIJ;
    public String LJJIL;
    public final C01GW LJJIZ;

    public final void LIZ() {
        this.LJII = SystemClock.uptimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("begin: ");
        sbLIZ.append(SystemClock.uptimeMillis());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ() {
        this.LJIILL = SystemClock.uptimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("end: ");
        sbLIZ.append(this.LJIILL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LJJIJL != 0) {
            String strLJ = C08HM.LJ(this.LJFF.digest());
            long jUptimeMillis = SystemClock.uptimeMillis();
            C2218531BsJ c2218531BsJ = LJJJI;
            if ((!Intrinsics.LJFF(c2218531BsJ.LIZ.getFirst(), "")) & (!Intrinsics.LJFF(c2218531BsJ.LIZ.getFirst(), strLJ))) {
                c2218531BsJ.LIZIZ = jUptimeMillis - c2218531BsJ.LIZ.getSecond().longValue();
            }
            c2218531BsJ.LIZ = new Pair<>(strLJ, Long.valueOf(jUptimeMillis));
            Pair<String, Long> pair = c2218531BsJ.LIZJ.get(Integer.valueOf(this.LIZ.getValue()));
            if (pair != null && !Intrinsics.LJFF(pair.getFirst(), strLJ)) {
                c2218531BsJ.LIZLLL = jUptimeMillis - pair.getSecond().longValue();
            }
            c2218531BsJ.LIZJ.put(Integer.valueOf(this.LIZ.getValue()), new Pair<>(strLJ, Long.valueOf(jUptimeMillis)));
        }
        if (this.LJJIJIL != 0) {
            String strLJ2 = C08HM.LJ(this.LIZLLL.digest());
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            C2218531BsJ c2218531BsJ2 = LJJJI;
            if ((!Intrinsics.LJFF(c2218531BsJ2.LJ.getFirst(), "")) & (!Intrinsics.LJFF(c2218531BsJ2.LJ.getFirst(), strLJ2))) {
                c2218531BsJ2.LJFF = jUptimeMillis2 - c2218531BsJ2.LJ.getSecond().longValue();
            }
            c2218531BsJ2.LJ = new Pair<>(strLJ2, Long.valueOf(jUptimeMillis2));
            Pair<String, Long> pair2 = c2218531BsJ2.LJI.get(Integer.valueOf(this.LIZ.getValue()));
            if (pair2 != null && !Intrinsics.LJFF(pair2.getFirst(), strLJ2)) {
                c2218531BsJ2.LJII = jUptimeMillis2 - pair2.getSecond().longValue();
            }
            c2218531BsJ2.LJI.put(Integer.valueOf(this.LIZ.getValue()), new Pair<>(strLJ2, Long.valueOf(jUptimeMillis2)));
        }
        C15O7.LIZJ(new ACallableS436S0100000_34(this, 4));
    }

    public static Long LIZJ(long j) {
        if (j == -1) {
            return null;
        }
        return Long.valueOf(j);
    }

    public static Pair LIZLLL(Function0 function0) {
        return new Pair(function0.invoke(), Long.valueOf(SystemClock.uptimeMillis() - SystemClock.uptimeMillis()));
    }

    public static String LJ(Throwable th) {
        if (th instanceof C0XIR) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Server, code: ");
            C0XIR c0xir = (C0XIR) th;
            sbLIZ.append(c0xir.getErrorCode());
            sbLIZ.append(", msg: ");
            sbLIZ.append(c0xir.getErrorMsg());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (th instanceof C0XIP) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Local, code: ");
            sbLIZ2.append(((C23112093u) th).getErrorCode());
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (th instanceof C1494450ozb) {
            return "NetworkNotAvail";
        }
        if (th instanceof C1494430ozZ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("HttpResponseException, code: ");
            sbLIZ3.append(((C1494430ozZ) th).getStatusCode());
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (th instanceof C1499040p70) {
            return "CdnCacheVerifyException";
        }
        if (th instanceof C1494440oza) {
            return "ClientProtocolException";
        }
        if (th instanceof C1494460ozc) {
            return "OtherTTNException";
        }
        String message = th.getMessage();
        if (message != null) {
            return message;
        }
        return "monitor unknown exception";
    }

    public final <T> T LJFF(Function0<? extends T> function0) {
        Pair pairLIZLLL = LIZLLL(function0);
        T t = (T) pairLIZLLL.getFirst();
        long jLongValue = ((Number) pairLIZLLL.getSecond()).longValue();
        this.LJIILJJIL = jLongValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("construct cost: ");
        sbLIZ.append(jLongValue);
        C2188811AlT.LIZIZ(sbLIZ);
        return t;
    }

    public final <T> T LJI(Function0<? extends T> function0) {
        Pair pairLIZLLL = LIZLLL(function0);
        T t = (T) pairLIZLLL.getFirst();
        this.LJIIJJI = ((Number) pairLIZLLL.getSecond()).longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hash cost: ");
        sbLIZ.append(this.LJIIJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        return t;
    }

    public final <T extends List<?>> T LJII(Function0<? extends T> function0) {
        Pair pairLIZLLL = LIZLLL(function0);
        T t = (T) pairLIZLLL.getFirst();
        this.LJIIIIZZ = ((Number) pairLIZLLL.getSecond()).longValue();
        this.LJIILLIIL = t.size();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("read db cost: ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", count: ");
        sbLIZ.append(this.LJIILLIIL);
        C2188811AlT.LIZIZ(sbLIZ);
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC1364105Vn r13, X.C1074970e51 r14) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C1075090e5D
            if (r0 == 0) goto L24
            r6 = r13
            X.0e5D r6 = (X.C1075090e5D) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r4 = r6.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            java.lang.String r5 = "api cost: "
            r2 = 1
            if (r0 == 0) goto L38
            if (r0 != r2) goto L30
            long r0 = r6.LL
            goto L2a
        L24:
            X.0e5D r6 = new X.0e5D
            r6.<init>(r12, r13)
            goto L12
        L2a:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L2e
            goto L4a
        L2e:
            r3 = move-exception
            goto L60
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r4)
            long r0 = android.os.SystemClock.uptimeMillis()
            r6.LL = r0     // Catch: java.lang.Throwable -> L5f
            r6.LLILZ = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r4 = r14.invoke(r6)     // Catch: java.lang.Throwable -> L5f
            if (r4 != r3) goto L4a
            return r3
        L4a:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r0
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r5)
            r0.append(r2)
            X.C2188811AlT.LIZIZ(r0)
            r12.LJIIL = r2
            return r4
        L5f:
            r3 = move-exception
        L60:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r7 = LJ(r3)     // Catch: java.lang.Throwable -> L79
            r12.LJIJ = r7     // Catch: java.lang.Throwable -> L79
            X.09Ei r2 = X.C2338609Ei.LIZ     // Catch: java.lang.Throwable -> L79
            r8 = 0
            java.lang.String r9 = ""
            r2.getClass()     // Catch: java.lang.Throwable -> L79
            r6 = 402(0x192, float:5.63E-43)
            r10 = r9
            r11 = r9
            X.C2338609Ei.LIZ(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L79
            throw r3     // Catch: java.lang.Throwable -> L79
        L79:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)     // Catch: java.lang.Throwable -> L79
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r0
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r5)
            r0.append(r2)
            X.C2188811AlT.LIZIZ(r0)
            r12.LJIIL = r2
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2218501BsG.LJIIIIZZ(X.05Vn, X.0e51):java.lang.Object");
    }

    public C2218501BsG(EnumC1074240e3q enumC1074240e3q, EnumC1995407rk enumC1995407rk, boolean z, int i) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        AwS582S0100000_3 awS582S0100000_3;
        MessageDigest messageDigest2;
        z = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } else {
            messageDigest = null;
        }
        if ((i & 16) != 0) {
            awS582S0100000_3 = new AwS582S0100000_3(messageDigest, 96);
        } else {
            awS582S0100000_3 = null;
        }
        if ((i & 32) != 0) {
            messageDigest2 = MessageDigest.getInstance("SHA-256");
        } else {
            messageDigest2 = null;
        }
        AwS582S0100000_3 awS582S0100000_32 = (i & 64) != 0 ? new AwS582S0100000_3(messageDigest2, 97) : null;
        this.LIZ = enumC1074240e3q;
        this.LIZIZ = enumC1995407rk;
        this.LIZJ = z;
        this.LIZLLL = messageDigest;
        this.LJ = awS582S0100000_3;
        this.LJFF = messageDigest2;
        this.LJI = awS582S0100000_32;
        this.LJII = -1L;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = -1L;
        this.LJIILIIL = -1L;
        this.LJIILJJIL = -1L;
        this.LJIILL = -1L;
        this.LJIJJ = 4;
        this.LJJIL = "";
        this.LJJIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 330));
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS35S2000000_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS80S1000000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.13S5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13S5 implements InterfaceC20004513Ox {
    public final String LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 298));
    public final ConcurrentHashMap<String, Pair<C05XL<Pair<String, Long>>, C13S7>> LIZLLL = new ConcurrentHashMap<>();

    @Override // X.InterfaceC20004513Ox
    public final void LJ(InterfaceC20004913Pb interfaceC20004913Pb) {
    }

    @Override // X.InterfaceC20004513Ox
    public final void clear() {
    }

    @Override // X.InterfaceC20004513Ox
    public final Pair<Long, Long> LJIILLIIL() {
        return new Pair<>(0L, 0L);
    }

    public final C13S6 LJIJ() {
        return (C13S6) this.LIZIZ.getValue();
    }

    public final String LJIJI() {
        return (String) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC20004513Ox
    public final Set<String> LIZJ() {
        return LJIJ().LJIIJ(LJIJI());
    }

    @Override // X.InterfaceC20004513Ox
    public final void LIZ(long j) {
        LJIJ().LIZLLL();
    }

    @Override // X.InterfaceC20004513Ox
    public final Pair<Integer, Long> LIZIZ(long j) {
        return LJIJ().LJIIL(j, false);
    }

    @Override // X.InterfaceC20004513Ox
    public final String LJFF(String str) {
        Object c098200Yq;
        Object obj = null;
        try {
            C20008813Qo c20008813QoLJIILIIL = LJIILIIL(str);
            if (c20008813QoLJIILIIL != null) {
                c098200Yq = C13SB.LJIIIZ(c20008813QoLJIILIIL);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error in queryToValue for key: ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("EffectPlatformCacheImpl", strLIZIZ, thM5exceptionOrNullimpl);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    @Override // X.InterfaceC20004513Ox
    public final String LJIIJJI(String str) {
        File fileLJII = LJIJ().LJII(str, LJIJI());
        if (fileLJII != null) {
            return fileLJII.getAbsolutePath();
        }
        return null;
    }

    @Override // X.InterfaceC20004513Ox
    public final void LJIIL(List<String> list) {
        LJIJ().LJIILIIL(LJIJI(), list);
    }

    @Override // X.InterfaceC20004513Ox
    public final C20008813Qo LJIILIIL(String str) {
        Object c098200Yq;
        String absolutePath;
        String str2;
        Object obj = null;
        try {
            Regex regex = C13SG.LJJ;
            File fileLJII = LJIJ().LJII(C13SJ.LIZJ(str), LJIJI());
            if (fileLJII != null) {
                absolutePath = fileLJII.getAbsolutePath();
            } else {
                absolutePath = null;
            }
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("queryToStream: key: ");
            sbLIZ.append(str);
            sbLIZ.append(" cacheFilePath: ");
            if (absolutePath != null) {
                str2 = absolutePath;
            } else {
                str2 = "null";
            }
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("EffectPlatformCacheImpl", strLIZIZ);
            if (absolutePath == null) {
                c098200Yq = null;
            } else {
                c098200Yq = C13SB.LJIIJJI(new C13M9(absolutePath));
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq) && c098200Yq == null) {
            C13SS.LIZ.getClass();
            C13SS.LIZIZ("EffectPlatformCacheImpl", "Failed to open input stream for file", null);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C13SS.LIZ.getClass();
            C13SS.LIZIZ("EffectPlatformCacheImpl", "Error in queryToStream", thM5exceptionOrNullimpl);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (C20008813Qo) obj;
    }

    @Override // X.InterfaceC20004513Ox
    public final boolean LJIILJJIL(String str) {
        Regex regex = C13SG.LJJ;
        return LJIJ().LJFF(C13SJ.LIZJ(str), LJIJI());
    }

    @Override // X.InterfaceC20004513Ox
    public final void LJIILL(String str) {
        if (str == null) {
            return;
        }
        Regex regex = C13SG.LJJ;
        LJIJ().LJIIIZ(LJIJI(), new Regex(C13SJ.LIZLLL(str)));
    }

    public final void LJIIZILJ(String str) {
        Pair<C05XL<Pair<String, Long>>, C13S7> pair = this.LIZLLL.get(str);
        if (pair != null) {
            try {
                pair.getFirst().LIZIZ(null);
                C13S7 second = pair.getSecond();
                if (second != null) {
                    second.close();
                }
                C13M9 c13m9 = new C13M9(this.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(".tmp");
                C189200o6.m2constructorimpl(Boolean.valueOf(C20012413Ry.LJ(c13m9.LIZ(C2188811AlT.LIZIZ(sbLIZ)))));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C13SS c13ss = C13SS.LIZ;
            String strConcat = "cancelRunningTask: existingDeferred, key: ".concat(str);
            c13ss.getClass();
            C13SS.LIZIZ("EffectPlatformCacheImpl", strConcat, null);
        }
    }

    @Override // X.InterfaceC20004513Ox
    public final boolean remove(String str) {
        Regex regex = C13SG.LJJ;
        LJIJ().remove(C13SJ.LIZJ(str), LJIJI());
        return true;
    }

    public C13S5(String str, C13S9 c13s9) {
        this.LIZ = str;
        this.LIZIZ = C452501pT.LIZIZ(new AwS431S0200000_30(this, c13s9, 30));
    }

    @Override // X.InterfaceC20004513Ox
    public final void LIZLLL(String str, String str2) {
        LJIJ().LJI(str, LJIJI(), str2);
    }

    @Override // X.InterfaceC20004513Ox
    public final void LJI(String str, String str2) {
        LJIJ().LJIIJJI(LJIJI(), str, str2, null);
    }

    @Override // X.InterfaceC20004513Ox
    public final long LJII(String str, C20008713Qn c20008713Qn, String str2) {
        Regex regex = C13SG.LJJ;
        return ((Number) LJIJJ(C13SJ.LIZJ(str), str2, null, new AwS609S0100000_30(c20008713Qn, 129), false).getSecond()).longValue();
    }

    @Override // X.InterfaceC20004513Ox
    public final long LJIIJ(String str, String str2, String str3) {
        Regex regex = C13SG.LJJ;
        return ((Number) LJIJJ(C13SJ.LIZJ(str), "effect_panel_list", null, new AwS80S1000000_30(str2, 1), false).getSecond()).longValue();
    }

    public final Pair LJIJJ(String str, String str2, Function0 function0, Function1 function1, boolean z) throws Throwable {
        C13S7 c13s7;
        Object c098200Yq;
        C05XL<Pair<String, Long>> first;
        String str3;
        String str4;
        C05XL<Pair<String, Long>> first2;
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStart writeStreamToFile: diskLruKey: ");
        sbLIZ.append(str);
        sbLIZ.append(", type: ");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("EffectPlatformCacheImpl", strLIZIZ);
        Pair<C05XL<Pair<String, Long>>, C13S7> pair = this.LIZLLL.get(str);
        Object objValueOf = null;
        if (pair != null && (C19997713Mh.LJI || C23250099c.LJ(C23271099x.INSTANCE, new C453601pe(pair, null)) == null)) {
            LJIIZILJ(str);
        }
        C099F c099fLIZIZ = C090F.LIZIZ();
        this.LIZLLL.put(str, new Pair<>(c099fLIZIZ, null));
        C13M9 c13m9 = new C13M9(this.LIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(".tmp");
        C13M9 c13m9LIZ = c13m9.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        C13M9 c13m9LIZ2 = new C13M9(this.LIZ).LIZ(str);
        try {
            C13SD c13sdLJIILIIL = C13SB.LJIILIIL(c13m9LIZ, false);
            if (c13sdLJIILIIL == null) {
                c13sdLJIILIIL = new C13S8();
            }
            c13s7 = new C13S7(c13sdLJIILIIL);
            try {
                this.LIZLLL.put(str, new Pair<>(c099fLIZIZ, c13s7));
                function1.invoke(c13s7);
                c13s7.close();
                c098200Yq = Boolean.valueOf(C13SB.LJIJ(c13m9LIZ, c13m9LIZ2));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } catch (Throwable th2) {
            th = th2;
            c13s7 = null;
        }
        long j = 0;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            ((Boolean) c098200Yq).booleanValue();
            if (Intrinsics.LJFF(LJIJI(), "")) {
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("customCacheKey == null  cacheDir: ");
                sbLIZ3.append(this.LIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                c13ss2.getClass();
                C13SS.LIZIZ("EffectPlatformCacheImpl", strLIZIZ2, null);
            }
            LJIJ().LJIIJJI(LJIJI(), str, str2, null);
            if (c13m9LIZ2 != null) {
                str3 = c13m9LIZ2.LIZ;
            } else {
                str3 = null;
            }
            if (c13s7 != null) {
                j = c13s7.LIZJ;
            }
            Pair<String, Long> pair2 = new Pair<>(str3, Long.valueOf(j));
            Pair<C05XL<Pair<String, Long>>, C13S7> pair3 = this.LIZLLL.get(str);
            if (pair3 != null && (first2 = pair3.getFirst()) != null) {
                first2.LJIIZILJ(pair2);
            }
            this.LIZLLL.remove(str);
            C13SS c13ss3 = C13SS.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("writeStreamToFile Success: ");
            sbLIZ4.append(str);
            sbLIZ4.append(", customCacheKey: ");
            sbLIZ4.append(LJIJI());
            sbLIZ4.append(" path: ");
            if (c13m9LIZ2 != null) {
                str4 = c13m9LIZ2.LIZ;
            } else {
                str4 = null;
            }
            sbLIZ4.append(str4);
            sbLIZ4.append(", size: ");
            if (c13s7 != null) {
                objValueOf = Long.valueOf(c13s7.LIZJ);
            }
            sbLIZ4.append(objValueOf);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
            c13ss3.getClass();
            C13SS.LIZ("EffectPlatformCacheImpl", strLIZIZ3);
            return pair2;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C13SS c13ss4 = C13SS.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("onFail writeStreamToFile: diskLruKey: ");
            sbLIZ5.append(str);
            sbLIZ5.append(", e: ");
            sbLIZ5.append(thM5exceptionOrNullimpl);
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
            c13ss4.getClass();
            C13SS.LIZIZ("EffectPlatformCacheImpl", strLIZIZ4, null);
            if (c13s7 != null) {
                try {
                    c13s7.close();
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
            }
            C20012413Ry.LJ(c13m9LIZ);
            if (function0 != null) {
                function0.invoke();
                objValueOf = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(objValueOf);
            Pair<C05XL<Pair<String, Long>>, C13S7> pair4 = this.LIZLLL.get(str);
            if (pair4 != null && (first = pair4.getFirst()) != null) {
                first.LJIIZILJ(new Pair<>("", 0L));
            }
            this.LIZLLL.remove(str);
            if ((z && (thM5exceptionOrNullimpl instanceof C19997413Me)) || (thM5exceptionOrNullimpl instanceof C13NG)) {
                throw thM5exceptionOrNullimpl;
            }
        }
        return new Pair("", 0L);
    }

    @Override // X.InterfaceC20004513Ox
    public final Pair LJIIIIZZ(String str, C20008713Qn c20008713Qn, String str2, long j, String str3, Function2 function2) throws Throwable {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        String str4 = C13SB.LIZ;
        sbLIZ.append(str4);
        sbLIZ.append(str);
        sbLIZ.append(".tmp");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(str4);
        sbLIZ2.append(str);
        sbLIZ2.append("_unzip");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        Pair pairLJIJJ = LJIJJ(str, str3, new AwS35S2000000_30(strLIZIZ, strLIZIZ2, 0), new C20011913Rt(strLIZIZ, c20008713Qn, strLIZIZ2, j, function2, str2, str), true);
        Object first = pairLJIJJ.getFirst();
        if (((Number) pairLJIJJ.getSecond()).longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return new Pair(first, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC20004513Ox
    public final Pair<String, Boolean> LJIIIZ(String str, C20008813Qo c20008813Qo, String str2, long j, String str3, Function2<? super Integer, ? super Long, Unit> function2) throws Throwable {
        Regex regex = C13SG.LJJ;
        String strLIZJ = C13SJ.LIZJ(str);
        boolean z = true;
        Pair pairLJIJJ = LJIJJ(strLIZJ, str3, null, new C20012013Ru(c20008813Qo, j, function2, str2, strLIZJ), true);
        Object first = pairLJIJJ.getFirst();
        if (((Number) pairLJIJJ.getSecond()).longValue() <= 0) {
            z = false;
        }
        return new Pair<>(first, Boolean.valueOf(z));
    }
}

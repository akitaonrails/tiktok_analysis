package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531820pxs {
    public static final C1531840pxu LJIIL = new C1531840pxu();
    public static final SimpleDateFormat LJIILIIL = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH);
    public final Long LIZ;
    public volatile File LIZIZ;
    public final C1531860pxw LIZJ;
    public final C1531990py9<C1531820pxs> LIZLLL;
    public String LJ;
    public Long LJFF;
    public final Long LJI;
    public WeakReference<InterfaceC1531770pxn> LJII;
    public WeakReference<Map<String, String>> LJIIIIZZ;
    public Map<String, String> LJIIIZ;
    public RunnableC1531850pxv LJIIJ;
    public final C1531870pxx LJIIJJI;

    public C1531820pxs() {
        throw null;
    }

    public final boolean LIZ() {
        InterfaceC1531770pxn interfaceC1531770pxn;
        C1532030pyD c1532030pyDLIZIZ;
        WeakReference<InterfaceC1531770pxn> weakReference = this.LJII;
        if (weakReference != null && (interfaceC1531770pxn = weakReference.get()) != null && (c1532030pyDLIZIZ = interfaceC1531770pxn.LIZIZ()) != null) {
            if (c1532030pyDLIZIZ.LJIIL()) {
                return true;
            }
            this.LJII = null;
            return true;
        }
        File file = this.LIZIZ;
        if (file != null && file.isFile()) {
            return true;
        }
        C1532920pze c1532920pze = C1532920pze.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache is corrupted, path: ");
        File file2 = this.LIZIZ;
        sbLIZ.append(file2 != null ? file2.getAbsolutePath() : null);
        c1532920pze.LIZIZ("HTTPCache", "checkValid", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public final Integer LIZIZ() {
        int length;
        InterfaceC1531770pxn interfaceC1531770pxn;
        C1532030pyD c1532030pyDLIZIZ;
        WeakReference<InterfaceC1531770pxn> weakReference = this.LJII;
        if (weakReference == null || (interfaceC1531770pxn = weakReference.get()) == null || (c1532030pyDLIZIZ = interfaceC1531770pxn.LIZIZ()) == null) {
            File file = this.LIZIZ;
            if (file == null) {
                return null;
            }
            length = (int) file.length();
        } else {
            AbstractC1532040pyE abstractC1532040pyE = c1532030pyDLIZIZ.LLILZLL;
            length = abstractC1532040pyE != null ? abstractC1532040pyE.LJFF : 0;
        }
        return Integer.valueOf(length);
    }

    public final void LIZJ() {
        C1532920pze.LIZJ.LIZJ(new AwS567S0100000_23(this, 165));
        this.LJIIIZ = LJ();
        String str = this.LJ;
        if (str != null) {
            C1531200pws.LIZIZ(str);
        }
    }

    public final boolean LIZLLL() {
        String str;
        return this.LJIIIZ == null && LIZ() && ((str = this.LJ) == null || C1531200pws.LIZIZ.contains(str));
    }

    public final Map<String, String> LJ() {
        String stringJustDisk;
        Object c098200Yq;
        Map<String, String> map = this.LJIIIZ;
        if (map == null) {
            WeakReference<Map<String, String>> weakReference = this.LJIIIIZZ;
            map = weakReference != null ? weakReference.get() : null;
        }
        if (map != null) {
            return map;
        }
        synchronized (this) {
            try {
                String str = this.LJ;
                if (str == null) {
                    C1532760pzO.LIZJ(C1532920pze.LIZJ, "HTTPCache", "provideCachedHeaders", "cannot get cacheKey", null, null, 48);
                    return null;
                }
                if (this.LJIIIZ == null) {
                    WeakReference<Map<String, String>> weakReference2 = this.LJIIIIZZ;
                    if ((weakReference2 != null ? weakReference2.get() : null) == null && (stringJustDisk = C1531200pws.LIZIZ.getStringJustDisk(str, null)) != null) {
                        try {
                            c098200Yq = (LinkedHashMap) GsonProtectorUtils.fromJson(C1531810pxr.LIZ, stringJustDisk, (Class) new LinkedHashMap().getClass());
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            C1532760pzO.LIZ(C1532920pze.LIZJ, "HTTPCache", "provideCachedHeaders", "error occurs when get headers from keva", thM5exceptionOrNullimpl, C2097608Jq.LJIIIIZZ(new Pair("cache_key", str), new Pair("value", stringJustDisk)));
                        }
                        LinkedHashMap linkedHashMap = (LinkedHashMap) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                        this.LJIIIIZZ = new WeakReference<>(linkedHashMap);
                        return linkedHashMap;
                    }
                }
                return null;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final File LJII() {
        File file = this.LIZIZ;
        if (file == null || !file.isFile()) {
            return null;
        }
        return file;
    }

    public final File LJFF() {
        if (!LIZ()) {
            return null;
        }
        if (this.LIZIZ == null) {
            if (this.LJIIJ == null) {
                LIZJ();
                return null;
            }
            synchronized (this) {
                try {
                    RunnableC1531850pxv runnableC1531850pxv = this.LJIIJ;
                    if (runnableC1531850pxv != null) {
                        runnableC1531850pxv.run();
                        this.LJIIJ = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (this.LIZIZ == null) {
            LIZJ();
        }
        return this.LIZIZ;
    }

    public final String toString() {
        InterfaceC1531770pxn interfaceC1531770pxn;
        C1532030pyD c1532030pyDLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cacheKey: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", headers: ");
        WeakReference<Map<String, String>> weakReference = this.LJIIIIZZ;
        String string = null;
        sbLIZ.append((weakReference == null || weakReference.get() == null) ? false : true);
        sbLIZ.append(", data: ");
        WeakReference<InterfaceC1531770pxn> weakReference2 = this.LJII;
        if (weakReference2 != null && (interfaceC1531770pxn = weakReference2.get()) != null && (c1532030pyDLIZIZ = interfaceC1531770pxn.LIZIZ()) != null) {
            string = c1532030pyDLIZIZ.toString();
        }
        sbLIZ.append(string);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final InputStream LJI(C1532710pzJ c1532710pzJ) {
        InterfaceC1531770pxn interfaceC1531770pxn;
        C1532030pyD c1532030pyDLIZ;
        InputStream inputStreamLJIILJJIL;
        InterfaceC1531770pxn interfaceC1531770pxn2;
        C1532030pyD c1532030pyDLIZ2;
        InputStream inputStreamLJIILJJIL2;
        WeakReference<InterfaceC1531770pxn> weakReference = this.LJII;
        if (weakReference != null && (interfaceC1531770pxn2 = weakReference.get()) != null && (c1532030pyDLIZ2 = interfaceC1531770pxn2.LIZ()) != null && (inputStreamLJIILJJIL2 = c1532030pyDLIZ2.LJIILJJIL(c1532710pzJ)) != null) {
            return inputStreamLJIILJJIL2;
        }
        try {
            File file = this.LIZIZ;
            if (file != null) {
                synchronized (this) {
                    try {
                        WeakReference<InterfaceC1531770pxn> weakReference2 = this.LJII;
                        if (weakReference2 != null && (interfaceC1531770pxn = weakReference2.get()) != null && (c1532030pyDLIZ = interfaceC1531770pxn.LIZ()) != null && (inputStreamLJIILJJIL = c1532030pyDLIZ.LJIILJJIL(c1532710pzJ)) != null) {
                            return inputStreamLJIILJJIL;
                        }
                        C1531700pxg c1531700pxg = new C1531700pxg(c1532710pzJ, new C0VSP(file), true, this.LIZIZ);
                        this.LJII = new WeakReference<>(c1531700pxg);
                        return c1531700pxg;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C189200o6.m2constructorimpl(null);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        LIZJ();
        return null;
    }

    public C1531820pxs(String str, Long l, Long l2, C0VSJ c0vsj, C1531860pxw c1531860pxw, C1531990py9 c1531990py9) {
        Long lLJIILIIL;
        String strLJJLL;
        String str2;
        this.LIZ = l2;
        this.LIZIZ = c0vsj;
        this.LIZJ = c1531860pxw;
        this.LIZLLL = c1531990py9;
        this.LJ = str;
        this.LJFF = l;
        if (str != null && (strLJJLL = a0.LJJLL('.', str, str)) != null && (str2 = (String) ListProtector.get(a0.LJJLIIIJ(strLJJLL, new char[]{'-'}, false, 0, 6), 1)) != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str2);
        } else {
            lLJIILIIL = null;
        }
        this.LJI = lLJIILIIL;
        this.LJIIJJI = new C1531870pxx(this);
    }
}

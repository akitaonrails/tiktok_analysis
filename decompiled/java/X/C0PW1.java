package X;

import X.InterfaceC1618170sD9;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PW1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PW1<T extends InterfaceC1618170sD9<T>> {
    public static final List<String> LJI;
    public static final boolean LJII;
    public static final boolean LJIIIIZZ;
    public static final boolean LJIIIZ;
    public final Function0<T> LIZ;
    public final Class<T> LIZIZ = (Class<T>) LIZ().getClass();
    public final C01GW LIZJ = C452501pT.LIZIZ(new C2091908Hl());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C0PW8(this));
    public final ConcurrentHashMap<EnumC646250PWl, AtomicInteger> LJ;
    public final ConcurrentHashMap<EnumC646250PWl, AtomicBoolean> LJFF;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C13LE.LIZ(C0P8I.class).LJI());
        LJI = arrayList;
        LJII = C07DY.LIZ();
        LJIIIIZZ = ((Boolean) C1838207Hw.LIZIZ.getValue()).booleanValue();
        LJIIIZ = C07E8.LIZ();
    }

    public final T LIZ() {
        return this.LIZ.invoke();
    }

    public C0PW1(C0PWD c0pwd) {
        this.LIZ = c0pwd;
        new C0PHT(null, 511);
        this.LJ = LJIIIIZZ ? new ConcurrentHashMap<>() : null;
        this.LJFF = new ConcurrentHashMap<>();
    }

    public final T LIZIZ(Object obj) {
        T t = (T) ((Map) this.LIZJ.getValue()).get(obj);
        if (t == null) {
            return (T) LIZ();
        }
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01a8 A[PHI: r0
      0x01a8: PHI (r0v42 X.0sD9) = (r0v41 X.0sD9), (r0v47 X.0sD9), (r0v54 X.0sD9) binds: [B:142:0x01a0, B:129:0x017b, B:119:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0248 A[PHI: r0
      0x0248: PHI (r0v19 X.0sD9) = (r0v18 X.0sD9), (r0v24 X.0sD9), (r0v31 X.0sD9) binds: [B:192:0x0241, B:184:0x0224, B:178:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0274 A[PHI: r0
      0x0274: PHI (r0v63 X.0sD9) = (r0v62 X.0sD9), (r0v69 X.0sD9), (r0v76 X.0sD9) binds: [B:82:0x00f9, B:73:0x00dd, B:204:0x0269] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x05db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1618170sD9 LIZJ(X.C0PWA r19, X.EnumC646250PWl r20) {
        /*
            Method dump skipped, instruction units count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PW1.LIZJ(X.0PWA, X.0PWl):X.0sD9");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.EnumC646250PWl r18, X.C0PWA r19, T r20, T r21) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PW1.LIZLLL(X.0PWl, X.0PWA, X.0sD9, X.0sD9):void");
    }
}

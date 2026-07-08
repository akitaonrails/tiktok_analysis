package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651520t4w {
    public final InterfaceC1651320t4c<Object> LIZ;
    public final EnumC1651310t4b LIZIZ;
    public final Object LIZJ;
    public final Class<Object> LIZLLL;
    public final InterfaceC1659130tHD<Object> LJ;
    public final Class<InterfaceC1659130tHD<Object>> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1651520t4w)) {
            return false;
        }
        C1651520t4w c1651520t4w = (C1651520t4w) obj;
        return Intrinsics.LJFF(this.LIZ, c1651520t4w.LIZ) && this.LIZIZ == c1651520t4w.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1651520t4w.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1651520t4w.LIZLLL) && Intrinsics.LJFF(this.LJ, c1651520t4w.LJ) && Intrinsics.LJFF(this.LJFF, c1651520t4w.LJFF);
    }

    public static C1651520t4w LIZ(C1651520t4w c1651520t4w, Object obj) {
        return new C1651520t4w(c1651520t4w.LIZ, c1651520t4w.LIZIZ, obj, c1651520t4w.LIZLLL, c1651520t4w.LJ, c1651520t4w.LJFF);
    }

    public C1651520t4w(InterfaceC1651320t4c<? extends Object> interfaceC1651320t4c, EnumC1651310t4b enumC1651310t4b, Object obj, Class<Object> cls, InterfaceC1659130tHD<Object> interfaceC1659130tHD, Class<InterfaceC1659130tHD<Object>> cls2) {
        this.LIZ = interfaceC1651320t4c;
        this.LIZIZ = enumC1651310t4b;
        this.LIZJ = obj;
        this.LIZLLL = cls;
        this.LJ = interfaceC1659130tHD;
        this.LJFF = cls2;
    }
}

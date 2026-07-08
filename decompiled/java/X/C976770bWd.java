package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0bWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976770bWd {
    public final C470590Icr<Unit> LIZ;
    public final Throwable LIZIZ;
    public final EnumC976390bW1 LIZJ;
    public final EnumC976390bW1 LIZLLL;

    public C976770bWd() {
        this(null, null, null, null);
    }

    public C976770bWd(C470590Icr<Unit> c470590Icr, Throwable th, EnumC976390bW1 enumC976390bW1, EnumC976390bW1 enumC976390bW12) {
        this.LIZ = c470590Icr;
        this.LIZIZ = th;
        this.LIZJ = enumC976390bW1;
        this.LIZLLL = enumC976390bW12;
    }

    public static C976770bWd LIZ(C976770bWd c976770bWd, C470590Icr c470590Icr, Throwable th, EnumC976390bW1 enumC976390bW1, EnumC976390bW1 enumC976390bW12, int i) {
        if ((i & 1) != 0) {
            c470590Icr = c976770bWd.LIZ;
        }
        if ((i & 2) != 0) {
            th = c976770bWd.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC976390bW1 = c976770bWd.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC976390bW12 = c976770bWd.LIZLLL;
        }
        return new C976770bWd(c470590Icr, th, enumC976390bW1, enumC976390bW12);
    }
}

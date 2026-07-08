package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563490M8d {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C0M8T LIZLLL;
    public final InterfaceC1685420txc<Context, Integer, Integer, String, String, Unit> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C563490M8d)) {
            return false;
        }
        C563490M8d c563490M8d = (C563490M8d) obj;
        return this.LIZ == c563490M8d.LIZ && Intrinsics.LJFF(this.LIZIZ, c563490M8d.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c563490M8d.LIZJ) && this.LIZLLL == c563490M8d.LIZLLL && Intrinsics.LJFF(this.LJ, c563490M8d.LJ);
    }

    public static C563490M8d LIZ(C563490M8d c563490M8d, boolean z, C0M8T c0m8t, int i) {
        String str;
        String str2;
        C0M8T c0m8t2 = c0m8t;
        boolean z2 = z;
        if ((i & 1) != 0) {
            z2 = c563490M8d.LIZ;
        }
        InterfaceC1685420txc<Context, Integer, Integer, String, String, Unit> interfaceC1685420txc = null;
        if ((i & 2) != 0) {
            str = c563490M8d.LIZIZ;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = c563490M8d.LIZJ;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            c0m8t2 = c563490M8d.LIZLLL;
        }
        if ((i & 16) != 0) {
            interfaceC1685420txc = c563490M8d.LJ;
        }
        c563490M8d.getClass();
        return new C563490M8d(z2, str, str2, c0m8t2, interfaceC1685420txc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C563490M8d(boolean z, String str, String str2, C0M8T c0m8t, InterfaceC1685420txc<? super Context, ? super Integer, ? super Integer, ? super String, ? super String, Unit> interfaceC1685420txc) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = c0m8t;
        this.LJ = interfaceC1685420txc;
    }
}

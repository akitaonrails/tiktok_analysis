package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Onz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630370Onz implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;
    public final C291001Au<Integer> LLILLL;
    public final C291001Au<Unit> LLILZ;

    public C630370Onz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C630370Onz)) {
            return false;
        }
        C630370Onz c630370Onz = (C630370Onz) obj;
        return this.LL == c630370Onz.LL && this.LLILLJJLI == c630370Onz.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c630370Onz.LLILLL) && Intrinsics.LJFF(this.LLILZ, c630370Onz.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<Unit> c291001Au = this.LLILZ;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicPlayState(musicPlayState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", musicTotalPlayTime=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", musicCurrentPlayTime=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", musicReplay=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C630370Onz(int i) {
        this(-1, 0, new C291001Au(0), null);
    }

    public C630370Onz(int i, int i2, C291001Au<Integer> c291001Au, C291001Au<Unit> c291001Au2) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = c291001Au;
        this.LLILZ = c291001Au2;
    }

    public static C630370Onz LIZ(C630370Onz c630370Onz, int i, int i2, C291001Au c291001Au, C291001Au c291001Au2, int i3) {
        if ((i3 & 1) != 0) {
            i = c630370Onz.LL;
        }
        if ((i3 & 2) != 0) {
            i2 = c630370Onz.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            c291001Au = c630370Onz.LLILLL;
        }
        if ((i3 & 8) != 0) {
            c291001Au2 = c630370Onz.LLILZ;
        }
        c630370Onz.getClass();
        return new C630370Onz(i, i2, c291001Au, c291001Au2);
    }
}

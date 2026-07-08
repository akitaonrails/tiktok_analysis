package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ORt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619550ORt implements InterfaceC0148002o {
    public final int LL;
    public final C291001Au<C0OR6> LLILLJJLI;

    public C619550ORt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C619550ORt)) {
            return false;
        }
        C619550ORt c619550ORt = (C619550ORt) obj;
        return this.LL == c619550ORt.LL && Intrinsics.LJFF(this.LLILLJJLI, c619550ORt.LLILLJJLI);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        C291001Au<C0OR6> c291001Au = this.LLILLJJLI;
        return i + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicPlayState(musicPlayState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C619550ORt(int i) {
        this(-1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C619550ORt(int i, C291001Au<? extends C0OR6> c291001Au) {
        this.LL = i;
        this.LLILLJJLI = c291001Au;
    }

    public static C619550ORt LIZ(C619550ORt c619550ORt, int i) {
        C291001Au<C0OR6> c291001Au = c619550ORt.LLILLJJLI;
        c619550ORt.getClass();
        return new C619550ORt(i, c291001Au);
    }
}

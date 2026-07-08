package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JIM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JIM implements InterfaceC0148002o {
    public final C0JIO LL;
    public final C0JIC LLILLJJLI;

    public C0JIM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JIM)) {
            return false;
        }
        C0JIM c0jim = (C0JIM) obj;
        return Intrinsics.LJFF(this.LL, c0jim.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0jim.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsCourseMusicPeelState(pageStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", confirmAudioState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0JIM(int i) {
        this(new C0JIO() { // from class: X.0JIT
        }, C0JIE.LIZ);
    }

    public C0JIM(C0JIO c0jio, C0JIC c0jic) {
        this.LL = c0jio;
        this.LLILLJJLI = c0jic;
    }

    public static C0JIM LIZ(C0JIM c0jim, C0JIO c0jio, C0JIC c0jic, int i) {
        if ((i & 1) != 0) {
            c0jio = c0jim.LL;
        }
        if ((i & 2) != 0) {
            c0jic = c0jim.LLILLJJLI;
        }
        c0jim.getClass();
        return new C0JIM(c0jio, c0jic);
    }
}

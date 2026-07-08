package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IAJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IAJ implements InterfaceC0148002o {
    public final C0IAH<Object> LL;
    public final C0IAH<C869590Y9l> LLILLJJLI;

    public C0IAJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IAJ)) {
            return false;
        }
        C0IAJ c0iaj = (C0IAJ) obj;
        return Intrinsics.LJFF(this.LL, c0iaj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0iaj.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendMessageVMState(sendMessageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", messageToReplyState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0IAJ(int i) {
        C0IAI c0iai = new C0IAH() { // from class: X.0IAI
        };
        this(c0iai, c0iai);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0IAJ(C0IAH<? extends Object> c0iah, C0IAH<? extends C869590Y9l> c0iah2) {
        this.LL = c0iah;
        this.LLILLJJLI = c0iah2;
    }

    public static C0IAJ LIZ(C0IAJ c0iaj, C0IAH c0iah, C0IAH c0iah2, int i) {
        if ((i & 1) != 0) {
            c0iah = c0iaj.LL;
        }
        if ((i & 2) != 0) {
            c0iah2 = c0iaj.LLILLJJLI;
        }
        c0iaj.getClass();
        return new C0IAJ(c0iah, c0iah2);
    }
}

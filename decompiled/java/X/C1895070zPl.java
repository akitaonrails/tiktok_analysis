package X;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895070zPl implements InterfaceC0148002o {
    public final C1870440ym2 LL;
    public final C1895120zPq LLILLJJLI;

    public C1895070zPl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1895070zPl)) {
            return false;
        }
        C1895070zPl c1895070zPl = (C1895070zPl) obj;
        return Intrinsics.LJFF(this.LL, c1895070zPl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1895070zPl.LLILLJJLI);
    }

    public final int hashCode() {
        C1870440ym2 c1870440ym2 = this.LL;
        return ((c1870440ym2 == null ? 0 : c1870440ym2.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextLinkState(textLinkModel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loginModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1895070zPl(int i) {
        this(new C1870440ym2(System.currentTimeMillis(), new ArrayList()), new C1895120zPq(System.currentTimeMillis(), EnumC1895270zQ5.TYPE_INIT));
    }

    public C1895070zPl(C1870440ym2 c1870440ym2, C1895120zPq c1895120zPq) {
        this.LL = c1870440ym2;
        this.LLILLJJLI = c1895120zPq;
    }
}

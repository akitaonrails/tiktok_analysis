package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1222290hud implements InterfaceC0148002o {
    public final AbstractC1222340hui LL;
    public final boolean LLILLJJLI;

    public C1222290hud() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1222290hud)) {
            return false;
        }
        C1222290hud c1222290hud = (C1222290hud) obj;
        return Intrinsics.LJFF(this.LL, c1222290hud.LL) && this.LLILLJJLI == c1222290hud.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddAnchorState(linkCheckStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", anchorAdded=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1222290hud(int i) {
        this(C1222300hue.LIZ, false);
    }

    public C1222290hud(AbstractC1222340hui abstractC1222340hui, boolean z) {
        this.LL = abstractC1222340hui;
        this.LLILLJJLI = z;
    }

    public static C1222290hud LIZ(C1222290hud c1222290hud, AbstractC1222340hui abstractC1222340hui, boolean z, int i) {
        if ((i & 1) != 0) {
            abstractC1222340hui = c1222290hud.LL;
        }
        if ((i & 2) != 0) {
            z = c1222290hud.LLILLJJLI;
        }
        c1222290hud.getClass();
        return new C1222290hud(abstractC1222340hui, z);
    }
}

package X;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ORD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ORD implements InterfaceC0148002o {
    public final C0ORK LL;
    public final C0ORE LLILLJJLI;

    public C0ORD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ORD)) {
            return false;
        }
        C0ORD c0ord = (C0ORD) obj;
        return this.LL == c0ord.LL && Intrinsics.LJFF(this.LLILLJJLI, c0ord.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEmojiState(listLoadState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", emojiSelectSheetData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0ORD(int i) {
        this(C0ORK.LOADING, new C0ORE(new ArrayList(), new ArrayList()));
    }

    public C0ORD(C0ORK c0ork, C0ORE c0ore) {
        this.LL = c0ork;
        this.LLILLJJLI = c0ore;
    }

    public static C0ORD LIZ(C0ORD c0ord, C0ORK c0ork) {
        C0ORE c0ore = c0ord.LLILLJJLI;
        c0ord.getClass();
        return new C0ORD(c0ork, c0ore);
    }
}

package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPoll;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OVX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OVX implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final boolean LLILLJJLI;
    public final C291001Au<BulletinPoll> LLILLL;
    public final C0OOC LLILZ;

    public C0OVX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OVX)) {
            return false;
        }
        C0OVX c0ovx = (C0OVX) obj;
        return Intrinsics.LJFF(this.LL, c0ovx.LL) && this.LLILLJJLI == c0ovx.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0ovx.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0ovx.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31;
        C0OOC c0ooc = this.LLILZ;
        return iHashCode + (c0ooc == null ? 0 : c0ooc.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPollCreateState(optionCountLimit=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", canPublish=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", publishEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", commonParam=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0OVX(int i) {
        this(new C291001Au(Boolean.FALSE), false, new C291001Au(null), null);
    }

    public C0OVX(C291001Au<Boolean> c291001Au, boolean z, C291001Au<BulletinPoll> c291001Au2, C0OOC c0ooc) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
        this.LLILLL = c291001Au2;
        this.LLILZ = c0ooc;
    }

    public static C0OVX LIZ(C0OVX c0ovx, C291001Au c291001Au, boolean z, C291001Au c291001Au2, C0OOC c0ooc, int i) {
        if ((i & 1) != 0) {
            c291001Au = c0ovx.LL;
        }
        if ((i & 2) != 0) {
            z = c0ovx.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c0ovx.LLILLL;
        }
        if ((i & 8) != 0) {
            c0ooc = c0ovx.LLILZ;
        }
        c0ovx.getClass();
        return new C0OVX(c291001Au, z, c291001Au2, c0ooc);
    }
}

package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPoll;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C593420NPg implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final boolean LLILLJJLI;
    public final C291001Au<BulletinPoll> LLILLL;

    public C593420NPg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C593420NPg)) {
            return false;
        }
        C593420NPg c593420NPg = (C593420NPg) obj;
        return Intrinsics.LJFF(this.LL, c593420NPg.LL) && this.LLILLJJLI == c593420NPg.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c593420NPg.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPollState(optionCountLimit=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", canPublish=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", publishEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C593420NPg(int i) {
        C291001Au<Boolean> c291001Au = new C291001Au<>(Boolean.FALSE);
        C291001Au<BulletinPoll> c291001Au2 = new C291001Au<>(null);
        this.LL = c291001Au;
        this.LLILLJJLI = false;
        this.LLILLL = c291001Au2;
    }
}

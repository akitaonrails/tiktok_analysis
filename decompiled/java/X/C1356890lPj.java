package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356890lPj implements InterfaceC1891350zJl {
    public final User LL;
    public final C1357100lQ4 LLILLJJLI;
    public final boolean LLILLL;
    public final C894700Z8a LLILZ;
    public final List<String> LLILZIL;
    public final boolean LLILZLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return Objects.hash(this.LL.getUid(), Boolean.valueOf(this.LLILLL), this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoViewerItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isActive=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", activityStatusText=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", unwatchedList=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", shouldHint=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Set setLLIIJI;
        if (!areItemTheSame(interfaceC1891350zJl)) {
            return false;
        }
        C1356890lPj c1356890lPj = (C1356890lPj) interfaceC1891350zJl;
        User user = c1356890lPj.LL;
        if (!Intrinsics.LJFF(this.LL.getUid(), user.getUid()) || this.LL.getFollowStatus() != user.getFollowStatus() || this.LL.getFollowerStatus() != user.getFollowerStatus() || this.LLILLL != c1356890lPj.LLILLL || !Intrinsics.LJFF(this.LLILZ, c1356890lPj.LLILZ) || !Objects.equals(this.LL.getMatchedFriendStruct(), user.getMatchedFriendStruct())) {
            return false;
        }
        List<String> list = this.LLILZIL;
        Set setLLIIJI2 = null;
        if (list != null) {
            setLLIIJI = C13LP.LLIIJI(list);
        } else {
            setLLIIJI = null;
        }
        List<String> list2 = c1356890lPj.LLILZIL;
        if (list2 != null) {
            setLLIIJI2 = C13LP.LLIIJI(list2);
        }
        if (!Intrinsics.LJFF(setLLIIJI, setLLIIJI2) || this.LLILZLL != c1356890lPj.LLILZLL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1356890lPj)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getUid(), ((C1356890lPj) interfaceC1891350zJl).LL.getUid());
    }

    public final boolean equals(Object obj) {
        Set setLLIIJI;
        if (!(obj instanceof C1356890lPj)) {
            return false;
        }
        C1356890lPj c1356890lPj = (C1356890lPj) obj;
        if (!Intrinsics.LJFF(this.LL.getUid(), c1356890lPj.LL.getUid()) || this.LLILLL != c1356890lPj.LLILLL || !Intrinsics.LJFF(this.LLILZ, c1356890lPj.LLILZ)) {
            return false;
        }
        List<String> list = this.LLILZIL;
        Set setLLIIJI2 = null;
        if (list != null) {
            setLLIIJI = C13LP.LLIIJI(list);
        } else {
            setLLIIJI = null;
        }
        List<String> list2 = c1356890lPj.LLILZIL;
        if (list2 != null) {
            setLLIIJI2 = C13LP.LLIIJI(list2);
        }
        if (!Intrinsics.LJFF(setLLIIJI, setLLIIJI2) || this.LLILZLL != c1356890lPj.LLILZLL) {
            return false;
        }
        return true;
    }

    public static C1356890lPj LIZ(C1356890lPj c1356890lPj, List list, int i) {
        User user;
        C1357100lQ4 c1357100lQ4;
        boolean z;
        boolean z2;
        List list2 = list;
        C894700Z8a c894700Z8a = null;
        if ((i & 1) != 0) {
            user = c1356890lPj.LL;
        } else {
            user = null;
        }
        if ((i & 2) != 0) {
            c1357100lQ4 = c1356890lPj.LLILLJJLI;
        } else {
            c1357100lQ4 = null;
        }
        if ((i & 4) != 0) {
            z = c1356890lPj.LLILLL;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            c894700Z8a = c1356890lPj.LLILZ;
        }
        if ((i & 16) != 0) {
            list2 = c1356890lPj.LLILZIL;
        }
        if ((i & 32) != 0) {
            z2 = c1356890lPj.LLILZLL;
        } else {
            z2 = false;
        }
        c1356890lPj.getClass();
        return new C1356890lPj(user, c1357100lQ4, z, c894700Z8a, list2, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1356890lPj(User user, C1357100lQ4 c1357100lQ4, List list, boolean z, int i) {
        C894700Z8a c894700Z8a;
        boolean z2 = z;
        if ((i & 8) != 0) {
            c894700Z8a = C894700Z8a.LJI;
        } else {
            c894700Z8a = null;
        }
        this(user, c1357100lQ4, false, c894700Z8a, (i & 16) == 0 ? list : null, (i & 32) != 0 ? false : z2);
    }

    public C1356890lPj(User user, C1357100lQ4 c1357100lQ4, boolean z, C894700Z8a c894700Z8a, List<String> list, boolean z2) {
        this.LL = user;
        this.LLILLJJLI = c1357100lQ4;
        this.LLILLL = z;
        this.LLILZ = c894700Z8a;
        this.LLILZIL = list;
        this.LLILZLL = z2;
    }
}

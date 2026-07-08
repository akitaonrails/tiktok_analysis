package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356860lPg implements InterfaceC1891350zJl {
    public final User LL;
    public final C1357110lQ5 LLILLJJLI;
    public boolean LLILLL;
    public final boolean LLILZ;
    public final C894700Z8a LLILZIL;
    public final List<String> LLILZLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return Objects.hash(this.LL.getUid(), Boolean.valueOf(this.LLILZ), this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LikeItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", shouldHint=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isActive=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", activityStatusText=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", unwatchedList=");
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
        C1356860lPg c1356860lPg = (C1356860lPg) interfaceC1891350zJl;
        User user = c1356860lPg.LL;
        if (!Intrinsics.LJFF(this.LL.getUid(), user.getUid()) || this.LL.getFollowStatus() != user.getFollowStatus() || this.LL.getFollowerStatus() != user.getFollowerStatus() || this.LLILZ != c1356860lPg.LLILZ || !Intrinsics.LJFF(this.LLILZIL, c1356860lPg.LLILZIL) || !Objects.equals(this.LL.getMatchedFriendStruct(), user.getMatchedFriendStruct())) {
            return false;
        }
        List<String> list = this.LLILZLL;
        Set setLLIIJI2 = null;
        if (list != null) {
            setLLIIJI = C13LP.LLIIJI(list);
        } else {
            setLLIIJI = null;
        }
        List<String> list2 = c1356860lPg.LLILZLL;
        if (list2 != null) {
            setLLIIJI2 = C13LP.LLIIJI(list2);
        }
        if (!Intrinsics.LJFF(setLLIIJI, setLLIIJI2) || this.LLILLL != c1356860lPg.LLILLL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1356860lPg)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getUid(), ((C1356860lPg) interfaceC1891350zJl).LL.getUid());
    }

    public final boolean equals(Object obj) {
        Set setLLIIJI;
        if (!(obj instanceof C1356860lPg)) {
            return false;
        }
        C1356860lPg c1356860lPg = (C1356860lPg) obj;
        if (!Intrinsics.LJFF(this.LL.getUid(), c1356860lPg.LL.getUid()) || this.LLILZ != c1356860lPg.LLILZ || !Intrinsics.LJFF(this.LLILZIL, c1356860lPg.LLILZIL)) {
            return false;
        }
        List<String> list = this.LLILZLL;
        Set setLLIIJI2 = null;
        if (list != null) {
            setLLIIJI = C13LP.LLIIJI(list);
        } else {
            setLLIIJI = null;
        }
        List<String> list2 = c1356860lPg.LLILZLL;
        if (list2 != null) {
            setLLIIJI2 = C13LP.LLIIJI(list2);
        }
        if (!Intrinsics.LJFF(setLLIIJI, setLLIIJI2) || this.LLILLL != c1356860lPg.LLILLL) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1356860lPg(User user, C1357110lQ5 c1357110lQ5, boolean z, List list, int i) {
        C894700Z8a c894700Z8a;
        if ((i & 16) != 0) {
            c894700Z8a = C894700Z8a.LJI;
        } else {
            c894700Z8a = null;
        }
        this(user, c1357110lQ5, z, false, c894700Z8a, (i & 32) == 0 ? list : null);
    }

    public C1356860lPg(User user, C1357110lQ5 c1357110lQ5, boolean z, boolean z2, C894700Z8a c894700Z8a, List<String> list) {
        this.LL = user;
        this.LLILLJJLI = c1357110lQ5;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = c894700Z8a;
        this.LLILZLL = list;
    }
}

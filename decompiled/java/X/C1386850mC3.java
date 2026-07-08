package X;

import com.ss.android.ugc.profile.business.ci.viewer.api.ProfileViewerInfo;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mC3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386850mC3 implements InterfaceC1891350zJl {
    public final ProfileViewerInfo LL;
    public final List<String> LLILLJJLI;
    public final Integer LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return Objects.hash(this.LL.user.getUid());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileViewerItem(viewer=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", unwatchedList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Set setLLIIJI;
        if (!(interfaceC1891350zJl instanceof C1386850mC3)) {
            return false;
        }
        C1386850mC3 c1386850mC3 = (C1386850mC3) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL.user.getUid(), c1386850mC3.LL.user.getUid()) || !Intrinsics.LJFF(this.LLILLL, c1386850mC3.LLILLL)) {
            return false;
        }
        List<String> list = this.LLILLJJLI;
        Set setLLIIJI2 = null;
        if (list != null) {
            setLLIIJI = C13LP.LLIIJI(list);
        } else {
            setLLIIJI = null;
        }
        List<String> list2 = c1386850mC3.LLILLJJLI;
        if (list2 != null) {
            setLLIIJI2 = C13LP.LLIIJI(list2);
        }
        if (!Intrinsics.LJFF(setLLIIJI, setLLIIJI2)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1386850mC3)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.user.getUid(), ((C1386850mC3) interfaceC1891350zJl).LL.user.getUid());
    }

    public final boolean equals(Object obj) {
        Set setLLIIJI;
        if (!(obj instanceof C1386850mC3)) {
            return false;
        }
        C1386850mC3 c1386850mC3 = (C1386850mC3) obj;
        if (!Intrinsics.LJFF(this.LL.user.getUid(), c1386850mC3.LL.user.getUid()) || !Intrinsics.LJFF(this.LLILLL, c1386850mC3.LLILLL)) {
            return false;
        }
        List<String> list = this.LLILLJJLI;
        Set setLLIIJI2 = null;
        if (list != null) {
            setLLIIJI = C13LP.LLIIJI(list);
        } else {
            setLLIIJI = null;
        }
        List<String> list2 = c1386850mC3.LLILLJJLI;
        if (list2 != null) {
            setLLIIJI2 = C13LP.LLIIJI(list2);
        }
        if (!Intrinsics.LJFF(setLLIIJI, setLLIIJI2)) {
            return false;
        }
        return true;
    }

    public C1386850mC3(ProfileViewerInfo profileViewerInfo, List<String> list, Integer num) {
        this.LL = profileViewerInfo;
        this.LLILLJJLI = list;
        this.LLILLL = num;
    }

    public static C1386850mC3 LIZ(C1386850mC3 c1386850mC3, List list, Integer num, int i) {
        ProfileViewerInfo profileViewerInfo;
        if ((i & 1) != 0) {
            profileViewerInfo = c1386850mC3.LL;
        } else {
            profileViewerInfo = null;
        }
        if ((i & 2) != 0) {
            list = c1386850mC3.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            num = c1386850mC3.LLILLL;
        }
        c1386850mC3.getClass();
        return new C1386850mC3(profileViewerInfo, list, num);
    }
}

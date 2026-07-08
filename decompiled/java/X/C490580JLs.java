package X;

import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490580JLs implements InterfaceC2753014t {
    public final Long LL;
    public final Long LLILLJJLI;
    public final List<SMBCourseVideo> LLILLL;

    public C490580JLs() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C490580JLs)) {
            return false;
        }
        C490580JLs c490580JLs = (C490580JLs) obj;
        return Intrinsics.LJFF(this.LL, c490580JLs.LL) && Intrinsics.LJFF(this.LLILLJJLI, c490580JLs.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c490580JLs.LLILLL);
    }

    public final int hashCode() {
        Long l = this.LL;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<SMBCourseVideo> list = this.LLILLL;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CourseDetailGScopeSource(anchorUid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", courseId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", videoList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C490580JLs(List list, Long l, Long l2) {
        this.LL = l;
        this.LLILLJJLI = l2;
        this.LLILLL = list;
    }
}

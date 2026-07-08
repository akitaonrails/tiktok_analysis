package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeDisableActionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wOM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778880wOM {
    public final NoticeDisableActionInfo LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778880wOM)) {
            return false;
        }
        C1778880wOM c1778880wOM = (C1778880wOM) obj;
        return Intrinsics.LJFF(this.LIZ, c1778880wOM.LIZ) && this.LIZIZ == c1778880wOM.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisableInfoWrapper(disableActionInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", disable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778880wOM(NoticeDisableActionInfo noticeDisableActionInfo, boolean z) {
        this.LIZ = noticeDisableActionInfo;
        this.LIZIZ = z;
    }
}

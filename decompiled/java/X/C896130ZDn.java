package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0ZDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896130ZDn {
    public final Context LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final User LIZLLL;
    public final C0ZD9 LJ;
    public final String LJFF;
    public final boolean LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeNudgeInfoWrapper(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", noticeId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isNoticeRead=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", noticeSender=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", nudgeInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", alwaysShowBtnDebugFlag=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C896130ZDn(Context context, String str, boolean z, User user, C0ZD9 c0zd9, String str2, boolean z2) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = user;
        this.LJ = c0zd9;
        this.LJFF = str2;
        this.LJI = z2;
    }
}

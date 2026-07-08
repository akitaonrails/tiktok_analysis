package X;

import android.app.NotificationManager;

/* JADX INFO: renamed from: X.0VwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814050VwZ {
    public final int LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", postTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("}, pushLabel=");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(NotificationManager notificationManager) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushMsgManager cancel notify item:  ");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        notificationManager.cancel(this.LIZJ, this.LIZ);
        int i = this.LIZ;
        long j = this.LIZIZ;
        String str = this.LIZLLL;
        int i2 = C813990VwT.LJFF;
        int i3 = C813990VwT.LJI;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "rule_id");
        c2344009Gk.LIZLLL(j, "post_time");
        c2344009Gk.LJIIIIZZ("push_label", str);
        c2344009Gk.LIZJ(i2, "group_cnt");
        c2344009Gk.LIZJ(i3, "msg_cnt");
        C20684815ws.LJIILLIIL("push_cancel_msg", c2344009Gk.LIZ);
    }

    public C814050VwZ(int i, String str, long j, String str2) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}

package X;

import android.app.NotificationManager;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0VwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814040VwY {
    public final String LIZ;
    public C814050VwZ LIZIZ = new C814050VwZ(0, "", Long.MAX_VALUE, "undefined");
    public final ArrayList<C814050VwZ> LIZJ = new ArrayList<>();
    public long LIZLLL = Long.MIN_VALUE;
    public long LJ = Long.MAX_VALUE;

    public C814040VwY(String str) {
        this.LIZ = str;
    }

    public final void LIZ(C814050VwZ c814050VwZ) {
        this.LIZJ.add(c814050VwZ);
        if (!TextUtils.equals(c814050VwZ.LIZJ, "app_summary_tag")) {
            long j = c814050VwZ.LIZIZ;
            if (j < this.LIZIZ.LIZIZ) {
                this.LIZIZ = c814050VwZ;
                this.LJ = j;
            }
        }
        if (!TextUtils.equals(c814050VwZ.LIZJ, "app_summary_tag")) {
            long j2 = c814050VwZ.LIZIZ;
            if (j2 > this.LIZLLL) {
                this.LIZLLL = j2;
            }
        }
    }

    public final void LIZIZ(NotificationManager notificationManager) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushMsgManager cancel one in group: ");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ.LIZ(notificationManager);
        if (this.LIZJ.size() == 2) {
            for (C814050VwZ c814050VwZ : this.LIZJ) {
                if (TextUtils.equals(c814050VwZ.LIZJ, "app_summary_tag")) {
                    c814050VwZ.LIZ(notificationManager);
                }
            }
        }
    }
}

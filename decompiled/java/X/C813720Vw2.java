package X;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Vw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813720Vw2 extends AbstractC814720Vxe {
    public final ArrayList<CharSequence> LJ = new ArrayList<>();

    @Override // X.AbstractC814720Vxe
    public final String LJ() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // X.AbstractC814720Vxe
    public final void LIZIZ(C813530Vvj c813530Vvj) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(c813530Vvj.LIZIZ).setBigContentTitle(this.LIZIZ);
        if (this.LIZLLL) {
            bigContentTitle.setSummaryText(this.LIZJ);
        }
        Iterator<CharSequence> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            bigContentTitle.addLine(it2.next());
        }
    }
}

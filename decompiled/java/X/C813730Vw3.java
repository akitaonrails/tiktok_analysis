package X;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: renamed from: X.0Vw3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813730Vw3 extends AbstractC814720Vxe {
    public CharSequence LJ;

    @Override // X.AbstractC814720Vxe
    public final String LJ() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // X.AbstractC814720Vxe
    public final void LIZ(Bundle bundle) {
        super.LIZ(bundle);
    }

    @Override // X.AbstractC814720Vxe
    public final void LIZIZ(C813530Vvj c813530Vvj) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(c813530Vvj.LIZIZ).setBigContentTitle(this.LIZIZ).bigText(this.LJ);
        if (this.LIZLLL) {
            bigTextStyleBigText.setSummaryText(this.LIZJ);
        }
    }
}

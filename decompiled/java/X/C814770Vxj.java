package X;

import android.app.Notification;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;

/* JADX INFO: renamed from: X.0Vxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814770Vxj extends AbstractC814720Vxe {
    public int[] LJ;
    public MediaSessionCompat.Token LJFF;

    @Override // X.AbstractC814720Vxe
    public final RemoteViews LJFF() {
        return null;
    }

    @Override // X.AbstractC814720Vxe
    public final RemoteViews LJI() {
        return null;
    }

    public C814770Vxj() {
    }

    public C814770Vxj(C813610Vvr c813610Vvr) {
        LJIIIIZZ(c813610Vvr);
    }

    @Override // X.AbstractC814720Vxe
    public final void LIZIZ(C813530Vvj c813530Vvj) {
        Notification.Builder builder = c813530Vvj.LIZIZ;
        Notification.MediaStyle mediaStyleLIZ = C814780Vxk.LIZ();
        C814780Vxk.LIZIZ(mediaStyleLIZ, this.LJ, this.LJFF);
        C814780Vxk.LIZLLL(builder, mediaStyleLIZ);
    }
}

package X;

import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: X.0Vvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813690Vvz extends AbstractC814720Vxe {
    public IconCompat LJ;
    public IconCompat LJFF;
    public boolean LJI;

    @Override // X.AbstractC814720Vxe
    public final String LJ() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // X.AbstractC814720Vxe
    public final void LIZIZ(C813530Vvj c813530Vvj) {
        Bitmap bitmapLIZJ;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(c813530Vvj.LIZIZ).setBigContentTitle(this.LIZIZ);
        IconCompat iconCompat = this.LJ;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                C813700Vw0.LIZ(bigContentTitle, C815270VyX.LJFF(iconCompat, c813530Vvj.LIZ));
            } else {
                int iLIZJ = iconCompat.LIZ;
                if (iLIZJ == -1) {
                    iLIZJ = C815270VyX.LIZJ(iconCompat.LIZIZ);
                }
                if (iLIZJ == 1) {
                    IconCompat iconCompat2 = this.LJ;
                    int i = iconCompat2.LIZ;
                    if (i == -1) {
                        Object obj = iconCompat2.LIZIZ;
                        if (obj instanceof Bitmap) {
                            bitmapLIZJ = (Bitmap) obj;
                        } else {
                            bitmapLIZJ = null;
                        }
                    } else if (i == 1) {
                        bitmapLIZJ = (Bitmap) iconCompat2.LIZIZ;
                    } else if (i == 5) {
                        bitmapLIZJ = IconCompat.LIZJ((Bitmap) iconCompat2.LIZIZ, true);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("called getBitmap() on ");
                        sbLIZ.append(iconCompat2);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmapLIZJ);
                }
            }
        }
        if (this.LJI) {
            IconCompat iconCompat3 = this.LJFF;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                C813710Vw1.LIZ(bigContentTitle, C815270VyX.LJFF(iconCompat3, c813530Vvj.LIZ));
            }
        }
        if (this.LIZLLL) {
            bigContentTitle.setSummaryText(this.LIZJ);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            C813700Vw0.LIZJ(bigContentTitle, false);
            C813700Vw0.LIZIZ(bigContentTitle, null);
        }
    }

    public final void LJIIIZ(Bitmap bitmap) {
        IconCompat iconCompatLJ;
        if (bitmap == null) {
            iconCompatLJ = null;
        } else {
            iconCompatLJ = IconCompat.LJ(bitmap);
        }
        this.LJFF = iconCompatLJ;
        this.LJI = true;
    }
}

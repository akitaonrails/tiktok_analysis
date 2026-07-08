package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Vvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813610Vvr {
    public final Context LIZ;
    public CharSequence LJ;
    public CharSequence LJFF;
    public PendingIntent LJI;
    public PendingIntent LJII;
    public IconCompat LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public AbstractC814720Vxe LJIIL;
    public CharSequence LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public String LJIIZILJ;
    public boolean LJIJ;
    public String LJIJJ;
    public Bundle LJIJJLI;
    public RemoteViews LJJI;
    public RemoteViews LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public C813680Vvy LJJIIJ;
    public long LJJIIJZLJL;
    public final boolean LJJIIZ;
    public final Notification LJJIIZI;
    public final ArrayList<String> LJJIJ;
    public final ArrayList<C813540Vvk> LIZIZ = new ArrayList<>();
    public final ArrayList<C815260VyW> LIZJ = new ArrayList<>();
    public final ArrayList<C813540Vvk> LIZLLL = new ArrayList<>();
    public boolean LJIIJJI = true;
    public boolean LJIJI = false;
    public int LJIL = 0;
    public int LJJ = 0;

    public final Notification LIZIZ() {
        RemoteViews remoteViewsLJI;
        Notification notificationBuild;
        C813530Vvj c813530Vvj = new C813530Vvj(this);
        AbstractC814720Vxe abstractC814720Vxe = c813530Vvj.LIZJ.LJIIL;
        if (abstractC814720Vxe != null) {
            abstractC814720Vxe.LIZIZ(c813530Vvj);
            remoteViewsLJI = abstractC814720Vxe.LJI();
        } else {
            remoteViewsLJI = null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 && i < 24) {
            c813530Vvj.LIZIZ.setExtras(c813530Vvj.LJI);
            notificationBuild = c813530Vvj.LIZIZ.build();
            RemoteViews remoteViews = c813530Vvj.LIZLLL;
            if (remoteViews != null) {
                notificationBuild.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = c813530Vvj.LJ;
            if (remoteViews2 != null) {
                notificationBuild.bigContentView = remoteViews2;
            }
        } else {
            notificationBuild = c813530Vvj.LIZIZ.build();
        }
        if (remoteViewsLJI != null) {
            notificationBuild.contentView = remoteViewsLJI;
        } else {
            RemoteViews remoteViews3 = c813530Vvj.LIZJ.LJJI;
            if (remoteViews3 != null) {
                notificationBuild.contentView = remoteViews3;
            }
        }
        if (abstractC814720Vxe != null) {
            RemoteViews remoteViewsLJFF = abstractC814720Vxe.LJFF();
            if (remoteViewsLJFF != null) {
                notificationBuild.bigContentView = remoteViewsLJFF;
            }
            c813530Vvj.LIZJ.LJIIL.LJII();
            Bundle bundle = notificationBuild.extras;
            if (bundle != null) {
                abstractC814720Vxe.LIZ(bundle);
            }
        }
        return notificationBuild;
    }

    public static CharSequence LIZJ(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final void LIZLLL(boolean z) {
        LJII(16, z);
    }

    public final void LJ(CharSequence charSequence) {
        this.LJFF = LIZJ(charSequence);
    }

    public final void LJFF(CharSequence charSequence) {
        this.LJ = LIZJ(charSequence);
    }

    public final void LJI(int i) {
        Notification notification = this.LJJIIZI;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void LJIIIIZZ(Bitmap bitmap) {
        IconCompat iconCompatLJ;
        if (bitmap == null) {
            iconCompatLJ = null;
        } else {
            Context context = this.LIZ;
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ph);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.pg);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            iconCompatLJ = IconCompat.LJ(bitmap);
        }
        this.LJIIIIZZ = iconCompatLJ;
    }

    public final void LJIIIZ(Uri uri) {
        Notification notification = this.LJJIIZI;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder builderLJ = C813640Vvu.LJ(C813640Vvu.LIZJ(C813640Vvu.LIZIZ(), 4), 5);
        this.LJJIIZI.audioAttributes = C813640Vvu.LIZ(builderLJ);
    }

    public final void LJIIJ(AbstractC814720Vxe abstractC814720Vxe) {
        if (this.LJIIL != abstractC814720Vxe) {
            this.LJIIL = abstractC814720Vxe;
            if (abstractC814720Vxe != null) {
                abstractC814720Vxe.LJIIIIZZ(this);
            }
        }
    }

    public C813610Vvr(Context context, String str) {
        Notification notification = new Notification();
        this.LJJIIZI = notification;
        this.LIZ = context;
        this.LJJII = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.LJIIJ = 0;
        this.LJJIJ = new ArrayList<>();
        this.LJJIIZ = true;
    }

    public final void LJII(int i, boolean z) {
        if (z) {
            Notification notification = this.LJJIIZI;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.LJJIIZI;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    public final void LIZ(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        ArrayList<C813540Vvk> arrayList = this.LIZIZ;
        IconCompat iconCompatLJFF = null;
        if (i != 0) {
            iconCompatLJFF = IconCompat.LJFF(null, "", i);
        }
        arrayList.add(new C813540Vvk(iconCompatLJFF, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false));
    }
}

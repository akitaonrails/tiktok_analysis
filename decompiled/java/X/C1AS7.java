package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.1AS7, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AS7 {
    public final Context LIZ;
    public final MediaSessionCompat.Token LIZIZ;
    public final ComponentName LIZJ;
    public final int LIZLLL;
    public final int LJ = hashCode();
    public final int LJFF = 201326592;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(616));

    public final PendingIntent LIZLLL() {
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZJ);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 3);
        return PendingIntent.getService(context, 3, intent, this.LJFF);
    }

    public final void LIZ(C813610Vvr c813610Vvr, boolean z) {
        int i;
        if (z) {
            i = R.drawable.fj_;
        } else {
            i = R.drawable.fja;
        }
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZJ);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 5);
        c813610Vvr.LIZ(i, "SkipToNext", PendingIntent.getService(context, 5, intent, this.LJFF));
    }

    public final void LIZIZ(C813610Vvr c813610Vvr, boolean z) {
        int i;
        if (z) {
            i = R.drawable.fjb;
        } else {
            i = R.drawable.fj9;
        }
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZJ);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 4);
        c813610Vvr.LIZ(i, "PlayOrPause", PendingIntent.getService(context, 4, intent, this.LJFF));
    }

    public final void LIZJ(C813610Vvr c813610Vvr, boolean z) {
        int i;
        if (z) {
            i = R.drawable.fjc;
        } else {
            i = R.drawable.fjd;
        }
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZJ);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 6);
        c813610Vvr.LIZ(i, "SkipToPrevious", PendingIntent.getService(context, 6, intent, this.LJFF));
    }

    public C1AS7(Context context, MediaSessionCompat.Token token, ComponentName componentName, int i) {
        this.LIZ = context;
        this.LIZIZ = token;
        this.LIZJ = componentName;
        this.LIZLLL = i;
    }
}

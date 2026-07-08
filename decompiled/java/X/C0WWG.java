package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: renamed from: X.0WWG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WWG {
    public Bundle LIZJ;
    public Bundle LIZLLL;
    public final Intent LIZ = new Intent("android.intent.action.VIEW");
    public final C0WWI LIZIZ = new C0WWI();
    public int LJ = 0;
    public final boolean LJFF = true;

    public final C0WWF LIZ() {
        if (!this.LIZ.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIIZ(bundle, null, "android.support.customtabs.extra.SESSION");
            this.LIZ.putExtras(bundle);
        }
        this.LIZ.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.LJFF);
        Intent intent = this.LIZ;
        C0WWI c0wwi = this.LIZIZ;
        c0wwi.getClass();
        intent.putExtras(new C0WWH(c0wwi.LIZ, c0wwi.LIZIZ).LIZ());
        Bundle bundle2 = this.LIZLLL;
        if (bundle2 != null) {
            this.LIZ.putExtras(bundle2);
        }
        this.LIZ.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.LJ);
        return new C0WWF(this.LIZ, this.LIZJ);
    }

    public C0WWG() {
    }

    public C0WWG(C0W59 c0w59) {
        if (c0w59 != null) {
            LIZIZ(c0w59);
        }
    }

    public final void LIZIZ(C0W59 c0w59) {
        this.LIZ.setPackage(C2204961BRm.LJJIJIL(c0w59.LIZLLL, new C0WZX("dTF6Tg0zW9KSV0UuUgGBdArd5WzTSLJm2jdlfRR5yJDnfYZwDzY/zN67IWc=", new String[]{"01789"})));
        IBinder iBinderAsBinder = c0w59.LIZJ.asBinder();
        PendingIntent pendingIntent = c0w59.LJ;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIIZ(bundle, iBinderAsBinder, "android.support.customtabs.extra.SESSION");
        if (pendingIntent != null) {
            C786410Ut5.LJJIJL(bundle, "android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        this.LIZ.putExtras(bundle);
    }
}

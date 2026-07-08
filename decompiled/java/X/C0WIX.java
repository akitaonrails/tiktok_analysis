package X;

import Y.ARunnableS113S0100000_13;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0WIX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WIX implements IBinder.DeathRecipient {
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC820920WIg LLILZ;
    public final HashMap<String, List<C0WIY<IBinder, Bundle>>> LLILZIL = new HashMap<>();
    public C0WIH LLILZLL;
    public final /* synthetic */ MediaBrowserServiceCompat LLIZ;

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.LLIZ.LLILZIL.post(new ARunnableS113S0100000_13(this, 8));
    }

    public C0WIX(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, int i, int i2, InterfaceC820920WIg interfaceC820920WIg) {
        this.LLIZ = mediaBrowserServiceCompat;
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        new C2179741ASm(str, i, i2);
        this.LLILZ = interfaceC820920WIg;
    }
}

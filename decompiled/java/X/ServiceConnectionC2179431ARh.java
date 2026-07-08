package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1ARh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class ServiceConnectionC2179431ARh implements ServiceConnection {
    public final InterfaceC739770T0d LL;
    public BackgroundAudioBrowserService LLILLJJLI;

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
    }

    public final void LIZIZ() {
        BackgroundAudioBrowserService backgroundAudioBrowserService = this.LLILLJJLI;
        if (backgroundAudioBrowserService != null) {
            backgroundAudioBrowserService.LIZ();
        }
    }

    public ServiceConnectionC2179431ARh(InterfaceC739770T0d interfaceC739770T0d) {
        this.LL = interfaceC739770T0d;
    }

    public final void LIZ(Aweme aweme) {
        BackgroundAudioBrowserService backgroundAudioBrowserService = this.LLILLJJLI;
        if (backgroundAudioBrowserService != null) {
            C2179501ARo c2179501ARo = backgroundAudioBrowserService.LLJI;
            if (c2179501ARo == null) {
                c2179501ARo = null;
            }
            c2179501ARo.LJFF.LJFF(true);
            C1AS1 c1as1 = backgroundAudioBrowserService.LLJ;
            if (c1as1 == null) {
                c1as1 = null;
            }
            c1as1.LIZJ().LIZ = true;
            C2179501ARo c2179501ARo2 = backgroundAudioBrowserService.LLJI;
            if (c2179501ARo2 == null) {
                c2179501ARo2 = null;
            }
            C1513690pUd c1513690pUd = new C1513690pUd(aweme);
            C821000WIo c821000WIoLIZ = c2179501ARo2.LIZ();
            c821000WIoLIZ.LIZLLL("android.media.metadata.TITLE", c1513690pUd.getSongName());
            c821000WIoLIZ.LIZLLL("android.media.metadata.ALBUM", "");
            c821000WIoLIZ.LIZLLL("android.media.metadata.ARTIST", c1513690pUd.getArtistName());
            long duration = c2179501ARo2.LIZIZ.getDuration();
            if (duration <= 0) {
                duration = -1;
            }
            c821000WIoLIZ.LIZJ(duration);
            c821000WIoLIZ.LIZIZ(null, "android.media.metadata.ART");
            c2179501ARo2.LJFF.LJFF(true);
            c2179501ARo2.LJFF.LJII(c2179501ARo2.LIZ().LIZ());
            C2179501ARo c2179501ARo3 = backgroundAudioBrowserService.LLJI;
            if (c2179501ARo3 == null) {
                c2179501ARo3 = null;
            }
            c2179501ARo3.LJ();
            C2179501ARo c2179501ARo4 = backgroundAudioBrowserService.LLJI;
            if (c2179501ARo4 == null) {
                c2179501ARo4 = null;
            }
            c2179501ARo4.LIZLLL();
            C1AS1 c1as12 = backgroundAudioBrowserService.LLJ;
            if (c1as12 == null) {
                c1as12 = null;
            }
            C1513690pUd c1513690pUd2 = new C1513690pUd(aweme);
            c1as12.getClass();
            C2179451ARj c2179451ARj = new C2179451ARj();
            c2179451ARj.LIZ = Boolean.FALSE;
            c2179451ARj.LIZIZ = Boolean.valueOf(c1as12.LIZLLL.LJFF());
            c2179451ARj.LIZJ = Boolean.valueOf(c1as12.LIZLLL.LJI());
            c2179451ARj.LIZLLL = c1513690pUd2.getSongName();
            c2179451ARj.LJ = c1513690pUd2.getArtistName();
            c2179451ARj.LJFF = "";
            c2179451ARj.LJI = null;
            c1as12.LJFF(c2179451ARj);
            c1as12.LJIIIZ = c2179451ARj;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2179461ARk(aweme, backgroundAudioBrowserService, null), 3);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LLILLJJLI = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        BinderC2179471ARl binderC2179471ARl;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/ss/android/ugc/aweme/feed/background/BackgroundAudioBrowserServiceConnection", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3jN/K6A6F2JESnNLb/JY+ZznNlu1tocdq2lb0UA3wVZsVth3EOej7yM4RxFy8JtHCY4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (obj2 != null) {
                iBinder = (IBinder) obj2;
            }
        }
        if ((iBinder instanceof BinderC2179471ARl) && (binderC2179471ARl = (BinderC2179471ARl) iBinder) != null) {
            BackgroundAudioBrowserService backgroundAudioBrowserService = binderC2179471ARl.LL.get();
            this.LLILLJJLI = backgroundAudioBrowserService;
            if (backgroundAudioBrowserService != null) {
                InterfaceC739770T0d interfaceC739770T0d = this.LL;
                backgroundAudioBrowserService.LLILLJJLI.LL = interfaceC739770T0d;
                backgroundAudioBrowserService.LLILLL.LL = interfaceC739770T0d;
                backgroundAudioBrowserService.LLILZ.LL = interfaceC739770T0d;
            }
            C1618110sD3.LIZ = true;
            Iterator it2 = ((ArrayList) C1618110sD3.LIZIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC2179411ARf) it2.next()).LIZ();
            }
        }
    }
}

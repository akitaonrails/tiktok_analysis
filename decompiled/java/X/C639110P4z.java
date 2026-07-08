package X;

import Y.ARunnableS109S0100000_9;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEasterEggAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicEasterEggAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0P4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C639110P4z extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    public static final void LJJZZIII$0(C639110P4z c639110P4z, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
    }

    public static final void LJJZZIII$1(C639110P4z c639110P4z, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
    }

    @Override // X.AbstractC1537870q7d
    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 0:
                LJJZZIII$0(this, interfaceC1541990qEH, str);
                break;
            case 1:
                LJJZZIII$1(this, interfaceC1541990qEH, str);
                break;
            default:
                super.LJJZZIII(interfaceC1541990qEH, str);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        if (2 - this.$t != 0) {
            super.LJL(interfaceC1541990qEH, str, c1542120qEU);
        } else {
            LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 0:
                LJLIIL$0(this, interfaceC1541990qEH, str);
                break;
            case 1:
                LJLIIL$1(this, interfaceC1541990qEH, str);
                break;
            default:
                super.LJLIIL(interfaceC1541990qEH, str);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        if (3 - this.$t != 0) {
            super.onDestroy();
        } else {
            onDestroy$0(this);
        }
    }

    public static final void onDestroy$0(C639110P4z c639110P4z) {
        Function0 function0 = (Function0) c639110P4z.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public C639110P4z(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIL$0(C639110P4z c639110P4z, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        BulletinEasterEggAssem bulletinEasterEggAssem = (BulletinEasterEggAssem) c639110P4z.l0;
        if (!bulletinEasterEggAssem.LLJILJIL) {
            C1548820qPI.LIZLLL("onStart", bulletinEasterEggAssem.LLJJI);
            C1548820qPI.LIZLLL("onError", bulletinEasterEggAssem.LLJJIJIIJIL);
            C1548820qPI.LIZLLL("onClick", bulletinEasterEggAssem.LLJJIJI);
            C1548820qPI.LIZLLL("onClose", bulletinEasterEggAssem.LLJJIII);
            bulletinEasterEggAssem.LLJILJIL = true;
        }
    }

    public static final void LJLIIL$1(C639110P4z c639110P4z, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        MusicEasterEggAssem musicEasterEggAssem = (MusicEasterEggAssem) c639110P4z.l0;
        if (!musicEasterEggAssem.LLJJIJI) {
            C1548820qPI.LIZLLL("onStart", musicEasterEggAssem.LLJJJJ);
            C1548820qPI.LIZLLL("onError", musicEasterEggAssem.LLJJL);
            C1548820qPI.LIZLLL("onClick", musicEasterEggAssem.LLJJJJLIIL);
            C1548820qPI.LIZLLL("onClose", musicEasterEggAssem.LLJJJJJIL);
            musicEasterEggAssem.LLJJIJI = true;
        }
    }

    public static final void LJL$0(C639110P4z c639110P4z, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        c639110P4z.LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        C0OUT c0out = (C0OUT) c639110P4z.l0;
        HandlerHook.viewPost(c0out.LJ, new ARunnableS109S0100000_9(c0out, 160));
    }
}

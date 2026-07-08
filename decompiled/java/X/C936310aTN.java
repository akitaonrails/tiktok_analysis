package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarConfigSetting;

/* JADX INFO: renamed from: X.0aTN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936310aTN {
    public final String LIZ;
    public final long LIZIZ;
    public final InterfaceC936370aTT LIZJ;
    public final AnonymousClass0114 LIZLLL;
    public final C11NJ LJ = new C11NJ();
    public C11JF LJFF;
    public long LJI;
    public int LJII;
    public C936320aTO LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final boolean LJIIJJI;
    public long LJIIL;

    public final void LIZ() {
        AnonymousClass0114 anonymousClass0114;
        C11JF c11jf = this.LJFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJ.LJ();
        C936320aTO c936320aTO = this.LJIIIIZZ;
        if (c936320aTO == null || (anonymousClass0114 = this.LIZLLL) == null) {
            return;
        }
        anonymousClass0114.LIZIZ.remove(c936320aTO);
    }

    public C936310aTN(String str, long j, C936260aTI c936260aTI, AnonymousClass0114 anonymousClass0114) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = c936260aTI;
        this.LIZLLL = anonymousClass0114;
        MultiGuestAvatarConfigSetting multiGuestAvatarConfigSetting = MultiGuestAvatarConfigSetting.INSTANCE;
        this.LJIIIZ = multiGuestAvatarConfigSetting.getValue().stylizedTimeout;
        this.LJIIJ = multiGuestAvatarConfigSetting.getValue().fakeProgressTimeout;
        this.LJIIJJI = multiGuestAvatarConfigSetting.getValue().mockAvatarStyleIM == 1;
    }
}

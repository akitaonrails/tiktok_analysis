package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarConfigSetting;

/* JADX INFO: renamed from: X.0aTQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936340aTQ {
    public final String LIZ;
    public final long LIZIZ;
    public final InterfaceC936350aTR LIZJ;
    public final AnonymousClass0114 LIZLLL;
    public final C11NJ LJ = new C11NJ();
    public C11JF LJFF;
    public int LJI;
    public C936330aTP LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final boolean LJIIJ;
    public String LJIIJJI;
    public long LJIIL;

    public final void LIZ() {
        AnonymousClass0114 anonymousClass0114;
        C11JF c11jf = this.LJFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJ.LJ();
        C936330aTP c936330aTP = this.LJII;
        if (c936330aTP != null && (anonymousClass0114 = this.LIZLLL) != null) {
            anonymousClass0114.LIZIZ.remove(c936330aTP);
        }
        C936250aTH.LIZ();
    }

    public C936340aTQ(String str, long j, C936180aTA c936180aTA, AnonymousClass0114 anonymousClass0114) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = c936180aTA;
        this.LIZLLL = anonymousClass0114;
        MultiGuestAvatarConfigSetting multiGuestAvatarConfigSetting = MultiGuestAvatarConfigSetting.INSTANCE;
        this.LJIIIIZZ = multiGuestAvatarConfigSetting.getValue().createAvatarTimeout;
        this.LJIIIZ = multiGuestAvatarConfigSetting.getValue().fakeProgressTimeout;
        this.LJIIJ = multiGuestAvatarConfigSetting.getValue().mockAvatarResultIM == 1;
        this.LJIIJJI = "";
    }
}

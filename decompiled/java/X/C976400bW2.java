package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFallbackConfigSetting;

/* JADX INFO: renamed from: X.0bW2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976400bW2 {
    public final String LIZ;
    public final InterfaceC975520bUc LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public AnonymousClass0956 LIZLLL;
    public final long LJ;
    public final long LJFF;

    public final void LIZ() {
        C20441214yg.LIZIZ(this.LIZ, "polling is canceled, stop polling");
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZLLL = null;
    }

    public C976400bW2(String str, InterfaceC975520bUc interfaceC975520bUc) {
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        this.LIZ = str;
        this.LIZIZ = interfaceC975520bUc;
        this.LIZJ = c054gLIZ;
        LiveMatchFallbackConfigSetting liveMatchFallbackConfigSetting = LiveMatchFallbackConfigSetting.INSTANCE;
        this.LJ = liveMatchFallbackConfigSetting.getValue().interval * 1000;
        this.LJFF = liveMatchFallbackConfigSetting.getValue().maxDuration * 1000;
    }
}

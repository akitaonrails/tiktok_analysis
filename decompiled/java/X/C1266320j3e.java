package X;

import com.ss.android.ugc.profile.business.live.ContentCellLiveEventProtocol;
import com.ss.android.ugc.profile.business.live.ProfileAdvancedFeatureLiveEventProtocol;
import com.ss.android.ugc.profile.business.profile.menu.business.content.minis.ContentCellRichCardUIComponent;

/* JADX INFO: renamed from: X.0j3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266320j3e extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (2 - this.$t != 0) {
            super.LJJZZIII(interfaceC1541990qEH, str);
        } else {
            LJJZZIII$0(this, interfaceC1541990qEH, str);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 1:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
        }
    }

    public C1266320j3e(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C1266320j3e c1266320j3e, InterfaceC1541990qEH interfaceC1541990qEH) {
        ContentCellLiveEventProtocol contentCellLiveEventProtocol = (ContentCellLiveEventProtocol) c1266320j3e.l0;
        if (contentCellLiveEventProtocol.LLJI) {
            contentCellLiveEventProtocol.LJLLL();
        }
    }

    public static final void LJLIIIL$1(C1266320j3e c1266320j3e, InterfaceC1541990qEH interfaceC1541990qEH) {
        ProfileAdvancedFeatureLiveEventProtocol profileAdvancedFeatureLiveEventProtocol = (ProfileAdvancedFeatureLiveEventProtocol) c1266320j3e.l0;
        if (profileAdvancedFeatureLiveEventProtocol.LLJI) {
            profileAdvancedFeatureLiveEventProtocol.LJLILLLLZI();
        }
    }

    public static final void LJJZZIII$0(C1266320j3e c1266320j3e, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C337180DJs.LIZ(((ContentCellRichCardUIComponent) c1266320j3e.l0).LLLFF);
    }
}

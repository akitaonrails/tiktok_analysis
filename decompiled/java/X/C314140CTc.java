package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.feed.platform.popupclean.FCPPopupEnableRule;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.0CTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C314140CTc {
    public static final C314140CTc LIZ = new C314140CTc();
    public static final Keva LIZIZ = Keva.getRepo("new_fcp_popup_rules");
    public static final C01GW LIZJ;
    public static volatile FCPPopupEnableRule LIZLLL;

    static {
        if (C314160CTe.LIZ() == 5 || C314160CTe.LIZ() == 6) {
            C0C5P.LIZJ().LJIIJJI("fcp_popup_enable_rules", new InterfaceC304970BxP() { // from class: X.15qi
                @Override // X.InterfaceC304970BxP
                public final void LIZ() {
                    C0S78.LIZJ(AFwS221S0000000_31.get$arr$(481), true);
                }
            });
        }
        LIZJ = C452501pT.LIZIZ(new C0CTZ());
    }
}

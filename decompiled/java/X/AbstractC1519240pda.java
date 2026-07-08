package X;

import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import java.util.Map;

/* JADX INFO: renamed from: X.0pda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1519240pda implements InterfaceC1914220zue {
    @Override // X.InterfaceC1914220zue
    public final void LIZJ(Boolean bool, String str) {
    }

    @Override // X.InterfaceC1914220zue
    public final void LIZLLL() {
    }

    public void LJI(UniversalPopupAction universalPopupAction, C1519370pdn c1519370pdn) {
    }

    public void LJII() {
    }

    public void LJIIIIZZ(C1519370pdn c1519370pdn) {
    }

    public abstract boolean LJIIIZ(C1519370pdn c1519370pdn);

    public boolean LJIIJ(Map<String, String> map) {
        return false;
    }

    @Override // X.InterfaceC1914220zue
    public final void LIZ(C1519370pdn c1519370pdn) {
        if (LJIIIZ(c1519370pdn)) {
            LJII();
        }
    }

    @Override // X.InterfaceC1914220zue
    public final void LJFF(C1519370pdn c1519370pdn) {
        if (LJIIIZ(c1519370pdn)) {
            LJIIIIZZ(c1519370pdn);
        }
    }

    @Override // X.InterfaceC1914220zue
    public final void LIZIZ(String str, C1519370pdn c1519370pdn) {
        LJIIIZ(c1519370pdn);
    }

    @Override // X.InterfaceC1914220zue
    public final void LJ(UniversalPopupAction universalPopupAction, C1519370pdn c1519370pdn) {
        if (LJIIIZ(c1519370pdn)) {
            LJI(universalPopupAction, c1519370pdn);
        }
    }
}

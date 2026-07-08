package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service;
import com.ss.android.ugc.aweme.platform.AnchorEventCenter;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaFunnelAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaLayoutAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0RxC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712520RxC implements InterfaceC1392640mLO {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final InterfaceC665370Q7z LIZ;
    public final C712510RxB LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final InterfaceC704550RkL LJ;
    public boolean LJII;
    public final C01GW LJFF = C452501pT.LIZIZ(new C705630Rm5(this));
    public final C1392530mLD LJI = new C1392530mLD(this);
    public int LJIIIIZZ = -1;

    @Override // X.InterfaceC1392640mLO
    public final C712520RxC LIZJ() {
        return this;
    }

    @Override // X.InterfaceC1392640mLO
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1392640mLO
    public final String Cf() {
        return this.LIZIZ.LIZJ;
    }

    @Override // X.InterfaceC1392640mLO
    public final List<String> LIZ() {
        return this.LIZIZ.LJI;
    }

    @Override // X.InterfaceC1392640mLO
    public final Activity LIZIZ() {
        return this.LIZIZ.LIZIZ;
    }

    @Override // X.InterfaceC1052240dUM
    public final Fragment LJ() {
        return this.LIZIZ.LJFF;
    }

    @Override // X.InterfaceC1392640mLO
    public final String LJI() {
        String str = this.LIZLLL;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC1392640mLO
    public final boolean LJII() {
        if (this.LJIIIIZZ == -1) {
            this.LJIIIIZZ = LJIIJ();
        }
        return this.LJIIIIZZ <= 1;
    }

    @Override // X.InterfaceC1392640mLO
    public final boolean LJIIIIZZ() {
        IFriendsTabV3Service iFriendsTabV3Service = (IFriendsTabV3Service) PluggableExtentionKt.pluggableSpi$default(IFriendsTabV3Service.class, false, false, false, 14, null);
        if (iFriendsTabV3Service != null) {
            return iFriendsTabV3Service.Pu(this.LIZIZ.LJFF);
        }
        return false;
    }

    @Override // X.InterfaceC1392640mLO
    public final Object LJIIIZ() {
        return this.LIZIZ.LJII;
    }

    public final InterfaceC699890Rcp LJIILJJIL() {
        InteractAreaFunnelAbility interactAreaFunnelAbility;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LIZ;
        if (interfaceC665370Q7z == null || (interactAreaFunnelAbility = (InteractAreaFunnelAbility) C1558520qew.LIZ(interfaceC665370Q7z, InteractAreaFunnelAbility.class, null)) == null || !interactAreaFunnelAbility.j91()) {
            return null;
        }
        return interactAreaFunnelAbility.oW0(EnumC699120Rba.ANCHOR);
    }

    public final List<InterfaceC1393560mMs> LJIILL() {
        return (List) this.LJFF.getValue();
    }

    @Override // X.InterfaceC1392640mLO
    public final Aweme LJJLIIIJJIZ() {
        return this.LIZIZ.LIZ;
    }

    @Override // X.InterfaceC1392640mLO
    public final JSONObject requestId() {
        return this.LIZIZ.LIZLLL;
    }

    public final int LJIIJ() {
        Iterator<InterfaceC1393560mMs> it2 = LJIILL().iterator();
        int iLJJLI = 0;
        while (it2.hasNext()) {
            iLJJLI += it2.next().LJJLI();
        }
        return iLJJLI;
    }

    public final boolean LJIIJJI() {
        InterfaceC1393560mMs interfaceC1393560mMsLJIILLIIL = LJIILLIIL();
        return (interfaceC1393560mMsLJIILLIIL == null || interfaceC1393560mMsLJIILLIIL.LJJJJL() || interfaceC1393560mMsLJIILLIIL.LJJLIIIIJ() || interfaceC1393560mMsLJIILLIIL.LJJLIIIJILLIZJL() || !LJII() || this.LJII) ? false : true;
    }

    public final InterfaceC1393560mMs LJIILLIIL() {
        return (InterfaceC1393560mMs) C13LP.LJJJLL(LJIILL());
    }

    @Override // X.InterfaceC1392640mLO
    public final C1392530mLD LJFF() {
        return this.LJI;
    }

    @Override // X.InterfaceC1392640mLO
    public final String LLIIJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1392640mLO
    public final InterfaceC665370Q7z k0() {
        return this.LIZ;
    }

    public final int LJIILIIL(C1050180dR2 c1050180dR2) {
        int iLJJLI = -1;
        for (InterfaceC1393560mMs interfaceC1393560mMs : LJIILL()) {
            if (Intrinsics.LJFF(interfaceC1393560mMs, c1050180dR2)) {
                return iLJJLI + 1;
            }
            iLJJLI += interfaceC1393560mMs.LJJLI();
        }
        return iLJJLI;
    }

    public final void LJIIZILJ(AnchorEventCenter anchorEventCenter) {
        Iterator<InterfaceC1393560mMs> it2 = LJIILL().iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(anchorEventCenter);
        }
        this.LJI.LIZJ(anchorEventCenter);
    }

    public final void LJIIL(View view, String str, boolean z) {
        InteractAreaLayoutAbility interactAreaLayoutAbility;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LIZ;
        if (interfaceC665370Q7z != null && (interactAreaLayoutAbility = (InteractAreaLayoutAbility) C1558520qew.LIZ(interfaceC665370Q7z, InteractAreaLayoutAbility.class, null)) != null) {
            interactAreaLayoutAbility.ZZ(view, str, z);
        }
    }

    public C712520RxC(InterfaceC665370Q7z interfaceC665370Q7z, C712510RxB c712510RxB, String str, String str2, InterfaceC704550RkL interfaceC704550RkL) {
        this.LIZ = interfaceC665370Q7z;
        this.LIZIZ = c712510RxB;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = interfaceC704550RkL;
    }
}

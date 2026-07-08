package X;

import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0ayT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C955590ayT extends C955670ayb {
    public Room LJ;
    public final RivalsListsData.TopHostInfo LJFF;
    public final C955540ayO LJI;
    public final String LJII;
    public EnumC961080b7K LJIIIIZZ;
    public final boolean LJIIIZ;
    public RivalExtraInfo LJIIJ;
    public boolean LJIIJJI;
    public EnumC955720ayg LJIIL;
    public EnumC955720ayg LJIILIIL;
    public EnumC955770ayl LJIILJJIL;
    public long LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public C955540ayO LJIJI;
    public EnumC961060b7I LJIJJ;
    public String LJIJJLI;

    @Override // X.C955670ayb
    public final boolean LIZJ() {
        if (this.LJIIIZ) {
            return false;
        }
        return super.LIZJ();
    }

    public final boolean LJ() {
        IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
        C954460awe c954460aweLLILL = iMultiHostServiceLJII.LLILL(this.LJ.getOwnerUserId());
        if (c954460aweLLILL != null && ((c954460aweLLILL.LJJIIZ.isInviting() || c954460aweLLILL.LJJIIZ == EnumC950200apm.CANCELING) && c954460aweLLILL.LJJIIZI)) {
            return true;
        }
        C954460awe c954460aweLLILL2 = iMultiHostServiceLJII.LLILL(C950220apo.LJFF());
        if (c954460aweLLILL2 != null) {
            return (c954460aweLLILL2.LJJIIZ.isApplying() || c954460aweLLILL2.LJJIIZ == EnumC950200apm.CANCELING) && c954460aweLLILL2.LJII == this.LJ.getOwnerUserId();
        }
        return false;
    }

    public /* synthetic */ C955590ayT(Room room, RivalsListsData.TopHostInfo topHostInfo, C955540ayO c955540ayO, RivalExtraInfo rivalExtraInfo, String str, EnumC961080b7K enumC961080b7K) {
        this(room, topHostInfo, c955540ayO, rivalExtraInfo, str, enumC961080b7K, false);
    }

    public C955590ayT(Room room, RivalsListsData.TopHostInfo topHostInfo, C955540ayO c955540ayO, RivalExtraInfo rivalExtraInfo, String str, EnumC961080b7K enumC961080b7K, boolean z) {
        this.LJ = room;
        this.LJFF = topHostInfo;
        this.LJI = c955540ayO;
        this.LJII = str;
        this.LJIIIIZZ = enumC961080b7K;
        this.LJIIIZ = z;
        this.LJIIJ = rivalExtraInfo;
        EnumC955720ayg enumC955720ayg = EnumC955720ayg.NORMAL;
        this.LJIIL = enumC955720ayg;
        this.LJIILIIL = enumC955720ayg;
        this.LJIILJJIL = EnumC955770ayl.UNKNOWN;
        this.LJIILL = C158B.LIZ();
        this.LJIJ = LJ();
    }
}

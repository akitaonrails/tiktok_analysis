package X;

import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostPanelBanner;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.EOYBanner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0b77, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC960950b77 extends InteractDialogFragmentBaseContract$AbsPresenter<MultiCoHostInviteListContract$AbsView> {
    public boolean LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public long LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public C410901il LLJILJILJ;
    public CohostPanelBanner LLJILLL;
    public C410901il LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public EnumC919070a1Z LLJJIJIL;
    public EOYBanner LLJJJ;
    public C08JC LLJJJIL;
    public String LLJJJJ;

    public abstract void LJIIIZ(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j);

    public int LJIIJ() {
        return 0;
    }

    public abstract void LJIIJJI(Room room);

    public abstract void LJIIL(C955590ayT c955590ayT, Room room);

    public boolean LJIILIIL(C956250azX c956250azX) {
        return false;
    }

    public abstract void LJIILJJIL(int i, boolean z);

    public List<Room> LJIILL() {
        return null;
    }

    public Map<String, String> LJIIZILJ() {
        return null;
    }

    public Map<Long, RivalExtraInfo> LJIJI() {
        return null;
    }

    public abstract void LJIJJ(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j);

    public void LJIJJLI(C954460awe c954460awe) {
    }

    public void LJJ(C956250azX c956250azX) {
    }

    public void LJJI(int i) {
    }

    public void LJJIFFI(int i) {
    }

    public void LJJII(int i) {
    }

    public abstract void LJJIIJ();

    public abstract void LJJIIJZLJL();

    public abstract void LJJIIZ();

    public void LJJIIZI() {
    }

    public abstract void LJJIJ(C955590ayT c955590ayT);

    public abstract void LJJIJIIJI();

    public void LJJIJIIJIL(EnumC961080b7K enumC961080b7K) {
    }

    public void LJJIJIL(EnumC961230b7Z enumC961230b7Z) {
    }

    public void LJJIJL(EnumC961230b7Z enumC961230b7Z) {
    }

    public Integer LJJIJLIJ() {
        return null;
    }

    public AbstractC960950b77(BaseMultiHostInviteListFragment baseMultiHostInviteListFragment) {
        super(baseMultiHostInviteListFragment);
        this.LLILLJJLI = true;
        this.LLILZ = -1;
        this.LLILZIL = true;
        this.LLIZ = -1;
        this.LLJ = true;
        this.LLJIJIL = -1;
        this.LLJILJIL = -1;
        this.LLJILJILJ = new C410901il();
        this.LLJJ = new C410901il();
        this.LLJJIJI = true;
        this.LLJJIJIL = EnumC919070a1Z.OLD;
        this.LLJJJIL = new C08JC(0);
        this.LLJJJJ = "";
    }
}

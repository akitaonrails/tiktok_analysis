package X;

import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSearchFragment;
import com.bytedance.android.livesdk.chatroom.interact.model.SearchRivalsResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: renamed from: X.0b6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC960710b6j extends InteractDialogFragmentBaseContract$AbsPresenter<MultiCoHostSearchContract$AbsView> {
    public List<SearchRivalsResponse.Cell> LLILLJJLI;
    public List<SearchRivalsResponse.Cell> LLILLL;
    public int LLILZ;
    public C410901il LLILZIL;
    public C410901il LLILZLL;

    public abstract void LJIIIZ(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j);

    public abstract void LJIIJ(Room room);

    public abstract void LJIIJJI(C955590ayT c955590ayT, Room room);

    public abstract void LJIIL();

    public abstract void LJIILIIL(int i);

    public abstract void LJIILJJIL(int i);

    public abstract void LJIILL(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j);

    public abstract void LJIIZILJ(int i, String str, AwS381S0200000_15 awS381S0200000_15);

    public abstract void LJIJI(int i, long j, String str);

    public abstract void LJIJJ(C955590ayT c955590ayT);

    public abstract void LJIJJLI(String str);

    public abstract void LJJ(boolean z);

    public AbstractC960710b6j(MultiCoHostSearchFragment multiCoHostSearchFragment) {
        super(multiCoHostSearchFragment);
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILLJJLI = c13bv;
        this.LLILLL = c13bv;
        this.LLILZ = -1;
        this.LLILZIL = new C410901il();
        this.LLILZLL = new C410901il();
    }
}

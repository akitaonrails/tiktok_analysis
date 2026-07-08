package X;

import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import java.util.Map;

/* JADX INFO: renamed from: X.0aqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC950580aqO extends InteractDialogFragmentBaseContract$AbsPresenter<MultiCoHostBeInvitedContract$AbsView> {
    public abstract Long LJIIIZ();

    public abstract boolean LJIIJ(int i);

    public abstract void LJIIJJI(LinkerInviteContent linkerInviteContent, C954640aww c954640aww, int i, boolean z, boolean z2, boolean z3);

    public abstract void LJIIL(LinkerInviteContent linkerInviteContent, int i, Map<String, ? extends Object> map);

    public abstract void LJIILIIL(C954640aww c954640aww, int i, Map<String, ? extends Object> map);

    public abstract void LJIILJJIL(LinkerInviteContent linkerInviteContent, int i, Map<String, ? extends Object> map);

    public abstract void LJIILL(C954640aww c954640aww, int i, Map<String, ? extends Object> map);

    public abstract void LJIIZILJ(long j);

    public abstract void LJIJI(boolean z);

    public abstract void LJIJJ(boolean z);

    public abstract void LJIJJLI(boolean z);

    public abstract void LJJ();

    public abstract void LJJI(boolean z);

    public AbstractC950580aqO(MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment) {
        super(multiCoHostBeInvitedFragment);
    }
}

package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0a7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922940a7o extends AbstractC922920a7m implements InterfaceC923040a7y {
    public final InterfaceC924460aAG LLJILJILJ;
    public int LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    public final AbstractC923560a8o<LinkPlayerInfo, MultiLiveGuestInfoList> LJII() {
        return (AbstractC923560a8o) this.LLJJI.getValue();
    }

    public final AbstractC923560a8o<LinkListUser, LinkMessage> LJIIIIZZ() {
        return (AbstractC923560a8o) this.LLJJ.getValue();
    }

    public final void release() {
        C11JL c11jl = this.LLIZ;
        if (c11jl != null) {
            c11jl.dispose();
        }
        IMessageManager iMessageManager = this.LLILZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.LINK_MESSAGE.getIntType(), this);
        }
        this.LLILLL.a9(this.LLIZLLLIL);
        LJFF().clear();
        ((HashMap) this.LLJ.getValue()).clear();
        LJII().LJII(true);
        C924810aAp.LJ().LJJII = 0;
        C924250a9v.LIZ().LJJIII(0);
        ((Map) C924650aAZ.LJII.getValue()).clear();
        ((InterfaceC922980a7s) this.LLJJIII.getValue()).dispose();
    }

    @Override // X.InterfaceC923040a7y
    public final AbstractC923560a8o LIZ() {
        return LJIIIIZZ();
    }

    public final void LJIIIZ(boolean z) {
        User user;
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        int iLIZ = C923010a7v.LIZ(LJIIIIZZ());
        List<LinkListUser> listLJ = LJIIIIZZ().LJ();
        if (!(listLJ instanceof Collection) || !listLJ.isEmpty()) {
            Iterator<LinkListUser> it2 = listLJ.iterator();
            while (it2.hasNext() && ((user = it2.next().user) == null || user.getId() != UserService.getInstance().user().getCurrentUserId())) {
            }
        }
        int i = this.LLJILLL;
        if (i > 0) {
            if (iLIZ == 0) {
                C923050a7z.LJI("connection_over");
                LifecycleOwner lifecycleOwner = this.LLILZIL;
                if (lifecycleOwner != null && (lifecycle2 = lifecycleOwner.getLifecycle()) != null) {
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS416S0200000_15(lifecycle2, this, 60));
                } else {
                    C923050a7z.LIZIZ(Integer.valueOf(this.LLJILLL), null, 5);
                }
            }
        } else if (i == 0 && iLIZ > 0 && !z) {
            LifecycleOwner lifecycleOwner2 = this.LLILZIL;
            if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                C500260Jjc.LJJLIIIJILLIZJL(new AwS559S0100000_15(lifecycle, 591));
            } else {
                C923050a7z.LIZJ("connection_start");
            }
        }
        this.LLJILLL = iLIZ;
    }

    public final void LJIIJ(int i) {
        ((InterfaceC922980a7s) this.LLJJIII.getValue()).LIZ();
        Iterator<InterfaceC922930a7n> it2 = LJFF().iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(LJIIIIZZ());
        }
        ((InterfaceC922980a7s) this.LLJJIII.getValue()).dispose();
    }

    public C922940a7o(Room room, long j, InterfaceC924460aAG interfaceC924460aAG, IMessageManager iMessageManager, LifecycleOwner lifecycleOwner) {
        super(room, j, interfaceC924460aAG, iMessageManager, lifecycleOwner);
        this.LLJILJILJ = interfaceC924460aAG;
        this.LLJJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(211));
        this.LLJJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(209));
        this.LLJJIII = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(210));
    }
}

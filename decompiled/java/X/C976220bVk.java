package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0bVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976220bVk extends C09AY implements InterfaceC1631620sYq<Long, EnumC919170a1j, List<? extends TeamUser>, Unit> {
    public final /* synthetic */ C976050bVT LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C976220bVk(C976050bVT c976050bVT, boolean z) {
        super(3);
        this.LL = c976050bVT;
        this.LLILLJJLI = z;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Long l, EnumC919170a1j enumC919170a1j, List<? extends TeamUser> list) {
        C975960bVK c975960bVKM3;
        C975990bVN c975990bVN;
        C975960bVK c975960bVKM32;
        C975990bVN c975990bVN2;
        C975960bVK c975960bVKM33;
        C975990bVN c975990bVN3;
        C975960bVK c975960bVKM34;
        long id;
        Room roomInfo;
        User owner;
        long jLongValue = l.longValue();
        EnumC919170a1j enumC919170a1j2 = enumC919170a1j;
        List<? extends TeamUser> list2 = list;
        InterfaceC975520bUc interfaceC975520bUc = this.LL.LIZIZ;
        if (interfaceC975520bUc != null && (c975960bVKM34 = interfaceC975520bUc.m3()) != null) {
            C976050bVT c976050bVT = this.LL;
            c975960bVKM34.LJLJI(jLongValue);
            c975960bVKM34.LJJJZ(true);
            c975960bVKM34.LIZLLL = enumC919170a1j2;
            InterfaceC975520bUc interfaceC975520bUc2 = c976050bVT.LIZIZ;
            if (interfaceC975520bUc2 != null && (roomInfo = interfaceC975520bUc2.getRoomInfo()) != null && (owner = roomInfo.getOwner()) != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            c975960bVKM34.LJJJJZI = id;
        }
        C976050bVT c976050bVT2 = this.LL;
        InterfaceC975520bUc interfaceC975520bUc3 = c976050bVT2.LIZIZ;
        if (interfaceC975520bUc3 != null && (c975960bVKM33 = interfaceC975520bUc3.m3()) != null && (c975990bVN3 = c975960bVKM33.LJJJLZIJ) != null) {
            c975990bVN3.LIZJ();
        }
        for (TeamUser teamUser : list2) {
            List<Long> list3 = teamUser.userIds;
            if (list3 == null) {
                list3 = C13BV.INSTANCE;
            }
            InterfaceC975520bUc interfaceC975520bUc4 = c976050bVT2.LIZIZ;
            if (interfaceC975520bUc4 != null && (c975960bVKM32 = interfaceC975520bUc4.m3()) != null && (c975990bVN2 = c975960bVKM32.LJJJLZIJ) != null) {
                c975990bVN2.LJFF(teamUser.teamId, list3);
            }
        }
        InterfaceC975520bUc interfaceC975520bUc5 = c976050bVT2.LIZIZ;
        if (interfaceC975520bUc5 != null && (c975960bVKM3 = interfaceC975520bUc5.m3()) != null && (c975990bVN = c975960bVKM3.LJJJLZIJ) != null) {
            c975990bVN.LIZ(new ArrayList());
        }
        if (this.LLILLJJLI) {
            C20441214yg.LIZIZ("MatchStateInviter", "send invite and update rematch button");
            InterfaceC976280bVq interfaceC976280bVq = (InterfaceC976280bVq) this.LL.LJIILJJIL();
            if (interfaceC976280bVq != null) {
                interfaceC976280bVq.LIZ(false);
            }
        }
        return Unit.LIZ;
    }
}

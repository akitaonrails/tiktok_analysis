package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdk.chatroom.interact.model.BattleOptPair;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958290b2p {
    public static final Room LJIIIIZZ;
    public final InterfaceC958380b2y LIZ;
    public C958360b2w LIZIZ;
    public EnumC955720ayg LIZJ;
    public boolean LIZLLL = true;
    public final List<Room> LJ = new ArrayList();
    public final List<C958400b30> LJFF = new ArrayList();
    public final AwS629S0100000_15 LJI = new AwS629S0100000_15(this, 8);
    public final C958280b2o LJII;

    static {
        Room room = new Room();
        room.setOwner(new User());
        LJIIIIZZ = room;
    }

    public final int LIZ() {
        int i;
        BattleOptPair battleOptPair;
        OptPairInfo optPairInfo;
        BattleOptPair battleOptPair2;
        Map<Long, Boolean> map;
        C958360b2w c958360b2w = this.LIZIZ;
        if (c958360b2w == null || (battleOptPair2 = c958360b2w.LJ) == null || (map = battleOptPair2.isInLinkmic) == null || map.isEmpty()) {
            i = 0;
        } else {
            Iterator<Map.Entry<Long, Boolean>> it2 = map.entrySet().iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next().getValue().booleanValue()) {
                    i++;
                }
            }
        }
        C958360b2w c958360b2w2 = this.LIZIZ;
        return Math.max(((c958360b2w2 == null || (battleOptPair = c958360b2w2.LJ) == null || (optPairInfo = battleOptPair.optPairInfo) == null || optPairInfo.optPairType != 1) ? 4 : 2) - i, 0);
    }

    public final void LIZIZ() {
        C958360b2w c958360b2w;
        BattleOptPair battleOptPair;
        BattleOptPair battleOptPair2;
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1()) {
            LIZJ(EnumC955720ayg.UNAVAILABLE);
            return;
        }
        if (LIZ() == 0) {
            LIZJ(EnumC955720ayg.UNAVAILABLE);
            return;
        }
        EnumC955720ayg enumC955720ayg = EnumC955720ayg.NORMAL;
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Room room = (Room) it2.next();
            if (!Intrinsics.LJFF(room, LJIIIIZZ)) {
                long id = room.getId();
                Long lLJIIJ = C930540aK4.LJIIJ();
                if (lLJIIJ == null || id != lLJIIJ.longValue()) {
                    IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
                    long ownerUserId = room.getOwnerUserId();
                    C958360b2w c958360b2w2 = this.LIZIZ;
                    C954460awe c954460aweLLLI = iMultiHostServiceLJII.LLLI(ownerUserId, (c958360b2w2 == null || (battleOptPair2 = c958360b2w2.LJ) == null || battleOptPair2.playType != 1) ? false : true);
                    boolean zLJIIJ = c954460aweLLLI != null ? c954460aweLLLI.LJIIJ() : false;
                    long jLLLLIL = C915980Zwa.LJII().LLLLIL(room.getOwnerUserId());
                    if (zLJIIJ && jLLLLIL > 0) {
                        enumC955720ayg = EnumC955720ayg.INVITING;
                        break;
                    }
                }
            }
        }
        if (enumC955720ayg == EnumC955720ayg.NORMAL && (c958360b2w = this.LIZIZ) != null && (battleOptPair = c958360b2w.LJ) != null && battleOptPair.inviteBlockReason > 0) {
            enumC955720ayg = EnumC955720ayg.UNAVAILABLE;
        }
        LIZJ(enumC955720ayg);
    }

    public final void LIZJ(EnumC955720ayg enumC955720ayg) {
        if (enumC955720ayg != this.LIZJ || C958270b2n.LIZJ(this.LIZIZ) != this.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try updateState from ");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(" to ");
            sbLIZ.append(enumC955720ayg);
            C20441214yg.LJIIIZ("BattlePairViewPresenter", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZJ = enumC955720ayg;
            boolean zLIZJ = C958270b2n.LIZJ(this.LIZIZ);
            this.LIZLLL = zLIZJ;
            this.LIZ.w(enumC955720ayg, zLIZJ);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0b2r] */
    public C958290b2p(InterfaceC958380b2y interfaceC958380b2y, DataChannel dataChannel, InterfaceC956060azE interfaceC956060azE, InterfaceC956210azT interfaceC956210azT) {
        this.LIZ = interfaceC958380b2y;
        this.LJII = new C958280b2o(interfaceC956060azE, interfaceC956210azT, dataChannel, interfaceC958380b2y.context(), new C958440b34() { // from class: X.0b2r
            @Override // X.InterfaceC958410b31
            public final void onCancelled() {
                if (this.LIZ.LIZ.isViewValid()) {
                    C20441214yg.LIZIZ("BattlePairViewPresenter", "onCancelled");
                    this.LIZ.LIZIZ();
                }
            }

            @Override // X.InterfaceC958410b31
            public final void onComplete() {
                if (this.LIZ.LIZ.isViewValid()) {
                    C20441214yg.LIZIZ("BattlePairViewPresenter", "onSuccess");
                }
            }

            @Override // X.InterfaceC958410b31
            public final void LIZ(int i, String str) {
                if (!this.LIZ.LIZ.isViewValid()) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("invite failed errorCode:");
                sbLIZ.append(i);
                sbLIZ.append(' ');
                sbLIZ.append(str);
                C958370b2x.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onFailed, errorCode:");
                sbLIZ2.append(i);
                sbLIZ2.append(", msg:");
                sbLIZ2.append(str);
                C20441214yg.LJ("BattlePairViewPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZ.LIZIZ();
            }
        });
    }
}

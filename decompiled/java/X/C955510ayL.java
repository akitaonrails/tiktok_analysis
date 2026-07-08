package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.interact.model.BattleOptPair;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ayL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955510ayL {
    public final RecyclerView LIZ;
    public final AbstractC960950b77 LIZIZ;
    public final HashSet<Long> LIZJ = new HashSet<>();
    public final HashSet<Long> LIZLLL = new HashSet<>();
    public final HashSet<Long> LJ = new HashSet<>();
    public final HashSet<Long> LJFF = new HashSet<>();
    public final HashSet<Long> LJI = new HashSet<>();
    public final HashSet<Long> LJII = new HashSet<>();
    public final HashSet<Long> LJIIIIZZ = new HashSet<>();
    public final HashSet<Long> LJIIIZ = new HashSet<>();
    public final HashMap<Long, Long> LJIIJ = new HashMap<>();

    public final Map<String, String> LIZ() {
        HashMap map = new HashMap();
        map.put("follow_ranking_show_cnts", String.valueOf(this.LIZLLL.size()));
        map.put("follow_topic_show_cnts", String.valueOf(this.LJ.size()));
        map.put("recommend_show_cnts", String.valueOf(this.LIZJ.size()));
        map.put("recommend_ranking_show_cnts", String.valueOf(this.LJFF.size()));
        map.put("recommend_topic_show_cnts", String.valueOf(this.LJI.size()));
        map.put("mutual_could_apply_cnts", String.valueOf(this.LJII.size()));
        map.put("mutual_could_invite_cnts", String.valueOf(this.LJIIIIZZ.size()));
        map.put("mutual_actual_see_cnts", String.valueOf(this.LJIIIZ.size()));
        return map;
    }

    public C955510ayL(RecyclerView recyclerView, AbstractC960950b77 abstractC960950b77) {
        this.LIZ = recyclerView;
        this.LIZIZ = abstractC960950b77;
        final C955470ayH c955470ayH = new C955470ayH(this);
        recyclerView.addOnScrollListener(c955470ayH);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0az9
                @Override // X.AbstractC471570IeR
                public final void LIZ() {
                    C20441214yg.LIZIZ("RecyclerViewLogHelper", "RecyclerViewLogHelper onChanged");
                    c955470ayH.LJJIIZI(this.LIZ, 0, 0);
                }

                @Override // X.AbstractC471570IeR
                public final void LIZIZ(int i, int i2) {
                    C20441214yg.LIZIZ("RecyclerViewLogHelper", "RecyclerViewLogHelper onItemRangeChanged");
                    c955470ayH.LJJIIZI(this.LIZ, 0, 0);
                }

                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    C20441214yg.LIZIZ("RecyclerViewLogHelper", "RecyclerViewLogHelper onItemRangeInserted");
                    c955470ayH.LJJIIZI(this.LIZ, 0, 0);
                }
            });
        }
        recyclerView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC986940bn2(c955470ayH, 2));
    }

    public static final void LIZIZ(C955510ayL c955510ayL, C958360b2w c958360b2w, Room room) {
        Boolean boolValueOf;
        String string;
        Long lValueOf;
        Object obj;
        List<Room> list;
        C956250azX c956250azX = new C956250azX(C958360b2w.class, room.getId());
        AbstractC960950b77 abstractC960950b77 = c955510ayL.LIZIZ;
        if (abstractC960950b77 != null) {
            boolValueOf = Boolean.valueOf(abstractC960950b77.LJIILIIL(c956250azX));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            C955400ayA c955400ayA = C955400ayA.LIZ;
            BattleOptPair battleOptPair = c958360b2w.LJ;
            RivalExtraInfo rivalExtraInfo = c958360b2w.LJI.get(Long.valueOf(room.getId()));
            HashMap map = new HashMap();
            map.put("invitee_list", "scheduled");
            OptPairInfo optPairInfo = battleOptPair.optPairInfo;
            if (optPairInfo == null || (string = Long.valueOf(optPairInfo.mappingId).toString()) == null) {
                string = "";
            }
            map.put("pk_mapping_id", string);
            OptPairInfo optPairInfo2 = battleOptPair.optPairInfo;
            if (optPairInfo2 != null) {
                lValueOf = Long.valueOf(optPairInfo2.optPairType);
            } else {
                lValueOf = null;
            }
            map.put("pk_mapping_type", C958270b2n.LIZ(lValueOf));
            map.put("pk_mapping_style", "old");
            map.put("before_connection_status", C955400ayA.LJJJJZI());
            map.put("connection_invitee_id", String.valueOf(room.getOwnerUserId()));
            boolean zLJJLIIIJJI = C915980Zwa.LJII().LJJLIIIJJI();
            String str = "1";
            if (C955940az2.LIZ(rivalExtraInfo) && !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1() && !zLJJLIIIJJI) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_clickable", obj);
            C955400ayA.LJIILL(map, rivalExtraInfo);
            long ownerUserId = room.getOwnerUserId();
            if (ownerUserId != C950220apo.LJFF() && (list = battleOptPair.selfTeamRoomList) != null) {
                Iterator<Room> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Room next = it2.next();
                    if (next.getOwnerUserId() == ownerUserId) {
                        if (next == null) {
                            break;
                        }
                    }
                }
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("if_scheduled_teammate", str);
            map.put("is_shared_screen", CardStruct.IStatusCode.DEFAULT);
            C955400ayA.LJIIL(c955400ayA, map, null, true, 10);
            C955400ayA.LJIIJ(map, false);
            map.put("linker_mode", String.valueOf(C915980Zwa.LJII().Uh()));
            C973690bRf.LJ(map, null, false);
            C955520ayM.LIZJ(map, room, rivalExtraInfo);
            C955400ayA.LLIILII("livesdk_connection_invite_show", map);
            AbstractC960950b77 abstractC960950b772 = c955510ayL.LIZIZ;
            if (abstractC960950b772 != null) {
                abstractC960950b772.LJJ(c956250azX);
            }
        }
    }
}

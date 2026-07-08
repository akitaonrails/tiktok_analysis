package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0P49, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P49 extends AbstractC796330VLr {
    public final int $t;
    public Object l0;

    public static final String createQuery$0(C0P49 c0p49) {
        return "INSERT OR REPLACE INTO `AWEME_MESSAGE_KV` (`MSG_ID`,`MSG_UUID`,`CONVERSATION_ID`,`AWEME_ID`,`CREATE_TIME`,`SENDER_IS_MYSELF`,`VIDEO_COVER_COMPONENT`,`COVER_URL`,`HAS_CONSUMED_FOR_EXPLOSION_EFFECT`,`HAS_CONSUMED_FOR_VIDEO_RAIN_EFFECT`,`INDEX`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    }

    public static final String createQuery$1(C0P49 c0p49) {
        return "INSERT OR REPLACE INTO `friends_feed_resp_cache` (`uid`,`friends_feed_resp`,`created_time_millis`) VALUES (?,?,?)";
    }

    public static final String createQuery$2(C0P49 c0p49) {
        return "INSERT OR REPLACE INTO `skylight_live` (`uid`,`user_info`,`updated_at`) VALUES (?,?,?)";
    }

    public static final String createQuery$3(C0P49 c0p49) {
        return "INSERT OR REPLACE INTO `skylight_story_collection` (`author_id`,`collection`,`user_story`,`updated_at`) VALUES (?,?,?,?)";
    }

    public static final String createQuery$4(C0P49 c0p49) {
        return "INSERT OR REPLACE INTO `ai_quick_reply` (`uid`,`noticeId`,`replyList`,`timestamp`) VALUES (?,?,?,?)";
    }

    @Override // X.AbstractC796330VLr
    public final void bind(InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        switch (this.$t) {
            case 0:
                bind$0(this, interfaceC796340VLs, obj);
                break;
            case 1:
                bind$1(this, interfaceC796340VLs, obj);
                break;
            case 2:
                bind$2(this, interfaceC796340VLs, obj);
                break;
            case 3:
                bind$3(this, interfaceC796340VLs, obj);
                break;
            case 4:
                bind$4(this, interfaceC796340VLs, obj);
                break;
            default:
                super.bind(interfaceC796340VLs, obj);
                break;
        }
    }

    @Override // X.AbstractC795470VIj
    public final String createQuery() {
        switch (this.$t) {
            case 0:
                return createQuery$0(this);
            case 1:
                return createQuery$1(this);
            case 2:
                return createQuery$2(this);
            case 3:
                return createQuery$3(this);
            case 4:
                return createQuery$4(this);
            default:
                return super.createQuery();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0P49(Object obj, AbstractC796540VMm abstractC796540VMm, int i) {
        super(abstractC796540VMm);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void bind$0(C0P49 c0p49, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        String json;
        C0NPC c0npc = (C0NPC) obj;
        interfaceC796340VLs.LJIJ(1, c0npc.LIZ);
        String str = c0npc.LIZIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str);
        }
        String str2 = c0npc.LIZJ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIILIIL(3, str2);
        }
        String str3 = c0npc.LIZLLL;
        if (str3 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str3);
        }
        interfaceC796340VLs.LJIJ(5, c0npc.LJ);
        interfaceC796340VLs.LJIJ(6, c0npc.LJFF ? 1L : 0L);
        C0VMD c0vmd = ((C795550VIr) c0p49.l0).LIZLLL;
        VideoCoverComponent videoCoverComponent = c0npc.LJI;
        c0vmd.getClass();
        if (videoCoverComponent != null) {
            json = GsonProtectorUtils.toJson(C051M.LIZ, videoCoverComponent);
        } else {
            json = null;
        }
        if (json == null) {
            interfaceC796340VLs.LLD(7);
        } else {
            interfaceC796340VLs.LJIILIIL(7, json);
        }
        String str4 = c0npc.LJII;
        if (str4 == null) {
            interfaceC796340VLs.LLD(8);
        } else {
            interfaceC796340VLs.LJIILIIL(8, str4);
        }
        interfaceC796340VLs.LJIJ(9, c0npc.LJIIIIZZ ? 1L : 0L);
        interfaceC796340VLs.LJIJ(10, c0npc.LJIIIZ ? 1L : 0L);
        interfaceC796340VLs.LJIJ(11, c0npc.LJIIJ);
    }

    public static final void bind$1(C0P49 c0p49, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0NMB c0nmb = (C0NMB) obj;
        String str = c0nmb.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        C0NMG c0nmg = ((C795920VKc) c0p49.l0).LIZJ;
        FriendsFeedResponse friendsFeedResponse = c0nmb.LIZIZ;
        c0nmg.getClass();
        String strLIZLLL = C08JS.LIZLLL(friendsFeedResponse);
        if (strLIZLLL == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, strLIZLLL);
        }
        interfaceC796340VLs.LJIJ(3, c0nmb.LIZJ);
    }

    public static final void bind$2(C0P49 c0p49, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        String strLJI;
        C611170Ny7 c611170Ny7 = (C611170Ny7) obj;
        String str = c611170Ny7.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        C796160VLa c796160VLa = ((C0VLZ) c0p49.l0).LIZJ;
        User user = c611170Ny7.LIZIZ;
        c796160VLa.getClass();
        if (user != null) {
            try {
                C1227904rF.LIZ.getClass();
                strLJI = C1227904rF.LJI(user);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strLJI = null;
            }
        } else {
            strLJI = null;
        }
        if (strLJI == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, strLJI);
        }
        interfaceC796340VLs.LJIJ(3, c611170Ny7.LIZJ);
    }

    public static final void bind$3(C0P49 c0p49, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        String strLJI;
        C611300NyK c611300NyK = (C611300NyK) obj;
        String str = c611300NyK.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        C611580Nym c611580Nym = ((C796490VMh) c0p49.l0).LIZJ;
        Aweme aweme = c611300NyK.LIZIZ;
        c611580Nym.getClass();
        if (aweme != null) {
            try {
                C1227904rF.LIZ.getClass();
                strLJI = C1227904rF.LJI(aweme);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("SkylightCollectionTypeConverter", "collectionToJson error", e);
                strLJI = null;
            }
        } else {
            strLJI = null;
        }
        if (strLJI == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, strLJI);
        }
        C726930SfL c726930SfL = ((C796490VMh) c0p49.l0).LIZLLL;
        UserStory userStory = c611300NyK.LIZJ;
        c726930SfL.getClass();
        String strLIZIZ = C726930SfL.LIZIZ(userStory);
        if (strLIZIZ == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIILIIL(3, strLIZIZ);
        }
        interfaceC796340VLs.LJIJ(4, c611300NyK.LIZLLL);
    }

    public static final void bind$4(C0P49 c0p49, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C611470Nyb c611470Nyb = (C611470Nyb) obj;
        String str = c611470Nyb.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c611470Nyb.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        C795540VIq c795540VIq = ((C795530VIp) c0p49.l0).LIZJ;
        List<String> list = c611470Nyb.LIZJ;
        c795540VIq.getClass();
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(list);
        if (strLJI == null) {
            strLJI = "";
        }
        interfaceC796340VLs.LJIILIIL(3, strLJI);
        interfaceC796340VLs.LJIJ(4, c611470Nyb.LIZLLL);
    }
}

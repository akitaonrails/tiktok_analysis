package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedDBEntity;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel;
import java.util.List;

/* JADX INFO: renamed from: X.0Xfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854560Xfi extends AbstractC796330VLr {
    public final int $t;
    public Object l0;

    public static final String createQuery$0(C854560Xfi c854560Xfi) {
        return "INSERT OR REPLACE INTO `aweme_detail` (`aweme_id`,`api_path`,`data`,`start_time`) VALUES (?,?,?,?)";
    }

    public static final String createQuery$1(C854560Xfi c854560Xfi) {
        return "INSERT OR REPLACE INTO `friends_v3_feeds_table` (`uid`,`feeds`,`has_more`,`logPb`,`save_time_in_mills`) VALUES (?,?,?,?,?)";
    }

    public static final String createQuery$2(C854560Xfi c854560Xfi) {
        return "INSERT OR REPLACE INTO `sound_effect_database` (`dbId`,`id`,`name`,`eng_name`,`version`,`resource_urlavg_color`,`resource_urluri`,`resource_urlurl_list`,`resource_urlopen_web_url`,`resource_urlimage_type`,`resource_urlis_animated`,`resource_urlwidth`,`resource_urlheight`,`resource_urlisLoaded`,`resource_urlisMonitored`,`resource_urlisFeedCandidate`,`iconavg_color`,`iconuri`,`iconurl_list`,`iconopen_web_url`,`iconimage_type`,`iconis_animated`,`iconwidth`,`iconheight`,`iconisLoaded`,`iconisMonitored`,`iconisFeedCandidate`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    public static final String createQuery$3(C854560Xfi c854560Xfi) {
        return "INSERT OR REPLACE INTO `story_thought_drafts` (`task_id`,`uid`,`created_time`,`modified_time`,`text`,`background_index`,`privacy_permission`,`task_status`,`avatar_urls`,`is_read`,`avatar_uri`,`text_extras`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
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
            default:
                return super.createQuery();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C854560Xfi(Object obj, AbstractC796540VMm abstractC796540VMm, int i) {
        super(abstractC796540VMm);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void bind$0(C854560Xfi c854560Xfi, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VL3 c0vl3 = (C0VL3) obj;
        String str = c0vl3.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c0vl3.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        C211700rj c211700rj = ((C0VL2) c854560Xfi.l0).LIZJ;
        Aweme aweme = c0vl3.LIZJ;
        c211700rj.getClass();
        String strLIZLLL = C08JS.LIZLLL(aweme);
        if (strLIZLLL == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIILIIL(3, strLIZLLL);
        }
        interfaceC796340VLs.LJIJ(4, c0vl3.LIZLLL);
    }

    public static final void bind$1(C854560Xfi c854560Xfi, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        Object c098200Yq;
        Object c098200Yq2;
        FriendsV3FeedDBEntity friendsV3FeedDBEntity = (FriendsV3FeedDBEntity) obj;
        String str = friendsV3FeedDBEntity.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        C0VM2 c0vm2 = ((C0VM1) c854560Xfi.l0).LIZJ;
        List<FriendsV3FeedModel> list = friendsV3FeedDBEntity.LIZIZ;
        c0vm2.getClass();
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = C1227904rF.LJI(list);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj2 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        interfaceC796340VLs.LJIJ(3, friendsV3FeedDBEntity.LIZJ ? 1L : 0L);
        C0VM2 c0vm22 = ((C0VM1) c854560Xfi.l0).LIZJ;
        LogPbBean logPbBean = friendsV3FeedDBEntity.logPb;
        c0vm22.getClass();
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq2 = C1227904rF.LJI(logPbBean);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj2 = c098200Yq2;
        }
        String str3 = (String) obj2;
        if (str3 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str3);
        }
        interfaceC796340VLs.LJIJ(5, friendsV3FeedDBEntity.LIZLLL);
    }

    public static final void bind$2(C854560Xfi c854560Xfi, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        SoundEffect soundEffect = (SoundEffect) obj;
        interfaceC796340VLs.LJIJ(1, soundEffect.LIZ);
        interfaceC796340VLs.LJIJ(2, soundEffect.id);
        String str = soundEffect.name;
        if (str == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIILIIL(3, str);
        }
        String str2 = soundEffect.nameEn;
        if (str2 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str2);
        }
        interfaceC796340VLs.LJIJ(5, soundEffect.version);
        ImageModel imageModel = soundEffect.resourceUrl;
        if (imageModel != null) {
            String str3 = imageModel.avgColor;
            if (str3 == null) {
                interfaceC796340VLs.LLD(6);
            } else {
                interfaceC796340VLs.LJIILIIL(6, str3);
            }
            String str4 = imageModel.mUri;
            if (str4 == null) {
                interfaceC796340VLs.LLD(7);
            } else {
                interfaceC796340VLs.LJIILIIL(7, str4);
            }
            C0VME c0vme = ((C0VMC) c854560Xfi.l0).LIZJ;
            List<String> listLIZ = C842240X2g.LIZ(imageModel);
            c0vme.getClass();
            String json = GsonProtectorUtils.toJson(new Gson(), listLIZ);
            if (json == null) {
                interfaceC796340VLs.LLD(8);
            } else {
                interfaceC796340VLs.LJIILIIL(8, json);
            }
            String str5 = imageModel.schema;
            if (str5 == null) {
                interfaceC796340VLs.LLD(9);
            } else {
                interfaceC796340VLs.LJIILIIL(9, str5);
            }
            interfaceC796340VLs.LJIJ(10, imageModel.getImageType());
            interfaceC796340VLs.LJIJ(11, imageModel.isAnimated() ? 1L : 0L);
            interfaceC796340VLs.LJIJ(12, imageModel.width);
            interfaceC796340VLs.LJIJ(13, imageModel.height);
            interfaceC796340VLs.LJIJ(14, imageModel.isLoaded() ? 1L : 0L);
            interfaceC796340VLs.LJIJ(15, imageModel.isMonitored() ? 1L : 0L);
            interfaceC796340VLs.LJIJ(16, imageModel.isFeedCandidate() ? 1L : 0L);
        } else {
            interfaceC796340VLs.LLD(6);
            interfaceC796340VLs.LLD(7);
            interfaceC796340VLs.LLD(8);
            interfaceC796340VLs.LLD(9);
            interfaceC796340VLs.LLD(10);
            interfaceC796340VLs.LLD(11);
            interfaceC796340VLs.LLD(12);
            interfaceC796340VLs.LLD(13);
            interfaceC796340VLs.LLD(14);
            interfaceC796340VLs.LLD(15);
            interfaceC796340VLs.LLD(16);
        }
        ImageModel imageModel2 = soundEffect.iconUrl;
        if (imageModel2 != null) {
            String str6 = imageModel2.avgColor;
            if (str6 == null) {
                interfaceC796340VLs.LLD(17);
            } else {
                interfaceC796340VLs.LJIILIIL(17, str6);
            }
            String str7 = imageModel2.mUri;
            if (str7 == null) {
                interfaceC796340VLs.LLD(18);
            } else {
                interfaceC796340VLs.LJIILIIL(18, str7);
            }
            C0VME c0vme2 = ((C0VMC) c854560Xfi.l0).LIZJ;
            List<String> listLIZ2 = C842240X2g.LIZ(imageModel2);
            c0vme2.getClass();
            String json2 = GsonProtectorUtils.toJson(new Gson(), listLIZ2);
            if (json2 == null) {
                interfaceC796340VLs.LLD(19);
            } else {
                interfaceC796340VLs.LJIILIIL(19, json2);
            }
            String str8 = imageModel2.schema;
            if (str8 == null) {
                interfaceC796340VLs.LLD(20);
            } else {
                interfaceC796340VLs.LJIILIIL(20, str8);
            }
            interfaceC796340VLs.LJIJ(21, imageModel2.getImageType());
            interfaceC796340VLs.LJIJ(22, imageModel2.isAnimated() ? 1L : 0L);
            interfaceC796340VLs.LJIJ(23, imageModel2.width);
            interfaceC796340VLs.LJIJ(24, imageModel2.height);
            interfaceC796340VLs.LJIJ(25, imageModel2.isLoaded() ? 1L : 0L);
            interfaceC796340VLs.LJIJ(26, imageModel2.isMonitored() ? 1L : 0L);
            interfaceC796340VLs.LJIJ(27, imageModel2.isFeedCandidate() ? 1L : 0L);
            return;
        }
        interfaceC796340VLs.LLD(17);
        interfaceC796340VLs.LLD(18);
        interfaceC796340VLs.LLD(19);
        interfaceC796340VLs.LLD(20);
        interfaceC796340VLs.LLD(21);
        interfaceC796340VLs.LLD(22);
        interfaceC796340VLs.LLD(23);
        interfaceC796340VLs.LLD(24);
        interfaceC796340VLs.LLD(25);
        interfaceC796340VLs.LLD(26);
        interfaceC796340VLs.LLD(27);
    }

    public static final void bind$3(C854560Xfi c854560Xfi, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        String strLJIILL;
        C817600W5m c817600W5m = (C817600W5m) obj;
        String str = c817600W5m.taskId;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c817600W5m.uid;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        interfaceC796340VLs.LJIJ(3, c817600W5m.createdTime);
        interfaceC796340VLs.LJIJ(4, c817600W5m.modifiedTime);
        String str3 = c817600W5m.text;
        if (str3 == null) {
            interfaceC796340VLs.LLD(5);
        } else {
            interfaceC796340VLs.LJIILIIL(5, str3);
        }
        interfaceC796340VLs.LJIJ(6, c817600W5m.backgroundIndex);
        interfaceC796340VLs.LJIJ(7, c817600W5m.privacyPermission);
        interfaceC796340VLs.LJIJ(8, c817600W5m.taskStatus);
        C0VM5 c0vm5 = ((C796120VKw) c854560Xfi.l0).LIZJ;
        List<String> list = c817600W5m.avatarUrls;
        c0vm5.getClass();
        String strLJIILL2 = null;
        if (list != null) {
            try {
                strLJIILL = ((Gson) c0vm5.LIZ.getValue()).LJIILL(list);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strLJIILL = null;
            }
        } else {
            strLJIILL = null;
        }
        if (strLJIILL == null) {
            interfaceC796340VLs.LLD(9);
        } else {
            interfaceC796340VLs.LJIILIIL(9, strLJIILL);
        }
        interfaceC796340VLs.LJIJ(10, c817600W5m.isRead() ? 1L : 0L);
        String str4 = c817600W5m.avatarUri;
        if (str4 == null) {
            interfaceC796340VLs.LLD(11);
        } else {
            interfaceC796340VLs.LJIILIIL(11, str4);
        }
        C0VM5 c0vm52 = ((C796120VKw) c854560Xfi.l0).LIZJ;
        List<StoryNoteTextExtra> list2 = c817600W5m.textExtras;
        c0vm52.getClass();
        if (list2 != null) {
            try {
                strLJIILL2 = ((Gson) c0vm52.LIZ.getValue()).LJIILL(list2);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (strLJIILL2 == null) {
            interfaceC796340VLs.LLD(12);
        } else {
            interfaceC796340VLs.LJIILIIL(12, strLJIILL2);
        }
    }
}

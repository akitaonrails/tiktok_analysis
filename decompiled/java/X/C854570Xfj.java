package X;

import android.os.Build;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Xfj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854570Xfj extends AbstractC796330VLr {
    public final int $t;

    public static final String createQuery$0(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `user_info` (`uid`,`version`,`nickname`,`is_private_account`,`avatar_168`,`avatar_300`) VALUES (?,?,?,?,?,?)";
    }

    public static final String createQuery$1(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `maf_info` (`uid`,`rec_type`,`rec_reason`,`relation_type`,`social_info`,`mutual_struct`,`external_recommend_reason`,`version`) VALUES (?,?,?,?,?,?,?,?)";
    }

    public static final String createQuery$10(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `FRIENDS_UNREAD_RECORD` (`AWEME_ID`,`READ_TIME`,`REPORTED`,`USER_ID`,`INSERT_TIME`,`AWEME_TYPE`) VALUES (?,?,?,?,?,?)";
    }

    public static final String createQuery$11(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `REPOST_DISLIKE_RECORD` (`AWEME_ID`,`DISLIKE_TIME`,`REPORTED`,`USER_ID`,`INSERT_TIME`,`AWEME_TYPE`) VALUES (?,?,?,?,?,?)";
    }

    public static final String createQuery$12(C854570Xfj c854570Xfj) {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    public static final String createQuery$13(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    public static final String createQuery$14(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
    }

    public static final String createQuery$15(C854570Xfj c854570Xfj) {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    public static final String createQuery$16(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }

    public static final String createQuery$17(C854570Xfj c854570Xfj) {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    public static final String createQuery$18(C854570Xfj c854570Xfj) {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    public static final String createQuery$19(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `package` (`packageName`,`md5`,`engineType`,`optionType`,`content`) VALUES (?,?,?,?,?)";
    }

    public static final String createQuery$2(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `user_status` (`uid`,`follow_status`,`follower_status`,`is_block`,`version`) VALUES (?,?,?,?,?)";
    }

    public static final String createQuery$20(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `scene` (`uid`,`sceneKey`,`sceneType`,`strategyKey`,`uniqueKey`) VALUES (?,?,?,?,?)";
    }

    public static final String createQuery$21(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `strategy` (`id`,`strategyKey`,`engineType`,`optType`,`md5`,`packageName`,`extraJson`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
    }

    public static final String createQuery$22(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `MESSAGE_KV` (`MSG_ID`,`CONVERSATION_ID`,`AWEME_ID`,`CREATE_TIME`) VALUES (?,?,?,?)";
    }

    public static final String createQuery$23(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `information` (`key`,`value`) VALUES (?,?)";
    }

    public static final String createQuery$24(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `translation` (`key`,`value`) VALUES (?,?)";
    }

    public static final String createQuery$25(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `following_feed_consume` (`aweme_id`,`uid`,`insert_time`,`read_status`,`score`) VALUES (?,?,?,?,?)";
    }

    public static final String createQuery$26(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `following_frequent_user_new` (`id`,`uid`,`author_id`,`status`,`update_time`) VALUES (nullif(?, 0),?,?,?,?)";
    }

    public static final String createQuery$27(C854570Xfj c854570Xfj) {
        return "INSERT OR ABORT INTO `showAd` (`awemeId`,`cid`) VALUES (?,?)";
    }

    public static final String createQuery$28(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `CONVERSATION_NEW` (`CONVERSATION_ID`,`SUB_CONVERSATION_ID`,`STATUS`,`HISTORY_CURSOR`,`READ_CURSOR`,`TITLE`,`UNREAD_COUNT`,`LATEST_MESSAGE_TIME`,`RELATED_VIDEO`) VALUES (?,?,?,?,?,?,?,?,?)";
    }

    public static final String createQuery$29(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `RECENT_SHARE` (`CURR_UID`,`ID`,`SHARE_TIME`,`SHARE_TYPE`,`SEND_TIME`) VALUES (?,?,?,?,?)";
    }

    public static final String createQuery$3(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `rule_hit_cache` (`unique_key`,`outreach_key`,`is_hit`,`hit_rule_ids`,`rule_strategy`,`create_time`) VALUES (?,?,?,?,?,?)";
    }

    public static final String createQuery$30(C854570Xfj c854570Xfj) {
        return "INSERT OR IGNORE INTO `RECENT_SHARE` (`CURR_UID`,`ID`,`SHARE_TIME`,`SHARE_TYPE`,`SEND_TIME`) VALUES (?,?,?,?,?)";
    }

    public static final String createQuery$31(C854570Xfj c854570Xfj) {
        return "INSERT OR ABORT INTO `t_report_synclog` (`id`,`sync_id`,`business`,`did`,`uid`,`bucket`,`cursor`,`data`,`md5`,`msg_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
    }

    public static final String createQuery$32(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `t_report_synclog` (`id`,`sync_id`,`business`,`did`,`uid`,`bucket`,`cursor`,`data`,`md5`,`msg_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
    }

    public static final String createQuery$4(C854570Xfj c854570Xfj) {
        return "INSERT OR FAIL INTO `localHashTag` (`name`,`time`) VALUES (?,?)";
    }

    public static final String createQuery$5(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `USER_INTERACTION` (`ID`,`TARGET_TYPE`,`BUSINESS_TYPE`,`DATA`) VALUES (?,?,?,?)";
    }

    public static final String createQuery$6(C854570Xfj c854570Xfj) {
        return "INSERT OR ABORT INTO `runtimeBehaviorEntity` (`id`,`type`,`time`,`msg`) VALUES (nullif(?, 0),?,?,?)";
    }

    public static final String createQuery$7(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `t_history_synclog` (`sync_id`,`did`,`uid`,`sync_cursor`,`data`,`md5`,`business`,`consume_type`,`data_type`,`publish_ts`,`receive_ts`,`bucket`,`req_id`,`topic_type`,`packet_status`,`expire_ts`,`packet_ctrl`,`extra`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    public static final String createQuery$8(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `user_status_published` (`uid`,`user_status_published`) VALUES (?,?)";
    }

    public static final String createQuery$9(C854570Xfj c854570Xfj) {
        return "INSERT OR REPLACE INTO `FRIENDS_RED_DOT_RECORD` (`AWEME_ID`,`READ_TIME`,`REPORTED`,`USER_ID`,`INSERT_TIME`,`AWEME_TYPE`) VALUES (?,?,?,?,?,?)";
    }

    @Override // X.AbstractC796330VLr
    public final void bind(InterfaceC796340VLs interfaceC796340VLs, Object obj) throws Throwable {
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
            case 5:
                bind$5(this, interfaceC796340VLs, obj);
                break;
            case 6:
                bind$6(this, interfaceC796340VLs, obj);
                break;
            case 7:
                bind$7(this, interfaceC796340VLs, obj);
                break;
            case 8:
                bind$8(this, interfaceC796340VLs, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                bind$9(this, interfaceC796340VLs, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                bind$10(this, interfaceC796340VLs, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                bind$11(this, interfaceC796340VLs, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                bind$12(this, interfaceC796340VLs, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                bind$13(this, interfaceC796340VLs, obj);
                break;
            case 14:
                bind$14(this, interfaceC796340VLs, obj);
                break;
            case 15:
                bind$15(this, interfaceC796340VLs, obj);
                break;
            case 16:
                bind$16(this, interfaceC796340VLs, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                bind$17(this, interfaceC796340VLs, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                bind$18(this, interfaceC796340VLs, obj);
                break;
            case 19:
                bind$19(this, interfaceC796340VLs, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                bind$20(this, interfaceC796340VLs, obj);
                break;
            case 21:
                bind$21(this, interfaceC796340VLs, obj);
                break;
            case 22:
                bind$22(this, interfaceC796340VLs, obj);
                break;
            case 23:
                bind$23(this, interfaceC796340VLs, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                bind$24(this, interfaceC796340VLs, obj);
                break;
            case 25:
                bind$25(this, interfaceC796340VLs, obj);
                break;
            case 26:
                bind$26(this, interfaceC796340VLs, obj);
                break;
            case 27:
                bind$27(this, interfaceC796340VLs, obj);
                break;
            case 28:
                bind$28(this, interfaceC796340VLs, obj);
                break;
            case 29:
                bind$29(this, interfaceC796340VLs, obj);
                break;
            case 30:
                bind$30(this, interfaceC796340VLs, obj);
                break;
            case 31:
                bind$31(this, interfaceC796340VLs, obj);
                break;
            case 32:
                bind$32(this, interfaceC796340VLs, obj);
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
            case 5:
                return createQuery$5(this);
            case 6:
                return createQuery$6(this);
            case 7:
                return createQuery$7(this);
            case 8:
                return createQuery$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return createQuery$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return createQuery$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return createQuery$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return createQuery$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return createQuery$13(this);
            case 14:
                return createQuery$14(this);
            case 15:
                return createQuery$15(this);
            case 16:
                return createQuery$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return createQuery$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return createQuery$18(this);
            case 19:
                return createQuery$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return createQuery$20(this);
            case 21:
                return createQuery$21(this);
            case 22:
                return createQuery$22(this);
            case 23:
                return createQuery$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return createQuery$24(this);
            case 25:
                return createQuery$25(this);
            case 26:
                return createQuery$26(this);
            case 27:
                return createQuery$27(this);
            case 28:
                return createQuery$28(this);
            case 29:
                return createQuery$29(this);
            case 30:
                return createQuery$30(this);
            case 31:
                return createQuery$31(this);
            case 32:
                return createQuery$32(this);
            default:
                return super.createQuery();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C854570Xfj(AbstractC796540VMm abstractC796540VMm, int i) {
        super(abstractC796540VMm);
        this.$t = i;
    }

    public static final void bind$0(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        Integer numValueOf;
        C816640W1u c816640W1u = (C816640W1u) obj;
        String str = c816640W1u.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        interfaceC796340VLs.LJIJ(2, c816640W1u.LIZIZ);
        String str2 = c816640W1u.LIZJ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIILIIL(3, str2);
        }
        Boolean bool = c816640W1u.LIZLLL;
        if (bool == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        }
        if (numValueOf == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIJ(4, numValueOf.intValue());
        }
        String str3 = c816640W1u.LJ;
        if (str3 == null) {
            interfaceC796340VLs.LLD(5);
        } else {
            interfaceC796340VLs.LJIILIIL(5, str3);
        }
        String str4 = c816640W1u.LJFF;
        if (str4 == null) {
            interfaceC796340VLs.LLD(6);
        } else {
            interfaceC796340VLs.LJIILIIL(6, str4);
        }
    }

    public static final void bind$1(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C816680W1y c816680W1y = (C816680W1y) obj;
        String str = c816680W1y.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c816680W1y.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        String str3 = c816680W1y.LIZJ;
        if (str3 == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIILIIL(3, str3);
        }
        String str4 = c816680W1y.LIZLLL;
        if (str4 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str4);
        }
        String str5 = c816680W1y.LJ;
        if (str5 == null) {
            interfaceC796340VLs.LLD(5);
        } else {
            interfaceC796340VLs.LJIILIIL(5, str5);
        }
        String str6 = c816680W1y.LJFF;
        if (str6 == null) {
            interfaceC796340VLs.LLD(6);
        } else {
            interfaceC796340VLs.LJIILIIL(6, str6);
        }
        String str7 = c816680W1y.LJI;
        if (str7 == null) {
            interfaceC796340VLs.LLD(7);
        } else {
            interfaceC796340VLs.LJIILIIL(7, str7);
        }
        interfaceC796340VLs.LJIJ(8, c816680W1y.LJII);
    }

    public static final void bind$10(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VNP c0vnp = (C0VNP) obj;
        String str = c0vnp.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        interfaceC796340VLs.LJIJ(2, c0vnp.LIZIZ);
        interfaceC796340VLs.LJIJ(3, c0vnp.LIZJ ? 1L : 0L);
        String str2 = c0vnp.LIZLLL;
        if (str2 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str2);
        }
        interfaceC796340VLs.LJIJ(5, c0vnp.LJ);
        interfaceC796340VLs.LJIJ(6, c0vnp.LJFF);
    }

    public static final void bind$11(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VNG c0vng = (C0VNG) obj;
        String str = c0vng.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        interfaceC796340VLs.LJIJ(2, c0vng.LIZIZ);
        interfaceC796340VLs.LJIJ(3, c0vng.LIZJ ? 1L : 0L);
        String str2 = c0vng.LIZLLL;
        if (str2 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str2);
        }
        interfaceC796340VLs.LJIJ(5, c0vng.LJ);
        interfaceC796340VLs.LJIJ(6, c0vng.LJFF);
    }

    public static final void bind$12(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C795310VHt c795310VHt = (C795310VHt) obj;
        String str = c795310VHt.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c795310VHt.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
    }

    public static final void bind$13(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VIB c0vib = (C0VIB) obj;
        String str = c0vib.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        Long l = c0vib.LIZIZ;
        if (l == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIJ(2, l.longValue());
        }
    }

    public static final void bind$14(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        String str = ((C0VH0) obj).LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        interfaceC796340VLs.LJIJ(2, r4.LIZIZ);
    }

    public static final void bind$15(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C795320VHu c795320VHu = (C795320VHu) obj;
        String str = c795320VHu.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c795320VHu.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
    }

    public static final void bind$16(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) throws IOException {
        obj.getClass();
        interfaceC796340VLs.LLD(1);
        byte[] bArrLIZLLL = C795380VIa.LIZLLL(null);
        if (bArrLIZLLL == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJJIIJZLJL(2, bArrLIZLLL);
        }
    }

    public static final void bind$17(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) throws Throwable {
        int i;
        int i2;
        ObjectOutputStream objectOutputStream;
        C0VIG c0vig = (C0VIG) obj;
        String str = c0vig.LIZ;
        int i3 = 1;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        interfaceC796340VLs.LJIJ(2, C0VII.LJFF(c0vig.LIZIZ));
        String str2 = c0vig.LIZJ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIILIIL(3, str2);
        }
        String str3 = c0vig.LIZLLL;
        if (str3 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str3);
        }
        byte[] bArrLIZLLL = C795380VIa.LIZLLL(c0vig.LJ);
        if (bArrLIZLLL == null) {
            interfaceC796340VLs.LLD(5);
        } else {
            interfaceC796340VLs.LJJIIJZLJL(5, bArrLIZLLL);
        }
        byte[] bArrLIZLLL2 = C795380VIa.LIZLLL(c0vig.LJFF);
        if (bArrLIZLLL2 == null) {
            interfaceC796340VLs.LLD(6);
        } else {
            interfaceC796340VLs.LJJIIJZLJL(6, bArrLIZLLL2);
        }
        interfaceC796340VLs.LJIJ(7, c0vig.LJI);
        interfaceC796340VLs.LJIJ(8, c0vig.LJII);
        interfaceC796340VLs.LJIJ(9, c0vig.LJIIIIZZ);
        interfaceC796340VLs.LJIJ(10, c0vig.LJIIJ);
        C0VIT c0vit = c0vig.LJIIJJI;
        int i4 = C0VIJ.LIZIZ[c0vit.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                i = 1;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Could not convert ");
                sbLIZ.append(c0vit);
                sbLIZ.append(" to int");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            i = 0;
        }
        interfaceC796340VLs.LJIJ(11, i);
        interfaceC796340VLs.LJIJ(12, c0vig.LJIIL);
        interfaceC796340VLs.LJIJ(13, c0vig.LJIILIIL);
        interfaceC796340VLs.LJIJ(14, c0vig.LJIILJJIL);
        interfaceC796340VLs.LJIJ(15, c0vig.LJIILL);
        interfaceC796340VLs.LJIJ(16, c0vig.LJIILLIIL ? 1L : 0L);
        C0VIU c0viu = c0vig.LJIIZILJ;
        int i5 = C0VIJ.LIZLLL[c0viu.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                i2 = 1;
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Could not convert ");
                sbLIZ2.append(c0viu);
                sbLIZ2.append(" to int");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else {
            i2 = 0;
        }
        interfaceC796340VLs.LJIJ(17, i2);
        C0VIK c0vik = c0vig.LJIIIZ;
        if (c0vik != null) {
            EnumC794930VGh enumC794930VGh = c0vik.LIZ;
            int i6 = C0VIJ.LIZJ[enumC794930VGh.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 != 5) {
                                if (Build.VERSION.SDK_INT >= 30 && enumC794930VGh == EnumC794930VGh.TEMPORARILY_UNMETERED) {
                                    i3 = 5;
                                } else {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("Could not convert ");
                                    sbLIZ3.append(enumC794930VGh);
                                    sbLIZ3.append(" to int");
                                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                                }
                            } else {
                                i3 = 4;
                            }
                        } else {
                            i3 = 3;
                        }
                    } else {
                        i3 = 2;
                    }
                }
            } else {
                i3 = 0;
            }
            interfaceC796340VLs.LJIJ(18, i3);
            interfaceC796340VLs.LJIJ(19, c0vik.LIZIZ ? 1L : 0L);
            interfaceC796340VLs.LJIJ(20, c0vik.LIZJ ? 1L : 0L);
            interfaceC796340VLs.LJIJ(21, c0vik.LIZLLL ? 1L : 0L);
            interfaceC796340VLs.LJIJ(22, c0vik.LJ ? 1L : 0L);
            interfaceC796340VLs.LJIJ(23, c0vik.LJFF);
            interfaceC796340VLs.LJIJ(24, c0vik.LJI);
            C0VIV c0viv = c0vik.LJII;
            ObjectOutputStream objectOutputStream2 = null;
            if (((HashSet) c0viv.LIZ).size() != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    e = e;
                }
                try {
                    objectOutputStream.writeInt(((HashSet) c0viv.LIZ).size());
                    for (C0VIE c0vie : (HashSet) c0viv.LIZ) {
                        objectOutputStream.writeUTF(c0vie.LIZ.toString());
                        objectOutputStream.writeBoolean(c0vie.LIZIZ);
                    }
                    try {
                        objectOutputStream.close();
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                } catch (IOException e3) {
                    e = e3;
                    objectOutputStream2 = objectOutputStream;
                    TryCatchGuardChecker.doCheck(e);
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream2 = objectOutputStream;
                    TryCatchGuardChecker.doCheck(th);
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e6) {
                        TryCatchGuardChecker.doCheck(e6);
                        throw th;
                    }
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e7) {
                    TryCatchGuardChecker.doCheck(e7);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray != null) {
                    interfaceC796340VLs.LJJIIJZLJL(25, byteArray);
                    return;
                }
            }
            interfaceC796340VLs.LLD(25);
            return;
        }
        interfaceC796340VLs.LLD(18);
        interfaceC796340VLs.LLD(19);
        interfaceC796340VLs.LLD(20);
        interfaceC796340VLs.LLD(21);
        interfaceC796340VLs.LLD(22);
        interfaceC796340VLs.LLD(23);
        interfaceC796340VLs.LLD(24);
        interfaceC796340VLs.LLD(25);
    }

    public static final void bind$18(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C795330VHv c795330VHv = (C795330VHv) obj;
        String str = c795330VHv.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c795330VHv.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
    }

    public static final void bind$19(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VMI c0vmi = (C0VMI) obj;
        String str = c0vmi.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c0vmi.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        interfaceC796340VLs.LJIJ(3, c0vmi.LIZJ);
        if (c0vmi.LIZLLL == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIJ(4, r0.intValue());
        }
        String str3 = c0vmi.LJ;
        if (str3 == null) {
            interfaceC796340VLs.LLD(5);
        } else {
            interfaceC796340VLs.LJIILIIL(5, str3);
        }
    }

    public static final void bind$2(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        Integer numValueOf;
        C816650W1v c816650W1v = (C816650W1v) obj;
        String str = c816650W1v.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        if (c816650W1v.LIZIZ == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIJ(2, r0.intValue());
        }
        if (c816650W1v.LIZJ == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIJ(3, r0.intValue());
        }
        Boolean bool = c816650W1v.LIZLLL;
        if (bool == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        }
        if (numValueOf == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIJ(4, numValueOf.intValue());
        }
        interfaceC796340VLs.LJIJ(5, c816650W1v.LJ);
    }

    public static final void bind$20(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VML c0vml = (C0VML) obj;
        interfaceC796340VLs.LJIJ(1, c0vml.LIZ);
        String str = c0vml.LIZIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str);
        }
        interfaceC796340VLs.LJIJ(3, c0vml.LIZJ);
        String str2 = c0vml.LIZLLL;
        if (str2 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str2);
        }
        String str3 = c0vml.LJ;
        if (str3 == null) {
            interfaceC796340VLs.LLD(5);
        } else {
            interfaceC796340VLs.LJIILIIL(5, str3);
        }
    }

    public static final void bind$21(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VMR c0vmr = (C0VMR) obj;
        interfaceC796340VLs.LJIJ(1, c0vmr.LIZ);
        String str = c0vmr.LIZIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str);
        }
        interfaceC796340VLs.LJIJ(3, c0vmr.LIZJ);
        interfaceC796340VLs.LJIJ(4, c0vmr.LIZLLL);
        String str2 = c0vmr.LJ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(5);
        } else {
            interfaceC796340VLs.LJIILIIL(5, str2);
        }
        String str3 = c0vmr.LJFF;
        if (str3 == null) {
            interfaceC796340VLs.LLD(6);
        } else {
            interfaceC796340VLs.LJIILIIL(6, str3);
        }
        String str4 = c0vmr.LJI;
        if (str4 == null) {
            interfaceC796340VLs.LLD(7);
        } else {
            interfaceC796340VLs.LJIILIIL(7, str4);
        }
    }

    public static final void bind$22(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VKZ c0vkz = (C0VKZ) obj;
        interfaceC796340VLs.LJIJ(1, c0vkz.LIZ);
        String str = c0vkz.LIZIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str);
        }
        String str2 = c0vkz.LIZJ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIILIIL(3, str2);
        }
        interfaceC796340VLs.LJIJ(4, c0vkz.LIZLLL);
    }

    public static final void bind$23(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C795950VKf c795950VKf = (C795950VKf) obj;
        String str = c795950VKf.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c795950VKf.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
    }

    public static final void bind$24(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VJ1 c0vj1 = (C0VJ1) obj;
        String str = c0vj1.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c0vj1.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
    }

    public static final void bind$25(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VLX c0vlx = (C0VLX) obj;
        String str = c0vlx.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c0vlx.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        interfaceC796340VLs.LJIJ(3, c0vlx.LIZJ);
        interfaceC796340VLs.LJIJ(4, c0vlx.LIZLLL);
        interfaceC796340VLs.LJJI(c0vlx.LJ, 5);
    }

    public static final void bind$26(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VLP c0vlp = (C0VLP) obj;
        interfaceC796340VLs.LJIJ(1, c0vlp.LIZ);
        String str = c0vlp.LIZIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str);
        }
        String str2 = c0vlp.LIZJ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIILIIL(3, str2);
        }
        interfaceC796340VLs.LJIJ(4, c0vlp.LIZLLL);
        interfaceC796340VLs.LJIJ(5, c0vlp.LJ);
    }

    public static final void bind$27(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VL6 c0vl6 = (C0VL6) obj;
        String str = c0vl6.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c0vl6.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
    }

    public static final void bind$28(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C801390Vc9 c801390Vc9 = (C801390Vc9) obj;
        String str = c801390Vc9.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c801390Vc9.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        interfaceC796340VLs.LJIJ(3, c801390Vc9.LIZJ);
        interfaceC796340VLs.LJIJ(4, c801390Vc9.LIZLLL);
        interfaceC796340VLs.LJIJ(5, c801390Vc9.LJ);
        String str3 = c801390Vc9.LJFF;
        if (str3 == null) {
            interfaceC796340VLs.LLD(6);
        } else {
            interfaceC796340VLs.LJIILIIL(6, str3);
        }
        interfaceC796340VLs.LJIJ(7, c801390Vc9.LJI);
        interfaceC796340VLs.LJIJ(8, c801390Vc9.LJII);
        String str4 = c801390Vc9.LJIIIIZZ;
        if (str4 == null) {
            interfaceC796340VLs.LLD(9);
        } else {
            interfaceC796340VLs.LJIILIIL(9, str4);
        }
    }

    public static final void bind$29(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C796400VLy c796400VLy = (C796400VLy) obj;
        String str = c796400VLy.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c796400VLy.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        interfaceC796340VLs.LJIJ(3, c796400VLy.LIZJ);
        String str3 = c796400VLy.LIZLLL;
        if (str3 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str3);
        }
        interfaceC796340VLs.LJIJ(5, c796400VLy.LJ);
    }

    public static final void bind$3(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        Integer numValueOf;
        C795570VIt c795570VIt = (C795570VIt) obj;
        String str = c795570VIt.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c795570VIt.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        Boolean bool = c795570VIt.LIZJ;
        if (bool == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        }
        if (numValueOf == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIJ(3, numValueOf.intValue());
        }
        String str3 = c795570VIt.LIZLLL;
        if (str3 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str3);
        }
        String str4 = c795570VIt.LJ;
        if (str4 == null) {
            interfaceC796340VLs.LLD(5);
        } else {
            interfaceC796340VLs.LJIILIIL(5, str4);
        }
        interfaceC796340VLs.LJIJ(6, c795570VIt.LJFF);
    }

    public static final void bind$30(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C796400VLy c796400VLy = (C796400VLy) obj;
        String str = c796400VLy.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c796400VLy.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        interfaceC796340VLs.LJIJ(3, c796400VLy.LIZJ);
        String str3 = c796400VLy.LIZLLL;
        if (str3 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str3);
        }
        interfaceC796340VLs.LJIJ(5, c796400VLy.LJ);
    }

    public static final void bind$31(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C801520VcM c801520VcM = (C801520VcM) obj;
        interfaceC796340VLs.LJIJ(1, c801520VcM.LIZ);
        String str = c801520VcM.LIZIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str);
        }
        interfaceC796340VLs.LJIJ(3, c801520VcM.LIZJ);
        String str2 = c801520VcM.LIZLLL;
        if (str2 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str2);
        }
        String str3 = c801520VcM.LJ;
        if (str3 == null) {
            interfaceC796340VLs.LLD(5);
        } else {
            interfaceC796340VLs.LJIILIIL(5, str3);
        }
        interfaceC796340VLs.LJIJ(6, C825030WYb.LIZ(c801520VcM.LJFF));
        interfaceC796340VLs.LJIJ(7, c801520VcM.LJI);
        byte[] bArr = c801520VcM.LJII;
        if (bArr == null) {
            interfaceC796340VLs.LLD(8);
        } else {
            interfaceC796340VLs.LJJIIJZLJL(8, bArr);
        }
        String str4 = c801520VcM.LJIIIIZZ;
        if (str4 == null) {
            interfaceC796340VLs.LLD(9);
        } else {
            interfaceC796340VLs.LJIILIIL(9, str4);
        }
        String str5 = c801520VcM.LJIIIZ;
        if (str5 == null) {
            interfaceC796340VLs.LLD(10);
        } else {
            interfaceC796340VLs.LJIILIIL(10, str5);
        }
    }

    public static final void bind$32(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C801520VcM c801520VcM = (C801520VcM) obj;
        interfaceC796340VLs.LJIJ(1, c801520VcM.LIZ);
        String str = c801520VcM.LIZIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str);
        }
        interfaceC796340VLs.LJIJ(3, c801520VcM.LIZJ);
        String str2 = c801520VcM.LIZLLL;
        if (str2 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str2);
        }
        String str3 = c801520VcM.LJ;
        if (str3 == null) {
            interfaceC796340VLs.LLD(5);
        } else {
            interfaceC796340VLs.LJIILIIL(5, str3);
        }
        interfaceC796340VLs.LJIJ(6, C825030WYb.LIZ(c801520VcM.LJFF));
        interfaceC796340VLs.LJIJ(7, c801520VcM.LJI);
        byte[] bArr = c801520VcM.LJII;
        if (bArr == null) {
            interfaceC796340VLs.LLD(8);
        } else {
            interfaceC796340VLs.LJJIIJZLJL(8, bArr);
        }
        String str4 = c801520VcM.LJIIIIZZ;
        if (str4 == null) {
            interfaceC796340VLs.LLD(9);
        } else {
            interfaceC796340VLs.LJIILIIL(9, str4);
        }
        String str5 = c801520VcM.LJIIIZ;
        if (str5 == null) {
            interfaceC796340VLs.LLD(10);
        } else {
            interfaceC796340VLs.LJIILIIL(10, str5);
        }
    }

    public static final void bind$4(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VL0 c0vl0 = (C0VL0) obj;
        String str = c0vl0.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        Long l = c0vl0.LIZIZ;
        if (l == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIJ(2, l.longValue());
        }
    }

    public static final void bind$5(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C1581806Hg c1581806Hg = (C1581806Hg) obj;
        String str = c1581806Hg.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        interfaceC796340VLs.LJIJ(2, c1581806Hg.LIZIZ);
        interfaceC796340VLs.LJIJ(3, c1581806Hg.LIZJ);
        String str2 = c1581806Hg.LIZLLL;
        if (str2 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str2);
        }
    }

    public static final void bind$6(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VLB c0vlb = (C0VLB) obj;
        interfaceC796340VLs.LJIJ(1, c0vlb.LIZ);
        String str = c0vlb.LIZIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str);
        }
        interfaceC796340VLs.LJIJ(3, c0vlb.LIZJ);
        String str2 = c0vlb.LIZLLL;
        if (str2 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str2);
        }
    }

    public static final void bind$7(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        int value;
        int value2;
        int value3;
        C0WYV c0wyv = (C0WYV) obj;
        String str = c0wyv.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c0wyv.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        String str3 = c0wyv.LIZJ;
        if (str3 == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIILIIL(3, str3);
        }
        interfaceC796340VLs.LJIJ(4, c0wyv.LIZLLL);
        byte[] bArr = c0wyv.LJ;
        if (bArr == null) {
            interfaceC796340VLs.LLD(5);
        } else {
            interfaceC796340VLs.LJJIIJZLJL(5, bArr);
        }
        String str4 = c0wyv.LJFF;
        if (str4 == null) {
            interfaceC796340VLs.LLD(6);
        } else {
            interfaceC796340VLs.LJIILIIL(6, str4);
        }
        interfaceC796340VLs.LJIJ(7, c0wyv.LJI);
        interfaceC796340VLs.LJIJ(8, c0wyv.LJII.getValue());
        EnumC825070WYf enumC825070WYf = c0wyv.LJIIIIZZ;
        if (enumC825070WYf == null) {
            value = EnumC825070WYf.ORIGIN.getValue();
        } else {
            value = enumC825070WYf.getValue();
        }
        interfaceC796340VLs.LJIJ(9, value);
        interfaceC796340VLs.LJIJ(10, c0wyv.LJIIIZ);
        interfaceC796340VLs.LJIJ(11, c0wyv.LJIIJ);
        interfaceC796340VLs.LJIJ(12, C825030WYb.LIZ(c0wyv.LJIIJJI));
        String str5 = c0wyv.LJIIL;
        if (str5 == null) {
            interfaceC796340VLs.LLD(13);
        } else {
            interfaceC796340VLs.LJIILIIL(13, str5);
        }
        interfaceC796340VLs.LJIJ(14, C825040WYc.LIZ(c0wyv.LJIILIIL));
        EnumC1527270pqX enumC1527270pqX = c0wyv.LJIILJJIL;
        if (enumC1527270pqX == null) {
            value2 = EnumC1527270pqX.Full.getValue();
        } else {
            value2 = enumC1527270pqX.getValue();
        }
        interfaceC796340VLs.LJIJ(15, value2);
        interfaceC796340VLs.LJIJ(16, c0wyv.LJIILL);
        EnumC1527260pqW enumC1527260pqW = c0wyv.LJIILLIIL;
        if (enumC1527260pqW == null) {
            value3 = EnumC1527260pqW.Noop.getValue();
        } else {
            value3 = enumC1527260pqW.getValue();
        }
        interfaceC796340VLs.LJIJ(17, value3);
        Map<String, String> map = c0wyv.LJIIZILJ;
        String strJ3 = "";
        if (map != null) {
            try {
                strJ3 = C786410Ut5.J3(new JSONObject(map));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (strJ3 == null) {
            interfaceC796340VLs.LLD(18);
        } else {
            interfaceC796340VLs.LJIILIIL(18, strJ3);
        }
    }

    public static final void bind$8(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        String str = ((C0VKM) obj).LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        interfaceC796340VLs.LJIJ(2, r4.LIZIZ);
    }

    public static final void bind$9(C854570Xfj c854570Xfj, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0VNJ c0vnj = (C0VNJ) obj;
        String str = c0vnj.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        interfaceC796340VLs.LJIJ(2, c0vnj.LIZIZ);
        interfaceC796340VLs.LJIJ(3, c0vnj.LIZJ ? 1L : 0L);
        String str2 = c0vnj.LIZLLL;
        if (str2 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str2);
        }
        interfaceC796340VLs.LJIJ(5, c0vnj.LJ);
        interfaceC796340VLs.LJIJ(6, c0vnj.LJFF);
    }
}

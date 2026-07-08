package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.GiftSuspension;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0fTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128760fTm {
    public static final C1128760fTm LJIIJ;
    public static final String LJIIJJI;
    public static final String LJIIL;
    public static final String LJIILIIL;
    public static final String LJIILJJIL;
    public static final String LJIILL;
    public static final String LJIILLIIL;
    public String LIZ;
    public int LIZIZ;
    public int LIZJ;
    public List<? extends Gift> LIZLLL;
    public String LJI;
    public long LJII;
    public boolean LJIIIZ;
    public String LJ = "no_gift";
    public long LJFF = C158B.LIZ();
    public final CopyOnWriteArraySet<Long> LJIIIIZZ = new CopyOnWriteArraySet<>();

    static {
        new C1128460fTI();
        LJIIJ = C1130320fWI.LIZ;
        LJIIJJI = "is_anchor";
        LJIIL = "convenient_icon";
        LJIILIIL = "short_roomgift_limit";
        LJIILJJIL = "all_roomgift_limit";
        LJIILL = "uid_gift_limit";
        LJIILLIIL = "activities";
    }

    public static String LJI() {
        IInteractService iInteractService = C1128450fTH.LIZ;
        return C1128450fTH.LJIJI(UserService.getInstance().user().LJIJJLI());
    }

    public static Map LJIIL() {
        HashMap map = new HashMap();
        IInteractService iInteractService = C1128450fTH.LIZ;
        if (iInteractService.tn0() >= 0) {
            map.put("pk_status", String.valueOf(iInteractService.tn0()));
        }
        if (iInteractService.Oh1() >= 0) {
            map.put("pk_preview_win", String.valueOf(iInteractService.Oh1()));
        }
        return map;
    }

    public static Map LJIILIIL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_multi", C1128450fTH.LIZ.b70().size() > 2 ? "1" : CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("team_member_cnts", C1128450fTH.LJIJ());
        linkedHashMap.put("sub_match_type", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Ti2());
        return linkedHashMap;
    }

    public static Map LJIILJJIL() {
        String strW30;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (C781520UlC.LJ(room != null ? room.getStreamType() : null)) {
            IInteractService iInteractService = C1128450fTH.LIZ;
            IInteractService iInteractService2 = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
            if (iInteractService2 == null || (strW30 = iInteractService2.w30()) == null) {
                strW30 = "";
            }
            linkedHashMap.put("layout_id", strW30);
        }
        return linkedHashMap;
    }

    public static boolean LJIJJLI() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return room != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId();
    }

    public static void LJJJIL() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("subscribe_expire");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
        c474500IjALIZ.LJJII(w.LJJII(), "video_id");
        c474500IjALIZ.LJJII("sub_gift", "click_position");
        c474500IjALIZ.LIZ();
    }

    public static boolean LIZJ(Gift gift) {
        int i;
        C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        if (c1094360eaIHP == null) {
            return false;
        }
        if (gift != null) {
            i = gift.diamondCount;
        } else {
            i = 0;
        }
        if (((long) i) + c1094360eaIHP.LIZIZ <= c1094360eaIHP.LJII) {
            return false;
        }
        return true;
    }

    public static void LJ(String str) {
        Long lValueOf;
        String str2;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            room.getOwnerUserId();
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_ban_toast_show");
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJII(str, "toast_reason");
        String str3 = LJIIJJI;
        if (LJIJJLI()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, str3);
        c474500IjALIZ.LIZ();
    }

    public static String LJFF(EnumC1129230fUX enumC1129230fUX) {
        switch (C1129220fUW.LIZ[enumC1129230fUX.ordinal()]) {
            case 1:
                return "speed_gift";
            case 2:
                return "multi_speed_gift";
            case 3:
            case 4:
            case 5:
                return "gift_panel";
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "jsb";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "outside_live_ug_page";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case 15:
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 19:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 21:
                return "other";
            default:
                throw new C1954807lC();
        }
    }

    public static String LJIJ(Gift gift) {
        GiftLockInfo giftLockInfo;
        Integer numValueOf;
        if (gift != null && (giftLockInfo = gift.giftSubInfo) != null && (numValueOf = Integer.valueOf(giftLockInfo.mLockType)) != null) {
            if (numValueOf.intValue() == 1) {
                return "subscribe_lock_gift";
            }
            if (numValueOf.intValue() == 2) {
                return "event_lock_gift";
            }
            return "normal_gift";
        }
        return "normal_gift";
    }

    public static int LJIJI(Gift gift) {
        Gift.MusicGiftInfo.AudioResource audioResource;
        List<String> listLIZ;
        boolean z;
        Gift.MusicGiftInfo musicGiftInfo;
        Boolean boolValueOf = null;
        if (gift != null && (musicGiftInfo = gift.musicInfo) != null) {
            audioResource = musicGiftInfo.resource;
        } else {
            audioResource = null;
        }
        if (audioResource == null) {
            return 0;
        }
        ImageModel imageModel = gift.giftBottomRightLabelIcon;
        if (imageModel != null && (listLIZ = C842240X2g.LIZ(imageModel)) != null) {
            if (!listLIZ.isEmpty()) {
                Iterator<String> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    if (!a0.LJJJIL(it2.next())) {
                        z = true;
                        break;
                    }
                }
                z = false;
                boolValueOf = Boolean.valueOf(z);
            } else {
                z = false;
                boolValueOf = Boolean.valueOf(z);
            }
        }
        if (!C500260Jjc.LJJJI(boolValueOf)) {
            return 0;
        }
        return 1;
    }

    public static String LJIJJ(String str) {
        MessageDigest messageDigest;
        byte[] bArrDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            messageDigest = null;
        }
        if (messageDigest != null) {
            bArrDigest = messageDigest.digest(str.getBytes(Charsets.UTF_8));
        }
        return C08HM.LJ(bArrDigest);
    }

    public static int LJJ(Gift gift) {
        Long lValueOf;
        if (gift != null) {
            lValueOf = Long.valueOf(gift.id);
        } else {
            lValueOf = null;
        }
        return C1127480fRi.LJ(lValueOf, null) ? 1 : 0;
    }

    public static int LJJI(Gift gift) {
        GiftPanelBanner giftPanelBanner;
        if (gift != null && (giftPanelBanner = gift.giftPanelBanner) != null && giftPanelBanner.bannerPriority == 3) {
            return 1;
        }
        return 0;
    }

    public static boolean LJJIFFI(Gift gift) {
        GiftLockInfo giftLockInfo;
        if (gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 3) {
            return true;
        }
        return false;
    }

    public static void LJJIIJZLJL(String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("special_gift_icon_show");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZ.LJJII(str, "animation_type");
        if (LJIJJLI()) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        c474500IjALIZ.LJJII(str2, "user_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIL(String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("levelupgame_entrance_show");
        c474500IjALIZ.LJJII(new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date()), "natural_month");
        if (LJIJJLI()) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        c474500IjALIZ.LJJII(str2, "user_type");
        c474500IjALIZ.LJJII(str, "entrance_type");
        c474500IjALIZ.LIZ();
    }

    public final int LJIILL(long j) {
        List<? extends Gift> list = this.LIZLLL;
        if (list == null) {
            return 0;
        }
        Iterator<? extends Gift> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i++;
            if (it2.next().id == j) {
                return i % 8;
            }
        }
        return 0;
    }

    public final void LJJJLIIL(List<? extends Gift> list) {
        String str;
        if (list != null) {
            this.LIZLLL = list;
            Gift communityGift = GiftManager.inst().getCommunityGift();
            if (communityGift == null) {
                str = "no_gift";
            } else if (!communityGift.isDisplayedOnPanel) {
                str = "eligible_omitted";
            } else {
                GiftLockInfo giftLockInfo = communityGift.giftSubInfo;
                if (giftLockInfo != null && giftLockInfo.mLock) {
                    str = "eligible_locked";
                } else {
                    str = "eligible_unlocked";
                }
            }
            this.LJ = str;
        }
    }

    public static void LIZ(C474500IjA c474500IjA, List list) {
        Gift.MusicGiftInfo musicGiftInfo;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            Gift giftFindGiftById = GiftManager.inst().findGiftById(((Number) it2.next()).longValue());
            if (giftFindGiftById != null && (musicGiftInfo = giftFindGiftById.musicInfo) != null) {
                Gift.MusicGiftInfo.AudioResource audioResource = musicGiftInfo.resource;
                if (audioResource != null) {
                    Long lValueOf = Long.valueOf(audioResource.snippetId);
                    if (lValueOf.longValue() > 0) {
                        arrayList.add(Long.valueOf(lValueOf.longValue()));
                    }
                }
                Long lValueOf2 = Long.valueOf(musicGiftInfo.songId);
                if (lValueOf2.longValue() > 0) {
                    arrayList2.add(Long.valueOf(lValueOf2.longValue()));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            c474500IjA.LJJII(arrayList.toString(), "music_snippet_id_list");
        }
        if (!arrayList2.isEmpty()) {
            c474500IjA.LJJII(arrayList2.toString(), "music_song_id_list");
        }
    }

    public static String LJIIIIZZ(int i, C1125300fOC c1125300fOC) {
        Boolean boolValueOf;
        Map<String, Object> map;
        Map<String, Object> map2;
        Object obj = null;
        if (c1125300fOC != null && (map2 = c1125300fOC.LIZIZ) != null) {
            boolValueOf = Boolean.valueOf(map2.containsKey("gift_position"));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            if (c1125300fOC != null && (map = c1125300fOC.LIZIZ) != null) {
                obj = map.get("gift_position");
            }
            return String.valueOf(obj);
        }
        return String.valueOf(i);
    }

    public static String LJIIIZ(String str, C1125300fOC c1125300fOC) {
        Boolean boolValueOf;
        Map<String, Object> map;
        Map<String, Object> map2;
        Object obj = null;
        if (c1125300fOC != null && (map2 = c1125300fOC.LIZIZ) != null) {
            boolValueOf = Boolean.valueOf(map2.containsKey("request_panel_id"));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            if (c1125300fOC != null && (map = c1125300fOC.LIZIZ) != null) {
                obj = map.get("request_panel_id");
            }
            return String.valueOf(obj);
        }
        return str;
    }

    public static String LJIIJ(int i, C1125300fOC c1125300fOC) {
        Boolean boolValueOf;
        Map<String, Object> map;
        Map<String, Object> map2;
        Object obj = null;
        if (c1125300fOC != null && (map2 = c1125300fOC.LIZIZ) != null) {
            boolValueOf = Boolean.valueOf(map2.containsKey("tab_position"));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            if (c1125300fOC != null && (map = c1125300fOC.LIZIZ) != null) {
                obj = map.get("tab_position");
            }
            return String.valueOf(obj);
        }
        return String.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0084 A[PHI: r10
      0x0084: PHI (r10v1 boolean) = (r10v0 boolean), (r10v5 boolean), (r10v5 boolean) binds: [B:56:0x0081, B:15:0x0023, B:17:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0088 A[PHI: r9 r10
      0x0088: PHI (r9v1 boolean) = (r9v0 boolean), (r9v3 boolean), (r9v3 boolean) binds: [B:59:0x0085, B:20:0x002d, B:22:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r10v2 boolean) = (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:59:0x0085, B:20:0x002d, B:22:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIILLIIL(com.bytedance.android.livesdk.model.Gift r12, java.lang.String r13) {
        /*
            if (r12 == 0) goto L8c
            long r1 = r12.id
        L4:
            boolean r11 = LJJIFFI(r12)
            if (r12 == 0) goto L8a
            boolean r8 = r12.isRandomGift
        Lc:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            boolean r4 = X.C1126610fQJ.LIZ(r0)
            r7 = 4
            r6 = 1
            if (r12 == 0) goto L80
            com.bytedance.android.livesdk.model.GiftLockInfo r0 = r12.giftSubInfo
            if (r0 == 0) goto L80
            int r0 = r0.mLockType
            if (r0 != r7) goto L80
            r10 = 1
        L21:
            com.bytedance.android.livesdk.model.GiftLockInfo r0 = r12.giftSubInfo
            if (r0 == 0) goto L84
            int r3 = r0.mLockType
            r0 = 5
            if (r3 != r0) goto L84
            r9 = 1
        L2b:
            com.bytedance.android.livesdk.model.GiftLockInfo r0 = r12.giftSubInfo
            if (r0 == 0) goto L88
            int r3 = r0.mLockType
            r0 = 6
            if (r3 != r0) goto L88
            r5 = 1
        L35:
            if (r4 == 0) goto L3a
            java.lang.String r13 = "fans_club_upgrade_celebration_gift"
        L39:
            return r13
        L3a:
            X.0fGn r0 = X.InterfaceC1133710fbl.LIZ
            r0.getClass()
            X.0fbl r0 = X.C1120710fGn.LIZ()
            X.0fc8 r0 = (X.C1133940fc8) r0
            long r3 = r0.LJI()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L50
            java.lang.String r13 = "first_recharge_gift"
            return r13
        L50:
            X.0fSt r0 = com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst()
            com.bytedance.android.livesdk.model.Gift r0 = r0.findGiftById(r1)
            if (r0 == 0) goto L61
            boolean r0 = r0.isBroadcastGift
            if (r0 != r6) goto L61
            java.lang.String r13 = "announcements_gift"
            return r13
        L61:
            if (r8 == 0) goto L66
            java.lang.String r13 = "travel_gift"
            return r13
        L66:
            if (r11 == 0) goto L6b
            java.lang.String r13 = "user_level_gift"
            return r13
        L6b:
            if (r10 == 0) goto L70
            java.lang.String r13 = "fans_club_unlock_gift"
            return r13
        L70:
            if (r9 == 0) goto L75
            java.lang.String r13 = "fans_club_gift"
            return r13
        L75:
            if (r5 == 0) goto L39
            if (r12 == 0) goto L90
            int r0 = r12.groupInTab
            if (r7 != r0) goto L90
            java.lang.String r13 = "fans_club_team_challenge_unlock_gift"
            return r13
        L80:
            r10 = 0
            if (r12 == 0) goto L84
            goto L21
        L84:
            r9 = 0
            if (r12 == 0) goto L88
            goto L2b
        L88:
            r5 = 0
            goto L35
        L8a:
            r8 = 0
            goto Lc
        L8c:
            r1 = 0
            goto L4
        L90:
            java.lang.String r13 = "team_rank_unlock_gift"
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128760fTm.LJIILLIIL(com.bytedance.android.livesdk.model.Gift, java.lang.String):java.lang.String");
    }

    public static int LJIL(String str, String str2) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -61883557) {
                if (iHashCode != 967896495) {
                    if (iHashCode == 1868627474 && str.equals("fans_club_consume_task")) {
                        return 1;
                    }
                } else if (str.equals("fans_club_task")) {
                    return 1;
                }
            } else if (str.equals("fans_club_gift_month")) {
                return 1;
            }
        }
        if (str2 != null) {
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != -61883557) {
                if (iHashCode2 != 967896495) {
                    if (iHashCode2 != 1868627474 || !str2.equals("fans_club_consume_task")) {
                        return 0;
                    }
                    return 1;
                }
                if (!str2.equals("fans_club_task")) {
                    return 0;
                }
                return 1;
            }
            if (!str2.equals("fans_club_gift_month")) {
                return 0;
            }
            return 1;
        }
        return 0;
    }

    public static void LJJIIZ(int i, String str) {
        Pair<String, String> pairLJIILJJIL = C1128450fTH.LJIILJJIL();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("send_gift_all_user_exceed_popup");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZ.LJJII(pairLJIILJJIL.getFirst(), "layout_setting");
        c474500IjALIZ.LJJII(pairLJIILJJIL.getSecond(), "window_setting");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "guest_cnt");
        c474500IjALIZ.LJJII(str, "popup_action_type");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJIIJI(X.InterfaceC1131100fXY r4, java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128760fTm.LJJIJIIJI(X.0fXY, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJJ(com.bytedance.android.livesdk.model.Gift r11, boolean r12) throws org.json.JSONException {
        /*
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            long r7 = X.C158B.LIZ()
            long r9 = java.lang.System.currentTimeMillis()
            X.C1135800ff8.LJIILJJIL(r5, r6, r7, r9)
            X.C1123380fL6.LIZ(r6)
            r2 = 0
            if (r11 == 0) goto L28
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            X.C1135800ff8.LJ(r11, r0, r5, r6)
        L28:
            X.C1135800ff8.LJJIIZI(r5, r4, r11)
            if (r11 == 0) goto L8a
            com.bytedance.android.live.base.model.ImageModel r0 = r11.previewImage
            if (r0 == 0) goto L8a
            java.util.List r0 = X.C842240X2g.LIZ(r0)
            if (r0 == 0) goto L8a
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L8a
        L40:
            java.lang.String r0 = "dynamic_preview"
            r5.put(r0, r1)
            java.lang.String r0 = "is_preview_image_displayed"
            r5.put(r0, r12)
            java.lang.Class<com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService> r0 = com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService r0 = (com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService) r0
            X.0ebY r0 = r0.uw0()
            if (r0 == 0) goto L88
            long r0 = r0.LIZ
            long r0 = r0 | r2
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L5f:
            java.lang.String r2 = X.C1128460fTI.LJII()
            java.lang.String r0 = "livesdk_gift_selected_view_click"
            X.0IjA r1 = X.C0IJT.LIZ(r0)
            r1.LJIL()
            r1.LJJIIJZLJL(r5)
            r1.LJJIIJZLJL(r6)
            r1.LJJIIJZLJL(r4)
            java.lang.String r0 = "fans_level"
            r1.LJJII(r3, r0)
            java.lang.String r0 = "fans_status"
            r1.LJJII(r2, r0)
            r1.LIZ()
            java.lang.String r0 = "ttlive_gift_selected_view_click"
            X.C1CC2.LJ(r0, r5, r4, r6)
            return
        L88:
            r3 = 0
            goto L5f
        L8a:
            r1 = 0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128760fTm.LJJJJ(com.bytedance.android.livesdk.model.Gift, boolean):void");
    }

    public static void LJJJJI(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject.put("error_msg", str2);
        jSONObject.put("error_code", str);
        C1CC2.LJ("gift_send_client_exception", jSONObject, jSONObject2, jSONObject3);
    }

    public static void LJJJJJ(Integer num, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        C1123380fL6.LIZ(jSONObject);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_tab_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJII(C1128460fTI.LJIIJ(num, str), "tab_name");
        C1129310fUf.LIZ.getClass();
        c474500IjALIZ.LJJII(C1129310fUf.LIZIZ, "gift_dialog_request_id");
        c474500IjALIZ.LJJII(num, "tab_id");
        if (C497740JfY.LJIL()) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        c474500IjALIZ.LJJII(str2, "room_orientation");
        c474500IjALIZ.LIZ();
    }

    public final void LJJII(long j, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
        if (giftFindGiftById != null) {
            C1135800ff8.LJ(giftFindGiftById, 0L, jSONObject, jSONObject3);
        }
        C1135800ff8.LJJIIZI(jSONObject, jSONObject2, giftFindGiftById);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_batch_gifting_bar_show");
        LIZLLL(c474500IjALIZ, j, this.LIZ, str);
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LIZ();
    }

    public final void LJJJ(String str, List list) {
        long id;
        if (C1130100fVw.LIZ.LJFF != 18) {
            return;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_music_tab_pin_edit");
        c474500IjALIZ.LJIL();
        long ownerUserId = 0;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        }
        c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
        c474500IjALIZ.LJJII(str, "request_panel_id");
        String str2 = this.LJI;
        if (str2 == null) {
            str2 = "icon";
        }
        c474500IjALIZ.LJJII(str2, "gift_enter_from");
        c474500IjALIZ.LJJII(list.toString(), "gift_id");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(C474500IjA c474500IjA, Gift gift, String str) {
        c474500IjA.LJJII(Integer.valueOf(LJIJI(gift)), "has_music_badge");
        if (str != null && !a0.LJJJIL(str)) {
            c474500IjA.LJJII(str, "music_song_send_page");
        }
    }

    public static String LJII(String str, int i, C1125300fOC c1125300fOC) {
        Boolean boolValueOf;
        Map<String, Object> map;
        Map<String, Object> map2;
        if (Intrinsics.LJFF(str, "convenient_gift")) {
            return "null";
        }
        Object obj = null;
        if (c1125300fOC != null && (map2 = c1125300fOC.LIZIZ) != null) {
            boolValueOf = Boolean.valueOf(map2.containsKey("actual_gift_position"));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            if (c1125300fOC != null && (map = c1125300fOC.LIZIZ) != null) {
                obj = map.get("actual_gift_position");
            }
            return String.valueOf(obj);
        }
        return String.valueOf(i);
    }

    public static String LJIIJJI(int i, String str, String str2) {
        if (C1132320fZW.LIZ(str)) {
            return "creator_task_page";
        }
        if (str2 != null && str2.length() > 0) {
            return "creator_task_exchange_popup";
        }
        if (C1131530fYF.LJ(str)) {
            return "live_ug_task";
        }
        if (i != 97) {
            if (i != 112) {
                return "";
            }
            return "room_gift_manual_send_directly";
        }
        return "room_gift_auto";
    }

    public static void LJJIIZI(int i, long j, String str) {
        Pair<String, String> pairLJIILJJIL = C1128450fTH.LJIILJJIL();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_preview_change_fail_toast");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZ.LJJII(pairLJIILJJIL.getFirst(), "layout_setting");
        c474500IjALIZ.LJJII(pairLJIILJJIL.getSecond(), "window_setting");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "guest_cnt");
        c474500IjALIZ.LJJII(str, "toast_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LIZ();
    }

    public static void LJJJJIZL(boolean z, Room room, GiftSuspension giftSuspension) {
        String str;
        String str2;
        if (z) {
            str = "anchor";
        } else {
            str = "user";
        }
        int i = giftSuspension.status;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str2 = "";
                } else {
                    str2 = LJIILL;
                }
            } else {
                str2 = LJIILJJIL;
            }
        } else {
            str2 = LJIILIIL;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_toast");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "violation_anchor_id");
        c474500IjALIZ.LJJII(str2, "violation_type");
        c474500IjALIZ.LJJII("live", "scene_type");
        c474500IjALIZ.LIZ();
    }

    public final void LJJIJ(EnumC1130940fXI enumC1130940fXI, String str, List<Long> list) {
        Object obj;
        String str2;
        Object obj2;
        Object obj3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_price_sorting_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("live", "enter_from_method");
        String str3 = this.LJI;
        if (str3 == null) {
            str3 = "icon";
        }
        c474500IjALIZ.LJJII(str3, "gift_enter_from");
        c474500IjALIZ.LJJII(C1128450fTH.LJIIIZ().getDesc(), "send_gift_scene");
        String str4 = LJIIJJI;
        String str5 = "1";
        if (LJIJJLI()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, str4);
        c474500IjALIZ.LJJII(enumC1130940fXI.getDescription(), "current_mode");
        c474500IjALIZ.LJJII(str, "request_panel_id");
        c474500IjALIZ.LJJII(enumC1130940fXI.nextState().getDescription(), "activation_mode");
        if (C1130220fW8.LIZ.LIZ) {
            str2 = "first_screen";
        } else {
            str2 = "other_screen";
        }
        c474500IjALIZ.LJJII(str2, "is_first_screen");
        if (C1131560fYI.LIZ()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj2, "can_exchange");
        InterfaceC1133710fbl.LIZ.getClass();
        C1120710fGn.LIZ();
        if (C1133940fc8.LJIIJJI()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj3, "is_first_recharge");
        if (C1131560fYI.LIZIZ() <= 0) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str5, "has_coin");
        c474500IjALIZ.LJJII(list, "featured_gift_id_set");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIZ(C1128760fTm c1128760fTm, long j, String str, Integer num) {
        Gift.MusicGiftInfo musicGiftInfo;
        long id;
        c1128760fTm.getClass();
        Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
        if (giftFindGiftById != null && (musicGiftInfo = giftFindGiftById.musicInfo) != null) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_music_tab_banner_click");
            c474500IjALIZ.LJIL();
            long ownerUserId = 0;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
            if (room != null) {
                ownerUserId = room.getOwnerUserId();
            }
            c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
            c474500IjALIZ.LJJII(str, "request_panel_id");
            String str2 = c1128760fTm.LJI;
            if (str2 == null) {
                str2 = "icon";
            }
            c474500IjALIZ.LJJII(str2, "gift_enter_from");
            c474500IjALIZ.LJJII(C1128460fTI.LJIIJ(num, ""), "tab_name");
            c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
            c474500IjALIZ.LJJII(Long.valueOf(musicGiftInfo.songId), "music_song_id");
            c474500IjALIZ.LJJII(Integer.valueOf(LJIJI(giftFindGiftById)), "has_music_badge");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LIZLLL(C474500IjA c474500IjA, long j, String str, String str2) {
        long id;
        String str3;
        String str4;
        String str5;
        User userLIZJ = C1125800fP0.LIZJ();
        if (userLIZJ != null) {
            id = userLIZJ.getId();
        } else {
            id = 0;
        }
        c474500IjA.LJJII(Long.valueOf(j), "gift_id");
        c474500IjA.LJJII(str, "request_panel_id");
        String str6 = this.LJI;
        if (str6 == null) {
            str6 = "icon";
        }
        c474500IjA.LJJII(str6, "gift_enter_from");
        c474500IjA.LJJII(C1128450fTH.LJIIIZ().getDesc(), "send_gift_scene");
        if (C1128450fTH.LJJII(id)) {
            str3 = "guest";
        } else {
            str3 = "anchor";
        }
        c474500IjA.LJJII(str3, "to_user_type");
        if (LJIJJLI()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjA.LJJII(str4, "is_anchor");
        c474500IjA.LJJII(C1128460fTI.LJIIJ(Integer.valueOf(C1130100fVw.LIZ.LJFF), ""), "tab_name");
        c474500IjA.LJJII(String.valueOf(LJIILL(j)), "gift_position");
        if (C1130220fW8.LIZ.LIZ) {
            str5 = "first_screen";
        } else {
            str5 = "other_screen";
        }
        c474500IjA.LJJII(str5, "is_first_screen");
        c474500IjA.LJJII(str2, "trigger_reason");
    }

    public final void LJJIIJ(int i, String str, long j, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
        if (giftFindGiftById != null) {
            C1135800ff8.LJ(giftFindGiftById, 0L, jSONObject, jSONObject3);
        }
        C1135800ff8.LJJIIZI(jSONObject, jSONObject2, giftFindGiftById);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_batch_gift_confirm_popup");
        LIZLLL(c474500IjALIZ, j, this.LIZ, str);
        c474500IjALIZ.LJJII(str2, "popup_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "batch_send_num");
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LIZ();
    }

    public static String LJJJJZI(Gift gift, String str, Integer num, List list, List list2) {
        Gift.MusicGiftInfo.AudioResource audioResource;
        boolean z;
        Long lValueOf;
        Gift.MusicGiftInfo musicGiftInfo;
        if (gift != null && (musicGiftInfo = gift.musicInfo) != null) {
            audioResource = musicGiftInfo.resource;
        } else {
            audioResource = null;
        }
        if (audioResource == null && !Intrinsics.LJFF(str, "music_gift_secondary_page")) {
            return null;
        }
        if (gift != null && (lValueOf = Long.valueOf(gift.id)) != null && (list.contains(lValueOf) || list2.contains(lValueOf))) {
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.LJFF(str, "music_gift_secondary_page")) {
            return "music_secondary_page";
        }
        if (num != null) {
            if (num.intValue() == 18 && z) {
                return "music_tab_pin";
            }
            if (num.intValue() == 18) {
                return "music_tab";
            }
        }
        if (z) {
            return "main_tab_pin";
        }
        return "main_tab";
    }

    public static void LJJJJLL(long j, long j2, String str, String str2, String str3, String str4) throws JSONException {
        LJJJJLI(j, 0, 0, str, str2, str3, j2, str4);
    }

    public static void LJJJJZ(InterfaceC1131100fXY interfaceC1131100fXY, String str, String str2, String str3, String str4, int i) {
        String str5;
        long jLJJJJ = interfaceC1131100fXY.LJJJJ();
        long giftId = interfaceC1131100fXY.getGiftId();
        HashMap map = new HashMap();
        map.put("error_code", str);
        map.put("fail_reason", str2);
        if (C2093608Ic.LJ(str3)) {
            str5 = "icon";
        } else if (str3 == null) {
            str5 = "";
        } else {
            str5 = str3;
        }
        map.put("gift_enter_from", str5);
        map.put("send_click_duration", String.valueOf(C158B.LIZ() - jLJJJJ));
        map.put("gift_id", String.valueOf(giftId));
        if (u.LJIJI(str3, LJIIL, false)) {
            map.put("convenient_gift_enter_from", str4);
        }
        map.put("repeat_count", String.valueOf(i));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_request_fail");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(C155200ic.LIZ(null));
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public final void LJJIII(int i, String str, long j, String str2, String str3, boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
        if (giftFindGiftById != null) {
            C1135800ff8.LJ(giftFindGiftById, 0L, jSONObject, jSONObject3);
        }
        C1135800ff8.LJJIIZI(jSONObject, jSONObject2, giftFindGiftById);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_batch_gift_confirm_popup_click");
        LIZLLL(c474500IjALIZ, j, this.LIZ, str);
        c474500IjALIZ.LJJII(str2, "popup_type");
        c474500IjALIZ.LJJII(str3, "click_content");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_ticked");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "batch_send_num");
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LIZ();
    }

    public static void LJJJJLI(long j, int i, int i2, String str, String str2, String str3, long j2, String str4) throws JSONException {
        String str5;
        HashMap map = new HashMap();
        map.put("error_code", str);
        String str6 = "";
        if (C2093608Ic.LJ(str3)) {
            str5 = "icon";
        } else if (str3 == null) {
            str5 = "";
        } else {
            str5 = str3;
        }
        map.put("gift_enter_from", str5);
        map.put("fail_reason", str2);
        map.put("send_click_duration", String.valueOf(C158B.LIZ() - j2));
        if (u.LJIJI(str3, LJIIL, false)) {
            map.put("convenient_gift_enter_from", str4);
        }
        if (i != 1) {
            if (i == 2) {
                str6 = "anchor_income";
            }
        } else {
            str6 = "ug_exchange";
        }
        map.put("exchange_type", str6);
        map.put("exchange_scenario", LJIIJJI(i2, str3, null));
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
        if (giftFindGiftById != null) {
            C1135800ff8.LJ(giftFindGiftById, 0L, jSONObject, jSONObject3);
        }
        C1135800ff8.LJJIIZI(jSONObject, jSONObject2, giftFindGiftById);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_local_fail");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(C155200ic.LIZ(null));
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public final void LJJJI(String str, int i, int i2, GiftPage giftPage, boolean z, String str2, C1125860fP6 c1125860fP6, C1128600fTW c1128600fTW) throws JSONException {
        int size;
        String str3;
        String str4;
        int i3;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        User owner;
        int size2;
        long j;
        Gift gift;
        int i4 = this.LIZJ;
        if (i4 == i && !z) {
            return;
        }
        this.LIZIZ = i4;
        this.LIZJ = i;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        JSONObject jSONObject = new JSONObject();
        if (giftPage.gifts.size() < 9) {
            size = giftPage.gifts.size();
        } else if (giftPage.gifts.size() > this.LIZJ * 8 && giftPage.gifts.size() < (this.LIZJ + 1) * 8) {
            size = giftPage.gifts.size() - (this.LIZJ * 8);
        } else {
            size = 8;
        }
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = (this.LIZJ * 8) + i5;
            List<? extends Gift> list = this.LIZLLL;
            if (list != null) {
                size2 = list.size();
            } else {
                size2 = 0;
            }
            if (size2 > i6) {
                List<? extends Gift> list2 = this.LIZLLL;
                if (list2 != null && (gift = (Gift) ListProtector.get(list2, i6)) != null) {
                    j = gift.id;
                } else {
                    j = 0;
                }
                jSONObject.put(String.valueOf(j), i5 + 1);
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_pages_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
        C1129310fUf.LIZ.getClass();
        c474500IjALIZ.LJJII(C1129310fUf.LIZIZ, "gift_dialog_request_id");
        c474500IjALIZ.LJJII(C1128460fTI.LJIIJ(Integer.valueOf(giftPage.pageType), giftPage.pageName), "tab_name");
        c474500IjALIZ.LJJII(Integer.valueOf(giftPage.pageType), "tab_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i2 + 1), "tab_position");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LIZIZ + 1), "from_page");
        c474500IjALIZ.LJJII(C786410Ut5.J3(jSONObject), "gift_seen");
        if (C1130220fW8.LIZ.LIZ) {
            str3 = "first_screen";
        } else {
            str3 = "other_screen";
        }
        c474500IjALIZ.LJJII(str3, "is_first_screen");
        if (Intrinsics.LJFF(C1128450fTH.LIZLLL(), "manual_pk")) {
            if (C1128450fTH.LJIL()) {
                c474500IjALIZ.LJJII("pk_phase", "match_status");
            } else {
                c474500IjALIZ.LJJII(LiveCenterMockToolSwitch.PUNISH, "match_status");
            }
            c474500IjALIZ.LJJIIZI(C1128450fTH.LJIIL());
            for (Map.Entry<String, String> entry : ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ho0().entrySet()) {
                c474500IjALIZ.LJJII(entry.getValue(), entry.getKey());
            }
        }
        c474500IjALIZ.LJJII(C1128450fTH.LJIIIZ().getDesc(), "send_gift_scene");
        int i7 = i + 1;
        c474500IjALIZ.LJJII(Integer.valueOf(i7), "page");
        c474500IjALIZ.LJJII(Integer.valueOf(i7), "page_position");
        c474500IjALIZ.LJJII(str2, "gift_enter_from");
        c474500IjALIZ.LJJII(str2, "event_module");
        String str5 = LJIIJJI;
        if (LJIJJLI()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str4, str5);
        if (room != null && (owner = room.getOwner()) != null && owner.isSubscribed()) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "is_subscription");
        c474500IjALIZ.LJJIIZI(C1130100fVw.LIZ.LJIIJJI);
        c474500IjALIZ.LIZ();
        int i8 = this.LIZJ * 8;
        int i9 = size + i8;
        int size3 = giftPage.gifts.size();
        if (i9 > size3) {
            i9 = size3;
        }
        if (i8 > i9) {
            return;
        }
        List<Gift> listSubList = giftPage.gifts.subList(i8, i9);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
        Iterator<Gift> it2 = listSubList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Long.valueOf(it2.next().id));
        }
        String str6 = null;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(listSubList, ",", null, null, 0, null, AFwS254S0000000_17.get$arr$(25), 30);
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
        Iterator<Gift> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(C1128460fTI.LJIIL(it3.next()));
        }
        String str7 = null;
        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(new IntRange(0, listSubList.size()), null, null, null, 0, null, null, 63);
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
        Iterator<Gift> it4 = listSubList.iterator();
        while (it4.hasNext()) {
            arrayList5.add(Integer.valueOf(it4.next().diamondCount));
        }
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
        Iterator<Gift> it5 = listSubList.iterator();
        while (it5.hasNext()) {
            arrayList6.add(c1128600fTW.LIZ(giftPage.pageType, it5.next().id));
        }
        ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
        Iterator<Gift> it6 = listSubList.iterator();
        while (it6.hasNext()) {
            arrayList7.add(it6.next().strategyEvent);
        }
        ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
        Iterator<Gift> it7 = listSubList.iterator();
        while (it7.hasNext()) {
            arrayList8.add(C1128460fTI.LJ(it7.next()));
        }
        Iterator<Gift> it8 = listSubList.iterator();
        while (true) {
            arrayList = null;
            if (!it8.hasNext()) {
                break;
            }
            String strLJFF = C1128460fTI.LJFF(it8.next());
            if (strLJFF != null) {
                str7 = strLJFF;
                break;
            }
        }
        Iterator<Gift> it9 = listSubList.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            String strLJIILIIL = C1128460fTI.LJIILIIL(it9.next());
            if (strLJIILIIL != null) {
                str6 = strLJIILIIL;
                break;
            }
        }
        String string = arrayList5.toString();
        String string2 = arrayList6.toString();
        List<? extends Gift> list3 = this.LIZLLL;
        if (list3 != null) {
            ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            for (Gift gift2 : list3) {
                if (c1125860fP6 != null && c1125860fP6.LJFF(Long.valueOf(gift2.id))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList9.add(Boolean.valueOf(z2));
            }
            arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList9, 10));
            Iterator it10 = arrayList9.iterator();
            while (it10.hasNext()) {
                arrayList2.add(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(((Boolean) it10.next()).booleanValue())) ? 1 : 0));
            }
        } else {
            arrayList2 = null;
        }
        String strValueOf = String.valueOf(arrayList2);
        List<? extends Gift> list4 = this.LIZLLL;
        if (list4 != null) {
            ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(list4, 10));
            for (Gift gift3 : list4) {
                CopyOnWriteArrayList<C1125840fP4> copyOnWriteArrayList = C1125820fP2.LIZ;
                arrayList10.add(Boolean.valueOf(C1125820fP2.LJII(Long.valueOf(gift3.id), null)));
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList10, 10));
            Iterator it11 = arrayList10.iterator();
            while (it11.hasNext()) {
                arrayList.add(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(((Boolean) it11.next()).booleanValue())) ? 1 : 0));
            }
        }
        LJJIJL(str, i2, giftPage, arrayList3, strLJJLIIIJ, arrayList4, strLJJLIIIJ2, string, string2, c1125860fP6, strValueOf, String.valueOf(arrayList), arrayList7, arrayList8, str7, str6);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL(java.lang.String r20, int r21, com.bytedance.android.livesdk.gift.model.GiftPage r22, java.util.List<java.lang.Long> r23, java.lang.String r24, java.util.List<java.lang.String> r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, X.C1125860fP6 r29, java.lang.String r30, java.lang.String r31, java.util.List<java.lang.String> r32, java.util.List<java.lang.String> r33, java.lang.String r34, java.lang.String r35) {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128760fTm.LJJIJL(java.lang.String, int, com.bytedance.android.livesdk.gift.model.GiftPage, java.util.List, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, X.0fP6, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String):void");
    }

    public static void LJJJJJL(C1128760fTm c1128760fTm, DataChannel dataChannel, long j, boolean z, boolean z2, String str, String str2, String str3, Integer num, String str4, String str5, EnumC1130940fXI enumC1130940fXI, C1125860fP6 c1125860fP6, Long l, Long l2, String str6, int i) {
        int i2;
        int i3;
        long j2;
        C1095140ebY c1095140ebYUw0;
        C1094360eaI c1094360eaIHP;
        Long l3 = l2;
        Long l4 = l;
        C1125860fP6 c1125860fP62 = c1125860fP6;
        EnumC1130940fXI enumC1130940fXI2 = enumC1130940fXI;
        String str7 = str5;
        String str8 = str4;
        String str9 = str2;
        if ((i & 32) != 0) {
            str9 = "";
        }
        String str10 = null;
        if ((i & 512) != 0) {
            str8 = null;
        }
        if ((i & 1024) != 0) {
            str7 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            enumC1130940fXI2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c1125860fP62 = null;
        }
        if ((i & 8192) != 0) {
            l4 = null;
        }
        if ((i & 16384) != 0) {
            l3 = null;
        }
        if ((i & 32768) == 0) {
            str10 = str6;
        }
        c1128760fTm.getClass();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
        if (LJJIFFI(giftFindGiftById) && c1128760fTm.LJIIIIZZ.contains(Long.valueOf(j))) {
            i2 = 1;
        } else if (LJJIFFI(giftFindGiftById) && !c1128760fTm.LJIIIIZZ.contains(Long.valueOf(j))) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        if (z) {
            C1118440fD8.LIZ(j, z, new C1125180fO0(j, str3, giftFindGiftById, z2, c1125860fP62, dataChannel, i2, str7));
            return;
        }
        boolean zLJJIFFI = LJJIFFI(giftFindGiftById);
        IUserLevelService iUserLevelService = (IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class);
        if (iUserLevelService != null && (c1094360eaIHP = iUserLevelService.HP()) != null) {
            i3 = c1094360eaIHP.LIZ;
        } else {
            i3 = 0;
        }
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        if (iFansClubService != null && (c1095140ebYUw0 = iFansClubService.uw0()) != null) {
            j2 = c1095140ebYUw0.LIZ;
        } else {
            j2 = 0;
        }
        C1118440fD8.LIZ(j, z, new C1128790fTp(z2, j, str, str3, giftFindGiftById, c1128760fTm, str10, dataChannel, num, str9, room, i3, j2, i2, enumC1130940fXI2, l4, l3, c1125860fP62, zLJJIFFI, str8));
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJIIJIL(X.C1128760fTm r41, com.bytedance.ies.sdk.datachannel.DataChannel r42, java.lang.String r43, boolean r44, long r45, boolean r47, int r48, java.lang.String r49, int r50, java.lang.Integer r51, java.lang.Long r52, java.lang.String r53, boolean r54, java.util.List r55, java.util.List r56, java.util.List r57, java.util.Map r58, boolean r59, X.EnumC1130940fXI r60, X.C1125860fP6 r61, com.bytedance.android.livesdk.model.Gift r62, X.C1129370fUl r63) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128760fTm.LJJIJIIJIL(X.0fTm, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, boolean, long, boolean, int, java.lang.String, int, java.lang.Integer, java.lang.Long, java.lang.String, boolean, java.util.List, java.util.List, java.util.List, java.util.Map, boolean, X.0fXI, X.0fP6, com.bytedance.android.livesdk.model.Gift, X.0fUl):void");
    }

    public static void LJJJJL(C1128760fTm c1128760fTm, DataChannel dataChannel, Long l, boolean z, boolean z2, String str, String str2, Integer num, Integer num2, Long l2, List list, List list2, List list3, EnumC1130940fXI enumC1130940fXI, C1125860fP6 c1125860fP6, String str3, Long l3, Long l4, String str4, int i, Map map, C1129370fUl c1129370fUl, int i2) {
        int i3;
        long j;
        C1095140ebY c1095140ebYUw0;
        C1094360eaI c1094360eaIHP;
        Map map2 = map;
        int i4 = i;
        C1129370fUl c1129370fUl2 = c1129370fUl;
        String str5 = str4;
        Long l5 = l4;
        List list4 = list3;
        Long l6 = l3;
        String str6 = str3;
        EnumC1130940fXI enumC1130940fXI2 = enumC1130940fXI;
        List list5 = list2;
        if ((i2 & 1024) != 0) {
            list5 = C13BV.INSTANCE;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            list4 = C13BV.INSTANCE;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            enumC1130940fXI2 = null;
        }
        if ((i2 & 16384) != 0) {
            str6 = null;
        }
        if ((32768 & i2) != 0) {
            l6 = null;
        }
        if ((65536 & i2) != 0) {
            l5 = null;
        }
        if ((131072 & i2) != 0) {
            str5 = null;
        }
        if ((262144 & i2) != 0) {
            i4 = 0;
        }
        if ((1048576 & i2) != 0) {
            map2 = null;
        }
        if ((i2 & 2097152) != 0) {
            c1129370fUl2 = new C1129370fUl(false, false, 0, 0, null, 0L, 63);
        }
        c1128760fTm.getClass();
        ICoinIncentiveService iCoinIncentiveServiceLIZ = C1124730fNH.LIZ();
        if (iCoinIncentiveServiceLIZ != null) {
            iCoinIncentiveServiceLIZ.WC1();
        }
        Map mapLJIIL = LJIIL();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        IUserLevelService iUserLevelService = (IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class);
        if (iUserLevelService != null && (c1094360eaIHP = iUserLevelService.HP()) != null) {
            i3 = c1094360eaIHP.LIZ;
        } else {
            i3 = 0;
        }
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        long jLongValue = 0;
        if (iFansClubService != null && (c1095140ebYUw0 = iFansClubService.uw0()) != null) {
            j = c1095140ebYUw0.LIZ;
        } else {
            j = 0;
        }
        if (l != null) {
            jLongValue = l.longValue();
        }
        C1118440fD8.LIZ(jLongValue, z, new C1128770fTn(l, c1128760fTm, z, z2, str, str2, i4, num, str6, num2, str5, dataChannel, c1129370fUl2, l2, room, list, c1125860fP6, i3, j, null, enumC1130940fXI2, l6, l5, list5, mapLJIIL, list4, map2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174 A[PHI: r13
      0x0174: PHI (r13v17 boolean) = (r13v16 boolean), (r13v21 boolean), (r13v21 boolean) binds: [B:67:0x0171, B:53:0x0152, B:55:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178 A[PHI: r10 r13
      0x0178: PHI (r10v11 boolean) = (r10v10 boolean), (r10v13 boolean), (r10v13 boolean) binds: [B:70:0x0175, B:58:0x015c, B:60:0x0161] A[DONT_GENERATE, DONT_INLINE]
      0x0178: PHI (r13v18 boolean) = (r13v17 boolean), (r13v20 boolean), (r13v20 boolean) binds: [B:70:0x0175, B:58:0x015c, B:60:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJLIJ(java.lang.String r34, java.lang.String r35, java.lang.Integer r36, java.util.List<java.lang.Long> r37, java.lang.String r38, java.lang.String r39, java.util.List<java.lang.String> r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, boolean r46, java.util.Map<java.lang.Long, X.C1130160fW2> r47, java.util.List<java.lang.Long> r48, java.util.List<java.lang.Long> r49, int r50, X.C1125860fP6 r51, java.lang.String r52, java.lang.String r53, java.util.List<java.lang.String> r54, java.util.List<X.C1129370fUl> r55, java.util.List<java.lang.String> r56, java.lang.String r57, java.lang.String r58) {
        /*
            Method dump skipped, instruction units count: 1867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128760fTm.LJJIJLIJ(java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.Map, java.util.List, java.util.List, int, X.0fP6, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0997 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x09e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0aa1  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0af4  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0b59 A[LOOP:0: B:435:0x0b53->B:437:0x0b59, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0b6d  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0b6f  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0b8c  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0b9c  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0ba2  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0ba8  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0bb4  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0bb7  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0bbd  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0bc3  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0be1  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0be5  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0bf8  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0bfb  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0c01  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0c3d  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0c61  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0c65  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0c69  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0c6d  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0c70  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0c73  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0c76  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0c7d  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0c88  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0c8d  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0c97  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0c9c  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0cc4  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0cc7  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0ccc  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0cd5  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0cdb  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0cde  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0ce7 A[PHI: r6
      0x0ce7: PHI (r6v1 long) = (r6v0 long), (r6v12 long) binds: [B:532:0x0ce3, B:34:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0d1c  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0d4a  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0d5f  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0d6d  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0d7b  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0d8b A[LOOP:1: B:562:0x0d85->B:564:0x0d8b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0dab  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0db4  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0dc5  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0dd6  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0e35  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0e38  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0e3b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0229  */
    /* JADX WARN: Type inference failed for: r0v94, types: [X.0IjA] */
    /* JADX WARN: Type inference failed for: r1v54, types: [com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService] */
    /* JADX WARN: Type inference failed for: r3v229 */
    /* JADX WARN: Type inference failed for: r3v234 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v259 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v260 */
    /* JADX WARN: Type inference failed for: r4v262 */
    /* JADX WARN: Type inference failed for: r4v263, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v266 */
    /* JADX WARN: Type inference failed for: r4v267 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(java.lang.Boolean r49, java.lang.Integer r50, java.lang.String r51, int r52, int r53, long r54, boolean r56, java.lang.String r57, java.lang.String r58, int r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, int r64, long r65, X.EnumC1125400fOM r67, java.lang.Long r68, java.lang.String r69, int r70, long r71, boolean r73, java.lang.Long r74, java.util.List r75, java.lang.String r76, java.lang.Integer r77, long r78, java.util.Map r80, int r81, java.lang.String r82, java.lang.String r83, java.util.List r84, java.util.List r85, java.util.List r86, boolean r87, java.lang.String r88, int r89, java.lang.Long r90, java.lang.Long r91, java.lang.Integer r92, double r93, java.lang.String r95, X.C1126160fPa r96, X.EnumC1130940fXI r97, int r98, java.lang.String r99, X.C1125860fP6 r100, java.lang.Long r101, java.lang.Long r102, java.lang.String r103, boolean r104, java.lang.Long r105, java.lang.String r106, int r107, java.lang.Boolean r108, java.util.Map r109, boolean r110, java.lang.String r111, X.C1125300fOC r112, java.lang.Long r113, int r114, X.C1129370fUl r115, boolean r116) {
        /*
            Method dump skipped, instruction units count: 3646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128760fTm.LJJIJIL(java.lang.Boolean, java.lang.Integer, java.lang.String, int, int, long, boolean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, X.0fOM, java.lang.Long, java.lang.String, int, long, boolean, java.lang.Long, java.util.List, java.lang.String, java.lang.Integer, long, java.util.Map, int, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, boolean, java.lang.String, int, java.lang.Long, java.lang.Long, java.lang.Integer, double, java.lang.String, X.0fPa, X.0fXI, int, java.lang.String, X.0fP6, java.lang.Long, java.lang.Long, java.lang.String, boolean, java.lang.Long, java.lang.String, int, java.lang.Boolean, java.util.Map, boolean, java.lang.String, X.0fOC, java.lang.Long, int, X.0fUl, boolean):void");
    }
}

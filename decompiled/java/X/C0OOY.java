package X;

import Y.ACListenerS13S2200000_9;
import Y.ACListenerS81S1100000_9;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContent;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContentExtra;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinImageInfo;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;
import com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoicePlayedStore;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCreateMultiItemResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0OOY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OOY {
    public static final C0OOY LIZ;
    public static final ConcurrentHashMap<String, List<BulletinBaseItem>> LIZIZ;
    public static C0OOH LIZJ;
    public static final ConcurrentLinkedQueue<BulletinBaseItem> LIZLLL;
    public static final Map<String, BulletinPhotoItem> LJ;
    public static final Map<String, C0OOV> LJFF;
    public static final Map<String, C620150OUb> LJI;
    public static final ConcurrentLinkedQueue<InterfaceC618620OOe> LJII;
    public static final C054G LJIIIIZZ;

    static {
        C0OOY c0ooy = new C0OOY();
        LIZ = c0ooy;
        LIZIZ = new ConcurrentHashMap<>();
        LIZLLL = new ConcurrentLinkedQueue<>();
        LJ = new LinkedHashMap();
        LJFF = new LinkedHashMap();
        LJI = new LinkedHashMap();
        InterfaceC618620OOe interfaceC618620OOe = new InterfaceC618620OOe() { // from class: X.0OOK
            @Override // X.InterfaceC618620OOe
            public final void ov0(long j) {
            }

            @Override // X.InterfaceC618620OOe
            public final String sL0(boolean z, boolean z2) {
                return "";
            }

            @Override // X.InterfaceC618620OOe
            public final void eA2(BulletinBaseItem bulletinBaseItem) {
                C0OPX.LJIIL("generated", bulletinBaseItem.LIZLLL().getNameString(), "success", null);
            }

            @Override // X.InterfaceC618620OOe
            public final void YV(BulletinItem bulletinItem, BulletinBaseItem bulletinBaseItem, Map<String, String> map) {
                C0OPX.LJIIL("response", String.valueOf(bulletinItem.getType()), "success", map.toString());
                C0OOY.LIZ.getClass();
                C0OOY.LJ(bulletinBaseItem);
                String str = map.get("channel_id");
                if (str == null) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "bulletin_board_page");
                String str2 = map.get("enter_method");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put("enter_method", str2);
                String str4 = map.get("content_type");
                if (str4 == null) {
                    str4 = "";
                }
                linkedHashMap.put("content_type", str4);
                String str5 = map.get("entrance_page");
                if (str5 == null) {
                    str5 = "";
                }
                linkedHashMap.put("entrance_page", str5);
                linkedHashMap.put("send_status", "1");
                String str6 = map.get("is_link");
                if (str6 == null) {
                    str6 = "";
                }
                linkedHashMap.put("is_link", str6);
                String str7 = map.get("group_id");
                if (str7 != null) {
                    str3 = str7;
                }
                linkedHashMap.put("group_id", str3);
                linkedHashMap.put("message_id", String.valueOf(bulletinItem.getItemId()));
                linkedHashMap.putAll(map);
                C0OPQ.LIZ.getClass();
                C0OPQ.LJJJI(str, linkedHashMap);
                C1440005kM.LIZ(new C0OOE());
                IBulletinBoardDataService iBulletinBoardDataService = (IBulletinBoardDataService) PluggableExtentionKt.pluggableSpi$default(IBulletinBoardDataService.class, false, false, false, 14, null);
                if (iBulletinBoardDataService != null) {
                    iBulletinBoardDataService.LIZ(bulletinItem, str, false);
                }
            }

            @Override // X.InterfaceC618620OOe
            public final void sp2(BulletinItem bulletinItem, BulletinBaseItem bulletinBaseItem, Map<String, String> map) {
                C0OPX.LJIIL("response", String.valueOf(bulletinItem.getType()), "resend success", map.toString());
                C0OOY.LIZ.getClass();
                C0OOY.LJ(bulletinBaseItem);
                String str = map.get("channel_id");
                if (str == null) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "bulletin_board_page");
                String str2 = map.get("enter_method");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put("enter_method", str2);
                String str4 = map.get("content_type");
                if (str4 == null) {
                    str4 = "";
                }
                linkedHashMap.put("content_type", str4);
                String str5 = map.get("entrance_page");
                if (str5 == null) {
                    str5 = "";
                }
                linkedHashMap.put("entrance_page", str5);
                linkedHashMap.put("send_status", "1");
                String str6 = map.get("is_link");
                if (str6 == null) {
                    str6 = "";
                }
                linkedHashMap.put("is_link", str6);
                String str7 = map.get("group_id");
                if (str7 != null) {
                    str3 = str7;
                }
                linkedHashMap.put("group_id", str3);
                linkedHashMap.put("message_id", String.valueOf(bulletinItem.getItemId()));
                linkedHashMap.putAll(map);
                C0OPQ.LIZ.getClass();
                C0OPQ.LJJJI(str, linkedHashMap);
            }

            @Override // X.InterfaceC618620OOe
            public final void LU0(BulletinBaseItem bulletinBaseItem, int i, String str, Map<String, String> map) {
                String nameString = bulletinBaseItem.LIZLLL().getNameString();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("errorCode: ");
                sbLIZ.append(i);
                sbLIZ.append(", ");
                sbLIZ.append(map);
                C0OPX.LJIIL("response", nameString, "fail", C2188811AlT.LIZIZ(sbLIZ));
                String str2 = map.get("channel_id");
                if (str2 == null) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "bulletin_board_page");
                String str3 = map.get("enter_method");
                if (str3 == null) {
                    str3 = "";
                }
                linkedHashMap.put("enter_method", str3);
                String str4 = map.get("content_type");
                if (str4 == null) {
                    str4 = "";
                }
                linkedHashMap.put("content_type", str4);
                String str5 = map.get("entrance_page");
                if (str5 == null) {
                    str5 = "";
                }
                linkedHashMap.put("entrance_page", str5);
                linkedHashMap.put("send_status", CardStruct.IStatusCode.DEFAULT);
                String str6 = map.get("is_link");
                if (str6 == null) {
                    str6 = "";
                }
                linkedHashMap.put("is_link", str6);
                String str7 = map.get("group_id");
                if (str7 == null) {
                    str7 = "";
                }
                linkedHashMap.put("group_id", str7);
                linkedHashMap.put("error_code", String.valueOf(i));
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put("error_message", str);
                linkedHashMap.putAll(map);
                C0OPQ.LIZ.getClass();
                C0OPQ.LJJJI(str2, linkedHashMap);
            }
        };
        ConcurrentLinkedQueue<InterfaceC618620OOe> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        LJII = concurrentLinkedQueue;
        C2502509rL c2502509rL = new C2502509rL(CoroutineExceptionHandler.LJJLIL, 10);
        LJIIIIZZ = C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_publish_scope_setting", true, true) ? C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ).plus(c2502509rL)) : C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZIZ).plus(c2502509rL));
        concurrentLinkedQueue.add(interfaceC618620OOe);
        EventBus.LIZLLL().LJIJJ(c0ooy);
    }

    public static Keva LIZIZ() {
        return Keva.getRepo("bulletin_not_sent_repo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List LIZLLL(List list) {
        if (!C617040OIc.LIZ()) {
            C0OPX.LJII("insertPostAutoShareQuotaLimitInLineMessage failed due to auto share disable");
            return list;
        }
        ArrayList arrayList = new ArrayList();
        long jLJIIZILJ = 0;
        boolean z = false;
        for (BulletinBaseItem bulletinBaseItem : C13LP.LJLJJLL(list)) {
            if (jLJIIZILJ > 0) {
                long jLJIIZILJ2 = bulletinBaseItem.LJIIZILJ();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jLJIIZILJ2);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(jLJIIZILJ);
                if (calendar.get(1) != calendar2.get(1) || calendar.get(2) != calendar2.get(2) || calendar.get(5) != calendar2.get(5)) {
                    z = false;
                }
            }
            jLJIIZILJ = bulletinBaseItem.LJIIZILJ();
            if ((bulletinBaseItem instanceof C0OO5) && ((C0OO5) bulletinBaseItem).LLJJIII == C0OO3.QUOTA_LIMIT.getType()) {
                z = true;
            }
            if (bulletinBaseItem.LIZLLL() == EnumC618810OOx.FORWARD && bulletinBaseItem.LJJJLZIJ() == EnumC617610OKh.QUOTA_LIMIT.getStatusCode() && !z) {
                arrayList.add(new C0OO5(Long.valueOf(C0OPX.LIZ()), bulletinBaseItem.LJJJLIIL(), EnumC618810OOx.NONE, bulletinBaseItem.LJIIZILJ(), bulletinBaseItem.LJJLIIIIJ(), bulletinBaseItem.LJJIJLIJ(), null, C20642515q3.LJI(2131828055), C0OO3.QUOTA_LIMIT.getType(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 13024));
                z = true;
            }
            arrayList.add(bulletinBaseItem);
        }
        return C13LP.LJLJJLL(arrayList);
    }

    public static void LJ(BulletinBaseItem bulletinBaseItem) {
        BulletinVoiceItem bulletinVoiceItem;
        String str;
        Long l;
        String string;
        if ((bulletinBaseItem instanceof BulletinVoiceItem) && (str = (bulletinVoiceItem = (BulletinVoiceItem) bulletinBaseItem).LLJLLL) != null && str.length() > 0 && 1 != 0 && (l = bulletinVoiceItem.LLJJIJI) != null && (string = l.toString()) != null && string.length() > 0) {
            C23250099c.LIZLLL(LJIIIIZZ, null, null, new C2157808cq(str, string, null), 3);
        }
    }

    public static List LJFF(String str) {
        Object c098200Yq;
        ArrayList arrayList = new ArrayList();
        try {
            String str2 = "(?i)((https?):\\/\\/)?((xn--)?[\\w]+(-[\\w]+)*)(\\.((xn--)?[\\w]+(-[\\w]+)*))+(:[0-9]+)?(\\/([\\w.\\-_~!$&'()*+,;=:@%])+)*\\/?(\\?([\\w\\?.\\-_~!$&'()*+,;=:@%\\/])*)?(#([\\w\\?.\\-_~!$&'()*+,;=:@%])*)?";
            String str3 = (String) SettingsManager.LIZLLL().LJIIIIZZ("bulletin_match_link_settings", String.class, "(?i)((https?):\\/\\/)?((xn--)?[\\w]+(-[\\w]+)*)(\\.((xn--)?[\\w]+(-[\\w]+)*))+(:[0-9]+)?(\\/([\\w.\\-_~!$&'()*+,;=:@%])+)*\\/?(\\?([\\w\\?.\\-_~!$&'()*+,;=:@%\\/])*)?(#([\\w\\?.\\-_~!$&'()*+,;=:@%])*)?");
            if (str3 != null) {
                str2 = str3;
            }
            c098200Yq = PatternProtector.compile(str2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Pattern pattern = (Pattern) c098200Yq;
        if (pattern == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (i < str.length() && matcher.find(i)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            arrayList.add(str.subSequence(iStart, iEnd).toString());
            i = iEnd + 1;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static void LJIIJ(BulletinBaseItem bulletinBaseItem) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemGenerated(), publishListener:");
        ConcurrentLinkedQueue<InterfaceC618620OOe> concurrentLinkedQueue = LJII;
        sbLIZ.append(concurrentLinkedQueue);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL.add(bulletinBaseItem);
        Iterator<InterfaceC618620OOe> it2 = concurrentLinkedQueue.iterator();
        while (it2.hasNext()) {
            it2.next().eA2(bulletinBaseItem);
        }
    }

    public static void LJIIJJI(List list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemGenerated(), publishListener:");
        ConcurrentLinkedQueue<InterfaceC618620OOe> concurrentLinkedQueue = LJII;
        sbLIZ.append(concurrentLinkedQueue);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL.addAll(list);
        for (InterfaceC618620OOe interfaceC618620OOe : concurrentLinkedQueue) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                interfaceC618620OOe.eA2((BulletinBaseItem) it2.next());
            }
        }
    }

    public static void LJIILJJIL(Long l) {
        if (l != null) {
            long jLongValue = l.longValue();
            Iterator<InterfaceC618620OOe> it2 = LJII.iterator();
            while (it2.hasNext()) {
                it2.next().ov0(jLongValue);
            }
        }
    }

    public static C2152808c2 LJJII(String str) {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null || uid.length() <= 0) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        return new C2152808c2(C844470XAv.LIZ(), uid, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x01ff  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPublishStatus(X.C1445970njP r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OOY.onPublishStatus(X.0njP):void");
    }

    public static void LIZ(String str, Map map) {
        if (Intrinsics.LJFF(map.get("enter_method"), "guide_card")) {
            return;
        }
        C1440005kM.LIZ(new C0ORN(str, "bulletin_resource_container_scene", null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [T, java.lang.String] */
    public static void LIZJ(BulletinBaseItem bulletinBaseItem, BulletinItem bulletinItem) {
        C0OOO c0ooo;
        long jLIZ;
        Long lLJIILIIL;
        C0OPX.LJII("insertOpenPostAutoShareGuideIfNeed");
        BulletinBaseItem bulletinBaseItem2 = null;
        if ((bulletinBaseItem instanceof C0OOO) && (c0ooo = (C0OOO) bulletinBaseItem) != null) {
            if (c0ooo.LLJL != C0OP0.DEFAULT.getType()) {
                C0OPX.LJII("insertOpenPostAutoShareGuideIfNeed not from bb");
                return;
            }
            C604750Nnl.LIZ.getClass();
            C0OPX.LJII("shouldShowAutoSharePostGuide");
            boolean z = true;
            if (!C617040OIc.LIZ()) {
                C0OPX.LJII("shouldShowAutoSharePostGuide auto share disable");
                return;
            }
            if (C214824195i.LIZIZ.isPrivateAccount() || C604750Nnl.LIZ()) {
                return;
            }
            Keva repo = Keva.getRepo("bulletin_board_auto_share_data_cache_repo");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("auto_share_is_clicked");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            boolean z2 = repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("shouldShowAutoSharePostGuide isClicked = ");
            sbLIZ2.append(z2);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            if (z2) {
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("auto_share_guide_count");
            sbLIZ3.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            int i = repo.getInt(C2188811AlT.LIZIZ(sbLIZ3), 0);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("shouldShowAutoSharePostGuide showCount = ");
            sbLIZ4.append(i);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ4));
            if (i >= C0C64.LJIILLIIL().LJIJ(31744, 1, "bulletin_board_auto_share_guide_count", true)) {
                return;
            }
            Iterator<BulletinBaseItem> it2 = LIZLLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BulletinBaseItem next = it2.next();
                BulletinBaseItem bulletinBaseItem3 = next;
                if ((bulletinBaseItem3 instanceof C0OO5) && ((C0OO5) bulletinBaseItem3).LLJJIII == C0OO3.AUTO_SHARE_POST_GUIDE.getType()) {
                    bulletinBaseItem2 = next;
                    break;
                }
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("insertOpenPostAutoShareGuideIfNeed oldItem = ");
            sbLIZ5.append(bulletinBaseItem2);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ5));
            if (bulletinBaseItem2 != null) {
                return;
            }
            String itemId = bulletinItem.getItemId();
            if (itemId != null && (lLJIILIIL = C2095008Iq.LJIILIIL(itemId)) != null) {
                jLIZ = -lLJIILIIL.longValue();
            } else {
                jLIZ = C0OPX.LIZ();
            }
            Long lValueOf = Long.valueOf(jLIZ);
            EnumC618810OOx enumC618810OOx = EnumC618810OOx.NONE;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lValueOf2 = Long.valueOf(System.currentTimeMillis());
            String str = c0ooo.LLJJJJJIL;
            String strLIZJ = C1618770sE7.LIZJ(2131827994);
            String strLIZLLL = C1618770sE7.LIZLLL(2131827993, strLIZJ);
            int iLJJJ = a0.LJJJ(strLIZLLL, strLIZJ, 0, false, 4);
            int length = strLIZJ.length() + iLJJJ;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZLLL);
            final C259800zU c259800zU = new C259800zU();
            Iterator<InterfaceC618620OOe> it3 = LJII.iterator();
            while (it3.hasNext()) {
                ?? SL0 = it3.next().sL0(true, false);
                c259800zU.element = SL0;
                if (C123100dR.LIZ(SL0)) {
                    break;
                }
            }
            C786410Ut5.o2(spannableStringBuilder, new AbstractC630230Onl() { // from class: X.0Nnm
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    C604750Nnl.LIZ.getClass();
                    C604750Nnl.LJFF();
                    C259800zU<String> c259800zU2 = c259800zU;
                    if (c259800zU2.element != null) {
                        SmartRouter.buildRoute(view.getContext(), c259800zU2.element).open();
                    }
                }
            }, iLJJJ, length, 17);
            C786410Ut5.o2(spannableStringBuilder, new ForegroundColorSpan(C1618770sE7.LIZ(R.attr.a1o)), iLJJJ, length, 17);
            C786410Ut5.o2(spannableStringBuilder, new StyleSpan(1), iLJJJ, length, 17);
            LJIIJ(new C0OO5(lValueOf, 0, enumC618810OOx, jCurrentTimeMillis, lValueOf2, z, str, spannableStringBuilder, C0OO3.AUTO_SHARE_POST_GUIDE.getType(), null, 0 == true ? 1 : 0, 12512));
        }
    }

    public static void LJI(BulletinBaseItem bulletinBaseItem, BulletinItem bulletinItem) {
        BulletinVoiceItem bulletinVoiceItem;
        Long l;
        String string;
        String itemId;
        String uid;
        ConcurrentHashMap<String, C621280OYk> concurrentHashMap;
        C621280OYk c621280OYkRemove;
        if ((bulletinBaseItem instanceof BulletinVoiceItem) && (l = (bulletinVoiceItem = (BulletinVoiceItem) bulletinBaseItem).LLJJIJI) != null && (string = l.toString()) != null && string.length() > 0) {
            Object obj = null;
            if (1 == 0 || (itemId = bulletinItem.getItemId()) == null || itemId.length() <= 0 || Intrinsics.LJFF(string, itemId)) {
                return;
            }
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            if (curUser == null || (uid = curUser.getUid()) == null || uid.length() <= 0) {
                uid = null;
            }
            String str = bulletinVoiceItem.LLJLLL;
            if (str == null || str.length() <= 0) {
                str = null;
            }
            if (uid != null) {
                if (str != null) {
                    Gson gson = BulletinVoicePlayedStore.LIZ;
                    if (uid.length() != 0 && str.length() != 0 && string.length() != 0 && itemId.length() != 0 && !Intrinsics.LJFF(string, itemId)) {
                        List listLIZ = BulletinVoicePlayedStore.LIZ(uid, str);
                        Iterator it2 = listLIZ.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (Intrinsics.LJFF(((BulletinVoicePlayedStore.Entry) next).sourceId, string)) {
                                obj = next;
                                break;
                            }
                        }
                        BulletinVoicePlayedStore.Entry entry = (BulletinVoicePlayedStore.Entry) obj;
                        if (entry != null) {
                            C19719612Di.LJJIIJ(listLIZ, new C618640OOg(string, itemId), true);
                            listLIZ.add(new BulletinVoicePlayedStore.Entry(itemId, entry.updatedAt));
                            BulletinVoicePlayedStore.LIZIZ(uid, str).storeString("entries", GsonProtectorUtils.toJson(BulletinVoicePlayedStore.LIZ, listLIZ));
                        }
                    }
                } else {
                    return;
                }
            } else if (str == null) {
                return;
            }
            if (str.length() != 0 && string.length() != 0 && itemId.length() != 0 && !Intrinsics.LJFF(string, itemId) && (concurrentHashMap = C621270OYj.LIZ.get(str)) != null && (c621280OYkRemove = concurrentHashMap.remove(string)) != null) {
                concurrentHashMap.put(itemId, c621280OYkRemove);
            }
        }
    }

    public static void LJII(String str, String str2, String str3) {
        Object obj;
        Object obj2;
        Object obj3;
        String str4;
        Object obj4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str5 = "live_event_page";
        String str6 = "";
        if (Intrinsics.LJFF(str3, "live")) {
            obj = "live_room_page";
        } else if (Intrinsics.LJFF(str3, "live_event")) {
            obj = "live_event_page";
        } else {
            obj = "";
        }
        linkedHashMap.put("enter_from", obj);
        if (Intrinsics.LJFF(str3, "live")) {
            obj2 = "live_room_page";
        } else if (Intrinsics.LJFF(str3, "live_event")) {
            obj2 = "live_event_page";
        } else {
            obj2 = "";
        }
        linkedHashMap.put("entrance_page", obj2);
        linkedHashMap.put("channel_id", str);
        if (Intrinsics.LJFF(str3, "live")) {
            obj3 = "manual_share_live_card";
        } else if (!Intrinsics.LJFF(str3, "live_event")) {
            obj3 = "";
        } else {
            obj3 = "manual_share_live_event";
        }
        linkedHashMap.put("enter_method", obj3);
        if (Intrinsics.LJFF(str3, "live_event")) {
            str4 = "live_event";
        } else if (!Intrinsics.LJFF(str3, "live")) {
            str4 = "";
        } else {
            str4 = "live_card";
        }
        linkedHashMap.put("content_type", str4);
        C0OPQ.LIZ.getClass();
        C0OPQ.LJJJ(str, linkedHashMap);
        if (C123100dR.LIZ(str2)) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (Intrinsics.LJFF(str3, "live")) {
                obj4 = "live_room_page";
            } else if (Intrinsics.LJFF(str3, "live_event")) {
                obj4 = "live_event_page";
            } else {
                obj4 = "";
            }
            linkedHashMap2.put("enter_from", obj4);
            if (Intrinsics.LJFF(str3, "live")) {
                str5 = "live_room_page";
            } else if (!Intrinsics.LJFF(str3, "live_event")) {
                str5 = "";
            }
            linkedHashMap2.put("entrance_page", str5);
            linkedHashMap2.put("channel_id", str);
            if (Intrinsics.LJFF(str3, "live")) {
                str6 = "manual_share_live_card";
            } else if (Intrinsics.LJFF(str3, "live_event")) {
                str6 = "manual_share_live_event";
            }
            linkedHashMap2.put("enter_method", str6);
            linkedHashMap2.put("content_type", "text");
            linkedHashMap2.put("is_link", CardStruct.IStatusCode.DEFAULT);
            C0OPQ.LJJJ(str, linkedHashMap2);
        }
    }

    public static void LJIIIZ(BulletinCreateMultiItemResponse bulletinCreateMultiItemResponse, long j, String str) {
        Object obj;
        String str2;
        String itemId;
        Integer numValueOf;
        String str3;
        boolean z;
        Object objLJJJLZIJ;
        Integer num;
        String str4 = "live_event_page";
        if (Intrinsics.LJFF(str, "live")) {
            obj = "live_room_page";
        } else if (Intrinsics.LJFF(str, "live_event")) {
            obj = "live_event_page";
        } else {
            obj = "";
        }
        if (Intrinsics.LJFF(str, "live")) {
            str4 = "live_room_page";
        } else if (!Intrinsics.LJFF(str, "live_event")) {
            str4 = "";
        }
        if (Intrinsics.LJFF(str, "live")) {
            str2 = "manual_share_live_card";
        } else if (!Intrinsics.LJFF(str, "live_event")) {
            str2 = "";
        } else {
            str2 = "manual_share_live_event";
        }
        List<BulletinItem> itemInfo = bulletinCreateMultiItemResponse.getItemInfo();
        if (itemInfo != null) {
            int i = 0;
            for (BulletinItem bulletinItem : itemInfo) {
                int i2 = i + 1;
                Object objLJJJLZIJ2 = null;
                if (i >= 0) {
                    BulletinItem bulletinItem2 = bulletinItem;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("enter_from", obj);
                    linkedHashMap.put("entrance_page", str4);
                    if (bulletinItem2 != null) {
                        itemId = bulletinItem2.getItemId();
                    } else {
                        itemId = null;
                    }
                    linkedHashMap.put("message_id", String.valueOf(itemId));
                    linkedHashMap.put("channel_id", String.valueOf(j));
                    linkedHashMap.put("enter_method", str2);
                    if (bulletinItem2 != null) {
                        numValueOf = Integer.valueOf(bulletinItem2.getType());
                    } else {
                        numValueOf = null;
                    }
                    int iOrdinal = EnumC618810OOx.LIVE_ROOM.ordinal();
                    if (numValueOf != null && numValueOf.intValue() == iOrdinal) {
                        str3 = "live_card";
                    } else {
                        int iOrdinal2 = EnumC618810OOx.LYNX_CARD.ordinal();
                        if (numValueOf != null && numValueOf.intValue() == iOrdinal2) {
                            str3 = "live_event";
                        } else {
                            int iOrdinal3 = EnumC618810OOx.TEXT.ordinal();
                            if (numValueOf == null || numValueOf.intValue() != iOrdinal3) {
                                str3 = "";
                            } else {
                                str3 = "text";
                            }
                        }
                    }
                    linkedHashMap.put("content_type", str3);
                    List<Integer> statusCodeList = bulletinCreateMultiItemResponse.getStatusCodeList();
                    if (statusCodeList != null && (num = (Integer) C13LP.LJJJLZIJ(i, statusCodeList)) != null && num.intValue() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        linkedHashMap.put("send_status", CardStruct.IStatusCode.DEFAULT);
                        List<Integer> statusCodeList2 = bulletinCreateMultiItemResponse.getStatusCodeList();
                        if (statusCodeList2 != null) {
                            objLJJJLZIJ2 = C13LP.LJJJLZIJ(i, statusCodeList2);
                        }
                        linkedHashMap.put("error_code", String.valueOf(objLJJJLZIJ2));
                        List<String> statusMsgList = bulletinCreateMultiItemResponse.getStatusMsgList();
                        if (statusMsgList == null || (objLJJJLZIJ = C13LP.LJJJLZIJ(i, statusMsgList)) == null) {
                            objLJJJLZIJ = "";
                        }
                        linkedHashMap.put("error_message", objLJJJLZIJ);
                    } else {
                        linkedHashMap.put("send_status", "1");
                    }
                    if (bulletinItem2 != null && bulletinItem2.getType() == EnumC618810OOx.TEXT.ordinal()) {
                        linkedHashMap.put("is_link", CardStruct.IStatusCode.DEFAULT);
                    }
                    C0OPQ c0opq = C0OPQ.LIZ;
                    String strValueOf = String.valueOf(j);
                    c0opq.getClass();
                    C0OPQ.LJJJI(strValueOf, linkedHashMap);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public static void LJIILIIL(BulletinItem bulletinItem, BulletinBaseItem bulletinBaseItem, Map map) {
        LJI(bulletinBaseItem, bulletinItem);
        LIZJ(bulletinBaseItem, bulletinItem);
        LIZLLL.remove(bulletinBaseItem);
        Iterator<InterfaceC618620OOe> it2 = LJII.iterator();
        while (it2.hasNext()) {
            it2.next().YV(bulletinItem, bulletinBaseItem, map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113 A[Catch: Exception -> 0x0174, TryCatch #4 {Exception -> 0x0174, blocks: (B:37:0x010a, B:39:0x0113, B:41:0x011c, B:47:0x0128, B:49:0x012e, B:51:0x0136, B:56:0x0144, B:58:0x0147, B:60:0x014a, B:62:0x0150, B:64:0x0156, B:66:0x015e, B:71:0x0169, B:73:0x016c, B:77:0x0171), top: B:91:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128 A[Catch: Exception -> 0x0174, TryCatch #4 {Exception -> 0x0174, blocks: (B:37:0x010a, B:39:0x0113, B:41:0x011c, B:47:0x0128, B:49:0x012e, B:51:0x0136, B:56:0x0144, B:58:0x0147, B:60:0x014a, B:62:0x0150, B:64:0x0156, B:66:0x015e, B:71:0x0169, B:73:0x016c, B:77:0x0171), top: B:91:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a A[Catch: Exception -> 0x0174, TryCatch #4 {Exception -> 0x0174, blocks: (B:37:0x010a, B:39:0x0113, B:41:0x011c, B:47:0x0128, B:49:0x012e, B:51:0x0136, B:56:0x0144, B:58:0x0147, B:60:0x014a, B:62:0x0150, B:64:0x0156, B:66:0x015e, B:71:0x0169, B:73:0x016c, B:77:0x0171), top: B:91:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIL(java.lang.Long r24, java.lang.String r25, java.lang.String r26, X.InterfaceC1364105Vn<? super X.EnumC618610OOd> r27) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OOY.LJIL(java.lang.Long, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016e A[Catch: Exception -> 0x01eb, TryCatch #1 {Exception -> 0x01eb, blocks: (B:35:0x014b, B:37:0x016e, B:38:0x0172, B:31:0x0121, B:32:0x0133), top: B:90:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018f A[Catch: Exception -> 0x01f2, TryCatch #4 {Exception -> 0x01f2, blocks: (B:39:0x0186, B:41:0x018f, B:43:0x0198, B:49:0x01a4, B:51:0x01aa, B:53:0x01b2, B:58:0x01c0, B:60:0x01c3, B:62:0x01c6, B:64:0x01cc, B:66:0x01d2, B:68:0x01da, B:73:0x01e5, B:75:0x01e8, B:81:0x01ef), top: B:95:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a4 A[Catch: Exception -> 0x01f2, TryCatch #4 {Exception -> 0x01f2, blocks: (B:39:0x0186, B:41:0x018f, B:43:0x0198, B:49:0x01a4, B:51:0x01aa, B:53:0x01b2, B:58:0x01c0, B:60:0x01c3, B:62:0x01c6, B:64:0x01cc, B:66:0x01d2, B:68:0x01da, B:73:0x01e5, B:75:0x01e8, B:81:0x01ef), top: B:95:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c6 A[Catch: Exception -> 0x01f2, TryCatch #4 {Exception -> 0x01f2, blocks: (B:39:0x0186, B:41:0x018f, B:43:0x0198, B:49:0x01a4, B:51:0x01aa, B:53:0x01b2, B:58:0x01c0, B:60:0x01c3, B:62:0x01c6, B:64:0x01cc, B:66:0x01d2, B:68:0x01da, B:73:0x01e5, B:75:0x01e8, B:81:0x01ef), top: B:95:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJ(java.lang.Long r32, java.lang.String r33, java.lang.String r34, X.InterfaceC1364105Vn<? super X.EnumC618610OOd> r35) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OOY.LJJ(java.lang.Long, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void LJIIIIZZ(String str, String str2, Long l, String str3, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        String str4;
        String str5;
        Object obj4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str6 = "live_room_page";
        String str7 = "";
        if (Intrinsics.LJFF(str2, "live")) {
            obj = "live_room_page";
        } else if (Intrinsics.LJFF(str2, "live_event")) {
            obj = "live_event_page";
        } else {
            obj = "";
        }
        linkedHashMap.put("enter_from", obj);
        if (Intrinsics.LJFF(str2, "live")) {
            obj2 = "live_room_page";
        } else if (Intrinsics.LJFF(str2, "live_event")) {
            obj2 = "live_event_page";
        } else {
            obj2 = "";
        }
        linkedHashMap.put("entrance_page", obj2);
        linkedHashMap.put("channel_id", String.valueOf(l));
        String str8 = "manual_share_live_card";
        if (Intrinsics.LJFF(str2, "live")) {
            obj3 = "manual_share_live_card";
        } else if (!Intrinsics.LJFF(str2, "live_event")) {
            obj3 = "";
        } else {
            obj3 = "manual_share_live_event";
        }
        linkedHashMap.put("enter_method", obj3);
        if (Intrinsics.LJFF(str2, "live_event")) {
            str4 = "live_event";
        } else if (!Intrinsics.LJFF(str2, "live")) {
            str4 = "";
        } else {
            str4 = "live_card";
        }
        linkedHashMap.put("content_type", str4);
        linkedHashMap.put("send_status", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("error_code", String.valueOf(i));
        if (str3 == null) {
            str5 = "";
        } else {
            str5 = str3;
        }
        linkedHashMap.put("error_message", str5);
        C0OPQ c0opq = C0OPQ.LIZ;
        String strValueOf = String.valueOf(l);
        c0opq.getClass();
        C0OPQ.LJJJI(strValueOf, linkedHashMap);
        if (C123100dR.LIZ(str)) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (Intrinsics.LJFF(str2, "live")) {
                obj4 = "live_room_page";
            } else if (Intrinsics.LJFF(str2, "live_event")) {
                obj4 = "live_event_page";
            } else {
                obj4 = "";
            }
            linkedHashMap2.put("enter_from", obj4);
            if (!Intrinsics.LJFF(str2, "live")) {
                if (Intrinsics.LJFF(str2, "live_event")) {
                    str6 = "live_event_page";
                } else {
                    str6 = "";
                }
            }
            linkedHashMap2.put("entrance_page", str6);
            linkedHashMap2.put("channel_id", String.valueOf(l));
            if (!Intrinsics.LJFF(str2, "live")) {
                if (!Intrinsics.LJFF(str2, "live_event")) {
                    str8 = "";
                } else {
                    str8 = "manual_share_live_event";
                }
            }
            linkedHashMap2.put("enter_method", str8);
            linkedHashMap2.put("content_type", "text");
            linkedHashMap2.put("send_status", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap2.put("is_link", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap2.put("error_code", String.valueOf(i));
            if (str3 != null) {
                str7 = str3;
            }
            linkedHashMap2.put("error_message", str7);
            C0OPQ.LJJJI(String.valueOf(l), linkedHashMap2);
        }
    }

    public static void LJIIL(String str, BulletinBaseItem bulletinBaseItem, int i, String str2, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPublishFailed() - item = ");
        sbLIZ.append(bulletinBaseItem);
        sbLIZ.append(", errorMsg = ");
        sbLIZ.append(str2);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(LJIIIIZZ, null, null, new C0OKI(str, bulletinBaseItem, i, null), 3);
        LIZLLL.remove(bulletinBaseItem);
        Iterator<InterfaceC618620OOe> it2 = LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LU0(bulletinBaseItem, i, str2, map);
        }
    }

    public static void LJIJI(BaseShortVideoContext baseShortVideoContext, final String str, final boolean z, final Map map, final BulletinBaseItem bulletinBaseItem) {
        final VideoPublishEditModel videoPublishEditModel;
        SingleImageCoverBitmapData singleImageCoverBitmapData;
        String sourcePath;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishPhoto: ");
        sbLIZ.append(str);
        C1720106oR.LJI("BulletinPageFragment", C2188811AlT.LIZIZ(sbLIZ));
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null) {
            videoPublishEditModel.setEncryptType(0);
            videoPublishEditModel.setUploadScene(3);
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_photo_skip_generate_setting", true, true) && C290770BaV.LIZ() && Intrinsics.LJFF(((LinkedHashMap) map).get("has_edited"), "false") && (singleImageCoverBitmapData = videoPublishEditModel.getSingleImageCoverBitmapData()) != null && (sourcePath = singleImageCoverBitmapData.getSourcePath()) != null) {
                videoPublishEditModel.creativeModel.dmMediaModel = new DMMediaModel(2, sourcePath, "", "", false, true, false, videoPublishEditModel.creativeModel.initialModel.dmCameraModel.groupShotData);
            }
            Map<String, BulletinPhotoItem> map2 = LJ;
            final String strJ4 = C786410Ut5.j4("Bulletin Board %s Publish Photo %d", Arrays.copyOf(new Object[]{str, Integer.valueOf(map2.size())}, 2));
            map2.put(strJ4, null);
            final C620150OUb c620150OUb = new C620150OUb();
            final C238400w2 c238400w2 = new C238400w2();
            C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
            c912070ZqH.LJIILIIL().LJIIIZ().LJI(strJ4, videoPublishEditModel, false, C2097608Jq.LJ(), null);
            c912070ZqH.LJIILLIIL().LJII().LIZ(baseShortVideoContext.getCreationId()).LIZIZ(C18ZL.BULLETIN_BOARD);
            c912070ZqH.LJIILIIL().LJIIIZ().LIZIZ(new C09KS<DMUploadImageResult>() { // from class: X.0OPU
                @Override // X.C09KS
                public final void Z3(C912060ZqG c912060ZqG) {
                }

                @Override // X.C09KS
                public final void onProgress(int i2) {
                }

                public final void LIZ(String str2) throws JSONException {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onFailed() - error = ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", photoPublishMap[publishKey] = ");
                    sbLIZ2.append(((LinkedHashMap) C0OOY.LJ).get(strJ4));
                    C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                    C912070ZqH.LIZIZ.LJIILIIL().LJIIIZ().LJIIJJI(this, strJ4);
                    c620150OUb.LIZIZ();
                    C0OPQ c0opq = C0OPQ.LIZ;
                    long jLIZ = c620150OUb.LIZ();
                    long j = c238400w2.element;
                    c0opq.getClass();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("upload_success", 0);
                    jSONObject.put("time_interval", jLIZ);
                    jSONObject.put("image_size", j);
                    C20684815ws.LJIJ("bulletin_board_upload_image", jSONObject);
                    ConcurrentLinkedQueue<InterfaceC618620OOe> concurrentLinkedQueue = C0OOY.LJII;
                    String str3 = strJ4;
                    Map<String, String> map3 = map;
                    for (InterfaceC618620OOe interfaceC618620OOe : concurrentLinkedQueue) {
                        BulletinBaseItem bulletinBaseItem2 = (BulletinBaseItem) ((LinkedHashMap) C0OOY.LJ).get(str3);
                        if (bulletinBaseItem2 != null) {
                            interfaceC618620OOe.LU0(bulletinBaseItem2, EnumC617610OKh.PHOTO_UPLOAD_FAILED.getStatusCode(), str2, map3);
                        }
                    }
                }

                @Override // X.C09KS
                public final void Uj(C0OPV c0opv) {
                    c620150OUb.LIZLLL();
                    c238400w2.element = C912070ZqH.LIZIZ.LJ().getFileSize(c0opv.LIZ);
                    if (z) {
                        Map<String, BulletinPhotoItem> map3 = C0OOY.LJ;
                        String str2 = strJ4;
                        BulletinBaseItem bulletinBaseItem2 = bulletinBaseItem;
                        if (!(bulletinBaseItem2 instanceof BulletinPhotoItem)) {
                            bulletinBaseItem2 = null;
                        }
                        map3.put(str2, (BulletinPhotoItem) bulletinBaseItem2);
                        return;
                    }
                    Map<String, BulletinPhotoItem> map4 = C0OOY.LJ;
                    String str3 = strJ4;
                    BulletinPhotoItem bulletinPhotoItem = new BulletinPhotoItem(0, true, System.currentTimeMillis(), Long.valueOf(System.currentTimeMillis()), true, new BulletinImageInfo(null, Integer.valueOf(c0opv.LIZIZ), Integer.valueOf(c0opv.LIZJ), null, c0opv.LIZ, null), null, null, Long.valueOf(C0OPX.LIZ()), 0, videoPublishEditModel, map, false, false, false, 0, 0, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser(), false, new ArrayList(), 0, new ArrayList(), str, null, null);
                    bulletinPhotoItem.LLILLL = true;
                    map4.put(str3, bulletinPhotoItem);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onFileSynthesised() - photoPublishMap[publishKey] = ");
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map4;
                    sbLIZ2.append(linkedHashMap.get(strJ4));
                    C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                    BulletinBaseItem bulletinBaseItem3 = (BulletinBaseItem) linkedHashMap.get(strJ4);
                    if (bulletinBaseItem3 != null) {
                        String str4 = str;
                        C0OPI.LIZ.getClass();
                        C0OPI.LIZ(bulletinBaseItem3, str4);
                        C0OOY.LIZ.getClass();
                        C0OOY.LJIIJ(bulletinBaseItem3);
                    }
                }

                @Override // X.C09KS
                public final void l1(C09KK c09kk) throws JSONException {
                    String uri;
                    Integer numValueOf;
                    Integer numValueOf2;
                    DMEncryptedImageContentExtra extra;
                    DMEncryptedImageContentExtra extra2;
                    DMEncryptedImageContentExtra extra3;
                    DMUploadImageResult dMUploadImageResult = (DMUploadImageResult) c09kk;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onSuccess() - photoPublishMap[publishKey] = ");
                    LinkedHashMap linkedHashMap = (LinkedHashMap) C0OOY.LJ;
                    sbLIZ2.append(linkedHashMap.get(strJ4));
                    C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                    C912070ZqH.LIZIZ.LJIILIIL().LJIIIZ().LJIIJJI(this, strJ4);
                    c620150OUb.LIZIZ();
                    C0OPQ c0opq = C0OPQ.LIZ;
                    long jLIZ = c620150OUb.LIZ();
                    long j = c238400w2.element;
                    c0opq.getClass();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("upload_success", 1);
                    jSONObject.put("time_interval", jLIZ);
                    jSONObject.put("image_size", j);
                    C20684815ws.LJIJ("bulletin_board_upload_image", jSONObject);
                    BulletinPhotoItem bulletinPhotoItem = (BulletinPhotoItem) linkedHashMap.get(strJ4);
                    if (bulletinPhotoItem != null) {
                        String str2 = str;
                        boolean z2 = z;
                        Map<String, String> map3 = map;
                        DMEncryptedImageContent dMEncryptedImageContent = dMUploadImageResult.decryptData;
                        String str3 = null;
                        if (dMEncryptedImageContent != null) {
                            uri = dMEncryptedImageContent.getUri();
                        } else {
                            uri = null;
                        }
                        DMEncryptedImageContent dMEncryptedImageContent2 = dMUploadImageResult.decryptData;
                        if (dMEncryptedImageContent2 != null && (extra3 = dMEncryptedImageContent2.getExtra()) != null) {
                            numValueOf = Integer.valueOf(extra3.width);
                        } else {
                            numValueOf = null;
                        }
                        DMEncryptedImageContent dMEncryptedImageContent3 = dMUploadImageResult.decryptData;
                        if (dMEncryptedImageContent3 != null && (extra2 = dMEncryptedImageContent3.getExtra()) != null) {
                            numValueOf2 = Integer.valueOf(extra2.height);
                        } else {
                            numValueOf2 = null;
                        }
                        DMEncryptedImageContent dMEncryptedImageContent4 = dMUploadImageResult.decryptData;
                        if (dMEncryptedImageContent4 != null && (extra = dMEncryptedImageContent4.getExtra()) != null) {
                            str3 = extra.format;
                        }
                        bulletinPhotoItem.LLJIJIL = new BulletinImageInfo(uri, numValueOf, numValueOf2, str3, null, null);
                        C0OOY.LIZ.getClass();
                        C23250099c.LIZLLL(C0OOY.LJIIIIZZ, null, null, new C0OKM(str2, bulletinPhotoItem, z2, map3, null), 3);
                    }
                }

                @Override // X.C09KS
                public final void m4(String str2) {
                    C0OPX.LJII("onCoverGenerated");
                }

                @Override // X.C09KS
                public final void rf(C1898507c7 c1898507c7) throws JSONException {
                    LIZ(c1898507c7.LIZ);
                }
            }, strJ4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJ(com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r47, java.lang.String r48, boolean r49, java.util.Map r50, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem r51) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OOY.LJIJJ(com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext, java.lang.String, boolean, java.util.Map, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem):void");
    }

    public static void LJJIFFI(final String str, String str2, final BulletinVoiceItem bulletinVoiceItem, final boolean z, final Map map) {
        String string;
        long jLongValue;
        Long l = bulletinVoiceItem.LLJJIJI;
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        C054G c054g = LJIIIIZZ;
        C2149708bX c2149708bX = new C2149708bX(c054g);
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        long j = bulletinVoiceItem.LLJI;
        InterfaceC2149308bT interfaceC2149308bT = new InterfaceC2149308bT() { // from class: X.0OKO
            @Override // X.InterfaceC2149308bT
            public final void LIZ(long j2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("publishVoice: pipeline failed, errCode=");
                sbLIZ.append(j2);
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
                C0OOY c0ooy = C0OOY.LIZ;
                String str3 = str;
                BulletinVoiceItem bulletinVoiceItem2 = bulletinVoiceItem;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("errCode=");
                sbLIZ2.append(j2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                Map<String, String> map2 = map;
                c0ooy.getClass();
                C0OOY.LJIIL(str3, bulletinVoiceItem2, -1, strLIZIZ, map2);
            }

            @Override // X.InterfaceC2149308bT
            public final void LIZIZ(String str3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("publishVoice: upload success vid=");
                sbLIZ.append(str3);
                sbLIZ.append(", calling create API");
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                C0OOY.LIZ.getClass();
                ConcurrentLinkedQueue<BulletinBaseItem> concurrentLinkedQueue = C0OOY.LIZLLL;
                concurrentLinkedQueue.remove(bulletinVoiceItem);
                BulletinVoiceItem bulletinVoiceItemLLIIIL = BulletinVoiceItem.LLIIIL(bulletinVoiceItem, str3, false, false, false, false, 0, 0, null, null, 0, -2);
                concurrentLinkedQueue.add(bulletinVoiceItemLLIIIL);
                C23250099c.LIZLLL(C0OOY.LJIIIIZZ, null, null, new C0OKN(str, bulletinVoiceItemLLIIIL, z, map, null), 3);
            }
        };
        C2233808p6 c2233808p6 = C2233808p6.LIZ;
        String strValueOf = String.valueOf(jLongValue);
        c2233808p6.getClass();
        C23250099c.LIZLLL(c054g, C0PEM.LIZJ, null, new C2149508bV(c2149708bX, str2, string, jLongValue, interfaceC2149308bT, C2233808p6.LIZLLL(j, strValueOf, string, z), null), 2);
    }

    public static void LJIJ(String str, List list, List list2, boolean z, Map map, boolean z2) {
        C23250099c.LIZLLL(LJIIIIZZ, null, null, new C0OOL(list, list2, z2, str, z, map, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02be A[Catch: Exception -> 0x03b6, TryCatch #3 {Exception -> 0x03b6, blocks: (B:87:0x02ba, B:89:0x02be, B:91:0x02f3, B:93:0x0314, B:94:0x0318, B:97:0x0335, B:99:0x0343, B:101:0x0347, B:103:0x034b, B:104:0x0353, B:111:0x0381, B:112:0x0384, B:115:0x038e, B:107:0x0360, B:108:0x0371, B:110:0x0377, B:116:0x039b, B:117:0x03a6), top: B:137:0x02ba }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f3 A[Catch: Exception -> 0x03b6, TryCatch #3 {Exception -> 0x03b6, blocks: (B:87:0x02ba, B:89:0x02be, B:91:0x02f3, B:93:0x0314, B:94:0x0318, B:97:0x0335, B:99:0x0343, B:101:0x0347, B:103:0x034b, B:104:0x0353, B:111:0x0381, B:112:0x0384, B:115:0x038e, B:107:0x0360, B:108:0x0371, B:110:0x0377, B:116:0x039b, B:117:0x03a6), top: B:137:0x02ba }] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(java.lang.String r41, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem r42, boolean r43, java.util.Map<java.lang.String, java.lang.String> r44, X.C0OP0 r45, X.InterfaceC1364105Vn<? super kotlin.Unit> r46) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OOY.LJIILLIIL(java.lang.String, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem, boolean, java.util.Map, X.0OP0, X.05Vn):java.lang.Object");
    }

    public static void LJIILL(C0OOY c0ooy, String str, Aweme aweme, Map map, C0OP0 c0op0, Map map2, int i) {
        String str2;
        Map map3 = map2;
        C0OP0 c0op02 = c0op0;
        if ((i & 8) != 0) {
            c0op02 = C0OP0.DEFAULT;
        }
        if ((i & 16) != 0) {
            map3 = null;
        }
        c0ooy.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long jLIZ = C0OPX.LIZ();
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        int type = c0op02.getType();
        if (map3 != null) {
            str2 = (String) map3.get("unique_key");
        } else {
            str2 = null;
        }
        C0OOO c0ooo = new C0OOO(0, jCurrentTimeMillis, Long.valueOf(jCurrentTimeMillis2), aweme, Long.valueOf(jLIZ), 0, map, curUser, false, null, 0, null, str, null, str2, type, 1826624);
        c0ooo.LLILLL = true;
        C0OPI.LIZ.getClass();
        C0OPI.LIZ(c0ooo, str);
        LJIIJ(c0ooo);
        C23250099c.LIZLLL(LJIIIIZZ, null, null, new C0OKQ(str, c0ooo, map, c0op02, null), 3);
    }

    public static void LJJI(C19EG c19eg, EnumC618610OOd enumC618610OOd, BaseSharePackage baseSharePackage, int i, String str, String str2, String str3, int i2) {
        int i3 = C618600OOc.LIZ[enumC618610OOd.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    C1389910mGz c1389910mGz = new C1389910mGz(c19eg);
                    c1389910mGz.LJIIJ(C1618770sE7.LIZJ(2131851468));
                    c1389910mGz.LIZ.LIZLLL = 3;
                    c1389910mGz.LJI(R.style.y0);
                    c1389910mGz.LJ(3000L);
                    c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(145)));
                    C1360890lWB c1360890lWB = c1389910mGz.LIZ;
                    c1360890lWB.LIZIZ = 1;
                    c1360890lWB.LJIIIIZZ = new ACListenerS81S1100000_9(baseSharePackage, str3, 6);
                    c1389910mGz.LJIIJJI();
                    return;
                }
                C1389910mGz c1389910mGz2 = new C1389910mGz(c19eg);
                c1389910mGz2.LJIIJ(C1618770sE7.LIZJ(2131851478));
                c1389910mGz2.LIZ.LIZLLL = 3;
                c1389910mGz2.LJI(R.style.y0);
                c1389910mGz2.LJ(3000L);
                c1389910mGz2.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(145)));
                C1360890lWB c1360890lWB2 = c1389910mGz2.LIZ;
                c1360890lWB2.LIZIZ = 1;
                c1360890lWB2.LJIIIIZZ = new ACListenerS81S1100000_9(baseSharePackage, str3, 5);
                c1389910mGz2.LJIIJJI();
                return;
            }
            C1389910mGz c1389910mGz3 = new C1389910mGz(c19eg);
            c1389910mGz3.LJIIJ(C1618770sE7.LIZJ(2131851469));
            c1389910mGz3.LIZ.LIZLLL = 3;
            c1389910mGz3.LJI(R.style.y0);
            c1389910mGz3.LJ(3000L);
            c1389910mGz3.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(145)));
            C1360890lWB c1360890lWB3 = c1389910mGz3.LIZ;
            c1360890lWB3.LIZIZ = 1;
            c1360890lWB3.LJIIIIZZ = new ACListenerS81S1100000_9(baseSharePackage, str3, 4);
            c1389910mGz3.LJIIJJI();
            return;
        }
        String strLJI = C0OPX.LJI(c19eg, i, str2);
        C1389910mGz c1389910mGz4 = new C1389910mGz(c19eg);
        c1389910mGz4.LJIIJ(strLJI);
        c1389910mGz4.LJI(R.style.y0);
        c1389910mGz4.LJ(3000L);
        c1389910mGz4.LIZIZ(i2);
        ACListenerS13S2200000_9 aCListenerS13S2200000_9 = new ACListenerS13S2200000_9(baseSharePackage, str3, c19eg, str, 1);
        C1360890lWB c1360890lWB4 = c1389910mGz4.LIZ;
        c1360890lWB4.LJIIIIZZ = aCListenerS13S2200000_9;
        c1360890lWB4.LIZLLL = 0;
        c1360890lWB4.LIZIZ = 0;
        c1389910mGz4.LJIIJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJLI(X.C0OOY r46, java.lang.String r47, java.lang.String r48, long r49, java.util.List r51, boolean r52, java.util.Map r53, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem r54, com.ss.android.ugc.aweme.notice.repo.list.bean.ApplySkin r55, int r56) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OOY.LJIJJLI(X.0OOY, java.lang.String, java.lang.String, long, java.util.List, boolean, java.util.Map, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem, com.ss.android.ugc.aweme.notice.repo.list.bean.ApplySkin, int):void");
    }
}

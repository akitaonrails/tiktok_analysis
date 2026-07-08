package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.experiment.Configuration;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeExtraData;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.notification.utils.FollowSortDataCache;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905080zfu {
    public static final /* synthetic */ int LIZ = 0;

    public static C1905130zfz LIZ(final MusNotice musNotice) {
        GeneralTemplateNotice generalTemplateNotice;
        Integer num;
        if (musNotice != null && (generalTemplateNotice = musNotice.templateNotice) != null && (num = generalTemplateNotice.type) != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 41) {
                return new C1905130zfz(musNotice) { // from class: X.0zfp
                    {
                        C1905050zfr c1905050zfr = this.LIZIZ;
                        c1905050zfr.LIZ.LIZ = true;
                        c1905050zfr.LJI = true;
                    }

                    @Override // X.C1905130zfz
                    public final String LIZ(EnumC1905950zhJ enumC1905950zhJ, String str) {
                        MusNotice musNotice2;
                        if (enumC1905950zhJ == EnumC1905950zhJ.COMMON && (musNotice2 = this.LIZ) != null) {
                            long j = musNotice2.lastReadTime;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append("&isNew=true&last_read_time=");
                            sbLIZ.append(j);
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }
                        return null;
                    }
                };
            }
            if (iIntValue == 31) {
                return new C1905130zfz(musNotice) { // from class: X.0zft
                    {
                        this.LIZIZ.LIZ.LIZ = true;
                    }
                };
            }
            if (iIntValue == 33) {
                return new C1905130zfz(musNotice) { // from class: X.0zfk
                    @Override // X.C1905130zfz
                    public final void LIZJ() {
                        GeneralTemplateNotice generalTemplateNotice2;
                        NoticeUITemplate noticeUITemplate;
                        TitleTemplate titleTemplate;
                        List<User> list;
                        User user;
                        MusNotice musNotice2 = this.LIZ;
                        if (musNotice2 == null || (generalTemplateNotice2 = musNotice2.templateNotice) == null || (noticeUITemplate = generalTemplateNotice2.uiTemplate) == null || (titleTemplate = noticeUITemplate.titleTemplate) == null || (list = titleTemplate.fromUsers) == null || (user = (User) C13LP.LJJJLL(list)) == null || user.getFollowStatus() != 2 || !C1336205Ku.LIZ(false).getImSayHiService().LJIIJJI(user.getUid())) {
                            return;
                        }
                        C1336205Ku.LIZ(false).getImSayHiService().LIZIZ(user.getFollowerStatus(), user.getUid(), true);
                    }

                    @Override // X.C1905130zfz
                    public final void LJ() {
                        MusNotice musNotice2;
                        Object c098200Yq;
                        GeneralTemplateNotice generalTemplateNotice2;
                        NoticeUITemplate noticeUITemplate;
                        TitleTemplate titleTemplate;
                        List<User> list;
                        User user;
                        GeneralTemplateNotice generalTemplateNotice3;
                        NoticeUITemplate noticeUITemplate2;
                        TitleTemplate titleTemplate2;
                        List<User> list2;
                        User user2;
                        MusNotice musNotice3 = this.LIZ;
                        if (musNotice3 != null && (generalTemplateNotice3 = musNotice3.templateNotice) != null && (noticeUITemplate2 = generalTemplateNotice3.uiTemplate) != null && (titleTemplate2 = noticeUITemplate2.titleTemplate) != null && (list2 = titleTemplate2.fromUsers) != null && (user2 = (User) C13LP.LJJJLL(list2)) != null && user2.getFollowStatus() == 0 && user2.getFollowerStatus() == 1) {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("to_user_id", user2.getUid());
                            String accurateRecType = user2.getAccurateRecType();
                            if (accurateRecType == null) {
                                accurateRecType = "";
                            }
                            c2344009Gk.LJIIIIZZ("rec_type", accurateRecType);
                            c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
                            c2344009Gk.LJIIIIZZ("previous_page", "message");
                            C20684815ws.LJIILLIIL("show_follow_back_button", c2344009Gk.LIZ);
                        }
                        if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().historyMaxFollowerCount < ((Configuration) C1901310zZp.LIZIZ.getValue()).maxFansDivide) {
                            MusNotice musNotice4 = this.LIZ;
                            if ((musNotice4 != null && (generalTemplateNotice2 = musNotice4.templateNotice) != null && (noticeUITemplate = generalTemplateNotice2.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (user = (User) C13LP.LJJJLL(list)) != null && user.getFollowStatus() == 2) || (musNotice2 = this.LIZ) == null || musNotice2.isCache()) {
                                return;
                            }
                            MusNotice musNotice5 = this.LIZ;
                            FollowSortDataCache followSortDataCache = FollowSortDataCache.LIZ;
                            String str = musNotice5.nid;
                            followSortDataCache.getClass();
                            FollowSortDataCache.LIZ();
                            try {
                                LinkedHashMap<String, Integer> linkedHashMap = FollowSortDataCache.LIZIZ;
                                if (linkedHashMap.size() >= FollowSortDataCache.LIZLLL && linkedHashMap.entrySet().iterator().hasNext()) {
                                    linkedHashMap.remove(linkedHashMap.entrySet().iterator().next().getKey());
                                }
                                Integer num2 = linkedHashMap.get(str);
                                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                                if (iIntValue2 >= FollowSortDataCache.LIZJ) {
                                    return;
                                }
                                linkedHashMap.put(str, Integer.valueOf(iIntValue2 + 1));
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                            if (thM5exceptionOrNullimpl != null) {
                                int i = C2187451AjH.LIZ;
                                C1720106oR.LIZIZ("InboxDataCache", "addExposeCount error", thM5exceptionOrNullimpl);
                            }
                        }
                    }

                    {
                        GeneralTemplateNotice generalTemplateNotice2;
                        NoticeUITemplate noticeUITemplate;
                        TitleTemplate titleTemplate;
                        List<User> list;
                        User user;
                        super(musNotice);
                        C1905050zfr c1905050zfr = this.LIZIZ;
                        c1905050zfr.LIZ.LIZIZ = true;
                        c1905050zfr.LIZLLL = false;
                        c1905050zfr.LJFF = true;
                        if (musNotice != null && (generalTemplateNotice2 = musNotice.templateNotice) != null && (noticeUITemplate = generalTemplateNotice2.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (user = (User) C13LP.LJJJLL(list)) != null && C1245020iVI.LIZLLL(user)) {
                            this.LIZIZ.LIZ.getClass();
                        }
                    }

                    @Override // X.C1905130zfz
                    public final void LIZIZ(String str) {
                        String uid;
                        Activity activityLIZIZ;
                        Activity activityLIZ;
                        Intent intent;
                        GeneralTemplateNotice generalTemplateNotice2;
                        NoticeUITemplate noticeUITemplate;
                        TitleTemplate titleTemplate;
                        List<User> list;
                        User user;
                        MusNotice musNotice2 = this.LIZ;
                        String accountType = null;
                        if (musNotice2 != null && (generalTemplateNotice2 = musNotice2.templateNotice) != null && (noticeUITemplate = generalTemplateNotice2.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (user = (User) C13LP.LJJJLL(list)) != null) {
                            uid = user.getUid();
                        } else {
                            uid = null;
                        }
                        MusNotice musNotice3 = this.LIZ;
                        if (musNotice3 != null) {
                            accountType = musNotice3.getAccountType();
                        }
                        String str2 = C1900870zZ7.LIZ;
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", str);
                        c2344009Gk.LJIIIIZZ("enter_method", "click_cell");
                        c2344009Gk.LJIIIIZZ("position", str2);
                        c2344009Gk.LJIIIIZZ("account_type", accountType);
                        c2344009Gk.LJIIIIZZ("to_user_id", uid);
                        c2344009Gk.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C06MM.LIZ(activityLIZIZ)) != null && (intent = activityLIZ.getIntent()) != null) {
                            try {
                                Bundle extras = intent.getExtras();
                                if (extras != null && extras.getInt("is_from_push", 0) == 1) {
                                    c2344009Gk.LJFF("is_from_push", "1");
                                    String string = extras.getString("push_type");
                                    if (string == null) {
                                        string = "";
                                    }
                                    c2344009Gk.LJFF("push_type", string);
                                    String string2 = extras.getString("push_id");
                                    if (string2 != null) {
                                        str3 = string2;
                                    }
                                    c2344009Gk.LJFF("push_id", str3);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
                    }

                    @Override // X.C1905130zfz
                    public final void LIZLLL(EnumC1905020zfo enumC1905020zfo, Context context) {
                        int i;
                        if (enumC1905020zfo == EnumC1905020zfo.Click) {
                            C1906140zhc c1906140zhc = C1906140zhc.LIZ;
                            MusNotice musNotice2 = this.LIZ;
                            if (musNotice2 != null) {
                                i = musNotice2.clientOrder;
                            } else {
                                i = -1;
                            }
                            c1906140zhc.getClass();
                            C1906140zhc.LIZLLL(context, i);
                        }
                    }
                };
            }
            if (iIntValue == 225) {
                return new C1905130zfz(musNotice) { // from class: X.0zfw
                    {
                        this.LIZIZ.LJFF = true;
                    }
                };
            }
            if (iIntValue == 45) {
                return new C1905130zfz(musNotice) { // from class: X.0zfs
                    {
                        this.LIZIZ.LIZ.LIZ = true;
                    }
                };
            }
            if (iIntValue == 21) {
                return new C1905130zfz(musNotice) { // from class: X.0zfv
                    {
                        this.LIZIZ.LJI = true;
                    }
                };
            }
            if (iIntValue == 9101) {
                return new C1905130zfz(musNotice) { // from class: X.0zfl
                    @Override // X.C1905130zfz
                    public final void LIZIZ(String str) {
                        C1904500zey.LJFF.LJ();
                        C1901350zZt.LIZ.getClass();
                        C1901350zZt.LIZ(0, 23);
                    }

                    @Override // X.C1905130zfz
                    public final String LIZ(EnumC1905950zhJ enumC1905950zhJ, String str) {
                        MusNotice musNotice2 = this.LIZ;
                        if (musNotice2 != null && !musNotice2.hasRead) {
                            return null;
                        }
                        if (enumC1905950zhJ != EnumC1905950zhJ.LEFT && enumC1905950zhJ != EnumC1905950zhJ.RIGHT && enumC1905950zhJ != EnumC1905950zhJ.COMMON && enumC1905950zhJ != EnumC1905950zhJ.CELL) {
                            return null;
                        }
                        return C0OQ5.LIZ(str, "last_read_time", CardStruct.IStatusCode.DEFAULT);
                    }
                };
            }
            if (C13LQ.LJIILJJIL(iIntValue, (int[]) C1905120zfy.LIZIZ.getValue())) {
                return new C1905130zfz(musNotice) { // from class: X.0zfn
                    @Override // X.C1905130zfz
                    public final void LJ() {
                        LJFF(EnumC1905020zfo.Show);
                    }

                    @Override // X.C1905130zfz
                    public final void LIZIZ(String str) {
                        LJFF(EnumC1905020zfo.Click);
                    }

                    public final void LJFF(EnumC1905020zfo enumC1905020zfo) {
                        String str;
                        String str2;
                        int iIntValue2;
                        Integer numLJIIJJI;
                        Integer numLJIIJJI2;
                        Integer numLJIIJJI3;
                        MusNotice musNotice2 = this.LIZ;
                        if (musNotice2 == null || (str = musNotice2.templateNotice.schemaUrl) == null) {
                            return;
                        }
                        try {
                            int iIntValue3 = 0;
                            if (!u.LJJIIJZLJL(str, "aweme://inbox/bulletin_board", false)) {
                                return;
                            }
                            GeneralTemplateNotice generalTemplateNotice2 = musNotice2.templateNotice;
                            if (generalTemplateNotice2 != null) {
                                str2 = generalTemplateNotice2.messageExtra;
                            } else {
                                str2 = null;
                            }
                            Map<String, String> mapLIZ = C1075780e6K.LIZ(str2);
                            Uri uri = UriProtector.parse(str);
                            String strLIZIZ = C1907940zkW.LIZIZ(uri, "bulletin_board_id");
                            if (strLIZIZ == null) {
                                return;
                            }
                            String strLIZIZ2 = C1907940zkW.LIZIZ(uri, "bulletin_account_status");
                            int iIntValue4 = -1;
                            if (strLIZIZ2 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(strLIZIZ2)) != null) {
                                iIntValue2 = numLJIIJJI3.intValue();
                            } else {
                                iIntValue2 = -1;
                            }
                            String strLIZIZ3 = C1907940zkW.LIZIZ(uri, "is_subscribed");
                            if (strLIZIZ3 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strLIZIZ3)) != null) {
                                iIntValue4 = numLJIIJJI2.intValue();
                            }
                            C617050OId c617050OId = EnumC617060OIe.Companion;
                            String strLIZIZ4 = C1907940zkW.LIZIZ(uri, "bulletin_board_identity_type");
                            if (strLIZIZ4 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZIZ4)) != null) {
                                iIntValue3 = numLJIIJJI.intValue();
                            }
                            boolean zLIZIZ = c617050OId.LIZIZ(iIntValue3);
                            mapLIZ.put("enter_from", "activity_message_page");
                            mapLIZ.put("action_type", enumC1905020zfo.getValue());
                            if (Intrinsics.LJFF(enumC1905020zfo.getValue(), "click")) {
                                mapLIZ.put("click_type", "enter_cell");
                            }
                            mapLIZ.put("channel_status", String.valueOf(iIntValue2));
                            mapLIZ.put("is_subscribed", String.valueOf(iIntValue4));
                            C0OPQ c0opq = C0OPQ.LIZ;
                            Boolean boolValueOf = Boolean.valueOf(zLIZIZ);
                            c0opq.getClass();
                            C0OPQ.LJ(boolValueOf, strLIZIZ, mapLIZ);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C0OPX.LJII("entrance cell report failed");
                        }
                    }
                };
            }
            if (C13LQ.LJIILJJIL(iIntValue, (int[]) C1905110zfx.LIZIZ.getValue())) {
                return new C1905130zfz(musNotice) { // from class: X.0zg1
                    @Override // X.C1905130zfz
                    public final void LJ() {
                        EnumC1905020zfo enumC1905020zfo = EnumC1905020zfo.Show;
                        MusNotice musNotice2 = this.LIZ;
                        if (musNotice2 != null) {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("action", enumC1905020zfo.getValue());
                            try {
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            String str = C786410Ut5.Y3(C1BWL.LIZ().getPackageManager(), "com.bd.nproject", 1) != null ? "1" : CardStruct.IStatusCode.DEFAULT;
                            c2344009Gk.LJIIIIZZ("is_installed_lemon8", str);
                            c2344009Gk.LJ(musNotice2.templateNotice.type, "notice_type");
                            C20684815ws.LJIILLIIL("rd_lemon8_notice_params_check", c2344009Gk.LIZ);
                        }
                    }
                };
            }
            return null;
        }
        return null;
    }

    public static boolean LIZIZ(MusNotice musNotice) {
        GeneralTemplateNotice generalTemplateNotice;
        NoticeExtraData noticeExtraData;
        Aweme aweme;
        if (musNotice != null && (generalTemplateNotice = musNotice.templateNotice) != null && (noticeExtraData = generalTemplateNotice.extraData) != null && (aweme = noticeExtraData.aweme) != null) {
            if (aweme.getIsTikTokStory() || aweme.getAwemeType() == 40) {
                return true;
            }
            return false;
        }
        return false;
    }
}

package Y;

import X.AbstractC1387200mCc;
import X.AbstractC1511510pR7;
import X.AbstractC622560ObO;
import X.C08JS;
import X.C098200Yq;
import X.C0AD7;
import X.C0AE9;
import X.C0N33;
import X.C0N5P;
import X.C0N5R;
import X.C0N86;
import X.C0N89;
import X.C0N8B;
import X.C0NAP;
import X.C1022820ciu;
import X.C123100dR;
import X.C1233040iBy;
import X.C1387100mCS;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1511420pQy;
import X.C1512100pS4;
import X.C1575980r76;
import X.C1601400rm6;
import X.C189200o6;
import X.C1953307kx;
import X.C19719512Dh;
import X.C1AF0;
import X.C1C7U;
import X.C1EE2;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2241008qG;
import X.C2344009Gk;
import X.C2382909Vj;
import X.C584590MwL;
import X.C596490NaR;
import X.C621180OYa;
import X.C622070Oab;
import X.C622190Oan;
import X.C622210Oap;
import X.C622290Oax;
import X.C625530OgB;
import X.EnumC584580MwK;
import X.EnumC622250Oat;
import X.InterfaceC622260Oau;
import X.InterfaceC622540ObM;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.saas.host.impl.feed.invitation.JoinGroupBottomButtonAssem;
import com.ss.android.ugc.aweme.ml.ab.SmartPrerenderExperiment;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.profilebanner.data.EventParam;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerInfoModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem.VibeFeedDateInfoAssem;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS14S1100000_9 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    public static final void run$5(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        PlayerController.LLIIIILZ((PlayerController) aRunnableS14S1100000_9.l1, aRunnableS14S1100000_9.s0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
            case 26:
                run$26(this);
                break;
            case 27:
                run$27(this);
                break;
            case 28:
                run$28(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C20684815ws.LJIJ("deep_link_end", ((C2241008qG) this.l1).LJ());
        if (this.s0.length() == 0 || ((Boolean) C0AE9.LIZ.getValue()).booleanValue()) {
            return;
        }
        String str = this.s0;
        Map<String, String> mapLJJJJL = C621180OYa.LIZIZ.LJJJJL();
        if (true ^ mapLJJJJL.isEmpty()) {
            String str2 = mapLJJJJL.get(this.s0);
            C1953307kx.LIZ.getClass();
            if (C1953307kx.LIZLLL(str2)) {
                str = str2;
            }
        }
        C621180OYa.LIZIZ.LJJLI(0, str, "reflow_video_share_list");
    }

    public final void LIZ$1() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.s0);
        Aweme aweme = (Aweme) this.l1;
        c2344009Gk.LJ(aweme != null ? Integer.valueOf(aweme.getAwemeType()) : null, "aweme_type");
        c2344009Gk.LJIIIIZZ("from_page", "graphic_detail");
        C20684815ws.LJIILLIIL("click_live_play_button", ((C2344009Gk) C1EE2.LIZIZ.LJJLIL((Aweme) this.l1, c2344009Gk)).LIZ);
    }

    public final void LIZ$2() {
        Map map = (Map) this.l1;
        String str = this.s0;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            float fFloatValue = ((Number) entry.getValue()).floatValue();
            C625530OgB.LIZ.getClass();
            C625530OgB.LIZLLL().LJIJJLI(fFloatValue, str, str2);
        }
    }

    public final void LIZ$4() throws Throwable {
        Object c098200Yq;
        C1512100pS4 c1512100pS4RunSync;
        Map<String, Float> map;
        Float f;
        Aweme aweme = (Aweme) this.l1;
        String str = this.s0;
        try {
            C0N33 c0n33 = new C0N33();
            c0n33.LJIIJ = aweme;
            AbstractC1511510pR7 abstractC1511510pR7LIZIZ = C1511420pQy.LIZ().LIZIZ(SmartPrerenderExperiment.SCENE);
            if (abstractC1511510pR7LIZIZ == null || (c1512100pS4RunSync = abstractC1511510pR7LIZIZ.runSync(c0n33)) == null || (map = c1512100pS4RunSync.LIZJ) == null || (f = map.get("lt")) == null) {
                return;
            }
            C584590MwL.LIZ.put(str, f.floatValue() >= ((Number) C0AD7.LIZ.getValue()).floatValue() ? EnumC584580MwK.FAST : EnumC584580MwK.SLOW);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null && C2200821BBo.LIZIZ) {
            throw thM5exceptionOrNullimpl;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.0Oal] */
    public final void LIZ$5() {
        final AbstractC622560ObO abstractC622560ObOLIZIZ;
        boolean zLIZIZ;
        Object c098200Yq;
        C622070Oab c622070OabLIZJ = C622190Oan.LIZ.LIZJ();
        String str = this.s0;
        synchronized (c622070OabLIZJ) {
            final String strLIZLLL = c622070OabLIZJ.LIZLLL();
            c622070OabLIZJ.LIZ.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start recoveryDatabase for dbName=");
            sbLIZ.append(strLIZLLL);
            sbLIZ.append(", reason=");
            sbLIZ.append(str);
            C622290Oax.LJFF("BulletinDBHelper", C2188811AlT.LIZIZ(sbLIZ));
            AbstractC622560ObO abstractC622560ObO = c622070OabLIZJ.LIZJ;
            if (abstractC622560ObO == null) {
                try {
                    abstractC622560ObOLIZIZ = c622070OabLIZJ.LIZIZ(c622070OabLIZJ.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c622070OabLIZJ.LIZ.LIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("recoveryDatabase exception: ");
                    sbLIZ2.append(th.getMessage());
                    C622290Oax.LIZJ("BulletinDBHelper", C2188811AlT.LIZIZ(sbLIZ2), th);
                    c622070OabLIZJ.LIZJ = abstractC622560ObO;
                    zLIZIZ = false;
                }
            } else {
                abstractC622560ObOLIZIZ = abstractC622560ObO;
            }
            try {
                abstractC622560ObOLIZIZ.close();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                c622070OabLIZJ.LIZ.LIZ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("helper close failed: ");
                sbLIZ3.append(thM5exceptionOrNullimpl.getMessage());
                C622290Oax.LIZJ("BulletinDBHelper", C2188811AlT.LIZIZ(sbLIZ3), thM5exceptionOrNullimpl);
            }
            final InterfaceC622260Oau interfaceC622260Oau = c622070OabLIZJ.LIZ;
            zLIZIZ = new Object(abstractC622560ObOLIZIZ, interfaceC622260Oau, strLIZLLL) { // from class: X.0Oal
                public final AbstractC622560ObO LIZ;
                public final InterfaceC622260Oau LIZIZ;
                public final String LIZJ;

                public final boolean LIZJ() {
                    SQLiteDatabase sQLiteDatabaseLJ;
                    boolean zLJIJI;
                    C908020Zjk c908020ZjkLJJLL;
                    try {
                        sQLiteDatabaseLJ = this.LIZ.LJ();
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        this.LIZIZ.LIZ();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Recovery reopen exception: ");
                        sbLIZ4.append(th3.getMessage());
                        C622290Oax.LIZJ("BulletinDBRecovery", C2188811AlT.LIZIZ(sbLIZ4), th3);
                        sQLiteDatabaseLJ = null;
                    }
                    if (sQLiteDatabaseLJ == null) {
                        C622160Oak.LIZJ(this.LIZJ);
                        this.LIZIZ.LIZ();
                        C622290Oax.LIZIZ("BulletinDBRecovery", "Recovery reopen failed, markFailed and return");
                        return true;
                    }
                    try {
                        c908020ZjkLJJLL = sQLiteDatabaseLJ.LJJLL("PRAGMA integrity_check", null, null);
                        try {
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                try {
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            try {
                                                C2107108Nh.LIZ(c908020ZjkLJJLL, th);
                                                throw th;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                TryCatchGuardChecker.doCheck(th);
                                                zLJIJI = false;
                                                C622160Oak.LIZJ(this.LIZJ);
                                                this.LIZIZ.LIZ();
                                                C622290Oax.LIZIZ("BulletinDBRecovery", "Recovery unhealthy; limiter markFailed");
                                                return zLJIJI;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                th = null;
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                    }
                    if (c908020ZjkLJJLL.moveToFirst()) {
                        zLJIJI = u.LJIJI(c908020ZjkLJJLL.getString(0), "ok", true);
                        C2107108Nh.LIZ(c908020ZjkLJJLL, null);
                        if (zLJIJI) {
                            String str2 = this.LIZJ;
                            C622160Oak.LIZIZ().storeInt(C622160Oak.LIZ(str2), 0);
                            C622160Oak.LIZIZ().storeLong(C622160Oak.LIZLLL(str2), System.currentTimeMillis());
                            this.LIZIZ.LIZ();
                            C622290Oax.LJFF("BulletinDBRecovery", "Recovery succeed and healthy; limiter reset");
                            return zLJIJI;
                        }
                        C622160Oak.LIZJ(this.LIZJ);
                        this.LIZIZ.LIZ();
                        C622290Oax.LIZIZ("BulletinDBRecovery", "Recovery unhealthy; limiter markFailed");
                        return zLJIJI;
                    }
                    C2107108Nh.LIZ(c908020ZjkLJJLL, null);
                    zLJIJI = false;
                    C622160Oak.LIZJ(this.LIZJ);
                    this.LIZIZ.LIZ();
                    C622290Oax.LIZIZ("BulletinDBRecovery", "Recovery unhealthy; limiter markFailed");
                    return zLJIJI;
                }

                public static boolean LIZ(String str2) {
                    if (str2 == null || str2.length() == 0) {
                        return false;
                    }
                    C0VSJ c0vsj = new C0VSJ(str2);
                    try {
                        return SQLiteDatabase.LJIILLIIL(c0vsj);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C098200Yq c098200Yq2 = new C098200Yq(th3);
                        C189200o6.m2constructorimpl(c098200Yq2);
                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) == null) {
                            return true;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(str2);
                        sbLIZ4.append("-journal");
                        C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ4));
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(str2);
                        sbLIZ5.append("-wal");
                        C0VSJ c0vsj3 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ5));
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append(str2);
                        sbLIZ6.append("-shm");
                        C0VSJ c0vsj4 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ6));
                        if (!LIZLLL(c0vsj) || !LIZLLL(c0vsj3) || !LIZLLL(c0vsj4) || !LIZLLL(c0vsj2)) {
                            return false;
                        }
                        return true;
                    }
                }

                public static boolean LIZLLL(C0VSJ c0vsj) {
                    try {
                        if (c0vsj.exists()) {
                            return c0vsj.delete();
                        }
                        return true;
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        return false;
                    }
                }

                public final boolean LIZIZ(String str2) {
                    Object c098200Yq2;
                    EnumC622250Oat enumC622250Oat;
                    String strLJJJ = this.LIZ.LJ().LJJJ();
                    this.LIZIZ.LIZ();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("recoverIfUpgradeFailed: dbKey=");
                    sbLIZ4.append(this.LIZJ);
                    sbLIZ4.append(", dbPath=");
                    sbLIZ4.append(strLJJJ);
                    sbLIZ4.append(", start");
                    C622290Oax.LIZIZ("BulletinDBRecovery", C2188811AlT.LIZIZ(sbLIZ4));
                    String str3 = this.LIZJ;
                    long j = C622160Oak.LIZIZ().getLong(C622160Oak.LIZLLL(str3), 0L);
                    int i = C622160Oak.LIZIZ().getInt(C622160Oak.LIZ(str3), 0);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (j != 0 && jCurrentTimeMillis - j < 86400000) {
                        if (i >= 3) {
                            this.LIZIZ.LIZ();
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("Recovery blocked by limiter: dbKey=");
                            sbLIZ5.append(this.LIZJ);
                            sbLIZ5.append(" exceed 3 within window");
                            C622290Oax.LIZIZ("BulletinDBRecovery", C2188811AlT.LIZIZ(sbLIZ5));
                            return false;
                        }
                    } else {
                        C622160Oak.LIZIZ().storeLong(C622160Oak.LIZLLL(str3), jCurrentTimeMillis);
                        C622160Oak.LIZIZ().storeInt(C622160Oak.LIZ(str3), 0);
                    }
                    try {
                        try {
                            this.LIZ.close();
                            c098200Yq2 = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            c098200Yq2 = new C098200Yq(th3);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                        if (thM5exceptionOrNullimpl2 != null) {
                            this.LIZIZ.LIZ();
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("close db failed: ");
                            sbLIZ6.append(thM5exceptionOrNullimpl2.getMessage());
                            C622290Oax.LIZJ("BulletinDBRecovery", C2188811AlT.LIZIZ(sbLIZ6), thM5exceptionOrNullimpl2);
                        }
                        C622210Oap c622210Oap = new C622210Oap("db_repair", this.LIZIZ);
                        boolean zLIZ = LIZ(strLJJJ);
                        if (zLIZ) {
                            enumC622250Oat = EnumC622250Oat.DB_SCENE_SUCCESS;
                        } else {
                            enumC622250Oat = EnumC622250Oat.DB_SCENE_FAIL;
                        }
                        c622210Oap.LIZ(enumC622250Oat, "", str2);
                        this.LIZIZ.LIZ();
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("deleteDbFiles result=");
                        sbLIZ7.append(zLIZ);
                        C622290Oax.LJFF("BulletinDBRecovery", C2188811AlT.LIZIZ(sbLIZ7));
                        return LIZJ();
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        C622160Oak.LIZJ(this.LIZJ);
                        this.LIZIZ.LIZ();
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("Recovery exception: ");
                        sbLIZ8.append(th4.getMessage());
                        C622290Oax.LIZJ("BulletinDBRecovery", C2188811AlT.LIZIZ(sbLIZ8), th4);
                        return false;
                    }
                }

                {
                    this.LIZ = abstractC622560ObOLIZIZ;
                    this.LIZIZ = interfaceC622260Oau;
                    this.LIZJ = strLIZLLL;
                }
            }.LIZIZ(str);
            c622070OabLIZJ.LIZ.LIZ();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("recoveryDatabase done: result=");
            sbLIZ4.append(zLIZIZ);
            C622290Oax.LJFF("BulletinDBHelper", C2188811AlT.LIZIZ(sbLIZ4));
            if (zLIZIZ) {
                c622070OabLIZJ.LIZJ = abstractC622560ObOLIZIZ;
                c622070OabLIZJ.LIZIZ = abstractC622560ObOLIZIZ.LJ();
            }
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("Recover reason=");
        sbLIZ5.append(this.s0);
        sbLIZ5.append(" ;result=");
        sbLIZ5.append(zLIZIZ);
        C622290Oax.LJFF("BulletinClientCenter", C2188811AlT.LIZIZ(sbLIZ5));
        if (!zLIZIZ) {
            ((C622210Oap) this.l1).LIZ(EnumC622250Oat.DB_SCENE_FAIL, "", this.s0);
            return;
        }
        ((C622210Oap) this.l1).LIZ(EnumC622250Oat.DB_SCENE_SUCCESS, "", null);
        InterfaceC622540ObM interfaceC622540ObM = C622190Oan.LJIIIZ;
        if (interfaceC622540ObM != null) {
            interfaceC622540ObM.LIZ();
        }
    }

    public final void LIZ$6() {
        EventParam next;
        List<EventParam> list = ((ProfileBannerInfoModel) this.l1).eventParams;
        if (list != null) {
            Iterator<EventParam> it2 = list.iterator();
            while (true) {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
                EventParam eventParam = next;
                Integer num = eventParam.type;
                if (num != null && num.intValue() == 3 && C123100dR.LIZ(eventParam.event)) {
                    break;
                }
            }
            EventParam eventParam2 = next;
            if (eventParam2 != null) {
                String str = this.s0;
                Map<String, String> map = eventParam2.bizParams;
                if (C19719512Dh.LJII(map) && map != null) {
                    map.put("disappear_reason", str);
                }
                C20684815ws.LJIILLIIL(eventParam2.event, eventParam2.bizParams);
            }
        }
    }

    public final void LIZ$3() {
        AwemeRawAd awemeRawAd;
        try {
            awemeRawAd = (AwemeRawAd) C08JS.LIZIZ().LJII(this.s0, AwemeRawAd.class);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            awemeRawAd = null;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
            awemeRawAd = null;
        }
        if (awemeRawAd == null) {
            C596490NaR.LIZJ = false;
            return;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "session_terminate", awemeRawAd);
        c1022820ciuLIZLLL.LIZ((HashMap) this.l1);
        c1022820ciuLIZLLL.LJII();
        C596490NaR.LIZJ = false;
    }

    public static final void run$0(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("DeeplinkEventHelper@3d28.reportDeeplinkEnd$runnable$1");
        try {
            aRunnableS14S1100000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DeeplinkEventHelper@3d28.reportDeeplinkEnd$runnable$1");
    }

    public static final void run$1(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("HighRecScoreCacheTrace@de57.asyncReportEvent$1");
        try {
            C20684815ws.LJIJ(aRunnableS14S1100000_9.s0, (JSONObject) aRunnableS14S1100000_9.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HighRecScoreCacheTrace@de57.asyncReportEvent$1");
    }

    public static final void run$10(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("XRequestForThirdMethodIDL@e66c.handle$1$streamResponseCallback$1$handleConnection$2");
        try {
            CompletionBlock completionBlock = (CompletionBlock) aRunnableS14S1100000_9.l1;
            String str = aRunnableS14S1100000_9.s0;
            if (str == null) {
                str = "body is null";
            }
            C2382909Vj.LIZ(completionBlock, 0, str, null, 4);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XRequestForThirdMethodIDL@e66c.handle$1$streamResponseCallback$1$handleConnection$2");
    }

    public static final void run$11(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("XDownloadFileMethod@208.handleDownloadFile$2$responseCallback$1$handleConnection$2");
        try {
            CompletionBlock completionBlock = (CompletionBlock) aRunnableS14S1100000_9.l1;
            String str = aRunnableS14S1100000_9.s0;
            if (str == null) {
                str = "body is null";
            }
            C2382909Vj.LIZ(completionBlock, 0, str, null, 4);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XDownloadFileMethod@208.handleDownloadFile$2$responseCallback$1$handleConnection$2");
    }

    public static final void run$12(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("JoinGroupBottomButtonAssem@c7e7.showToast$1");
        try {
            C1389890mGx c1389890mGx = new C1389890mGx(((JoinGroupBottomButtonAssem) aRunnableS14S1100000_9.l1).LJJIJL());
            c1389890mGx.LJIIJ(aRunnableS14S1100000_9.s0);
            c1389890mGx.LJIIJJI();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JoinGroupBottomButtonAssem@c7e7.showToast$1");
    }

    public static final void run$13(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("DoFrameBalancer@53c3.start$1");
        try {
            C0N5P.LIZ.LIZLLL(aRunnableS14S1100000_9.s0, (C0N5R) aRunnableS14S1100000_9.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DoFrameBalancer@53c3.start$1");
    }

    public static final void run$14(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("AdAppBackgroundOrExitReport@4b07.trySendSessionTerminateOnAppForeground$1");
        try {
            aRunnableS14S1100000_9.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdAppBackgroundOrExitReport@4b07.trySendSessionTerminateOnAppForeground$1");
    }

    public static final void run$15(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("FeedPlayerSourceProvider@35b7.onAnyPlayStop$$inlined$dispatchIfNeed$1");
        try {
            Iterator<T> it2 = ((C0N89) aRunnableS14S1100000_9.l1).LJ.values().iterator();
            while (it2.hasNext()) {
                ((C0N86) it2.next()).LIZIZ(((C0N89) aRunnableS14S1100000_9.l1).LJIIIZ, aRunnableS14S1100000_9.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedPlayerSourceProvider@35b7.onAnyPlayStop$$inlined$dispatchIfNeed$1");
    }

    public static final void run$16(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("FeedPlayerSourceProvider@35b7.onAnyPlaying$$inlined$dispatchIfNeed$1");
        try {
            Iterator<T> it2 = ((C0N89) aRunnableS14S1100000_9.l1).LJ.values().iterator();
            while (it2.hasNext()) {
                ((C0N86) it2.next()).LJIIIIZZ(((C0N89) aRunnableS14S1100000_9.l1).LJIIIZ, aRunnableS14S1100000_9.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedPlayerSourceProvider@35b7.onAnyPlaying$$inlined$dispatchIfNeed$1");
    }

    public static final void run$17(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("FeedPlayerSourceProvider@35b7.onAnyRenderFirstFrame$$inlined$dispatchIfNeed$1");
        try {
            Iterator<T> it2 = ((C0N89) aRunnableS14S1100000_9.l1).LJ.values().iterator();
            while (it2.hasNext()) {
                ((C0N86) it2.next()).LIZ(((C0N89) aRunnableS14S1100000_9.l1).LJIIIZ, aRunnableS14S1100000_9.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedPlayerSourceProvider@35b7.onAnyRenderFirstFrame$$inlined$dispatchIfNeed$1");
    }

    public static final void run$18(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("GeneralPlayerSourceProvider@9a26.onAnyPlaying$$inlined$dispatchIfNeed$1");
        try {
            Iterator<T> it2 = ((C0N8B) aRunnableS14S1100000_9.l1).LJ.values().iterator();
            while (it2.hasNext()) {
                ((C0N86) it2.next()).LJIIIIZZ(((C0N8B) aRunnableS14S1100000_9.l1).LJIIIZ, aRunnableS14S1100000_9.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeneralPlayerSourceProvider@9a26.onAnyPlaying$$inlined$dispatchIfNeed$1");
    }

    public static final void run$19(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("GeneralPlayerSourceProvider@9a26.onAnyRenderFirstFrame$$inlined$dispatchIfNeed$1");
        try {
            Iterator<T> it2 = ((C0N8B) aRunnableS14S1100000_9.l1).LJ.values().iterator();
            while (it2.hasNext()) {
                ((C0N86) it2.next()).LIZ(((C0N8B) aRunnableS14S1100000_9.l1).LJIIIZ, aRunnableS14S1100000_9.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeneralPlayerSourceProvider@9a26.onAnyRenderFirstFrame$$inlined$dispatchIfNeed$1");
    }

    public static final void run$2(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeLogUtil@6651.logClickLivePlayBtn$1");
        try {
            aRunnableS14S1100000_9.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeLogUtil@6651.logClickLivePlayBtn$1");
    }

    public static final void run$20(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        C0NAP c0nap = (C0NAP) aRunnableS14S1100000_9.l1;
        String str = aRunnableS14S1100000_9.s0;
        C1C7U.LIZ("VideoCoverPreloader$init$2@eba0.onDone$1L");
        c0nap.LJIIIIZZ(str);
        C1C7U.LIZIZ("VideoCoverPreloader$init$2@eba0.onDone$1L");
    }

    public static final void run$21(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        C0NAP c0nap = (C0NAP) aRunnableS14S1100000_9.l1;
        String str = aRunnableS14S1100000_9.s0;
        C1C7U.LIZ("VideoCoverPreloader$init$3@eb9f.onPlaying$1L");
        c0nap.LJII(str);
        C1C7U.LIZIZ("VideoCoverPreloader$init$3@eb9f.onPlaying$1L");
    }

    public static final void run$22(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("MiloFastScrollJudgeManager@ce65.checkAndRunSmartFastOrSlowToMilo$1");
        try {
            aRunnableS14S1100000_9.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiloFastScrollJudgeManager@ce65.checkAndRunSmartFastOrSlowToMilo$1");
    }

    public static final void run$23(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        String str = aRunnableS14S1100000_9.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS14S1100000_9.l1;
        C1C7U.LIZ("LiveHostMonitorAndLog@bdce.logV3WithSchedule$1L");
        try {
            AppLogNewUtils.LIZLLL(jSONObject, str, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C20684815ws.LJIIIIZZ(str, jSONObject);
        C1C7U.LIZIZ("LiveHostMonitorAndLog@bdce.logV3WithSchedule$1L");
    }

    public static final void run$24(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        C1C7U.LIZ("DefaultCreateGroupCallback@9456.onSuccessWithInfo$2");
        try {
            AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) aRunnableS14S1100000_9.l1;
            if (abstractC1387200mCc != null && (activityLIZIZ = abstractC1387200mCc.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(aRunnableS14S1100000_9.s0);
                c1389890mGx.LJIIJJI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultCreateGroupCallback@9456.onSuccessWithInfo$2");
    }

    public static final void run$25(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreHotCacheTraceKt@8136.asyncReportEvent$1");
        try {
            C20684815ws.LJIJ(aRunnableS14S1100000_9.s0, (JSONObject) aRunnableS14S1100000_9.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreHotCacheTraceKt@8136.asyncReportEvent$1");
    }

    public static final void run$26(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("FypFeedFetchOpt@ccf9.checkStatisticsInfo$1");
        try {
            try {
                C1387100mCS.LIZ(aRunnableS14S1100000_9.s0, (List) aRunnableS14S1100000_9.l1);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FypFeedFetchOpt@ccf9.checkStatisticsInfo$1");
    }

    public static final void run$27(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinClientCenter@3fcf.recoverDbIfNeeded$1");
        try {
            aRunnableS14S1100000_9.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinClientCenter@3fcf.recoverDbIfNeeded$1");
    }

    public static final void run$28(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileBannerReporter@6c03.recordDisappear$1");
        try {
            aRunnableS14S1100000_9.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBannerReporter@6c03.recordDisappear$1");
    }

    public static final void run$3(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("CopyContentMethod@1223.handle$1");
        try {
            Activity activityLIZ = C1388190mED.LIZ((Context) aRunnableS14S1100000_9.l1);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(aRunnableS14S1100000_9.s0);
                c1389890mGx.LJIIJJI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CopyContentMethod@1223.handle$1");
    }

    public static final void run$4(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("ShowToastMethod@72e1.handle$1$1");
        try {
            C1233040iBy c1233040iBy = new C1233040iBy((Context) aRunnableS14S1100000_9.l1);
            c1233040iBy.LIZJ(aRunnableS14S1100000_9.s0);
            c1233040iBy.LIZLLL();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShowToastMethod@72e1.handle$1$1");
    }

    public static final void run$6(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerOnReadyForDisplayHelper@ae8e.onReadyForDisplay$1");
        try {
            OnPreRenderListener onPreRenderListener = (OnPreRenderListener) aRunnableS14S1100000_9.l1;
            if (onPreRenderListener != null) {
                onPreRenderListener.onPreRenderReady(aRunnableS14S1100000_9.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerOnReadyForDisplayHelper@ae8e.onReadyForDisplay$1");
    }

    public static final void run$7(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onVideoSecondFrame$1");
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS14S1100000_9.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onVideoSecondFrame(aRunnableS14S1100000_9.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onVideoSecondFrame$1");
    }

    public static final void run$8(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        TuxTextView tuxTextViewGo;
        String strLJII;
        Long lLJIILIIL;
        C1C7U.LIZ("VibeFeedDateInfoAssem@db85.bindHistoryData$1");
        try {
            TuxTextView tuxTextViewGo2 = ((VibeFeedDateInfoAssem) aRunnableS14S1100000_9.l1).Go();
            if (tuxTextViewGo2 != null && tuxTextViewGo2.getParent() != null && (tuxTextViewGo = ((VibeFeedDateInfoAssem) aRunnableS14S1100000_9.l1).Go()) != null) {
                String str = aRunnableS14S1100000_9.s0;
                if (str == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null || (strLJII = C1575980r76.LJII(lLJIILIIL)) == null) {
                    strLJII = "";
                }
                tuxTextViewGo.setText(strLJII);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VibeFeedDateInfoAssem@db85.bindHistoryData$1");
    }

    public static final void run$9(ARunnableS14S1100000_9 aRunnableS14S1100000_9) {
        boolean zLIZ;
        C1C7U.LIZ("OfflineModeDBManager@97fc.updateScoresByAid$1");
        try {
            aRunnableS14S1100000_9.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OfflineModeDBManager@97fc.updateScoresByAid$1");
    }

    public ARunnableS14S1100000_9(String str, JSONObject jSONObject, int i) {
        this.$t = i;
        switch (i) {
            case 1:
            case 25:
                this.s0 = str;
                this.l1 = jSONObject;
                break;
            default:
                this.s0 = str;
                this.l1 = jSONObject;
                break;
        }
    }

    public ARunnableS14S1100000_9(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS14S1100000_9(C1601400rm6 c1601400rm6, C1601400rm6 c1601400rm62, List<? extends Aweme> list, String str) {
        this.$t = str;
        this.l1 = c1601400rm62;
        this.s0 = list;
    }
}

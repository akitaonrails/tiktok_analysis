package Y;

import X.C098200Yq;
import X.C0CGF;
import X.C0V5B;
import X.C0VSJ;
import X.C0WSJ;
import X.C0WYJ;
import X.C0XGI;
import X.C0XGN;
import X.C0XHH;
import X.C0XIR;
import X.C0XK5;
import X.C0XPY;
import X.C0XQ5;
import X.C0XQZ;
import X.C0XUE;
import X.C1017070cZd;
import X.C1030680cva;
import X.C1202420hOa;
import X.C1232140iAW;
import X.C1336205Ku;
import X.C1387310mCn;
import X.C1389890mGx;
import X.C1862707Rh;
import X.C189200o6;
import X.C1915720zx4;
import X.C1C7U;
import X.C1DS1;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2201941BFw;
import X.C2214201BlK;
import X.C2344009Gk;
import X.C2354709Kn;
import X.C259800zU;
import X.C736480Suk;
import X.C786410Ut5;
import X.C787900UvU;
import X.C792400V6o;
import X.C804290Vgp;
import X.C804330Vgt;
import X.C804420Vh2;
import X.C804530VhD;
import X.C810670Vr7;
import X.C813950VwP;
import X.C815220VyS;
import X.C816020Vzk;
import X.C816050Vzn;
import X.C830320Whi;
import X.C830330Whj;
import X.C830350Whl;
import X.C844470XAv;
import X.C848210XPf;
import X.C848230XPh;
import X.C848420XQa;
import X.EnumC191814102i;
import X.EnumC804170Vgd;
import X.EnumC805430Vif;
import X.InterfaceC1345705Ol;
import X.InterfaceC1915870zxJ;
import X.InterfaceC815880VzW;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.aweme.storage.StorageCleanServiceImpl;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.launcershortcut.LauncherShortcutService;
import com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.feed.platform.panel.player.PlayerComponentTemp;
import com.ss.android.ugc.profile.business.ur.ui.CropActivity;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ACallableS420S0100000_13 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case 16:
                return call$16(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        SharedPreferences sharedPreferences;
        TopViewJsonManager topViewJsonManager = (TopViewJsonManager) aCallableS420S0100000_13.l0;
        topViewJsonManager.getClass();
        C1C7U.LIZ("TopViewJsonManager@6936.delTopViewInBackground$1L");
        if (topViewJsonManager.LJFF == 0 && (sharedPreferences = topViewJsonManager.LIZJ) != null) {
            topViewJsonManager.LJFF = sharedPreferences.getLong("awesome_splash_last_clean_time", 0L);
        }
        long j = topViewJsonManager.LJFF;
        boolean z = false;
        if (j == 0 || System.currentTimeMillis() - j >= TopViewJsonManager.LJI) {
            SharedPreferences sharedPreferences2 = topViewJsonManager.LIZJ;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("awesome_splash_last_clean_time", System.currentTimeMillis()).apply();
            }
            File[] fileArrListFiles = new C0VSJ(TopViewJsonManager.LJIIIIZZ).listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.exists() && file.isFile() && System.currentTimeMillis() - file.lastModified() >= TopViewJsonManager.LJII) {
                        String name = file.getName();
                        Iterator<Map.Entry<String, Aweme>> it2 = topViewJsonManager.LIZLLL(null).entrySet().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Aweme value = it2.next().getValue();
                                if (value == null || !TextUtils.equals(value.getAid(), name)) {
                                }
                            } else {
                                file.delete();
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (topViewJsonManager.LIZLLL(null) != null && topViewJsonManager.LIZLLL(null).size() != 0) {
            HashMap map = new HashMap();
            for (String str : topViewJsonManager.LIZLLL(null).keySet()) {
                Aweme aweme = topViewJsonManager.LIZLLL(null).get(str);
                if (aweme != null) {
                    if (C1017070cZd.LLJILJILJ(aweme)) {
                        C1030680cva.LIZIZ(aweme, TopViewJsonManager.LJIIIIZZ);
                    } else {
                        map.put(str, aweme);
                    }
                }
                z = true;
            }
            if (z) {
                topViewJsonManager.LIZLLL(null).clear();
                topViewJsonManager.LIZLLL(null).putAll(map);
                topViewJsonManager.LJII();
            }
        } else {
            topViewJsonManager.LJII();
        }
        C1C7U.LIZIZ("TopViewJsonManager@6936.delTopViewInBackground$1L");
        return null;
    }

    public static final Object call$1(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        Object c098200Yq;
        boolean zLIZIZ;
        C1C7U.LIZ("LauncherShortcutService@f16f.lazyInit$1");
        LauncherShortcutService launcherShortcutService = (LauncherShortcutService) aCallableS420S0100000_13.l0;
        if (launcherShortcutService.LIZJ == null) {
            try {
                C844470XAv.LIZ.getClass();
                c098200Yq = Boolean.valueOf(C815220VyS.LJ(C844470XAv.LIZ()));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = Boolean.FALSE;
            }
            launcherShortcutService.LIZJ = (Boolean) c098200Yq;
        }
        if (Intrinsics.LJFF(((LauncherShortcutService) aCallableS420S0100000_13.l0).LIZJ, Boolean.TRUE)) {
            C816020Vzk c816020Vzk = C816020Vzk.LIZ;
            Map map = (Map) ((LauncherShortcutService) aCallableS420S0100000_13.l0).LIZIZ.getValue();
            c816020Vzk.getClass();
            if (!C1387310mCn.LJFF(C816020Vzk.LIZ().getLong("last_check_timestamp", 0L))) {
                C816020Vzk.LIZ().storeLong("last_check_timestamp", System.currentTimeMillis());
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    InterfaceC815880VzW interfaceC815880VzW = (InterfaceC815880VzW) ((Map.Entry) it2.next()).getValue();
                    C816050Vzn c816050VznLIZLLL = ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LIZLLL(interfaceC815880VzW.getType());
                    boolean z = false;
                    if (c816050VznLIZLLL != null) {
                        zLIZIZ = c816050VznLIZLLL.LIZIZ();
                    } else {
                        zLIZIZ = false;
                    }
                    String strJ4 = C786410Ut5.j4("create_%s_timestamp", Arrays.copyOf(new Object[]{interfaceC815880VzW.getType()}, 1));
                    String strJ42 = C786410Ut5.j4("create_%s_from", Arrays.copyOf(new Object[]{interfaceC815880VzW.getType()}, 1));
                    long j = C816020Vzk.LIZ().getLong(strJ4, 0L);
                    if (j > 0) {
                        z = true;
                    }
                    if (zLIZIZ) {
                        if (!z) {
                            C816020Vzk.LIZ().storeLong(strJ4, System.currentTimeMillis());
                            C816020Vzk.LIZ().storeString(strJ42, "old");
                        }
                    } else if (z) {
                        String string = C816020Vzk.LIZ().getString(strJ42, "init");
                        C816020Vzk.LIZ().storeLong(strJ4, 0L);
                        C816020Vzk.LIZ().storeString(strJ42, "init");
                        long jCurrentTimeMillis = System.currentTimeMillis() - j;
                        String strLIZLLL = interfaceC815880VzW.LIZLLL();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("shortcut_id", strLIZLLL);
                        c2344009Gk.LJIIIIZZ("enter_from", string);
                        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                        C20684815ws.LJIILLIIL("rd_feed_launcher_shortcut_delete", c2344009Gk.LIZ);
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LauncherShortcutService@f16f.lazyInit$1");
        return unit;
    }

    public static final Object call$10(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        C1C7U.LIZ("SecUidBannedNode@bd31.doSelf$1");
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(topActivity);
            c1389890mGx.LJIIJ(((C0XK5) aCallableS420S0100000_13.l0).LIZ.LIZIZ);
            c1389890mGx.LJIIJJI();
        }
        C1C7U.LIZIZ("SecUidBannedNode@bd31.doSelf$1");
        return null;
    }

    public static final Object call$11(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        Bundle bundle = (Bundle) aCallableS420S0100000_13.l0;
        C1C7U.LIZ("UserUtils@bfa1.refreshAwemeUser$1L");
        try {
            C0XQ5.LIZ().LJJIJIL();
            C848230XPh.LL.getClass();
            boolean zLJI = MethodIDManager.LJI(202453);
            String str = C0XHH.LIZ;
            User userLIZ = C0XHH.LIZ(((IAccountHelperService) C0XPY.LIZIZ(IAccountHelperService.class)).selfUserApi(), true, false);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            int ageGatePostAction = userLIZ.getAgeGatePostAction();
            EnumC191814102i enumC191814102i = EnumC191814102i.PASS;
            if (ageGatePostAction == enumC191814102i.getValue()) {
                int i = bundle.getInt("age_gate_post_action", -1);
                if (i != -1) {
                    userLIZ.setAgeGatePostAction(i);
                    userLIZ.setAgeGateAction(enumC191814102i.getValue());
                    String uid = userLIZ.getUid();
                    SharedPreferences.Editor editorEdit = C0XQZ.LIZ().edit();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ftc_age_gate_response_mode");
                    sbLIZ.append(uid);
                    editorEdit.putInt(C2188811AlT.LIZIZ(sbLIZ), i).apply();
                    C1862707Rh.LIZ.put(userLIZ.getUid(), Integer.valueOf(i));
                } else {
                    int iLIZ = C1862707Rh.LIZ(userLIZ.getUid());
                    if (iLIZ != -1) {
                        userLIZ.setAgeGatePostAction(iLIZ);
                        userLIZ.setAgeGateAction(enumC191814102i.getValue());
                    }
                }
            }
            if (userLIZ.getUserMode() == 0) {
                SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C0XPY.LIZIZ, 0, "aweme_user");
                int i2 = bundle.getInt("user_mode", -1);
                if (i2 != 2 && i2 != 1) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ftc_user_mode_prefix_");
                    sbLIZ2.append(userLIZ.getUid());
                    int i3 = sharedPreferencesLIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0);
                    if (i3 == 2 || i3 == 1) {
                        userLIZ.setUserMode(i3);
                    }
                } else {
                    userLIZ.setUserMode(i2);
                    SharedPreferences.Editor editorEdit2 = sharedPreferencesLIZJ.edit();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("ftc_user_mode_prefix_");
                    sbLIZ3.append(userLIZ.getUid());
                    editorEdit2.putInt(C2188811AlT.LIZIZ(sbLIZ3), i2).commit();
                }
            }
            C0XUE c0xue = C0XUE.LIZ;
            c0xue.LJIILJJIL(userLIZ);
            List<BaseLoginMethod> listLJ = c0xue.LJ(userLIZ.getUid());
            if (!((ArrayList) listLJ).isEmpty() && ListProtector.get(listLJ, 0) != null) {
                C848210XPf.LIZ((BaseLoginMethod) ListProtector.get(listLJ, 0), null);
            }
            C1C7U.LIZIZ("UserUtils@bfa1.refreshAwemeUser$1L");
            return userLIZ;
        } catch (C0XIR e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public static final Object call$12(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        C804530VhD c804530VhD = (C804530VhD) aCallableS420S0100000_13.l0;
        c804530VhD.getClass();
        C1C7U.LIZ("NetworkTypeParser@e78b.updateNetwork$1L");
        C844470XAv.LIZ.getClass();
        c804530VhD.LIZ = C804420Vh2.LJ(C844470XAv.LIZ());
        C1C7U.LIZIZ("NetworkTypeParser@e78b.updateNetwork$1L");
        return null;
    }

    public static final Object call$13(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        int iLIZ;
        User user = (User) aCallableS420S0100000_13.l0;
        C1C7U.LIZ("AccountUserChangeListener@dc67.onChanged$1L");
        synchronized (C848420XQa.class) {
            try {
                C0CGF c0cgf = new C0CGF();
                int i = 1;
                if (user.getUserMode() == 0) {
                    String uid = user.getUid();
                    SharedPreferences sharedPreferences = c0cgf.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ftc_user_mode_prefix_");
                    sbLIZ.append(uid);
                    int i2 = sharedPreferences.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
                    if (i2 == 2 || i2 == 1) {
                        user.setUserMode(i2);
                    }
                }
                int ageGatePostAction = user.getAgeGatePostAction();
                EnumC191814102i enumC191814102i = EnumC191814102i.PASS;
                if (ageGatePostAction == enumC191814102i.getValue() && (iLIZ = C1862707Rh.LIZ(user.getUid())) != -1) {
                    user.setAgeGatePostAction(iLIZ);
                    user.setAgeGateAction(enumC191814102i.getValue());
                }
                int ageGatePostAction2 = user.getAgeGatePostAction();
                EnumC191814102i enumC191814102i2 = EnumC191814102i.US_FTC;
                if (ageGatePostAction2 == enumC191814102i2.getValue()) {
                    ComplianceServiceProvider.LIZLLL().LJIILJJIL(C2214201BlK.LJFF());
                }
                Bundle bundle = new Bundle();
                bundle.putInt("user_mode", user.getUserMode());
                bundle.putInt("user_period", user.getUserPeriod());
                if (user.getAgeGatePostAction() != enumC191814102i2.getValue()) {
                    i = 0;
                }
                bundle.putInt("is_kids_mode", i);
                AppLog.setCustomerHeader(bundle);
                try {
                    InterfaceC1345705Ol imUserService = C1336205Ku.LIZ(false).getImUserService();
                    IMUser.Companion.getClass();
                    imUserService.LJIILIIL(C2201941BFw.LIZJ(user));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        C1C7U.LIZIZ("AccountUserChangeListener@dc67.onChanged$1L");
        return null;
    }

    public static final Object call$14(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        Boolean boolValueOf;
        C1C7U.LIZ("PNSConsentClient@ddc1.unregisterConsentStatusListener$1");
        InterfaceC1915870zxJ interfaceC1915870zxJ = (InterfaceC1915870zxJ) aCallableS420S0100000_13.l0;
        synchronized (C1915720zx4.class) {
            try {
                boolValueOf = Boolean.valueOf(C1915720zx4.LJ.remove(interfaceC1915870zxJ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("PNSConsentClient@ddc1.unregisterConsentStatusListener$1");
        return boolValueOf;
    }

    public static final Object call$15(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        Activity activity = (Activity) aCallableS420S0100000_13.l0;
        C1C7U.LIZ("BattertyLifeCycle@8310.onActivityPaused$1L");
        String simpleName = activity.getClass().getSimpleName();
        if (C792400V6o.LIZ != null) {
            C787900UvU.LIZ.LIZJ(new ARunnableS8S1000000_13(simpleName, 15));
        } else {
            C0V5B.LIZ("apm_debug", "ApmAgent#stopCollectCurrent  apm do not be init");
        }
        C1C7U.LIZIZ("BattertyLifeCycle@8310.onActivityPaused$1L");
        return null;
    }

    public static final Object call$16(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        Activity activity = (Activity) aCallableS420S0100000_13.l0;
        C1C7U.LIZ("BattertyLifeCycle@8310.onActivityResumed$1L");
        String simpleName = activity.getClass().getSimpleName();
        if (C792400V6o.LIZ != null) {
            C787900UvU.LIZ.LIZJ(new ARunnableS8S1000000_13(simpleName, 14));
        } else {
            C0V5B.LIZ("apm_debug", "ApmAgent#startCollectCurrent  apm do not be init");
        }
        C1C7U.LIZIZ("BattertyLifeCycle@8310.onActivityResumed$1L");
        return null;
    }

    public static final Object call$2(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        C1C7U.LIZ("ColdBootLogger@85ca.report$7");
        AppLogNewUtils.onEventV3("first_feed_show_time_v3", (JSONObject) aCallableS420S0100000_13.l0);
        if (C1DS1.LIZJ) {
            long j = JSONObjectProtectorUtils.getLong((JSONObject) aCallableS420S0100000_13.l0, "app_launch_to_app_init");
            if (j > 0 && j < 20000 && JSONObjectProtectorUtils.getLong((JSONObject) aCallableS420S0100000_13.l0, "feed_total_v3") > ((Number) C1DS1.LIZLLL.getValue()).longValue()) {
                C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.FEED_FORYOU_5VV, EnumC804170Vgd.FEED_FORYOU_5VV_FIRST_FEED_SLOW, null, 0L, 28));
            }
        }
        if (PumbaaPerformanceTrackManager.LJI()) {
            PumbaaPerformanceTrackManager.LJIIJ.getValue();
            C0WSJ.LIZIZ(true);
        }
        C1C7U.LIZIZ("ColdBootLogger@85ca.report$7");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0151 A[Catch: all -> 0x0252, TryCatch #0 {all -> 0x0252, blocks: (B:19:0x0063, B:20:0x006d, B:22:0x0074, B:24:0x0083, B:26:0x0087, B:28:0x0099, B:29:0x00c6, B:30:0x00cb, B:32:0x00d7, B:33:0x00e1, B:35:0x00ed, B:37:0x00f9, B:39:0x010d, B:49:0x0148, B:51:0x0151, B:53:0x0159, B:55:0x015f, B:57:0x0198, B:58:0x019e, B:59:0x01a8, B:61:0x01ae, B:64:0x01be, B:66:0x01c2, B:68:0x01d4, B:69:0x0201, B:71:0x020a, B:73:0x0216, B:74:0x0220, B:76:0x022c, B:70:0x0204, B:77:0x0236, B:78:0x023a, B:80:0x0240, B:40:0x0116, B:42:0x0122, B:43:0x0129, B:45:0x0135, B:47:0x0142), top: B:90:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0198 A[Catch: all -> 0x0252, TryCatch #0 {all -> 0x0252, blocks: (B:19:0x0063, B:20:0x006d, B:22:0x0074, B:24:0x0083, B:26:0x0087, B:28:0x0099, B:29:0x00c6, B:30:0x00cb, B:32:0x00d7, B:33:0x00e1, B:35:0x00ed, B:37:0x00f9, B:39:0x010d, B:49:0x0148, B:51:0x0151, B:53:0x0159, B:55:0x015f, B:57:0x0198, B:58:0x019e, B:59:0x01a8, B:61:0x01ae, B:64:0x01be, B:66:0x01c2, B:68:0x01d4, B:69:0x0201, B:71:0x020a, B:73:0x0216, B:74:0x0220, B:76:0x022c, B:70:0x0204, B:77:0x0236, B:78:0x023a, B:80:0x0240, B:40:0x0116, B:42:0x0122, B:43:0x0129, B:45:0x0135, B:47:0x0142), top: B:90:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ae A[Catch: all -> 0x0252, TryCatch #0 {all -> 0x0252, blocks: (B:19:0x0063, B:20:0x006d, B:22:0x0074, B:24:0x0083, B:26:0x0087, B:28:0x0099, B:29:0x00c6, B:30:0x00cb, B:32:0x00d7, B:33:0x00e1, B:35:0x00ed, B:37:0x00f9, B:39:0x010d, B:49:0x0148, B:51:0x0151, B:53:0x0159, B:55:0x015f, B:57:0x0198, B:58:0x019e, B:59:0x01a8, B:61:0x01ae, B:64:0x01be, B:66:0x01c2, B:68:0x01d4, B:69:0x0201, B:71:0x020a, B:73:0x0216, B:74:0x0220, B:76:0x022c, B:70:0x0204, B:77:0x0236, B:78:0x023a, B:80:0x0240, B:40:0x0116, B:42:0x0122, B:43:0x0129, B:45:0x0135, B:47:0x0142), top: B:90:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2 A[Catch: all -> 0x0252, TryCatch #0 {all -> 0x0252, blocks: (B:19:0x0063, B:20:0x006d, B:22:0x0074, B:24:0x0083, B:26:0x0087, B:28:0x0099, B:29:0x00c6, B:30:0x00cb, B:32:0x00d7, B:33:0x00e1, B:35:0x00ed, B:37:0x00f9, B:39:0x010d, B:49:0x0148, B:51:0x0151, B:53:0x0159, B:55:0x015f, B:57:0x0198, B:58:0x019e, B:59:0x01a8, B:61:0x01ae, B:64:0x01be, B:66:0x01c2, B:68:0x01d4, B:69:0x0201, B:71:0x020a, B:73:0x0216, B:74:0x0220, B:76:0x022c, B:70:0x0204, B:77:0x0236, B:78:0x023a, B:80:0x0240, B:40:0x0116, B:42:0x0122, B:43:0x0129, B:45:0x0135, B:47:0x0142), top: B:90:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01be A[EDGE_INSN: B:94:0x01be->B:64:0x01be BREAK  A[LOOP:1: B:59:0x01a8->B:96:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$3(Y.ACallableS420S0100000_13 r14) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS420S0100000_13.call$3(Y.ACallableS420S0100000_13):java.lang.Object");
    }

    public static final Object call$4(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        C1C7U.LIZ("UserModuleContext@ac18.accountUserClear$1");
        C0XGI.LIZ("");
        ((C0XGN) aCallableS420S0100000_13.l0).getClass();
        C0XGN.LIZ();
        C1C7U.LIZIZ("UserModuleContext@ac18.accountUserClear$1");
        return null;
    }

    public static final Object call$5(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        C1C7U.LIZ("ThreadExtKt@e20.runOnUIThread$1");
        ((Function0) aCallableS420S0100000_13.l0).invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ThreadExtKt@e20.runOnUIThread$1");
        return unit;
    }

    public static final Object call$6(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        C1C7U.LIZ("PlayerComponentTemp@cc75.onPause$2");
        long jElapsedRealtime = SystemClock.elapsedRealtime() - ((PlayerComponentTemp) aCallableS420S0100000_13.l0).LLJJ;
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("video_request_leave");
        mobClickObtain.setLabelName("perf_monitor");
        C736480Suk c736480Suk = new C736480Suk();
        c736480Suk.LIZ("duration", String.valueOf(jElapsedRealtime));
        mobClickObtain.setJsonObject(c736480Suk.LIZIZ());
        C20684815ws.onEvent(mobClickObtain);
        C1C7U.LIZIZ("PlayerComponentTemp@cc75.onPause$2");
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlin.Pair] */
    public static final Object call$7(ACallableS420S0100000_13 aCallableS420S0100000_13) throws InterruptedException {
        Object objLLZZZIL;
        C1C7U.LIZ("CropActivity@51a9.bindViewById$9$1");
        CropActivity cropActivity = (CropActivity) aCallableS420S0100000_13.l0;
        Application applicationLIZ = C1202420hOa.LIZ();
        cropActivity.getClass();
        if (C830320Whi.LIZIZ) {
            objLLZZZIL = cropActivity.LLZZZIL();
        } else {
            new C0VSJ(C2354709Kn.LJIIL("profileHeader"), "profileHeaderCrop.png");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = new Pair(null, 0);
            SettingsManager.LIZLLL().getClass();
            int iLJ = SettingsManager.LJ("clear_storage_available_space_minimum_limitation", 1048576);
            long jLJFF = C0WYJ.LJFF(applicationLIZ);
            if (jLJFF < iLJ) {
                C1232140iAW.LIZ.getClass();
                C1232140iAW.LIZJ(applicationLIZ, "checkAndHandleSaveFile storage low", null, null, jLJFF, null);
                StorageCleanServiceImpl.LIZJ().LIZIZ(applicationLIZ, new C830330Whj(applicationLIZ, new C830350Whl(c259800zU, cropActivity, applicationLIZ, countDownLatch)));
                countDownLatch.await();
                objLLZZZIL = c259800zU.element;
            } else {
                objLLZZZIL = cropActivity.LLZZZIL();
            }
        }
        C1C7U.LIZIZ("CropActivity@51a9.bindViewById$9$1");
        return objLLZZZIL;
    }

    public static final Object call$8(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        C1C7U.LIZ("PushCacheLoader@974.preloadCacheAsync$1");
        C813950VwP c813950VwP = C813950VwP.LIZ;
        Aweme aweme = (Aweme) aCallableS420S0100000_13.l0;
        c813950VwP.getClass();
        FeedCommonService feedCommonService = (FeedCommonService) PluggableExtentionKt.pluggableSpi$default(FeedCommonService.class, false, false, false, 14, null);
        if (feedCommonService != null) {
            feedCommonService.LJIJI(aweme);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushCacheLoader@974.preloadCacheAsync$1");
        return unit;
    }

    public static final Object call$9(ACallableS420S0100000_13 aCallableS420S0100000_13) {
        C1C7U.LIZ("UserApiPresenter@8386.updateUserInfo$1");
        String str = C0XHH.LIZ;
        UserResponse userResponseLIZIZ = C0XHH.LIZIZ((Map) aCallableS420S0100000_13.l0);
        C1C7U.LIZIZ("UserApiPresenter@8386.updateUserInfo$1");
        return userResponseLIZIZ;
    }

    public ACallableS420S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

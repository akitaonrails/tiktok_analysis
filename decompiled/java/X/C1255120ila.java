package X;

import Y.AfS45S1200000_19;
import Y.AfS51S1100000_19;
import android.app.Activity;
import androidx.lifecycle.Observer;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.account.settings.SaveLoginInfoPopupFrequencyModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ila, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255120ila {
    public static boolean LIZIZ;
    public static final C1255120ila LIZ = new C1255120ila();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(795));

    public static Keva LIZIZ() {
        return (Keva) LIZJ.getValue();
    }

    public static void LIZLLL() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("user_id", C0XQ5.LIZIZ.LJIIJ().getCurUserId());
        c2344009Gk.LJIIIIZZ("enter_from", "login");
        C20684815ws.LJIILLIIL("remember_login_info_notify", c2344009Gk.LIZ);
    }

    public static void LJ() {
        LIZIZ().storeLong("key_last_show_time", System.currentTimeMillis());
        LIZIZ().storeInt("key_show_count", LIZIZ().getInt("key_show_count", 0) + 1);
    }

    public static boolean LJFF() {
        Activity activityLJFF;
        C19EG c19egLIZIZ;
        JSONObject jSONObject;
        Long lValueOf;
        if (C10EU.LJIILIIL()) {
            return false;
        }
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        if ((iAccountUserService != null && Intrinsics.LJFF(iAccountUserService.LJFF(), Boolean.TRUE)) || (activityLJFF = C2214201BlK.LJFF()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF)) == null || c19egLIZIZ.isFinishing()) {
            return false;
        }
        IOneClickLoginService iOneClickLoginService = (IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class);
        if (iOneClickLoginService.LJIILLIIL() && iOneClickLoginService.LJIIJJI()) {
            return false;
        }
        long jLongValue = -1;
        long days = LIZIZ().getLong("key_last_show_time", -1L);
        if (days > 0) {
            days = TimeUnit.MILLISECONDS.toDays(days);
        }
        int i = LIZIZ().getInt("key_show_count", 0);
        C0XO3 c0xo3LIZIZ = C0XGI.LIZIZ();
        if (c0xo3LIZIZ != null && (jSONObject = c0xo3LIZIZ.LJJII) != null && (lValueOf = Long.valueOf(jSONObject.optInt("user_create_time", -1))) != null) {
            jLongValue = lValueOf.longValue();
            if (jLongValue > 0) {
                jLongValue = TimeUnit.SECONDS.toDays(jLongValue);
            }
        }
        SaveLoginInfoPopupFrequencyModel saveLoginInfoPopupFrequencyModelLIZ = C1255170ilf.LIZ();
        long days2 = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis());
        if (jLongValue > 0 && days2 - jLongValue <= saveLoginInfoPopupFrequencyModelLIZ.new_user_exemption) {
            return false;
        }
        if (days <= 0 || days2 - days >= saveLoginInfoPopupFrequencyModelLIZ.interval) {
            return i < saveLoginInfoPopupFrequencyModelLIZ.max_count;
        }
        LIZJ("block_by_interval");
        return false;
    }

    public static void LIZJ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("reason", str);
        c2344009Gk.LJIIIIZZ("extra", "");
        C20684815ws.LJIILLIIL("not_show_save_info_dialog_after_login", c2344009Gk.LIZ);
    }

    public static void LJI(final String str, final Function0 function0, final Function0 function02) {
        int iIntValue;
        JSONObject jSONObject;
        Long lValueOf;
        if (C10EU.LJIILIIL()) {
            function02.invoke();
            return;
        }
        if (!LIZIZ) {
            LIZIZ = true;
            if (LJFF()) {
                SaveLoginInfoPopupFrequencyModel saveLoginInfoPopupFrequencyModelLIZ = C1255170ilf.LIZ();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = LIZIZ().getLong("key_last_show_attempt_time", 0L);
                Integer num = saveLoginInfoPopupFrequencyModelLIZ.minHoursBetweenAttempts;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 24;
                }
                if (TimeUnit.HOURS.toMillis(iIntValue) > jCurrentTimeMillis - j) {
                    LIZJ("block_by_attempt_interval");
                    function02.invoke();
                    LIZIZ = false;
                    return;
                }
                LIZIZ().storeLong("key_last_show_attempt_time", jCurrentTimeMillis);
                C0XO3 c0xo3LIZIZ = C0XGI.LIZIZ();
                if (c0xo3LIZIZ != null && (jSONObject = c0xo3LIZIZ.LJJII) != null && (lValueOf = Long.valueOf(jSONObject.optInt("user_create_time", -1))) != null && lValueOf.longValue() >= 0) {
                    LJII(str, function0, function02);
                    return;
                } else {
                    C0XIH.LIZIZ().LIZ("ocl", new C0XIE() { // from class: X.0ilb
                        @Override // X.C0XH7
                        public final void LJI(C0XGA c0xga) {
                            long days;
                            JSONObject jSONObject2;
                            C0XZV c0xzv = (C0XZV) c0xga;
                            if (c0xzv == null) {
                                function02.invoke();
                                C1255120ila.LIZIZ = false;
                                return;
                            }
                            C0XO3 c0xo3 = c0xzv.LJIIIZ;
                            if (c0xo3 != null && (jSONObject2 = c0xo3.LJJII) != null) {
                                int iOptInt = jSONObject2.optInt("user_create_time", -1);
                                if (iOptInt > 0) {
                                    days = TimeUnit.SECONDS.toDays(iOptInt);
                                } else {
                                    days = iOptInt;
                                }
                            } else {
                                days = -1;
                            }
                            long days2 = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis());
                            SaveLoginInfoPopupFrequencyModel saveLoginInfoPopupFrequencyModelLIZ2 = C1255170ilf.LIZ();
                            if (days < 0) {
                                function02.invoke();
                                C1255120ila.LIZIZ = false;
                                return;
                            }
                            C0XO3 c0xo32 = c0xzv.LJIIIZ;
                            if (c0xo32 != null) {
                                C0XGI.LIZ(C786410Ut5.J3(c0xo32.LJJIII));
                            }
                            if (days2 - days <= saveLoginInfoPopupFrequencyModelLIZ2.new_user_exemption) {
                                function02.invoke();
                                C1255120ila.LIZIZ = false;
                                return;
                            }
                            C1255120ila c1255120ila = C1255120ila.LIZ;
                            String str2 = str;
                            Function0<Unit> function03 = function0;
                            Function0<Unit> function04 = function02;
                            c1255120ila.getClass();
                            C1255120ila.LJII(str2, function03, function04);
                        }

                        @Override // X.C0XH7
                        public final void LJ(C0XGA c0xga, int i) {
                            function02.invoke();
                            C1255120ila.LIZIZ = false;
                        }
                    });
                    return;
                }
            }
            LIZIZ = false;
            function02.invoke();
        }
    }

    public static void LJII(final String str, final Function0 function0, final Function0 function02) {
        final C19EG c19egLIZIZ;
        final IOneClickLoginService iOneClickLoginService = (IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class);
        if (iOneClickLoginService.LJIILLIIL()) {
            if (iOneClickLoginService.LJIIJJI()) {
                function02.invoke();
                LIZIZ = false;
                return;
            } else {
                LJIIIIZZ(str, function0, function02);
                return;
            }
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF)) != null) {
            iOneClickLoginService.LJIIZILJ().observe(c19egLIZIZ, new Observer() { // from class: X.0ilc
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    if (obj != C0XHP.NOT_READY) {
                        iOneClickLoginService.LJIIZILJ().removeObservers(c19egLIZIZ);
                        if (iOneClickLoginService.LJIIJJI()) {
                            function02.invoke();
                            C1255120ila.LIZIZ = false;
                            return;
                        }
                        C1255120ila c1255120ila = C1255120ila.LIZ;
                        String str2 = str;
                        Function0<Unit> function03 = function0;
                        Function0<Unit> function04 = function02;
                        c1255120ila.getClass();
                        C1255120ila.LJIIIIZZ(str2, function03, function04);
                    }
                }
            });
        }
    }

    public static void LJIIIIZZ(String str, Function0 function0, Function0 function02) {
        C0XZ4.LIZ.getClass();
        HashMap map = new HashMap();
        map.put(Scene.SCENE_SERVICE, "");
        map.put("target", "enable_cloud_token_login");
        C1239250iLz.LIZ("/passport/shark/safe_verify/", map).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIIZILJ(new AfS45S1200000_19(function0, str, function02, 3), new AfS51S1100000_19(function02, str, 2));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.0XWD] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, X.0XWD] */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, X.0XWD] */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, X.0XWD] */
    public static C1397510mTF LIZ(int i, C19EG c19eg, String str, Function0 function0) {
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(c19eg);
        User curUser = C0XQ5.LIZIZ.LJIIJ().getCurUser();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C0XWD.DEFAULT;
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(curUser.getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LJJ(smartAvatarImageView);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        C929103k9.LIZ(c1397580mTM, smartAvatarImageView, null);
        c1397580mTM.LJII = false;
        String strCQ2 = C343710Ddh.LIZ(C1388190mED.LIZIZ(c19eg)).CQ2();
        if (strCQ2 != null) {
            int iHashCode = strCQ2.hashCode();
            if (iHashCode != -1382453013) {
                if (iHashCode != 2223327) {
                    if (iHashCode == 2614219 && strCQ2.equals("USER")) {
                        c259800zU.element = C0XWD.PROFILE_POP_UP;
                    }
                } else if (strCQ2.equals("HOME")) {
                    c259800zU.element = C0XWD.FYP_POP_UP;
                }
            } else if (strCQ2.equals("NOTIFICATION")) {
                c259800zU.element = C0XWD.INBOX_POP_UP;
            }
        }
        c1397580mTM.LJFF(2131838737);
        UserStore.LIZ.getClass();
        c1397580mTM.LIZIZ(c19eg.getString(2131838736, UserStore.LIZJ(false).getUniqueId()));
        C985403tE.LIZ(c1397580mTM, new C852090Xbj(str, i, c259800zU, c19eg, function0));
        c1397580mTM.LJ(new C0XXO(str, i));
        return new C1397510mTF(c1397580mTM);
    }
}

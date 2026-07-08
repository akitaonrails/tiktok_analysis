package X;

import Y.ARunnableS119S0100000_19;
import Y.ARunnableS88S0200000_19;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailBindSheetFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneBindSheetFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0j3K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266120j3K implements C0XTR {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C0XTR
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                break;
            case 1:
                onResult$1(this, i, i2, obj);
                break;
            case 2:
                onResult$2(this, i, i2, obj);
                break;
            case 3:
                onResult$3(this, i, i2, obj);
                break;
            case 4:
                onResult$4(this, i, i2, obj);
                break;
            case 5:
                onResult$5(this, i, i2, obj);
                break;
            case 6:
                onResult$6(this, i, i2, obj);
                break;
            case 7:
                onResult$7(this, i, i2, obj);
                break;
            case 8:
                onResult$8(this, i, i2, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onResult$9(this, i, i2, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onResult$10(this, i, i2, obj);
                break;
        }
    }

    public C1266120j3K(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onResult$0(C1266120j3K c1266120j3K, int i, int i2, Object obj) {
        if (i2 == 1) {
            ((C19EG) c1266120j3K.l0).runOnUiThread(new ARunnableS88S0200000_19(obj, (EmailBindSheetFragment) c1266120j3K.l1, 4));
        }
    }

    public static final void onResult$1(C1266120j3K c1266120j3K, int i, int i2, Object obj) {
        if ((i == 7 || i == 20) && i2 == 1) {
            ((C19EG) c1266120j3K.l0).runOnUiThread(new ARunnableS119S0100000_19((PhoneBindSheetFragment) c1266120j3K.l1, 142));
        }
    }

    public static final void onResult$10(C1266120j3K c1266120j3K, int i, int i2, Object obj) {
        String string;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String enterFrom = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterFrom();
            String enterMethod = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterMethod();
            c1233960iDS.getClass();
            C1233960iDS.LIZLLL(enterFrom, enterMethod, "email", true);
            Function1 function1 = (Function1) c1266120j3K.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (string = baseBundle.getString("ticket")) == null) {
                string = "";
            }
            function1.invoke(new C1234050iDb(string, "email_verify"));
            return;
        }
        C1233960iDS c1233960iDS2 = C1233960iDS.LIZ;
        String enterFrom2 = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterFrom();
        String enterMethod2 = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterMethod();
        c1233960iDS2.getClass();
        C1233960iDS.LIZLLL(enterFrom2, enterMethod2, "email", false);
        TwoStepVerificationActivityViewModel.xQ2((TwoStepVerificationActivityViewModel) c1266120j3K.l0, 0, null, 6);
    }

    public static final void onResult$2(C1266120j3K c1266120j3K, int i, int i2, Object obj) {
        if (i == 7 && i2 == 1) {
            ((C20515215Pi) c1266120j3K.l0).LIZIZ();
            BaseMyProfileGuideWidget baseMyProfileGuideWidget = (BaseMyProfileGuideWidget) c1266120j3K.l1;
            baseMyProfileGuideWidget.getClass();
            C1389890mGx c1389890mGx = new C1389890mGx(C1745060vVo.LIZ(baseMyProfileGuideWidget));
            c1389890mGx.LJIIIZ(2131827391);
            c1389890mGx.LJIIJJI();
            BaseMyProfileGuideWidget baseMyProfileGuideWidget2 = (BaseMyProfileGuideWidget) c1266120j3K.l1;
            baseMyProfileGuideWidget2.getClass();
            C19EG c19egLIZ = C1745060vVo.LIZ(baseMyProfileGuideWidget2);
            if (!C1076010e6h.LIZJ.LJIIJ().LIZJ()) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19egLIZ), C0PEM.LIZJ, null, new C757490TnX(c19egLIZ, null), 2);
            }
        }
    }

    public static final void onResult$3(C1266120j3K c1266120j3K, int i, int i2, Object obj) {
        C1233790iDB c1233790iDB;
        BaseBundle baseBundle;
        int i3;
        if (i2 == 1) {
            if ((obj instanceof Bundle) && (baseBundle = (BaseBundle) obj) != null && (i3 = baseBundle.getInt("error_code")) != 0) {
                TwoStepVerificationActivityViewModel.xQ2((TwoStepVerificationActivityViewModel) c1266120j3K.l0, Integer.valueOf(i3), null, 6);
                return;
            }
            Map<EnumC1233840iDG, C1233790iDB> map = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).LLILZLL;
            EnumC1233840iDG enumC1233840iDG = EnumC1233840iDG.TOTP;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            C1233790iDB c1233790iDB2 = (C1233790iDB) linkedHashMap.get(enumC1233840iDG);
            if (c1233790iDB2 != null) {
                c1233790iDB = C1233790iDB.LIZ(c1233790iDB2, true, false, null, false, false, 62);
            } else {
                c1233790iDB = new C1233790iDB(true, false, enumC1233840iDG, null, false, false, 58);
            }
            linkedHashMap.put(enumC1233840iDG, c1233790iDB);
            ((Function1) c1266120j3K.l1).invoke(null);
            return;
        }
        TwoStepVerificationActivityViewModel.xQ2((TwoStepVerificationActivityViewModel) c1266120j3K.l0, 0, null, 6);
    }

    public static final void onResult$4(C1266120j3K c1266120j3K, int i, int i2, Object obj) {
        C1233790iDB c1233790iDB;
        BaseBundle baseBundle;
        int i3;
        if (i2 == 1) {
            if ((obj instanceof Bundle) && (baseBundle = (BaseBundle) obj) != null && (i3 = baseBundle.getInt("error_code")) != 0) {
                TwoStepVerificationActivityViewModel.xQ2((TwoStepVerificationActivityViewModel) c1266120j3K.l0, Integer.valueOf(i3), null, 6);
                return;
            }
            Map<EnumC1233840iDG, C1233790iDB> map = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).LLILZLL;
            EnumC1233840iDG enumC1233840iDG = EnumC1233840iDG.TOTP;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            C1233790iDB c1233790iDB2 = (C1233790iDB) linkedHashMap.get(enumC1233840iDG);
            if (c1233790iDB2 != null) {
                c1233790iDB = C1233790iDB.LIZ(c1233790iDB2, true, false, null, false, false, 62);
            } else {
                c1233790iDB = new C1233790iDB(true, false, enumC1233840iDG, null, false, false, 58);
            }
            linkedHashMap.put(enumC1233840iDG, c1233790iDB);
            ((Function1) c1266120j3K.l1).invoke(null);
            return;
        }
        TwoStepVerificationActivityViewModel.xQ2((TwoStepVerificationActivityViewModel) c1266120j3K.l0, 0, null, 6);
    }

    public static final void onResult$5(C1266120j3K c1266120j3K, int i, int i2, Object obj) {
        C1233790iDB c1233790iDB;
        String string;
        BaseBundle baseBundle;
        if (i2 == 1) {
            Map<EnumC1233840iDG, C1233790iDB> map = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).LLILZLL;
            EnumC1233840iDG enumC1233840iDG = EnumC1233840iDG.TOTP;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            C1233790iDB c1233790iDB2 = (C1233790iDB) linkedHashMap.get(enumC1233840iDG);
            if (c1233790iDB2 != null) {
                c1233790iDB = C1233790iDB.LIZ(c1233790iDB2, true, false, null, false, false, 62);
            } else {
                c1233790iDB = new C1233790iDB(true, false, enumC1233840iDG, null, false, false, 58);
            }
            linkedHashMap.put(enumC1233840iDG, c1233790iDB);
            Function1 function1 = (Function1) c1266120j3K.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (string = baseBundle.getString("ticket")) == null) {
                string = "";
            }
            function1.invoke(string);
            return;
        }
        TwoStepVerificationActivityViewModel.xQ2((TwoStepVerificationActivityViewModel) c1266120j3K.l0, 0, null, 6);
    }

    public static final void onResult$6(C1266120j3K c1266120j3K, int i, int i2, Object obj) {
        String string;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String enterFrom = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterFrom();
            String enterMethod = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterMethod();
            c1233960iDS.getClass();
            C1233960iDS.LIZLLL(enterFrom, enterMethod, "password", true);
            Function1 function1 = (Function1) c1266120j3K.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (string = baseBundle.getString("ticket")) == null) {
                string = "";
            }
            function1.invoke(new C1234050iDb(string, "pwd_verify"));
            return;
        }
        C1233960iDS c1233960iDS2 = C1233960iDS.LIZ;
        String enterFrom2 = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterFrom();
        String enterMethod2 = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterMethod();
        c1233960iDS2.getClass();
        C1233960iDS.LIZLLL(enterFrom2, enterMethod2, "password", false);
        TwoStepVerificationActivityViewModel.xQ2((TwoStepVerificationActivityViewModel) c1266120j3K.l0, 0, null, 6);
    }

    public static final void onResult$7(C1266120j3K c1266120j3K, int i, int i2, Object obj) {
        String string;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String enterFrom = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterFrom();
            String enterMethod = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterMethod();
            c1233960iDS.getClass();
            C1233960iDS.LIZLLL(enterFrom, enterMethod, "sms", true);
            Function1 function1 = (Function1) c1266120j3K.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (string = baseBundle.getString("ticket")) == null) {
                string = "";
            }
            function1.invoke(new C1234050iDb(string, "mobile_sms_verify"));
            return;
        }
        C1233960iDS c1233960iDS2 = C1233960iDS.LIZ;
        String enterFrom2 = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterFrom();
        String enterMethod2 = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterMethod();
        c1233960iDS2.getClass();
        C1233960iDS.LIZLLL(enterFrom2, enterMethod2, "sms", false);
        TwoStepVerificationActivityViewModel.xQ2((TwoStepVerificationActivityViewModel) c1266120j3K.l0, 0, null, 6);
    }

    public static final void onResult$8(C1266120j3K c1266120j3K, int i, int i2, Object obj) {
        String string;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String enterFrom = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterFrom();
            String enterMethod = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterMethod();
            c1233960iDS.getClass();
            C1233960iDS.LIZLLL(enterFrom, enterMethod, "sms", true);
            Function1 function1 = (Function1) c1266120j3K.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (string = baseBundle.getString("ticket")) == null) {
                string = "";
            }
            function1.invoke(new C1234050iDb(string, "mobile_sms_verify"));
            return;
        }
        C1233960iDS c1233960iDS2 = C1233960iDS.LIZ;
        String enterFrom2 = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterFrom();
        String enterMethod2 = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterMethod();
        c1233960iDS2.getClass();
        C1233960iDS.LIZLLL(enterFrom2, enterMethod2, "sms", false);
        TwoStepVerificationActivityViewModel.xQ2((TwoStepVerificationActivityViewModel) c1266120j3K.l0, 0, null, 6);
    }

    public static final void onResult$9(C1266120j3K c1266120j3K, int i, int i2, Object obj) {
        String string;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String enterFrom = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterFrom();
            String enterMethod = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterMethod();
            c1233960iDS.getClass();
            C1233960iDS.LIZLLL(enterFrom, enterMethod, "email", true);
            Function1 function1 = (Function1) c1266120j3K.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (string = baseBundle.getString("ticket")) == null) {
                string = "";
            }
            function1.invoke(new C1234050iDb(string, "email_verify"));
            return;
        }
        C1233960iDS c1233960iDS2 = C1233960iDS.LIZ;
        String enterFrom2 = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterFrom();
        String enterMethod2 = ((TwoStepVerificationActivityViewModel) c1266120j3K.l0).getEnterMethod();
        c1233960iDS2.getClass();
        C1233960iDS.LIZLLL(enterFrom2, enterMethod2, "email", false);
        TwoStepVerificationActivityViewModel.xQ2((TwoStepVerificationActivityViewModel) c1266120j3K.l0, 0, null, 6);
    }
}

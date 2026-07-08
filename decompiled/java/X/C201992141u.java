package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoLanguageStyleOption;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoLanguageStyleSetting;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS307S0300000_30;
import kotlin.jvm.internal.AwS465S0200000_30;
import org.json.JSONException;

/* JADX INFO: renamed from: X.141u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201992141u {
    public static WeakReference<IMessageAbility> LIZIZ;
    public static WeakReference<TuxPanel> LIZLLL;
    public static volatile TakoLanguageStyleSetting LJFF;
    public static final C201992141u LIZ = new C201992141u();
    public static final C054G LIZJ = C2296808zG.LIZIZ();
    public static final Map<String, List<String>> LJ = new LinkedHashMap();

    static {
        TakoLanguageStyleSetting takoLanguageStyleSettingLIZ;
        AnonymousClass1426.LIZ.getClass();
        if (AnonymousClass1426.LIZ()) {
            C1860520yW2.LIZ.getClass();
            Keva kevaLJIIL = C1860520yW2.LJIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tako_language_style_setting");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            String string = kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), "");
            try {
                takoLanguageStyleSettingLIZ = TextUtils.isEmpty(string) ? LIZ() : (TakoLanguageStyleSetting) C597040NbK.LIZ().LJII(string, TakoLanguageStyleSetting.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                takoLanguageStyleSettingLIZ = LIZ();
            }
        } else {
            takoLanguageStyleSettingLIZ = null;
        }
        LJFF = takoLanguageStyleSettingLIZ;
    }

    public static TakoLanguageStyleSetting LIZ() {
        return new TakoLanguageStyleSetting(0, C1697810uHb.LJIIJJI(new TakoLanguageStyleOption(0, C1857750yRZ.LJII(2131849815), C1857750yRZ.LJII(2131849816), C1857750yRZ.LJII(2131849822), C1857750yRZ.LJII(2131849817)), new TakoLanguageStyleOption(1, C1857750yRZ.LJII(2131849823), C1857750yRZ.LJII(2131849824), C1857750yRZ.LJII(2131849822), C1857750yRZ.LJII(2131849825)), new TakoLanguageStyleOption(2, C1857750yRZ.LJII(2131849818), C1857750yRZ.LJII(2131849819), C1857750yRZ.LJII(2131849822), C1857750yRZ.LJII(2131849820)), new TakoLanguageStyleOption(3, C1857750yRZ.LJII(2131849811), C1857750yRZ.LJII(2131849812), C1857750yRZ.LJII(2131849822), C1857750yRZ.LJII(2131849813))));
    }

    public static void LJ(String str) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        View viewLJI;
        if (!TextUtils.isEmpty(str) && (abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (viewLJI = abstractC1387200mCcLJ.LJI()) != null) {
            C0DQF.LJ(viewLJI, str, null, null, true, 12);
        }
    }

    public static void LIZJ(boolean z, boolean z2) {
        WeakReference<IMessageAbility> weakReference;
        IMessageAbility iMessageAbility;
        if (z) {
            C1860520yW2.LIZ.getClass();
            Keva kevaLJIIL = C1860520yW2.LJIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tako_language_style_guide_dialog_showed");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            kevaLJIIL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        }
        if (z2 && (weakReference = LIZIZ) != null && (iMessageAbility = weakReference.get()) != null) {
            iMessageAbility.U61(9, 1, "", "");
        }
    }

    public static void LIZLLL(TakoEnterParams takoEnterParams, C1863850ybP c1863850ybP) throws JSONException {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ;
        FragmentManager fragmentManagerLJ;
        String str;
        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ2 != null && (activityLIZIZ = abstractC1387200mCcLJ2.LIZIZ()) != null && (abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (fragmentManagerLJ = abstractC1387200mCcLJ.LJ()) != null) {
            C1391960mKI c1391960mKI = new C1391960mKI();
            c1391960mKI.LJII = C1857750yRZ.LJII(2131849810);
            c1391960mKI.LJIIIZ = C13LQ.LJJLL(new C1391890mKB[]{new C1391890mKB(C1857750yRZ.LJII(2131849806), Integer.valueOf(R.raw.icon_text_stroke), C1857750yRZ.LJII(2131849807)), new C1391890mKB(C1857750yRZ.LJII(2131849808), Integer.valueOf(R.raw.icon_control), C1857750yRZ.LJII(2131849809))});
            c1391960mKI.LJIILJJIL = true;
            c1391960mKI.LIZ = false;
            c1391960mKI.LIZIZ(C1857750yRZ.LJII(2131849804), new AwS307S0300000_30(c1863850ybP, activityLIZIZ, takoEnterParams, 2));
            c1391960mKI.LIZJ(C1857750yRZ.LJII(2131849805), new AwS465S0200000_30(takoEnterParams, c1863850ybP, 12));
            C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
            c439850HMpLIZ.LIZ.LLILZIL = new DialogInterfaceOnDismissListenerC20307414d6(takoEnterParams, c1863850ybP, 0);
            TuxPanel tuxPanel = c439850HMpLIZ.LIZ;
            LIZLLL = new WeakReference<>(tuxPanel);
            tuxPanel.show(fragmentManagerLJ, "TakoLanguageStyleHelper");
            C320490ChL.LIZ.setValue(Boolean.TRUE);
            LIZJ(true, true);
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = takoEnterParams.enterFrom;
            String str3 = takoEnterParams.enterMethod;
            String str4 = takoEnterParams.processId;
            if (c1863850ybP == null || (str = c1863850ybP.LLILZLL) == null) {
                str = "";
            }
            C1862330yYx.LJLJI(c1862330yYx, str2, str3, str4, "language_style_available", null, null, null, null, null, null, null, null, null, str, takoEnterParams.takoChatId, 40944);
        }
    }

    public static void LIZIZ(Context context, TakoEnterParams takoEnterParams, String str) {
        if (context == null || takoEnterParams == null || LJFF == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//tako/language_style/setting");
        smartRouteBuildRoute.withParam("tako_language_style", LJFF);
        smartRouteBuildRoute.withParam("tako_enter_param", takoEnterParams);
        smartRouteBuildRoute.withParam("tako_session_id", str);
        smartRouteBuildRoute.open();
    }

    public static void LJFF(TakoLanguageStyleSetting takoLanguageStyleSetting, boolean z, Function1 function1) {
        if (z) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C20040513b9(takoLanguageStyleSetting, function1, null), 3);
        } else {
            C23250099c.LIZLLL(LIZJ, null, null, new C20040313b7(takoLanguageStyleSetting, function1, null), 3);
        }
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.im.common.model.GroupInviteInfoModel;
import com.ss.android.ugc.aweme.im.saas.host.api.geckox.IMGeckoManagerService;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.msg.OnboardingContentFragment;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS143S1100000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS67S2100000_29;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11FW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11FW {
    public static final C11FW LIZ = new C11FW();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(10));

    public static String LIZIZ(String str) {
        IMGeckoManagerService c098200Yq;
        String strLIZIZ;
        try {
            IMGeckoManagerService.LIZ.getClass();
            c098200Yq = C11FY.LIZIZ.getValue();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        IMGeckoManagerService iMGeckoManagerService = (IMGeckoManagerService) c098200Yq;
        if (iMGeckoManagerService == null || (strLIZIZ = iMGeckoManagerService.LIZIZ(iMGeckoManagerService.getAccessKey(), null, true, "dm_common_channel_0")) == null) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(strLIZIZ, str);
        if (!c0vsj.exists()) {
            c0vsj = null;
        }
        if (c0vsj == null) {
            return null;
        }
        return c0vsj.getAbsolutePath();
    }

    public static void LIZ(Context context, String str, String str2) throws JSONException {
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
        if (iMShareServiceLIZ != null) {
            iMShareServiceLIZ.LJIJJ(context, str);
        }
        C0I0B.LJFF.LIZIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "chat");
        jSONObject.put("enter_method", str2);
        C20684815ws.LJIJ("enter_personal_detail", jSONObject);
        C879350Yeb c879350Yeb = C879350Yeb.LIZ;
        String strLIZIZ = C461720I8s.LIZIZ();
        c879350Yeb.getClass();
        C879350Yeb.LIZ(strLIZIZ, str2, "chat");
    }

    public static String LIZJ(Context context, String str, String str2) {
        String str3;
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            str3 = str2;
        } else {
            str3 = str;
        }
        String strLIZIZ = LIZIZ(str3);
        if (strLIZIZ == null) {
            if (Intrinsics.LJFF(str3, str2)) {
                return LIZIZ(str);
            }
            return null;
        }
        return strLIZIZ;
    }

    public static void LIZLLL(Context context, String str, String str2) throws JSONException {
        String inviteShortUrl;
        GroupInviteInfoModel groupInviteInfoModelLIZIZ = C0ZV1.LIZIZ(str);
        if (groupInviteInfoModelLIZIZ != null && (inviteShortUrl = groupInviteInfoModelLIZIZ.getInviteShortUrl()) != null) {
            LIZ(context, inviteShortUrl, str2);
        } else {
            C0ZV1.LIZ(str, true, new AwS143S1100000_29(context, str2, 0), AFwS248S0000000_14.get$arr$(541));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.intro.TuxPanel] */
    public static void LJ(Context context, EnumC19357210oE enumC19357210oE, String str, String str2, Integer num, Function1 function1, Function0 function0) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        String str3;
        if (enumC19357210oE != EnumC19357210oE.COPY_LINK) {
            String strLIZIZ = C461720I8s.LIZIZ();
            Keva keva = (Keva) LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            int i = C19357410oG.LIZ[enumC19357210oE.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    str3 = "key_popup_copy_link_";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str3 = "key_popup_record_sticker_";
            }
            sbLIZ.append(str3);
            sbLIZ.append(strLIZIZ);
            if (System.currentTimeMillis() - keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L) < TimeUnit.DAYS.toMillis(10L)) {
                function0.invoke();
                return;
            }
        }
        Activity activityLIZIZ = C737910Sx3.LIZIZ(context);
        if ((activityLIZIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (!supportFragmentManager.LJLJJI())) {
            C11FX c11fx = new C11FX();
            c11fx.LJII = enumC19357210oE;
            c11fx.LJIIIIZZ = str;
            c11fx.LJIIJJI = new AwS573S0100000_29(enumC19357210oE, 13);
            c11fx.LJIIIZ = new AwS67S2100000_29(str2, str, num, 0);
            function1.invoke(c11fx);
            OnboardingContentFragment onboardingContentFragment = new OnboardingContentFragment();
            onboardingContentFragment.LL = c11fx;
            C259800zU c259800zU = new C259800zU();
            C439850HMp c439850HMp = new C439850HMp();
            TuxPanel tuxPanel = c439850HMp.LIZ;
            tuxPanel.LLJ = true;
            tuxPanel.LLILLJJLI = onboardingContentFragment;
            AwS395S0200000_29 awS395S0200000_29 = new AwS395S0200000_29(c11fx, onboardingContentFragment, 65);
            ?? r2 = c439850HMp.LIZ;
            r2.LLILZ = awS395S0200000_29;
            r2.LLILZIL = new DialogInterfaceOnDismissListenerC19333110kL(c11fx, c259800zU, 1);
            c259800zU.element = r2;
            r2.show(supportFragmentManager, "onboarding_action_popup");
            return;
        }
        function0.invoke();
    }
}

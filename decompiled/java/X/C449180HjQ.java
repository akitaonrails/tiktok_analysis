package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS473S0200000_4;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS653S0100000_4;

/* JADX INFO: renamed from: X.0HjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449180HjQ {
    public static final C449180HjQ LIZ = new C449180HjQ();

    public static void LIZ(Context context) {
        if (context == null) {
            return;
        }
        if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
            C632670Orh.LIZIZ(context, new C19719212De(481147766, new AwS653S0100000_4(context, 14), true));
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131849662);
        c1397580mTM.LIZ(2131849661);
        C985403tE.LIZ(c1397580mTM, new AwS585S0100000_6(context, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static void LIZIZ(Context context) {
        if (context == null) {
            return;
        }
        if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
            C632670Orh.LIZIZ(context, new C19719212De(-1969073029, new AwS653S0100000_4(context, 15), true));
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131849666);
        c1397580mTM.LIZ(2131849665);
        C985403tE.LIZ(c1397580mTM, new AwS585S0100000_6(context, 301));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static boolean LIZJ(Activity activity) {
        if (activity == null) {
            return false;
        }
        C19741112Lp.LIZ.getClass();
        return C19741112Lp.LIZLLL(activity, "android.permission.RECORD_AUDIO");
    }

    public static void LIZLLL(Function1 function1) {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF == null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        C19741112Lp.LIZ.getClass();
        if (C19741112Lp.LIZLLL(activityLJFF, "android.permission.CAMERA")) {
            function1.invoke(Boolean.TRUE);
        } else if (C19741112Lp.LJI(activityLJFF, "android.permission.CAMERA", false)) {
            LIZ(activityLJFF);
            function1.invoke(Boolean.FALSE);
        } else {
            C19514711Wn.LIZIZ.LIZIZ(activityLJFF, TokenCert.Companion.with("bpea-tako_image_upload_request_permission_camera")).LIZIZ("android.permission.CAMERA").LIZJ(new C462970IDn(activityLJFF, function1, 2));
        }
    }

    public static void LJ(Activity activity, Function1 function1) {
        if (activity == null) {
            return;
        }
        C19741112Lp.LIZ.getClass();
        if (C19741112Lp.LJI(activity, "android.permission.RECORD_AUDIO", false)) {
            AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(function1, (Function1<? super Boolean, Unit>) 1224);
            if (C0DHG.LIZ() && C1388190mED.LIZ(activity) != null) {
                C632670Orh.LIZIZ(activity, new C19719212De(524180978, new AwS473S0200000_4(activity, awS550S0100000_6, 2), true));
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            c1397580mTM.LJFF(2131828545);
            c1397580mTM.LIZ(2131828542);
            C985403tE.LIZ(c1397580mTM, new AwS372S0200000_6(activity, awS550S0100000_6, 66));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-dm_record_audio-tako_voice_input")).LIZIZ("android.permission.RECORD_AUDIO").LIZJ(new C462980IDo(function1, 2));
    }
}

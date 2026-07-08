package X;

import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.InstantCloneTextConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11VR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11VR {
    public static final InstantCloneTextConfig LIZ = new InstantCloneTextConfig(new ArrayList(), "", "", "", "", "", "", "", "", 0.3f, 5.0f, "https://sami.tiktokv.com/internal", 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(389));

    public static final InstantCloneTextConfig LIZIZ() {
        return (InstantCloneTextConfig) LIZIZ.getValue();
    }

    public static String LIZ(String str) {
        if (str.equals("zh")) {
            if (C123100dR.LIZ(LIZIZ().auditionChinese)) {
                return LIZIZ().auditionChinese;
            }
            return "This is your AI voice speaking! Try it out in your videos now!";
        }
        if (str.equals("ja")) {
            if (C123100dR.LIZ(LIZIZ().auditionJpanese)) {
                return LIZIZ().auditionJpanese;
            }
            return "This is your AI voice speaking! Try it out in your videos now!";
        }
        if (str.equals("en")) {
            if (C123100dR.LIZ(LIZIZ().auditionEnglish)) {
                return LIZIZ().auditionEnglish;
            }
            return "This is your AI voice speaking! Try it out in your videos now!";
        }
        if (str.equals(FollowStatusChangeMethod.PARAM_UID)) {
            if (C123100dR.LIZ(LIZIZ().auditionIndonesian)) {
                return LIZIZ().auditionIndonesian;
            }
            return "This is your AI voice speaking! Try it out in your videos now!";
        }
        if (str.equals("es")) {
            if (C123100dR.LIZ(LIZIZ().auditionSpanish)) {
                return LIZIZ().auditionSpanish;
            }
            return "This is your AI voice speaking! Try it out in your videos now!";
        }
        if (str.equals("pt") && C123100dR.LIZ(LIZIZ().auditionPortuguese)) {
            return LIZIZ().auditionPortuguese;
        }
        return "This is your AI voice speaking! Try it out in your videos now!";
    }
}

package X;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1B3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198601B3a {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Bundle bundle) {
        String string;
        String string2;
        if (bundle != null) {
            string = bundle.getString("_aweme_params_caller_open_sdk_name");
        } else {
            string = null;
        }
        if (!Intrinsics.LJFF("TikTok-Open-Android-SDK-Auth", string)) {
            return "";
        }
        if (bundle == null || (string2 = bundle.getString("_aweme_params_caller_open_sdk_version")) == null) {
            string2 = "";
        }
        if (string2.length() == 0 || string2.compareTo("1.4.0") <= 0) {
            return "";
        }
        return "tiktok_sdk_auth";
    }
}

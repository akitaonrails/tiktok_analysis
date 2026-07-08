package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0mIT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390830mIT {
    public static final void LIZ(C2344009Gk c2344009Gk, Aweme aweme, Boolean bool, String str) {
        boolean z;
        String str2;
        if (aweme != null) {
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            String str3 = "on";
            if (!AwemeExtKt.isPhotoMode(aweme)) {
                if (bool != null) {
                    if (bool.booleanValue()) {
                        str2 = "original";
                    } else {
                        str2 = "translation";
                    }
                    c2344009Gk.LJFF("caption_type", str2);
                }
                C20703515zt.LIZ.getClass();
                String str4 = "unavailable";
                if (C20703515zt.LJJIII(aweme)) {
                    if (!z) {
                        if (C746760TRa.LIZ().LIZIZ()) {
                            str4 = "on";
                        } else {
                            str4 = "off";
                        }
                    }
                    c2344009Gk.LJFF("original_caption_status", str4);
                } else {
                    if (!z) {
                        if (C746760TRa.LIZ().LJL()) {
                            str4 = "on";
                        } else {
                            str4 = "off";
                        }
                    }
                    c2344009Gk.LJFF("translation_caption_status", str4);
                }
            }
            C20703515zt.LIZ.getClass();
            if (!C20703515zt.LIZIZ.LJIJI(aweme)) {
                if (!C746760TRa.LIZ().LJLILLLLZI()) {
                    str3 = "off";
                }
                c2344009Gk.LJFF("auto_translation_status", str3);
            }
            if (str != null) {
                c2344009Gk.LJFF("captions_unavailable_reason", str);
            }
        }
    }
}

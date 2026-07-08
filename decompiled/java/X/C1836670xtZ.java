package X;

import android.graphics.Typeface;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0xtZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836670xtZ extends C1295870jpJ {
    @Override // X.C1295870jpJ
    public final Typeface LIZ(String str, String str2, String str3) {
        Typeface typefaceLIZIZ;
        Typeface typefaceLIZIZ2;
        Typeface typefaceLIZIZ3;
        Typeface typeface = null;
        if (str == null) {
            return null;
        }
        if (a0.LJJIIZI(str, "TikTok Sans Text", false)) {
            if (Intrinsics.LJFF(str2, "Light")) {
                typefaceLIZIZ3 = C1697580uHE.LIZIZ(0.0f, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 44.0f, 0.0f, null, 0.0f, 0, null, 249);
            } else {
                typeface = null;
                typefaceLIZIZ3 = C1697580uHE.LIZIZ(0.0f, 500, 0.0f, 0.0f, null, 0.0f, 0, null, 253);
            }
            if (typefaceLIZIZ3 == null) {
                return typeface;
            }
            return typefaceLIZIZ3;
        }
        if (a0.LJJIIZI(str, "TikTok Sans", false)) {
            if (Intrinsics.LJFF(str2, "Medium")) {
                typefaceLIZIZ2 = C1697580uHE.LIZIZ(0.0f, 500, 14.0f, 0.0f, null, 0.0f, 0, null, 249);
            } else {
                typeface = null;
                typefaceLIZIZ2 = C1697580uHE.LIZIZ(0.0f, 500, 0.0f, 0.0f, null, 0.0f, 0, null, 253);
            }
            if (typefaceLIZIZ2 == null) {
                return typeface;
            }
            return typefaceLIZIZ2;
        }
        if (!a0.LJJIIZI(str, "TikTok Text", false)) {
            return null;
        }
        if (Intrinsics.LJFF(str2, "Medium")) {
            typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 500, 16.0f, 0.0f, null, 0.0f, 0, null, 249);
        } else {
            typeface = null;
            typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 500, 0.0f, 0.0f, null, 0.0f, 0, null, 253);
        }
        if (typefaceLIZIZ == null) {
            return typeface;
        }
        return typefaceLIZIZ;
    }
}

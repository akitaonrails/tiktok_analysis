package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdkapi.util.file.FileDownloadTaskController;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aTJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936270aTJ {
    public static boolean LIZLLL() {
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        return enumC918970a1PLJII == EnumC918970a1P.GRID || enumC918970a1PLJII == EnumC918970a1P.GRID_FIX;
    }

    public static String LIZ(String str) {
        if (str == null || TextUtils.isEmpty(str) || Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, str)) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return str;
    }

    public static boolean LIZJ(boolean z) {
        int iIntValue;
        if (C924230a9t.LIZ(128)) {
            return false;
        }
        if (z) {
            iIntValue = LiveAbLabelSetting.INSTANCE.getIntValue("linkmic_shared_bg_version");
        } else {
            Integer numLJ = C931820aM8.LJ("linkmic_shared_bg_version");
            if (numLJ == null) {
                return false;
            }
            iIntValue = numLJ.intValue();
        }
        if (iIntValue <= 0 || C930540aK4.LJJIJ()) {
            return false;
        }
        return true;
    }

    public static String LJ(String str) {
        if (!Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, str) && str != null && !TextUtils.isEmpty(str) && !Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, str)) {
            return str;
        }
        return null;
    }

    public static FileDownloadTaskController LIZIZ(String str, String str2, Function1 function1) {
        if (str2 == null || str == null) {
            return null;
        }
        return C207232167i.LIZIZ(new C207209166l(str, EnumC771350UNp.SHARE_EFFECT, null, null, str2, null, false, 3, false, 748), function1);
    }
}

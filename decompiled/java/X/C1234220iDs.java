package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0iDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234220iDs {
    public static final Map<String, String> LIZJ(C1233510iCj c1233510iCj) {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("video_link_id", c1233510iCj.LIZ);
        String str = c1233510iCj.LJII;
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("video_link_item_id", str);
        pairArr[2] = new Pair("video_link_share_type", String.valueOf(c1233510iCj.LJ.getRawValue()));
        pairArr[3] = new Pair("from", String.valueOf(c1233510iCj.LJ.getFollowFrom()));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final C1233440iCc LIZLLL(Intent intent) {
        EnumC1234280iDy enumC1234280iDyLJII;
        Integer numLJIIJJI;
        String strLIZ = LIZ(intent, "social_share_type");
        if (strLIZ != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZ)) != null) {
            enumC1234280iDyLJII = LJII(numLJIIJJI.intValue());
        } else {
            enumC1234280iDyLJII = null;
        }
        String strLIZ2 = LIZ(intent, "share_url_item_id");
        if (strLIZ2 == null && (strLIZ2 = LIZ(intent, "gids")) == null) {
            strLIZ2 = LIZ(intent, "aweme_id");
        }
        String strLIZ3 = LIZ(intent, "share_url_utm_source");
        String strLIZ4 = LIZ(intent, "share_url_link_id");
        String strLIZ5 = LIZ(intent, "share_url_user_id");
        String strLIZ6 = LIZ(intent, "share_sec_url_user_id");
        boolean booleanExtra = intent.getBooleanExtra("share_expose_sharer", false);
        String strLIZ7 = LIZ(intent, "share_url_checksum");
        String strLIZ8 = LIZ(intent, "share_url_timestamp");
        String strLIZ9 = LIZ(intent, "invitation_scene");
        String strLIZ10 = LIZ(intent, "refer");
        String strLIZ11 = LIZ(intent, "share_url");
        if (strLIZ11 == null) {
            strLIZ11 = "";
        }
        return new C1233440iCc(enumC1234280iDyLJII, strLIZ2, strLIZ3, strLIZ4, strLIZ5, strLIZ6, booleanExtra, strLIZ7, strLIZ8, strLIZ9, strLIZ10, strLIZ11, intent.getIntExtra("share_link_mode", 0));
    }

    public static final boolean LJ(EnumC1234280iDy enumC1234280iDy) {
        if (enumC1234280iDy != EnumC1234280iDy.LIVE && enumC1234280iDy != EnumC1234280iDy.MULTI_LIVE) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(C1233440iCc c1233440iCc) {
        String str = c1233440iCc.LJ;
        if (str != null && !Intrinsics.LJFF(str, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            return true;
        }
        return false;
    }

    public static final C1233510iCj LJI(User user) {
        if (user == null) {
            return null;
        }
        Map<Integer, C1233510iCj> map = C1233600iCs.LIZ;
        C1233510iCj c1233510iCj = (C1233510iCj) ((LinkedHashMap) C1233600iCs.LIZ).get(Integer.valueOf(user.hashCode()));
        if (c1233510iCj == null) {
            Map<String, C1233510iCj> map2 = C1233600iCs.LIZIZ;
            String uid = user.getUid();
            if (uid == null) {
                uid = "_uid_";
            }
            return (C1233510iCj) ((LinkedHashMap) map2).get(uid);
        }
        return c1233510iCj;
    }

    public static final EnumC1234280iDy LJII(int i) {
        for (EnumC1234280iDy enumC1234280iDy : EnumC1234280iDy.values()) {
            if (enumC1234280iDy.getRawValue() == i) {
                return enumC1234280iDy;
            }
        }
        return null;
    }

    public static final Map<String, String> LJIIIIZZ(C1233510iCj c1233510iCj) {
        if (c1233510iCj != null) {
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("share_type", String.valueOf(c1233510iCj.LJ.getRawValue()));
            String str = c1233510iCj.LJFF;
            if (str == null) {
                str = "";
            }
            pairArr[1] = new Pair("share_source", str);
            return C2097608Jq.LJIIIIZZ(pairArr);
        }
        return null;
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @InterfaceC1294060jmO
    public static final String LIZIZ(String str, EnumC1234280iDy enumC1234280iDy) {
        if (str.length() != 0 && !a0.LJJIIZI(str, "social_share_type", false)) {
            C0XI4 c0xi4 = new C0XI4(str);
            c0xi4.LIZIZ(enumC1234280iDy.getRawValue(), "social_share_type");
            return c0xi4.LJFF();
        }
        return str;
    }
}

package X;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.DanmakuDiggMessage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1An7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2189831An7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0ae8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0c53  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0e8e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0e97  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x10c2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x10d1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x1134  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x1142  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x1151  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x1160  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x116a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x11b8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x11ef  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x1231  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1234  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1237  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x123a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x123d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x1250  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0818  */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2189821An6 LIZLLL(android.content.Context r319, android.content.Intent r320) {
        /*
            Method dump skipped, instruction units count: 4705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2189831An7.LIZLLL(android.content.Context, android.content.Intent):X.1An6");
    }

    public static DanmakuDiggMessage LIZIZ(Intent intent) {
        try {
            return new DanmakuDiggMessage(LIZ(intent, "danmaku_id"), CastLongProtector.parseLong(LIZ(intent, "danmaku_offset")));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static HashMap<String, String> LJ(Intent intent) {
        HashMap<String, String> map = new HashMap<>();
        Serializable serializableExtra = intent.getSerializableExtra("inbox_log_extra");
        if (serializableExtra instanceof String) {
            return C092300Wj.LIZ((String) serializableExtra);
        }
        if (!(serializableExtra instanceof HashMap)) {
            return map;
        }
        return (HashMap) serializableExtra;
    }

    public static HashMap<String, String> LJFF(Intent intent) {
        HashMap<String, String> map = new HashMap<>();
        try {
            Serializable serializableExtra = intent.getSerializableExtra("poi_extras");
            if (serializableExtra instanceof String) {
                map = C092300Wj.LIZ((String) serializableExtra);
            } else if (serializableExtra instanceof HashMap) {
                map = (HashMap) serializableExtra;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String strLIZ = LIZ(intent, "magic3_source");
        if (!TextUtils.isEmpty(strLIZ)) {
            map.put("activity_source", strLIZ);
        }
        String strLIZ2 = LIZ(intent, "magic3_activityId");
        if (!TextUtils.isEmpty(strLIZ2)) {
            map.put("activity_page_id", strLIZ2);
        }
        return map;
    }

    public static List<String> LJI(Intent intent) {
        String strLIZ = LIZ(intent, "sticker_interaction_insert_user_id_list");
        ArrayList arrayList = new ArrayList();
        if (strLIZ != null && strLIZ.startsWith(e3.e) && strLIZ.endsWith(e3.f)) {
            strLIZ = strLIZ.substring(1, strLIZ.length() - 1);
        }
        if (!TextUtils.isEmpty(strLIZ)) {
            return Arrays.asList(strLIZ.split(","));
        }
        return arrayList;
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LIZJ(String str, String str2, String str3) {
        C1ER1 c1er1 = C1ER1.LIZIZ;
        if ((c1er1.LJJJLL(str2) || (!c1er1.LJJJLL(str2) && TextUtils.equals(str3, "app_outside"))) && !Objects.equals(str, "paid_series_detail_page")) {
            return str2;
        }
        if (TextUtils.equals(str, "page_challenge_mention")) {
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        } else if (str == null) {
            return str2;
        }
        return str;
    }
}

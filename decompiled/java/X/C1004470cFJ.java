package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cFJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004470cFJ {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    public static final void LIZ(boolean z, Aweme aweme, String str, String str2, IMContact iMContact, C1004480cFK c1004480cFK, String str3, boolean z2, Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap;
        ?? LJFF;
        int i;
        long j;
        String str4;
        String str5;
        String str6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recall mob ");
        sbLIZ.append(aweme.getAid());
        C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ));
        C1004550cFR.LIZIZ.getClass();
        Set<String> set = C1004550cFR.LJIIIIZZ;
        if (C13LP.LJJJJ(aweme.getAid(), set) && !z2) {
            C1720006oQ.LJ("QuickShareAssem", "recall mob hasMobRecall=true");
            return;
        }
        if (z) {
            set.add(aweme.getAid());
        }
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (c1004480cFK != null) {
            LJFF = Intrinsics.LJFF(c1004480cFK.LIZ, Boolean.TRUE);
        } else {
            LJFF = 0;
        }
        linkedHashMap.put("pitaya_show", Integer.valueOf((int) LJFF));
        if (c1004480cFK != null) {
            i = c1004480cFK.LJIIJ;
        } else {
            i = 0;
        }
        linkedHashMap.put("pitaya_code", Integer.valueOf(i));
        if (c1004480cFK != null) {
            j = c1004480cFK.LJIIIZ;
        } else {
            j = -1;
        }
        linkedHashMap.put("pitaya_duration", Long.valueOf(j));
        C1004770cFn c1004770cFn = C1004770cFn.LIZ;
        String aid = aweme.getAid();
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        Boolean bool = null;
        if (c1004480cFK != null) {
            str4 = c1004480cFK.LIZJ;
        } else {
            str4 = null;
        }
        String str7 = "";
        if (!z) {
            str5 = "";
            if (c1004480cFK != null && (str6 = c1004480cFK.LIZIZ) != null && str6.length() != 0) {
                str7 = c1004480cFK.LIZIZ;
                bool = c1004480cFK.LJFF;
                c1004770cFn.getClass();
                C1004770cFn.LIZIZ(z, aid, authorUid, true, str, iMContact, str4, str5, str7, str2, bool, linkedHashMap);
            }
            str7 = str3;
        } else {
            str5 = str2;
        }
        if (c1004480cFK != null) {
            bool = c1004480cFK.LJFF;
        }
        c1004770cFn.getClass();
        C1004770cFn.LIZIZ(z, aid, authorUid, true, str, iMContact, str4, str5, str7, str2, bool, linkedHashMap);
    }
}

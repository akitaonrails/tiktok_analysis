package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511390K3t {
    public static final void LIZ(C511370K3r c511370K3r, Context context) {
        String str;
        String string;
        AwS551S0100000_7 awS551S0100000_7;
        if (c511370K3r.LLJJJJJIL) {
            return;
        }
        if (c511370K3r.LLJ) {
            C0JCX.LIZ(2131849256);
            return;
        }
        if (C0K7G.LIZIZ() && Intrinsics.LJFF(c511370K3r.LLJJL, "privilege_page")) {
            C512160K6s.LIZ(new C0K49());
        } else {
            boolean zLJ = C0K51.LJ(c511370K3r.LLJJJJ);
            String str2 = CardStruct.IStatusCode.DEFAULT;
            String str3 = "";
            if (zLJ) {
                String str4 = c511370K3r.LLILZ;
                if (str4 == null) {
                    str4 = "";
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str5 = c511370K3r.LLJIJIL;
                if (str5 == null) {
                    str5 = "";
                }
                linkedHashMap.put("show_entrance", str5);
                String str6 = c511370K3r.LLJJJJ;
                if (str6 == null) {
                    str6 = "";
                }
                linkedHashMap.put("package_id", str6);
                User user = c511370K3r.LLILLL;
                if (user != null && (string = Long.valueOf(user.getId()).toString()) != null) {
                    str3 = string;
                }
                linkedHashMap.put("creator_id", str3);
                if (Intrinsics.LJFF(c511370K3r.LLJJL, "onboarding_page")) {
                    linkedHashMap.put("open_benefit_page", CardStruct.IStatusCode.DEFAULT);
                } else {
                    linkedHashMap.put("open_benefit_page", "1");
                }
                C0K54.LIZ().LIZIZ(context, C511400K3u.LIZJ(str4, linkedHashMap), C2097608Jq.LJ());
            } else {
                if (!Intrinsics.LJFF(c511370K3r.LLJJL, "onboarding_page")) {
                    str2 = "1";
                }
                String str7 = c511370K3r.LLILZ;
                if (str7 != null) {
                    str3 = str7;
                }
                boolean z = !c511370K3r.LLJJIII;
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("show_entrance", c511370K3r.LLJIJIL), new Pair("open_benefit_page", str2));
                C511400K3u.LIZ.getClass();
                String strLIZ = C511400K3u.LIZ("/pgc_privilege_page");
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("sec_anchor_id", str3);
                if (z) {
                    str = "full_page";
                } else {
                    str = "popup";
                }
                pairArr[1] = new Pair("page_type", str);
                LinkedHashMap linkedHashMapLJII = C2097608Jq.LJII(pairArr);
                linkedHashMapLJII.putAll(mapLJIIIIZZ);
                C0K54.LIZ().LIZJ(context, C511400K3u.LIZIZ(strLIZ, linkedHashMapLJII), C2097608Jq.LJ());
            }
        }
        if (c511370K3r.LLJJIII && (awS551S0100000_7 = c511370K3r.LLJJLIIIJLLLLLLLZ) != null) {
            awS551S0100000_7.invoke();
        }
    }
}

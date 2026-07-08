package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08gI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2179208gI {
    public int LIZIZ;
    public final HashMap<EnumC1997807s8, HashSet<String>> LIZ = new HashMap<>();
    public final HashSet<String> LIZJ = new HashSet<>();

    public final void LIZIZ(String str, EnumC1997807s8 enumC1997807s8) {
        this.LIZIZ++;
        if (!this.LIZ.containsKey(enumC1997807s8)) {
            this.LIZ.put(enumC1997807s8, C093Y.LIZJ(str));
        }
        HashSet<String> hashSet = this.LIZ.get(enumC1997807s8);
        if (hashSet != null) {
            hashSet.add(str);
        }
    }

    public final void LIZ(int i, String str, String str2, String str3, String str4) {
        String lowerCase;
        String lowerCase2;
        int size;
        int size2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String lowerCase3 = null;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        c2344009Gk.LJIIIIZZ("path", lowerCase);
        Locale locale = Locale.ROOT;
        c2344009Gk.LJIIIIZZ("action_type", str2.toLowerCase(locale));
        if (str3 != null) {
            lowerCase2 = str3.toLowerCase(locale);
        } else {
            lowerCase2 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", lowerCase2);
        if (str4 != null) {
            lowerCase3 = str4.toLowerCase(locale);
        }
        c2344009Gk.LJIIIIZZ("enter_method", lowerCase3);
        c2344009Gk.LIZJ(i, "download_num");
        c2344009Gk.LIZJ(this.LIZJ.size(), "image_in_cache_cnt");
        if (Intrinsics.LJFF(str2, "download_fail")) {
            c2344009Gk.LIZJ(this.LIZIZ, "failed_cnt");
            HashSet<String> hashSet = this.LIZ.get(EnumC1997807s8.FILE_DOWNLOAD);
            if (hashSet != null) {
                size = hashSet.size();
            } else {
                size = 0;
            }
            c2344009Gk.LIZJ(size, "fail_download_error_cnt");
            HashSet<String> hashSet2 = this.LIZ.get(EnumC1997807s8.TOOLS_API);
            if (hashSet2 != null) {
                size2 = hashSet2.size();
            } else {
                size2 = 0;
            }
            c2344009Gk.LIZJ(size2, "tools_api_fail_cnt");
        }
        C20684815ws.LJIILLIIL("ai_avatar_choose_avatar_page", c2344009Gk.LIZ);
        this.LIZJ.clear();
        this.LIZIZ = 0;
        this.LIZ.clear();
    }
}

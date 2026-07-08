package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.1ArC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192361ArC {
    public static final HashMap<String, C2192371ArD> LIZ;
    public static final HashMap<String, C2192371ArD> LIZIZ;

    static {
        HashMap<String, C2192371ArD> map = new HashMap<>();
        HashMap map2 = new HashMap();
        map2.put("profile_entrance_tips_has_show", "profile_entrance_tips_has_show_{%uid}");
        map.put("keva_repo_profile_viewer", new C2192371ArD(map2));
        HashMap map3 = new HashMap();
        map3.put("profile_viewer_dialog_has_show", "profile_viewer_dialog_has_show_{%uid}");
        map.put("profile_viewer_dialog_keva_repo_name", new C2192371ArD(map3));
        LIZ = map;
        LIZIZ = new HashMap<>();
    }
}

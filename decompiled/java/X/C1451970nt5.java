package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0nt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451970nt5 {
    public static final C1451970nt5 LIZ = new C1451970nt5();

    public static void LIZIZ(String str, String str2, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("final_result", str2);
        c2344009Gk.LJIIIIZZ("action_source", str);
        c2344009Gk.LJ(Boolean.valueOf(z), "edited");
        C20684815ws.LJIILLIIL("photo_comment_edit_page_exit", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.09Gk] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static void LIZ(C1451970nt5 c1451970nt5, String str, String str2, String str3, String str4, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        ?? r6 = z;
        if ((i & 16) != 0) {
            r6 = 0;
        }
        c1451970nt5.getClass();
        ?? c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("module", str);
        c2344009Gk.LJIIIIZZ("action_type", str3);
        c2344009Gk.LJIIIIZZ("group_id", str4);
        if (!TextUtils.isEmpty(str2)) {
            c2344009Gk.LJFF("sub_module", str2);
        }
        c2344009Gk.LIZJ(r6, "is_visual_poet");
        C20684815ws.LJIILLIIL("photo_comment_edit_function_click", c2344009Gk.LIZ);
    }
}

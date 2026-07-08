package X;

/* JADX INFO: renamed from: X.0gea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173900gea {
    public static final C1173900gea LIZ = new C1173900gea();

    public static void LIZ(boolean z, boolean z2) {
        String str;
        String str2;
        if (z) {
            str = "upload_page";
        } else {
            str = "personal_homepage";
        }
        if (z2) {
            str2 = "thought_tab";
        } else {
            str2 = "story_tab";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("position", str);
        c0lab.LJ("tab_name", str2);
        C20684815ws.LJIILLIIL("ttsocial_story_archive_shoot_cell_click", c0lab.LIZ);
    }
}

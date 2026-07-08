package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0EnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C375070EnB {
    public static final C0LAB LIZ(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", bundle.getString("shoot_way"));
        c0lab.LJ("creation_id", bundle.getString("creation_id"));
        c0lab.LJ("content_source", bundle.getString("content_source"));
        c0lab.LJ("content_type", bundle.getString("content_type"));
        c0lab.LJ("creation_duration", str);
        c0lab.LJ("enter_from", bundle.getString("enter_from"));
        c0lab.LJ("music_id", bundle.getString("music_id"));
        c0lab.LIZ(1, "is_editor_pro");
        return c0lab;
    }
}

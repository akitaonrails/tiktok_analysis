package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Xsk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C862640Xsk {
    public static void LIZIZ(Function0 function0) {
        Keva repo = Keva.getRepo("keva_repo_send_to_dm");
        int i = repo.getInt("key_group_chat_sticker_guide_new_tip", 0);
        if (i < 3 && ((Boolean) function0.invoke()).booleanValue()) {
            repo.storeInt("key_group_chat_sticker_guide_new_tip", i + 1);
        }
    }

    public static void LIZ(String str, String str2, Function0 function0) {
        Keva repo = Keva.getRepo(str);
        if (!repo.getBoolean(str2, false) && ((Boolean) function0.invoke()).booleanValue()) {
            repo.storeBoolean(str2, true);
        }
    }
}

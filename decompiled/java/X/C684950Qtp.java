package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0Qtp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684950Qtp {
    public static C1263404wy LIZ() {
        return C07GD.LIZIZ(C2097908Jt.LIZJ(new Pair("preload_scene", "search_markdown_content")));
    }

    public static boolean LIZIZ(InterfaceC684960Qtq interfaceC684960Qtq) {
        String content = interfaceC684960Qtq.getContent();
        if (content == null || content.length() == 0) {
            String snippet = interfaceC684960Qtq.getSnippet();
            if (snippet == null || snippet.length() == 0) {
                return false;
            }
            return true;
        }
        return true;
    }
}

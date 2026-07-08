package X;

import com.ss.android.ugc.aweme.im.message.template.card.MarkdownMessageTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZSB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZSB {
    public static C461530I7z LIZ(C0ZSC c0zsc, InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        if (!(interfaceC1891350zJl instanceof C0ZSC)) {
            return C461450I7r.LIZIZ(c0zsc, interfaceC1891350zJl);
        }
        MarkdownMessageTemplate content = c0zsc.getContent();
        if (content != null) {
            str = content.raw;
        } else {
            str = null;
        }
        MarkdownMessageTemplate content2 = ((C0ZSC) interfaceC1891350zJl).getContent();
        if (content2 != null) {
            str2 = content2.raw;
        } else {
            str2 = null;
        }
        C0ZSD c0zsd = new C0ZSD(!Intrinsics.LJFF(str, str2), !Intrinsics.LJFF(c0zsc.LJII(), r3.LJII()));
        C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0zsc, interfaceC1891350zJl);
        if (c461530I7zLIZIZ == null) {
            return null;
        }
        return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0zsd, 5);
    }
}

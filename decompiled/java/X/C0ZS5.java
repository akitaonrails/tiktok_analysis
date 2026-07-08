package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZS5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZS5 {
    public static TextContent LIZIZ(C0ZS7 c0zs7) {
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(C0I6Y.LIZ(c0zs7), BaseContent.class);
        if (orParseJsonContent instanceof TextContent) {
            return (TextContent) orParseJsonContent;
        }
        return null;
    }

    public static String LIZJ(C0ZS7 c0zs7) {
        CharSequence charSequenceLJIILL;
        IIMAnonymousService iIMAnonymousService;
        TextContent content = c0zs7.getContent();
        if (content == null || (iIMAnonymousService = (IIMAnonymousService) PluggableExtentionKt.pluggableSpiForReal(IIMAnonymousService.class)) == null || (charSequenceLJIILL = iIMAnonymousService.LIZJ(c0zs7.LLILII().LIZ.LIZ.getConversationId(), content, c0zs7.LJIILL())) == null) {
            charSequenceLJIILL = c0zs7.LJIILL();
        }
        return charSequenceLJIILL.toString();
    }

    public static C461530I7z LIZ(C0ZS7 c0zs7, InterfaceC1891350zJl interfaceC1891350zJl) {
        C0ZS7 c0zs72;
        if ((interfaceC1891350zJl instanceof C0ZS7) && (c0zs72 = (C0ZS7) interfaceC1891350zJl) != null) {
            C0ZS6 c0zs6 = new C0ZS6(!Intrinsics.LJFF(c0zs72.LLILII().LIZ.LIZ.getContent(), c0zs7.LLILII().LIZ.LIZ.getContent()), !Intrinsics.LJFF(c0zs72.LJII(), c0zs7.LJII()));
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0zs7, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0zs6, 5);
        }
        return C461450I7r.LIZIZ(c0zs7, interfaceC1891350zJl);
    }
}

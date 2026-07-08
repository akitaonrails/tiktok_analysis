package X;

import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;

/* JADX INFO: renamed from: X.0I6T, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I6T {
    public static final C0I67 LIZ(C869590Y9l c869590Y9l, boolean z, boolean z2) {
        String text;
        if (C461060I6e.LIZIZ(c869590Y9l) && z) {
            if (C0ZDX.LJIJ(c869590Y9l)) {
                StickerTemplate stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(c869590Y9l, StickerTemplate.class);
                if (stickerTemplate == null) {
                    return new C0I67(C0I68.LIZ, 2);
                }
                return new C0I67(new C0I6S(stickerTemplate), z2);
            }
            TextContent textContent = (TextContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, TextContent.class);
            if (textContent != null && (text = textContent.getText()) != null) {
                return new C0I67(new C0I6U(text), z2);
            }
            return new C0I67(C0I68.LIZ, 2);
        }
        return new C0I67(C0I68.LIZ, 2);
    }
}

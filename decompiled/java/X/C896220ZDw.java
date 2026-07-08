package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;

/* JADX INFO: renamed from: X.0ZDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896220ZDw {
    public static AttachmentComponent LIZ(QuoteMode quoteMode) {
        QuoteMode.Quote quote;
        if (!(quoteMode instanceof QuoteMode.Quote) || (quote = (QuoteMode.Quote) quoteMode) == null) {
            return null;
        }
        return quote.attachment;
    }

    public static ReferenceInfo LIZIZ(QuoteMode quoteMode) {
        QuoteMode.Reply reply;
        if (!(quoteMode instanceof QuoteMode.Reply) || (reply = (QuoteMode.Reply) quoteMode) == null) {
            return null;
        }
        return reply.refInfo;
    }
}

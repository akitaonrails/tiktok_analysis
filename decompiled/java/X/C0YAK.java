package X;

import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.bytedance.im.core.proto.UrlStruct;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YAK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAK {
    public final C0YA6 LIZ = new C0YA6();

    public final void LIZIZ(C0Y8T c0y8t) {
        if (c0y8t != null) {
            this.LIZ.conversationId = c0y8t.getConversationId();
            this.LIZ.conversationType = c0y8t.getConversationType();
            this.LIZ.conversationShortId = c0y8t.getConversationShortId();
            this.LIZ.inboxType = c0y8t.getInboxType();
        }
    }

    public final void LIZ(C0YS6 c0ys6, String str, String str2, C0YAP c0yap, UrlStruct urlStruct, ByteString byteString) {
        ByteString byteString2 = byteString;
        C0YA6 c0ya6 = this.LIZ;
        if (byteString2 == null) {
            byteString2 = ByteString.EMPTY;
        }
        c0ya6.addPropertyContent(new C0YAQ(new ModifyPropertyContent(c0ys6, str, null, str2, c0yap, byteString2), urlStruct));
    }
}

package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;

/* JADX INFO: renamed from: X.0ZEp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896410ZEp {
    public static final /* synthetic */ C896410ZEp LIZ = new C896410ZEp();

    public static QuoteMode LIZ(ReferenceInfo referenceInfo) {
        if (referenceInfo != null) {
            return new QuoteMode.Reply(referenceInfo, true);
        }
        return QuoteMode.None.INSTANCE;
    }
}

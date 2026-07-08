package X;

import com.bytedance.im.core.proto.ConversationBadgeCountInfo;
import com.bytedance.im.core.proto.MessageBody;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YKI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YKI {
    public final long LIZ;
    public final List<MessageBody> LIZIZ;
    public final List<ByteString> LIZJ;
    public final boolean LIZLLL;
    public final C0YFV LJ;
    public final List<ConversationBadgeCountInfo> LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public C0YKI(long j, List<MessageBody> list, List<? extends ByteString> list2, boolean z, C0YFV c0yfv, List<ConversationBadgeCountInfo> list3) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = z;
        this.LJ = c0yfv;
        this.LJFF = list3;
    }
}

package X;

import android.util.Pair;
import com.bytedance.im.core.proto.ConversationInfoV2;

/* JADX INFO: renamed from: X.0Y1Q, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y1Q extends C09AY implements InterfaceC1631630sYr<Integer, Long, ConversationInfoV2, String, Pair<C0Y8T, Boolean>> {
    public final /* synthetic */ C0YEM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y1Q(C0YEM c0yem) {
        super(4);
        this.LL = c0yem;
    }

    @Override // X.InterfaceC1631630sYr
    public final Pair<C0Y8T, Boolean> invoke(Integer num, Long l, ConversationInfoV2 conversationInfoV2, String str) {
        return C867450Y1f.LJIJJ(this.LL, num.intValue(), l.longValue(), conversationInfoV2, str);
    }
}

package X;

import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JZE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JZE extends C09AY implements Function1<C410401ig, C410401ig> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ LiveSubOnlyConfig LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JZE(C013C c013c, LiveSubOnlyConfig liveSubOnlyConfig) {
        super(1);
        this.LL = c013c;
        this.LLILLJJLI = liveSubOnlyConfig;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C410401ig invoke(C410401ig c410401ig) {
        return C410401ig.LIZ(c410401ig, this.LL.element, false, null, this.LLILLJJLI, 6);
    }
}

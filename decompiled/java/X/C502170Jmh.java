package X;

import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jmh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502170Jmh extends C09AY implements Function1<C502060JmW, C502060JmW> {
    public final /* synthetic */ SpaceTopicContent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C502170Jmh(SpaceTopicContent spaceTopicContent) {
        super(1);
        this.LL = spaceTopicContent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C502060JmW invoke(C502060JmW c502060JmW) {
        return C502060JmW.LIZ(c502060JmW, null, this.LL, null, null, null, 59);
    }
}

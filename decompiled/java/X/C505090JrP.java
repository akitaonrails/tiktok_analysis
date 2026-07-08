package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JrP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505090JrP extends C09AY implements Function1<C506340JtQ, C506340JtQ> {
    public final /* synthetic */ SpacePost LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505090JrP(SpacePost spacePost) {
        super(1);
        this.LL = spacePost;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C506340JtQ invoke(C506340JtQ c506340JtQ) {
        return C506340JtQ.LIZ(c506340JtQ, null, new C291001Au(this.LL), null, null, null, null, null, null, null, null, null, 8187);
    }
}

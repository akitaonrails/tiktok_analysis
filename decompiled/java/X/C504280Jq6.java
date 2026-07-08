package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504280Jq6 extends C09AY implements Function1<C506330JtP, C506330JtP> {
    public final /* synthetic */ SpacePost LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504280Jq6(SpacePost spacePost) {
        super(1);
        this.LL = spacePost;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C506330JtP invoke(C506330JtP c506330JtP) {
        return C506330JtP.LIZ(c506330JtP, null, new C291001Au(this.LL), null, null, null, null, null, null, null, null, null, null, 8187);
    }
}

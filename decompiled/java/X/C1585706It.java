package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06It, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1585706It extends C09AY implements Function1<C1585606Is, C1585606Is> {
    public final /* synthetic */ SpacePost LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1585706It(SpacePost spacePost) {
        super(1);
        this.LL = spacePost;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1585606Is invoke(C1585606Is c1585606Is) {
        return new C1585606Is(new C291001Au(this.LL), c1585606Is.LL);
    }
}

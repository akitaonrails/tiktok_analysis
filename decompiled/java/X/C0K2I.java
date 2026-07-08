package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;

/* JADX INFO: renamed from: X.0K2I, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K2I extends AbstractC511160K2w {
    public final SpacePost LIZ;

    @Override // X.AbstractC511160K2w
    public final long LIZIZ() {
        return this.LIZ.postId;
    }

    @Override // X.AbstractC511160K2w
    public final SpacePost LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC511160K2w
    public final C0K2L LIZJ() {
        return C0K2L.SUB_ONLY_VIDEO;
    }

    public C0K2I(SpacePost spacePost) {
        this.LIZ = spacePost;
    }
}

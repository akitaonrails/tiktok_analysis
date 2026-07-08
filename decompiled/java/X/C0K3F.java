package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;

/* JADX INFO: renamed from: X.0K3F, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K3F extends AbstractC511160K2w {
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
        return C0K2L.TOPIC;
    }

    public C0K3F(SpacePost spacePost) {
        this.LIZ = spacePost;
    }
}

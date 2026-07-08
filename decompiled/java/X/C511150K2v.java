package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;

/* JADX INFO: renamed from: X.0K2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511150K2v extends AbstractC511160K2w {
    public SpacePost LIZ;

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
        return C0K2L.POLL;
    }

    public C511150K2v(SpacePost spacePost) {
        this.LIZ = spacePost;
    }
}

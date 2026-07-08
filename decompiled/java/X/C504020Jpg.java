package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;

/* JADX INFO: renamed from: X.0Jpg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504020Jpg extends AbstractC503810JpL {
    public final SpacePost LIZ;

    @Override // X.AbstractC503810JpL
    public final long LIZIZ() {
        return this.LIZ.postId;
    }

    @Override // X.AbstractC503810JpL
    public final SpacePost LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC503810JpL
    public final EnumC503250JoR LIZJ() {
        return EnumC503250JoR.SUB_ONLY_VIDEO;
    }

    public C504020Jpg(SpacePost spacePost) {
        this.LIZ = spacePost;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236171Cff extends Message.Builder<C2236151Cfd, C2236171Cff> {
    public String LIZLLL;
    public Long LJ;
    public Boolean LJFF;
    public Boolean LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236151Cfd build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C2236151Cfd(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "retry_count", this.LJFF, "is_persistence_video_mute_exist", this.LJI, "persistence_video_mute");
        throw null;
    }
}

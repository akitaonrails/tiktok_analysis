package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226711CDd extends Message.Builder<C2226691CDb, C2226711CDd> {
    public Boolean LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226691CDb build() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return new C2226691CDb(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "is_video_mute");
        throw null;
    }
}

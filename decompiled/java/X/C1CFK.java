package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CFK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFK extends Message.Builder<C1CFJ, C1CFK> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CFJ build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1CFJ(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "channel_id");
        throw null;
    }
}

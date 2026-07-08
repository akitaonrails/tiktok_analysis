package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CFQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFQ extends Message.Builder<C1CFP, C1CFQ> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CFP build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1CFP(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "group_channel_id");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CDG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDG extends Message.Builder<C1CDE, C1CDG> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CDE build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1CDE(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "volume");
        throw null;
    }
}

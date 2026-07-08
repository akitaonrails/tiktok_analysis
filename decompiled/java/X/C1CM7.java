package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CM7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CM7 extends Message.Builder<C1CM5, C1CM7> {
    public Long LIZLLL;
    public C1CMV LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CM5 build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1CM5(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "state_type");
        throw null;
    }
}

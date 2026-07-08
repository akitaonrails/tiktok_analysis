package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226001CAk extends Message.Builder<C2225981CAi, C2226001CAk> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2225981CAi build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C2225981CAi(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "config");
        throw null;
    }
}

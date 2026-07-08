package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CII, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CII extends Message.Builder<C1CIG, C1CII> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CIG build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C1CIG(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "type_id", this.LJ, "instance_id");
        throw null;
    }
}

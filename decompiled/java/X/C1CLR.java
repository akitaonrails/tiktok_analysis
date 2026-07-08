package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLR extends Message.Builder<C1CLP, C1CLR> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CLP build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CLP(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "business_id", this.LJ, "config_id");
        throw null;
    }
}

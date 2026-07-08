package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227511CGf extends Message.Builder<C2227501CGe, C2227511CGf> {
    public String LIZLLL;
    public C2227471CGb LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227501CGe build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C2227501CGe(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id");
        throw null;
    }
}

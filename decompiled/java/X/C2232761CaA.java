package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CaA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232761CaA extends Message.Builder<C2232731Ca7, C2232761CaA> {
    public String LIZLLL;
    public Boolean LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232731Ca7 build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2232731Ca7(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "mode", this.LJ, "has_split_line");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CFE, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFE extends Message.Builder<C1CFD, C1CFE> {
    public String LIZLLL;
    public EnumC2188991All LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CFD build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CFD(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "content", this.LJ, "dsl_source");
        throw null;
    }
}

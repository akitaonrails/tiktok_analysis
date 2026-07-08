package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CKQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKQ extends Message.Builder<C1CKP, C1CKQ> {
    public String LIZLLL;
    public EnumC1282030jSz LJ;
    public C2227531CGh LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CKP build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CKP(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "leave_reason");
        throw null;
    }
}

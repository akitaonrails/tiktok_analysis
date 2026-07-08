package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CW5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CW5 extends Message.Builder<C1CW4, C1CW5> {
    public EnumC1283240jUw LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CW4 build() {
        EnumC1283240jUw enumC1283240jUw = this.LIZLLL;
        if (enumC1283240jUw != null && this.LJ != null) {
            return new C1CW4(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC1283240jUw, "pos_type", this.LJ, "value");
        throw null;
    }
}

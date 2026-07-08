package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CPL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CPL extends Message.Builder<C1CPJ, C1CPL> {
    public String LIZLLL;
    public EnumC2183431Acn LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CPJ build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CPJ(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "switch_id", this.LJ, "key");
        throw null;
    }
}

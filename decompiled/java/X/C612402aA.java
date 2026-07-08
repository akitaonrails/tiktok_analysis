package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.02aA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C612402aA extends Message.Builder<C612202a8, C612402aA> {
    public String LIZLLL;
    public C591202Sg LJ;
    public C649902gD LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C612202a8 build() {
        return new C612202a8(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

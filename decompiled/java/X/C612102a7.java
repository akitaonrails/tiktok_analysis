package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.02a7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C612102a7 extends Message.Builder<C611902a5, C612102a7> {
    public Integer LIZLLL;
    public C612202a8 LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C611902a5 build() {
        return new C611902a5(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CVM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVM extends Message.Builder<C1CVK, C1CVM> {
    public C1CVI LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CVK build() {
        C1CVI c1cvi = this.LIZLLL;
        if (c1cvi != null) {
            return new C1CVK(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cvi, "flags");
        throw null;
    }
}

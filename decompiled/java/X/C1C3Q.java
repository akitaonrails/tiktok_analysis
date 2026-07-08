package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C3Q, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3Q extends Message.Builder<C1C3O, C1C3Q> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C3O build() {
        return new C1C3O(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

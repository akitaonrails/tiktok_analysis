package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CGG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CGG extends Message.Builder<C1CGF, C1CGG> {
    public EnumC2228611CKl LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CGF build() {
        EnumC2228611CKl enumC2228611CKl = this.LIZLLL;
        if (enumC2228611CKl != null) {
            return new C1CGF(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2228611CKl, "mode");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CNG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNG extends Message.Builder<C1CNE, C1CNG> {
    public Long LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CNE build() {
        return new C1CNE(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

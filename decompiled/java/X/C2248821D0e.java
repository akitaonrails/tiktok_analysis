package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248821D0e extends Message.Builder<C2248801D0c, C2248821D0e> {
    public C2248831D0f LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2248801D0c build() {
        return new C2248801D0c(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

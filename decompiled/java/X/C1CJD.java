package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CJD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJD extends Message.Builder<C1CJB, C1CJD> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CJB build() {
        return new C1CJB(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

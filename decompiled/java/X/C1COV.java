package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1COV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1COV extends Message.Builder<C1COU, C1COV> {
    public C029C LIZLLL;
    public C1COL LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1COU build() {
        return new C1COU(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

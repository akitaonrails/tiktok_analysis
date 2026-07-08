package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLO extends Message.Builder<C1CLM, C1CLO> {
    public C1CLP LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CLM build() {
        C1CLP c1clp = this.LIZLLL;
        if (c1clp != null) {
            return new C1CLM(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1clp, "ret");
        throw null;
    }
}

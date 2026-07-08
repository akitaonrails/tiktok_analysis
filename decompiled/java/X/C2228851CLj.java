package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228851CLj extends Message.Builder<C2228831CLh, C2228851CLj> {
    public C2229171CMp LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228831CLh build() {
        C2229171CMp c2229171CMp = this.LIZLLL;
        if (c2229171CMp != null) {
            return new C2228831CLh(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2229171CMp, "config");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228761CLa extends Message.Builder<C1CLY, C2228761CLa> {
    public C2229431CNp LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CLY build() {
        C2229431CNp c2229431CNp = this.LIZLLL;
        if (c2229431CNp != null) {
            return new C1CLY(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2229431CNp, "ret");
        throw null;
    }
}

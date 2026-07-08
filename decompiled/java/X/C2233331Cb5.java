package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233331Cb5 extends Message.Builder<C2233311Cb3, C2233331Cb5> {
    public C2233101Cai LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233311Cb3 build() {
        C2233101Cai c2233101Cai = this.LIZLLL;
        if (c2233101Cai != null) {
            return new C2233311Cb3(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2233101Cai, "key");
        throw null;
    }
}

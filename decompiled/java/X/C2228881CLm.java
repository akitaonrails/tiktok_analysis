package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228881CLm extends Message.Builder<C2228871CLl, C2228881CLm> {
    public C2228891CLn LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228871CLl build() {
        C2228891CLn c2228891CLn = this.LIZLLL;
        if (c2228891CLn != null) {
            return new C2228871CLl(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2228891CLn, "biz_info");
        throw null;
    }
}

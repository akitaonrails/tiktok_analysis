package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231541CVs extends Message.Builder<C2231521CVq, C2231541CVs> {
    public C2231491CVn LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2231521CVq build() {
        C2231491CVn c2231491CVn = this.LIZLLL;
        if (c2231491CVn != null) {
            return new C2231521CVq(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2231491CVn, "param");
        throw null;
    }
}

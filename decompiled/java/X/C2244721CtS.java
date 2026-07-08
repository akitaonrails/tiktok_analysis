package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CtS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244721CtS extends Message.Builder<C2244701CtQ, C2244721CtS> {
    public Long LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public Long LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2244701CtQ build() {
        return new C2244701CtQ(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}

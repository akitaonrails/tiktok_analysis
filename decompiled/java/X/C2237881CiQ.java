package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237881CiQ extends Message.Builder<C2237861CiO, C2237881CiQ> {
    public Long LIZLLL;
    public String LJ;
    public C2237221ChM LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237861CiO build() {
        return new C2237861CiO(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

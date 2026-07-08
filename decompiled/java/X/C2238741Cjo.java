package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238741Cjo extends Message.Builder<C2238721Cjm, C2238741Cjo> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2238721Cjm build() {
        return new C2238721Cjm(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

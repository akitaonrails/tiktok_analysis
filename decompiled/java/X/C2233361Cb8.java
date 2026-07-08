package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233361Cb8 extends Message.Builder<C2233351Cb7, C2233361Cb8> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233351Cb7 build() {
        return new C2233351Cb7(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

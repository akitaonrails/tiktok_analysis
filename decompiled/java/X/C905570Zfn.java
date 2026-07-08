package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Zfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905570Zfn extends Message.Builder<C905500Zfg, C905570Zfn> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public C905520Zfi LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C905500Zfg build() {
        return new C905500Zfg(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

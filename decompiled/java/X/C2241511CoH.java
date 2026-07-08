package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241511CoH extends Message.Builder<C2241421Co8, C2241511CoH> {
    public String LIZLLL;
    public Integer LJ;
    public String LJFF;
    public String LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241421Co8 build() {
        return new C2241421Co8(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}

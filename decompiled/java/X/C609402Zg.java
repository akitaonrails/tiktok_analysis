package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.02Zg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C609402Zg extends Message.Builder<C609202Ze, C609402Zg> {
    public final C1504900pGS LIZLLL = C1516540pZE.LJIIIIZZ();
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C609202Ze build() {
        return new C609202Ze(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

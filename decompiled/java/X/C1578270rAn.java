package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0rAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578270rAn extends Message.Builder<C1578260rAm, C1578270rAn> {
    public Integer LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1578260rAm build() {
        return new C1578260rAm(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

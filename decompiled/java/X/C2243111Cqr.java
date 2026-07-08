package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243111Cqr extends Message.Builder<C2243061Cqm, C2243111Cqr> {
    public C2244091CsR LIZLLL;
    public C2243521CrW LJ;
    public C2243521CrW LJFF;
    public C2243081Cqo LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2243061Cqm build() {
        return new C2243061Cqm(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

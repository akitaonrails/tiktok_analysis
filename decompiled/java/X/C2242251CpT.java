package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242251CpT extends Message.Builder<C2242201CpO, C2242251CpT> {
    public C2244091CsR LIZLLL;
    public C2243521CrW LJ;
    public C2244321Cso LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2242201CpO build() {
        return new C2242201CpO(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

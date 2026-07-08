package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1COh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229611COh extends Message.Builder<C2229591COf, C2229611COh> {
    public C1CXB LIZLLL;
    public Double LJ;
    public Long LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229591COf build() {
        C1CXB c1cxb = this.LIZLLL;
        if (c1cxb != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C2229591COf(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cxb, "timer_type", this.LJ, "duration", this.LJFF, "uid", this.LJI, "callback");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236291Cfr extends Message.Builder<C2236271Cfp, C2236291Cfr> {
    public EnumC2231891CXb LIZLLL;
    public EnumC972810bQF LJ;
    public Long LJFF;
    public C2236781Cge LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236271Cfp build() {
        EnumC2231891CXb enumC2231891CXb = this.LIZLLL;
        if (enumC2231891CXb != null && this.LJ != null && this.LJFF != null) {
            return new C2236271Cfp(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2231891CXb, "display_id", this.LJ, "layout_style", this.LJFF, "max_position");
        throw null;
    }
}

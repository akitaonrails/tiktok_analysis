package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CRo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230461CRo extends Message.Builder<C2230441CRm, C2230461CRo> {
    public String LIZLLL;
    public EnumC2231811CWt LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230441CRm build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2230441CRm(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "switch_id", this.LJ, "code");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230491CRr extends Message.Builder<C2230471CRp, C2230491CRr> {
    public EnumC2231811CWt LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230471CRp build() {
        EnumC2231811CWt enumC2231811CWt = this.LIZLLL;
        if (enumC2231811CWt != null && this.LJ != null) {
            return new C2230471CRp(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2231811CWt, "code", this.LJ, "msg");
        throw null;
    }
}

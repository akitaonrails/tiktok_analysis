package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CfN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235991CfN extends Message.Builder<C2235971CfL, C2235991CfN> {
    public C2235941CfI LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235971CfL build() {
        C2235941CfI c2235941CfI = this.LIZLLL;
        if (c2235941CfI != null && this.LJ != null) {
            return new C2235971CfL(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2235941CfI, "param", this.LJ, "callback");
        throw null;
    }
}

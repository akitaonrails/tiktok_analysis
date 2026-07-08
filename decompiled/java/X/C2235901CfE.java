package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235901CfE extends Message.Builder<C2235881CfC, C2235901CfE> {
    public C2235911CfF LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235881CfC build() {
        C2235911CfF c2235911CfF = this.LIZLLL;
        if (c2235911CfF != null && this.LJ != null) {
            return new C2235881CfC(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2235911CfF, "param", this.LJ, "callback");
        throw null;
    }
}

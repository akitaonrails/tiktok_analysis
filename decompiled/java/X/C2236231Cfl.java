package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cfl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236231Cfl extends Message.Builder<C2236211Cfj, C2236231Cfl> {
    public C2236241Cfm LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236211Cfj build() {
        C2236241Cfm c2236241Cfm = this.LIZLLL;
        if (c2236241Cfm != null && this.LJ != null) {
            return new C2236211Cfj(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2236241Cfm, "param", this.LJ, "callback");
        throw null;
    }
}

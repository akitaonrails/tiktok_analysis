package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CX6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CX6 extends Message.Builder<C2231851CWx, C1CX6> {
    public C2232401CZa LIZLLL;
    public C1CXS LJ;
    public C1CXS LJFF;
    public EnumC2231841CWw LJI;
    public C1CZO LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2231851CWx build() {
        C2232401CZa c2232401CZa = this.LIZLLL;
        if (c2232401CZa != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C2231851CWx(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232401CZa, "link_state", this.LJ, "new_state", this.LJFF, "old_state", this.LJI, "trigger_event");
        throw null;
    }
}

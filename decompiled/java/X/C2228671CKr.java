package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228671CKr extends Message.Builder<C2228651CKp, C2228671CKr> {
    public String LIZLLL;
    public String LJ;
    public Long LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228651CKp build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C2228651CKp(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "key", this.LJ, "value", this.LJFF, "repeat_times", this.LJI, "data_flow_id");
        throw null;
    }
}

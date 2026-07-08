package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLC extends Message.Builder<C1CLA, C1CLC> {
    public String LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CLA build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C1CLA(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "stream_id", this.LJ, "width", this.LJFF, "height", this.LJI, "fps");
        throw null;
    }
}

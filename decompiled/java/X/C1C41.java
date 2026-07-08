package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C41, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C41 extends Message.Builder<C2224331C3z, C1C41> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2224331C3z build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new C2224331C3z(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "room_id", this.LJ, "token", this.LJFF, "rtc_ext_info");
        throw null;
    }
}

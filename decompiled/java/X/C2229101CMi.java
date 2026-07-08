package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229101CMi extends Message.Builder<C2229081CMg, C2229101CMi> {
    public String LIZLLL;
    public EnumC2229031CMb LJ;
    public String LJFF;
    public ByteString LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229081CMg build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C2229081CMg(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "url", this.LJ, "method", this.LJFF, "invoke_id", this.LJI, "body");
        throw null;
    }
}

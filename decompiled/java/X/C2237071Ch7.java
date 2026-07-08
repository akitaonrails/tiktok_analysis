package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Ch7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237071Ch7 extends Message.Builder<C2237061Ch6, C2237071Ch7> {
    public EnumC2232091CXv LIZLLL;
    public ByteString LJ;
    public C2237111ChB LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237061Ch6 build() {
        EnumC2232091CXv enumC2232091CXv = this.LIZLLL;
        if (enumC2232091CXv != null && this.LJ != null && this.LJFF != null) {
            return new C2237061Ch6(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2232091CXv, "encode_type", this.LJ, "content", this.LJFF, "extra");
        throw null;
    }
}

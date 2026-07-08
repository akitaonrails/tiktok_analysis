package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CUl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231211CUl extends Message.Builder<C2231191CUj, C2231211CUl> {
    public EnumC2231221CUm LIZLLL;
    public ByteString LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2231191CUj build() {
        EnumC2231221CUm enumC2231221CUm = this.LIZLLL;
        if (enumC2231221CUm != null && this.LJ != null) {
            return new C2231191CUj(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2231221CUm, "compensate_type", this.LJ, "message");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CSO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSO extends Message.Builder<C1CSM, C1CSO> {
    public ByteString LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CSM build() {
        String str = this.LJ;
        if (str != null) {
            return new C1CSM(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "link_mic_id");
        throw null;
    }
}

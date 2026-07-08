package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229641COk extends Message.Builder<C2229621COi, C2229641COk> {
    public String LIZLLL;
    public ByteString LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229621COi build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2229621COi(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "source", this.LJ, "perception_info");
        throw null;
    }
}

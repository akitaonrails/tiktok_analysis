package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMF extends Message.Builder<C1CMD, C1CMF> {
    public String LIZLLL;
    public C1CMV LJ;
    public ByteString LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CMD build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CMD(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "error");
        throw null;
    }
}

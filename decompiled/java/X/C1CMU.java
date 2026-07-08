package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMU extends Message.Builder<C1CMS, C1CMU> {
    public ByteString LIZLLL;
    public ByteString LJ;
    public Map<String, String> LJFF = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CMS build() {
        ByteString byteString = this.LIZLLL;
        if (byteString != null && this.LJ != null) {
            return new C1CMS(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(byteString, "rsp_data", this.LJ, "biz_data");
        throw null;
    }
}

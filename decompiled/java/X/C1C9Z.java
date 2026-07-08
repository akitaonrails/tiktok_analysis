package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncParamsXa21f4fe194d7eeb2;

/* JADX INFO: renamed from: X.1C9Z, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C9Z extends Message.Builder<FuncParamsXa21f4fe194d7eeb2, C1C9Z> {
    public String LIZLLL;
    public Map<String, String> LJ = new LinkedHashMap();
    public ByteString LJFF;
    public Long LJI;
    public Boolean LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final FuncParamsXa21f4fe194d7eeb2 build() {
        String str = this.LIZLLL;
        if (str != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new FuncParamsXa21f4fe194d7eeb2(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "url", this.LJFF, "body", this.LJI, "timeout_ms", this.LJII, "add_comm_param");
        throw null;
    }
}

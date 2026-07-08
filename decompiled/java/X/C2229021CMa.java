package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229021CMa extends Message.Builder<C1CMY, C2229021CMa> {
    public String LIZLLL;
    public EnumC2229031CMb LJ;
    public String LJFF;
    public Map<String, String> LJI = new LinkedHashMap();
    public C1CMV LJII;
    public ByteString LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CMY build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJIIIIZZ != null) {
            return new C1CMY(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "url", this.LJ, "method", this.LJFF, "request_id", this.LJIIIIZZ, "body");
        throw null;
    }
}

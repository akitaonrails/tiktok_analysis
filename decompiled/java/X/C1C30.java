package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1C30, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C30 extends Message.Builder<C2224061C2y, C1C30> {
    public String LIZLLL;
    public Map<String, String> LJ = new LinkedHashMap();
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2224061C2y build() {
        String str = this.LIZLLL;
        if (str != null && this.LJFF != null) {
            return new C2224061C2y(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "event", this.LJFF, "level");
        throw null;
    }
}

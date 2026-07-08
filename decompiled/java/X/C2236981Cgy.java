package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1Cgy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236981Cgy extends Message.Builder<C2236961Cgw, C2236981Cgy> {
    public String LIZLLL;
    public EnumC2183061AcC LJ;
    public String LJFF;
    public Map<String, String> LJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236961Cgw build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new C2236961Cgw(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "tag", this.LJ, "level", this.LJFF, "message");
        throw null;
    }
}

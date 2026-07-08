package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1CoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241551CoL extends Message.Builder<C2241571CoN, C2241551CoL> {
    public C2241591CoP LIZLLL;
    public Long LJFF;
    public List<String> LJ = C1516540pZE.LJIIIIZZ();
    public Map<String, String> LJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241571CoN build() {
        return new C2241571CoN(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

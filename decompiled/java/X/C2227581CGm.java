package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1CGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227581CGm extends Message.Builder<C2227561CGk, C2227581CGm> {
    public String LIZLLL;
    public C2232021CXo LJ;
    public Map<String, String> LJFF = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227561CGk build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2227561CGk(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "invitee");
        throw null;
    }
}

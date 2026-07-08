package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226571CCp extends Message.Builder<C2226551CCn, C2226571CCp> {
    public List<Long> LIZLLL = C1516540pZE.LJIIIIZZ();
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226551CCn build() {
        String str = this.LJ;
        if (str != null) {
            return new C2226551CCn(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "source");
        throw null;
    }
}

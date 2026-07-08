package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CF0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CF0 extends Message.Builder<C2227181CEy, C1CF0> {
    public List<C2232021CXo> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227181CEy build() {
        return new C2227181CEy(this.LIZLLL, buildUnknownFields());
    }
}

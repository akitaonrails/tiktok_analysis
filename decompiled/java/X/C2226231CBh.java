package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226231CBh extends Message.Builder<C2226211CBf, C2226231CBh> {
    public List<C2226181CBc> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226211CBf build() {
        return new C2226211CBf(this.LIZLLL, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224121C3e extends Message.Builder<C2224101C3c, C2224121C3e> {
    public List<C2224331C3z> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2224101C3c build() {
        return new C2224101C3c(this.LIZLLL, buildUnknownFields());
    }
}

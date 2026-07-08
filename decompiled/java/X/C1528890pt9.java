package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0pt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528890pt9 extends Message.Builder<C1528870pt7, C1528890pt9> {
    public List<C2233281Cb0> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1528870pt7 build() {
        return new C1528870pt7(this.LIZLLL, buildUnknownFields());
    }
}

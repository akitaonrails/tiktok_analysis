package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C36, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C36 extends Message.Builder<C1C34, C1C36> {
    public List<String> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C34 build() {
        return new C1C34(this.LIZLLL, buildUnknownFields());
    }
}

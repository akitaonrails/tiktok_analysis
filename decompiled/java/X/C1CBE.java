package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CBE, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBE extends Message.Builder<C1CBD, C1CBE> {
    public List<C1CB9> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CBD build() {
        return new C1CBD(this.LIZLLL, buildUnknownFields());
    }
}

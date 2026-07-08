package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0ZhI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906500ZhI extends Message.Builder<C906450ZhD, C906500ZhI> {
    public List<C906460ZhE> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C906450ZhD build() {
        return new C906450ZhD(this.LIZLLL, buildUnknownFields());
    }
}

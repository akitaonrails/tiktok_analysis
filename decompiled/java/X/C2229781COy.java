package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1COy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229781COy extends Message.Builder<C2229771COx, C2229781COy> {
    public List<C2229741COu> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229771COx build() {
        return new C2229771COx(this.LIZLLL, buildUnknownFields());
    }
}

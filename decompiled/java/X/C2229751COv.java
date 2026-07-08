package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1COv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229751COv extends Message.Builder<C2229741COu, C2229751COv> {
    public String LIZLLL;
    public List<C2229711COr> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229741COu build() {
        return new C2229741COu(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1D0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248791D0b extends Message.Builder<C1D0Z, C2248791D0b> {
    public C2248801D0c LIZLLL;
    public C2248801D0c LJ;
    public C898010ZKt LJFF;
    public List<String> LJI = C1516540pZE.LJIIIIZZ();
    public C1D0R LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1D0Z build() {
        return new C1D0Z(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}

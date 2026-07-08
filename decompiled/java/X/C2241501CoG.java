package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CoG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241501CoG extends Message.Builder<C2241451CoB, C2241501CoG> {
    public C2244091CsR LIZLLL;
    public List<C2237861CiO> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241451CoB build() {
        return new C2241451CoB(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

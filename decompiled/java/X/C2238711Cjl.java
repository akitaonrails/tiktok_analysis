package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Cjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238711Cjl extends Message.Builder<C2238691Cjj, C2238711Cjl> {
    public String LIZLLL;
    public List<C2238721Cjm> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2238691Cjj build() {
        return new C2238691Cjj(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

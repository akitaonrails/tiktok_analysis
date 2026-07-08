package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Csn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244311Csn extends Message.Builder<C2244321Cso, C2244311Csn> {
    public List<String> LIZLLL = C1516540pZE.LJIIIIZZ();
    public EnumC2244361Css LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2244321Cso build() {
        return new C2244321Cso(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

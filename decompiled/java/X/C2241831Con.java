package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Con, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241831Con extends Message.Builder<C2241801Cok, C2241831Con> {
    public String LIZLLL;
    public List<C2241841Coo> LJ = C1516540pZE.LJIIIIZZ();
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241801Cok build() {
        return new C2241801Cok(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

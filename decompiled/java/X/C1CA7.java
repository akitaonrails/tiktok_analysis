package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CA7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CA7 extends Message.Builder<C1CA6, C1CA7> {
    public EnumC19363410pE LIZLLL;
    public C2239531Cl5 LJ;
    public List<C1CA0> LJFF = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CA6 build() {
        return new C1CA6(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

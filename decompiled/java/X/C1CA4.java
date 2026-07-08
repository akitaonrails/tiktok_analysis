package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CA4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CA4 extends Message.Builder<C1CA3, C1CA4> {
    public List<C1CA0> LIZLLL = C1516540pZE.LJIIIIZZ();
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CA3 build() {
        return new C1CA3(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

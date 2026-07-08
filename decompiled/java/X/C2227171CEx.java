package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227171CEx extends Message.Builder<C2227151CEv, C2227171CEx> {
    public List<C2232021CXo> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227151CEv build() {
        return new C2227151CEv(this.LIZLLL, buildUnknownFields());
    }
}

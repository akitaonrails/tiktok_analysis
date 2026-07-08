package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C3H, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3H extends Message.Builder<C1C3F, C1C3H> {
    public List<C2272721DxW> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C3F build() {
        return new C1C3F(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

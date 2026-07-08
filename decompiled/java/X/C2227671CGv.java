package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227671CGv extends Message.Builder<C2227651CGt, C2227671CGv> {
    public List<Float> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Float LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227651CGt build() {
        return new C2227651CGt(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

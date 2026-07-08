package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527200pqQ extends Message.Builder<C1527080pqE, C1527200pqQ> {
    public Integer LIZLLL;
    public EnumC1527610pr5 LJ;
    public String LJFF;
    public ByteString LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1527080pqE build() {
        Integer num = this.LIZLLL;
        if (num != null) {
            return new C1527080pqE(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "business");
        throw null;
    }
}

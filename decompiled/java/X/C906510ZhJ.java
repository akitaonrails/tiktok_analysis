package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0ZhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906510ZhJ extends Message.Builder<C906460ZhE, C906510ZhJ> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C906460ZhE build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C906460ZhE(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "key", this.LJ, "value");
        throw null;
    }
}

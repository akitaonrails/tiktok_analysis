package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CQ8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQ8 extends Message.Builder<C1CQ7, C1CQ8> {
    public C1CQI LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CQ7 build() {
        C1CQI c1cqi = this.LIZLLL;
        if (c1cqi != null) {
            return new C1CQ7(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cqi, "ret");
        throw null;
    }
}

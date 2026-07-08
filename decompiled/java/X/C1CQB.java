package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CQB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQB extends Message.Builder<C1CQ9, C1CQB> {
    public C1CQI LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CQ9 build() {
        C1CQI c1cqi = this.LIZLLL;
        if (c1cqi != null) {
            return new C1CQ9(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cqi, "root_flow");
        throw null;
    }
}

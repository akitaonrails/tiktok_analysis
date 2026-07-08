package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0ZhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906540ZhM extends Message.Builder<C906410Zh9, C906540ZhM> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C906410Zh9 build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C906410Zh9(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "text");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CED, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CED extends Message.Builder<C1CEC, C1CED> {
    public Boolean LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CEC build() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return new C1CEC(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "ret");
        throw null;
    }
}

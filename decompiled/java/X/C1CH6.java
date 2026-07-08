package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CH6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CH6 extends Message.Builder<C1CH4, C1CH6> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CH4 build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C1CH4(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "reason");
        throw null;
    }
}

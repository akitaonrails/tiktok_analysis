package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CHC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHC extends Message.Builder<C1CHB, C1CHC> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CHB build() {
        return new C1CHB(this.LIZLLL, buildUnknownFields());
    }
}

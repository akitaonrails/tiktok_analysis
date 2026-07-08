package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CHV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHV extends Message.Builder<C1CHU, C1CHV> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CHU build() {
        return new C1CHU(this.LIZLLL, buildUnknownFields());
    }
}

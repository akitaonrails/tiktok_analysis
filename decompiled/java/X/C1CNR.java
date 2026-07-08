package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CNR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNR extends Message.Builder<C1CNQ, C1CNR> {
    public C1CNM LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CNQ build() {
        return new C1CNQ(this.LIZLLL, buildUnknownFields());
    }
}

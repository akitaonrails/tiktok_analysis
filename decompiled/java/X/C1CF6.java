package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CF6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CF6 extends Message.Builder<C1CF5, C1CF6> {
    public C2232021CXo LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CF5 build() {
        return new C1CF5(this.LIZLLL, buildUnknownFields());
    }
}

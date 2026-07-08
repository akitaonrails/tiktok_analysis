package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CE4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CE4 extends Message.Builder<C1CE3, C1CE4> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CE3 build() {
        return new C1CE3(this.LIZLLL, buildUnknownFields());
    }
}

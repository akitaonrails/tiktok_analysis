package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CoR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241611CoR extends Message.Builder<C2241591CoP, C2241611CoR> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241591CoP build() {
        return new C2241591CoP(this.LIZLLL, buildUnknownFields());
    }
}

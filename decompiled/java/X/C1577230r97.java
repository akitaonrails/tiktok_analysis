package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0r97, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577230r97 extends Message.Builder<C1577210r95, C1577230r97> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1577210r95 build() {
        return new C1577210r95(this.LIZLLL, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CE7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CE7 extends Message.Builder<C1CE6, C1CE7> {
    public Boolean LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CE6 build() {
        return new C1CE6(this.LIZLLL, buildUnknownFields());
    }
}

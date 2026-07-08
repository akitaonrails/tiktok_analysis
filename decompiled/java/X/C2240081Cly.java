package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240081Cly extends Message.Builder<C2240071Clx, C2240081Cly> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2240071Clx build() {
        return new C2240071Clx(this.LIZLLL, buildUnknownFields());
    }
}

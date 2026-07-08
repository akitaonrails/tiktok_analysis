package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cn0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240721Cn0 extends Message.Builder<C2240711Cmz, C2240721Cn0> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2240711Cmz build() {
        return new C2240711Cmz(this.LIZLLL, buildUnknownFields());
    }
}

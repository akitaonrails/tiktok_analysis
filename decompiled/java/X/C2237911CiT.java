package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237911CiT extends Message.Builder<C2237891CiR, C2237911CiT> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237891CiR build() {
        return new C2237891CiR(this.LIZLLL, buildUnknownFields());
    }
}

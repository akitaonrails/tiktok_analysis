package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240211CmB extends Message.Builder<C2240191Cm9, C2240211CmB> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2240191Cm9 build() {
        return new C2240191Cm9(this.LIZLLL, buildUnknownFields());
    }
}

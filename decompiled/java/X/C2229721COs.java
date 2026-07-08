package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1COs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229721COs extends Message.Builder<C2229711COr, C2229721COs> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229711COr build() {
        return new C2229711COr(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

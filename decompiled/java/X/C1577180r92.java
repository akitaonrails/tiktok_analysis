package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0r92, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577180r92 extends Message.Builder<C1577160r90, C1577180r92> {
    public Long LIZLLL;
    public C1577050r8p LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1577160r90 build() {
        return new C1577160r90(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DAT, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DAT extends Message.Builder<C1DAR, C1DAT> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1DAR build() {
        return new C1DAR(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

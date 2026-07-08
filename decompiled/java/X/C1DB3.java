package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DB3, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DB3 extends Message.Builder<C1DB2, C1DB3> {
    public Double LIZLLL;
    public Integer LJ;
    public Double LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1DB2 build() {
        return new C1DB2(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

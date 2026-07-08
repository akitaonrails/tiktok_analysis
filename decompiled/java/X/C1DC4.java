package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DC4, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DC4 extends Message.Builder<C1DC3, C1DC4> {
    public String LIZLLL;
    public String LJ;
    public C1DCW LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1DC3 build() {
        return new C1DC3(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

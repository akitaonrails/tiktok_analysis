package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DAB, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DAB extends Message.Builder<C1DA9, C1DAB> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1DA9 build() {
        return new C1DA9(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Csh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244251Csh extends Message.Builder<C2244161CsY, C2244251Csh> {
    public Integer LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2244161CsY build() {
        return new C2244161CsY(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

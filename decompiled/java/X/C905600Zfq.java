package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Zfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905600Zfq extends Message.Builder<C905460Zfc, C905600Zfq> {
    public C905410ZfX LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C905460Zfc build() {
        return new C905460Zfc(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

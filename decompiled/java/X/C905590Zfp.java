package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Zfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905590Zfp extends Message.Builder<C905520Zfi, C905590Zfp> {
    public Long LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C905520Zfi build() {
        return new C905520Zfi(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

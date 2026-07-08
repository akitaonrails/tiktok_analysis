package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Zfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905610Zfr extends Message.Builder<C905540Zfk, C905610Zfr> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C905540Zfk build() {
        return new C905540Zfk(this.LIZLLL, buildUnknownFields());
    }
}

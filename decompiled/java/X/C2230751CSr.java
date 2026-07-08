package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CSr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230751CSr extends Message.Builder<C2230731CSp, C2230751CSr> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230731CSp build() {
        return new C2230731CSp(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CK0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CK0 extends Message.Builder<C2228481CJy, C1CK0> {
    public String LIZLLL;
    public Long LJ;
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228481CJy build() {
        return new C2228481CJy(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

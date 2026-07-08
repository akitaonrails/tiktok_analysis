package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CSo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230721CSo extends Message.Builder<C2230701CSm, C2230721CSo> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230701CSm build() {
        return new C2230701CSm(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

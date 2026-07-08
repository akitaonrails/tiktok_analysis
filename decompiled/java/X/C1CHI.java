package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CHI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHI extends Message.Builder<C1CHH, C1CHI> {
    public Integer LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CHH build() {
        return new C1CHH(this.LIZLLL, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CHF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHF extends Message.Builder<C1CHD, C1CHF> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CHD build() {
        return new C1CHD(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

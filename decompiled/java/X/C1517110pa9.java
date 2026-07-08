package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0pa9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517110pa9 extends Message.Builder<C1517090pa7, C1517110pa9> {
    public Integer LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1517090pa7 build() {
        return new C1517090pa7(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

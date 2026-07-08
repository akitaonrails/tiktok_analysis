package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CHM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHM extends Message.Builder<C1CHK, C1CHM> {
    public Boolean LIZLLL;
    public Boolean LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CHK build() {
        return new C1CHK(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

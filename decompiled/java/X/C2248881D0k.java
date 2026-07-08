package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248881D0k extends Message.Builder<C2248861D0i, C2248881D0k> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2248861D0i build() {
        return new C2248861D0i(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

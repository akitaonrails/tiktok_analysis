package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248851D0h extends Message.Builder<C2248831D0f, C2248851D0h> {
    public Long LIZLLL;
    public String LJ;
    public C2248861D0i LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2248831D0f build() {
        return new C2248831D0f(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

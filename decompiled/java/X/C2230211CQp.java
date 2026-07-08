package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230211CQp extends Message.Builder<C2230191CQn, C2230211CQp> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public EnumC2230231CQr LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230191CQn build() {
        return new C2230191CQn(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

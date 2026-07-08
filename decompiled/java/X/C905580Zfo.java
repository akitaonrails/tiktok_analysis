package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Zfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905580Zfo extends Message.Builder<C905440Zfa, C905580Zfo> {
    public Long LIZLLL;
    public String LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C905440Zfa build() {
        return new C905440Zfa(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233991Cc9 extends Message.Builder<C2233971Cc7, C2233991Cc9> {
    public C2233671Cbd LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233971Cc7 build() {
        C2233671Cbd c2233671Cbd = this.LIZLLL;
        if (c2233671Cbd != null && this.LJ != null) {
            return new C2233971Cc7(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2233671Cbd, "sei_layout_model", this.LJ, "time_stamp");
        throw null;
    }
}

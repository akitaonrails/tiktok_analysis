package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236411Cg3 extends Message.Builder<C2236391Cg1, C2236411Cg3> {
    public String LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236391Cg1 build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2236391Cg1(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "kick_out_all_reason");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231351CUz extends Message.Builder<C2231331CUx, C2231351CUz> {
    public Long LIZLLL;
    public EnumC2183371Ach LJ;
    public C1CZO LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2231331CUx build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C2231331CUx(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "uid", this.LJ, "link_arch_type", this.LJFF, "user_link_state_change_context");
        throw null;
    }
}

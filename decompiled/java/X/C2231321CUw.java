package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231321CUw extends Message.Builder<C2231301CUu, C2231321CUw> {
    public String LIZLLL;
    public EnumC2183371Ach LJ;
    public C1CZU LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2231301CUu build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new C2231301CUu(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "link_mic_id", this.LJ, "link_arch_type", this.LJFF, "user_link_rtc_state_change_context");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Ced, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235531Ced extends Message.Builder<C2235511Ceb, C2235531Ced> {
    public String LIZLLL;
    public EnumC1282070jT3 LJ;
    public EnumC2183371Ach LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235511Ceb build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new C2235511Ceb(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "finish_reason", this.LJFF, "link_arch_type");
        throw null;
    }
}

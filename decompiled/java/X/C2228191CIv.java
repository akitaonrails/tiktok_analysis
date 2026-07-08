package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228191CIv extends Message.Builder<C2228181CIu, C2228191CIv> {
    public Long LIZLLL;
    public EnumC2183371Ach LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228181CIu build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C2228181CIu(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "uid", this.LJ, "link_arch_type");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228221CIy extends Message.Builder<C2228211CIx, C2228221CIy> {
    public Boolean LIZLLL;
    public EnumC2183371Ach LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228211CIx build() {
        Boolean bool = this.LIZLLL;
        if (bool != null && this.LJ != null) {
            return new C2228211CIx(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "interrupted_by_co_host", this.LJ, "arch_type");
        throw null;
    }
}

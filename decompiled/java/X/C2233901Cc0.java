package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233901Cc0 extends Message.Builder<C2233881Cby, C2233901Cc0> {
    public EnumC2183371Ach LIZLLL;
    public EnumC2182321Ab0 LJ;
    public C2233611CbX LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233881Cby build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJ != null && this.LJFF != null) {
            return new C2233881Cby(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "arch_type", this.LJ, "source", this.LJFF, "biz_source");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Ch4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237041Ch4 extends Message.Builder<C2237021Ch2, C2237041Ch4> {
    public EnumC2183061AcC LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237021Ch2 build() {
        EnumC2183061AcC enumC2183061AcC = this.LIZLLL;
        if (enumC2183061AcC != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C2237021Ch2(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183061AcC, "level", this.LJ, "tag", this.LJFF, "message", this.LJI, "extra");
        throw null;
    }
}

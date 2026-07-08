package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CWH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CWH extends Message.Builder<C1CWF, C1CWH> {
    public EnumC2183371Ach LIZLLL;
    public C1CW4 LJ;
    public C1CWW LJFF;
    public C1CWW LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CWF build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C1CWF(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "arch_type", this.LJ, "identity", this.LJFF, "old_state", this.LJI, "new_state");
        throw null;
    }
}

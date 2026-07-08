package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236261Cfo extends Message.Builder<C2236241Cfm, C2236261Cfo> {
    public String LIZLLL;
    public Long LJ;
    public String LJFF;
    public C2236271Cfp LJI;
    public EnumC2183371Ach LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236241Cfm build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJII != null) {
            return new C2236241Cfm(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "max_position", this.LJFF, "layout_id", this.LJII, "link_arch_type");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cbl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233751Cbl extends Message.Builder<C2233731Cbj, C2233751Cbl> {
    public C2233701Cbg LIZLLL;
    public EnumC2182351Ab3 LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233731Cbj build() {
        C2233701Cbg c2233701Cbg = this.LIZLLL;
        if (c2233701Cbg != null && this.LJ != null) {
            return new C2233731Cbj(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2233701Cbg, "simple_sei_model", this.LJ, "layout_scene");
        throw null;
    }
}

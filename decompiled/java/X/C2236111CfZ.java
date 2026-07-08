package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236111CfZ extends Message.Builder<C2236091CfX, C2236111CfZ> {
    public String LIZLLL;
    public Long LJ;
    public String LJFF;
    public Long LJI;
    public C2227601CGo LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236091CfX build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new C2236091CfX(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "max_position", this.LJFF, "layout_id", this.LJI, "scene_version", this.LJII, "biz_params");
        throw null;
    }
}

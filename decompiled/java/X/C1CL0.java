package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1CL0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CL0 extends Message.Builder<C2228751CKz, C1CL0> {
    public Long LIZLLL;
    public Long LJ;
    public Double LJFF;
    public Double LJI;
    public Map<String, String> LJII = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228751CKz build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C2228751CKz(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "canvas_width", this.LJ, "canvas_height", this.LJFF, "window_width_ratio", this.LJI, "window_height_ratio");
        throw null;
    }
}

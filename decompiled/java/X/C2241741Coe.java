package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1Coe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241741Coe extends Message.Builder<C2241771Coh, C2241741Coe> {
    public C2241801Cok LIZLLL;
    public C2241761Cog LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public Map<String, String> LJII = new LinkedHashMap();
    public C2242211CpP LJIIIIZZ;
    public C2243941CsC LJIIIZ;
    public C1CH0 LJIIJ;
    public C2241571CoN LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241771Coh build() {
        return new C2241771Coh(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiScene;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackage;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyResp;
import java.util.List;

/* JADX INFO: renamed from: X.1C1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223761C1u extends Message.Builder<CaiStrategyResp, C2223761C1u> {
    public List<CaiScene> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<String> LJ = C1516540pZE.LJIIIIZZ();
    public List<CaiStrategyPackage> LJFF = C1516540pZE.LJIIIIZZ();
    public List<String> LJI = C1516540pZE.LJIIIIZZ();
    public Integer LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiStrategyResp build() {
        Integer num = this.LJII;
        if (num != null) {
            return new CaiStrategyResp(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "update_type");
        throw null;
    }
}

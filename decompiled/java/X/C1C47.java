package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAction;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageBind;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageConditionGroup;
import java.util.List;

/* JADX INFO: renamed from: X.1C47, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C47 extends Message.Builder<CaiStrategyPackageBind, C1C47> {
    public String LIZLLL;
    public List<CaiStrategyPackageConditionGroup> LJ = C1516540pZE.LJIIIIZZ();
    public List<String> LJFF = C1516540pZE.LJIIIIZZ();
    public List<CaiAction> LJI = C1516540pZE.LJIIIIZZ();
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiStrategyPackageBind build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new CaiStrategyPackageBind(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "package_id");
        throw null;
    }
}

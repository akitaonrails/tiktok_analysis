package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageCondition;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageConditionGroup;
import java.util.List;

/* JADX INFO: renamed from: X.1C43, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C43 extends Message.Builder<CaiStrategyPackageConditionGroup, C1C43> {
    public List<CaiStrategyPackageCondition> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiStrategyPackageConditionGroup build() {
        return new CaiStrategyPackageConditionGroup(this.LIZLLL, buildUnknownFields());
    }
}

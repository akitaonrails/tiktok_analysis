package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageCondition;

/* JADX INFO: renamed from: X.1C45, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C45 extends Message.Builder<CaiStrategyPackageCondition, C1C45> {
    public Integer LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiStrategyPackageCondition build() {
        Integer num = this.LIZLLL;
        if (num != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new CaiStrategyPackageCondition(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "ty", this.LJ, "lhs", this.LJFF, "op", this.LJI, "rhs");
        throw null;
    }
}

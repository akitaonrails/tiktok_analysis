package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionManageScene;

/* JADX INFO: renamed from: X.1BzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223031BzZ extends Message.Builder<CaiActionManageScene.StrategyOperation, C2223031BzZ> {
    public String LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiActionManageScene.StrategyOperation build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new CaiActionManageScene.StrategyOperation(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "strategy_key", this.LJ, "operator");
        throw null;
    }
}

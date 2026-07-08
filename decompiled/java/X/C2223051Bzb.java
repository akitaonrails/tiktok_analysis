package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionManageScene;

/* JADX INFO: renamed from: X.1Bzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223051Bzb extends Message.Builder<CaiActionManageScene, C2223051Bzb> {
    public CaiActionManageScene.StrategyOperation LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiActionManageScene build() {
        return new CaiActionManageScene(this.LIZLLL, buildUnknownFields());
    }
}

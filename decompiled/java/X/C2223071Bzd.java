package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAction;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionEmitEventToAppLog;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionEmitEventToGlobalStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionManageScene;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionStoreValueToFeatureCenter;

/* JADX INFO: renamed from: X.1Bzd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223071Bzd extends Message.Builder<CaiAction, C2223071Bzd> {
    public Integer LIZLLL;
    public CaiActionEmitEventToGlobalStream LJ;
    public CaiActionStoreValueToFeatureCenter LJFF;
    public CaiActionEmitEventToAppLog LJI;
    public CaiActionManageScene LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiAction build() {
        Integer num = this.LIZLLL;
        if (num != null) {
            return new CaiAction(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "action_type");
        throw null;
    }
}

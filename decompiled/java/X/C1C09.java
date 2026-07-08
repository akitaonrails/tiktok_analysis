package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAction;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActions;
import java.util.List;

/* JADX INFO: renamed from: X.1C09, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C09 extends Message.Builder<CaiActions, C1C09> {
    public List<CaiAction> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiActions build() {
        return new CaiActions(this.LIZLLL, buildUnknownFields());
    }
}

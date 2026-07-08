package X;

import com.bytedance.scalpel.protos.AttributionMsg;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225511C8n extends Message.Builder<AttributionMsg, C2225511C8n> {
    public List<AttributionMsg.AttributionItemMsg> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AttributionMsg build() {
        return new AttributionMsg(this.LIZLLL, buildUnknownFields());
    }
}

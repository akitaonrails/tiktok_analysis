package X;

import com.bytedance.scalpel.protos.AttributionMsg;
import com.bytedance.scene.Scene;
import com.squareup.wire.Message;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225461C8i extends Message.Builder<AttributionMsg.AttributionItemMsg, C2225461C8i> {
    public String LIZLLL;
    public Integer LJ;
    public List<ByteString> LJFF = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AttributionMsg.AttributionItemMsg build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new AttributionMsg.AttributionItemMsg(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, Scene.SCENE_SERVICE, this.LJ, "event_type");
        throw null;
    }
}

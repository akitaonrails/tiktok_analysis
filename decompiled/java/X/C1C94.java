package X;

import com.bytedance.scalpel.protos.BigJankMsg;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C94, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C94 extends Message.Builder<BigJankMsg, C1C94> {
    public String LIZLLL;
    public List<BigJankMsg.MessageDispatch> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BigJankMsg build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new BigJankMsg(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "method_mapping");
        throw null;
    }
}

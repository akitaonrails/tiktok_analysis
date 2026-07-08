package X;

import com.bytedance.im.core.proto.BatchSetConversationSettingInfoResponseBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1DBE, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DBE extends Message.Builder<BatchSetConversationSettingInfoResponseBody, C1DBE> {
    public List<SetConversationSettingInfoResponseBody> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<SetConversationSettingInfoResponseBody> LJ = C1516540pZE.LJIIIIZZ();
    public Integer LJFF;
    public Long LJI;
    public String LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchSetConversationSettingInfoResponseBody build() {
        return new BatchSetConversationSettingInfoResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}

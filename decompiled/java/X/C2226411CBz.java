package X;

import com.bytedance.im.core.proto.Config;
import com.bytedance.im.core.proto.GetConfigsResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226411CBz extends Message.Builder<GetConfigsResponseBody, C2226411CBz> {
    public Integer LIZLLL;
    public List<Config> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConfigsResponseBody build() {
        return new GetConfigsResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

package X;

import com.bytedance.im.core.proto.ClientMetric;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1CK5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CK5 extends Message.Builder<ClientMetric, C1CK5> {
    public EnumC19379510rp LIZLLL;
    public String LJ;
    public Long LJFF;
    public Map<String, String> LJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ClientMetric build() {
        return new ClientMetric(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

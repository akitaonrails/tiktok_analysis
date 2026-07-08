package X;

import com.bytedance.im.core.proto.GetTicketRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1DBO, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DBO extends Message.Builder<GetTicketRequestBody, C1DBO> {
    public EnumC19362610p6 LIZLLL;
    public EnumC869400Y8s LJ;
    public Long LJFF;
    public Long LJI;
    public Map<String, String> LJII = new LinkedHashMap();
    public Integer LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetTicketRequestBody build() {
        return new GetTicketRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}

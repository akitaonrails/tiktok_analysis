package X;

import com.bytedance.im.core.proto.SendUserActionRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1COC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1COC extends Message.Builder<SendUserActionRequestBody, C1COC> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public EnumC19362810p8 LJI;
    public Map<String, String> LJII = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SendUserActionRequestBody build() {
        return new SendUserActionRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}

package X;

import com.bytedance.im.core.proto.SendInputStatusRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0YLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872820YLw extends Message.Builder<SendInputStatusRequestBody, C872820YLw> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public EnumC872840YLy LJI;
    public Map<String, String> LJII = new LinkedHashMap();
    public C0YM0 LJIIIIZZ;
    public Long LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SendInputStatusRequestBody build() {
        return new SendInputStatusRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}

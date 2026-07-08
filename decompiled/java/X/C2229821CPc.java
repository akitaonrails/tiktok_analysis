package X;

import com.bytedance.im.core.proto.BizNewDirectPushNotify;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1CPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229821CPc extends Message.Builder<BizNewDirectPushNotify, C2229821CPc> {
    public Integer LIZLLL;
    public Integer LJ;
    public String LJFF;
    public Map<String, String> LJI = new LinkedHashMap();
    public Long LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BizNewDirectPushNotify build() {
        return new BizNewDirectPushNotify(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}

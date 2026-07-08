package X;

import com.bytedance.im.core.proto.MsgTrace;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1C4F, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C4F extends Message.Builder<MsgTrace, C1C4F> {
    public Map<Integer, Long> LIZLLL = new LinkedHashMap();
    public EnumC19363010pA LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MsgTrace build() {
        return new MsgTrace(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

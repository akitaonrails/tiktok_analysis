package com.bytedance.android.livesdk;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class TrackMessage implements Serializable {

    @C09CT("message_id")
    public final Long id;

    @C09CT("message_method")
    public final String method;

    @C09CT("message_strategy")
    public final Integer strategy;

    @C09CT("message_type")
    public final Integer type;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackMessage(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", method=");
        sbLIZ.append(this.method);
        sbLIZ.append(", strategy=");
        sbLIZ.append(this.strategy);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TrackMessage(Long l, Integer num, String str, Integer num2) {
        this.id = l;
        this.type = num;
        this.method = str;
        this.strategy = num2;
    }
}

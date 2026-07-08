package com.bytedance.android.live.usermanage.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class UserManageExtra extends Extra {

    @C09CT("operations")
    public final Map<Long, Operation> operations;

    public final Map<Long, Operation> getOperations() {
        return this.operations;
    }
}

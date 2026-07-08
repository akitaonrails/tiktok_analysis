package com.bytedance.android.live.network.response;

import X.C09CT;
import X.C1494570ozn;
import X.C1494850p0F;
import com.bytedance.android.livesdk.model.Extra;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class BaseListResponse<T, R extends Extra> {
    public boolean LIZ;
    public C1494850p0F LIZIZ;
    public C1494570ozn LIZJ;
    public String LIZLLL;
    public transient RequestError LJ;

    @C09CT("data")
    public List<T> data;

    @C09CT("extra")
    public R extra;

    @C09CT("status_code")
    public int statusCode;
}

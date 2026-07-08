package com.bytedance.android.live.network.response;

import X.C09CT;
import X.C1494570ozn;
import X.C1494850p0F;
import com.bytedance.android.livesdk.model.Extra;

/* JADX INFO: loaded from: classes8.dex */
public class BaseResponse<T, R extends Extra> {
    public C1494850p0F LIZ;
    public String LIZIZ;
    public C1494570ozn LIZJ;
    public int LIZLLL;
    public transient RequestError LJ;

    @C09CT("data")
    public T data;

    @C09CT("extra")
    public R extra;

    @C09CT("status_code")
    public int statusCode;
}

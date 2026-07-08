package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0l6X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344990l6X {
    public static final Gson LIZ = new Gson();

    public static final List LIZ(Class cls, String str) {
        Object[] objArr = (Object[]) GsonProtectorUtils.fromJson(LIZ, str, cls);
        if (objArr != null) {
            return C13LQ.LJLI(objArr);
        }
        return new ArrayList();
    }
}

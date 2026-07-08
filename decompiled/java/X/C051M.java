package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.im.common.util.gson.BooleanDefaultFalseAdapter;
import com.ss.android.ugc.aweme.im.common.util.gson.IntegerDefaultZeroAdater;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.051M, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051M {
    public static final Gson LIZ;
    public static final C01GW LIZIZ;

    static {
        e eVar = new e();
        Class cls = Boolean.TYPE;
        eVar.LIZJ(new BooleanDefaultFalseAdapter(), cls);
        eVar.LIZJ(new IntegerDefaultZeroAdater(), Integer.TYPE);
        eVar.LIZJ(new BooleanDefaultFalseAdapter(), cls);
        LIZ = eVar.LIZ();
        LIZIZ = C452501pT.LIZIZ(new C051L());
    }

    public static Object LIZ(Class cls, String str) {
        return GsonProtectorUtils.fromJson(LIZ, str, cls);
    }

    public static Object LIZIZ(Class cls, String str) {
        return GsonProtectorUtils.fromJson(LIZ, str, cls);
    }

    public static Object LIZJ(String str, Type type) {
        return GsonProtectorUtils.fromJson(LIZ, str, type);
    }

    public static final String LJ(Object obj, boolean z) {
        if (z) {
            return GsonProtectorUtils.toJson((Gson) LIZIZ.getValue(), obj);
        }
        return GsonProtectorUtils.toJson(LIZ, obj);
    }

    public static final List LIZLLL(Class cls, String str, boolean z) {
        if (z) {
            Object[] objArr = (Object[]) GsonProtectorUtils.fromJson((Gson) LIZIZ.getValue(), str, cls);
            if (objArr != null) {
                return C13LQ.LJLI(objArr);
            }
            return new ArrayList();
        }
        Object[] objArr2 = (Object[]) GsonProtectorUtils.fromJson(LIZ, str, cls);
        if (objArr2 != null) {
            return C13LQ.LJLI(objArr2);
        }
        return new ArrayList();
    }
}

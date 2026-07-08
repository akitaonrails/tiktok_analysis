package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.04ze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280004ze {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(917));

    public static Gson LIZJ() {
        return (Gson) LIZ.getValue();
    }

    public static String LIZLLL(Object obj) {
        return GsonProtectorUtils.toJson(LIZJ(), obj);
    }

    public static Object LIZ(String str, Class cls) {
        return GsonProtectorUtils.fromJson(LIZJ(), str, cls);
    }

    public static Object LIZIZ(String str, Type type) {
        return GsonProtectorUtils.fromJson(LIZJ(), str, type);
    }
}

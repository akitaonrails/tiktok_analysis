package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.ies.xbridge.base.utils.StorageValue;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0kY2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323600kY2 implements InterfaceC1870830ymf {
    public static final C1323710kYD LIZIZ = new C1323730kYF<C1323600kY2, Context>() { // from class: X.0kYD
        {
            C1323670kY9 c1323670kY9 = C1323670kY9.LL;
        }
    };
    public final SharedPreferences LIZ;

    @Override // X.InterfaceC1870830ymf
    public final Set<String> LIZLLL() {
        return this.LIZ.getAll().keySet();
    }

    public C1323600kY2(Context context) {
        this.LIZ = C810670Vr7.LIZJ(context, 0, "xbridge-storage");
        new SparseArray();
    }

    @Override // X.InterfaceC1870830ymf
    public final Object LIZ(String str) {
        if (str == null || !this.LIZ.contains(str)) {
            return null;
        }
        String string = this.LIZ.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Gson gson = C1323610kY3.LIZ;
        Gson gson2 = C1323610kY3.LIZ;
        StorageValue storageValue = (StorageValue) GsonProtectorUtils.fromJson(gson2, string, StorageValue.class);
        String str2 = storageValue.value;
        switch (C1323520kXu.LIZ[EnumC1323480kXq.valueOf(storageValue.type).ordinal()]) {
        }
        return null;
    }

    @Override // X.InterfaceC1870830ymf
    public final boolean LJI(String str) {
        if (str != null) {
            this.LIZ.edit().remove(str).apply();
            return true;
        }
        return false;
    }

    public final String LJIIJ(Object obj) {
        new LinkedHashMap();
        if (obj instanceof Boolean) {
            Gson gson = C1323610kY3.LIZ;
            return C1323610kY3.LIZ(new StorageValue("Boolean", String.valueOf(((Boolean) obj).booleanValue())));
        }
        if (obj instanceof Integer) {
            Gson gson2 = C1323610kY3.LIZ;
            return C1323610kY3.LIZ(new StorageValue("Int", String.valueOf(((Number) obj).intValue())));
        }
        if (obj instanceof Double) {
            Gson gson3 = C1323610kY3.LIZ;
            return C1323610kY3.LIZ(new StorageValue("Number", String.valueOf(((Number) obj).doubleValue())));
        }
        if (obj instanceof String) {
            Gson gson4 = C1323610kY3.LIZ;
            String str = (String) obj;
            str.toString();
            return C1323610kY3.LIZ(new StorageValue("String", str));
        }
        if (obj instanceof InterfaceC1871920yoQ) {
            return LJIIJ(((InterfaceC1871920yoQ) obj).toList());
        }
        if (obj instanceof InterfaceC1107590evd) {
            return LJIIJ(((InterfaceC1107590evd) obj).LIZ());
        }
        if (obj instanceof List) {
            return C1323610kY3.LIZ(new StorageValue("Array", C1323610kY3.LIZ(obj)));
        }
        if (obj instanceof Map) {
            return C1323610kY3.LIZ(new StorageValue("Map", C1323610kY3.LIZ(obj)));
        }
        return "";
    }

    @Override // X.InterfaceC1870830ymf
    public final boolean LJ(String str, String str2) {
        return C1323640kY6.LIZIZ(this, str, str2);
    }

    @Override // X.InterfaceC1870830ymf
    public final boolean LJIIIIZZ(Object obj, String str) {
        if (str != null && obj != null) {
            this.LIZ.edit().putString(str, LJIIJ(obj)).apply();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1870830ymf
    public final Object LJIIIZ(String str, String str2) {
        return C1323640kY6.LIZ(this, str, str2);
    }

    @Override // X.InterfaceC1870830ymf
    public final boolean LIZIZ(Object obj, String str, String str2) {
        return C1323640kY6.LIZJ(this, str, str2, obj);
    }
}

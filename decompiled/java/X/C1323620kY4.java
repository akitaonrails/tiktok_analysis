package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.ies.xbridge.storage.utils.StorageValue;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0kY4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323620kY4 implements InterfaceC1323650kY7 {
    public static final C1323680kYA LIZJ = new C1323700kYC<C1323620kY4, Context>() { // from class: X.0kYA
        {
            C1323660kY8 c1323660kY8 = C1323660kY8.LL;
        }
    };
    public final Context LIZ;
    public final SharedPreferences LIZIZ;

    @Override // X.InterfaceC1870830ymf
    public final Set<String> LIZLLL() {
        Map<String, ?> all;
        Set<String> setKeySet;
        SharedPreferences sharedPreferences = this.LIZIZ;
        return (sharedPreferences == null || (all = sharedPreferences.getAll()) == null || (setKeySet = all.keySet()) == null) ? C08CX.INSTANCE : setKeySet;
    }

    public C1323620kY4(Context context) {
        this.LIZ = context;
        this.LIZIZ = C810670Vr7.LIZJ(context, 0, "xbridge-storage");
        new SparseArray();
    }

    public static final Object LJIIJ(String str) {
        Gson gson = C1323630kY5.LIZ;
        Gson gson2 = C1323630kY5.LIZ;
        StorageValue storageValue = (StorageValue) GsonProtectorUtils.fromJson(gson2, str, StorageValue.class);
        String str2 = storageValue.value;
        switch (C1323510kXt.LIZ[EnumC1323480kXq.valueOf(storageValue.type).ordinal()]) {
            case 1:
                return Boolean.valueOf(Boolean.parseBoolean(str2));
            case 2:
                return Integer.valueOf(CastIntegerProtector.parseInt(str2));
            case 3:
                return Double.valueOf(CastDoubleProtector.parseDouble(str2));
            case 4:
                return str2;
            case 5:
                return GsonProtectorUtils.fromJson(gson2, str2, List.class);
            case 6:
                return GsonProtectorUtils.fromJson(gson2, str2, Map.class);
            default:
                return null;
        }
    }

    @Override // X.InterfaceC1870830ymf
    public final Object LIZ(String str) {
        SharedPreferences sharedPreferences;
        if (str == null || (sharedPreferences = this.LIZIZ) == null || !sharedPreferences.contains(str)) {
            return null;
        }
        String string = sharedPreferences.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return LJIIJ(string);
    }

    @Override // X.InterfaceC1870830ymf
    public final boolean LJI(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        if (str != null && (sharedPreferences = this.LIZIZ) != null && (editorEdit = sharedPreferences.edit()) != null && (editorRemove = editorEdit.remove(str)) != null) {
            editorRemove.apply();
            return true;
        }
        return false;
    }

    public final String LJIIJJI(Object obj) {
        new LinkedHashMap();
        if (obj instanceof Boolean) {
            Gson gson = C1323630kY5.LIZ;
            return C1323630kY5.LIZ(new StorageValue("Boolean", String.valueOf(((Boolean) obj).booleanValue())));
        }
        if (obj instanceof Integer) {
            Gson gson2 = C1323630kY5.LIZ;
            return C1323630kY5.LIZ(new StorageValue("Int", String.valueOf(((Number) obj).intValue())));
        }
        if (obj instanceof Double) {
            Gson gson3 = C1323630kY5.LIZ;
            return C1323630kY5.LIZ(new StorageValue("Number", String.valueOf(((Number) obj).doubleValue())));
        }
        if (obj instanceof String) {
            Gson gson4 = C1323630kY5.LIZ;
            String str = (String) obj;
            str.toString();
            return C1323630kY5.LIZ(new StorageValue("String", str));
        }
        if (obj instanceof InterfaceC1871920yoQ) {
            return LJIIJJI(((InterfaceC1871920yoQ) obj).toList());
        }
        if (obj instanceof InterfaceC1107590evd) {
            return LJIIJJI(((InterfaceC1107590evd) obj).LIZ());
        }
        if (obj instanceof List) {
            return C1323630kY5.LIZ(new StorageValue("Array", C1323630kY5.LIZ(obj)));
        }
        if (obj instanceof Map) {
            return C1323630kY5.LIZ(new StorageValue("Map", C1323630kY5.LIZ(obj)));
        }
        return "";
    }

    @Override // X.InterfaceC1323650kY7
    public final boolean LIZJ(String str, String str2) {
        Context context;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        if (str2 != null && (context = this.LIZ) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("-xbridge-storage");
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, C2188811AlT.LIZIZ(sbLIZ));
            if (sharedPreferencesLIZJ != null && (editorEdit = sharedPreferencesLIZJ.edit()) != null && (editorRemove = editorEdit.remove(str2)) != null) {
                editorRemove.apply();
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1870830ymf
    public final boolean LJ(String str, String str2) {
        return C1323640kY6.LIZIZ(this, str, str2);
    }

    @Override // X.InterfaceC1323650kY7
    public final Object LJFF(String str, String str2) {
        Context context;
        if (str2 != null && (context = this.LIZ) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("-xbridge-storage");
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, C2188811AlT.LIZIZ(sbLIZ));
            if (sharedPreferencesLIZJ == null || !sharedPreferencesLIZJ.contains(str2)) {
                return null;
            }
            String string = sharedPreferencesLIZJ.getString(str2, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return LJIIJ(string);
        }
        return null;
    }

    @Override // X.InterfaceC1870830ymf
    public final boolean LJIIIIZZ(Object obj, String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        if (str != null && obj != null && (sharedPreferences = this.LIZIZ) != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString(str, LJIIJJI(obj))) != null) {
            editorPutString.apply();
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

    @Override // X.InterfaceC1323650kY7
    public final boolean LJII(Object obj, String str, String str2) {
        Context context;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        if (str2 != null && obj != null && (context = this.LIZ) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("-xbridge-storage");
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, C2188811AlT.LIZIZ(sbLIZ));
            if (sharedPreferencesLIZJ != null && (editorEdit = sharedPreferencesLIZJ.edit()) != null && (editorPutString = editorEdit.putString(str2, LJIIJJI(obj))) != null) {
                editorPutString.apply();
                return true;
            }
        }
        return false;
    }
}

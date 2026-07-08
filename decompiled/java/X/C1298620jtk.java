package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sdk.xbridge.storage.utils.StorageValue;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0jtk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298620jtk {
    public static final C1298640jtm LIZJ = new Object() { // from class: X.0jtm
    };
    public static volatile C1298620jtk LIZLLL;
    public final Context LIZ;
    public final SharedPreferences LIZIZ;

    public C1298620jtk(Context context) {
        this.LIZ = context;
        this.LIZIZ = C810670Vr7.LIZJ(context, 0, "xbridge-storage");
    }

    public static Object LJII(String str) {
        Gson gson = C2348609Ie.LIZ;
        Gson gson2 = C2348609Ie.LIZ;
        StorageValue storageValue = (StorageValue) GsonProtectorUtils.fromJson(gson2, str, StorageValue.class);
        String str2 = storageValue.value;
        switch (C1298100jsu.LIZ[EnumC1298090jst.valueOf(storageValue.type).ordinal()]) {
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

    public static String LJIIIIZZ(Object obj) {
        new LinkedHashMap();
        if (obj instanceof Boolean) {
            Gson gson = C2348609Ie.LIZ;
            return C2348609Ie.LJ(new StorageValue("Boolean", String.valueOf(((Boolean) obj).booleanValue())));
        }
        if (obj instanceof Integer) {
            Gson gson2 = C2348609Ie.LIZ;
            return C2348609Ie.LJ(new StorageValue("Int", String.valueOf(((Number) obj).intValue())));
        }
        if (obj instanceof Double) {
            Gson gson3 = C2348609Ie.LIZ;
            return C2348609Ie.LJ(new StorageValue("Number", String.valueOf(((Number) obj).doubleValue())));
        }
        if (obj instanceof String) {
            Gson gson4 = C2348609Ie.LIZ;
            String str = (String) obj;
            str.toString();
            return C2348609Ie.LJ(new StorageValue("String", str));
        }
        if (obj instanceof List) {
            return C2348609Ie.LJ(new StorageValue("Array", C2348609Ie.LJ(obj)));
        }
        if (obj instanceof Map) {
            return C2348609Ie.LJ(new StorageValue("Map", C2348609Ie.LJ(obj)));
        }
        return "";
    }

    public final Object LIZIZ(String str) {
        SharedPreferences sharedPreferences;
        if (str == null || (sharedPreferences = this.LIZIZ) == null || !sharedPreferences.contains(str)) {
            return null;
        }
        String string = sharedPreferences.getString(str, "");
        if (TextUtils.isEmpty(string) || string == null) {
            return null;
        }
        return LJII(string);
    }

    public final boolean LIZLLL(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        if (str != null && (sharedPreferences = this.LIZIZ) != null && (editorEdit = sharedPreferences.edit()) != null && (editorRemove = editorEdit.remove(str)) != null) {
            editorRemove.apply();
            return true;
        }
        return false;
    }

    public final Object LIZ(String str, String str2) {
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
            if (TextUtils.isEmpty(string) || string == null) {
                return null;
            }
            return LJII(string);
        }
        return null;
    }

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

    public final boolean LJFF(Object obj, String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        if (str != null && obj != null && (sharedPreferences = this.LIZIZ) != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString(str, LJIIIIZZ(obj))) != null) {
            editorPutString.apply();
            return true;
        }
        return false;
    }

    public final boolean LJ(Object obj, String str, String str2) {
        Context context;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        if (str2 != null && obj != null && (context = this.LIZ) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("-xbridge-storage");
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, C2188811AlT.LIZIZ(sbLIZ));
            if (sharedPreferencesLIZJ != null && (editorEdit = sharedPreferencesLIZJ.edit()) != null && (editorPutString = editorEdit.putString(str2, LJIIIIZZ(obj))) != null) {
                editorPutString.apply();
                return true;
            }
        }
        return false;
    }

    public final boolean LJI(Object obj, String str, String str2) {
        if (str.length() == 0) {
            return LJFF(obj, str2);
        }
        return LJ(obj, str, str2);
    }
}

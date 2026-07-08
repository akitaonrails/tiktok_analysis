package X;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.bytedance.apm.core.SpPair;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.092U, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C092U implements SharedPreferences {
    public static int LIZLLL = -1;
    public final Application LIZ;
    public final String LIZIZ;
    public final Uri LIZJ;

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() throws Throwable {
        ArrayList<SpPair> arrayListLIZ = LIZ(null, null);
        if (arrayListLIZ == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (SpPair spPair : arrayListLIZ) {
            map.put(spPair.mKey, spPair.mValue);
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferences.Editor() { // from class: X.092T
            public boolean LIZ;
            public final HashMap<String, Object> LIZIZ = new HashMap<>();

            @Override // android.content.SharedPreferences.Editor
            public final void apply() throws Throwable {
                if (this.LIZ || !this.LIZIZ.isEmpty()) {
                    Bundle bundle = new Bundle();
                    if (this.LIZ) {
                        bundle.putBoolean("clear", true);
                    }
                    ArrayList arrayList = new ArrayList(this.LIZIZ.size());
                    for (Map.Entry<String, Object> entry : this.LIZIZ.entrySet()) {
                        arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
                    }
                    C786410Ut5.LJJIL(bundle, "edit", arrayList);
                    try {
                        ContentResolver contentResolver = this.LIZJ.LIZ.getContentResolver();
                        C092U c092u = this.LIZJ;
                        C2204961BRm.LJJIJL(contentResolver, c092u.LIZJ, c092u.LIZIZ, "edit", bundle, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++N288UGHRxswKmidTv7/8u7RzbA84u9l55VusdM=", null));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor clear() {
                this.LIZIZ.clear();
                this.LIZ = true;
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final boolean commit() throws Throwable {
                apply();
                return true;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor remove(String str) {
                this.LIZIZ.put(str, null);
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putBoolean(String str, boolean z) {
                this.LIZIZ.put(str, Boolean.valueOf(z));
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putFloat(String str, float f) {
                this.LIZIZ.put(str, Float.valueOf(f));
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putInt(String str, int i) {
                this.LIZIZ.put(str, Integer.valueOf(i));
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putLong(String str, long j) {
                this.LIZIZ.put(str, Long.valueOf(j));
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putString(String str, String str2) {
                this.LIZIZ.put(str, str2);
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
                HashMap<String, Object> map = this.LIZIZ;
                String[] strArr = new String[set.size()];
                Iterator<String> it2 = set.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    strArr[i] = it2.next();
                    i++;
                }
                map.put(str, strArr);
                return this;
            }
        };
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) throws Throwable {
        String str2;
        try {
            ContentResolver contentResolver = this.LIZ.getContentResolver();
            Uri uri = this.LIZJ;
            if (str != null) {
                str2 = this.LIZIZ + "/" + str;
            } else {
                str2 = this.LIZIZ;
            }
            Bundle bundleLJJIJL = C2204961BRm.LJJIJL(contentResolver, uri, str2, "contains", null, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++N288UGHRxswKmidTv7/8u7RzbA84u9l55VusdM=", null));
            if (bundleLJJIJL != null && bundleLJJIJL.getBoolean("contains")) {
                return true;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public C092U(Application application, String str) {
        this.LIZ = application;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("content://");
        sbLIZ.append(application.getPackageName());
        sbLIZ.append(".apm");
        sbLIZ.append("/sp/");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ = strLIZIZ;
        this.LIZJ = UriProtector.parse(strLIZIZ);
    }

    public static SharedPreferences LIZIZ(Context context, String str) throws Throwable {
        boolean z;
        Application application;
        int i = -1;
        if (LIZLLL == -1) {
            try {
                Bundle bundleLJJIJL = C2204961BRm.LJJIJL(context.getContentResolver(), UriProtector.parse("content://" + context.getPackageName() + ".apm"), "getPid", null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++N288UGHRxswKmidTv7/8u7RzbA84u9l55VusdM=", null));
                if (bundleLJJIJL != null) {
                    i = bundleLJJIJL.getInt("Pid", -1);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZLLL = i;
        }
        if (LIZLLL == Process.myPid()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C810670Vr7.LIZJ(context, 0, str);
        }
        if (context instanceof Application) {
            application = (Application) context;
        } else {
            application = (Application) C786410Ut5.N3(context);
        }
        return new C092U(application, str);
    }

    public final ArrayList LIZ(Object obj, String str) throws Throwable {
        Bundle bundleLJJIJL;
        String str2;
        Bundle bundle = new Bundle();
        if (obj != null) {
            C786410Ut5.LJJIJL(bundle, "sp", new SpPair(str, obj));
        }
        try {
            ContentResolver contentResolver = this.LIZ.getContentResolver();
            Uri uri = this.LIZJ;
            if (str != null) {
                str2 = this.LIZIZ + "/" + str;
            } else {
                str2 = this.LIZIZ;
            }
            if (obj == null) {
                bundle = null;
            }
            bundleLJJIJL = C2204961BRm.LJJIJL(contentResolver, uri, str2, "query", bundle, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++N288UGHRxswKmidTv7/8u7RzbA84u9l55VusdM=", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bundleLJJIJL = null;
        }
        if (bundleLJJIJL == null) {
            return null;
        }
        bundleLJJIJL.setClassLoader(C092U.class.getClassLoader());
        return bundleLJJIJL.getParcelableArrayList("sp");
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) throws Throwable {
        ArrayList arrayListLIZ = LIZ(String.valueOf(z), str);
        if (arrayListLIZ == null) {
            return z;
        }
        Object obj = ((SpPair) ListProtector.get(arrayListLIZ, 0)).mValue;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj).booleanValue();
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) throws Throwable {
        ArrayList arrayListLIZ = LIZ(String.valueOf(f), str);
        if (arrayListLIZ == null) {
            return f;
        }
        Object obj = ((SpPair) ListProtector.get(arrayListLIZ, 0)).mValue;
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof String) {
            return CastFloatProtector.valueOf((String) obj).floatValue();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) throws Throwable {
        ArrayList arrayListLIZ = LIZ(String.valueOf(i), str);
        if (arrayListLIZ == null) {
            return i;
        }
        Object obj = ((SpPair) ListProtector.get(arrayListLIZ, 0)).mValue;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.decode((String) obj).intValue();
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) throws Throwable {
        ArrayList arrayListLIZ = LIZ(String.valueOf(j), str);
        if (arrayListLIZ == null) {
            return j;
        }
        Object obj = ((SpPair) ListProtector.get(arrayListLIZ, 0)).mValue;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.decode((String) obj).longValue();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) throws Throwable {
        ArrayList arrayListLIZ = LIZ(str2, str);
        if (arrayListLIZ == null) {
            return null;
        }
        return (String) ((SpPair) ListProtector.get(arrayListLIZ, 0)).mValue;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) throws Throwable {
        ArrayList arrayListLIZ = LIZ(set, str);
        if (arrayListLIZ == null || ((SpPair) ListProtector.get(arrayListLIZ, 0)).mValue == null) {
            return null;
        }
        String[] strArr = (String[]) ((SpPair) ListProtector.get(arrayListLIZ, 0)).mValue;
        HashSet hashSet = new HashSet(strArr.length);
        hashSet.addAll(Arrays.asList(strArr));
        return hashSet;
    }
}

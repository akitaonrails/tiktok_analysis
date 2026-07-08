package com.benchmark.tools;

import X.C21309718aN;
import X.C2188811AlT;
import X.C806930Vl5;
import X.C810670Vr7;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultSharedpreference {
    public static DefaultSharedpreference sInstance;
    public String sFileName;

    private boolean checkFileName() {
        return !TextUtils.isEmpty(this.sFileName);
    }

    public static DefaultSharedpreference getInstance() {
        if (sInstance == null) {
            synchronized (DefaultSharedpreference.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new DefaultSharedpreference();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public DefaultSharedpreference() {
        setFileName("default_config");
    }

    private boolean checkFileName(String str) {
        return !TextUtils.isEmpty(str);
    }

    public void setFileName(String str) {
        this.sFileName = str;
    }

    public static boolean Contains(String str, String str2) {
        boolean zContains = getInstance().contains(C21309718aN.LJIIZILJ.LIZ, str, str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getString key: ");
        sbLIZ.append(str2);
        sbLIZ.append(",value: ");
        sbLIZ.append(zContains);
        C2188811AlT.LIZIZ(sbLIZ);
        C806930Vl5.LIZ("DefaultSharedpreference");
        return zContains;
    }

    private SharedPreferences getSp(Context context, String str) {
        if (context == null || !checkFileName(str)) {
            return null;
        }
        return C810670Vr7.LIZJ(context, 0, str);
    }

    public boolean getBoolean(Context context, String str) {
        return getBoolean(context, this.sFileName, str, false);
    }

    public float getFloat(Context context, String str) {
        return getFloat(context, this.sFileName, str, 0.0f);
    }

    public int getInt(Context context, String str) {
        SharedPreferences sp = getSp(context, this.sFileName);
        if (sp == null) {
            return 0;
        }
        return sp.getInt(str, 0);
    }

    public long getLong(Context context, String str) {
        return getLong(context, this.sFileName, str, 0L);
    }

    public String getString(Context context, String str) {
        return getString(context, this.sFileName, str, "");
    }

    public static boolean getBoolean(String str, String str2, boolean z) {
        boolean z2 = getInstance().getBoolean(C21309718aN.LJIIZILJ.LIZ, str, str2, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFloat key: ");
        sbLIZ.append(str2);
        sbLIZ.append(",value: ");
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        C806930Vl5.LIZ("DefaultSharedpreference");
        return z2;
    }

    public static float getFloat(String str, String str2, float f) {
        float f2 = getInstance().getFloat(C21309718aN.LJIIZILJ.LIZ, str, str2, f);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFloat key: ");
        sbLIZ.append(str2);
        sbLIZ.append(",value: ");
        sbLIZ.append(f2);
        C2188811AlT.LIZIZ(sbLIZ);
        C806930Vl5.LIZ("DefaultSharedpreference");
        return f2;
    }

    public static long getLong(String str, String str2, long j) {
        long j2 = getInstance().getLong(C21309718aN.LJIIZILJ.LIZ, str, str2, j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFloat key: ");
        sbLIZ.append(str2);
        sbLIZ.append(",value: ");
        sbLIZ.append(j2);
        C2188811AlT.LIZIZ(sbLIZ);
        C806930Vl5.LIZ("DefaultSharedpreference");
        return j2;
    }

    public static String getString(String str, String str2, String str3) {
        String string = getInstance().getString(C21309718aN.LJIIZILJ.LIZ, str, str2, str3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getString key: ");
        sbLIZ.append(str2);
        sbLIZ.append(",value: ");
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        C806930Vl5.LIZ("DefaultSharedpreference");
        return string;
    }

    public static void storeBoolean(String str, String str2, boolean z) {
        Context context = C21309718aN.LJIIZILJ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeFloat key: ");
        sbLIZ.append(str2);
        sbLIZ.append(",value: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C806930Vl5.LIZ("DefaultSharedpreference");
        getInstance().setBoolean(context, str, str2, z);
    }

    public static void storeFloat(String str, String str2, float f) {
        Context context = C21309718aN.LJIIZILJ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeFloat key: ");
        sbLIZ.append(str2);
        sbLIZ.append(",value: ");
        sbLIZ.append(f);
        C2188811AlT.LIZIZ(sbLIZ);
        C806930Vl5.LIZ("DefaultSharedpreference");
        getInstance().setFloat(context, str, str2, f);
    }

    public static void storeLong(String str, String str2, long j) {
        Context context = C21309718aN.LJIIZILJ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeFloat key: ");
        sbLIZ.append(str2);
        sbLIZ.append(",value: ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        C806930Vl5.LIZ("DefaultSharedpreference");
        getInstance().setLong(context, str, str2, j);
    }

    public static void storeString(String str, String str2, String str3) {
        Context context = C21309718aN.LJIIZILJ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeString key: ");
        sbLIZ.append(str2);
        sbLIZ.append(",value: ");
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        C806930Vl5.LIZ("DefaultSharedpreference");
        getInstance().setString(context, str, str2, str3);
    }

    public boolean contains(Context context, String str, String str2) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return false;
        }
        return sp.contains(str2);
    }

    public int getInt(Context context, String str, int i) {
        SharedPreferences sp = getSp(context, this.sFileName);
        if (sp == null) {
            return 0;
        }
        return sp.getInt(str, i);
    }

    public void setBoolean(Context context, String str, boolean z) {
        SharedPreferences sp = getSp(context, this.sFileName);
        if (sp == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sp.edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public void setFloat(Context context, String str, float f) {
        setFloat(context, this.sFileName, str, f);
    }

    public void setInt(Context context, String str, int i) {
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, this.sFileName).edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public void setLong(Context context, String str, long j) {
        setLong(context, this.sFileName, str, j);
    }

    public void setString(Context context, String str, String str2) {
        setString(context, this.sFileName, str, str2);
    }

    public boolean getBoolean(Context context, String str, boolean z) {
        return getBoolean(context, this.sFileName, str, z);
    }

    public float getFloat(Context context, String str, float f) {
        return getFloat(context, this.sFileName, str, f);
    }

    public long getLong(Context context, String str, long j) {
        return getLong(context, this.sFileName, str, j);
    }

    public String getString(Context context, String str, String str2) {
        return getString(context, this.sFileName, str, str2);
    }

    public boolean getBoolean(Context context, String str, String str2, boolean z) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return z;
        }
        return sp.getBoolean(str2, z);
    }

    public float getFloat(Context context, String str, String str2, float f) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return f;
        }
        return sp.getFloat(str2, f);
    }

    public long getLong(Context context, String str, String str2, long j) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return j;
        }
        return sp.getLong(str2, j);
    }

    public String getString(Context context, String str, String str2, String str3) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return str3;
        }
        return sp.getString(str2, str3);
    }

    public void setBoolean(Context context, String str, String str2, boolean z) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sp.edit();
        editorEdit.putBoolean(str2, z);
        editorEdit.apply();
    }

    public void setFloat(Context context, String str, String str2, float f) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sp.edit();
        editorEdit.putFloat(str2, f);
        editorEdit.apply();
    }

    public void setLong(Context context, String str, String str2, long j) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sp.edit();
        editorEdit.putLong(str2, j);
        editorEdit.apply();
    }

    public void setString(Context context, String str, String str2, String str3) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sp.edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }
}

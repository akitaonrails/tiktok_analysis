package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0XPA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XPA {
    public static volatile C0XPA LIZLLL = new C0XPA();
    public final C0XPB[] LIZ = C0XPB.LJ;
    public final C0XPB[] LIZIZ = C0XPB.LJFF;
    public boolean LIZJ;

    public final boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        LIZIZ(C0XPY.LIZIZ);
        for (C0XPB c0xpb : this.LIZ) {
            if (c0xpb.LIZJ && !TextUtils.isEmpty(c0xpb.LIZ) && c0xpb.LIZ.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZIZ(Context context) {
        if (!this.LIZJ && context != null) {
            this.LIZJ = true;
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "com.ss.spipe_setting");
            try {
                HashMap map = new HashMap();
                String string = sharedPreferencesLIZJ.getString("bind_platforms", "");
                if (!TextUtils.isEmpty(string)) {
                    String[] strArrSplit = string.split(",");
                    if (strArrSplit.length > 0) {
                        for (String str : strArrSplit) {
                            map.put(str, str);
                        }
                        for (C0XPB c0xpb : this.LIZIZ) {
                            if (map.containsKey(c0xpb.LIZ)) {
                                c0xpb.LIZJ = true;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LIZJ(Context context) {
        if (context == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (C0XPB c0xpb : this.LIZIZ) {
            if (c0xpb.LIZJ) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(c0xpb.LIZ);
                z = false;
            }
        }
        String string = sb.toString();
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, "com.ss.spipe_setting").edit();
        editorEdit.putString("bind_platforms", string);
        C1499900p8O.LIZ(editorEdit);
    }

    public final void LIZLLL(C0XO3 c0xo3, Context context) {
        C0XO4 c0xo4;
        for (C0XPB c0xpb : this.LIZ) {
            c0xpb.LIZJ = false;
            if (c0xo3 != null) {
                String[] strArr = c0xpb.LIZIZ;
                if (strArr != null && strArr.length != 0) {
                    for (String str : strArr) {
                        c0xo4 = (C0XO4) ((HashMap) c0xo3.LIZLLL).get(str);
                        if (c0xo4 != null) {
                            c0xpb.LIZJ = true;
                            c0xpb.LIZLLL = c0xo4.LLILLL;
                            break;
                            break;
                        }
                    }
                } else {
                    c0xo4 = (C0XO4) ((HashMap) c0xo3.LIZLLL).get(c0xpb.LIZ);
                    if (c0xo4 != null) {
                        c0xpb.LIZJ = true;
                        c0xpb.LIZLLL = c0xo4.LLILLL;
                        break;
                    }
                }
            }
        }
        LIZJ(context);
    }
}

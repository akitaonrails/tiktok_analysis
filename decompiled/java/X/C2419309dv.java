package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.09dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2419309dv {
    public static final Map<Class, Object> LIZ = new ConcurrentHashMap();

    public static <T> T LIZ(Context context, Class<T> cls) {
        final Context contextN3;
        if (context == null || (contextN3 = C786410Ut5.N3(context)) == null || !cls.isInterface() || !InterfaceC1594010raB.class.equals(cls)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null || !(t instanceof C2419409dw)) {
            T t2 = (T) new InterfaceC1594010raB(contextN3) { // from class: X.09dw
                public final SharedPreferences LIZ;

                @Override // X.InterfaceC1594010raB
                public final void LIZ() {
                    SharedPreferences.Editor editorEdit = this.LIZ.edit();
                    editorEdit.putBoolean("shouldCleanEffectsAtFirstLaunch", false);
                    editorEdit.apply();
                }

                @Override // X.InterfaceC1594010raB
                public final long LIZIZ() {
                    return this.LIZ.getLong("cleanEffectsLastTime", 0L);
                }

                @Override // X.InterfaceC1594010raB
                public final void LIZLLL() {
                    SharedPreferences.Editor editorEdit = this.LIZ.edit();
                    editorEdit.putString("hasClickActivityDot", "true");
                    editorEdit.apply();
                }

                @Override // X.InterfaceC1594010raB
                public final void LJ() {
                    SharedPreferences.Editor editorEdit = this.LIZ.edit();
                    editorEdit.putBoolean("isCheckContentLanguageDialogWhenFirstLaunch", true);
                    editorEdit.apply();
                }

                @Override // X.InterfaceC1594010raB
                public final boolean LJFF() {
                    return this.LIZ.getBoolean("secondTabLastLandFollowTab", false);
                }

                @Override // X.InterfaceC1594010raB
                public final boolean LJI() {
                    return this.LIZ.getBoolean("isCheckContentLanguageDialogWhenFirstLaunch", false);
                }

                @Override // X.InterfaceC1594010raB
                public final String LJIIIZ() {
                    return this.LIZ.getString("hasClickActivityDot", "");
                }

                @Override // X.InterfaceC1594010raB
                public final String LJIIJ() {
                    return this.LIZ.getString("unloginContentLanguage", "");
                }

                @Override // X.InterfaceC1594010raB
                public final boolean LJIIJJI() {
                    return this.LIZ.getBoolean("hasShowUnloginContentLanguageDialog", false);
                }

                {
                    this.LIZ = C810670Vr7.LIZJ(contextN3, 0, "MainTabPreferences");
                }

                @Override // X.InterfaceC1594010raB
                public final void LIZJ(long j) {
                    SharedPreferences.Editor editorEdit = this.LIZ.edit();
                    editorEdit.putLong("cleanEffectsLastTime", j);
                    editorEdit.apply();
                }

                @Override // X.InterfaceC1594010raB
                public final void LJII(String str) {
                    SharedPreferences.Editor editorEdit = this.LIZ.edit();
                    editorEdit.putString("unloginContentLanguage", str);
                    editorEdit.apply();
                }

                @Override // X.InterfaceC1594010raB
                public final void LJIIIIZZ(boolean z) {
                    SharedPreferences.Editor editorEdit = this.LIZ.edit();
                    editorEdit.putBoolean("hasShowUnloginContentLanguageDialog", z);
                    editorEdit.apply();
                }
            };
            concurrentHashMap.put(cls, t2);
            return t2;
        }
        return t;
    }
}

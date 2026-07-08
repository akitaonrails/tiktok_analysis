package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0or2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489140or2 {
    public static <T> T LIZ(Context context, Class<T> cls) {
        final Context contextN3;
        if (context == null || (contextN3 = C786410Ut5.N3(context)) == null || cls == null || !cls.isInterface()) {
            return null;
        }
        if (InterfaceC1489180or6.class.equals(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C1943707jP.LIZ;
            T t = (T) concurrentHashMap.get(cls);
            if (t == null || !(t instanceof C1489170or5)) {
                T t2 = (T) new InterfaceC1489180or6(contextN3) { // from class: X.0or5
                    {
                        C810670Vr7.LIZJ(contextN3, 0, "RankSp");
                    }
                };
                concurrentHashMap.put(cls, t2);
                return t2;
            }
            return t;
        }
        if (InterfaceC1618270sDJ.class.equals(cls)) {
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) C1943707jP.LIZ;
            T t3 = (T) concurrentHashMap2.get(cls);
            if (t3 != null && (t3 instanceof C1489130or1)) {
                return t3;
            }
            T t4 = (T) new InterfaceC1618270sDJ(contextN3) { // from class: X.0or1
                public final SharedPreferences LIZ;

                @Override // X.InterfaceC1618270sDJ
                public final long LIZ() {
                    return this.LIZ.getLong("shotLastShowTime", 0L);
                }

                {
                    this.LIZ = C810670Vr7.LIZJ(contextN3, 0, "ShowXmaxTreeCache");
                }

                @Override // X.InterfaceC1618270sDJ
                public final void LIZIZ(long j) {
                    SharedPreferences.Editor editorEdit = this.LIZ.edit();
                    editorEdit.putLong("shotLastShowTime", j);
                    editorEdit.apply();
                }
            };
            concurrentHashMap2.put(cls, t4);
            return t4;
        }
        if (C04UI.class.equals(cls)) {
            ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) C1943707jP.LIZ;
            T t6 = (T) concurrentHashMap3.get(cls);
            if (t6 != null && (t6 instanceof C1489160or4)) {
                return t6;
            }
            T t7 = (T) new C04UI(contextN3) { // from class: X.0or4
                public final SharedPreferences LIZ;

                @Override // X.C04UI
                public final void LIZ() {
                    SharedPreferences.Editor editorEdit = this.LIZ.edit();
                    editorEdit.putInt("languageDialogShowState", 3);
                    editorEdit.apply();
                }

                {
                    this.LIZ = C810670Vr7.LIZJ(contextN3, 0, "InitialChooseLanguagePreferences");
                }
            };
            concurrentHashMap3.put(cls, t7);
            return t7;
        }
        if (!InterfaceC1370780lm8.class.equals(cls)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap4 = (ConcurrentHashMap) C1943707jP.LIZ;
        T t8 = (T) concurrentHashMap4.get(cls);
        if (t8 != null && (t8 instanceof C1489150or3)) {
            return t8;
        }
        T t9 = (T) new InterfaceC1370780lm8(contextN3) { // from class: X.0or3
            public final SharedPreferences LIZ;

            {
                this.LIZ = C810670Vr7.LIZJ(contextN3, 0, "VideoPublishManager");
            }

            @Override // X.InterfaceC1370780lm8
            public final void LIZ(boolean z) {
                SharedPreferences.Editor editorEdit = this.LIZ.edit();
                editorEdit.putBoolean("is_aweme_private", z);
                editorEdit.apply();
            }
        };
        concurrentHashMap4.put(cls, t9);
        return t9;
    }
}

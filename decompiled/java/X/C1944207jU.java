package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07jU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1944207jU extends C09AY implements Function0<C15YO> {
    public C1944207jU() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [X.15YO, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final C15YO invoke() {
        final Context contextN3;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ == null || (contextN3 = C786410Ut5.N3(contextLIZ)) == null || !C15YO.class.isInterface() || !C15YO.class.equals(C15YO.class)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C1944107jT.LIZ;
        ?? r3 = concurrentHashMap.get(C15YO.class);
        if (r3 != 0 && (r3 instanceof C2114108Pz)) {
            return r3;
        }
        C15YO c15yo = new C15YO(contextN3) { // from class: X.08Pz
            public final SharedPreferences LIZ;

            @Override // X.C15YO
            public final String LIZ() {
                return this.LIZ.getString("teenage_mode_setting", "");
            }

            {
                this.LIZ = C810670Vr7.LIZJ(contextN3, 0, "TeenageModeSetting");
            }

            @Override // X.C15YO
            public final void LIZIZ(String str) {
                SharedPreferences.Editor editorEdit = this.LIZ.edit();
                editorEdit.putString("teenage_mode_setting", str);
                editorEdit.apply();
            }
        };
        concurrentHashMap.put(C15YO.class, c15yo);
        return c15yo;
    }
}

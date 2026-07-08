package X;

import Y.ARunnableS97S0200000_28;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: X.199r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C214937199r {
    public static final C199W LJI = new C199W();
    public C214937199r LIZ;
    public final String LIZIZ;
    public final Class<? extends Scene> LIZJ;
    public final Map<String, C214937199r> LIZLLL = new HashMap();
    public final Map<Object, Object> LJ = new HashMap();
    public final boolean LJFF = C214928199i.LIZ;

    public final void LIZIZ() {
        C214937199r c214937199r = this.LIZ;
        if (c214937199r != null) {
            ((HashMap) c214937199r.LIZLLL).remove(this.LIZIZ);
        }
        for (Object obj : ((HashMap) this.LJ).values()) {
            if (obj instanceof InterfaceC214938199s) {
                ((InterfaceC214938199s) obj).onUnRegister();
            }
        }
        ((HashMap) this.LJ).clear();
        ((HashMap) this.LIZLLL).clear();
    }

    public static String LIZJ(Scene scene) {
        if (scene == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Scene_");
            sbLIZ.append(UUID.randomUUID());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(scene.getClass().getName());
        sbLIZ2.append("_");
        sbLIZ2.append(UUID.randomUUID());
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final <T> T LJ(Object obj) {
        T t = (T) ((HashMap) this.LJ).get(obj);
        if (t != null) {
            return t;
        }
        C214937199r c214937199r = this.LIZ;
        if (c214937199r != null) {
            return (T) c214937199r.LJ(obj);
        }
        return null;
    }

    public <T> T LJFF(Object obj) {
        return (T) ((HashMap) this.LJ).get(obj);
    }

    public static String LIZLLL(Scene scene, Bundle bundle) {
        String string;
        if (bundle != null) {
            string = bundle.getString("bd-scene:scope_key");
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            return LIZJ(scene);
        }
        return string;
    }

    public C214937199r LIZ(Scene scene, Bundle bundle) {
        String strLIZLLL = LIZLLL(scene, bundle);
        C214937199r c214937199r = (C214937199r) ((HashMap) this.LIZLLL).get(strLIZLLL);
        if (c214937199r != null) {
            Class<? extends Scene> cls = c214937199r.LIZJ;
            if (this.LJFF && cls != null && cls != scene.getClass()) {
                C0T3U.LIZ(new ARunnableS97S0200000_28(scene, (Class) cls, 10));
            }
            return c214937199r;
        }
        C214937199r c214937199r2 = new C214937199r(this, scene.getClass(), strLIZLLL);
        ((HashMap) this.LIZLLL).put(strLIZLLL, c214937199r2);
        return c214937199r2;
    }

    public final void LJI(Object obj, Object obj2) {
        ((HashMap) this.LJ).put(obj, obj2);
    }

    public void LJII(Object obj, C21495419Ai c21495419Ai) {
        ((HashMap) this.LJ).put(obj, c21495419Ai);
    }

    public C214937199r(C214937199r c214937199r, Class<? extends Scene> cls, String str) {
        this.LIZ = c214937199r;
        this.LIZJ = cls;
        this.LIZIZ = str;
    }
}

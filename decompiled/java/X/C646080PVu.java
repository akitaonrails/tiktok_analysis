package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646080PVu {
    public final int LIZ;
    public final WeakReference<C0PE2> LIZIZ;
    public final String LIZJ;
    public Integer LJ;
    public C646120PVy LJFF;
    public final Class<C0PE2> LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final HashMap<String, C646090PVv> LIZLLL = new HashMap<>();
    public C0N5N LJI = C0N5N.ON_CREATE;
    public final Map<C00CD<?>, C646100PVw<?>> LJII = new ConcurrentHashMap();

    public final boolean LIZJ() {
        return this.LJI == C0N5N.ON_DESTORY;
    }

    public final C646090PVv LIZIZ(Integer num) {
        if (num != null) {
            num.intValue();
            return this.LIZLLL.get(num.toString());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C646080PVu(int i, WeakReference<C0PE2> weakReference) {
        Class<C0PE2> cls;
        this.LIZ = i;
        this.LIZIZ = weakReference;
        this.LIZJ = String.valueOf(i);
        C0PE2 c0pe2 = weakReference.get();
        if (c0pe2 != null) {
            cls = c0pe2.getClass();
        } else {
            cls = 0;
        }
        this.LJIIIIZZ = cls;
    }

    public final C646100PVw LIZLLL(Class cls, String str) {
        return LJ(cls, str);
    }

    public final C646100PVw LJ(Class cls, String str) {
        String str2;
        if (str != null && !Intrinsics.LJFF(str, this.LIZJ)) {
            str2 = str;
        } else {
            str2 = "DATA_DEFAULT_KEY";
        }
        C646100PVw c646100PVw = (C646100PVw) ((ConcurrentHashMap) this.LJII).get(new C00CD(cls, str2));
        if (c646100PVw != null) {
            return c646100PVw;
        }
        C646090PVv c646090PVv = this.LIZLLL.get(str);
        if (c646090PVv != null) {
            return LJ(cls, c646090PVv.LIZIZ);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(Class cls, String str, InterfaceC1618170sD9 interfaceC1618170sD9) {
        C646100PVw c646100PVw;
        if (str == null || Intrinsics.LJFF(str, this.LIZJ)) {
            str = "DATA_DEFAULT_KEY";
        }
        C00CD c00cd = new C00CD(cls, str);
        Object obj = ((ConcurrentHashMap) this.LJII).get(c00cd);
        if ((obj instanceof C646100PVw) && (c646100PVw = (C646100PVw) obj) != null) {
            c646100PVw.LIZ = interfaceC1618170sD9;
            return;
        }
        Map<C00CD<?>, C646100PVw<?>> map = this.LJII;
        C646100PVw c646100PVw2 = new C646100PVw();
        c646100PVw2.LIZ = interfaceC1618170sD9;
        ((ConcurrentHashMap) map).put(c00cd, c646100PVw2);
    }
}

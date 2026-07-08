package X;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0EHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361970EHb {
    public CharSequence LIZ;
    public Integer LIZIZ;
    public Drawable LIZJ;
    public Function0<? extends Drawable> LIZLLL;
    public List<C361980EHc> LJFF;
    public String LJIIIIZZ;
    public boolean LJIIJJI;
    public C0EI2 LJIIL;
    public String LJ = "default_type";
    public long LJI = 600;
    public final HashMap<String, Object> LJII = new HashMap<>();
    public boolean LJIIIZ = true;
    public float LJIIJ = 1.0f;

    public final C361980EHc LIZ() {
        C361980EHc c361980EHc = new C361980EHc(this);
        List<C361980EHc> list = this.LJFF;
        if (list != null) {
            ((ArrayList) c361980EHc.LIZ).addAll(list);
        }
        List<C361980EHc> list2 = this.LJFF;
        if (list2 != null) {
            for (C361980EHc c361980EHc2 : list2) {
                c361980EHc2.LIZIZ = c361980EHc;
                c361980EHc2.LJIIL = c361980EHc.LJI;
            }
        }
        return c361980EHc;
    }

    public final void LIZIZ(Object obj, String str) {
        if (obj != null) {
            this.LJII.put(str, obj);
        }
    }
}

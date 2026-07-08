package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361980EHc extends C0EHX {
    public CharSequence LIZJ;
    public final Integer LIZLLL;
    public Drawable LJ;
    public final Function0<? extends Drawable> LJFF;
    public final String LJI;
    public boolean LJII;
    public float LJIIIIZZ;
    public final boolean LJIIIZ;
    public final long LJIIJ;
    public final HashMap<String, Object> LJIIJJI;
    public String LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL = -1;
    public final List<C361980EHc> LJIILL = new ArrayList();
    public C353890Du7 LJIILLIIL;
    public final C0EI2 LJIIZILJ;

    public C361980EHc(C361970EHb c361970EHb) {
        this.LIZJ = c361970EHb.LIZ;
        this.LIZLLL = c361970EHb.LIZIZ;
        this.LJ = c361970EHb.LIZJ;
        this.LJFF = c361970EHb.LIZLLL;
        this.LJI = c361970EHb.LJ;
        this.LJII = c361970EHb.LJIIIZ;
        this.LJIIIIZZ = c361970EHb.LJIIJ;
        this.LJIIIZ = c361970EHb.LJIIJJI;
        this.LJIIJ = c361970EHb.LJI;
        this.LJIIJJI = c361970EHb.LJII;
        this.LJIIL = c361970EHb.LJIIIIZZ;
        this.LJIIZILJ = c361970EHb.LJIIL;
    }

    public final boolean LIZ(C361980EHc c361980EHc) {
        if (((ArrayList) this.LIZ).isEmpty()) {
            return false;
        }
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(((C361980EHc) it2.next()).LJI, c361980EHc.LJI)) {
                return true;
            }
        }
        return false;
    }

    public final <T> T LIZIZ(String str) {
        T t = (T) this.LJIIJJI.get(str);
        if (t == null) {
            return null;
        }
        return t;
    }

    public final void LIZJ(String str) {
        this.LJIIJJI.remove(str);
    }

    public final void LIZLLL(List<C361980EHc> list) {
        if (list == null) {
            ((ArrayList) this.LIZ).clear();
            return;
        }
        if (!this.LIZ.isEmpty()) {
            ((ArrayList) this.LIZ).clear();
        }
        ((ArrayList) this.LIZ).addAll(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C361980EHc)) {
            return false;
        }
        C361980EHc c361980EHc = (C361980EHc) obj;
        if (!TextUtils.equals(this.LJI, c361980EHc.LJI) || !TextUtils.equals(this.LIZJ, c361980EHc.LIZJ) || this.LJIIIIZZ != c361980EHc.LJIIIIZZ || this.LJII != c361980EHc.LJII || !Intrinsics.LJFF(this.LIZLLL, c361980EHc.LIZLLL) || !Intrinsics.LJFF(this.LJIIJJI, c361980EHc.LJIIJJI) || !Intrinsics.LJFF(this.LJIILLIIL, c361980EHc.LJIILLIIL) || !Intrinsics.LJFF(this.LJIIZILJ, c361980EHc.LJIIZILJ)) {
            return false;
        }
        return true;
    }
}

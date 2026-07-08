package X;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0VMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796520VMk {
    public final C0VKA LIZ;
    public final Context LIZIZ;
    public final String LIZJ;
    public final C796530VMl LIZLLL;
    public final List<C0VK6> LJ;
    public final boolean LJII;
    public final EnumC611420NyW LJIIIIZZ;
    public final Executor LJIIIZ;
    public final Executor LJIIJ;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIIJJI = false;
    public final List<Object> LJFF = Collections.emptyList();
    public final List<InterfaceC2275591E5d> LJI = Collections.emptyList();

    public final boolean LIZ(int i, int i2) {
        if ((i <= i2 || !this.LJIILIIL) && this.LJIIL) {
            return true;
        }
        return false;
    }

    public C796520VMk(Context context, String str, C0VKA c0vka, C796530VMl c796530VMl, List list, boolean z, EnumC611420NyW enumC611420NyW, Executor executor, Executor executor2, boolean z2, boolean z3) {
        this.LIZ = c0vka;
        this.LIZIZ = context;
        this.LIZJ = str;
        this.LIZLLL = c796530VMl;
        this.LJ = list;
        this.LJII = z;
        this.LJIIIIZZ = enumC611420NyW;
        this.LJIIIZ = executor;
        this.LJIIJ = executor2;
        this.LJIIL = z2;
        this.LJIILIIL = z3;
    }
}

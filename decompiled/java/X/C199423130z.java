package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: X.130z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199423130z extends AbstractC19939512zx implements InterfaceC19931112yb {
    public static final AnonymousClass1310 LLIZ = new Comparator<C199423130z>() { // from class: X.1310
        @Override // java.util.Comparator
        public final int compare(C199423130z c199423130z, C199423130z c199423130z2) {
            return Integer.compare(c199423130z.getNumber(), c199423130z2.getNumber());
        }
    };
    public static final AnonymousClass1312 LLIZLLLIL = new ToIntFunction() { // from class: X.1312
        @Override // java.util.function.ToIntFunction
        public final int applyAsInt(Object obj) {
            return ((C199423130z) obj).getNumber();
        }
    };
    public final int LLILLJJLI;
    public final C131J LLILLL;
    public volatile C131X LLILZ;
    public final String LLILZIL;
    public final C199422130y LLILZLL;

    @Override // X.AbstractC19939512zx
    public final AnonymousClass1302 LJI() {
        return this.LLILZLL.LJI();
    }

    @Override // X.AbstractC19939512zx
    public final String LJIIIZ() {
        return this.LLILLL.getName();
    }

    public final C131X LJIILLIIL() {
        if (this.LLILZ == null) {
            C131X options = this.LLILLL.getOptions();
            if (options.hasFeatures()) {
                C131W builder = options.toBuilder();
                builder.LLILZLL &= -3;
                builder.LLIZLLLIL = null;
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = builder.LLJ;
                if (c130n != null) {
                    c130n.LIZ = null;
                    builder.LLJ = null;
                }
                builder.LJIILLIIL();
                options = builder.buildPartial();
                if (!options.isInitialized()) {
                    throw AbstractC19931812yi.LJI(options);
                }
            }
            synchronized (this) {
                try {
                    if (this.LLILZ == null) {
                        this.LLILZ = options;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LLILZ;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LLILLL.getNumber();
    }

    public final String toString() {
        return this.LLILLL.getName();
    }

    @Override // X.AbstractC19939512zx
    public final String LJII() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC19939512zx
    public final AbstractC19939512zx LJIIJ() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC19939512zx
    public final /* bridge */ /* synthetic */ InterfaceC19930912yZ LJIILJJIL() {
        return this.LLILLL;
    }

    public C199423130z(C199422130y c199422130y, Integer num) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UNKNOWN_ENUM_VALUE_");
        sbLIZ.append(c199422130y.LJIIIZ());
        sbLIZ.append("_");
        sbLIZ.append(num);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C131I c131iNewBuilder = C131J.newBuilder();
        if (strLIZIZ != null) {
            c131iNewBuilder.LLILZLL = strLIZIZ;
            c131iNewBuilder.LLILZIL |= 1;
            c131iNewBuilder.LJIILLIIL();
            c131iNewBuilder.LLIZ = num.intValue();
            c131iNewBuilder.LLILZIL |= 2;
            c131iNewBuilder.LJIILLIIL();
            C131J c131jLJIJJ = c131iNewBuilder.buildPartial();
            if (c131jLJIJJ.isInitialized()) {
                this.LLILLJJLI = -1;
                this.LLILLL = c131jLJIJJ;
                this.LLILZLL = c199422130y;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c199422130y.LLILLL);
                sbLIZ2.append('.');
                sbLIZ2.append(c131jLJIJJ.getName());
                this.LLILZIL = C2188811AlT.LIZIZ(sbLIZ2);
                return;
            }
            throw AbstractC19931812yi.LJI(c131jLJIJJ);
        }
        c131iNewBuilder.getClass();
        throw null;
    }

    public C199423130z(C131J c131j, C199422130y c199422130y, int i) {
        this.LLILLJJLI = i;
        this.LLILLL = c131j;
        this.LLILZLL = c199422130y;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c199422130y.LLILLL);
        sbLIZ.append('.');
        sbLIZ.append(c131j.getName());
        this.LLILZIL = C2188811AlT.LIZIZ(sbLIZ);
        c199422130y.LJI().LLJ.LIZIZ(this);
    }
}

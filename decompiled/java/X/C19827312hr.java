package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12hr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19827312hr implements InterfaceC1456340o08<InterfaceC19827912hx> {
    public static final C19827312hr LLILLJJLI = new C19827312hr();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19827912hx() { // from class: X.12gF
        public static final C19820012gg LIZ;
        public static final C19818612gS LIZIZ;
        public static final C19819812ge LIZJ;
        public static final C19819812ge LIZLLL;
        public static final C19824612hQ LJ;

        /* JADX WARN: Type inference failed for: r0v6, types: [X.12gS] */
        static {
            final C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.test.boolean_flag", false);
            final Double dValueOf = Double.valueOf(-3.0d);
            LIZIZ = new AbstractC19833712it<Double>(c19819912gfLIZJ, dValueOf) { // from class: X.12gS
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC19833712it
                public final Double LIZJ(Object obj) {
                    if (!(obj instanceof Double)) {
                        if (obj instanceof Float) {
                            return Double.valueOf(((Float) obj).doubleValue());
                        }
                        if (obj instanceof String) {
                            try {
                                return Double.valueOf(CastDoubleProtector.parseDouble((String) obj));
                            } catch (NumberFormatException e) {
                                TryCatchGuardChecker.doCheck(e);
                                return null;
                            }
                        }
                        return null;
                    }
                    return obj;
                }
            };
            LIZJ = c19819912gfLIZJ.LIZ(-2L, "measurement.test.int_flag");
            LIZLLL = c19819912gfLIZJ.LIZ(-1L, "measurement.test.long_flag");
            LJ = c19819912gfLIZJ.LIZLLL("measurement.test.string_flag", "---");
        }

        @Override // X.InterfaceC19827912hx
        public final long LIZ() {
            return LIZJ.LIZ().longValue();
        }

        @Override // X.InterfaceC19827912hx
        public final long LIZIZ() {
            return LIZLLL.LIZ().longValue();
        }

        @Override // X.InterfaceC19827912hx
        public final String LIZLLL() {
            return LJ.LIZ();
        }

        @Override // X.InterfaceC19827912hx
        public final boolean LJ() {
            return LIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19827912hx
        public final double zza() {
            return LIZIZ.LIZ().doubleValue();
        }
    });

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12hx] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19827912hx get() {
        return this.LL.LL;
    }
}

package X;

import Y.AgS198S0200000_7;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AFwS290S0000000_7;

/* JADX INFO: renamed from: X.0KVE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0KVE {
    public final InterfaceC346201Wa<AbstractC511920K5u> LIZ;
    public AbstractC511920K5u LIZIZ;
    public AnonymousClass0956 LIZJ;

    public C0KVE(C01S9 c01s9) {
        this.LIZ = c01s9;
    }

    public final void LIZ(LifecycleOwner lifecycleOwner, Function1<? super AbstractC511920K5u, Unit> function1) {
        final AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(355);
        AFwS290S0000000_7 aFwS290S0000000_7 = AFwS290S0000000_7.get$arr$(28);
        AFwS237S0000000_7 aFwS237S0000000_72 = AFwS237S0000000_7.get$arr$(356);
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        final InterfaceC346201Wa<AbstractC511920K5u> interfaceC346201Wa = this.LIZ;
        final int i = 0;
        final InterfaceC346201Wa interfaceC346201Wa2 = new InterfaceC346201Wa(interfaceC346201Wa, this, i) { // from class: X.0KdT
            public final int $t;
            public Object l0;
            public Object l1;

            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                switch (this.$t) {
                    case 0:
                        return collect$0(this, interfaceC346701Wf, interfaceC1364105Vn);
                    case 1:
                        return collect$1(this, interfaceC346701Wf, interfaceC1364105Vn);
                    default:
                        return null;
                }
            }

            {
                this.$t = i;
                this.l0 = interfaceC346201Wa;
                this.l1 = this;
            }

            public static final Object collect$0(C521930KdT c521930KdT, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = ((InterfaceC346201Wa) c521930KdT.l0).collect(new AgS198S0200000_7(interfaceC346701Wf, (C0KVE) c521930KdT.l1, 2), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }

            public static final Object collect$1(C521930KdT c521930KdT, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = ((InterfaceC346201Wa) c521930KdT.l0).collect(new AgS198S0200000_7(interfaceC346701Wf, (Function1) c521930KdT.l1, 3), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        };
        final int i2 = 1;
        InterfaceC346201Wa interfaceC346201WaLJIILJJIL = C09IC.LJIILJJIL(aFwS290S0000000_7, new InterfaceC346201Wa(interfaceC346201Wa2, aFwS237S0000000_7, i2) { // from class: X.0KdT
            public final int $t;
            public Object l0;
            public Object l1;

            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                switch (this.$t) {
                    case 0:
                        return collect$0(this, interfaceC346701Wf, interfaceC1364105Vn);
                    case 1:
                        return collect$1(this, interfaceC346701Wf, interfaceC1364105Vn);
                    default:
                        return null;
                }
            }

            {
                this.$t = i2;
                this.l0 = interfaceC346201Wa2;
                this.l1 = aFwS237S0000000_7;
            }

            public static final Object collect$0(C521930KdT c521930KdT, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = ((InterfaceC346201Wa) c521930KdT.l0).collect(new AgS198S0200000_7(interfaceC346701Wf, (C0KVE) c521930KdT.l1, 2), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }

            public static final Object collect$1(C521930KdT c521930KdT, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = ((InterfaceC346201Wa) c521930KdT.l0).collect(new AgS198S0200000_7(interfaceC346701Wf, (Function1) c521930KdT.l1, 3), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        });
        aFwS237S0000000_72.getClass();
        this.LIZJ = C457801qK.LIZ(interfaceC346201WaLJIILJJIL, lifecycleOwner, new C0KVD(function1));
    }
}

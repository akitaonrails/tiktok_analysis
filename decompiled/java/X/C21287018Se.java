package X;

import Y.AgS213S0200000_32;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AFwS301S0000000_17;

/* JADX INFO: renamed from: X.18Se, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21287018Se {
    public final InterfaceC346201Wa<AbstractC509530JyZ> LIZ;
    public AbstractC509530JyZ LIZIZ;
    public AnonymousClass0956 LIZJ;

    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21287018Se(InterfaceC346201Wa<? extends AbstractC509530JyZ> interfaceC346201Wa) {
        this.LIZ = interfaceC346201Wa;
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, Function1<? super AbstractC509530JyZ, Unit> function1) {
        final AFwS278S0000000_32 aFwS278S0000000_32 = AFwS278S0000000_32.get$arr$(156);
        AFwS301S0000000_17 aFwS301S0000000_17 = AFwS301S0000000_17.get$arr$(19);
        AFwS278S0000000_32 aFwS278S0000000_322 = AFwS278S0000000_32.get$arr$(157);
        LIZ();
        final InterfaceC346201Wa<AbstractC509530JyZ> interfaceC346201Wa = this.LIZ;
        final int i = 0;
        final InterfaceC346201Wa interfaceC346201Wa2 = new InterfaceC346201Wa(interfaceC346201Wa, this, i) { // from class: X.19Lm
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

            public static final Object collect$0(C21524419Lm c21524419Lm, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = ((InterfaceC346201Wa) c21524419Lm.l0).collect(new AgS213S0200000_32(interfaceC346701Wf, (C21287018Se) c21524419Lm.l1, 0), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }

            public static final Object collect$1(C21524419Lm c21524419Lm, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = ((InterfaceC346201Wa) c21524419Lm.l0).collect(new AgS213S0200000_32(interfaceC346701Wf, (Function1) c21524419Lm.l1, 1), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        };
        final int i2 = 1;
        InterfaceC346201Wa interfaceC346201WaLJIILJJIL = C09IC.LJIILJJIL(aFwS301S0000000_17, new InterfaceC346201Wa(interfaceC346201Wa2, aFwS278S0000000_32, i2) { // from class: X.19Lm
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
                this.l1 = aFwS278S0000000_32;
            }

            public static final Object collect$0(C21524419Lm c21524419Lm, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = ((InterfaceC346201Wa) c21524419Lm.l0).collect(new AgS213S0200000_32(interfaceC346701Wf, (C21287018Se) c21524419Lm.l1, 0), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }

            public static final Object collect$1(C21524419Lm c21524419Lm, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = ((InterfaceC346201Wa) c21524419Lm.l0).collect(new AgS213S0200000_32(interfaceC346701Wf, (Function1) c21524419Lm.l1, 1), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        });
        aFwS278S0000000_322.getClass();
        this.LIZJ = C457201qE.LIZ(interfaceC346201WaLJIILJJIL, lifecycleOwner, new C0KVC(function1));
    }
}

package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A4O, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A4O {
    public static final /* synthetic */ C1A4O[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1A4O RANGE1;
    public static final C1A4O RANGE2;
    public static final C1A4O RANGE3;
    public static final C1A4O RANGE4;
    public static final C1A4O RANGE5;
    public static final C1A4O RANGE6;
    public static final C1A4O RANGE7;

    public C1A4O() {
        throw null;
    }

    public static InterfaceC2044707zh<C1A4O> getEntries() {
        return LLILLJJLI;
    }

    public abstract int getMax$pns_age_gate_compliance_release();

    public abstract int getMin$pns_age_gate_compliance_release();

    static {
        C1A4O c1a4o = new C1A4O() { // from class: X.1A4P
            @Override // X.C1A4O
            public final int getMax$pns_age_gate_compliance_release() {
                return 12;
            }

            @Override // X.C1A4O
            public final int getMin$pns_age_gate_compliance_release() {
                return 2;
            }
        };
        RANGE1 = c1a4o;
        C1A4O c1a4o2 = new C1A4O() { // from class: X.1A4Q
            @Override // X.C1A4O
            public final int getMax$pns_age_gate_compliance_release() {
                return 17;
            }

            @Override // X.C1A4O
            public final int getMin$pns_age_gate_compliance_release() {
                return 13;
            }
        };
        RANGE2 = c1a4o2;
        C1A4O c1a4o3 = new C1A4O() { // from class: X.1A4R
            @Override // X.C1A4O
            public final int getMax$pns_age_gate_compliance_release() {
                return 24;
            }

            @Override // X.C1A4O
            public final int getMin$pns_age_gate_compliance_release() {
                return 18;
            }
        };
        RANGE3 = c1a4o3;
        C1A4O c1a4o4 = new C1A4O() { // from class: X.1A4S
            @Override // X.C1A4O
            public final int getMax$pns_age_gate_compliance_release() {
                return 34;
            }

            @Override // X.C1A4O
            public final int getMin$pns_age_gate_compliance_release() {
                return 25;
            }
        };
        RANGE4 = c1a4o4;
        C1A4O c1a4o5 = new C1A4O() { // from class: X.1A4T
            @Override // X.C1A4O
            public final int getMax$pns_age_gate_compliance_release() {
                return 44;
            }

            @Override // X.C1A4O
            public final int getMin$pns_age_gate_compliance_release() {
                return 35;
            }
        };
        RANGE5 = c1a4o5;
        C1A4O c1a4o6 = new C1A4O() { // from class: X.1A4U
            @Override // X.C1A4O
            public final int getMax$pns_age_gate_compliance_release() {
                return 54;
            }

            @Override // X.C1A4O
            public final int getMin$pns_age_gate_compliance_release() {
                return 45;
            }
        };
        RANGE6 = c1a4o6;
        C1A4O c1a4o7 = new C1A4O() { // from class: X.1A4V
            @Override // X.C1A4O
            public final int getMax$pns_age_gate_compliance_release() {
                return 122;
            }

            @Override // X.C1A4O
            public final int getMin$pns_age_gate_compliance_release() {
                return 55;
            }
        };
        RANGE7 = c1a4o7;
        C1A4O[] c1a4oArr = {c1a4o, c1a4o2, c1a4o3, c1a4o4, c1a4o5, c1a4o6, c1a4o7};
        LL = c1a4oArr;
        LLILLJJLI = new C2254308sP(c1a4oArr);
    }

    public static C1A4O[] values() {
        return (C1A4O[]) LL.clone();
    }

    public static C1A4O valueOf(String str) {
        return (C1A4O) C08FF.LIZ(C1A4O.class, str);
    }

    public C1A4O(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}

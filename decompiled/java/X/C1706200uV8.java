package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uV8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706200uV8 implements InterfaceC1179304jP {
    public final String LIZ;
    public final String LIZIZ;
    public List<C1706180uV6> LIZJ;
    public List<C1706180uV6> LIZLLL;

    public C1706200uV8() {
        C1706360uVO.LIZ().LIZ().getClass();
        this.LIZ = "ame_trigger_instant";
        C1706360uVO.LIZ().LIZ().getClass();
        this.LIZIZ = "ame_action";
    }

    @Override // X.InterfaceC1179304jP
    public final Object LIZ(final Boolean bool, InterfaceC1364105Vn<? super C1706230uVB> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        final C1706130uV1 c1706130uV1LJIIIZ = C2256241DSs.LJIIIZ();
        c1706130uV1LJIIIZ.LIZIZ(this.LIZIZ, "all");
        final C013C c013c = new C013C();
        List<C1706180uV6> list = this.LIZLLL;
        if (list != null) {
            c013c.element = true;
            C1706230uVB c1706230uVB = new C1706230uVB(true, list);
            C189200o6.m2constructorimpl(c1706230uVB);
            c2252611DEt.resumeWith(c1706230uVB);
            c1706130uV1LJIIIZ.LIZ(true);
            if (Intrinsics.LJFF(bool, true)) {
                c1706130uV1LJIIIZ.LIZLLL();
            }
        }
        C1706380uVQ.LIZ().LJIIL(this.LIZIZ, new C1706160uV4(), new InterfaceC1705380uTo<List<? extends C1706180uV6>>(this) { // from class: X.0uV9
            public final /* synthetic */ C1706200uV8 LIZJ;

            @Override // X.InterfaceC1705380uTo
            public final void LIZ(Integer num, String str) {
                int iIntValue;
                c1706130uV1LJIIIZ.LIZ(false);
                C1706130uV1 c1706130uV1 = c1706130uV1LJIIIZ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -999;
                }
                c1706130uV1.LIZIZ.LIZJ = iIntValue;
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    c1706130uV1LJIIIZ.LIZLLL();
                }
                this.LIZJ.LIZLLL = null;
                if (c013c.element) {
                    return;
                }
                InterfaceC20236714Gf<C1706230uVB> interfaceC20236714Gf = c2252611DEt;
                C1706230uVB c1706230uVB2 = new C1706230uVB(false, C13BV.INSTANCE);
                C189200o6.m2constructorimpl(c1706230uVB2);
                interfaceC20236714Gf.resumeWith(c1706230uVB2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1705380uTo
            public final void LIZIZ(List<? extends C1706180uV6> list2, boolean z) {
                List<? extends C1706180uV6> list3 = list2;
                this.LIZJ.LIZLLL = list3;
                if (!c013c.element) {
                    InterfaceC20236714Gf<C1706230uVB> interfaceC20236714Gf = c2252611DEt;
                    C1706230uVB c1706230uVB2 = new C1706230uVB(true, list3);
                    C189200o6.m2constructorimpl(c1706230uVB2);
                    interfaceC20236714Gf.resumeWith(c1706230uVB2);
                    c1706130uV1LJIIIZ.LIZ(z);
                    if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                        c1706130uV1LJIIIZ.LIZLLL();
                    }
                }
            }

            {
                this.LIZJ = this;
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // X.InterfaceC1179304jP
    public final Object LIZIZ(final Boolean bool, InterfaceC1364105Vn<? super C1706230uVB> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        final C013C c013c = new C013C();
        final C1706130uV1 c1706130uV1LJIIIZ = C2256241DSs.LJIIIZ();
        c1706130uV1LJIIIZ.LIZIZ(this.LIZ, "all");
        List<C1706180uV6> list = this.LIZJ;
        if (list != null) {
            c013c.element = true;
            C1706230uVB c1706230uVB = new C1706230uVB(true, list);
            C189200o6.m2constructorimpl(c1706230uVB);
            c2252611DEt.resumeWith(c1706230uVB);
            c1706130uV1LJIIIZ.LIZ(true);
            if (Intrinsics.LJFF(bool, true)) {
                c1706130uV1LJIIIZ.LIZLLL();
            }
        }
        C1706380uVQ.LIZ().LJIIL(this.LIZ, new C1706160uV4(), new InterfaceC1705380uTo<List<? extends C1706180uV6>>() { // from class: X.0uVA
            @Override // X.InterfaceC1705380uTo
            public final void LIZ(Integer num, String str) {
                int iIntValue;
                this.LIZ.LIZJ = null;
                if (c013c.element) {
                    return;
                }
                c1706130uV1LJIIIZ.LIZ(false);
                C1706130uV1 c1706130uV1 = c1706130uV1LJIIIZ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -999;
                }
                c1706130uV1.LIZIZ.LIZJ = iIntValue;
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    c1706130uV1LJIIIZ.LIZLLL();
                }
                InterfaceC20236714Gf<C1706230uVB> interfaceC20236714Gf = c2252611DEt;
                C1706230uVB c1706230uVB2 = new C1706230uVB(false, C13BV.INSTANCE);
                C189200o6.m2constructorimpl(c1706230uVB2);
                interfaceC20236714Gf.resumeWith(c1706230uVB2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1705380uTo
            public final void LIZIZ(List<? extends C1706180uV6> list2, boolean z) {
                List<? extends C1706180uV6> list3 = list2;
                this.LIZ.LIZJ = list3;
                if (!c013c.element) {
                    InterfaceC20236714Gf<C1706230uVB> interfaceC20236714Gf = c2252611DEt;
                    C1706230uVB c1706230uVB2 = new C1706230uVB(true, list3);
                    C189200o6.m2constructorimpl(c1706230uVB2);
                    interfaceC20236714Gf.resumeWith(c1706230uVB2);
                    c1706130uV1LJIIIZ.LIZ(z);
                    if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                        c1706130uV1LJIIIZ.LIZLLL();
                    }
                }
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}

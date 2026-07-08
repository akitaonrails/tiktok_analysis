package X;

import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05NN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthEffectCarouselComponent$combineScrollWithDownloadObserve$1$2", f = "FullWidthEffectCarouselComponent.kt", l = {1255}, m = "invokeSuspend")
public final class C05NN extends C09AX implements Function2<Pair<? extends C05NT, ? extends Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ o LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05NN(o oVar, InterfaceC1364105Vn<? super C05NN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = oVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05NN c05nn = new C05NN(this.LLILLL, interfaceC1364105Vn);
        c05nn.LLILLJJLI = obj;
        return c05nn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05NT c05nt;
        C05NR c05ns;
        C1C7U.LIZ("FullWidthEffectCarouselComponent@e1ee.combineScrollWithDownloadObserve$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                c05nt = (C05NT) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Pair pair = (Pair) this.LLILLJJLI;
            c05nt = (C05NT) pair.getFirst();
            boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
            if (zBooleanValue) {
                c05ns = new C05NS(Unit.LIZ);
            } else if (Intrinsics.LJFF(c05nt, C05NU.LIZ)) {
                c05ns = new C05NR<T>() { // from class: X.05NP
                    public final Throwable LIZ = null;

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof C05NP) && Intrinsics.LJFF(this.LIZ, ((C05NP) obj2).LIZ);
                    }

                    public final int hashCode() {
                        Throwable th = this.LIZ;
                        if (th == null) {
                            return 0;
                        }
                        return th.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Failed(throwable=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                };
            } else if (c05nt instanceof C05NO) {
                c05ns = new C05NQ(((C05NO) c05nt).LIZ);
            } else if (Intrinsics.LJFF(c05nt, C05NV.LIZ)) {
                c05ns = new C05NS(Unit.LIZ);
            } else {
                throw new C1954807lC();
            }
            C201955140j.LIZLLL(C1632470saD.LIZIZ, "OptimizationApplyOpportunity", "combineScrollWithDownloadObserve send carouselState status = " + c05ns);
            this.LLILLL.y7(c05ns);
            if (!zBooleanValue && (c05nt instanceof C05NO)) {
                this.LLILLJJLI = c05nt;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(7000L, this) == objLJFF) {
                    C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.combineScrollWithDownloadObserve$1$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.combineScrollWithDownloadObserve$1$2");
            return unit;
        }
        C1632470saD c1632470saD = C1632470saD.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download stall timeout fired at progress=");
        sbLIZ.append(((C05NO) c05nt).LIZ);
        C201955140j.LJIJJ(c1632470saD, "FullWidthEffectCarouselComponent", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL.y7(new C05NR<T>() { // from class: X.05NP
            public final Throwable LIZ = null;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C05NP) && Intrinsics.LJFF(this.LIZ, ((C05NP) obj2).LIZ);
            }

            public final int hashCode() {
                Throwable th = this.LIZ;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Failed(throwable=");
                sbLIZ2.append(this.LIZ);
                sbLIZ2.append(')');
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        });
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.combineScrollWithDownloadObserve$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends C05NT, ? extends Boolean> pair, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(pair, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

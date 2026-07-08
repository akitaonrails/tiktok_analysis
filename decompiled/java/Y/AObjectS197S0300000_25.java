package Y;

import X.AbstractC1683310tuD;
import X.AbstractC1686530tzP;
import X.C13FE;
import X.C1672890tdP;
import X.C1676370tj1;
import X.C1676970tjz;
import X.C1677730tlD;
import X.C1677750tlF;
import X.C19968013Aw;
import X.C259800zU;
import X.C814420VxA;
import X.C817403Hg;
import X.EnumC1684030tvN;
import X.InterfaceC1677860tlQ;
import X.InterfaceC1680560tpm;
import X.InterfaceC1689940u4u;
import X.InterfaceC497601wk;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS197S0300000_25 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$0(AObjectS197S0300000_25 aObjectS197S0300000_25, Object obj) {
        Function1<?, Unit> function1;
        C1677750tlF c1677750tlF = (C1677750tlF) aObjectS197S0300000_25.l0;
        C817403Hg c817403Hg = (C817403Hg) aObjectS197S0300000_25.l1;
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) aObjectS197S0300000_25.l2;
        long jLongValue = ((Long) obj).longValue();
        if (c1677750tlF.LIZLLL == Long.MIN_VALUE || c817403Hg.element != C1677750tlF.LIZJ(interfaceC497601wk.getCoroutineContext())) {
            c1677750tlF.LIZLLL = jLongValue;
            C19968013Aw<C1677730tlD<?, ?>> c19968013Aw = c1677750tlF.LIZIZ;
            C1677730tlD<?, ?>[] c1677730tlDArr = c19968013Aw.LL;
            int i = c19968013Aw.LLILLL;
            for (int i2 = 0; i2 < i; i2++) {
                c1677730tlDArr[i2].LLIZLLLIL = true;
            }
            c817403Hg.element = C1677750tlF.LIZJ(interfaceC497601wk.getCoroutineContext());
        }
        float f = c817403Hg.element;
        if (f == 0.0f) {
            C19968013Aw<C1677730tlD<?, ?>> c19968013Aw2 = c1677750tlF.LIZIZ;
            C1677730tlD<?, ?>[] c1677730tlDArr2 = c19968013Aw2.LL;
            int i3 = c19968013Aw2.LLILLL;
            for (int i4 = 0; i4 < i3; i4++) {
                C1677730tlD<?, ?> c1677730tlD = c1677730tlDArr2[i4];
                ((C13FE) c1677730tlD.LLILZLL).setValue(c1677730tlD.LLJIJIL.LIZJ);
                c1677730tlD.LLIZLLLIL = true;
            }
        } else {
            long j = (long) ((jLongValue - c1677750tlF.LIZLLL) / f);
            C19968013Aw<C1677730tlD<?, ?>> c19968013Aw3 = c1677750tlF.LIZIZ;
            C1677730tlD<?, ?>[] c1677730tlDArr3 = c19968013Aw3.LL;
            int i5 = c19968013Aw3.LLILLL;
            boolean z = true;
            for (int i6 = 0; i6 < i5; i6++) {
                C1677730tlD<?, ?> c1677730tlD2 = c1677730tlDArr3[i6];
                if (!c1677730tlD2.LLIZ) {
                    ((C13FE) c1677730tlD2.LLJILJIL.LIZJ).setValue(Boolean.FALSE);
                    if (c1677730tlD2.LLIZLLLIL) {
                        c1677730tlD2.LLIZLLLIL = false;
                        c1677730tlD2.LLJ = j;
                    }
                    long j2 = j - c1677730tlD2.LLJ;
                    ((C13FE) c1677730tlD2.LLILZLL).setValue(c1677730tlD2.LLJIJIL.LJ(j2));
                    Function1<?, Unit> function12 = c1677730tlD2.LLILZ;
                    if (function12 != null) {
                        function12.invoke(c1677730tlD2.getValue());
                    }
                    InterfaceC1677860tlQ interfaceC1677860tlQ = c1677730tlD2.LLJIJIL;
                    interfaceC1677860tlQ.getClass();
                    boolean zLIZ = C1676970tjz.LIZ(interfaceC1677860tlQ, j2);
                    c1677730tlD2.LLIZ = zLIZ;
                    if (zLIZ && (function1 = c1677730tlD2.LLILZIL) != null) {
                        function1.invoke(c1677730tlD2.getValue());
                    }
                }
                if (!c1677730tlD2.LLIZ) {
                    z = false;
                }
            }
            ((C13FE) c1677750tlF.LJ).setValue(Boolean.valueOf(!z));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS197S0300000_25 aObjectS197S0300000_25, Object obj) {
        float fLJII;
        float f;
        InterfaceC1689940u4u interfaceC1689940u4u = (InterfaceC1689940u4u) aObjectS197S0300000_25.l0;
        C1676370tj1 c1676370tj1 = (C1676370tj1) aObjectS197S0300000_25.l1;
        AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) aObjectS197S0300000_25.l2;
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        if (interfaceC1689940u4u.LLIILII()) {
            fLJII = c1676370tj1.LLJJ.LIZIZ().LIZLLL(c1676370tj1.LLJJ.LJ());
        } else {
            fLJII = c1676370tj1.LLJJ.LJII();
        }
        EnumC1684030tvN enumC1684030tvN = c1676370tj1.LLJJIII;
        if (enumC1684030tvN == EnumC1684030tvN.Horizontal) {
            f = fLJII;
        } else {
            f = 0.0f;
        }
        if (enumC1684030tvN != EnumC1684030tvN.Vertical) {
            fLJII = 0.0f;
        }
        abstractC1683310tuD.LIZLLL(abstractC1686530tzP, C814420VxA.LIZIZ(f), C814420VxA.LIZIZ(fLJII), 0.0f);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0tdR, androidx.lifecycle.LifecycleObserver] */
    public static final Object invoke$2(AObjectS197S0300000_25 aObjectS197S0300000_25, Object obj) {
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) aObjectS197S0300000_25.l0;
        final C1672890tdP c1672890tdP = (C1672890tdP) aObjectS197S0300000_25.l1;
        final Function1 function1 = (Function1) aObjectS197S0300000_25.l2;
        final C259800zU c259800zU = new C259800zU();
        final ?? r1 = new LifecycleEventObserver() { // from class: X.0tdR
            /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                C1672890tdP c1672890tdP2 = c1672890tdP;
                C259800zU c259800zU2 = c259800zU;
                Function1 function12 = function1;
                int i = C1488710oqL.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        InterfaceC1672920tdS interfaceC1672920tdS = (InterfaceC1672920tdS) c259800zU2.element;
                        if (interfaceC1672920tdS != null) {
                            interfaceC1672920tdS.LIZ();
                        }
                        c259800zU2.element = null;
                        return;
                    }
                    return;
                }
                c259800zU2.element = function12.invoke(c1672890tdP2);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(r1);
        return new InterfaceC1680560tpm() { // from class: X.0tdQ
            @Override // X.InterfaceC1680560tpm
            public final void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(r1);
                InterfaceC1672920tdS interfaceC1672920tdS = (InterfaceC1672920tdS) c259800zU.element;
                if (interfaceC1672920tdS != null) {
                    interfaceC1672920tdS.LIZ();
                }
            }
        };
    }

    public AObjectS197S0300000_25(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS96S1000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737910Sx3 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C737910Sx3.class, "vm", "<v#0>", 1);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(C737910Sx3.class, "vm", "<v#1>", 1);
        c09r3.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2};
    }

    public static final Activity LIZIZ(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final C19EG LJ(Context context) {
        Activity activityLIZIZ = LIZIZ(context);
        if (activityLIZIZ instanceof C19EG) {
            return (C19EG) activityLIZIZ;
        }
        return null;
    }

    public static final C01GW LIZJ(ReusedAssem reusedAssem, C19719912Dl c19719912Dl, Function1 function1) {
        if (!C725080ScM.LJFF) {
            return new C737800Sws(C724750Sbp.LJIIJ(reusedAssem, c19719912Dl), reusedAssem, new C452080Ho6(), new C940900aam(), function1, EnumC452301pR.SYNCHRONIZED);
        }
        final InterfaceC1731706qJ interfaceC1731706qJLIZIZ = C737920Sx4.LIZIZ(reusedAssem, C724750Sbp.LJIIJ(reusedAssem, c19719912Dl), null, function1, 12);
        return new C01GW<Object>() { // from class: X.0QCM
            @Override // X.C01GW
            public final Object getValue() {
                return interfaceC1731706qJLIZIZ.getValue(null, C737910Sx3.LIZ[1]);
            }

            @Override // X.C01GW
            public final boolean isInitialized() {
                return ((AssemViewModel) interfaceC1731706qJLIZIZ.getValue(null, C737910Sx3.LIZ[1]))._initialized;
            }
        };
    }

    public static final C01GW LIZLLL(C0SMN c0smn, C19719912Dl c19719912Dl, Function1 function1, EnumC452301pR enumC452301pR) {
        if (!C725080ScM.LJFF) {
            return new C737780Swq(c19719912Dl, new C1276904z9(c0smn, c19719912Dl.LJI()), new C452080Ho6(), C724750Sbp.LJII(c0smn), c0smn, new C940900aam(), function1, c0smn.C41(), enumC452301pR);
        }
        ReusedUIAssem<?> reusedUIAssemNG1 = c0smn.NG1();
        final InterfaceC1731706qJ interfaceC1731706qJLIZIZ = C737920Sx4.LIZIZ(reusedUIAssemNG1, C724750Sbp.LJIIJ(reusedUIAssemNG1, c19719912Dl), new AwS96S1000000_11(C09R7.LIZ(c19719912Dl).getName(), 0), function1, 4);
        return new C01GW<Object>() { // from class: X.0QCL
            @Override // X.C01GW
            public final Object getValue() {
                return interfaceC1731706qJLIZIZ.getValue(null, C737910Sx3.LIZ[0]);
            }

            @Override // X.C01GW
            public final boolean isInitialized() {
                return ((AssemViewModel) interfaceC1731706qJLIZIZ.getValue(null, C737910Sx3.LIZ[0]))._initialized;
            }
        };
    }

    /* JADX WARN: Incorrect types in method signature: <S::LX/002o;VM:Lcom/bytedance/assem/arch/viewModel/AssemViewModel<TS;>;T:Lcom/bytedance/assem/arch/reused/ReusedAssem<+LX/03H5;>;:LX/0Rxx<TITEM;>;ITEM:Ljava/lang/Object;>(TT;Lkotlin/jvm/functions/Function0<+LX/13IQ<TVM;>;>;LX/0Sbq;LX/06bB;Lkotlin/jvm/functions/Function0<Ljava/lang/String;>;Lkotlin/jvm/functions/Function0<+Landroidx/lifecycle/ViewModelProvider$Factory;>;Lkotlin/jvm/functions/Function1<-TS;+TS;>;)LX/06qJ<Ljava/lang/Object;TVM;>; */
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
    public static final InterfaceC1731706qJ LIZ(ReusedAssem reusedAssem, final Function0 function0, InterfaceC724760Sbq interfaceC724760Sbq, C1637906bB c1637906bB, Function0 function02, Function0 function03, Function1 function1) {
        InterfaceC1731706qJ interfaceC1731706qJLIZ;
        AbstractC2216811BpX abstractC2216811BpXLIZ;
        Function0 c738090SxL = function03;
        InterfaceC724760Sbq interfaceC724760Sbq2 = interfaceC724760Sbq;
        if (C725080ScM.LJFF) {
            if (interfaceC724760Sbq2 == null) {
                interfaceC724760Sbq2 = C0HHT.LIZ;
            }
            return C737920Sx4.LIZ(reusedAssem, function0, interfaceC724760Sbq2, c1637906bB, function02, c738090SxL, function1);
        }
        if (interfaceC724760Sbq2 == null) {
            interfaceC724760Sbq2 = C0HHT.LIZ;
        }
        C452080Ho6 c452080Ho6 = new C452080Ho6();
        if (c738090SxL == null) {
            c738090SxL = new C738090SxL(reusedAssem);
        }
        C451660HnQ c451660HnQ = new C451660HnQ(reusedAssem);
        C723690Sa7 c723690Sa7 = new C723690Sa7(reusedAssem);
        C738100SxM c738100SxM = new C738100SxM(reusedAssem);
        if (interfaceC724760Sbq2 instanceof InterfaceC451590HnJ) {
            interfaceC1731706qJLIZ = C451650HnP.LIZ(reusedAssem, (InterfaceC451590HnJ) interfaceC724760Sbq2, function0, function02, c738090SxL, function1, c451660HnQ, c723690Sa7, c738100SxM);
        } else {
            C737960Sx8 c737960Sx8 = new C737960Sx8(interfaceC724760Sbq2, reusedAssem, function0, function02, c452080Ho6, c738090SxL, function1, c451660HnQ, c723690Sa7, c738100SxM);
            C0RP1 c0rp1 = C0RP1.LIZ;
            if (Intrinsics.LJFF(interfaceC724760Sbq2, c0rp1) || Intrinsics.LJFF(interfaceC724760Sbq2, C0HHT.LIZ)) {
                reusedAssem.getClass();
                if (Intrinsics.LJFF(c737960Sx8.LIZIZ(), c0rp1)) {
                    reusedAssem.LLJILJIL = true;
                }
                reusedAssem.LLJIJIL.add(c737960Sx8);
            }
            final C737900Sx2 c737900Sx2 = new C737900Sx2(function0, interfaceC724760Sbq2, reusedAssem, c738090SxL, function02, c737960Sx8, c451660HnQ, c723690Sa7, c738100SxM, c452080Ho6, function1, c1637906bB);
            interfaceC1731706qJLIZ = c737900Sx2;
            if (c1637906bB.LIZ) {
                reusedAssem.addonParentAttachTasks$assem_release(new Runnable() { // from class: X.0Sx5
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ListVMExtKt@6d8.provideViewModelDelegate$2$1");
                        try {
                            c737900Sx2.LIZ(function0.invoke());
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ListVMExtKt@6d8.provideViewModelDelegate$2$1");
                    }
                });
                interfaceC1731706qJLIZ = c737900Sx2;
            }
        }
        InterfaceC738110SxN interfaceC738110SxN = C725080ScM.LJJIJ;
        if (interfaceC738110SxN == null || (abstractC2216811BpXLIZ = interfaceC738110SxN.LIZ(interfaceC1731706qJLIZ)) == null) {
            return interfaceC1731706qJLIZ;
        }
        return abstractC2216811BpXLIZ;
    }
}

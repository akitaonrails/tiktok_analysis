package Y;

import X.AbstractC1304010k2R;
import X.C1303970k2N;
import X.C1304060k2W;
import X.C1524970pmp;
import X.C786410Ut5;
import X.InterfaceC1288310jd7;
import X.InterfaceC1304030k2T;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.Krypton;
import com.lynx.canvas.KryptonApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class AObjectS394S0100000_20 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS394S0100000_20 aObjectS394S0100000_20) {
        final C1524970pmp c1524970pmp = ((C1303970k2N) aObjectS394S0100000_20.l0).LIZ;
        return new AbstractC1304010k2R(c1524970pmp) { // from class: X.0k2Q
            public final C1524970pmp LIZ;

            {
                this.LIZ = c1524970pmp;
            }

            @Override // X.AbstractC1304010k2R
            public final void LIZ(long j, String str, String str2, String str3) {
                IClientAdapterService iClientAdapterServiceLIZIZ = this.LIZ.LIZ.LIZIZ();
                if (iClientAdapterServiceLIZIZ != null) {
                    iClientAdapterServiceLIZIZ.sendRemoteObject(str, j, str2, str3);
                }
            }
        };
    }

    public static final Object invoke$1(AObjectS394S0100000_20 aObjectS394S0100000_20) {
        KryptonApp kryptonApp = ((C1303970k2N) aObjectS394S0100000_20.l0).LIZIZ;
        if (kryptonApp != null) {
            kryptonApp.LJIIIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS394S0100000_20 aObjectS394S0100000_20) {
        KryptonApp kryptonApp = ((C1303970k2N) aObjectS394S0100000_20.l0).LIZIZ;
        if (kryptonApp != null) {
            kryptonApp.LJIIL();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0k2O] */
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
    public static final Object invoke$3(AObjectS394S0100000_20 aObjectS394S0100000_20) {
        KryptonApp kryptonApp;
        final C1303970k2N c1303970k2N = (C1303970k2N) aObjectS394S0100000_20.l0;
        try {
            c1303970k2N.LJFF = C786410Ut5.u3();
            Krypton.LIZIZ().LIZJ.put("miniApp", new C1304060k2W(c1303970k2N));
            c1303970k2N.LIZ();
            InterfaceC1304030k2T interfaceC1304030k2T = c1303970k2N.LIZ.LIZ.LIZJ;
            if (interfaceC1304030k2T != null && (kryptonApp = c1303970k2N.LIZIZ) != null) {
                interfaceC1304030k2T.LJIILIIL(kryptonApp);
            }
            ?? r1 = new InterfaceC1288310jd7() { // from class: X.0k2O
                @Override // X.InterfaceC1288310jd7
                public final void LIZ() {
                    KryptonApp kryptonApp2;
                    C1303970k2N c1303970k2N2 = c1303970k2N;
                    InterfaceC1304030k2T interfaceC1304030k2T2 = c1303970k2N2.LIZ.LIZ.LIZJ;
                    if (interfaceC1304030k2T2 == null || (kryptonApp2 = c1303970k2N2.LIZIZ) == null) {
                        return;
                    }
                    interfaceC1304030k2T2.LJIILIIL(kryptonApp2);
                }
            };
            c1303970k2N.LJ = r1;
            c1303970k2N.LIZ.LIZ.LIZJ.LIZ(r1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
        }
        return Unit.LIZ;
    }

    public AObjectS394S0100000_20(C1303970k2N c1303970k2N, int i) {
        this.$t = i;
        this.l0 = c1303970k2N;
    }
}

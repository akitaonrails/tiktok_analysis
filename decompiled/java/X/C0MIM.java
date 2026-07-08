package X;

import Y.ARunnableS108S0100000_8;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS137S0400000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MIM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aiselfeffect.ScanFaceEffectComponent$loadScanFaceEffectPackage$5$1", f = "ScanFaceEffectComponent.kt", l = {}, m = "invokeSuspend")
public final class C0MIM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0MIK LL;
    public final /* synthetic */ NavigationScene LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Effect LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MIM(C0MIK c0mik, NavigationScene navigationScene, boolean z, Effect effect, InterfaceC1364105Vn<? super C0MIM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0mik;
        this.LLILLJJLI = navigationScene;
        this.LLILLL = z;
        this.LLILZ = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MIM(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0MIT, X.0vJv] */
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
        String name;
        InterfaceC1623190sLF interfaceC1623190sLFU;
        C1C7U.LIZ("ScanFaceEffectComponent@ddfc.loadScanFaceEffectPackage$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final C0MIK c0mik = this.LL;
        final NavigationScene navigationScene = this.LLILLJJLI;
        final InterfaceC566130MIh interfaceC566130MIh = c0mik.LJII;
        if (!this.LLILLL) {
            name = this.LLILZ.getName();
        } else {
            name = null;
        }
        if (!C523910Kgf.LIZIZ(navigationScene, C0MIN.class)) {
            InterfaceC1623190sLF interfaceC1623190sLFU2 = c0mik.LJI.U();
            if (interfaceC1623190sLFU2 != null && interfaceC1623190sLFU2.isShowing() && (interfaceC1623190sLFU = c0mik.LJI.U()) != null) {
                interfaceC1623190sLFU.V0();
            }
            C19A3 c19a3 = c0mik.LJJ;
            if (c19a3 != null) {
                C12WG.LIZLLL(c19a3, new ARunnableS108S0100000_8(c0mik, 25), 200L);
            }
            ?? r12 = new InterfaceC1737690vJv() { // from class: X.0MIT
                @Override // X.InterfaceC1737690vJv
                public final boolean onBackPressed() {
                    c0mik.LIZJ(interfaceC566130MIh, navigationScene, this);
                    return true;
                }
            };
            C0MIN c0min = new C0MIN();
            AwS137S0400000_8 awS137S0400000_8 = new AwS137S0400000_8(c0mik, interfaceC566130MIh, navigationScene, (C0MIT) r12, 5);
            C0MI7 c0mi7 = new C0MI7(c0mik);
            AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(c0mik, 194);
            c0min.LLJJI = awS137S0400000_8;
            c0min.LLJJIII = c0mi7;
            c0min.LLJJIJI = awS552S0100000_8;
            c0min.LLJJIJIIJIL = name;
            c0min.LLJJIJIL = null;
            c0min.LLJJJ = true;
            c0mik.LJIJI = c0min;
            C569760MWg c569760MWg = new C569760MWg();
            c569760MWg.LIZ = true;
            navigationScene.LLLLLLLLLL(c0min, c569760MWg.LIZ());
            navigationScene.LLLIILIL(c0mik.LJFF, r12);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScanFaceEffectComponent@ddfc.loadScanFaceEffectPackage$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

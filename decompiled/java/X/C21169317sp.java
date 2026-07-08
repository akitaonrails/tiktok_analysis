package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17sp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.core.download.ability.MuteAudioAbility$handleRequest$1", f = "MuteAudioAbility.kt", l = {}, m = "invokeSuspend")
public final class C21169317sp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21169217so<CONTEXT> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21169317sp(C21169217so<CONTEXT> c21169217so, InterfaceC1364105Vn<? super C21169317sp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21169217so;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21169317sp(this.LL, interfaceC1364105Vn);
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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer numLJIIL;
        C1C7U.LIZ("MuteAudioAbility@8c97.handleRequest$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String name = new C0VSJ(this.LL.LIZLLL).getName();
        if (name == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL.LIZ.LJ);
            sbLIZ.append(this.LL.LIZ.LIZIZ);
            name = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LL.LJIIIIZZ);
        sbLIZ2.append(name);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        if (!TextUtils.equals(this.LL.LIZLLL, strLIZIZ)) {
            C2222908nL.LIZ(this.LL.LIZLLL, strLIZIZ);
            C2222908nL.LIZJ(this.LL.LIZLLL);
            this.LL.LIZLLL = strLIZIZ;
        }
        C21169217so<CONTEXT> c21169217so = this.LL;
        C15O7<Integer> c15o7LIZJ = c21169217so.LJII.LIZJ(c21169217so.LIZLLL, c21169217so.LJIIIZ);
        if (c15o7LIZJ == null) {
            C21169217so<CONTEXT> c21169217so2 = this.LL;
            c21169217so2.LIZLLL(-1, c21169217so2.LJIIIZ, "Fail to get mute audio ", "");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MuteAudioAbility@8c97.handleRequest$1");
            return unit;
        }
        try {
            c15o7LIZJ.LJIJJLI();
            numLJIIL = c15o7LIZJ.LJIIL();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C21169217so<CONTEXT> c21169217so3 = this.LL;
            c21169217so3.LIZLLL(-1, c21169217so3.LJIIIZ, e.toString(), "");
        }
        if (numLJIIL != null && numLJIIL.intValue() == 0) {
            String str = this.LL.LJIIIZ;
            if (str != null && !TextUtils.isEmpty(str) && new C0VSJ(str).exists()) {
                C21169217so<CONTEXT> c21169217so4 = this.LL;
                c21169217so4.LJ(c21169217so4.LJIIIZ, "");
            } else {
                C21169217so<CONTEXT> c21169217so5 = this.LL;
                c21169217so5.LIZLLL(-1, c21169217so5.LJIIIZ, "mute audio out path file is not exists", "");
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MuteAudioAbility@8c97.handleRequest$1");
            return unit2;
        }
        C21170817t4 c21170817t4 = this.LL.LJFF;
        c15o7LIZJ.LJIIL().intValue();
        c21170817t4.getClass();
        C21169217so<CONTEXT> c21169217so6 = this.LL;
        String str2 = c21169217so6.LJIIIZ;
        int iIntValue = c15o7LIZJ.LJIIL().intValue();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("muteAudioTask result: [");
        sbLIZ3.append(c15o7LIZJ.LJIIL());
        sbLIZ3.append(']');
        c21169217so6.LIZLLL(iIntValue, str2, C2188811AlT.LIZIZ(sbLIZ3), "");
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MuteAudioAbility@8c97.handleRequest$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

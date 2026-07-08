package X;

import Y.AObserverS212S0100000_8;
import androidx.lifecycle.LiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.switchmode.ImageVideoSeparateModeSwitchComponent$waitFistFrame$1", f = "ImageVideoSeparateModeSwitchApi.kt", l = {607}, m = "invokeSuspend")
public final class C578260Mm8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C578250Mm7 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578260Mm8(Function0<Unit> function0, C578250Mm7 c578250Mm7, InterfaceC1364105Vn<? super C578260Mm8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function0;
        this.LLILZ = c578250Mm7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C578260Mm8 c578260Mm8 = new C578260Mm8(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c578260Mm8.LLILLJJLI = obj;
        return c578260Mm8;
    }

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
        LiveData<Void> liveDataWw2;
        InterfaceC1451050nrb interfaceC1451050nrb;
        C1C7U.LIZ("ImageVideoSeparateModeSwitchComponent@6927.waitFistFrame$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            C578250Mm7 c578250Mm7 = this.LLILZ;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            InterfaceC1455860nzM interfaceC1455860nzMH2 = c578250Mm7.H2();
            if ((interfaceC1455860nzMH2 instanceof InterfaceC1451050nrb) && (interfaceC1451050nrb = (InterfaceC1451050nrb) interfaceC1455860nzMH2) != null) {
                c578250Mm7.v3(interfaceC1451050nrb.gJ(), c578250Mm7, new AObserverS212S0100000_8(c2252611DEt, 30));
            } else {
                InterfaceC1455860nzM interfaceC1455860nzMH22 = c578250Mm7.H2();
                if (interfaceC1455860nzMH22 != null && (liveDataWw2 = interfaceC1455860nzMH22.ww2()) != null) {
                    c578250Mm7.v3(liveDataWw2, c578250Mm7, new AObserverS212S0100000_8(c2252611DEt, 31));
                }
            }
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("ImageVideoSeparateModeSwitchComponent@6927.waitFistFrame$1");
                return objLJFF;
            }
        }
        this.LLILLL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageVideoSeparateModeSwitchComponent@6927.waitFistFrame$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

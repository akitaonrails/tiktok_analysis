package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.EffectManagerKtWrapper$fetchSingleParentEffect$3", f = "EffectManagerKtWrapper.kt", l = {354, 356}, m = "invokeSuspend")
public final class C760490TsN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C0UDQ LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function1<LiveEffect, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C760490TsN(C0UDQ c0udq, String str, String str2, Function1<? super LiveEffect, Unit> function1, InterfaceC1364105Vn<? super C760490TsN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0udq;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760490TsN(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
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
        C259800zU c259800zU;
        C259800zU c259800zU2;
        T t;
        String strLLILII;
        C259800zU c259800zU3;
        T t2;
        C1C7U.LIZ("EffectManagerKtWrapper@5a54.fetchSingleParentEffect$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c259800zU3 = this.LLILLJJLI;
                    c259800zU = this.LL;
                    C155000ia.LIZIZ(obj);
                    t2 = obj;
                    c259800zU3.element = t2;
                    this.LLIZ.invoke(c259800zU.element);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EffectManagerKtWrapper@5a54.fetchSingleParentEffect$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c259800zU2 = this.LLILLJJLI;
            c259800zU = this.LL;
            C155000ia.LIZIZ(obj);
            t = obj;
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = new C259800zU();
            C0UDQ c0udq = this.LLILZ;
            String str = this.LLILZIL;
            String str2 = this.LLILZLL;
            this.LL = c259800zU;
            this.LLILLJJLI = c259800zU;
            this.LLILLL = 1;
            Object objLJIILL = c0udq.LJIILL(str, str2, this);
            if (objLJIILL == objLJFF) {
                C1C7U.LIZIZ("EffectManagerKtWrapper@5a54.fetchSingleParentEffect$3");
                return objLJFF;
            }
            c259800zU2 = c259800zU;
            t = objLJIILL;
        }
        c259800zU2.element = t;
        LiveEffect liveEffect = (LiveEffect) c259800zU.element;
        if (liveEffect != null && (strLLILII = liveEffect.LLILII()) != null) {
            C0UDQ c0udq2 = this.LLILZ;
            String str3 = this.LLILZIL;
            this.LL = c259800zU;
            this.LLILLJJLI = c259800zU;
            this.LLILLL = 2;
            Object objLJIILL2 = c0udq2.LJIILL(str3, strLLILII, this);
            if (objLJIILL2 == objLJFF) {
                C1C7U.LIZIZ("EffectManagerKtWrapper@5a54.fetchSingleParentEffect$3");
                return objLJFF;
            }
            c259800zU3 = c259800zU;
            t2 = objLJIILL2;
            c259800zU3.element = t2;
        }
        this.LLIZ.invoke(c259800zU.element);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EffectManagerKtWrapper@5a54.fetchSingleParentEffect$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

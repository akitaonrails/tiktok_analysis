package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01nd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.assem.LazyAssemExtKt$lazyAssemble$1", f = "LazyAssemExt.kt", l = {30}, m = "invokeSuspend")
public final class C441101nd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<Boolean> LLILLL;
    public final /* synthetic */ AbstractC738140SxQ LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function1<Assembler, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C441101nd(InterfaceC346201Wa<Boolean> interfaceC346201Wa, AbstractC738140SxQ abstractC738140SxQ, String str, Function1<? super Assembler, Unit> function1, InterfaceC1364105Vn<? super C441101nd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = abstractC738140SxQ;
        this.LLILZIL = str;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C441101nd c441101nd = new C441101nd(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c441101nd.LLILLJJLI = obj;
        return c441101nd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Fragment fragmentLJI;
        C1C7U.LIZ("LazyAssemExtKt@1675.lazyAssemble$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            InterfaceC346201Wa<Boolean> interfaceC346201Wa = this.LLILLL;
            C440701nZ c440701nZ = new C440701nZ(null);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (C09IC.LJIJ(interfaceC346201Wa, this, c440701nZ) == objLJFF) {
                C1C7U.LIZIZ("LazyAssemExtKt@1675.lazyAssemble$1");
                return objLJFF;
            }
        }
        if (C2296808zG.LJI(interfaceC497601wk) && (fragmentLJI = C724240Sb0.LJI(this.LLILZ)) != null && C494501wF.LIZ(fragmentLJI)) {
            if (this.LLILZ.getSupervisor().LLJJIII == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LazyAssemExtKt@1675.lazyAssemble$1");
                return unit;
            }
            C723850SaN.LIZJ(this.LLILZ, new C5183020f((Function1) this.LLILZLL, (Function1<? super Long, Object>) 185));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("LazyAssemExtKt@1675.lazyAssemble$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("LazyAssemExtKt@1675.lazyAssemble$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

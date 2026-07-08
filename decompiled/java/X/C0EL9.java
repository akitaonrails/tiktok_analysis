package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EL9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.EditorProLoaderComponent$preload$1", f = "EditorProLoaderComponent.kt", l = {299}, m = "invokeSuspend")
public final class C0EL9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0ELA LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EL9(C0ELA c0ela, Function0<Unit> function0, InterfaceC1364105Vn<? super C0EL9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0ela;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0EL9 c0el9 = new C0EL9(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0el9.LLILLJJLI = obj;
        return c0el9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProLoaderComponent@12f.preload$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C201955140j.LIZJ(C563650M8t.LIZIZ, "EditorProLoaderComponent preload: run");
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(C1664590tQ1.LJIIIZ(this.LLILLL));
            if (c19egLIZIZ == null) {
                Function0<Unit> function0 = this.LLILZ;
                if (function0 != null) {
                    function0.invoke();
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EditorProLoaderComponent@12f.preload$1");
                return unit;
            }
            C1DRF c1drf = new C1DRF();
            c1drf.LJ(C19EG.class, null, c19egLIZIZ);
            final C0EI6 c0ei6 = new C0EI6(c1drf.LIZIZ());
            AnonymousClass0957<Unit> anonymousClass0957LIZLLL = new AbstractC371450EhL<Unit>(c0ei6) { // from class: X.0EHN
                public final C19EG LIZLLL;

                {
                    this.LIZLLL = (C19EG) c0ei6.LIZ(C19EG.class);
                }

                @Override // X.AbstractC371450EhL
                public final Object LIZJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    C0EHK.LJII(this.LIZLLL);
                    C0EHK.LJIIJJI(this.LIZLLL);
                    return Unit.LIZ;
                }
            }.LIZLLL(interfaceC497601wk);
            this.LL = 1;
            if (((C099G) anonymousClass0957LIZLLL).LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("EditorProLoaderComponent@12f.preload$1");
                return objLJFF;
            }
        }
        Function0<Unit> function02 = this.LLILZ;
        if (function02 != null) {
            function02.invoke();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditorProLoaderComponent@12f.preload$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

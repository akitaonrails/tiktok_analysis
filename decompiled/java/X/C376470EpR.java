package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.topbar.save.EPSaveFlow$handleSave$2", f = "EPSaveFlow.kt", l = {358, 363, 367, 369}, m = "invokeSuspend")
public final class C376470EpR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C376460EpQ LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C0ELJ LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Function2<Boolean, Boolean, Unit> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C376470EpR(C376460EpQ c376460EpQ, Function0<Unit> function0, boolean z, C0ELJ c0elj, boolean z2, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z3, boolean z4, InterfaceC1364105Vn<? super C376470EpR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c376460EpQ;
        this.LLILLL = function0;
        this.LLILZ = z;
        this.LLILZIL = c0elj;
        this.LLILZLL = z2;
        this.LLIZ = function2;
        this.LLIZLLLIL = z3;
        this.LLJ = z4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C376470EpR(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLEModel nLEModelLJI;
        C1C7U.LIZ("EPSaveFlow@a786.handleSave$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EPSaveFlow@a786.handleSave$2");
                    return unit;
                }
                C155000ia.LIZIZ(obj);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("EPSaveFlow@a786.handleSave$2");
                return unit2;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C376460EpQ c376460EpQ = this.LLILLJJLI;
            this.LL = 1;
            if (c376460EpQ.LJIILL(this) == objLJFF) {
                C1C7U.LIZIZ("EPSaveFlow@a786.handleSave$2");
                return objLJFF;
            }
        }
        C0E48 c0e48LJFF = this.LLILLJJLI.LJFF();
        if (c0e48LJFF != null) {
            nLEModelLJI = C350870DpF.LJI(c0e48LJFF);
        } else {
            nLEModelLJI = null;
        }
        if (C357540E0a.LIZ(nLEModelLJI)) {
            CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
            C354090DuR.LJIIL(this.LLILLJJLI.LJFF());
        }
        InterfaceC376450EpP interfaceC376450EpPLIZLLL = this.LLILLJJLI.LIZLLL();
        if (interfaceC376450EpPLIZLLL != null && interfaceC376450EpPLIZLLL.bZ()) {
            C376460EpQ c376460EpQ2 = this.LLILLJJLI;
            Function0<Unit> function0 = this.LLILLL;
            this.LL = 2;
            if (c376460EpQ2.LJIILJJIL(function0, true, this) == objLJFF) {
                C1C7U.LIZIZ("EPSaveFlow@a786.handleSave$2");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("EPSaveFlow@a786.handleSave$2");
            return unit22;
        }
        if (this.LLILZ && C372630EjF.LIZ(this.LLILZIL, this.LLILLJJLI.LJ())) {
            C376460EpQ c376460EpQ3 = this.LLILLJJLI;
            Function0<Unit> function02 = this.LLILLL;
            boolean z = this.LLILZLL;
            this.LL = 3;
            if (c376460EpQ3.LJIILJJIL(function02, z, this) == objLJFF) {
                C1C7U.LIZIZ("EPSaveFlow@a786.handleSave$2");
                return objLJFF;
            }
        } else {
            C376460EpQ c376460EpQ4 = this.LLILLJJLI;
            Function2<Boolean, Boolean, Unit> function2 = this.LLIZ;
            boolean z2 = this.LLIZLLLIL;
            boolean z3 = this.LLJ;
            this.LL = 4;
            if (c376460EpQ4.LJIIJ(this, function2, z2, z3) == objLJFF) {
                C1C7U.LIZIZ("EPSaveFlow@a786.handleSave$2");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EPSaveFlow@a786.handleSave$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

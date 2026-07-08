package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.topbar.save.EPSaveFlow$handleSaveAndExit$2", f = "EPSaveFlow.kt", l = {387, 391}, m = "invokeSuspend")
public final class C376480EpS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C376460EpQ LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function2<Boolean, Boolean, Unit> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C376480EpS(C376460EpQ c376460EpQ, String str, String str2, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z, InterfaceC1364105Vn<? super C376480EpS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c376460EpQ;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = function2;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C376480EpS(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLEModel nLEModelLJI;
        C1C7U.LIZ("EPSaveFlow@a786.handleSaveAndExit$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EPSaveFlow@a786.handleSaveAndExit$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C376460EpQ c376460EpQ = this.LLILLJJLI;
            this.LL = 1;
            if (c376460EpQ.LJIILL(this) == objLJFF) {
                C1C7U.LIZIZ("EPSaveFlow@a786.handleSaveAndExit$2");
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
        C376460EpQ c376460EpQ2 = this.LLILLJJLI;
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        Function2<Boolean, Boolean, Unit> function2 = this.LLILZIL;
        this.LL = 2;
        if (c376460EpQ2.LJIILIIL(str, str2, this, function2) == objLJFF) {
            C1C7U.LIZIZ("EPSaveFlow@a786.handleSaveAndExit$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EPSaveFlow@a786.handleSaveAndExit$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.creationflow.moreoption.EPMoreOptionComponent$handleSaveAndExit$2", f = "EPMoreOptionComponent.kt", l = {552}, m = "invokeSuspend")
public final class C356540DyO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C376630Eph LLILLJJLI;
    public final /* synthetic */ Function2<Boolean, Boolean, Unit> LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C356540DyO(C376630Eph c376630Eph, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z, InterfaceC1364105Vn<? super C356540DyO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c376630Eph;
        this.LLILLL = function2;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C356540DyO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLEModel nLEModelLJI;
        C1C7U.LIZ("EPMoreOptionComponent@f0bf.handleSaveAndExit$2");
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
            C376630Eph c376630Eph = this.LLILLJJLI;
            this.LL = 1;
            if (c376630Eph.P4(this) == objLJFF) {
                C1C7U.LIZIZ("EPMoreOptionComponent@f0bf.handleSaveAndExit$2");
                return objLJFF;
            }
        }
        C0E48 c0e48W1 = this.LLILLJJLI.W1();
        if (c0e48W1 != null) {
            nLEModelLJI = C350870DpF.LJI(c0e48W1);
        } else {
            nLEModelLJI = null;
        }
        if (C357540E0a.LIZ(nLEModelLJI)) {
            CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
            C354090DuR.LJIIL(this.LLILLJJLI.W1());
        }
        this.LLILLJJLI.K4(this.LLILLL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPMoreOptionComponent@f0bf.handleSaveAndExit$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

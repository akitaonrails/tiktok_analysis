package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM$tryShootWithAddYours$1", f = "AddYoursEntranceButtonVM.kt", l = {51, 55}, m = "invokeSuspend")
public final class C0NNG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NNI LLILLJJLI;
    public final /* synthetic */ AddYoursEntranceButtonVM LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<AddYoursStickerStruct, Boolean, Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NNG(C0NNI c0nni, AddYoursEntranceButtonVM addYoursEntranceButtonVM, InterfaceC1631620sYq<? super AddYoursStickerStruct, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq, InterfaceC1364105Vn<? super C0NNG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nni;
        this.LLILLL = addYoursEntranceButtonVM;
        this.LLILZ = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NNG(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0NND c0nnd;
        C1C7U.LIZ("AddYoursEntranceButtonVM@3590.tryShootWithAddYours$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0NNI c0nni = this.LLILLJJLI;
            if (c0nni instanceof C0NNH) {
                AddYoursEntranceButtonVM addYoursEntranceButtonVM = this.LLILLL;
                AddYoursRecommendation addYoursRecommendation = ((C0NNH) c0nni).LLILZLL;
                this.LL = 1;
                obj = addYoursEntranceButtonVM.vQ2(addYoursRecommendation, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AddYoursEntranceButtonVM@3590.tryShootWithAddYours$1");
                    return objLJFF;
                }
            } else {
                obj = null;
                if (c0nni instanceof C0NNF) {
                    AddYoursEntranceButtonVM addYoursEntranceButtonVM2 = this.LLILLL;
                    C0NNE c0nne = ((C0NNF) c0nni).LLILZLL;
                    this.LL = 2;
                    addYoursEntranceButtonVM2.getClass();
                    if (c0nne instanceof C0NNC) {
                        obj = ((C0NNC) c0nne).LJ;
                    } else if ((c0nne instanceof C0NND) && (obj = (c0nnd = (C0NND) c0nne).LJFF) == null) {
                        obj = C19651011uW.LIZIZ.LJIIL(c0nnd.LIZ, this);
                    }
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("AddYoursEntranceButtonVM@3590.tryShootWithAddYours$1");
                        return objLJFF;
                    }
                }
            }
        }
        this.LLILZ.invoke((AddYoursStickerStruct) obj, Boolean.valueOf(this.LLILLJJLI.LLILZ), Boolean.valueOf(this.LLILLJJLI.LLILZIL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursEntranceButtonVM@3590.tryShootWithAddYours$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM$getAddYoursStickerFromCollection$1", f = "AddYoursCollectionListVM.kt", l = {80}, m = "invokeSuspend")
public final class C591730NIt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NNE LLILLJJLI;
    public final /* synthetic */ C615070OAn LLILLL;
    public final /* synthetic */ Function2<AddYoursStickerStruct, Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C591730NIt(C0NNE c0nne, C615070OAn c615070OAn, Function2<? super AddYoursStickerStruct, ? super Boolean, Unit> function2, InterfaceC1364105Vn<? super C591730NIt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nne;
        this.LLILLL = c615070OAn;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591730NIt(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursCollectionListVM@bf39.getAddYoursStickerFromCollection$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0NNE c0nne = this.LLILLJJLI;
            if (c0nne instanceof C0NNC) {
                obj = ((C0NNC) c0nne).LJ;
            } else {
                C19651011uW c19651011uW = C19651011uW.LIZIZ;
                long j = this.LLILLL.LL;
                this.LL = 1;
                obj = c19651011uW.LJIIL(j, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AddYoursCollectionListVM@bf39.getAddYoursStickerFromCollection$1");
                    return objLJFF;
                }
            }
        }
        Function2<AddYoursStickerStruct, Boolean, Unit> function2 = this.LLILZ;
        C0NNE c0nne2 = this.LLILLJJLI;
        if (c0nne2 == null || c0nne2.LIZIZ != 1) {
            z = false;
        }
        function2.invoke((AddYoursStickerStruct) obj, Boolean.valueOf(z));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursCollectionListVM@bf39.getAddYoursStickerFromCollection$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

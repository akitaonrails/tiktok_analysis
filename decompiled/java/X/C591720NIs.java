package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubListViewModel$getAddYoursStickerFromTopic$1", f = "AddYoursHubListViewModel.kt", l = {174}, m = "invokeSuspend")
public final class C591720NIs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NNE LLILLJJLI;
    public final /* synthetic */ AddYoursTopic LLILLL;
    public final /* synthetic */ Function2<AddYoursStickerStruct, Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C591720NIs(C0NNE c0nne, AddYoursTopic addYoursTopic, Function2<? super AddYoursStickerStruct, ? super Boolean, Unit> function2, InterfaceC1364105Vn<? super C591720NIs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nne;
        this.LLILLL = addYoursTopic;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591720NIs(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AddYoursHubListViewModel@c717.getAddYoursStickerFromTopic$1");
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
                Long topicId = this.LLILLL.getTopicId();
                obj = null;
                if (topicId != null) {
                    long jLongValue = topicId.longValue();
                    C1DFB c1dfb = C0PEM.LIZJ;
                    C591710NIr c591710NIr = new C591710NIr(jLongValue, null);
                    this.LL = 1;
                    obj = C23250099c.LJI(this, c1dfb, c591710NIr);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("AddYoursHubListViewModel@c717.getAddYoursStickerFromTopic$1");
                        return objLJFF;
                    }
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
        C1C7U.LIZIZ("AddYoursHubListViewModel@c717.getAddYoursStickerFromTopic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

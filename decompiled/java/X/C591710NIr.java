package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubListViewModel$getAddYoursStickerFromTopic$1$addYoursSticker$1$1", f = "AddYoursHubListViewModel.kt", l = {175}, m = "invokeSuspend")
public final class C591710NIr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AddYoursStickerStruct>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591710NIr(long j, InterfaceC1364105Vn<? super C591710NIr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591710NIr(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursHubListViewModel@c717.getAddYoursStickerFromTopic$1$addYoursSticker$1$1");
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
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            long j = this.LLILLJJLI;
            this.LL = 1;
            obj = c19651011uW.LJIIL(j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AddYoursHubListViewModel@c717.getAddYoursStickerFromTopic$1$addYoursSticker$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AddYoursHubListViewModel@c717.getAddYoursStickerFromTopic$1$addYoursSticker$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AddYoursStickerStruct> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

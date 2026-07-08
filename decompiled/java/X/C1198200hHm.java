package X;

import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsVideoListResponse;
import com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoViewModel$initFetchData$2", f = "AddLocationVideoViewModel.kt", l = {105}, m = "invokeSuspend")
public final class C1198200hHm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AddLocationVideoViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1198200hHm(AddLocationVideoViewModel addLocationVideoViewModel, InterfaceC1364105Vn<? super C1198200hHm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = addLocationVideoViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1198200hHm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddLocationVideoViewModel@c89f.initFetchData$2");
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
            AddLocationVideoViewModel addLocationVideoViewModel = this.LLILLJJLI;
            C1198220hHo c1198220hHo = new C1198220hHo(null);
            this.LL = 1;
            obj = addLocationVideoViewModel.wQ2(c1198220hHo, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AddLocationVideoViewModel@c89f.initFetchData$2");
                return objLJFF;
            }
        }
        C443120HZe c443120HZe = (C443120HZe) obj;
        AbstractC316870CbV<C1198220hHo> abstractC316870CbV = (AbstractC316870CbV) c443120HZe.getFirst();
        EnumC1198390hI5 enumC1198390hI5 = (EnumC1198390hI5) c443120HZe.getSecond();
        MyMomentsVideoListResponse myMomentsVideoListResponse = (MyMomentsVideoListResponse) c443120HZe.getThird();
        AddLocationVideoViewModel addLocationVideoViewModel2 = this.LLILLJJLI;
        addLocationVideoViewModel2.LLILLJJLI = abstractC316870CbV;
        if (enumC1198390hI5 != null) {
            addLocationVideoViewModel2.setState(new AwS384S0200000_18(enumC1198390hI5, myMomentsVideoListResponse, 196));
        } else {
            addLocationVideoViewModel2.setState(new AwS597S0100000_18(myMomentsVideoListResponse, 739));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddLocationVideoViewModel@c89f.initFetchData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creatoredit.NewCreatorCaptionEditItem;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel$fetchOriginalVideoInfo$1", f = "NewCreatorCaptionEditViewModel.kt", l = {84}, m = "invokeSuspend")
public final class C480101tv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NewCreatorCaptionEditViewModel LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C480101tv(NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel, Long l, String str, InterfaceC1364105Vn<? super C480101tv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = newCreatorCaptionEditViewModel;
        this.LLILLL = l;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C480101tv(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NewCreatorCaptionEditViewModel@b8c6.fetchOriginalVideoInfo$1");
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
            C480001tu c480001tu = new C480001tu(this.LLILLL, this.LLILZ, null);
            NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LLILLJJLI;
            MutableLiveData<AbstractC1779240wOw<NewCreatorCaptionEditItem>> mutableLiveData = newCreatorCaptionEditViewModel.LLJ;
            C5183020f c5183020f = new C5183020f(newCreatorCaptionEditViewModel, 328);
            this.LL = 1;
            Object objLIZ = C1840530xzn.LIZ(c480001tu, new C5183020f((MutableLiveData) mutableLiveData, (MutableLiveData<AbstractC1779240wOw<Object>>) 327), c5183020f, this);
            if (objLIZ != C099R.LJFF()) {
                objLIZ = Unit.LIZ;
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("NewCreatorCaptionEditViewModel@b8c6.fetchOriginalVideoInfo$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewCreatorCaptionEditViewModel@b8c6.fetchOriginalVideoInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

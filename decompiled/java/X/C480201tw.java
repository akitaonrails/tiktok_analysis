package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creatoredit.NewCreatorCaptionEditItem;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel$fetchTranslatedVideoInfo$1", f = "NewCreatorCaptionEditViewModel.kt", l = {124}, m = "invokeSuspend")
public final class C480201tw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NewCreatorCaptionEditViewModel LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C480201tw(NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel, Long l, Long l2, String str, InterfaceC1364105Vn<? super C480201tw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = newCreatorCaptionEditViewModel;
        this.LLILLL = l;
        this.LLILZ = l2;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C480201tw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NewCreatorCaptionEditViewModel@b8c6.fetchTranslatedVideoInfo$1");
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
            C479901tt c479901tt = new C479901tt(this.LLILLL, this.LLILZ, this.LLILZIL, null);
            NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LLILLJJLI;
            MutableLiveData<AbstractC1779240wOw<NewCreatorCaptionEditItem>> mutableLiveData = newCreatorCaptionEditViewModel.LLJI;
            C5183020f c5183020f = new C5183020f(newCreatorCaptionEditViewModel, 329);
            this.LL = 1;
            Object objLIZ = C1840530xzn.LIZ(c479901tt, new C5183020f((MutableLiveData) mutableLiveData, (MutableLiveData<AbstractC1779240wOw<Object>>) 327), c5183020f, this);
            if (objLIZ != C099R.LJFF()) {
                objLIZ = Unit.LIZ;
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("NewCreatorCaptionEditViewModel@b8c6.fetchTranslatedVideoInfo$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewCreatorCaptionEditViewModel@b8c6.fetchTranslatedVideoInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

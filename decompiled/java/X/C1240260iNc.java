package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.viewmodel.IMSearchDetailVM;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS228S0300000_19;
import njp.a;

/* JADX INFO: renamed from: X.0iNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.viewmodel.IMSearchDetailVM$setSearchDetailData$2", f = "IMSearchDetailVM.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C1240260iNc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ IMSearchDetailVM LLILLL;
    public final /* synthetic */ List<C1240300iNg> LLILZ;
    public final /* synthetic */ IMUser LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ EnumC1240620iOC LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240260iNc(IMSearchDetailVM iMSearchDetailVM, List<C1240300iNg> list, IMUser iMUser, String str, EnumC1240620iOC enumC1240620iOC, InterfaceC1364105Vn<? super C1240260iNc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = iMSearchDetailVM;
        this.LLILZ = list;
        this.LLILZIL = iMUser;
        this.LLILZLL = str;
        this.LLIZ = enumC1240620iOC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1240260iNc c1240260iNc = new C1240260iNc(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1240260iNc.LLILLJJLI = obj;
        return c1240260iNc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("IMSearchDetailVM@abd2.setSearchDetailData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1240280iNe c1240280iNe = C1240280iNe.LIZ;
            C1231704rr c1231704rr = this.LLILLL.LL;
            IMContactApi.LIZ.getClass();
            InterfaceC1725106pF interfaceC1725106pFLIZ = C069P.LIZ().LIZ();
            List<C1240300iNg> list = this.LLILZ;
            IMUser iMUser = this.LLILZIL;
            String str = this.LLILZLL;
            EnumC1240620iOC enumC1240620iOC = this.LLIZ;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = c1240280iNe.LIZ(list, iMUser, str, c1231704rr, enumC1240620iOC, interfaceC1725106pFLIZ, false, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMSearchDetailVM@abd2.setSearchDetailData$2");
                return objLJFF;
            }
        }
        C2296808zG.LJFF(interfaceC497601wk);
        IMSearchDetailVM iMSearchDetailVM = this.LLILLL;
        iMSearchDetailVM.setStateImmediate(new AwS228S0300000_19(iMSearchDetailVM, (IMSearchDetailVM) this.LLIZ, (EnumC1240620iOC) obj, (List<C1240530iO3>) 12));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSearchDetailVM@abd2.setSearchDetailData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

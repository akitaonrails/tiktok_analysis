package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import com.ss.android.ugc.aweme.relation.model.FriendsListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import njp.a;

/* JADX INFO: renamed from: X.0j0N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel$mufPageConfig$2$1$onLoadMore$1", f = "MufListPageViewModel.kt", l = {177}, m = "invokeSuspend")
public final class C1264290j0N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MufListPageViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<String>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1264290j0N(MufListPageViewModel mufListPageViewModel, String str, InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C1264290j0N> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLJJLI = mufListPageViewModel;
        this.LLILLL = str;
        this.LLILZ = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1264290j0N(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String imprId;
        C1C7U.LIZ("MufListPageViewModel@1fa1.mufPageConfig$2$1$onLoadMore$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C2258581Dai c2258581Dai = C2258581Dai.LIZIZ;
                int i2 = this.LLILLJJLI.getState().LL;
                String curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
                String str = this.LLILLL;
                this.LL = 1;
                obj = c2258581Dai.LIZJ(i2, 30, curSecUserId, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MufListPageViewModel@1fa1.mufPageConfig$2$1$onLoadMore$1");
                    return objLJFF;
                }
            }
            FriendsListResponse friendsListResponse = (FriendsListResponse) obj;
            friendsListResponse.checkValid();
            C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load more list - logId ");
            LogPbBean logPbBean = friendsListResponse.logPb;
            if (logPbBean != null) {
                imprId = logPbBean.getImprId();
            } else {
                imprId = null;
            }
            sbLIZ.append(imprId);
            sbLIZ.append(", itemCount ");
            sbLIZ.append(friendsListResponse.getUserList().size());
            sbLIZ.append(", hasMore ");
            sbLIZ.append(friendsListResponse.hasMore);
            c1910890zpHLIZ.LJI("MUF-LIST VM", C2188811AlT.LIZIZ(sbLIZ));
            String str2 = friendsListResponse.nextPageToken;
            boolean z = friendsListResponse.hasMore;
            List<C1247690iZb> listWQ2 = this.LLILLJJLI.wQ2(friendsListResponse, false);
            C897520ZIw c897520ZIw = this.LLILLJJLI.LLILLL;
            if (c897520ZIw != null) {
                c897520ZIw.LJFF(C0O26.LIZIZ(listWQ2, AFwS257S0000000_19.get$arr$(274)));
            }
            InterfaceC897380ZIi.LIZIZ.getClass();
            InterfaceC897380ZIi interfaceC897380ZIiLIZ = C897370ZIh.LIZ();
            this.LLILLJJLI.getClass();
            interfaceC897380ZIiLIZ.LIZ(MufListPageViewModel.xQ2(listWQ2), null, null);
            if (friendsListResponse.getUserList().isEmpty()) {
                this.LLILLJJLI.setState(AFwS257S0000000_19.get$arr$(275));
                InterfaceC1364105Vn<AbstractC316870CbV<String>> interfaceC1364105Vn = this.LLILZ;
                C316640Cb8 c316640Cb8LIZIZ = C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
                C189200o6.m2constructorimpl(c316640Cb8LIZIZ);
                interfaceC1364105Vn.resumeWith(c316640Cb8LIZIZ);
            } else if (!z) {
                this.LLILLJJLI.setState(AFwS257S0000000_19.get$arr$(276));
                InterfaceC1364105Vn<AbstractC316870CbV<String>> interfaceC1364105Vn2 = this.LLILZ;
                AbstractC316870CbV.LIZ.getClass();
                C316640Cb8 c316640Cb8 = new C316640Cb8(listWQ2);
                C189200o6.m2constructorimpl(c316640Cb8);
                interfaceC1364105Vn2.resumeWith(c316640Cb8);
            } else {
                this.LLILLJJLI.setState(AFwS257S0000000_19.get$arr$(277));
                InterfaceC1364105Vn<AbstractC316870CbV<String>> interfaceC1364105Vn3 = this.LLILZ;
                C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, str2, listWQ2, 1);
                C189200o6.m2constructorimpl(c323380Cm0LJ);
                interfaceC1364105Vn3.resumeWith(c323380Cm0LJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.setState(AFwS257S0000000_19.get$arr$(278));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MufListPageViewModel@1fa1.mufPageConfig$2$1$onLoadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

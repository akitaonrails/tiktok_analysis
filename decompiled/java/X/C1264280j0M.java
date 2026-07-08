package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import com.ss.android.ugc.aweme.relation.model.FriendsListResponse;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import njp.a;

/* JADX INFO: renamed from: X.0j0M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel$mufPageConfig$2$1$onRefresh$1", f = "MufListPageViewModel.kt", l = {225}, m = "invokeSuspend")
public final class C1264280j0M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MufListPageViewModel LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<String>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1264280j0M(MufListPageViewModel mufListPageViewModel, InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C1264280j0M> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLJJLI = mufListPageViewModel;
        this.LLILLL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1264280j0M(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String imprId;
        C1C7U.LIZ("MufListPageViewModel@1fa1.mufPageConfig$2$1$onRefresh$1");
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
                InterfaceC1264300j0O interfaceC1264300j0OZQ2 = this.LLILLJJLI.zQ2();
                if (interfaceC1264300j0OZQ2 != null) {
                    interfaceC1264300j0OZQ2.Bx(new C1623706Xj());
                }
                C2258581Dai c2258581Dai = C2258581Dai.LIZIZ;
                int i2 = this.LLILLJJLI.getState().LL;
                String curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
                this.LL = 1;
                obj = c2258581Dai.LIZJ(i2, 30, curSecUserId, "", this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MufListPageViewModel@1fa1.mufPageConfig$2$1$onRefresh$1");
                    return objLJFF;
                }
            }
            FriendsListResponse friendsListResponse = (FriendsListResponse) obj;
            friendsListResponse.checkValid();
            C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.RELATION_LISTS);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refresh list - logId ");
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
            String str = friendsListResponse.nextPageToken;
            boolean z = friendsListResponse.hasMore;
            List<C1247690iZb> listWQ2 = this.LLILLJJLI.wQ2(friendsListResponse, true);
            C897520ZIw c897520ZIw = this.LLILLJJLI.LLILLL;
            if (c897520ZIw != null) {
                c897520ZIw.LJIIIIZZ(C0O26.LIZIZ(listWQ2, AFwS257S0000000_19.get$arr$(279)));
            }
            InterfaceC897380ZIi.LIZIZ.getClass();
            InterfaceC897380ZIi interfaceC897380ZIiLIZ = C897370ZIh.LIZ();
            this.LLILLJJLI.getClass();
            interfaceC897380ZIiLIZ.LIZ(MufListPageViewModel.xQ2(listWQ2), null, null);
            if (friendsListResponse.getUserList().isEmpty()) {
                this.LLILLJJLI.setState(AFwS257S0000000_19.get$arr$(280));
                InterfaceC1364105Vn<AbstractC316870CbV<String>> interfaceC1364105Vn = this.LLILLL;
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                List listSingletonList = Collections.singletonList(new C1263830izd());
                c317290CcB.getClass();
                C316640Cb8 c316640Cb8 = new C316640Cb8(listSingletonList);
                C189200o6.m2constructorimpl(c316640Cb8);
                interfaceC1364105Vn.resumeWith(c316640Cb8);
                InterfaceC1264300j0O interfaceC1264300j0OZQ22 = this.LLILLJJLI.zQ2();
                if (interfaceC1264300j0OZQ22 != null) {
                    interfaceC1264300j0OZQ22.Bx(new C1623606Xi(Unit.LIZ));
                }
            } else if (!z) {
                this.LLILLJJLI.setState(AFwS257S0000000_19.get$arr$(281));
                InterfaceC1364105Vn<AbstractC316870CbV<String>> interfaceC1364105Vn2 = this.LLILLL;
                AbstractC316870CbV.LIZ.getClass();
                C316640Cb8 c316640Cb82 = new C316640Cb8(listWQ2);
                C189200o6.m2constructorimpl(c316640Cb82);
                interfaceC1364105Vn2.resumeWith(c316640Cb82);
                InterfaceC1264300j0O interfaceC1264300j0OZQ23 = this.LLILLJJLI.zQ2();
                if (interfaceC1264300j0OZQ23 != null) {
                    interfaceC1264300j0OZQ23.Bx(new C1623606Xi(Unit.LIZ));
                }
            } else {
                this.LLILLJJLI.setState(AFwS257S0000000_19.get$arr$(282));
                InterfaceC1364105Vn<AbstractC316870CbV<String>> interfaceC1364105Vn3 = this.LLILLL;
                C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, str, listWQ2, 1);
                C189200o6.m2constructorimpl(c323380Cm0LJ);
                interfaceC1364105Vn3.resumeWith(c323380Cm0LJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C897520ZIw c897520ZIw2 = this.LLILLJJLI.LLILLL;
            if (c897520ZIw2 != null) {
                c897520ZIw2.LJIIIIZZ(C13BV.INSTANCE);
            }
            this.LLILLJJLI.setState(AFwS257S0000000_19.get$arr$(283));
            InterfaceC1264300j0O interfaceC1264300j0OZQ24 = this.LLILLJJLI.zQ2();
            if (interfaceC1264300j0OZQ24 != null) {
                interfaceC1264300j0OZQ24.Bx(new C491001vg(e));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MufListPageViewModel@1fa1.mufPageConfig$2$1$onRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

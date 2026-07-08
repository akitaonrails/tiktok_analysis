package X;

import Y.AfS172S0100000_3;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.SearchReviewAggregationHorizontalLoadMoreResponse;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationCardVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationDetailVideoVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS87S1000000_2;
import kotlin.jvm.internal.AwS95S1000000_10;

/* JADX INFO: renamed from: X.0Q9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665840Q9u extends AbstractC665870Q9x {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public volatile C09U0 LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C665840Q9u.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        Activity activityLIZLLL;
        C19EG c19eg;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        Object obj;
        List list;
        InterfaceC420801kM interfaceC420801kM;
        String strLIZJ;
        int i;
        View view2;
        int i2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        InterfaceC665880Q9y interfaceC665880Q9y = (InterfaceC665880Q9y) xBaseParamModel;
        int iIntValue = interfaceC665880Q9y.getCurListLength().intValue();
        int iIntValue2 = interfaceC665880Q9y.getCount().intValue();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            activityLIZLLL = interfaceC634840OvC2.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if (activityLIZLLL instanceof C19EG) {
            c19eg = (C19EG) activityLIZLLL;
        } else {
            c19eg = null;
        }
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(view, c19eg);
        if (lifecycleOwnerLJIJI == null) {
            C2382909Vj.LIZ(completionBlock, 0, "lifecycleOwner is null", null, 4);
            return;
        }
        String pageContextHashCode = interfaceC665880Q9y.getPageContextHashCode();
        String scene = interfaceC665880Q9y.getScene();
        int iHashCode = scene.hashCode();
        if (iHashCode != -2048778849) {
            if (iHashCode != -336900862) {
                if (iHashCode != 1845399899 || !scene.equals("loadMore")) {
                    return;
                }
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchReviewAggregationDetailVideoVM.class);
                AwS87S1000000_2 awS87S1000000_2 = new AwS87S1000000_2(pageContextHashCode, 0);
                AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(1);
                C452070Ho5 c452070Ho5 = new C452070Ho5();
                C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwnerLJIJI);
                if (lifecycleOwnerLJIJI instanceof HasDefaultViewModelProviderFactory) {
                    hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) lifecycleOwnerLJIJI;
                } else {
                    hasDefaultViewModelProviderFactory2 = null;
                }
                SearchReviewAggregationDetailVideoVM searchReviewAggregationDetailVideoVM = (SearchReviewAggregationDetailVideoVM) new C736950SvV(c19719912DlLIZ, awS87S1000000_2, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory2), aFwS241S0000000_10, null, null, null).getValue();
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLJIJI);
                C09U0 c09u0 = this.LLILLL;
                if (c09u0 == null) {
                    synchronized (this) {
                        c09u0 = this.LLILLL;
                        if (c09u0 == null) {
                            c09u0 = (C09U0) C1807670x8n.p();
                            this.LLILLL = c09u0;
                        }
                    }
                }
                C23250099c.LIZLLL(lifecycleScope, c09u0.LIZ, null, new C665850Q9v(searchReviewAggregationDetailVideoVM, interfaceC665880Q9y, iIntValue, this, completionBlock, null), 2);
                return;
            }
            if (!scene.equals("imageAggregationLoadMore")) {
                return;
            }
            InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
            if (interfaceC634840OvC3 != null) {
                view2 = interfaceC634840OvC3.getView();
            } else {
                view2 = null;
            }
            Fragment fragmentLIZ = C946803n0.LIZ(view2);
            if (fragmentLIZ == null) {
                return;
            }
            SearchVisualInspirationSharedVM searchVisualInspirationSharedVMLIZ = C0QA2.LIZ(fragmentLIZ, pageContextHashCode);
            C0QA9 c0qa9 = (C0QA9) searchVisualInspirationSharedVMLIZ.getState();
            List<Map<?, ?>> list2 = c0qa9.LLILZ;
            if (C301510Brp.LIZ() && !c0qa9.LLILLJJLI) {
                if (iIntValue != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("IndexOutOfBounds ");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append(" != 0");
                    C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
                    return;
                }
                searchVisualInspirationSharedVMLIZ.GQ2(C0QAG.LIZ(((C0QA9) searchVisualInspirationSharedVMLIZ.getState()).LLIZLLLIL, iIntValue, iIntValue2, 6));
                AnonymousClass0957<C0QA6> anonymousClass0957EQ2 = searchVisualInspirationSharedVMLIZ.EQ2();
                C1DFH c1dfh = C0PEM.LIZ;
                C948503nH.LJ(C948503nH.LIZIZ(fragmentLIZ), C2107308Nj.LIZ, new C0QA5(anonymousClass0957EQ2, this, completionBlock, searchVisualInspirationSharedVMLIZ, null));
                return;
            }
            if (list2.size() > iIntValue) {
                int i3 = iIntValue2 + iIntValue;
                int size = list2.size();
                if (i3 <= size) {
                    size = i3;
                }
                List<Map<?, ?>> listSubList = list2.subList(iIntValue, size);
                InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
                if (interfaceC634840OvC4 != null) {
                    containerID = interfaceC634840OvC4.getContainerID();
                }
                InterfaceC665890Q9z interfaceC665890Q9z = (InterfaceC665890Q9z) C1909107dp.LIZJ(InterfaceC665890Q9z.class, containerID);
                interfaceC665890Q9z.setStatusCode(0);
                interfaceC665890Q9z.setItems(listSubList);
                if (C301510Brp.LIZ()) {
                    interfaceC665890Q9z.setCursor(Integer.valueOf(size));
                }
                if (list2.size() <= i3 && !searchVisualInspirationSharedVMLIZ.LJIIJJI()) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                interfaceC665890Q9z.setHasMore(i2);
                completionBlock.onSuccess(interfaceC665890Q9z, "");
                return;
            }
            searchVisualInspirationSharedVMLIZ.GQ2(C0QAG.LIZ(((C0QA9) searchVisualInspirationSharedVMLIZ.getState()).LLIZLLLIL, 0, iIntValue2, 7));
            AnonymousClass0957<C0QA6> anonymousClass0957EQ22 = searchVisualInspirationSharedVMLIZ.EQ2();
            C1DFH c1dfh2 = C0PEM.LIZ;
            C948503nH.LJ(C948503nH.LIZIZ(fragmentLIZ), C2107308Nj.LIZ, new C0QA4(anonymousClass0957EQ22, this, completionBlock, searchVisualInspirationSharedVMLIZ, null));
            return;
        }
        if (!scene.equals("horizontalLoadMore")) {
            return;
        }
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SearchReviewAggregationCardVM.class);
        AwS95S1000000_10 awS95S1000000_10 = new AwS95S1000000_10(pageContextHashCode, 0);
        AFwS241S0000000_10 aFwS241S0000000_102 = AFwS241S0000000_10.get$arr$(2);
        C452070Ho5 c452070Ho52 = new C452070Ho5();
        C1622206Wu c1622206WuLJII2 = C724750Sbp.LJII(lifecycleOwnerLJIJI);
        if (lifecycleOwnerLJIJI instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwnerLJIJI;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        C736950SvV c736950SvV = new C736950SvV(c19719912DlLIZ2, awS95S1000000_10, c452070Ho52, c1622206WuLJII2, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS241S0000000_102, null, null, null);
        Map<String, ? extends Object> map = ((C143400gi) c736950SvV.getValue().getState()).LL;
        C639570P6t c639570P6t = C639570P6t.LIZ;
        Integer numValueOf = Integer.valueOf(interfaceC665880Q9y.getType().intValue());
        c639570P6t.getClass();
        String strLIZJ2 = C639570P6t.LIZJ(numValueOf);
        if (map != null) {
            if (strLIZJ2 == null) {
                strLIZJ2 = "";
            }
            obj = map.get(strLIZJ2);
        } else {
            obj = null;
        }
        if (!(obj instanceof List) || (list = (List) obj) == null) {
            list = C13BV.INSTANCE;
        }
        int i4 = iIntValue + iIntValue2;
        if (i4 <= list.size()) {
            int iIntValue3 = interfaceC665880Q9y.getType().intValue();
            InterfaceC634840OvC interfaceC634840OvC5 = this.IBridgeSdkContext;
            if (interfaceC634840OvC5 != null) {
                containerID = interfaceC634840OvC5.getContainerID();
            }
            InterfaceC665890Q9z interfaceC665890Q9z2 = (InterfaceC665890Q9z) C1909107dp.LIZJ(InterfaceC665890Q9z.class, containerID);
            interfaceC665890Q9z2.setStatusCode(0);
            if (iIntValue == 0 && iIntValue2 == list.size()) {
                interfaceC665890Q9z2.setReviewAggregation(map);
                if (C0BQF.LIZ() && iIntValue3 == 51) {
                    i = 1;
                } else {
                    i = 0;
                }
                interfaceC665890Q9z2.setHasMore(i);
            } else {
                List listSubList2 = list.subList(iIntValue, i4);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                if ((!listSubList2.isEmpty()) && (strLIZJ = C639570P6t.LIZJ(Integer.valueOf(iIntValue3))) != null) {
                    linkedHashMap.put(strLIZJ, listSubList2);
                }
                interfaceC665890Q9z2.setReviewAggregation(linkedHashMap);
                interfaceC665890Q9z2.setHasMore(1);
            }
            completionBlock.onSuccess(interfaceC665890Q9z2, "");
            return;
        }
        final SearchReviewAggregationCardVM searchReviewAggregationCardVM = (SearchReviewAggregationCardVM) c736950SvV.getValue();
        Integer numValueOf2 = Integer.valueOf(interfaceC665880Q9y.getType().intValue());
        String backtrace = interfaceC665880Q9y.getBacktrace();
        String logid = interfaceC665880Q9y.getLogid();
        Map<String, Object> extraRequest = interfaceC665880Q9y.getExtraRequest();
        final C0PPJ c0ppj = new C0PPJ(backtrace, numValueOf2, logid, extraRequest);
        final C665860Q9w c665860Q9w = new C665860Q9w(this, completionBlock, interfaceC665880Q9y);
        final AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(completionBlock, (CompletionBlock<InterfaceC665890Q9z>) 1);
        InterfaceC420801kM interfaceC420801kM2 = searchReviewAggregationCardVM.LL;
        if (interfaceC420801kM2 != null && !interfaceC420801kM2.isDisposed() && (interfaceC420801kM = searchReviewAggregationCardVM.LL) != null) {
            interfaceC420801kM.dispose();
        }
        C844470XAv.LIZ.getClass();
        if (!C0XF1.LIZLLL(C844470XAv.LIZ())) {
            awS589S0100000_10.invoke(new Throwable("There is no available network!"));
            return;
        }
        C0QAO.LIZ.getClass();
        InterfaceC665790Q9p interfaceC665790Q9p = C0QAO.LIZIZ;
        if (extraRequest == null) {
            extraRequest = new LinkedHashMap<>();
        }
        InterfaceC420801kM interfaceC420801kMLJJLL = interfaceC665790Q9p.LIZ(backtrace, logid, extraRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0PPI
            @Override // X.C09JN
            public final void accept(Object obj2) {
                Map<String, ? extends Object> map2;
                C1C7U.LIZ("SearchReviewAggregationCardVM@a895.searchHorizontalLoadMore$1");
                SearchReviewAggregationHorizontalLoadMoreResponse searchReviewAggregationHorizontalLoadMoreResponse = (SearchReviewAggregationHorizontalLoadMoreResponse) obj2;
                Integer num = searchReviewAggregationHorizontalLoadMoreResponse.statusCode;
                if (num != null && num.intValue() == 0) {
                    C639570P6t c639570P6t2 = C639570P6t.LIZ;
                    Integer num2 = c0ppj.LIZ;
                    c639570P6t2.getClass();
                    if (num2 != null) {
                        if (num2.intValue() == 50) {
                            map2 = searchReviewAggregationHorizontalLoadMoreResponse.reviewAggregation;
                        } else if (num2.intValue() == 51) {
                            map2 = searchReviewAggregationHorizontalLoadMoreResponse.aggregationProsCons;
                        }
                        if (map2 != null) {
                            C0PPJ c0ppj2 = c0ppj;
                            SearchReviewAggregationCardVM searchReviewAggregationCardVM2 = searchReviewAggregationCardVM;
                            InterfaceC1631620sYq<Map<String, ? extends Object>, Integer, Integer, Unit> interfaceC1631620sYq = c665860Q9w;
                            String strLIZJ3 = C639570P6t.LIZJ(c0ppj2.LIZ);
                            if (strLIZJ3 == null) {
                                strLIZJ3 = "";
                            }
                            searchReviewAggregationCardVM2.vQ2(strLIZJ3, map2);
                            interfaceC1631620sYq.invoke(map2, searchReviewAggregationHorizontalLoadMoreResponse.cursor, searchReviewAggregationHorizontalLoadMoreResponse.hasMore);
                        }
                    }
                } else {
                    Function1<Throwable, Unit> function1 = awS589S0100000_10;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("HorizontalResponse error, status_code = ");
                    sbLIZ2.append(searchReviewAggregationHorizontalLoadMoreResponse.statusCode);
                    function1.invoke(new Throwable(C2188811AlT.LIZIZ(sbLIZ2)));
                }
                C1C7U.LIZIZ("SearchReviewAggregationCardVM@a895.searchHorizontalLoadMore$1");
            }
        }, new AfS172S0100000_3((Object) awS589S0100000_10, 40));
        searchReviewAggregationCardVM.disposeOnClear(interfaceC420801kMLJJLL);
        searchReviewAggregationCardVM.LL = interfaceC420801kMLJJLL;
    }
}

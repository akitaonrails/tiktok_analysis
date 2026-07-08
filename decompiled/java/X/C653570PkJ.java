package X;

import Y.ARunnableS10S1300000_10;
import Y.ARunnableS110S0100000_10;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchHorCommonData;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.SearchUserHorizontalData;
import com.ss.android.ugc.aweme.discover.model.SearchUserHorizontalLoadMoreData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceProvider;
import com.ss.android.ugc.aweme.search.pages.result.common.core.config.SearchVideoAndUserOptimizeExperiment;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchAwemeCardForUser;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0PkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653570PkJ {
    public final ViewStub LIZ;
    public final ViewGroup LIZIZ = null;
    public final ViewGroup LIZJ;
    public final LifecycleOwner LIZLLL;
    public final Function0<InterfaceC665370Q7z> LJ;
    public LinearLayout LJFF;
    public C21415918rV LJI;
    public View LJII;
    public View LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;
    public C652390PiP LJIIJJI;
    public SearchAwemeCardForUser LJIIL;
    public C653640PkQ LJIILIIL;
    public InterfaceC653620PkO LJIILJJIL;
    public InterfaceC653610PkN LJIILL;
    public SearchUser LJIILLIIL;
    public int LJIIZILJ;
    public C662430Pyb LJIJ;
    public C653660PkS LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public AwS554S0100000_10 LJJI;
    public C653680PkU LJJIFFI;

    public final boolean LIZIZ() {
        ProductGroup productGroup;
        List<Product> list;
        Integer num;
        SearchUser searchUser = this.LJIILLIIL;
        return (searchUser == null || (productGroup = searchUser.productGroup) == null || (list = productGroup.productList) == null || (num = productGroup.creatorShowcaseType) == null || num.intValue() != 1 || list.size() < 3) ? false : true;
    }

    public final void LIZLLL() {
        SearchUserHorizontalData searchUserHorizontalData;
        SearchHorCommonData commonData;
        List<Aweme> list;
        C662390PyX.LIZ.getClass();
        C662390PyX.LIZJ = false;
        SearchUser searchUser = this.LJIILLIIL;
        if (searchUser == null || (searchUserHorizontalData = searchUser.searchUserHorizontalData) == null || (commonData = searchUserHorizontalData.getCommonData()) == null || !commonData.getHasMoreHorizontalData()) {
            return;
        }
        SearchUser searchUser2 = this.LJIILLIIL;
        if (searchUser2 == null || (list = searchUser2.awemeCards) == null || list.size() < 10) {
            View view = this.LJIIIIZZ;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(8, view);
            View view2 = this.LJIIIZ;
            C786410Ut5.LJLLLLLL(0, view2 != null ? view2 : null);
            if (Intrinsics.LJFF(C1827807Dw.LIZ.getValue(), 1)) {
                LJ();
                return;
            }
            View view3 = this.LJIIJ;
            if (view3 != null) {
                HandlerHook.viewPost(view3, new ARunnableS110S0100000_10(this, 175));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [T, android.graphics.Rect] */
    public final void LJ() {
        String str;
        String str2;
        String backtrace;
        SearchUserHorizontalData searchUserHorizontalData;
        SearchAwemeCardForUser searchAwemeCardForUser = this.LJIIL;
        if (searchAwemeCardForUser != null) {
            searchAwemeCardForUser.LLJJ = true;
        }
        C662390PyX c662390PyX = C662390PyX.LIZ;
        C653660PkS c653660PkS = this.LJIJI;
        if (c653660PkS == null || (str = c653660PkS.LJIIJ) == null) {
            str = "";
        }
        C646000PVm c646000PVm = C650950Pg5.Companion;
        View view = this.LJIIJ;
        c646000PVm.getClass();
        C0PRW c0prwLIZLLL = C646000PVm.LIZLLL(view);
        if (c0prwLIZLLL == null || (str2 = c0prwLIZLLL.searchKeyword) == null) {
            str2 = "";
        }
        final SearchUser searchUser = this.LJIILLIIL;
        View view2 = this.LJIIIIZZ;
        if (view2 == null) {
            view2 = null;
        }
        View view3 = this.LJIIIZ;
        if (view3 == null) {
            view3 = null;
        }
        C21415918rV c21415918rV = this.LJI;
        final C21415918rV c21415918rV2 = c21415918rV != null ? c21415918rV : null;
        c662390PyX.getClass();
        final int i = C662390PyX.LJFF;
        final AwS624S0100000_10 awS624S0100000_10 = new AwS624S0100000_10(this, 131);
        boolean zLJI = MethodIDManager.LJI(202207);
        try {
            C662390PyX.LIZLLL = System.currentTimeMillis();
            C662390PyX.LJ = true;
            ObjectAnimator objectAnimator = C662390PyX.LIZIZ;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, "rotation", 0.0f, 180.0f, 360.0f);
            C662390PyX.LIZIZ = objectAnimatorOfFloat;
            if (objectAnimatorOfFloat != null) {
                objectAnimatorOfFloat.setRepeatMode(1);
            }
            ObjectAnimator objectAnimator2 = C662390PyX.LIZIZ;
            if (objectAnimator2 != null) {
                objectAnimator2.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator3 = C662390PyX.LIZIZ;
            if (objectAnimator3 != null) {
                objectAnimator3.setInterpolator(new LinearInterpolator());
            }
            ObjectAnimator objectAnimator4 = C662390PyX.LIZIZ;
            if (objectAnimator4 != null) {
                objectAnimator4.setDuration(1500L);
            }
            ObjectAnimator objectAnimator5 = C662390PyX.LIZIZ;
            if (objectAnimator5 != null) {
                C786410Ut5.Pd(objectAnimator5);
            }
            SearchApiNew.RealApi realApiLIZ = SearchApiNew.LIZ();
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = new Rect();
            if (searchUser == null || (searchUserHorizontalData = searchUser.searchUserHorizontalData) == null || (backtrace = searchUserHorizontalData.getBacktrace()) == null) {
                backtrace = "";
            }
            final String str3 = str;
            final View view4 = view3;
            final View view5 = view2;
            AbstractC19484711Kz.LJIJJ(realApiLIZ.LIZJ(null, str, str2, backtrace, str, "", 0L, null)).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LIZ(new InterfaceC19474811He<String>() { // from class: X.0Ph7
                @Override // X.InterfaceC19474811He
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                }

                @Override // X.InterfaceC19474811He
                public final void onError(Throwable th) {
                    String str4 = str3;
                    C2487409ou.LIZJ(new ARunnableS10S1300000_10(view5, view4, str4, c259800zU, 1));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object] */
                @Override // X.InterfaceC19474811He
                public final void onSuccess(String str4) throws JSONException {
                    List<? extends Aweme> list;
                    boolean disableMusicDspFreqCtrl;
                    GlobalDoodleConfig globalDoodleConfig;
                    String str5;
                    SearchUserHorizontalData searchUserHorizontalData2;
                    SearchHorCommonData commonData;
                    String str6 = str4;
                    C662390PyX c662390PyX2 = C662390PyX.LIZ;
                    String str7 = str3;
                    c662390PyX2.getClass();
                    C662390PyX.LIZIZ(1, str7);
                    C662390PyX.LIZLLL = -1L;
                    C662390PyX.LIZJ = false;
                    SearchUser searchUser2 = searchUser;
                    if (searchUser2 != null && (searchUserHorizontalData2 = searchUser2.searchUserHorizontalData) != null && (commonData = searchUserHorizontalData2.getCommonData()) != null) {
                        commonData.setHasMoreHorizontalData(false);
                    }
                    try {
                        final C259800zU c259800zU2 = new C259800zU();
                        ?? FromJson = GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), str6, new TypeToken<SearchUserHorizontalLoadMoreData>() { // from class: X.0Pg0
                        }.getType());
                        c259800zU2.element = FromJson;
                        SearchUserHorizontalLoadMoreData searchUserHorizontalLoadMoreData = (SearchUserHorizontalLoadMoreData) FromJson;
                        if (searchUserHorizontalLoadMoreData != null && (list = searchUserHorizontalLoadMoreData.awemeList) != null) {
                            SearchUser searchUser3 = searchUser;
                            final View view6 = view4;
                            final C259800zU<Rect> c259800zU3 = c259800zU;
                            final View view7 = c21415918rV2;
                            final Function2<List<? extends Aweme>, Integer, Unit> function2 = awS624S0100000_10;
                            final int i2 = i;
                            final View view8 = view5;
                            for (Aweme aweme : list) {
                                if (searchUser3 != null && (str5 = searchUser3.entityType) != null && str5.length() != 0) {
                                    AwemeExtKt.appendMobParam(aweme, "is_entity", "1");
                                    AwemeExtKt.appendMobParam(aweme, "entity_type", str5);
                                    HashMap<String, String> map = C653400Pk2.LIZ;
                                    String aid = aweme.getAid();
                                    if (aid == null) {
                                        aid = "";
                                    }
                                    map.put(aid, str5);
                                }
                                SearchApiResult searchApiResult = (SearchApiResult) c259800zU2.element;
                                if (searchApiResult != null && (globalDoodleConfig = searchApiResult.globalDoodleConfig) != null) {
                                    disableMusicDspFreqCtrl = globalDoodleConfig.getDisableMusicDspFreqCtrl();
                                } else {
                                    disableMusicDspFreqCtrl = false;
                                }
                                AwemeBizExtKt.setDisableMusicDspFreqCtrl(aweme, disableMusicDspFreqCtrl);
                            }
                            C2487409ou.LIZJ(new Runnable() { // from class: X.0Pfz
                                public final void LIZ() {
                                    C662390PyX c662390PyX3 = C662390PyX.LIZ;
                                    c662390PyX3.getClass();
                                    ObjectAnimator objectAnimator6 = C662390PyX.LIZIZ;
                                    if (objectAnimator6 != null) {
                                        objectAnimator6.cancel();
                                    }
                                    c662390PyX3.getClass();
                                    C662390PyX.LIZIZ = null;
                                    view6.getLocalVisibleRect(c259800zU3.element);
                                    if (c259800zU3.element.left < 0) {
                                        View view9 = view7;
                                        view9.scrollBy(-view9.getScrollX(), 0);
                                    }
                                    C786410Ut5.LJLLLLLL(8, view6);
                                    function2.invoke(c259800zU2.element.awemeList, Integer.valueOf(i2));
                                    View view10 = view8;
                                    if (view10 != null) {
                                        C786410Ut5.LJLLLLLL(0, view10);
                                    }
                                    c662390PyX3.getClass();
                                    C662390PyX.LJ = false;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("SearchUserHelper@7b95.horizontalLoadMore$1$onSuccess$1$2");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("SearchUserHelper@7b95.horizontalLoadMore$1$onSuccess$1$2");
                                }
                            });
                        }
                    } catch (C0XIR e) {
                        TryCatchGuardChecker.doCheck(e);
                        C662390PyX.LIZ.getClass();
                        ObjectAnimator objectAnimator6 = C662390PyX.LIZIZ;
                        if (objectAnimator6 != null) {
                            objectAnimator6.cancel();
                        }
                        C662390PyX.LIZIZ = null;
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJFF() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C652390PiP c652390PiP = this.LJIIJJI;
        if (c652390PiP != null && (recyclerView2 = c652390PiP.LLILLJJLI) != null) {
            recyclerView2.scrollToPosition(0);
        }
        C653640PkQ c653640PkQ = this.LJIILIIL;
        View view = c653640PkQ != null ? c653640PkQ.LJI : null;
        if (!(view instanceof RecyclerView) || (recyclerView = (RecyclerView) view) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01b8 A[LOOP:1: B:109:0x01b2->B:111:0x01b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.discover.model.SearchUser r13) {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C653570PkJ.LIZ(com.ss.android.ugc.aweme.discover.model.SearchUser):void");
    }

    public final void LIZJ(SearchUser searchUser, int i) {
        SearchUser searchUser2;
        ProductGroup productGroup;
        View view;
        SearchUser searchUser3;
        View view2;
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        SearchAwemeCardForUser searchAwemeCardForUser;
        RecyclerView recyclerView;
        Integer numValueOf;
        Integer numValueOf2;
        RecyclerView recyclerView2;
        String str;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        View viewTd;
        LinearLayout linearLayout3;
        this.LJIILLIIL = searchUser;
        this.LJIIZILJ = i;
        if (i != 1) {
            LinearLayout linearLayout4 = this.LJFF;
            if (linearLayout4 != null) {
                C661350Pwr.LIZJ(linearLayout4);
                return;
            }
            return;
        }
        LinearLayout linearLayout5 = null;
        if (this.LJFF == null) {
            if (this.LIZIZ != null) {
                SearchVideoAndUserOptimizeExperiment.LIZ.getClass();
                if (((SearchVideoAndUserOptimizeExperiment.OptimizeConfig) SearchVideoAndUserOptimizeExperiment.LIZJ.getValue()).userLayoutOptimize) {
                    C650520PfO c650520PfO = C650520PfO.LIZ;
                    ViewGroup viewGroup = this.LIZIZ;
                    c650520PfO.getClass();
                    viewTd = C650520PfO.LIZ(R.layout.f3u, viewGroup);
                } else {
                    viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZIZ.getContext()), R.layout.f3u, this.LIZIZ, false);
                }
                if ((viewTd instanceof LinearLayout) && (linearLayout3 = (LinearLayout) viewTd) != null) {
                    this.LJFF = linearLayout3;
                } else {
                    throw new IllegalArgumentException("View configuration error");
                }
            } else if (this.LIZ != null) {
                SearchVideoAndUserOptimizeExperiment.LIZ.getClass();
                if (((SearchVideoAndUserOptimizeExperiment.OptimizeConfig) SearchVideoAndUserOptimizeExperiment.LIZJ.getValue()).userLayoutOptimize) {
                    C650520PfO c650520PfO2 = C650520PfO.LIZ;
                    ViewGroup viewGroup2 = (ViewGroup) this.LIZ.getParent();
                    c650520PfO2.getClass();
                    View viewLIZ = C650520PfO.LIZ(R.layout.f3u, viewGroup2);
                    if ((viewLIZ instanceof LinearLayout) && (linearLayout2 = (LinearLayout) viewLIZ) != null) {
                        this.LJFF = linearLayout2;
                        ViewGroup viewGroup3 = this.LIZJ;
                        if (viewGroup3 != null) {
                            viewGroup3.addView(linearLayout2, -1, -2);
                        }
                    } else {
                        throw new IllegalArgumentException("View configuration error");
                    }
                } else {
                    this.LIZ.setLayoutResource(R.layout.f3u);
                    View viewLJLLLL = C786410Ut5.LJLLLL(this.LIZ);
                    if ((viewLJLLLL instanceof LinearLayout) && (linearLayout = (LinearLayout) viewLJLLLL) != null) {
                        this.LJFF = linearLayout;
                    } else {
                        throw new IllegalArgumentException("ViewStub configuration error");
                    }
                }
            }
        }
        if (!this.LJJ && this.LJIIJJI == null) {
            this.LJJ = true;
            LinearLayout linearLayout6 = this.LJFF;
            if (linearLayout6 == null) {
                linearLayout6 = null;
            }
            this.LJIIJ = linearLayout6.findViewById(R.id.user_video_list_root);
            LinearLayout linearLayout7 = this.LJFF;
            if (linearLayout7 == null) {
                linearLayout7 = null;
            }
            this.LJI = (C21415918rV) linearLayout7.findViewById(R.id.av3);
            LinearLayout linearLayout8 = this.LJFF;
            if (linearLayout8 == null) {
                linearLayout8 = null;
            }
            this.LJII = linearLayout8.findViewById(R.id.av4);
            LinearLayout linearLayout9 = this.LJFF;
            if (linearLayout9 == null) {
                linearLayout9 = null;
            }
            this.LJIIIIZZ = linearLayout9.findViewById(R.id.av6);
            LinearLayout linearLayout10 = this.LJFF;
            if (linearLayout10 == null) {
                linearLayout10 = null;
            }
            this.LJIIIZ = linearLayout10.findViewById(R.id.nmk);
            LinearLayout linearLayout11 = this.LJFF;
            if (linearLayout11 == null) {
                linearLayout11 = null;
            }
            C652390PiP c652390PiP = new C652390PiP(linearLayout11);
            this.LJIIJJI = c652390PiP;
            SearchUser searchUser4 = this.LJIILLIIL;
            LifecycleOwner lifecycleOwner = this.LIZLLL;
            Function0<InterfaceC665370Q7z> function0 = this.LJ;
            if (searchUser4 != null && searchUser4.cardType() == 1) {
                searchAwemeCardForUser = new SearchAwemeCardForUser(c652390PiP, lifecycleOwner, function0);
            } else {
                searchAwemeCardForUser = null;
            }
            if (!(searchAwemeCardForUser instanceof SearchAwemeCardForUser)) {
                searchAwemeCardForUser = null;
            }
            this.LJIIL = searchAwemeCardForUser;
            if (searchAwemeCardForUser != null) {
                C653660PkS c653660PkS = this.LJIJI;
                if (c653660PkS != null) {
                    str = c653660PkS.LJJJJZI;
                } else {
                    str = null;
                }
                searchAwemeCardForUser.LLJILLL = str;
            }
            C652390PiP c652390PiP2 = this.LJIIJJI;
            if (c652390PiP2 != null && (recyclerView2 = c652390PiP2.LLILLJJLI) != null) {
                C426750GoL.LJIIL(recyclerView2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, 27);
            }
            Integer numValueOf3 = Integer.valueOf(C1913107eT.LJFF());
            if (numValueOf3.intValue() > 0) {
                int iIntValue = numValueOf3.intValue();
                C652390PiP c652390PiP3 = this.LJIIJJI;
                if (c652390PiP3 != null && (recyclerView = c652390PiP3.LLILLJJLI) != null) {
                    Integer numValueOf4 = Integer.valueOf(C1913107eT.LJ());
                    int iIntValue2 = numValueOf4.intValue();
                    if (iIntValue2 > 0 && iIntValue - iIntValue2 > 0) {
                        numValueOf = Integer.valueOf(iIntValue - numValueOf4.intValue());
                    } else {
                        numValueOf = null;
                    }
                    Integer numValueOf5 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))));
                    if (numValueOf != null) {
                        numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numValueOf)));
                    } else {
                        numValueOf2 = null;
                    }
                    C426750GoL.LJIIL(recyclerView, numValueOf5, null, numValueOf2, null, 26);
                }
            }
            View view3 = this.LJII;
            if (view3 == null) {
                view3 = null;
            }
            C786410Ut5.LJLLLLLL(0, view3);
            C662390PyX.LIZ.getClass();
            C662390PyX.LJ = false;
            C21415918rV c21415918rV = this.LJI;
            if (c21415918rV == null) {
                c21415918rV = null;
            }
            c21415918rV.setEnable(true);
            c21415918rV.setOnScrollToEndListener(new AwS554S0100000_10(this, 1214));
            c21415918rV.setOnScrollThresholdHitListener(AFwS196S0000000_10.get$arr$(649));
            c21415918rV.setOnNestedScrollAcceptedListener(AFwS241S0000000_10.get$arr$(521));
        }
        if (!this.LJIJJ && (searchUser3 = this.LJIILLIIL) != null && searchUser3.playlists != null) {
            this.LJIJJ = true;
            LinearLayout linearLayout12 = this.LJFF;
            if (linearLayout12 == null) {
                linearLayout12 = null;
            }
            C653640PkQ c653640PkQ = new C653640PkQ(linearLayout12);
            LinearLayout linearLayout13 = this.LJFF;
            if (linearLayout13 == null) {
                linearLayout13 = null;
            }
            View view4 = c653640PkQ.LJI;
            if (view4 == null) {
                C1169380gXI c1169380gXILJIIIZ = ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJIIIZ(linearLayout12, false, true, "general_search", c653640PkQ.LJII);
                if (c1169380gXILJIIIZ != null && (view2 = c1169380gXILJIIIZ.itemView) != null && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view2.findViewById(R.id.rn0)) != null) {
                    viewOnAttachStateChangeListenerC20604515jv.setMinimumHeight(C0H9H.LIZIZ(36));
                    viewOnAttachStateChangeListenerC20604515jv.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0PkL
                        @Override // X.InterfaceC21676519sR
                        public final void m3(View view5) {
                        }

                        @Override // X.InterfaceC21676519sR
                        public final void g5(View view5) {
                            viewOnAttachStateChangeListenerC20604515jv.setMinimumHeight(0);
                            viewOnAttachStateChangeListenerC20604515jv.removeOnChildAttachStateChangeListener(this);
                        }
                    });
                }
                if ((c1169380gXILJIIIZ instanceof InterfaceC653650PkR) && c1169380gXILJIIIZ != null) {
                    c653640PkQ.LJFF = c1169380gXILJIIIZ;
                    view4 = c1169380gXILJIIIZ.itemView;
                    c653640PkQ.LJI = view4;
                } else {
                    throw new IllegalStateException("Unknown playlist view holder");
                }
            }
            linearLayout13.addView(view4, 0);
            this.LJIILIIL = c653640PkQ;
            C662430Pyb c662430Pyb = this.LJIJ;
            C653660PkS c653660PkS2 = this.LJIJI;
            c653640PkQ.LJ = c662430Pyb;
            c653640PkQ.LIZLLL = c653660PkS2;
            c653640PkQ.LIZ(this.LJIILLIIL);
        }
        if (!this.LJIJJLI && (searchUser2 = this.LJIILLIIL) != null && (productGroup = searchUser2.productGroup) != null && Intrinsics.LJFF(productGroup.showEntrance, Boolean.TRUE) && this.LJFF != null) {
            this.LJIJJLI = true;
            ISearchShowcaseEntranceProvider iSearchShowcaseEntranceProviderLIZJ = C1202104n5.LIZ().LIZJ();
            if (iSearchShowcaseEntranceProviderLIZJ != null) {
                LinearLayout linearLayout14 = this.LJFF;
                if (linearLayout14 == null) {
                    linearLayout14 = null;
                }
                InterfaceC653620PkO searchShowcaseEntranceView = iSearchShowcaseEntranceProviderLIZJ.getSearchShowcaseEntranceView(linearLayout14);
                int iLJFF = C1913107eT.LJFF();
                if (searchShowcaseEntranceView != null) {
                    searchShowcaseEntranceView.LIZ(this.LJJIFFI);
                    if (iLJFF > 0 && (view = searchShowcaseEntranceView.getView()) != null) {
                        C426750GoL.LJIIIZ(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLJFF)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLJFF)))), null, false, 26);
                    }
                    LinearLayout linearLayout15 = this.LJFF;
                    if (linearLayout15 == null) {
                        linearLayout15 = null;
                    }
                    View view5 = searchShowcaseEntranceView.getView();
                    if (!(view5 instanceof View)) {
                        view5 = null;
                    }
                    linearLayout15.addView(view5, 0);
                    this.LJIILJJIL = searchShowcaseEntranceView;
                }
                InterfaceC653620PkO interfaceC653620PkO = this.LJIILJJIL;
                if (interfaceC653620PkO != null) {
                    interfaceC653620PkO.bindData(this.LJIILLIIL);
                }
            }
        }
        if (!this.LJIL && LIZIZ() && this.LJFF != null) {
            this.LJIL = true;
            InterfaceC653600PkM interfaceC653600PkMLIZLLL = C1202104n5.LIZ().LIZLLL();
            if (interfaceC653600PkMLIZLLL != null) {
                LinearLayout linearLayout16 = this.LJFF;
                if (linearLayout16 == null) {
                    linearLayout16 = null;
                }
                C0Q21 c0q21LIZ = interfaceC653600PkMLIZLLL.LIZ(linearLayout16);
                c0q21LIZ.LIZJ = this.LJJIFFI;
                int iLJFF2 = C1913107eT.LJFF();
                if (iLJFF2 > 0) {
                    C426750GoL.LJIIIZ(c0q21LIZ.LIZ, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLJFF2)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLJFF2)))), null, false, 26);
                }
                LinearLayout linearLayout17 = this.LJFF;
                if (linearLayout17 != null) {
                    linearLayout5 = linearLayout17;
                }
                linearLayout5.addView(c0q21LIZ.LIZ);
                this.LJIILL = c0q21LIZ;
                c0q21LIZ.bindData(this.LJIILLIIL);
            }
        }
    }

    public C653570PkJ(ViewStub viewStub, ViewGroup viewGroup, LifecycleOwner lifecycleOwner, AwS554S0100000_10 awS554S0100000_10) {
        this.LIZ = viewStub;
        this.LIZJ = viewGroup;
        this.LIZLLL = lifecycleOwner;
        this.LJ = awS554S0100000_10;
    }
}

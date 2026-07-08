package Y;

import X.C013C;
import X.C041J;
import X.C09JN;
import X.C0I7D;
import X.C0P7M;
import X.C0PC0;
import X.C0PCY;
import X.C0PE2;
import X.C0PG1;
import X.C0PG2;
import X.C0PRE;
import X.C0PRL;
import X.C0Q2G;
import X.C0Q3E;
import X.C0Q8E;
import X.C0QL4;
import X.C0QNM;
import X.C0R1P;
import X.C0WZX;
import X.C1065740dq8;
import X.C11JF;
import X.C1322110kVd;
import X.C1389890mGx;
import X.C1767106w1;
import X.C1768270w7F;
import X.C1768280w7G;
import X.C19EG;
import X.C1AF0;
import X.C1C7U;
import X.C20600815jK;
import X.C21673919s1;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C337180DJs;
import X.C476250Ilz;
import X.C606810Nr5;
import X.C651290Pgd;
import X.C668920QLq;
import X.C674850QdX;
import X.C675090Qdv;
import X.C676050QfT;
import X.C676240Qfm;
import X.C786410Ut5;
import X.C813430VvZ;
import X.EnumC670460QRo;
import X.InterfaceC1526205yG;
import X.InterfaceC1891350zJl;
import X.InterfaceC680000Qlq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.gson.n;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchSingleDetectionFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionRecommendNameCell;
import com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment;
import com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.viewmodel.DynamicSearchMusicResultViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.viewmodel.SearchDynamicTabViewModel;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.SearchSevenSplitScreenFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class AfS179S0100000_10 implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
        }
    }

    public AfS179S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        Exception exc;
        C1C7U.LIZ("FeedsFEBridgeModel@3052.loadMore$3");
        Throwable th = (Throwable) obj;
        C1065740dq8 c1065740dq8 = (C1065740dq8) afS179S0100000_10.l0;
        c1065740dq8.mIsLoading = false;
        List<InterfaceC1526205yG> list = c1065740dq8.mNotifyListeners;
        if (list != null) {
            for (InterfaceC1526205yG interfaceC1526205yG : list) {
                if (interfaceC1526205yG != null) {
                    if (th instanceof Exception) {
                        exc = (Exception) th;
                    } else {
                        exc = null;
                    }
                    interfaceC1526205yG.onFailed(exc);
                }
            }
        }
        C1C7U.LIZIZ("FeedsFEBridgeModel@3052.loadMore$3");
    }

    public static final void accept$1(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C1C7U.LIZ("CropImageView@970e.bind$unUsed$1");
        Pair pair = (Pair) obj;
        ((C676240Qfm) afS179S0100000_10.l0).LIZIZ().setScaleType(ImageView.ScaleType.FIT_CENTER);
        ((C676240Qfm) afS179S0100000_10.l0).LIZIZ().setImageBitmap((Bitmap) pair.getFirst());
        if (pair.getSecond() != null) {
            ((C676240Qfm) afS179S0100000_10.l0).LIZIZ().setBackground(new BitmapDrawable((Bitmap) pair.getSecond()));
        }
        C1C7U.LIZIZ("CropImageView@970e.bind$unUsed$1");
    }

    public static final void accept$10(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C1C7U.LIZ("SearchMemoryOptimizer@b6bd.checkAndCleanMemory$disposable$1");
        if (C0Q8E.LIZ((Context) afS179S0100000_10.l0)) {
            C1768280w7G c1768280w7G = new C1768280w7G();
            c1768280w7G.LIZJ = C0Q8E.LIZ;
            C476250Ilz.LIZ.LJ(new C1768270w7F(c1768280w7G));
        }
        C1C7U.LIZIZ("SearchMemoryOptimizer@b6bd.checkAndCleanMemory$disposable$1");
    }

    public static final void accept$11(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        PhotoSearchEnterParams photoSearchEnterParams;
        MutableLiveData mutableLiveDataDQ2;
        C1C7U.LIZ("PhotoSearchSingleDetectionFragment@4bef.refreshPage$2");
        C676050QfT c676050QfT = (C676050QfT) obj;
        PhotoSearchBaseVM photoSearchBaseVM = ((PhotoSearchSingleDetectionFragment) afS179S0100000_10.l0).LLJJJIL;
        if (photoSearchBaseVM != null) {
            photoSearchEnterParams = photoSearchBaseVM.LLILLL;
        } else {
            photoSearchEnterParams = null;
        }
        C674850QdX c674850QdXLIZIZ = C675090Qdv.LIZIZ(photoSearchEnterParams, c676050QfT);
        PhotoSearchBaseVM photoSearchBaseVM2 = ((PhotoSearchSingleDetectionFragment) afS179S0100000_10.l0).LLJJJIL;
        if (photoSearchBaseVM2 != null && (mutableLiveDataDQ2 = photoSearchBaseVM2.DQ2(c674850QdXLIZIZ)) != null) {
            mutableLiveDataDQ2.observe(((PhotoSearchSingleDetectionFragment) afS179S0100000_10.l0).getViewLifecycleOwner(), ((PhotoSearchSingleDetectionFragment) afS179S0100000_10.l0).LLJLLL);
        }
        C1C7U.LIZIZ("PhotoSearchSingleDetectionFragment@4bef.refreshPage$2");
    }

    public static final void accept$12(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C1C7U.LIZ("DynamicSearchMusicResultViewModel@1fb7.refresh$1");
        n nVar = (n) obj;
        InterfaceC680000Qlq interfaceC680000Qlq = ((DynamicSearchMusicResultViewModel) afS179S0100000_10.l0).LLILZLL;
        if (interfaceC680000Qlq != null) {
            interfaceC680000Qlq.JN(nVar);
        }
        C1C7U.LIZIZ("DynamicSearchMusicResultViewModel@1fb7.refresh$1");
    }

    public static final void accept$13(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C1C7U.LIZ("DynamicSearchMusicResultViewModel@1fb7.refresh$2");
        InterfaceC680000Qlq interfaceC680000Qlq = ((DynamicSearchMusicResultViewModel) afS179S0100000_10.l0).LLILZLL;
        if (interfaceC680000Qlq != null) {
            interfaceC680000Qlq.JN(null);
        }
        C1C7U.LIZIZ("DynamicSearchMusicResultViewModel@1fb7.refresh$2");
    }

    public static final void accept$14(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C1C7U.LIZ("SearchUserLiveEventView@d6e.notifyNextLive$2");
        LinearLayout linearLayout = ((C0Q2G) afS179S0100000_10.l0).LLILLJJLI;
        if (linearLayout != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(linearLayout);
            c1389890mGx.LJIIIZ(2131854993);
            c1389890mGx.LJIIJJI();
        }
        ((C0Q2G) afS179S0100000_10.l0).LLILZLL = false;
        C1C7U.LIZIZ("SearchUserLiveEventView@d6e.notifyNextLive$2");
    }

    public static final void accept$15(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C1C7U.LIZ("SearchFirstPageStayTimeHelper@7b8d.initLifecycleObserver$2");
        if (((C813430VvZ) obj).LIZ.LIZ instanceof C0PE2) {
            ((C0P7M) afS179S0100000_10.l0).LIZLLL("exit");
        }
        C1C7U.LIZIZ("SearchFirstPageStayTimeHelper@7b8d.initLifecycleObserver$2");
    }

    public static final void accept$16(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C1C7U.LIZ("SearchFirstPageStayTimeHelper@7b8d.initLifecycleObserver$3");
        if (((C813430VvZ) obj).LIZ.LIZ instanceof C0PE2) {
            ((C0P7M) afS179S0100000_10.l0).LIZLLL("exit");
        }
        C1C7U.LIZIZ("SearchFirstPageStayTimeHelper@7b8d.initLifecycleObserver$3");
    }

    public static final void accept$17(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C0R1P c0r1pLIZ;
        C1C7U.LIZ("EcTakePhotoActivity@354a.initAppBackgroundListener$1");
        C606810Nr5 c606810Nr5 = (C606810Nr5) obj;
        EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) afS179S0100000_10.l0;
        C0R1P c0r1p = ecTakePhotoActivity.LLLIL;
        if (c0r1p != null) {
            if (c606810Nr5.LIZIZ) {
                long j = c0r1p.LIZ;
                if (j > 0) {
                    long jCurrentTimeMillis = (c0r1p.LIZIZ + System.currentTimeMillis()) - j;
                    EcTakePhotoActivity ecTakePhotoActivity2 = (EcTakePhotoActivity) afS179S0100000_10.l0;
                    C0R1P c0r1p2 = ecTakePhotoActivity2.LLLIL;
                    if (c0r1p2 != null) {
                        c0r1pLIZ = C0R1P.LIZ(c0r1p2, System.currentTimeMillis(), jCurrentTimeMillis, 4);
                    } else {
                        c0r1pLIZ = null;
                    }
                    ecTakePhotoActivity2.LLLIL = c0r1pLIZ;
                }
            } else {
                ecTakePhotoActivity.LLLIL = C0R1P.LIZ(c0r1p, System.currentTimeMillis(), 0L, 6);
            }
        }
        C1C7U.LIZIZ("EcTakePhotoActivity@354a.initAppBackgroundListener$1");
    }

    public static final void accept$18(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C0PRL c0prl;
        C1C7U.LIZ("SearchResultFragmentNew@2882.initAppBackgroundListener$1");
        Boolean bool = (Boolean) obj;
        if (Intrinsics.LJFF(((SearchResultFragmentNew) afS179S0100000_10.l0).getActivity(), C651290Pgd.LIZJ())) {
            C0PCY<C0PC0> c0pcyCp2 = C0Q3E.LJI().cp2();
            if (bool.booleanValue()) {
                c0prl = C0PRL.ON_APP_BACKGROUND;
            } else {
                c0prl = C0PRL.ON_APP_FOREGROUND;
            }
            c0pcyCp2.LIZ(new C0PRE(c0prl, null));
        }
        C1C7U.LIZIZ("SearchResultFragmentNew@2882.initAppBackgroundListener$1");
    }

    public static final void accept$19(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew = (BaseDiscoverAndSearchFragmentNew) afS179S0100000_10.l0;
        C668920QLq c668920QLq = (C668920QLq) obj;
        baseDiscoverAndSearchFragmentNew.getClass();
        C1C7U.LIZ("BaseDiscoverAndSearchFragmentNew@d3de.onPause$1L");
        if (c668920QLq.LIZIZ && C2214201BlK.LJIIJJI) {
            c668920QLq.LIZ.LIZIZ();
        }
        C11JF c11jf = baseDiscoverAndSearchFragmentNew.LLJZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1C7U.LIZIZ("BaseDiscoverAndSearchFragmentNew@d3de.onPause$1L");
    }

    public static final void accept$2(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C1C7U.LIZ("CropImageView@970e.bind$unUsed$2");
        C786410Ut5.LLZZLLIL((C1322110kVd) ((C676240Qfm) afS179S0100000_10.l0).LJIIIZ.getValue(), 0);
        ((C676240Qfm) afS179S0100000_10.l0).LIZIZ().setScaleType(ImageView.ScaleType.FIT_XY);
        C1C7U.LIZIZ("CropImageView@970e.bind$unUsed$2");
    }

    public static final void accept$20(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew = (BaseDiscoverAndSearchFragmentNew) afS179S0100000_10.l0;
        baseDiscoverAndSearchFragmentNew.getClass();
        C1C7U.LIZ("BaseDiscoverAndSearchFragmentNew@d3de.com_ss_android_ugc_aweme_search_middle_BaseDiscoverAndSearchFragmentNew__onResume$___twin___$1L");
        ((ITpcConsentService) obj).LIZLLL();
        C11JF c11jf = baseDiscoverAndSearchFragmentNew.LLJZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1C7U.LIZIZ("BaseDiscoverAndSearchFragmentNew@d3de.com_ss_android_ugc_aweme_search_middle_BaseDiscoverAndSearchFragmentNew__onResume$___twin___$1L");
    }

    public static final void accept$3(AfS179S0100000_10 afS179S0100000_10, Object obj) throws Throwable {
        Editable editableLLLLJI;
        C20600815jK<InterfaceC1891350zJl> state;
        C1C7U.LIZ("EditCollectionFragment@5201.initRecommendNameList$2");
        List list = (List) obj;
        C0I7D c0i7d = ((EditCollectionFragment) afS179S0100000_10.l0).LLILLJJLI;
        if (c0i7d != null) {
            editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLl2EYAwyyYek258TdiN3FbcEmZZs/0umHZjyGVbihZKXPK9MCW6UISIkchxVikaqw==", null));
        } else {
            editableLLLLJI = null;
        }
        if (!C041J.LIZ(editableLLLLJI) && list != null && !list.isEmpty()) {
            C337180DJs.LIZJ(((EditCollectionFragment) afS179S0100000_10.l0).LLJ);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((EditCollectionFragment) afS179S0100000_10.l0).LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(CollectionRecommendNameCell.class);
            }
            final C013C c013c = new C013C();
            c013c.element = true;
            EditCollectionFragment editCollectionFragment = (EditCollectionFragment) afS179S0100000_10.l0;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = editCollectionFragment.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                final Context context = editCollectionFragment.getContext();
                final EditCollectionFragment editCollectionFragment2 = (EditCollectionFragment) afS179S0100000_10.l0;
                viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment$initRecommendNameList$2$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3;
                        super.onLayoutCompleted(c21673919s1);
                        if (c013c.element && (viewOnAttachStateChangeListenerC20604515jv3 = editCollectionFragment2.LLJ) != null) {
                            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv3, new Runnable() { // from class: X.0PEb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("EditCollectionFragment@5201.initRecommendNameList$2$1$onLayoutCompleted$1");
                                    try {
                                        C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("EditCollectionFragment@5201.initRecommendNameList$2$1$onLayoutCompleted$1");
                                }
                            });
                        }
                        c013c.element = false;
                    }
                });
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = ((EditCollectionFragment) afS179S0100000_10.l0).LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                viewOnAttachStateChangeListenerC20604515jv3.addItemDecoration(new C1767106w1(0));
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = ((EditCollectionFragment) afS179S0100000_10.l0).LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv4 != null && (state = viewOnAttachStateChangeListenerC20604515jv4.getState()) != null) {
                state.LJIILL(list, null);
            }
            EditCollectionFragment editCollectionFragment3 = (EditCollectionFragment) afS179S0100000_10.l0;
            editCollectionFragment3.LLJJJIL = new AwS589S0100000_10(editCollectionFragment3, 103);
        }
        C1C7U.LIZIZ("EditCollectionFragment@5201.initRecommendNameList$2");
    }

    public static final void accept$4(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C20600815jK<InterfaceC1891350zJl> state;
        C1C7U.LIZ("InputNameSheetFragment@199e.initRecommendNameList$2");
        List list = (List) obj;
        EditText editText = ((InputNameSheetFragment) afS179S0100000_10.l0).LLILLJJLI;
        if (editText == null) {
            editText = null;
        }
        if (!C041J.LIZ(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLl2EYAwyyYek258TfKMwE/JPmhGt8VKGeyu068hZlx5Erc=", null))) && list != null && !list.isEmpty()) {
            C337180DJs.LIZJ(((InputNameSheetFragment) afS179S0100000_10.l0).LLJIJIL);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((InputNameSheetFragment) afS179S0100000_10.l0).LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(CollectionRecommendNameCell.class);
            }
            final C013C c013c = new C013C();
            c013c.element = true;
            InputNameSheetFragment inputNameSheetFragment = (InputNameSheetFragment) afS179S0100000_10.l0;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = inputNameSheetFragment.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                final Context context = inputNameSheetFragment.getContext();
                final InputNameSheetFragment inputNameSheetFragment2 = (InputNameSheetFragment) afS179S0100000_10.l0;
                viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment$initRecommendNameList$2$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3;
                        super.onLayoutCompleted(c21673919s1);
                        if (c013c.element && (viewOnAttachStateChangeListenerC20604515jv3 = inputNameSheetFragment2.LLJIJIL) != null) {
                            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv3, new Runnable() { // from class: X.0PEa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("InputNameSheetFragment@199e.initRecommendNameList$2$1$onLayoutCompleted$1");
                                    try {
                                        C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("InputNameSheetFragment@199e.initRecommendNameList$2$1$onLayoutCompleted$1");
                                }
                            });
                        }
                        c013c.element = false;
                    }
                });
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = ((InputNameSheetFragment) afS179S0100000_10.l0).LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                viewOnAttachStateChangeListenerC20604515jv3.addItemDecoration(new C1767106w1(1));
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = ((InputNameSheetFragment) afS179S0100000_10.l0).LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv4 != null && (state = viewOnAttachStateChangeListenerC20604515jv4.getState()) != null) {
                state.LJIILL(list, null);
            }
            InputNameSheetFragment inputNameSheetFragment3 = (InputNameSheetFragment) afS179S0100000_10.l0;
            inputNameSheetFragment3.LLJJ = new AwS589S0100000_10(inputNameSheetFragment3, 105);
        }
        C1C7U.LIZIZ("InputNameSheetFragment@199e.initRecommendNameList$2");
    }

    public static final void accept$5(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C1C7U.LIZ("SearchListProxy@4562.transAsync$disposable$2");
        if (obj == null) {
            C1C7U.LIZIZ("SearchListProxy@4562.transAsync$disposable$2");
        } else {
            ((Function1) afS179S0100000_10.l0).invoke(obj);
            C1C7U.LIZIZ("SearchListProxy@4562.transAsync$disposable$2");
        }
    }

    public static final void accept$6(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C1C7U.LIZ("SearchDynamicTabViewModel@5cfa.fetchTabList$2");
        ((SearchDynamicTabViewModel) afS179S0100000_10.l0).LLJIJIL.LIZIZ = C0PG1.REQUEST_ERROR.getMsg();
        ((SearchDynamicTabViewModel) afS179S0100000_10.l0).LL.postValue(C0PG2.ABORT_REQUEST);
        ((SearchDynamicTabViewModel) afS179S0100000_10.l0).LLILZLL.postValue(Boolean.TRUE);
        ((SearchDynamicTabViewModel) afS179S0100000_10.l0).LLILZ.postValue(0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error message", String.valueOf(((Throwable) obj).getMessage()));
        C1AF0.LIZLLL("dynamic api is error", linkedHashMap);
        C1C7U.LIZIZ("SearchDynamicTabViewModel@5cfa.fetchTabList$2");
    }

    public static final void accept$7(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C1C7U.LIZ("SearchSevenSplitScreenFragment@825d.onCreate$1");
        if (((C606810Nr5) obj).LIZIZ) {
            SearchSevenSplitScreenFragment searchSevenSplitScreenFragment = (SearchSevenSplitScreenFragment) afS179S0100000_10.l0;
            if (!searchSevenSplitScreenFragment.LLJJJIL) {
                searchSevenSplitScreenFragment.LLIZLLLIL = EnumC670460QRo.OTHER;
                searchSevenSplitScreenFragment.LLJJJ = true;
                searchSevenSplitScreenFragment.mobStayTime();
                ((SearchSevenSplitScreenFragment) afS179S0100000_10.l0).OR();
            }
        }
        C1C7U.LIZIZ("SearchSevenSplitScreenFragment@825d.onCreate$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$8(Y.AfS179S0100000_10 r6, java.lang.Object r7) {
        /*
            java.lang.String r5 = "SearchHotSpotWithVideoItemHolder@1130.<init>$1"
            X.C1C7U.LIZ(r5)
            boolean r0 = r7 instanceof X.AbstractC1387200mCc
            if (r0 == 0) goto L21
            r0 = r7
            X.0mCc r0 = (X.AbstractC1387200mCc) r0
            java.lang.Object r0 = r0.LIZ
            boolean r0 = r0 instanceof X.C0PE2
            if (r0 == 0) goto L21
            java.lang.Object r0 = r6.l0
            X.0Pov r0 = (X.ViewOnAttachStateChangeListenerC656430Pov) r0
            X.0Px3 r1 = r0.LLJILJIL
            java.lang.String r0 = ""
            r1.LJIILJJIL(r0)
        L1d:
            X.C1C7U.LIZIZ(r5)
            return
        L21:
            boolean r0 = r7 instanceof X.C19EG
            if (r0 == 0) goto L1d
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r4 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            java.lang.Object r0 = r6.l0
            X.0Pov r0 = (X.ViewOnAttachStateChangeListenerC656430Pov) r0
            X.0Px3 r2 = r0.LLJILJIL
            android.content.Context r0 = r2.getContext()
            X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
            if (r0 == 0) goto L54
            X.198i r3 = r0.LIZLLL()
            if (r3 == 0) goto L54
        L3d:
            android.app.Activity r7 = (android.app.Activity) r7
            r4.getClass()
            boolean r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJJLL(r3, r7)
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r6.l0
            X.0Pov r0 = (X.ViewOnAttachStateChangeListenerC656430Pov) r0
            X.0Px3 r1 = r0.LLJILJIL
            java.lang.String r0 = ""
            r1.LJIILJJIL(r0)
            goto L1d
        L54:
            android.content.Context r0 = r2.getContext()
            android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            r3 = 0
            if (r0 == 0) goto L7f
            android.content.Context r0 = r2.getContext()
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L72
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L7f
            goto L3d
        L72:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L3d
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L7f
            goto L3d
        L7f:
            androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r2)
            if (r2 == 0) goto L3d
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L9a
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L8f:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L9c
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto Lab
            goto L3d
        L9a:
            r1 = r3
            goto L8f
        L9c:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L3d
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto Lab
            goto L3d
        La9:
            if (r2 == 0) goto L3d
        Lab:
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto Lb3
            r3 = r2
            X.198i r3 = (X.InterfaceC214902198i) r3
            goto L3d
        Lb3:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS179S0100000_10.accept$8(Y.AfS179S0100000_10, java.lang.Object):void");
    }

    public static final void accept$9(AfS179S0100000_10 afS179S0100000_10, Object obj) {
        C1C7U.LIZ("SearchWidgetManager@9dee.init$disposable$1");
        C0QL4 c0ql4 = C0QL4.LIZ;
        Context context = (Context) afS179S0100000_10.l0;
        c0ql4.getClass();
        if (C0QL4.LIZIZ(context)) {
            C0QNM.LIZLLL(C0QNM.LIZ, (Context) afS179S0100000_10.l0);
        }
        C1C7U.LIZIZ("SearchWidgetManager@9dee.init$disposable$1");
    }

    public AfS179S0100000_10(PhotoSearchSingleDetectionFragment photoSearchSingleDetectionFragment, C19EG c19eg, int i) {
        this.$t = i;
        this.l0 = photoSearchSingleDetectionFragment;
    }
}

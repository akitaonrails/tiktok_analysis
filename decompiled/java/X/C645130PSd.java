package X;

import Y.AObjectS112S0000000_9;
import Y.AObjectS113S0000000_10;
import Y.ARunnableS0S0202000_10;
import Y.ARunnableS110S0100000_10;
import Y.ARunnableS11S0200100_4;
import Y.ARunnableS79S0200000_10;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.config.EcomGeneralShowCaseCardConfig;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchActivityCardBgData;
import com.ss.android.ugc.aweme.discover.model.SearchBackgroundConfig;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.FullSongUrlStruct;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.common.utils.SearchLocationCacheData;
import com.ss.android.ugc.aweme.search.ecom.data.EcomSearchInfo;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.bubble.EcSearchBubbleVM;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider;
import com.ss.android.ugc.aweme.search.lcp.SearchLcpExperiment;
import com.ss.android.ugc.aweme.search.lynx.core.ui.viewholder.DynamicViewHolder;
import com.ss.android.ugc.aweme.search.model.ApiRequestParams;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.VisualSearchContextModel;
import com.ss.android.ugc.aweme.search.model.VisualSearchEnterModel;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui.SearchLiveCollectionViewHolderAssemSupport;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.ClickSearchTriggerAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixCardProfile;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.SearchGeneralLoadMoreOptExperiment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.viewholder.SearchAccurateOffsetGridLayoutManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.ng.viewmodel.SearchAwemePoolViewModelNG;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.precisead.core.model.SearchPreciseAd;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PatchConfig;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.tiktok.forestx.RequestParamsX;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS136S0201000_10;
import kotlin.jvm.internal.AwS150S0101000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS78S1300000_10;
import kotlin.jvm.internal.AwS95S1000000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import ttpobfuscated.fe;

/* JADX INFO: renamed from: X.0PSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C645130PSd extends AbstractC683590Qrd<SearchMixFeed> implements C0PFE, InterfaceC652950PjJ, C0PT0<SearchMixFeed>, C0PAF {
    public static final /* synthetic */ int LLLF = 0;
    public final RecyclerView LL;
    public final InterfaceC641090PCp LLILLJJLI;
    public final InterfaceC659300PtY LLILLL;
    public final C0P6P LLILZ;
    public final Fragment LLILZIL;
    public final InterfaceC643430PLp LLILZLL;
    public final InterfaceC214902198i LLIZ;
    public final SearchAwemePoolViewModelNG LLIZLLLIL;
    public boolean LLJ;
    public Function0<Integer> LLJI;
    public SearchResultParam LLJIJIL;
    public final C653450Pk7<SearchMixFeed> LLJILJIL;
    public GlobalDoodleConfig LLJILJILJ;
    public final EcSearchBubbleVM LLJILLL;
    public List<String> LLJJ;
    public ClickSearchViewModel LLJJI;
    public C0PTB LLJJIII;
    public final C0PFA LLJJIJI;
    public C0PT5 LLJJIJIIJIL;
    public int LLJJIJIL;
    public String LLJJJ;
    public int LLJJJIL;
    public PatchConfig LLJJJJ;
    public int LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final int LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public C662760Pz8 LLJLIL;
    public Integer LLJLILLLLZIIL;
    public final C0SZT<C0SMO<?, ?>, InterfaceC1587906Jp> LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final SparseIntArray LLJZIJLIL;
    public final C645190PSj LLL;

    @Override // X.InterfaceC652950PjJ
    public final void LJLJJI() {
    }

    @Override // X.C0PFE
    public String LLIIJLIL() {
        return "";
    }

    public RecyclerView.ViewHolder LLJJIII(ViewGroup viewGroup, Class<?> cls) {
        return null;
    }

    @Override // X.InterfaceC652950PjJ
    public final void LLLFF(Aweme aweme) {
    }

    public int LLLLLIL(int i) {
        return -1;
    }

    @Override // X.C0PAF
    public final int LJJJIL() {
        List<T> list = this.mmItems;
        if (list == 0) {
            return -1;
        }
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (LLLLLLLZIL((SearchMixFeed) it2.next())) {
                if (i != -1) {
                    return i + LLLLILI();
                }
                return -1;
            }
            i++;
        }
        return -1;
    }

    @Override // X.C0PAF
    public final int LJJJJIZL() {
        DynamicPatch dynamicPatch;
        List<T> list = this.mmItems;
        int i = -1;
        if (list != 0) {
            int i2 = 0;
            for (T t : list) {
                DynamicPatch dynamicPatch2 = t.getDynamicPatch();
                if ((dynamicPatch2 != null && dynamicPatch2.getOriginType() == 74) || ((dynamicPatch = t.getDynamicPatch()) != null && dynamicPatch.getOriginType() == 40)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        return i + LLLLILI();
    }

    @Override // X.C0PAF
    public final int LLILL() {
        List<T> list = this.mmItems;
        int i = -1;
        if (list != 0) {
            Iterator it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((SearchMixFeed) it2.next()).getDynamicPatch().getOriginType() == 72) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        return i + LLLLILI();
    }

    public final int LLLLII() {
        int i;
        DynamicPatch dynamicPatch;
        List<T> list = this.mmItems;
        if (list != 0) {
            i = 0;
            for (T t : list) {
                C649470Pdh c649470Pdh = C649470Pdh.LIZ;
                String str = (t == null || (dynamicPatch = t.getDynamicPatch()) == null) ? null : dynamicPatch.schema;
                c649470Pdh.getClass();
                if (C649470Pdh.LJIIZILJ(str)) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            i = -1;
        }
        return i + LLLLILI();
    }

    public final int LLLLILI() {
        Function0<Integer> function0 = this.LLJI;
        if (function0 != null) {
            return function0.invoke().intValue();
        }
        return 0;
    }

    public final boolean LLLLLJLJLL() {
        C0PFN c0pfn;
        C0PFN c0pfn2;
        List<T> list = this.mmItems;
        if (list == 0) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            InterfaceC594520NTm interfaceC594520NTm = (SearchMixFeed) next;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C0PU4.class);
            boolean z = interfaceC594520NTm instanceof C0PFN;
            InterfaceC594520NTm interfaceC594520NTmLIZ = (!z || (c0pfn2 = (C0PFN) interfaceC594520NTm) == null) ? null : c0pfn2.LIZ();
            if (!c19719912DlLIZ.LIZIZ(interfaceC594520NTmLIZ) || interfaceC594520NTmLIZ == null) {
                if (C1300150jwD.LIZIZ(C1202104n5.LIZ().LJJIJIL(), (!z || (c0pfn = (C0PFN) interfaceC594520NTm) == null) ? null : c0pfn.LIZ()) != null) {
                }
            }
            return next != null;
        }
        return false;
    }

    public final boolean LLLLLLIL() {
        return this.LL instanceof C0PPX;
    }

    public final void LLLLZI() {
        List<Aweme> fullAwemeList;
        List<Aweme> awemeList;
        List<T> list = this.mmItems;
        if (list != 0) {
            for (T t : list) {
                if (t.getAweme() != null) {
                    AwemeBizExtKt.setSubAweme(t.getAweme(), (Aweme) null);
                }
                DynamicPatch dynamicPatch = t.getDynamicPatch();
                if (dynamicPatch != null && (awemeList = dynamicPatch.getAwemeList()) != null) {
                    for (Aweme aweme : awemeList) {
                        if (aweme != null) {
                            AwemeBizExtKt.setSubAweme(aweme, (Aweme) null);
                        }
                    }
                }
                List<SearchUser> users = t.getUsers();
                if (users != null) {
                    for (SearchUser searchUser : users) {
                        if (searchUser != null && (fullAwemeList = searchUser.getFullAwemeList()) != null) {
                            for (Aweme aweme2 : fullAwemeList) {
                                if (aweme2 != null) {
                                    AwemeBizExtKt.setSubAweme(aweme2, (Aweme) null);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean LLLLZLLLI() {
        SearchTopFragmentAbility searchTopFragmentAbility;
        return ((Boolean) C284440BCw.LIZ.getValue()).booleanValue() && (searchTopFragmentAbility = (SearchTopFragmentAbility) this.LLJZ.getValue()) != null && searchTopFragmentAbility.vp1();
    }

    public final void onDestroy() {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("PreLayout", "destroy by SearchJediMixFeedAdapter");
        C647500PaW c647500PaW = C647500PaW.LIZ;
        Fragment fragment = this.LLILZIL;
        c647500PaW.getClass();
        C647500PaW.LJ(fragment);
        C645190PSj c645190PSj = this.LLL;
        c645190PSj.getClass();
        try {
            if (!((ExecutorService) c645190PSj.LIZJ.getValue()).isShutdown()) {
                ((ExecutorService) c645190PSj.LIZJ.getValue()).shutdownNow();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C645250PSp c645250PSp = c645190PSj.LIZLLL;
        if (c645250PSp != null) {
            try {
                if (!c645250PSp.LIZIZ.isShutdown()) {
                    c645250PSp.LIZIZ.shutdownNow();
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        C0PTR<T> c0ptr = c645190PSj.LJ;
        if (c0ptr != 0) {
            try {
                if (!c0ptr.LIZJ.isShutdown()) {
                    c0ptr.LIZJ.shutdownNow();
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            C645490PTn.LJ.getClass();
            c0ptr.LIZIZ.removeOnScrollListener(c0ptr.LJIIL);
        }
    }

    public final void LLLLLZIL() {
        final String str;
        List<T> list;
        int i = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLJILJILJ;
        C645760PUo.LIZ.getClass();
        if (C645760PUo.LIZ().enablePredictLynxRuntimeWhenValid && i == 4 && (list = this.mmItems) != 0) {
            C647500PaW c647500PaW = C647500PaW.LIZ;
            Fragment fragment = this.LLILZIL;
            c647500PaW.getClass();
            C647500PaW.LJJIJIIJI(fragment, list);
        }
        List<T> list2 = this.mmItems;
        if (list2 != 0) {
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
                if (dynamicPatch != null && (str = dynamicPatch.schema) != null) {
                    if (C301150BrF.LIZ() == 1) {
                        SAFHelper sAFHelper = SAFHelper.LIZ;
                        Fragment fragment2 = this.LLILZIL;
                        Context context = fragment2.getContext();
                        C19EG c19egLIZIZ = context != null ? C1388190mED.LIZIZ(context) : null;
                        sAFHelper.getClass();
                        Context contextLJII = SAFHelper.LJII(fragment2, c19egLIZIZ);
                        C647500PaW.LIZ.getClass();
                        C647500PaW.LJJ(contextLJII, str);
                    }
                    if (i == 0) {
                        ((Set) C644670PQj.LIZ.getValue()).add(str);
                    }
                    int basicItemViewType = getBasicItemViewType(i2);
                    if (basicItemViewType == 15 || C649470Pdh.LJJII(basicItemViewType) || C651830PhV.LJ(basicItemViewType) || C651830PhV.LJI(Integer.valueOf(basicItemViewType)) || basicItemViewType == 16) {
                        C647500PaW c647500PaW2 = C647500PaW.LIZ;
                        c647500PaW2.getClass();
                        if (C647500PaW.LJIIZILJ(str) && !((Set) C644670PQj.LIZ.getValue()).contains(str)) {
                            C0PAT.LIZ.getClass();
                            Map mapLLLLIILL = C0PAT.LJFF().enablePraLayoutWithCommonParams == 1 ? LLLLIILL(i2, searchMixFeed) : null;
                            Context context2 = this.LL.getContext();
                            Fragment fragment3 = this.LLILZIL;
                            DynamicPatch dynamicPatch2 = searchMixFeed.getDynamicPatch();
                            C647500PaW.LJJIFFI(c647500PaW2, context2, fragment3, str, dynamicPatch2 != null ? dynamicPatch2.getRawData() : null, mapLLLLIILL, true, C0PGG.FINAL_RAW_DATA, null, null, false, 896);
                            return;
                        }
                        if (C647500PaW.LJIJ(str) || C647500PaW.LJIJJ(str) || C647630Paj.LJIIIIZZ(str)) {
                            return;
                        }
                        if (C647690Pap.LIZJ() && searchMixFeed.lynxSSRInfo != null) {
                            return;
                        }
                        C1537480q70 c1537480q70 = new C1537480q70();
                        if (C07H4.LIZ()) {
                            c1537480q70.coroutineScope = LifecycleOwnerKt.getLifecycleScope(this.LLILZIL);
                        }
                        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                        builderBuildUpon.appendQueryParameter("enable_memory_cache", "1");
                        String string = builderBuildUpon.toString();
                        c1537480q70.LJJIIZ(string);
                        C1537830q7Z c1537830q7Z = new C1537830q7Z(UriProtector.parse(string), c1537480q70);
                        c1537830q7Z.LJIJJLI = new C1537260q6e() { // from class: X.0PTk
                            @Override // X.C1537260q6e
                            public final void LIZIZ(Map<String, ? extends Object> map) {
                                Map mapLJ;
                                Object obj2 = map.get("clippedData");
                                if (!(obj2 instanceof Map) || (mapLJ = (Map) obj2) == null) {
                                    mapLJ = C2097608Jq.LJ();
                                }
                                C647610Pah.LIZJ(str, mapLJ);
                            }
                        };
                        c1537480q70.hybridParams = c1537830q7Z;
                        if (C271380AkK.LIZ()) {
                            C0PAT.LIZ.getClass();
                            if (C0PAT.LIZIZ()) {
                                C1538140q84.LIZ.getClass();
                                InterfaceC497601wk interfaceC497601wk = c1537480q70.coroutineScope;
                                if (interfaceC497601wk == null) {
                                    interfaceC497601wk = C817503Hh.LL;
                                }
                                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C373601ck(c1537480q70, null), 3);
                            } else {
                                C1536840q5y.LIZIZ(c1537480q70, null, null, true, null, 52);
                            }
                        } else if (C271380AkK.LIZIZ()) {
                            C0PAT.LIZ.getClass();
                            if (C0PAT.LIZIZ()) {
                                C1538140q84.LIZ.getClass();
                                InterfaceC497601wk interfaceC497601wk2 = c1537480q70.coroutineScope;
                                if (interfaceC497601wk2 == null) {
                                    interfaceC497601wk2 = C817503Hh.LL;
                                }
                                C23250099c.LIZLLL(interfaceC497601wk2, null, null, new C373501cj(c1537480q70, null), 3);
                            } else {
                                C1536650q5f.LIZ(c1537480q70.LJIJI(), c1537480q70, C1545460qJs.LIZ(str), 5);
                            }
                        }
                    }
                }
                i2 = i3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final void LLLLZ() {
        List<T> list;
        String str;
        Map<String, Object> mapLIZ = C649800PeE.LIZ();
        boolean zLIZ = C284200BBy.LIZ();
        if (((!mapLIZ.isEmpty()) || zLIZ) && (list = this.mmItems) != 0) {
            ?? r1 = 0;
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
                if (dynamicPatch != null && (str = dynamicPatch.schema) != null && !C651850PhX.LIZ(searchMixFeed.getDynamicPatch())) {
                    List<String> list2 = C651840PhW.LIZ;
                    if (!C651840PhW.LIZ(searchMixFeed.getDynamicPatch().schema) && a0.LJJJ(str, "__schema_processed__", r1, r1, 6) == -1) {
                        Uri uri = UriProtector.parse(str);
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                        }
                        if (C293060BeC.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                            DynamicPatch dynamicPatch2 = searchMixFeed.getDynamicPatch();
                            Uri.Builder builderBuildUpon = uri.buildUpon();
                            if (!mapLIZ.isEmpty()) {
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "disable_default_params");
                                boolean z = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) == 1;
                                Object obj2 = mapLIZ.get("search_general");
                                Map map = obj2 instanceof Map ? (Map) obj2 : null;
                                if (!z && map != null) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        String strValueOf = String.valueOf(entry.getKey());
                                        String strValueOf2 = String.valueOf(entry.getValue());
                                        if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, strValueOf) == null) {
                                            builderBuildUpon.appendQueryParameter(strValueOf, strValueOf2);
                                        }
                                    }
                                }
                            }
                            if (zLIZ) {
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "disable_biz_container");
                                String strLJ = C649470Pdh.LJ(str);
                                boolean z2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3) == 1;
                                if ((C0CCG.LIZ().contains(strLJ) || C284200BBy.LIZ()) && !z2 && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "target_handler") == null) {
                                    builderBuildUpon.appendQueryParameter("target_handler", "search_general");
                                }
                            }
                            builderBuildUpon.appendQueryParameter("__schema_processed__", "1");
                            dynamicPatch2.schema = builderBuildUpon.toString();
                        }
                    }
                }
                i = i2;
                r1 = 0;
            }
        }
    }

    @Override // X.AbstractC683590Qrd
    public final void clearData() {
        if (C1822507Bv.LIZ() && !Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C664410Q4h.LIZIZ(C0Q45.COMMON, EnumC665990QAj.CONTAINER, new IllegalAccessException(), "SearchJediMixFeedAdapter.clearData", C2097608Jq.LJ(), C2097608Jq.LJ(), "search");
        }
        super.clearData();
    }

    @Override // X.AbstractC683510QrV, X.AbstractC438050HFr, X.AbstractC21673619ry
    public final int getItemCount() {
        return super.getItemCount();
    }

    public static final View LLLLLJIL(ViewGroup viewGroup) {
        int i;
        if (C0PT9.LIZ()) {
            i = R.layout.f48;
        } else {
            i = R.layout.f47;
        }
        C645030PRt.LIZ.getClass();
        if (C645030PRt.LIZ().enableVideoLayoutPreInflate) {
            C650520PfO.LIZ.getClass();
            return C650520PfO.LIZ(i, viewGroup);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
    }

    public static boolean LLLLLLLZIL(SearchMixFeed searchMixFeed) {
        C649470Pdh.LIZ.getClass();
        return C649470Pdh.LJIL(searchMixFeed);
    }

    @Override // X.C0PFE
    public RecyclerView.ViewHolder LJJIL(ViewGroup viewGroup) {
        Object c098200Yq;
        Object c098200Yq2;
        String str = "visual_search";
        Object obj = null;
        if (C0C1A.LIZ()) {
            Fragment fragmentLIZ = C946803n0.LIZ(viewGroup);
            if (fragmentLIZ == null || fragmentLIZ.getActivity() == null) {
                return null;
            }
            View viewLLLLLJIL = LLLLLJIL(viewGroup);
            if (!(fragmentLIZ instanceof InterfaceC645440PTi)) {
                str = "general_search";
            }
            try {
                c098200Yq2 = (SearchVideoHolder) new AwS78S1300000_10(viewLLLLLJIL, this, fragmentLIZ, str, 4).invoke();
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) == null) {
                obj = c098200Yq2;
            }
            return (RecyclerView.ViewHolder) obj;
        }
        Fragment fragmentLIZ2 = C946803n0.LIZ(viewGroup);
        if (fragmentLIZ2 == null || fragmentLIZ2.getActivity() == null) {
            return null;
        }
        View viewLLLLLJIL2 = LLLLLJIL(viewGroup);
        if (!(fragmentLIZ2 instanceof InterfaceC645440PTi)) {
            str = "general_search";
        }
        try {
            c098200Yq = (SearchVideoHolder) new AwS78S1300000_10(viewLLLLLJIL2, this, fragmentLIZ2, str, 3).invoke();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            obj = c098200Yq;
        }
        return (RecyclerView.ViewHolder) obj;
    }

    @Override // X.C0PFE
    public RecyclerView.ViewHolder LJJJJ(ViewGroup viewGroup) {
        Object obj;
        int i;
        C661460Px2 c661460Px2U6;
        try {
            if (C0PT9.LIZ()) {
                i = R.layout.f2a;
            } else {
                i = R.layout.f2_;
            }
            C650520PfO.LIZ.getClass();
            View viewLIZ = C650520PfO.LIZ(i, viewGroup);
            Fragment fragmentLIZ = C946803n0.LIZ(viewGroup);
            SearchPhotoHolder searchPhotoHolder = new SearchPhotoHolder(viewLIZ, this.LLILLL, this.LLJLL, fragmentLIZ, new AwS554S0100000_10(fragmentLIZ, 1066));
            InterfaceC641090PCp interfaceC641090PCp = this.LLILLJJLI;
            searchPhotoHolder.LLLF = interfaceC641090PCp;
            if (interfaceC641090PCp != null && (c661460Px2U6 = searchPhotoHolder.u6()) != null) {
                c661460Px2U6.setContainerStatusProvider(interfaceC641090PCp);
            }
            C189200o6.m2constructorimpl(searchPhotoHolder);
            obj = searchPhotoHolder;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        Object obj2 = obj;
        if (thM5exceptionOrNullimpl != null) {
            obj2 = null;
        }
        return (RecyclerView.ViewHolder) obj2;
    }

    @Override // X.C0PAF
    public final Integer LJJJJZI(int i) {
        List<T> list;
        List<T> list2;
        List<T> list3;
        SearchMixFeedBase searchMixFeedBase;
        SingleLive singleLive;
        Aweme aweme;
        SearchMixFeed searchMixFeed;
        SearchPreciseAd preciseAd;
        List<Aweme> list4;
        Aweme aweme2;
        C0PLT c0plt;
        Aweme aweme3;
        List<T> list5 = this.mmItems;
        if (list5 != 0) {
            Iterator it2 = list5.iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (((SearchMixFeed) it2.next()).retrieveIncrementalId() == i) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (numValueOf.intValue() >= 0 && (((list = this.mmItems) != 0 && (c0plt = (C0PLT) C13LP.LJJJLZIJ(numValueOf.intValue(), list)) != null && (aweme3 = c0plt.getAweme()) != null && aweme3.isAd()) || (((list2 = this.mmItems) != 0 && (searchMixFeed = (SearchMixFeed) C13LP.LJJJLZIJ(numValueOf.intValue(), list2)) != null && (preciseAd = searchMixFeed.getPreciseAd()) != null && (list4 = preciseAd.awemeCards) != null && (aweme2 = (Aweme) C13LP.LJJJLL(list4)) != null && aweme2.isAd()) || ((list3 = this.mmItems) != 0 && (searchMixFeedBase = (SearchMixFeedBase) C13LP.LJJJLZIJ(numValueOf.intValue(), list3)) != null && (singleLive = searchMixFeedBase.singleLive) != null && (aweme = singleLive.aweme) != null && aweme.isAd())))) {
                return Integer.valueOf(numValueOf.intValue() + LLLLILI());
            }
        }
        return null;
    }

    @Override // X.C0PAF
    public final int LJJJLZIJ(Aweme aweme) {
        String uniqueId;
        List<SearchUser> users;
        SearchUser searchUser;
        List<Aweme> fullAwemeList;
        String aid;
        String aid2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("findUserCardPositionByContainsAweme: uniqueId: ");
        if (aweme != null) {
            uniqueId = AwemeSaaSExtKt.getUniqueId(aweme);
        } else {
            uniqueId = null;
        }
        sbLIZ.append(uniqueId);
        C2188811AlT.LIZIZ(sbLIZ);
        List<T> list = this.mmItems;
        if (list != 0) {
            int i = 0;
            loop0: for (T t : list) {
                if (t.getFeedType() == 65458 && (users = t.getUsers()) != null && (searchUser = (SearchUser) C13LP.LJJJLL(users)) != null) {
                    List<Aweme> list2 = searchUser.awemeCards;
                    if (list2 != null && !list2.isEmpty()) {
                        Iterator<Aweme> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            String aid3 = it2.next().getAid();
                            if (aweme != null) {
                                aid2 = aweme.getAid();
                            } else {
                                aid2 = null;
                            }
                            if (Intrinsics.LJFF(aid3, aid2)) {
                                break loop0;
                            }
                        }
                        fullAwemeList = searchUser.getFullAwemeList();
                        if (fullAwemeList != null) {
                            continue;
                        }
                    } else {
                        fullAwemeList = searchUser.getFullAwemeList();
                        if (fullAwemeList != null && !fullAwemeList.isEmpty()) {
                            Iterator<Aweme> it3 = fullAwemeList.iterator();
                            while (it3.hasNext()) {
                                String aid4 = it3.next().getAid();
                                if (aweme != null) {
                                    aid = aweme.getAid();
                                } else {
                                    aid = null;
                                }
                                if (Intrinsics.LJFF(aid4, aid)) {
                                    if (i >= 0) {
                                        return i + LLLLILI();
                                    }
                                }
                            }
                        }
                    }
                }
                i++;
            }
        }
        return -1;
    }

    @Override // X.C0PTY
    public boolean LJJLIIIIJ(int i) {
        List<T> list;
        if (i < 0 || (list = this.mmItems) == 0 || i >= list.size()) {
            return false;
        }
        return true;
    }

    @Override // X.C0PAF
    public final int LJLLILLLL(int i) {
        Boolean boolValueOf;
        Aweme aweme;
        C0PHI<T> config;
        C642240PHa c642240PHaLJFF;
        List<T> list = this.mmItems;
        int i2 = -1;
        if (list == 0) {
            return -1;
        }
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (((SearchMixFeed) it2.next()).retrieveIncrementalId() == i) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i3);
        if (numValueOf == null || numValueOf.intValue() < 0) {
            return -1;
        }
        List<T> list2 = this.mmItems;
        if (list2 != 0) {
            int size = list2.size();
            for (int iIntValue = numValueOf.intValue(); iIntValue < size; iIntValue++) {
                SearchMixFeedBase searchMixFeedBase = (SearchMixFeedBase) C13LP.LJJJLZIJ(iIntValue, list2);
                if (searchMixFeedBase == null) {
                    break;
                }
                ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLJFF = C0PH8.LJFF(searchMixFeedBase, C0NMY.GENERAL_SEARCH, C651290Pgd.LIZLLL(), true);
                if (iSearchCardProtocolLJFF != null && (config = iSearchCardProtocolLJFF.getConfig()) != 0 && (c642240PHaLJFF = config.LJFF()) != null) {
                    boolValueOf = Boolean.valueOf(c642240PHaLJFF.LJII);
                } else {
                    boolValueOf = null;
                }
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) || (searchMixFeedBase.getFeedType() == 65280 && (aweme = searchMixFeedBase.getAweme()) != null && !aweme.isAd())) {
                    i2 = iIntValue;
                    break;
                }
            }
        }
        return i2 + LLLLILI();
    }

    @Override // X.C0PAF
    public final Pair<Aweme, Integer> LJLLLLLL(String str) {
        String aid;
        Aweme next;
        String aid2;
        Aweme aweme;
        Aweme aweme2;
        List<Aweme> awemeList;
        List<T> list = this.mmItems;
        if (list != 0) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                    Aweme aweme3 = searchMixFeed.getAweme();
                    if (aweme3 != null) {
                        aid = aweme3.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid, str)) {
                        return new Pair<>(searchMixFeed.getAweme(), Integer.valueOf(i + LLLLILI()));
                    }
                    DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
                    if (dynamicPatch != null && (awemeList = dynamicPatch.getAwemeList()) != null) {
                        Iterator<Aweme> it2 = awemeList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(next.getAid(), str)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                    } else {
                        next = null;
                    }
                    SingleLive singleLive = searchMixFeed.singleLive;
                    if (singleLive != null && (aweme2 = singleLive.aweme) != null) {
                        aid2 = aweme2.getAid();
                    } else {
                        aid2 = null;
                    }
                    if (Intrinsics.LJFF(aid2, str)) {
                        SingleLive singleLive2 = searchMixFeed.singleLive;
                        if (singleLive2 != null && (aweme = singleLive2.aweme) != null) {
                            return new Pair<>(aweme, Integer.valueOf(i + LLLLILI()));
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (next != null) {
                        return new Pair<>(next, Integer.valueOf(i + LLLLILI()));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // X.C0PAF
    public final Integer LLFFF(int i) {
        List<T> list = this.mmItems;
        if (list == 0) {
            return null;
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (((SearchMixFeed) it2.next()).retrieveIncrementalId() == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() < 0) {
            return null;
        }
        return Integer.valueOf(numValueOf.intValue() + LLLLILI());
    }

    @Override // X.C0PFE
    public final C653840Pkk LLIFFJFJJ(ViewGroup viewGroup) {
        int i = C653840Pkk.LLJJI;
        Fragment fragment = this.LLILZIL;
        C650520PfO.LIZ.getClass();
        return new C653840Pkk(fragment, C650520PfO.LIZ(R.layout.f1h, viewGroup), viewGroup.getContext(), fragment);
    }

    @Override // X.C0PFE
    public final ViewOnAttachStateChangeListenerC648030PbN LLILII(ViewGroup viewGroup) {
        int i = ViewOnAttachStateChangeListenerC648030PbN.LLJLILLLLZIIL;
        return C645690PUh.LIZ(C946803n0.LIZ(this.LL), viewGroup, null);
    }

    public final Map<String, Object> LLLFZ(SearchMixFeed searchMixFeed) {
        ITopLiveProductViewProvider iTopLiveProductViewProviderLJJI;
        Boolean hasEcomIntent;
        GlobalDoodleConfig globalDoodleConfig = this.LLJILJILJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IEcomGeneralSearchService iEcomGeneralSearchServiceLIZ = C1202104n5.LIZ();
        if (iEcomGeneralSearchServiceLIZ != null && (iTopLiveProductViewProviderLJJI = iEcomGeneralSearchServiceLIZ.LJJI()) != null) {
            String str = searchMixFeed.getDynamicPatch().schema;
            if (globalDoodleConfig != null) {
                hasEcomIntent = globalDoodleConfig.getHasEcomIntent();
            } else {
                hasEcomIntent = null;
            }
            Map<String, Object> ecomParams = iTopLiveProductViewProviderLJJI.getEcomParams(str, hasEcomIntent, linkedHashMap);
            if (ecomParams != null) {
                return ecomParams;
            }
        }
        return linkedHashMap;
    }

    public final Integer LLLJ(String str) {
        List<String> list = this.LLJJ;
        if (list == null) {
            return null;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (TextUtils.equals(str, (String) it2.next())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        if (numValueOf.intValue() == -1) {
            return null;
        }
        return Integer.valueOf(iIntValue);
    }

    public final int LLLJIL(String str) {
        String aid;
        List<T> list = this.mmItems;
        if (list == 0) {
            return -1;
        }
        int i = 0;
        for (T t : list) {
            if (t.isAweme()) {
                Aweme aweme = t.getAweme();
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (TextUtils.equals(str, aid)) {
                    if (i == -1) {
                        return -1;
                    }
                    return i + LLLLILI();
                }
            }
            i++;
        }
        return -1;
    }

    public final int LLLJL(Function1<? super SearchMixFeed, Boolean> function1) {
        int i;
        List<T> list = this.mmItems;
        if (list != 0) {
            Iterator it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (function1.invoke(it2.next()).booleanValue()) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            i = -1;
        }
        return i + LLLLILI();
    }

    public final Pair<Integer, Aweme> LLLL(String str) {
        SearchMixFeed searchMixFeed;
        List<Aweme> awemeList;
        List<T> list = this.mmItems;
        int i = -1;
        if (list != 0) {
            Iterator it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SearchMixFeed searchMixFeed2 = (SearchMixFeed) it2.next();
                C649470Pdh c649470Pdh = C649470Pdh.LIZ;
                String str2 = searchMixFeed2.getDynamicPatch().schema;
                c649470Pdh.getClass();
                if (C649470Pdh.LJIIZILJ(str2)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        if (i < 0) {
            return new Pair<>(-1, null);
        }
        List<T> list2 = this.mmItems;
        if (list2 != 0 && (searchMixFeed = (SearchMixFeed) C13LP.LJJJLZIJ(i, list2)) != null) {
            DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
            if (dynamicPatch != null && (awemeList = dynamicPatch.getAwemeList()) != null) {
                Iterator<Aweme> it3 = awemeList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Aweme next = it3.next();
                    if (Intrinsics.LJFF(next.getAid(), str)) {
                        if (next != null) {
                            return new Pair<>(Integer.valueOf(i + LLLLILI()), next);
                        }
                    }
                }
            }
            return new Pair<>(-1, null);
        }
        return new Pair<>(-1, null);
    }

    public final int LLLLIIIILLL(String str) {
        String aid;
        List<Aweme> awemeList;
        Aweme aweme;
        List<T> list = this.mmItems;
        if (list != 0) {
            int i = 0;
            for (T t : list) {
                if (t.getFeedType() == 65514) {
                    DynamicPatch dynamicPatch = t.getDynamicPatch();
                    if (dynamicPatch != null && (awemeList = dynamicPatch.getAwemeList()) != null && (aweme = (Aweme) C13LP.LJJJLL(awemeList)) != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid, str)) {
                        return i;
                    }
                }
                i++;
            }
        }
        return -1;
    }

    @Override // X.C0PTY
    /* JADX INFO: renamed from: LLLLIILLL, reason: merged with bridge method [inline-methods] */
    public SearchMixFeed LJJLIIIJJI(int i) {
        List<T> list = this.mmItems;
        if (list != 0) {
            return (SearchMixFeed) C13LP.LJJJLZIJ(i, list);
        }
        return null;
    }

    public final boolean LLLLJ(RecyclerView.ViewHolder viewHolder) {
        GridLayoutManager gridLayoutManager;
        RecyclerView.LayoutManager layoutManager = this.LL.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            gridLayoutManager = (GridLayoutManager) layoutManager;
        } else {
            gridLayoutManager = null;
        }
        if (gridLayoutManager == null) {
            return false;
        }
        if (gridLayoutManager.LLIZ.LJ(viewHolder.getBindingAdapterPosition(), gridLayoutManager.LLILLJJLI) != 0) {
            return false;
        }
        return true;
    }

    public final SearchMixFeed LLLLJI(int i) {
        List<T> list = this.mmItems;
        if (list != 0) {
            return (SearchMixFeed) C13LP.LJJJLZIJ(i - LLLLILI(), list);
        }
        return null;
    }

    public final int LLLLL(int i) {
        int iLIZ;
        Object c098200Yq;
        int iLJ;
        GridLayoutManager gridLayoutManager;
        AbstractC214823195h abstractC214823195h;
        GridLayoutManager gridLayoutManager2;
        RecyclerView.LayoutManager layoutManager = this.LL.getLayoutManager();
        Object obj = null;
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager2 = (GridLayoutManager) layoutManager) != null) {
            iLIZ = gridLayoutManager2.LLILLJJLI;
        } else {
            iLIZ = C1616640sAg.LIZ(null);
        }
        try {
            RecyclerView.LayoutManager layoutManager2 = this.LL.getLayoutManager();
            if ((layoutManager2 instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager2) != null && (abstractC214823195h = gridLayoutManager.LLIZ) != null) {
                iLJ = abstractC214823195h.LJ(i, iLIZ);
            } else {
                iLJ = -1;
            }
            c098200Yq = Integer.valueOf(iLJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJFF(thM5exceptionOrNullimpl, "Insert");
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("position", String.valueOf(i));
            c2344009Gk.LIZJ(super.getItemCount(), "size");
            c2344009Gk.LIZJ(LLLLILI(), "header_size");
            C20684815ws.LJIILLIIL("search_result_insert_outofbound", c2344009Gk.LIZ);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final boolean LLLLLL(int i) {
        List<T> list;
        if (i >= 0 && (list = this.mmItems) != 0 && i < list.size()) {
            return false;
        }
        return true;
    }

    public final boolean LLLLLLL(int i) {
        GridLayoutManager gridLayoutManager;
        AbstractC214823195h abstractC214823195h;
        RecyclerView.LayoutManager layoutManager = this.LL.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null && (abstractC214823195h = gridLayoutManager.LLIZ) != null && abstractC214823195h.LJFF(i) == 1) {
            if (!LLLLLLLLLL(i) && !LLLLLLLLLL(i + 1)) {
                return false;
            }
            return true;
        }
        return LLLLLLLLLL(i);
    }

    public final boolean LLLLLLLLL(SearchMixFeed searchMixFeed) {
        int iLIZ = C641590PEn.LIZ(searchMixFeed);
        Integer numValueOf = Integer.valueOf(LLLLLIL(iLIZ));
        if (numValueOf.intValue() > 0) {
            if (numValueOf.intValue() != 1) {
                return false;
            }
            return true;
        }
        if (!C0PLR.LIZIZ.contains(Integer.valueOf(searchMixFeed.getFeedType())) && iLIZ != 16 && !C651830PhV.LJI(Integer.valueOf(iLIZ))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LLLLLLLLLL(int i) {
        SearchMixFeed searchMixFeed;
        InterfaceC594520NTm interfaceC594520NTmLIZ;
        C0PFN c0pfn;
        C0PFN c0pfn2;
        List<T> list = this.mmItems;
        if (list == 0 || (searchMixFeed = (SearchMixFeed) C13LP.LJJJLZIJ(i - LLLLILI(), list)) == 0) {
            return false;
        }
        if (!C645860PUy.LJ(getBasicItemViewType(i - LLLLILI()), searchMixFeed) && (searchMixFeed.getFeedType() != 63 || !((Boolean) C1101404Sm.LIZ.getValue()).booleanValue())) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C0PU4.class);
            boolean z = searchMixFeed instanceof C0PFN;
            InterfaceC594520NTm interfaceC594520NTmLIZ2 = null;
            if (z && (c0pfn2 = (C0PFN) searchMixFeed) != null) {
                interfaceC594520NTmLIZ = c0pfn2.LIZ();
            } else {
                interfaceC594520NTmLIZ = null;
            }
            if (!c19719912DlLIZ.LIZIZ(interfaceC594520NTmLIZ) || interfaceC594520NTmLIZ == null) {
                C19719912Dl c19719912DlLJJIJIL = C1202104n5.LIZ().LJJIJIL();
                if (z && (c0pfn = (C0PFN) searchMixFeed) != null) {
                    interfaceC594520NTmLIZ2 = c0pfn.LIZ();
                }
                if (C1300150jwD.LIZIZ(c19719912DlLJJIJIL, interfaceC594520NTmLIZ2) == null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void LLLLZIL(SearchMixFeed searchMixFeed) {
        List<T> list;
        Object c098200Yq;
        if (searchMixFeed != null && (list = this.mmItems) != 0) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (((SearchMixFeed) it2.next()).getCardIndex() == searchMixFeed.getCardIndex()) {
                    if (i >= 0) {
                        try {
                            List<T> list2 = this.mmItems;
                            if (list2 != 0) {
                            }
                            notifyItemChanged(i);
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            C1AF0.LJ(thM5exceptionOrNullimpl);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZLL(java.util.List<? extends com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed> r12) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645130PSd.LLLLZLL(java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLLZLLIL(final List<SearchMixFeed> list) {
        Collection collection = this.mmItems;
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        final ArrayList arrayList = new ArrayList(collection);
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.0P79
            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                return true;
            }

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return list.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return arrayList.size();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                Integer numValueOf;
                SearchMixFeed searchMixFeed = (SearchMixFeed) C13LP.LJJJLZIJ(i, arrayList);
                SearchMixFeed searchMixFeed2 = (SearchMixFeed) C13LP.LJJJLZIJ(i2, list);
                Integer numValueOf2 = null;
                if (searchMixFeed != null) {
                    numValueOf = Integer.valueOf(searchMixFeed.retrieveIncrementalId());
                } else {
                    numValueOf = null;
                }
                if (searchMixFeed2 != null) {
                    numValueOf2 = Integer.valueOf(searchMixFeed2.retrieveIncrementalId());
                }
                return Intrinsics.LJFF(numValueOf, numValueOf2);
            }
        }, true);
        this.mmItems = list;
        c21341918fZLIZ.LIZIZ(new InterfaceC1891370zJn() { // from class: X.0PT1
            @Override // X.InterfaceC1891370zJn
            public final void LJZL(int i, int i2) {
                this.LL.notifyItemRangeInserted(i, i2);
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLI(int i, int i2) {
                this.LL.notifyItemMoved(i, i2);
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLIZLLLIL(int i, int i2) {
                this.LL.notifyItemRangeRemoved(i, i2);
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLJJJJJIL(int i, int i2, Object obj) {
                this.LL.notifyItemRangeChanged(i, i2, obj);
            }
        });
    }

    public final void LLLZIL(List<? extends SearchMixFeed> list) {
        String aid;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((C0PLT) obj).getFeedType() == 65280) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Aweme aweme = ((C0PLT) it2.next()).getAweme();
            if (aweme != null && (aid = aweme.getAid()) != null) {
                arrayList.add(aid);
            }
        }
        this.LLJJ = arrayList;
    }

    @Override // X.AbstractC438050HFr
    public int getBasicItemViewType(int i) {
        List<T> list;
        SearchMixFeed searchMixFeed;
        List<T> list2 = this.mmItems;
        if ((list2 != 0 && i >= list2.size()) || (list = this.mmItems) == 0 || (searchMixFeed = (SearchMixFeed) ListProtector.get(list, i)) == null) {
            return -1;
        }
        return C641590PEn.LIZ(searchMixFeed);
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        SearchResultParam searchResultParam;
        String keyword;
        SearchMixFeed searchMixFeed;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL;
        SearchMixFeed searchMixFeed2;
        viewHolder.getAbsoluteAdapterPosition();
        if (LLLLZLLLI()) {
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        this.LLL.getClass();
        C0PPS.LIZ(this.LL, new ARunnableS79S0200000_10(this, viewHolder, 73));
        if (C07ET.LIZ()) {
            Integer numValueOf = Integer.valueOf(viewHolder.getBindingAdapterPosition());
            if (numValueOf.intValue() >= 0) {
                int iIntValue = numValueOf.intValue();
                List<T> list = this.mmItems;
                if (list != 0 && (searchMixFeed2 = (SearchMixFeed) C13LP.LJJJLZIJ(iIntValue - LLLLILI(), list)) != null) {
                    C23250099c.LIZLLL((InterfaceC497601wk) C0PTD.LIZ.getValue(), null, null, new C0HCF(searchMixFeed2.retrieveIncrementalId(), null), 3);
                }
            }
        }
        if (C293510Bev.LIZ()) {
            Integer numValueOf2 = Integer.valueOf(viewHolder.getBindingAdapterPosition());
            if (numValueOf2.intValue() >= 0) {
                int iIntValue2 = numValueOf2.intValue();
                List<T> list2 = this.mmItems;
                if (list2 != 0 && (searchMixFeed = (SearchMixFeed) C13LP.LJJJLZIJ(iIntValue2 - LLLLILI(), list2)) != null && (interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL()) != null) {
                    interfaceC657510PqfLIZLLL.LJIILLIIL(searchMixFeed, this);
                }
            }
        }
        if ((viewHolder instanceof C683490QrT) && (searchResultParam = this.LLJIJIL) != null && (keyword = searchResultParam.getKeyword()) != null) {
            C0P59.LIZ(keyword).LJIIIIZZ = System.currentTimeMillis();
        }
        if (C291310BbN.LIZ() && (viewHolder instanceof SearchVideoHolder)) {
            ((SearchVideoHolder) viewHolder).onViewAttachedToWindow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        SearchResultParam searchResultParam;
        String keyword;
        super.onViewDetachedFromWindow(viewHolder);
        this.LLL.getClass();
        if (viewHolder instanceof InterfaceC645430PTh) {
            C645290PSt.LIZ((InterfaceC645430PTh) viewHolder);
        }
        if (viewHolder instanceof AbstractC1620180sGO) {
            ((AbstractC1620180sGO) viewHolder).LJLJJLL(false);
        }
        if ((viewHolder instanceof C683490QrT) && (searchResultParam = this.LLJIJIL) != null && (keyword = searchResultParam.getKeyword()) != null) {
            C639290P5r c639290P5rLIZ = C0P59.LIZ(keyword);
            System.currentTimeMillis();
            c639290P5rLIZ.getClass();
            c639290P5rLIZ.LJII = System.currentTimeMillis() - c639290P5rLIZ.LJIIIIZZ;
        }
        C660870Pw5.LIZJ(viewHolder.itemView);
        if (C291310BbN.LIZ() && (viewHolder instanceof SearchVideoHolder)) {
            ((SearchVideoHolder) viewHolder).onViewDetachedFromWindow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C0PTL c0ptl;
        SearchMixFeed searchMixFeed;
        C0PCB customContent;
        C0PTK c0ptk;
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof C0PTJ) {
            ((C0PTJ) viewHolder).LLIILZL();
        }
        if (viewHolder instanceof SearchVideoHolder) {
            ((SearchVideoHolder) viewHolder).wY0();
        }
        if (viewHolder instanceof SearchPhotoHolder) {
            ((SearchPhotoHolder) viewHolder).wY0();
        }
        if ((viewHolder instanceof C0PTL) && (searchMixFeed = (c0ptl = (C0PTL) viewHolder).LLJI) != null && (customContent = searchMixFeed.getCustomContent()) != null && customContent.fakeNullifyCardInfo != null && (c0ptk = c0ptl.LLIZ) != null) {
            c0ptk.LIZIZ(c0ptl.LLJI);
        }
        if (this.LLJZIJLIL.size() > 100) {
            this.LLJZIJLIL.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC683590Qrd
    public void setData(List<SearchMixFeed> list) {
        SearchAccurateOffsetGridLayoutManager searchAccurateOffsetGridLayoutManager;
        ArrayList arrayList;
        Forest forest;
        List<FullSongUrlStruct> preloadImages;
        String str;
        List<FullSongUrlStruct> preloadImages2;
        String str2;
        C0PT5 c0pt5;
        RecyclerView.LayoutManager layoutManager = this.LL.getLayoutManager();
        Class cls = null;
        Object[] objArr = 0;
        if (layoutManager instanceof SearchAccurateOffsetGridLayoutManager) {
            searchAccurateOffsetGridLayoutManager = (SearchAccurateOffsetGridLayoutManager) layoutManager;
        } else {
            searchAccurateOffsetGridLayoutManager = null;
        }
        if (searchAccurateOffsetGridLayoutManager != null) {
            searchAccurateOffsetGridLayoutManager.LLJILJILJ = false;
            searchAccurateOffsetGridLayoutManager.LLJILJIL = true;
        }
        this.LLJL = false;
        this.LLJJIJIL = 0;
        this.LLJJJ = "";
        this.LLL.LIZ();
        C645030PRt.LIZ.getClass();
        if (!C645030PRt.LIZ().enableUpdateAwemeOptimize) {
            this.LLJILJIL.LIZJ(list, new AObjectS112S0000000_9(2));
        }
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
            setShowFooter(false);
        }
        List<T> list2 = this.mmItems;
        if (arrayList.isEmpty() && C1822507Bv.LIZ() && !Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C664410Q4h.LIZIZ(C0Q45.COMMON, EnumC665990QAj.CONTAINER, new IllegalAccessException(), "SearchJediMixFeedAdapter.setData", C2097608Jq.LJ(), C2097608Jq.LJ(), "search");
        }
        this.mmItems = arrayList;
        if (list2 == 0 || list2.size() > arrayList.size()) {
            notifyDataSetChanged();
        } else {
            int i = 0;
            while (i < list2.size()) {
                SearchMixFeed searchMixFeed = (SearchMixFeed) ListProtector.get(list2, i);
                SearchMixFeed searchMixFeed2 = (SearchMixFeed) ListProtector.get(arrayList, i);
                if (!searchMixFeed.equals(searchMixFeed2) || (C07F4.LIZ() && searchMixFeed.retrieveIncrementalId() != searchMixFeed2.retrieveIncrementalId())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == 0) {
                notifyDataSetChanged();
            } else {
                int size = arrayList.size() - i;
                int size2 = list2.size() - i;
                if (size2 > 0) {
                    notifyItemRangeRemoved(i, size2);
                }
                if (size > 0) {
                    notifyItemRangeInserted(i, size);
                }
            }
            this.LL.scrollToPosition(0);
        }
        if (!SearchGeneralLoadMoreOptExperiment.LIZ() && (c0pt5 = this.LLJJIJIIJIL) != null) {
            c0pt5.LIZLLL = Integer.MIN_VALUE;
        }
        LLLLZ();
        LLLLLZIL();
        if (!C0BCI.LIZ()) {
            if (C1535630q41.LJJIII) {
                C1532680pzG.LIZ.getClass();
                C1532950pzh c1532950pzh = C1532680pzG.LJJ;
                List<T> list3 = this.mmItems;
                if (list3 != 0) {
                    int i2 = 0;
                    for (Object obj : list3) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            DynamicPatch dynamicPatch = ((SearchMixFeed) obj).getDynamicPatch();
                            if (dynamicPatch != null && (preloadImages2 = dynamicPatch.getPreloadImages()) != null) {
                                Iterator<FullSongUrlStruct> it2 = preloadImages2.iterator();
                                while (it2.hasNext()) {
                                    List<String> urlList = it2.next().getUrlList();
                                    if (urlList != null && (str2 = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
                                        RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_IMAGE, cls, 2, objArr == true ? 1 : 0);
                                        requestParamsX.source = "search-image-optimization";
                                        c1532950pzh.LIZJ(str2, requestParamsX, null);
                                    }
                                }
                            }
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    return;
                }
                return;
            }
            JSONArray jSONArray = C1533710q0v.LIZ;
            IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
            if (iResourceServiceXLIZIZ != null && (forest = iResourceServiceXLIZIZ.getForest()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("search-image-optimization");
                sbLIZ.append(C1017903yT.LIZ());
                C1533900q1E c1533900q1E = new C1533900q1E(forest, C2188811AlT.LIZIZ(sbLIZ), false, 4);
                List<T> list4 = this.mmItems;
                if (list4 != 0) {
                    int i4 = 0;
                    for (Object obj2 : list4) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            DynamicPatch dynamicPatch2 = ((SearchMixFeed) obj2).getDynamicPatch();
                            if (dynamicPatch2 != null && (preloadImages = dynamicPatch2.getPreloadImages()) != null) {
                                Iterator<FullSongUrlStruct> it3 = preloadImages.iterator();
                                while (it3.hasNext()) {
                                    List<String> urlList2 = it3.next().getUrlList();
                                    if (urlList2 != null && (str = (String) C13LP.LJJJLZIJ(0, urlList2)) != null) {
                                        RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_IMAGE);
                                        requestParams.enableMemoryCache = Boolean.TRUE;
                                        c1533900q1E.LJFF(str, requestParams, false, null);
                                    }
                                }
                            }
                            i4 = i5;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
        }
    }

    @Override // X.AbstractC683590Qrd
    public void setDataAfterLoadMore(List<SearchMixFeed> list) {
        SearchAccurateOffsetGridLayoutManager searchAccurateOffsetGridLayoutManager;
        RecyclerView.LayoutManager layoutManager = this.LL.getLayoutManager();
        if (layoutManager instanceof SearchAccurateOffsetGridLayoutManager) {
            searchAccurateOffsetGridLayoutManager = (SearchAccurateOffsetGridLayoutManager) layoutManager;
        } else {
            searchAccurateOffsetGridLayoutManager = null;
        }
        if (searchAccurateOffsetGridLayoutManager != null) {
            searchAccurateOffsetGridLayoutManager.LLJILJILJ = false;
            searchAccurateOffsetGridLayoutManager.LLJILJIL = true;
        }
        this.LLJILJIL.LIZJ(list, new AObjectS113S0000000_10(0));
        if ((list == null || list.isEmpty()) && C1822507Bv.LIZ() && !Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C664410Q4h.LIZIZ(C0Q45.COMMON, EnumC665990QAj.CONTAINER, new IllegalAccessException(), "SearchJediMixFeedAdapter.setDataAfterLoadMore", C2097608Jq.LJ(), C2097608Jq.LJ(), "search");
        }
        super.setDataAfterLoadMore(list);
    }

    public static void LLLZIIL(FollowStatus followStatus, User user) {
        if (user != null && Intrinsics.LJFF(followStatus.getUserId(), user.getUid())) {
            user.setFollowStatus(followStatus.getFollowStatus());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1 A[Catch: Exception -> 0x016a, all -> 0x01d2, TryCatch #1 {Exception -> 0x016a, blocks: (B:9:0x001a, B:11:0x002e, B:12:0x0030, B:14:0x0043, B:16:0x004d, B:18:0x0053, B:27:0x0083, B:29:0x0089, B:31:0x008f, B:46:0x00ac, B:70:0x00fb, B:72:0x010b, B:48:0x00b0, B:69:0x00f8, B:49:0x00b4, B:51:0x00b8, B:53:0x00bd, B:54:0x00c1, B:55:0x00c5, B:57:0x00c9, B:59:0x00ce, B:60:0x00dd, B:62:0x00e3, B:64:0x00e7, B:66:0x00ec, B:67:0x00f0, B:68:0x00f4, B:81:0x013b), top: B:124:0x001a, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJJJI(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645130PSd.LJJJJI(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.C0PFE
    public final DynamicViewHolder LJJL(int i, ViewGroup viewGroup) {
        String str = C651830PhV.LIZLLL.get(Integer.valueOf(i));
        if (str == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = DynamicViewHolder.LLJI;
        DynamicViewHolder dynamicViewHolderLIZ = C648180Pbc.LIZ(str, viewGroup);
        DynamicViewHolder.LLJ = System.currentTimeMillis() - jCurrentTimeMillis;
        return dynamicViewHolderLIZ;
    }

    public RecyclerView.ViewHolder LJLIIIL(int i, ViewGroup viewGroup) {
        int i2;
        String strLIZIZ;
        SearchContextAbilityImpl searchContextAbilityImpl;
        if (C649470Pdh.LJIJ(i) || C649470Pdh.LJJII(i) || i == 15 || i == 16 || C651830PhV.LJI(Integer.valueOf(i))) {
            C0PTE.LIZ.getClass();
            C0PTE.LIZIZ = true;
            C0PTE.LIZLLL = System.currentTimeMillis();
        }
        if (!C651830PhV.LJ(i) && !C651830PhV.LJI(Integer.valueOf(i))) {
            if (C649470Pdh.LJIJ(i)) {
                return this.LLJJIJI.LIZJ();
            }
            if (C647970PbH.LIZ() && C649470Pdh.LJJII(i)) {
                return this.LLJJIJI.LIZJ();
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 8) {
                                if (i != 10) {
                                    if (i != 11) {
                                        switch (i) {
                                            case 14:
                                                return this.LLJJIJI.LIZIZ();
                                            case 15:
                                                return this.LLJJIJI.LIZJ();
                                            case 16:
                                                return this.LLJJIJI.LIZJ();
                                            default:
                                                final View view = new View(viewGroup.getContext());
                                                return new RecyclerView.ViewHolder(view) { // from class: X.0PTG
                                                };
                                        }
                                    }
                                    if (C0BY7.LIZ()) {
                                        if (this.LLILZIL.getActivity() == null) {
                                            final View view2 = new View(viewGroup.getContext());
                                            return new RecyclerView.ViewHolder(view2) { // from class: X.0PTH
                                            };
                                        }
                                        int i3 = SearchLiveCollectionViewHolderAssemSupport.LLJZIJLIL;
                                        InterfaceC641090PCp interfaceC641090PCp = this.LLILLJJLI;
                                        C0SZT<C0SMO<?, ?>, InterfaceC1587906Jp> c0szt = this.LLJLL;
                                        Fragment fragment = this.LLILZIL;
                                        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 1086);
                                        C650520PfO.LIZ.getClass();
                                        View viewLIZ = C650520PfO.LIZ(R.layout.f19, viewGroup);
                                        if (C07DY.LIZ()) {
                                            searchContextAbilityImpl = C645110PSb.LIZIZ(viewLIZ, fragment);
                                        } else {
                                            searchContextAbilityImpl = new SearchContextAbilityImpl(121, viewLIZ, fragment, null, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0);
                                        }
                                        return new SearchLiveCollectionViewHolderAssemSupport(viewLIZ, interfaceC641090PCp, this, c0szt, fragment, awS554S0100000_10, fragment, searchContextAbilityImpl);
                                    }
                                    int i4 = C652310PiH.LLJL;
                                    InterfaceC641090PCp interfaceC641090PCp2 = this.LLILLJJLI;
                                    Fragment fragment2 = this.LLILZIL;
                                    C650520PfO.LIZ.getClass();
                                    C652310PiH c652310PiH = new C652310PiH(C650520PfO.LIZ(R.layout.f19, viewGroup), interfaceC641090PCp2, this, fragment2);
                                    C679340Qkm.LIZIZ((Fragment) c652310PiH.LLJ.getValue(), c652310PiH.L5()).get(SearchStateViewModel.class);
                                    return c652310PiH;
                                }
                                int i5 = C653070PjV.LLJJIII;
                                SearchResultParam searchResultParam = this.LLJIJIL;
                                InterfaceC641090PCp interfaceC641090PCp3 = this.LLILLJJLI;
                                C650520PfO.LIZ.getClass();
                                return new C653070PjV(searchResultParam, C650520PfO.LIZ(R.layout.f18, viewGroup), interfaceC641090PCp3, this);
                            }
                            return this.LLJJIJI.LIZJ();
                        }
                        int i6 = C663230Pzt.LLJILJIL;
                        C650520PfO.LIZ.getClass();
                        return new C663230Pzt(C650520PfO.LIZ(R.layout.ezu, viewGroup), viewGroup);
                    }
                    int i7 = C0PTL.LLJIJIL;
                    C0PC8 c0pc8NL2 = null;
                    SearchTopFragmentAbility searchTopFragmentAbility = (SearchTopFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.LL, null), SearchTopFragmentAbility.class, null);
                    if (searchTopFragmentAbility != null) {
                        c0pc8NL2 = searchTopFragmentAbility.nL2(this.LL);
                    }
                    C650520PfO.LIZ.getClass();
                    return new C0PTL(C650520PfO.LIZ(R.layout.f1i, viewGroup), c0pc8NL2);
                }
                C0PFA c0pfa = this.LLJJIJI;
                c0pfa.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                RecyclerView.ViewHolder viewHolderLIZIZ = c0pfa.LIZJ.LIZIZ();
                if (viewHolderLIZIZ == null) {
                    viewHolderLIZIZ = c0pfa.LIZJ.LIZ();
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (c0pfa.LIZIZ.LLIIJLIL().length() > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c0pfa.LIZIZ.LLIIJLIL());
                    sbLIZ.append("_viewholder");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = "viewholder";
                }
                C01V2.LIZ(i2, strLIZIZ, jCurrentTimeMillis2, "UserViewHolder");
                if (C07C9.LIZ()) {
                    if (viewHolderLIZIZ == null) {
                        return C0PFA.LIZ(c0pfa.LIZ);
                    }
                    return viewHolderLIZIZ;
                }
                if (viewHolderLIZIZ != null) {
                    return viewHolderLIZIZ;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            return this.LLJJIJI.LIZLLL();
        }
        C0PFA c0pfa2 = this.LLJJIJI;
        Map<Integer, C0PFI> map = c0pfa2.LJI;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get(numValueOf);
        Object obj2 = obj;
        if (obj == null) {
            C0PFC c0pfc = new C0PFC(c0pfa2, i);
            linkedHashMap.put(numValueOf, c0pfc);
            obj2 = c0pfc;
        }
        C0PFI c0pfi = (C0PFI) obj2;
        RecyclerView.ViewHolder viewHolderLIZIZ2 = c0pfi.LIZIZ();
        if (viewHolderLIZIZ2 == null) {
            viewHolderLIZIZ2 = c0pfi.LIZ();
        }
        if (C07C9.LIZ()) {
            if (viewHolderLIZIZ2 == null) {
                return C0PFA.LIZ(c0pfa2.LIZ);
            }
            return viewHolderLIZIZ2;
        }
        if (viewHolderLIZIZ2 != null) {
            return viewHolderLIZIZ2;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C0PTY
    public final boolean LLJJI(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return false;
        }
        return Intrinsics.LJFF(obj, obj2);
    }

    public final void LLLIL(RecyclerView.ViewHolder viewHolder, SearchMixFeed searchMixFeed) {
        C653840Pkk c653840Pkk;
        C644160POk.LIZ.getClass();
        C645280PSs c645280PSs = C644160POk.LIZIZ;
        if (c645280PSs != null) {
            c645280PSs.LIZIZ = System.currentTimeMillis();
        }
        C645280PSs c645280PSs2 = C644160POk.LIZIZ;
        if (c645280PSs2 != null) {
            c645280PSs2.LJII = 0;
        }
        HandlerHook.viewPost(viewHolder.itemView, new Runnable() { // from class: X.0PSn
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SearchJediMixFeedAdapter@86a9.bindUserCard$1");
                try {
                    C644160POk.LIZ.getClass();
                    C645280PSs c645280PSs3 = C644160POk.LIZIZ;
                    if (c645280PSs3 != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        c645280PSs3.LJIIJ = true;
                        C15O7.LJIIIIZZ(3000L).LIZLLL(new C645220PSm(c645280PSs3, jCurrentTimeMillis));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SearchJediMixFeedAdapter@86a9.bindUserCard$1");
            }
        });
        C645320PSw c645320PSw = new C645320PSw();
        c645320PSw.LLILLJJLI = searchMixFeed.getUsers();
        c645320PSw.LL = searchMixFeed.isHasTopUser();
        c645320PSw.LLILZLL = searchMixFeed.retrieveIncrementalId();
        String providerDocIdStr = searchMixFeed.getProviderDocIdStr();
        if (providerDocIdStr == null) {
            providerDocIdStr = String.valueOf(searchMixFeed.getDocId());
        }
        c645320PSw.LLILZIL = providerDocIdStr;
        c645320PSw.LLILLL = searchMixFeed.getCardTitle();
        c645320PSw.LLILZ = searchMixFeed.getSearchCardInfo();
        C0PLR.LIZIZ(searchMixFeed);
        if ((viewHolder instanceof C653840Pkk) && (c653840Pkk = (C653840Pkk) viewHolder) != null) {
            c653840Pkk.P5(c645320PSw, this.LLJIJIL, searchMixFeed.isShowViewMore(), C0PLR.LIZIZ(searchMixFeed));
        }
        C645280PSs c645280PSs3 = C644160POk.LIZIZ;
        if (c645280PSs3 != null && c645280PSs3.LIZIZ != 0) {
            c645280PSs3.LIZJ = System.currentTimeMillis() - c645280PSs3.LIZIZ;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0370 A[Catch: all -> 0x068f, Exception -> 0x0695, TRY_ENTER, TryCatch #29 {Exception -> 0x0695, all -> 0x068f, blocks: (B:58:0x014c, B:60:0x0150, B:68:0x016c, B:81:0x01b0, B:83:0x01b6, B:118:0x024d, B:119:0x0251, B:138:0x02c9, B:140:0x02d1, B:142:0x02e1, B:146:0x02f0, B:148:0x02f6, B:153:0x030a, B:155:0x030e, B:157:0x0312, B:159:0x031c, B:161:0x0320, B:162:0x032a, B:164:0x032e, B:172:0x0370, B:120:0x0255, B:122:0x0261, B:124:0x0266, B:126:0x0271, B:128:0x028e, B:130:0x0298, B:134:0x02a1, B:135:0x02a9, B:136:0x02b1, B:137:0x02b6, B:202:0x03e5, B:204:0x03eb, B:205:0x03f1, B:207:0x040e, B:209:0x0418, B:213:0x0421, B:224:0x0462, B:231:0x0478, B:233:0x0498, B:234:0x04a0, B:236:0x04c1, B:238:0x04c6, B:239:0x04cf, B:241:0x04ec, B:243:0x04f6, B:247:0x04ff, B:277:0x056b, B:281:0x057a, B:283:0x0580, B:288:0x0594, B:290:0x0598, B:292:0x059c, B:294:0x05a6, B:296:0x05aa, B:297:0x05b4, B:299:0x05b8, B:308:0x05d0, B:310:0x05d4, B:314:0x05e5, B:316:0x05f2), top: B:462:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05e5 A[Catch: all -> 0x068f, Exception -> 0x0695, TRY_ENTER, TRY_LEAVE, TryCatch #29 {Exception -> 0x0695, all -> 0x068f, blocks: (B:58:0x014c, B:60:0x0150, B:68:0x016c, B:81:0x01b0, B:83:0x01b6, B:118:0x024d, B:119:0x0251, B:138:0x02c9, B:140:0x02d1, B:142:0x02e1, B:146:0x02f0, B:148:0x02f6, B:153:0x030a, B:155:0x030e, B:157:0x0312, B:159:0x031c, B:161:0x0320, B:162:0x032a, B:164:0x032e, B:172:0x0370, B:120:0x0255, B:122:0x0261, B:124:0x0266, B:126:0x0271, B:128:0x028e, B:130:0x0298, B:134:0x02a1, B:135:0x02a9, B:136:0x02b1, B:137:0x02b6, B:202:0x03e5, B:204:0x03eb, B:205:0x03f1, B:207:0x040e, B:209:0x0418, B:213:0x0421, B:224:0x0462, B:231:0x0478, B:233:0x0498, B:234:0x04a0, B:236:0x04c1, B:238:0x04c6, B:239:0x04cf, B:241:0x04ec, B:243:0x04f6, B:247:0x04ff, B:277:0x056b, B:281:0x057a, B:283:0x0580, B:288:0x0594, B:290:0x0598, B:292:0x059c, B:294:0x05a6, B:296:0x05aa, B:297:0x05b4, B:299:0x05b8, B:308:0x05d0, B:310:0x05d4, B:314:0x05e5, B:316:0x05f2), top: B:462:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0601 A[Catch: all -> 0x0687, Exception -> 0x068b, TRY_ENTER, TRY_LEAVE, TryCatch #32 {Exception -> 0x068b, all -> 0x0687, blocks: (B:279:0x0570, B:286:0x058a, B:306:0x05c9, B:312:0x05dd, B:321:0x0601), top: B:456:0x0570 }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0654 A[Catch: all -> 0x0659, Exception -> 0x065c, TRY_ENTER, TRY_LEAVE, TryCatch #41 {Exception -> 0x065c, all -> 0x0659, blocks: (B:325:0x062b, B:329:0x0654), top: B:438:0x062b }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x062b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:483:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.List<T>] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r29v0, types: [X.0HFr, X.0PSd, X.0Qrd] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLILZLLLI(androidx.recyclerview.widget.RecyclerView.ViewHolder r30, int r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645130PSd.LLLILZLLLI(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public final Map LLLLIILL(int i, SearchMixFeed searchMixFeed) {
        SearchActivityCardBgData activityCardBg;
        String searchEnterFromPage;
        String str;
        int iIntValue;
        String strBu2;
        List<Map<?, ?>> awemeListRaw;
        List<Map<?, ?>> awemeMultiTabListRaw;
        Map<?, ?> aiHotspotCanvasRaw;
        List<Map<?, ?>> tabMapRaw;
        boolean z;
        int i2;
        SearchBackgroundConfig backgroundConfig;
        Integer num;
        C0Q2S c0q2sLIZJ;
        Integer num2;
        boolean z2;
        boolean z3;
        SearchMixFeed searchMixFeed2;
        String strLIZ;
        Map<?, ?> map;
        GlobalDoodleConfig globalDoodleConfig = this.LLJILJILJ;
        List<Aweme> awemeList = null;
        if (globalDoodleConfig != null) {
            activityCardBg = globalDoodleConfig.getActivityCardBg();
        } else {
            activityCardBg = null;
        }
        C653660PkS c653660PkSLLLLLLZ = LLLLLLZ(i, searchMixFeed);
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam = this.LLJIJIL;
        c644060POa.getClass();
        long j = C644060POa.LJII(searchResultParam).LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SearchResultParam searchResultParam2 = this.LLJIJIL;
        String str2 = "";
        if (searchResultParam2 == null || (searchEnterFromPage = searchResultParam2.getSearchEnterFromPage()) == null) {
            searchEnterFromPage = "";
        }
        linkedHashMap.put("enterFrom", searchEnterFromPage);
        linkedHashMap.put("current_uid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        linkedHashMap.put("searchId", c653660PkSLLLLLLZ.LJIIJ);
        linkedHashMap.put("keyword", c653660PkSLLLLLLZ.LJFF);
        linkedHashMap.put("start_search", Long.valueOf(j));
        EcomGeneralShowCaseCardConfig.ShowcaseModel showcaseModelLIZ = EcomGeneralShowCaseCardConfig.LIZ();
        if (showcaseModelLIZ == null || (str = showcaseModelLIZ.apiVersion) == null) {
            str = "1;1;1";
        }
        linkedHashMap.put("ecom_api_version", str);
        linkedHashMap.put("rank", Integer.valueOf(c653660PkSLLLLLLZ.LJIILL));
        Integer num3 = c653660PkSLLLLLLZ.LJIILLIIL;
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = -1;
        }
        linkedHashMap.put("universalRank", Integer.valueOf(iIntValue));
        int i3 = this.LLJJL;
        int i4 = this.LLJJJJLIIL;
        if (i3 != i4 && i4 != -1) {
            linkedHashMap.put("original_rank", Integer.valueOf(i4));
        }
        linkedHashMap.put("has_shop_tab", Integer.valueOf(C644560PPy.LJI().contains(EnumC669620QOi.SHOP.getTabName()) ? 1 : 0));
        C0PTB c0ptb = this.LLJJIII;
        if (c0ptb == null || (strBu2 = c0ptb.Bu2()) == null) {
            strBu2 = "";
        }
        linkedHashMap.put("image_url", strBu2);
        DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
        if (dynamicPatch == null || (awemeListRaw = dynamicPatch.getAwemeListRaw()) == null) {
            awemeListRaw = "";
        }
        linkedHashMap.put("aweme_list", awemeListRaw);
        DynamicPatch dynamicPatch2 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch2 == null || (awemeMultiTabListRaw = dynamicPatch2.getAwemeMultiTabListRaw()) == null) {
            awemeMultiTabListRaw = "";
        }
        linkedHashMap.put("aweme_multi_tab_list", awemeMultiTabListRaw);
        DynamicPatch dynamicPatch3 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch3 == null || (aiHotspotCanvasRaw = dynamicPatch3.getAiHotspotCanvasRaw()) == null) {
            aiHotspotCanvasRaw = "";
        }
        linkedHashMap.put("ai_hotspot_canvas", aiHotspotCanvasRaw);
        if (C04U3.LIZ() != 0) {
            linkedHashMap.put("ecom_search_redesign_products_card", Integer.valueOf(C04U3.LIZ()));
        }
        DynamicPatch dynamicPatch4 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch4 != null && (map = dynamicPatch4.extraInfo) != null) {
            linkedHashMap.put("extra_info", map);
        }
        linkedHashMap.put("cards_sound_control_type", Integer.valueOf(C07P0.LIZ()));
        linkedHashMap.put("tns_ban_type", c653660PkSLLLLLLZ.LJJI);
        DynamicPatch dynamicPatch5 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch5 == null || (tabMapRaw = dynamicPatch5.getTabMapRaw()) == null) {
            tabMapRaw = "";
        }
        linkedHashMap.put("tab_map", tabMapRaw);
        DynamicPatch dynamicPatch6 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch6 != null) {
            awemeList = dynamicPatch6.getAwemeList();
        }
        List<Integer> listLIZ = C486810J7f.LIZ(awemeList);
        if (listLIZ == null) {
            listLIZ = "";
        }
        linkedHashMap.put("isVertical", listLIZ);
        if (activityCardBg != null && (strLIZ = C640260P9k.LIZ(activityCardBg, i)) != null) {
            str2 = strLIZ;
        }
        linkedHashMap.put("activityBgColor", str2);
        List<T> list = this.mmItems;
        if (list != 0 && (searchMixFeed2 = (SearchMixFeed) C13LP.LJJJLZIJ(i - 1, list)) != null && C0PLR.LIZIZ(searchMixFeed2)) {
            z = true;
        } else {
            z = false;
        }
        linkedHashMap.put("isPreCardActivityCard", Boolean.valueOf(z));
        linkedHashMap.put("isDoubleColumn", Boolean.TRUE);
        if (C0BRN.LIZ()) {
            linkedHashMap.put("is_first_screen", "1");
        }
        C662670Pyz.LIZ.getClass();
        String strLIZ2 = C662670Pyz.LIZ();
        if (strLIZ2 != null) {
            linkedHashMap.put("endToEndSearchSessionId", strLIZ2);
        }
        if (C0PPZ.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refreshMobCanShowVM?.isCurRealShow() == ");
            SearchRefreshPredictMobCanShowVM searchRefreshPredictMobCanShowVM = (SearchRefreshPredictMobCanShowVM) this.LLJLLIL.getValue();
            if (searchRefreshPredictMobCanShowVM != null && searchRefreshPredictMobCanShowVM.a32()) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ.append(z2);
            C2188811AlT.LIZIZ(sbLIZ);
            SearchRefreshPredictMobCanShowVM searchRefreshPredictMobCanShowVM2 = (SearchRefreshPredictMobCanShowVM) this.LLJLLIL.getValue();
            if (searchRefreshPredictMobCanShowVM2 != null && searchRefreshPredictMobCanShowVM2.a32()) {
                z3 = true;
            } else {
                z3 = false;
            }
            linkedHashMap.put("visibleUnderPredict", Boolean.valueOf(z3));
        }
        linkedHashMap.putAll(LLLFZ(searchMixFeed));
        linkedHashMap.put(fe.e, -1);
        DynamicPatch dynamicPatch7 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch7 != null && Integer.valueOf(dynamicPatch7.getOriginType()) != null) {
            linkedHashMap.put("originType", Integer.valueOf(searchMixFeed.getDynamicPatch().getOriginType()));
        }
        DynamicPatch dynamicPatch8 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch8 != null && dynamicPatch8.getTokenType() != null) {
            linkedHashMap.put("tokenType", searchMixFeed.getDynamicPatch().getTokenType());
        }
        DynamicPatch dynamicPatch9 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch9 != null && dynamicPatch9.getNeedGeneralSearchVideos() != null) {
            linkedHashMap.put("needGeneralSearchVideos", searchMixFeed.getDynamicPatch().getNeedGeneralSearchVideos());
        }
        C0Q2P c0q2p = (C0Q2P) this.LLJLLL.getValue();
        if (c0q2p != null && (c0q2sLIZJ = c0q2p.LIZJ()) != null && (num2 = c0q2sLIZJ.LIZIZ) != null) {
            num2.intValue();
            i2 = 1;
        } else {
            i2 = 0;
        }
        linkedHashMap.put("search_has_correct", i2);
        if (globalDoodleConfig != null && (backgroundConfig = globalDoodleConfig.getBackgroundConfig()) != null && (num = backgroundConfig.disappearStrategy) != null) {
            linkedHashMap.put("search_background_strategy", Integer.valueOf(num.intValue()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLLIL(androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder
            if (r0 == 0) goto L19
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder r5 = (com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder) r5
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol<X.0NTm> r0 = r5.LLILZLL
            java.lang.String r0 = r0.Zm1()
            if (r0 != 0) goto L18
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol<X.0NTm> r0 = r5.LLILZLL
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L18:
            return r0
        L19:
            int r1 = r4.getBasicItemViewType(r6)
            boolean r0 = X.C649470Pdh.LJIJ(r1)
            if (r0 != 0) goto L4a
            r0 = 16
            if (r1 == r0) goto L4a
            r0 = 15
            if (r1 == r0) goto L4a
            r0 = 17
            if (r1 == r0) goto L4a
            boolean r0 = X.C649470Pdh.LJJII(r1)
            if (r0 != 0) goto L4a
            boolean r0 = X.C651830PhV.LJ(r1)
            if (r0 != 0) goto L4a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = X.C651830PhV.LJI(r0)
            if (r0 != 0) goto L4a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L4a:
            java.util.List<T> r0 = r4.mmItems
            r3 = 0
            if (r0 == 0) goto L8a
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r1 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r1
            if (r1 == 0) goto L8b
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r1.getDynamicPatch()
            if (r0 == 0) goto L8b
            java.lang.String r2 = r0.schema
        L5f:
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixCardProfile r0 = r1.getCardProfile()
            if (r0 == 0) goto L67
            java.lang.String r3 = r0.sceneType
        L67:
            boolean r1 = X.C123100dR.LIZ(r3)
            java.lang.String r0 = "lynx:"
            if (r1 == 0) goto L8f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = X.C649470Pdh.LJ(r2)
            r1.append(r0)
            r0 = 95
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            return r0
        L8a:
            r1 = r3
        L8b:
            r2 = r3
            if (r1 == 0) goto L67
            goto L5f
        L8f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = X.C649470Pdh.LJ(r2)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645130PSd.LLLLIL(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C653660PkS LLLLLLZ(int i, SearchMixFeed searchMixFeed) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int iLIZ;
        String value;
        GridLayoutManager gridLayoutManager;
        InterfaceC594520NTm interfaceC594520NTmLIZ;
        InterfaceC594520NTm interfaceC594520NTmLIZ2;
        C653660PkS c653660PkS;
        C0PFN c0pfn;
        C0PFN c0pfn2;
        int rank = i;
        if (C0PU8.LJFF()) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C0PU4.class);
            boolean z = searchMixFeed instanceof C0PFN;
            if (z && (c0pfn2 = (C0PFN) searchMixFeed) != null) {
                interfaceC594520NTmLIZ = c0pfn2.LIZ();
            } else {
                interfaceC594520NTmLIZ = null;
            }
            if (c19719912DlLIZ.LIZIZ(interfaceC594520NTmLIZ) && interfaceC594520NTmLIZ != null) {
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(C0PU4.class);
                if (z && (c0pfn = (C0PFN) searchMixFeed) != null) {
                    interfaceC594520NTmLIZ2 = c0pfn.LIZ();
                } else {
                    interfaceC594520NTmLIZ2 = null;
                }
                if (!c19719912DlLIZ2.LIZIZ(interfaceC594520NTmLIZ2)) {
                    interfaceC594520NTmLIZ2 = null;
                }
                C0PU4 c0pu4 = (C0PU4) interfaceC594520NTmLIZ2;
                if (c0pu4 != null && (c653660PkS = c0pu4.LLILLJJLI) != null) {
                    return c653660PkS;
                }
            }
        }
        InterfaceC649890PeN interfaceC649890PeNLIZ = C664290Q3v.LIZ();
        if (interfaceC649890PeNLIZ == null) {
            str = "normal";
            str2 = "normal";
            str3 = "";
            str4 = "";
        } else {
            str3 = interfaceC649890PeNLIZ.LIZJ().LIZ;
            str4 = interfaceC649890PeNLIZ.LIZJ().LIZIZ;
            interfaceC649890PeNLIZ.LJ();
            str2 = interfaceC649890PeNLIZ.LIZJ().LIZLLL;
            str = interfaceC649890PeNLIZ.LIZJ().LIZJ;
        }
        LogPbBean lobPb = searchMixFeed.getLobPb();
        if (lobPb == null) {
            lobPb = new LogPbBean();
        }
        String imprId = lobPb.getImprId();
        if (imprId == null) {
            imprId = "";
        }
        String strLJ = C584850Mwl.LIZ.LJ(imprId);
        if (searchMixFeed.isVisualSearchCard()) {
            str5 = "visual_search";
        } else {
            str5 = "general_search";
        }
        InterfaceC644470PPp.LIZ.getClass();
        String strLIZ = C644460PPo.LIZ(3);
        C0PTA.LIZ.getClass();
        String strLIZ2 = C645350PSz.LIZ(3);
        RecyclerView.LayoutManager layoutManager = this.LL.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            iLIZ = gridLayoutManager.LLILLJJLI;
        } else {
            iLIZ = C1616640sAg.LIZ(null);
        }
        if (searchMixFeed.getRank() >= 0) {
            rank = searchMixFeed.getRank();
        }
        C653660PkS c653660PkS2 = new C653660PkS();
        c653660PkS2.LJIIIIZZ = str5;
        c653660PkS2.LIZ = true;
        c653660PkS2.LJIIJ = str3;
        c653660PkS2.LJIIJJI = imprId;
        c653660PkS2.LJIILJJIL = strLJ;
        c653660PkS2.LJIILIIL = lobPb;
        c653660PkS2.LJIILL = rank;
        c653660PkS2.LJIILLIIL = searchMixFeed.universalRank;
        C0PL2 c0pl2 = searchMixFeed.insertType;
        if (c0pl2 != null) {
            value = c0pl2.getValue();
        } else {
            value = null;
        }
        c653660PkS2.LJIIZILJ = value;
        c653660PkS2.LJFF = str4;
        c653660PkS2.LIZJ = 3;
        c653660PkS2.LIZLLL = strLIZ;
        c653660PkS2.LJ = strLIZ2;
        c653660PkS2.LIZLLL(str);
        if (str2 != null) {
            c653660PkS2.LJJIFFI = str2;
        } else {
            c653660PkS2.LJJIFFI = "normal";
        }
        c653660PkS2.LJJJLL = iLIZ;
        c653660PkS2.LIZIZ = this.LL instanceof C0PPX;
        C0PRC c0prc = (C0PRC) C0Q3E.LIZIZ(this.LLILZIL).Ph1().LIZJ();
        if (searchMixFeed.isVisualSearchCard()) {
            c653660PkS2.LJIIIZ = c0prc.LLJLL;
            c653660PkS2.LJJJJLI = c0prc.LLLIIIIL;
            c653660PkS2.LJJIJL = c0prc.LLLIIL;
            c653660PkS2.LJJIJLIJ = c0prc.LLLIIIL;
        }
        c653660PkS2.LJJIJIIJIL = c0prc.LLLFZ;
        SearchCardInfo searchCardInfo = searchMixFeed.getSearchCardInfo();
        if (searchCardInfo != null) {
            String alasrc = searchCardInfo.getAlasrc();
            if (alasrc == null) {
                alasrc = "";
            }
            c653660PkS2.LJJLIIIJ = alasrc;
            String docId = searchCardInfo.getDocId();
            if (docId == null) {
                docId = "";
            }
            c653660PkS2.LJJLIIIJILLIZJL = docId;
            c653660PkS2.LJJLIIIJJIZ = searchCardInfo;
        }
        c653660PkS2.LJJLIIIJJI = searchMixFeed.retrieveIncrementalId();
        return c653660PkS2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLLLLLZZ(androidx.recyclerview.widget.RecyclerView r7, android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645130PSd.LLLLLLZZ(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):void");
    }

    public final void LLLLLZ(final C737030Svd c737030Svd, final boolean z) {
        final Aweme aweme;
        String str;
        String aid;
        String aid2;
        String aid3;
        final int iLLLLILI;
        Aweme aweme2;
        String aid4;
        HashMap<String, String> searchExtraParams;
        Object obj = c737030Svd.LIZIZ;
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        if (!C641200PDa.LIZIZ(aweme) && !C641200PDa.LIZJ(aweme)) {
            if (aweme != null && (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme)) != null) {
                str = searchExtraParams.get("avoid_click_sug");
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "1")) {
                return;
            }
            String str2 = "";
            if (C07F4.LIZ()) {
                if (aweme == null || (aid4 = aweme.getAid()) == null) {
                    aid4 = "";
                }
                int iLLLJIL = LLLJIL(aid4);
                if (iLLLJIL != -1) {
                    LLLLIIL(iLLLJIL, 0, new C092O() { // from class: X.0PTI
                        @Override // X.C092O
                        public final void accept(Object obj2) {
                            ClickSearchViewModel clickSearchViewModel;
                            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj2;
                            if (viewHolder instanceof SearchPhotoHolder) {
                                if (z && (clickSearchViewModel = this.LLJJI) != null) {
                                    clickSearchViewModel.CQ2();
                                }
                                if (C651290Pgd.LJII(this.LL.getContext(), this.LLIZ)) {
                                    SearchPhotoHolder searchPhotoHolder = (SearchPhotoHolder) viewHolder;
                                    C0PUV.LIZIZ(searchPhotoHolder.LL, searchPhotoHolder.itemView, searchPhotoHolder.LLLIIIIL, EnumC645610PTz.PHOTO_IN_MIX_FEED, false, false);
                                }
                            }
                        }
                    });
                }
            }
            if ((this.LLJJI != null && ClickSearchViewModel.AQ2(EnumC645610PTz.LIVE_IN_MIX_FEED)) || C07F4.LIZ()) {
                if (aweme == null || (aid2 = aweme.getAid()) == null) {
                    aid2 = "";
                }
                List<T> list = this.mmItems;
                if (list != 0) {
                    Iterator it2 = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        SingleLive singleLive = ((SearchMixFeedBase) it2.next()).singleLive;
                        if (singleLive != null && (aweme2 = singleLive.aweme) != null) {
                            aid3 = aweme2.getAid();
                        } else {
                            aid3 = null;
                        }
                        if (TextUtils.equals(aid2, aid3)) {
                            if (i != -1 && (iLLLLILI = i + LLLLILI()) != -1) {
                                LLLLIIL(iLLLLILI, 0, new C092O(iLLLLILI, z, this, aweme) { // from class: X.0PSh
                                    public final /* synthetic */ boolean LIZ;
                                    public final /* synthetic */ C645130PSd LIZIZ;
                                    public final /* synthetic */ Aweme LIZJ;

                                    {
                                        this.LIZ = z;
                                        this.LIZIZ = this;
                                        this.LIZJ = aweme;
                                    }

                                    @Override // X.C092O
                                    public final void accept(Object obj2) {
                                        SearchCardViewHolder searchCardViewHolder;
                                        ClickSearchTriggerAbility clickSearchTriggerAbility;
                                        ClickSearchViewModel clickSearchViewModel;
                                        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj2;
                                        if ((viewHolder instanceof SearchCardViewHolder) && (searchCardViewHolder = (SearchCardViewHolder) viewHolder) != null) {
                                            boolean z2 = this.LIZ;
                                            C645130PSd c645130PSd = this.LIZIZ;
                                            Aweme aweme3 = this.LIZJ;
                                            if (z2 && (clickSearchViewModel = c645130PSd.LLJJI) != null) {
                                                clickSearchViewModel.CQ2();
                                            }
                                            if (C651290Pgd.LJII(c645130PSd.LL.getContext(), c645130PSd.LLIZ) && aweme3 != null && (clickSearchTriggerAbility = (ClickSearchTriggerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(searchCardViewHolder), ClickSearchTriggerAbility.class, null)) != null) {
                                                clickSearchTriggerAbility.GP2(searchCardViewHolder.getPosition(), aweme3);
                                            }
                                        }
                                    }
                                });
                                return;
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
            if (this.LLJJI != null && ClickSearchViewModel.AQ2(EnumC645610PTz.VIDEO_IN_MIX_FEED)) {
                if (aweme != null && (aid = aweme.getAid()) != null) {
                    str2 = aid;
                }
                final int iLLLJIL2 = LLLJIL(str2);
                if (iLLLJIL2 == -1) {
                    return;
                }
                LLLLIIL(iLLLJIL2, 0, new C092O(iLLLJIL2, z, this, c737030Svd) { // from class: X.0PU2
                    public final /* synthetic */ boolean LIZ;
                    public final /* synthetic */ C645130PSd LIZIZ;
                    public final /* synthetic */ C737030Svd LIZJ;

                    {
                        this.LIZ = z;
                        this.LIZIZ = this;
                        this.LIZJ = c737030Svd;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
                    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
                    @Override // X.C092O
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r13) {
                        /*
                            Method dump skipped, instruction units count: 240
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0PU2.accept(java.lang.Object):void");
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC438050HFr
    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0PT8 c0pt8;
        C653660PkS c653660PkSL3;
        String string;
        Object objLLLLIL;
        HashSet<Integer> hashSet;
        HashSet<Integer> hashSet2;
        List listLIZ;
        final SearchMixFeed searchMixFeed = null;
        if (C640690PBb.LIZIZ.enableAsyncBind) {
            C645190PSj c645190PSj = this.LLL;
            C0PTR<T> c0ptr = c645190PSj.LJ;
            if (c0ptr != 0) {
                if ((viewHolder instanceof InterfaceC645430PTh) && (listLIZ = C645290PSt.LIZ((InterfaceC645430PTh) viewHolder)) != null) {
                    Iterator it2 = listLIZ.iterator();
                    while (it2.hasNext()) {
                        ((Runnable) it2.next()).run();
                    }
                }
                Set<Integer> set = C0PT7.LIZIZ;
                if (set.contains(Integer.valueOf(viewHolder.itemView.hashCode()))) {
                    set.remove(Integer.valueOf(viewHolder.itemView.hashCode()));
                } else {
                    c0ptr.LIZLLL.invoke(viewHolder, Integer.valueOf(i));
                }
            } else {
                c645190PSj.LIZIZ.invoke(viewHolder, Integer.valueOf(i));
            }
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (C292760Bdi.LIZ()) {
                ((C292750Bdh) this.LLJJLIIIJLLLLLLLZ.getValue()).LIZ = jCurrentTimeMillis;
            }
            if (((Boolean) C272160Ala.LIZ.getValue()).booleanValue()) {
                if (this.LLJIJIL != null) {
                    string = LLLLIL(viewHolder, i).toString();
                } else {
                    string = null;
                }
                if (this.LLJIJIL != null && C0P7Y.LIZ() && string != null) {
                    C662750Pz7.LIZ.getClass();
                    if (!C662750Pz7.LIZLLL || (i >= 0 && C662750Pz7.LIZJ.contains(Integer.valueOf(i)))) {
                        this.LLJLIL = new C662760Pz8(string, jCurrentTimeMillis, i);
                    }
                }
                LJJJJI(viewHolder, i);
                if (C292760Bdi.LIZ()) {
                    C292750Bdh c292750Bdh = (C292750Bdh) this.LLJJLIIIJLLLLLLLZ.getValue();
                    if (string == null) {
                        objLLLLIL = LLLLIL(viewHolder, i);
                    } else {
                        objLLLLIL = string;
                    }
                    c292750Bdh.getClass();
                    C0Q8I.INSTANCE.executorService.execute(new ARunnableS11S0200100_4(objLLLLIL, c292750Bdh, System.currentTimeMillis() - c292750Bdh.LIZ, 1));
                }
                SearchResultParam searchResultParam = this.LLJIJIL;
                if (searchResultParam != null && string != null) {
                    C644060POa.LIZ.getClass();
                    C644060POa.LJII(searchResultParam).LJJJZ.add(string);
                    if (((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLJILJILJ == 3) {
                        C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (jCurrentTimeMillis2 < 0) {
                            c0po5LJII.getClass();
                        } else {
                            c0po5LJII.LJLJL += jCurrentTimeMillis2;
                        }
                    }
                    if (SearchLcpExperiment.LIZ()) {
                        C0P8R c0p8r = C0P8S.LJIJJLI;
                        c0p8r.LIZ().LJIIJ(i, string);
                        c0p8r.LIZ().LJIIIIZZ(i, jCurrentTimeMillis);
                    }
                }
            } else {
                LJJJJI(viewHolder, i);
                if (C292760Bdi.LIZ()) {
                    C292750Bdh c292750Bdh2 = (C292750Bdh) this.LLJJLIIIJLLLLLLLZ.getValue();
                    AwS136S0201000_10 awS136S0201000_10 = new AwS136S0201000_10(this, viewHolder, i, 6);
                    c292750Bdh2.getClass();
                    C0Q8I.INSTANCE.executorService.execute(new ARunnableS11S0200100_4(System.currentTimeMillis() - c292750Bdh2.LIZ, c292750Bdh2, awS136S0201000_10, 0));
                }
                SearchResultParam searchResultParam2 = this.LLJIJIL;
                if (searchResultParam2 != null) {
                    String string2 = LLLLIL(viewHolder, i).toString();
                    C644060POa.LIZ.getClass();
                    C644060POa.LJII(searchResultParam2).LJJJZ.add(string2);
                    if (((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLJILJILJ == 3) {
                        C0PO5 c0po5LJII2 = C644060POa.LJII(searchResultParam2);
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (jCurrentTimeMillis3 < 0) {
                            c0po5LJII2.getClass();
                        } else {
                            c0po5LJII2.LJLJL += jCurrentTimeMillis3;
                        }
                    }
                    if (SearchLcpExperiment.LIZ()) {
                        C0P8R c0p8r2 = C0P8S.LJIJJLI;
                        c0p8r2.LIZ().LJIIJ(i, string2);
                        c0p8r2.LIZ().LJIIIIZZ(i, jCurrentTimeMillis);
                    }
                    if (C0P7Y.LIZ()) {
                        C662750Pz7.LIZ.getClass();
                        if (!C662750Pz7.LIZLLL || (i >= 0 && C662750Pz7.LIZJ.contains(Integer.valueOf(i)))) {
                            C662760Pz8 c662760Pz8 = new C662760Pz8(string2, jCurrentTimeMillis, i);
                            if ((viewHolder instanceof C0PT8) && (c0pt8 = (C0PT8) viewHolder) != null && (c653660PkSL3 = c0pt8.l3()) != null) {
                                c653660PkSL3.LJJL = c662760Pz8;
                            }
                        }
                    }
                }
            }
        }
        C641720PFa c641720PFa = C641720PFa.LIZ;
        View view = viewHolder.itemView;
        RecyclerView recyclerView = this.LL;
        List<T> list = this.mmItems;
        if (list != 0) {
            searchMixFeed = (SearchMixFeed) ListProtector.get(list, i);
        }
        c641720PFa.getClass();
        if (((Boolean) C287920BQg.LIZ.getValue()).booleanValue() && searchMixFeed != null) {
            if (searchMixFeed.feedType == 1) {
                SearchMixCardProfile cardProfile = searchMixFeed.getCardProfile();
                if (cardProfile != null && (hashSet = cardProfile.categoryTypes) != null && !hashSet.isEmpty()) {
                    SearchMixCardProfile cardProfile2 = searchMixFeed.getCardProfile();
                    if (cardProfile2 != null && (hashSet2 = cardProfile2.categoryTypes) != null && hashSet2.contains(0)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            final int height = recyclerView.getHeight();
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: X.0PBo
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    int height2;
                    HashSet<Integer> hashSet3;
                    if (view2 == null || (height2 = view2.getHeight()) <= 0) {
                        return;
                    }
                    SearchMixCardProfile cardProfile3 = searchMixFeed.getCardProfile();
                    boolean z = false;
                    if (cardProfile3 == null || (hashSet3 = cardProfile3.categoryTypes) == null || !hashSet3.contains(1) ? height2 > ((double) height) * 0.5d : height2 > ((double) height) * 0.85d) {
                        z = true;
                    }
                    String str = ((C0PRC) C0Q3E.LIZ(view2).Ph1().LIZJ()).LLILLL;
                    if (z) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C2215708mB(str, searchMixFeed, height2, height, null), 3);
                    }
                    view2.removeOnLayoutChangeListener(this);
                }
            };
            view.addOnLayoutChangeListener(onLayoutChangeListener);
            view.addOnAttachStateChangeListener(new C0R45(onLayoutChangeListener, 48));
        }
    }

    @Override // X.AbstractC438050HFr
    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        Future<C645340PSy<RecyclerView.ViewHolder>> futureRemove;
        C645340PSy<RecyclerView.ViewHolder> c645340PSy;
        RecyclerView.ViewHolder viewHolderInvoke;
        C0P68 c0p68PutIfAbsent;
        if (C291300BbM.LIZ()) {
            ConcurrentHashMap<Integer, C0P68> concurrentHashMap = C639480P6k.LIZ;
            Integer numValueOf = Integer.valueOf(i);
            C0P68 c0p68 = concurrentHashMap.get(numValueOf);
            if (c0p68 == null && (c0p68PutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (c0p68 = new C0P68(0)))) != null) {
                c0p68 = c0p68PutIfAbsent;
            }
            c0p68.LIZ++;
            SystemClock.uptimeMillis();
        }
        if (C640690PBb.LIZIZ.enableAsyncBind) {
            C645190PSj c645190PSj = this.LLL;
            C645250PSp c645250PSp = c645190PSj.LIZLLL;
            if (c645250PSp != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                String strValueOf = String.valueOf(i);
                C0PTU<RecyclerView.ViewHolder> c0ptu = c645250PSp.LJFF;
                CopyOnWriteArrayList<Future<C645340PSy<RecyclerView.ViewHolder>>> copyOnWriteArrayListLIZ = c0ptu.LIZ(i);
                if (copyOnWriteArrayListLIZ.size() > 0) {
                    futureRemove = copyOnWriteArrayListLIZ.remove(0);
                } else {
                    futureRemove = null;
                }
                if (futureRemove != null && !futureRemove.isCancelled()) {
                    try {
                        c645340PSy = futureRemove.get(100L, TimeUnit.MICROSECONDS);
                        if (c645340PSy.LIZIZ == 1) {
                            c0ptu.LIZIZ.put(Integer.valueOf(i), Boolean.TRUE);
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("AsyncTaskExecutor waitForResult: [");
                            sbLIZ.append(c0ptu.LJ);
                            sbLIZ.append(' ');
                            sbLIZ.append(i);
                            sbLIZ.append("] hit result");
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("waitForResult time out : ");
                        sbLIZ2.append(100L);
                        sbLIZ2.append(" ms");
                        c645340PSy = new C645340PSy<>(1, new C0PTF(C2188811AlT.LIZIZ(sbLIZ2)), 24);
                    }
                } else {
                    c645340PSy = new C645340PSy<>(2, null, 28);
                }
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                int i2 = c645340PSy.LIZIZ;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            C0PTC c0ptc = c645250PSp.LJ;
                            if (c0ptc != null) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("result status is ");
                                sbLIZ3.append(c645340PSy.LIZIZ);
                                c0ptc.LIZ(0, jUptimeMillis2, new Exception(C2188811AlT.LIZIZ(sbLIZ3)), strValueOf);
                            }
                            viewHolderInvoke = c645250PSp.LIZ.invoke(viewGroup, Integer.valueOf(i));
                        } else {
                            C0PTC c0ptc2 = c645250PSp.LJ;
                            if (c0ptc2 != null) {
                                c0ptc2.LIZJ(0, strValueOf);
                            }
                            viewHolderInvoke = c645250PSp.LIZ.invoke(viewGroup, Integer.valueOf(i));
                        }
                    } else {
                        C0PTC c0ptc3 = c645250PSp.LJ;
                        if (c0ptc3 != null) {
                            c0ptc3.LIZ(0, jUptimeMillis2, c645340PSy.LIZJ, strValueOf);
                        }
                        viewHolderInvoke = c645250PSp.LIZ.invoke(viewGroup, Integer.valueOf(i));
                    }
                } else {
                    C0PTC c0ptc4 = c645250PSp.LJ;
                    if (c0ptc4 != null) {
                        c0ptc4.LIZIZ(0, c645340PSy.LIZLLL, jUptimeMillis2, strValueOf);
                    }
                    viewHolderInvoke = c645340PSy.LIZ;
                }
                if (viewHolderInvoke != null) {
                    return viewHolderInvoke;
                }
            }
            return c645190PSj.LIZ.invoke(viewGroup, Integer.valueOf(i));
        }
        if (C292760Bdi.LIZ()) {
            ((C292750Bdh) this.LLJJLIIIJLLLLLLLZ.getValue()).LIZ = System.currentTimeMillis();
        }
        RecyclerView.ViewHolder viewHolderLJLIIIL = LJLIIIL(i, viewGroup);
        if (C292760Bdi.LIZ()) {
            C292750Bdh c292750Bdh = (C292750Bdh) this.LLJJLIIIJLLLLLLLZ.getValue();
            AwS150S0101000_10 awS150S0101000_10 = new AwS150S0101000_10(viewHolderLJLIIIL, i, 9);
            c292750Bdh.getClass();
            C0Q8I.INSTANCE.executorService.execute(new ARunnableS11S0200100_4(System.currentTimeMillis() - c292750Bdh.LIZ, c292750Bdh, awS150S0101000_10, 2));
            return viewHolderLJLIIIL;
        }
        return viewHolderLJLIIIL;
    }

    public final void LLLLIIL(int i, int i2, C092O<RecyclerView.ViewHolder> c092o) {
        HandlerHook.viewPostDelay(this.LL, new ARunnableS0S0202000_10(i, i2, this, c092o, 2), i2 * 10);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        boolean zLJFF;
        C0P68 c0p68PutIfAbsent;
        if (C291300BbM.LIZ()) {
            ConcurrentHashMap<Integer, C0P68> concurrentHashMap = C639480P6k.LIZ;
            int itemViewType = viewHolder.getItemViewType();
            ConcurrentHashMap<Integer, C0P68> concurrentHashMap2 = C639480P6k.LIZ;
            Integer numValueOf = Integer.valueOf(itemViewType);
            C0P68 c0p68 = concurrentHashMap2.get(numValueOf);
            if (c0p68 == null && (c0p68PutIfAbsent = concurrentHashMap2.putIfAbsent(numValueOf, (c0p68 = new C0P68(0)))) != null) {
                c0p68 = c0p68PutIfAbsent;
            }
            c0p68.LIZIZ++;
            SystemClock.uptimeMillis();
        }
        if (LLLLZLLLI()) {
            return;
        }
        if (((Boolean) C272220Alg.LIZ.getValue()).booleanValue() && (zLJFF = Intrinsics.LJFF(C13LP.LJJJLZIJ(0, list), "payload_data_update")) != ((C646370PWx) C0Q3E.LIZ(viewHolder.itemView).wO2().LIZJ()).LLJJIJIIJIL) {
            C0Q3E.LIZ(viewHolder.itemView).fe(new C0PCK(zLJFF));
        }
        super.onBindViewHolder(viewHolder, i, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLI(int i, RecyclerView.ViewHolder viewHolder, C653660PkS c653660PkS, SearchMixFeed searchMixFeed) {
        EcSearchBubbleVM ecSearchBubbleVM;
        InterfaceC1602960roc interfaceC1602960rocLIZIZ;
        int originType;
        if (viewHolder instanceof C0PT8) {
            ((C0PT8) viewHolder).LLLIL(c653660PkS);
            InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ(viewHolder.itemView, null);
            String str = c653660PkS.LJIIIIZZ;
            String str2 = c653660PkS.LJIIJJI;
            Integer numValueOf = Integer.valueOf(c653660PkS.LJIILL);
            Boolean bool = Boolean.TRUE;
            C1554960qZC.LIZ(interfaceC665370Q7zLJ, new C0OBO(str2, str, numValueOf, bool), C0OBO.class, "source_default_key");
            ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ(viewHolder.itemView);
            ((C0PT8) viewHolder).I2(iSearchContextAbilityLIZ);
            DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
            if (dynamicPatch != null) {
                originType = dynamicPatch.getOriginType();
            } else {
                originType = 0;
            }
            String str3 = c653660PkS.LJIIIIZZ;
            String str4 = c653660PkS.LJIIJJI;
            int i2 = c653660PkS.LJIILL;
            String providerDocIdStr = searchMixFeed.getProviderDocIdStr();
            Integer num = searchMixFeed.universalRank;
            C0PL2 c0pl2 = searchMixFeed.insertType;
            int iRetrieveIncrementalId = searchMixFeed.retrieveIncrementalId();
            boolean z = this.LL instanceof C0PPX;
            GlobalDoodleConfig globalDoodleConfig = this.LLJILJILJ;
            C644060POa c644060POa = C644060POa.LIZ;
            SearchResultParam searchResultParam = this.LLJIJIL;
            c644060POa.getClass();
            iSearchContextAbilityLIZ.fe(new C646380PWy(str4, originType, str3, Integer.valueOf(i2), bool, providerDocIdStr, num, c0pl2, iRetrieveIncrementalId, z, globalDoodleConfig, C644060POa.LJII(searchResultParam).LIZIZ));
            C0Q3E.LIZ(viewHolder.itemView).fe(new C0PCI(System.currentTimeMillis()));
            viewHolder.itemView.setTag(R.id.ua_, bool);
            ISearchContextAbility iSearchContextAbilityLIZ2 = C0Q3E.LIZ(viewHolder.itemView);
            if (iSearchContextAbilityLIZ2 != null) {
                iSearchContextAbilityLIZ2.fe(new C0PCI(System.currentTimeMillis()));
            }
            C0PYP c0pyp = C0PYP.LIZ;
            Fragment fragmentLIZ = this.LLILLJJLI.LIZ();
            C19EG c19egLIZIZ = C640260P9k.LIZIZ(viewHolder.itemView);
            c0pyp.getClass();
            C0PYP.LJ(fragmentLIZ, i, searchMixFeed, c19egLIZIZ);
        }
        if (viewHolder instanceof InterfaceC645410PTf) {
            ((InterfaceC645410PTf) viewHolder).LLLJIL(searchMixFeed.getFeedbackType());
        }
        if (viewHolder instanceof C0PUC) {
            ((C0PUC) viewHolder).LLLILZLLLI(searchMixFeed.getRank());
        }
        Aweme aweme = searchMixFeed.getAweme();
        if (aweme != null && aweme.isAd() && !CommerceSearchAdConfigSetting.LIZ().disableFpsMonitorForSearchAd && (interfaceC1602960rocLIZIZ = C0VWN.LIZIZ("search_mix_feed_list")) != null) {
            interfaceC1602960rocLIZIZ.LIZ("next_video", "search_ad");
        }
        if (C0BTB.LIZ() && viewHolder.getBindingAdapterPosition() == 0 && (ecSearchBubbleVM = this.LLJILLL) != null) {
            ecSearchBubbleVM.LLILLJJLI = LLLLLLLZIL(searchMixFeed);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LLLII(int i, RecyclerView.ViewHolder viewHolder, C653660PkS c653660PkS, SearchMixFeed searchMixFeed) {
        SearchActivityCardBgData activityCardBg;
        String searchEnterFromPage;
        String str;
        int iIntValue;
        String strBu2;
        String str2;
        String str3;
        List<Map<?, ?>> awemeListRaw;
        List<Map<?, ?>> awemeMultiTabListRaw;
        List<Map<?, ?>> tabMapRaw;
        List<Aweme> awemeList;
        boolean z;
        int i2;
        boolean z2;
        boolean zLLLLJ;
        boolean z3;
        SparkContext sparkContext;
        String str4;
        GridLayoutManager gridLayoutManager;
        AbstractC214823195h abstractC214823195h;
        boolean z4;
        String str5;
        EcomSearchInfo ecomSearchInfo;
        boolean zLLLLJ2;
        boolean z5;
        GridLayoutManager gridLayoutManager2;
        AbstractC214823195h abstractC214823195h2;
        boolean z6;
        String str6;
        SearchBackgroundConfig backgroundConfig;
        Integer num;
        C0Q2S c0q2sLIZJ;
        Integer num2;
        boolean z7;
        String strKz0;
        SearchMixFeed searchMixFeed2;
        Long l;
        String str7;
        String str8;
        String strLIZ;
        Map<?, ?> map;
        VisualSearchEnterModel visualSearchEnterModelRt0;
        ApiRequestParams apiRequestParams;
        VisualSearchEnterModel visualSearchEnterModelRt02;
        VisualSearchContextModel visualSearchContextModel;
        int i3;
        Object objLIZ;
        C0PFN c0pfn;
        List<? extends Aweme> awemeList2;
        GlobalDoodleConfig globalDoodleConfig = this.LLJILJILJ;
        if (globalDoodleConfig != null) {
            activityCardBg = globalDoodleConfig.getActivityCardBg();
        } else {
            activityCardBg = null;
        }
        C646000PVm c646000PVm = C650950Pg5.Companion;
        View view = viewHolder.itemView;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJI = C646000PVm.LJI(view);
        LLLLLLLZIL(searchMixFeed);
        SearchAwemePoolViewModelNG searchAwemePoolViewModelNG = this.LLIZLLLIL;
        if (searchAwemePoolViewModelNG != null) {
            DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
            if (dynamicPatch != null) {
                awemeList2 = dynamicPatch.getAwemeList();
            } else {
                awemeList2 = null;
            }
            searchAwemePoolViewModelNG.wQ2(awemeList2);
        }
        if (C0PU8.LJFF()) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C0PU4.class);
            if ((searchMixFeed instanceof C0PFN) && (c0pfn = (C0PFN) searchMixFeed) != null) {
                objLIZ = c0pfn.LIZ();
            } else {
                objLIZ = null;
            }
            if (!c19719912DlLIZ.LIZIZ(objLIZ)) {
                objLIZ = null;
            }
            C0PU4 c0pu4 = (C0PU4) objLIZ;
            if (c0pu4 != null && searchMixFeed.getDynamicPatch() == null) {
                searchMixFeed.setDynamicPatch((DynamicPatch) c0pu4.LLILZLL.getValue());
            }
        }
        DynamicPatch dynamicPatch2 = searchMixFeed.getDynamicPatch();
        dynamicPatch2.setAdapterPlayAbleIndex(i - LLLLILI());
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam = this.LLJIJIL;
        c644060POa.getClass();
        long j = C644060POa.LJII(searchResultParam).LIZIZ;
        C0PRC c0prc = (C0PRC) C0Q3E.LIZIZ(this.LLILZIL).Ph1().LIZJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SearchResultParam searchResultParam2 = this.LLJIJIL;
        String str9 = "";
        if (searchResultParam2 == null || (searchEnterFromPage = searchResultParam2.getSearchEnterFromPage()) == null) {
            searchEnterFromPage = "";
        }
        linkedHashMap.put("enterFrom", searchEnterFromPage);
        linkedHashMap.put("current_uid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        linkedHashMap.put("searchId", c653660PkS.LJIIJ);
        linkedHashMap.put("keyword", c653660PkS.LJFF);
        linkedHashMap.put("logPb", c653660PkS.LJIILJJIL);
        linkedHashMap.put("start_search", Long.valueOf(j));
        linkedHashMap.put("card_bind_time", Long.valueOf(System.currentTimeMillis()));
        EcomGeneralShowCaseCardConfig.ShowcaseModel showcaseModelLIZ = EcomGeneralShowCaseCardConfig.LIZ();
        if (showcaseModelLIZ == null || (str = showcaseModelLIZ.apiVersion) == null) {
            str = "1;1;1";
        }
        linkedHashMap.put("ecom_api_version", str);
        linkedHashMap.put("rank", Integer.valueOf(c653660PkS.LJIILL));
        Integer num3 = c653660PkS.LJIILLIIL;
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = -1;
        }
        linkedHashMap.put("universalRank", Integer.valueOf(iIntValue));
        int i4 = this.LLJJL;
        int i5 = this.LLJJJJLIIL;
        if (i4 != i5 && i5 != -1) {
            linkedHashMap.put("original_rank", Integer.valueOf(i5));
        }
        if (this.LLILZIL instanceof InterfaceC645440PTi) {
            C0PTB c0ptb = this.LLJJIII;
            if (c0ptb != null && c0ptb.yq2()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            linkedHashMap.put("has_shop_tab", Integer.valueOf(i3));
        } else {
            linkedHashMap.put("has_shop_tab", Integer.valueOf(C644560PPy.LJI().contains(EnumC669620QOi.SHOP.getTabName()) ? 1 : 0));
        }
        C0PTB c0ptb2 = this.LLJJIII;
        if (c0ptb2 == null || (strBu2 = c0ptb2.Bu2()) == null) {
            strBu2 = "";
        }
        linkedHashMap.put("image_uri", strBu2);
        Pair[] pairArr = new Pair[4];
        C0PTB c0ptb3 = this.LLJJIII;
        if (c0ptb3 == null || (visualSearchEnterModelRt02 = c0ptb3.rt0()) == null || (visualSearchContextModel = visualSearchEnterModelRt02.contextModel) == null || (str2 = visualSearchContextModel.enterFrom) == null) {
            str2 = "";
        }
        pairArr[0] = new Pair("search_entrance", str2);
        C0PTB c0ptb4 = this.LLJJIII;
        if (c0ptb4 == null || (visualSearchEnterModelRt0 = c0ptb4.rt0()) == null || (apiRequestParams = visualSearchEnterModelRt0.apiRequestModel) == null || (str3 = apiRequestParams.enterFromSecond) == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("search_entrance_second", str3);
        pairArr[2] = new Pair("enter_from_channel", c0prc.LLLFZ);
        pairArr[3] = new Pair("enter_method", c0prc.LLJLL);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        String str10 = c0prc.LLLIIIIL;
        if (str10 != null) {
            mapLJIIJ.put("enter_group_id", str10);
        }
        String str11 = c0prc.LLLIIL;
        if (str11 != null) {
            mapLJIIJ.put("req_search_enter_from", str11);
        }
        String str12 = c0prc.LLLIIIL;
        if (str12 != null) {
            mapLJIIJ.put("req_search_enter_method", str12);
        }
        linkedHashMap.put("extraLogParams", mapLJIIJ);
        linkedHashMap.put("search_method", ((C0PRC) C0Q3E.LIZIZ(this.LLILZIL).Ph1().LIZJ()).LLJLL);
        DynamicPatch dynamicPatch3 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch3 == null || (awemeListRaw = dynamicPatch3.getAwemeListRaw()) == null) {
            awemeListRaw = "";
        }
        linkedHashMap.put("aweme_list", awemeListRaw);
        DynamicPatch dynamicPatch4 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch4 == null || (awemeMultiTabListRaw = dynamicPatch4.getAwemeMultiTabListRaw()) == null) {
            awemeMultiTabListRaw = "";
        }
        linkedHashMap.put("aweme_multi_tab_list", awemeMultiTabListRaw);
        Map<?, ?> aiHotspotCanvasRaw = searchMixFeed.getDynamicPatch().getAiHotspotCanvasRaw();
        if (aiHotspotCanvasRaw == null) {
            aiHotspotCanvasRaw = "";
        }
        linkedHashMap.put("ai_hotspot_canvas", aiHotspotCanvasRaw);
        if (C04U3.LIZ() != 0) {
            linkedHashMap.put("ecom_search_redesign_products_card", Integer.valueOf(C04U3.LIZ()));
        }
        DynamicPatch dynamicPatch5 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch5 != null && (map = dynamicPatch5.extraInfo) != null) {
            linkedHashMap.put("extra_info", map);
        }
        linkedHashMap.put("cards_sound_control_type", Integer.valueOf(C07P0.LIZ()));
        linkedHashMap.put("tns_ban_type", c653660PkS.LJJI);
        DynamicPatch dynamicPatch6 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch6 == null || (tabMapRaw = dynamicPatch6.getTabMapRaw()) == null) {
            tabMapRaw = "";
        }
        linkedHashMap.put("tab_map", tabMapRaw);
        DynamicPatch dynamicPatch7 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch7 != null) {
            awemeList = dynamicPatch7.getAwemeList();
        } else {
            awemeList = null;
        }
        List<Integer> listLIZ = C486810J7f.LIZ(awemeList);
        if (listLIZ == null) {
            listLIZ = "";
        }
        linkedHashMap.put("isVertical", listLIZ);
        if (activityCardBg != null && (strLIZ = C640260P9k.LIZ(activityCardBg, i)) != null) {
            str9 = strLIZ;
        }
        linkedHashMap.put("activityBgColor", str9);
        SearchMixCardProfile cardProfile = searchMixFeed.getCardProfile();
        if (cardProfile != null && (str8 = cardProfile.sceneType) != null) {
            linkedHashMap.put("lynx_card_profile_type", str8);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("add lynxCardSceneType ");
            sbLIZ.append(str8);
            sbLIZ.append(" cardProfile ");
            sbLIZ.append(searchMixFeed.getCardProfile());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (c650960Pg6LJI != null) {
            C664030Q2v c664030Q2v = c650960Pg6LJI.searchVideoModel;
            if (c664030Q2v != null && (str7 = c664030Q2v.groupId) != null) {
                linkedHashMap.put("lastFromGroupId", str7);
            }
            C0PYE c0pye = c650960Pg6LJI.searchSessionModel;
            if (c0pye != null && (l = c0pye.searchSessionId) != null) {
                long jLongValue = l.longValue();
                linkedHashMap.put("search_session_id", Long.valueOf(jLongValue));
                linkedHashMap.put("searchSessionId", Long.valueOf(jLongValue));
            }
        }
        List<T> list = this.mmItems;
        if (list != 0 && (searchMixFeed2 = (SearchMixFeed) C13LP.LJJJLZIJ(i - 1, list)) != null && C0PLR.LIZIZ(searchMixFeed2)) {
            z = true;
        } else {
            z = false;
        }
        linkedHashMap.put("isPreCardActivityCard", Boolean.valueOf(z));
        Boolean bool = Boolean.TRUE;
        linkedHashMap.put("isDoubleColumn", bool);
        if (C0BRN.LIZ()) {
            FirstScreenHelperAbility firstScreenHelperAbility = (FirstScreenHelperAbility) C1558520qew.LIZ(C1558360qeg.LJ(viewHolder.itemView, null), FirstScreenHelperAbility.class, null);
            if (firstScreenHelperAbility == null || (strKz0 = firstScreenHelperAbility.Kz0(String.valueOf(searchMixFeed.getDocId()), null)) == null) {
                strKz0 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_first_screen", strKz0);
        }
        C662670Pyz.LIZ.getClass();
        String strLIZ2 = C662670Pyz.LIZ();
        if (strLIZ2 != null) {
            linkedHashMap.put("endToEndSearchSessionId", strLIZ2);
        }
        if (C0PPZ.LIZ()) {
            SearchRefreshPredictMobCanShowVM searchRefreshPredictMobCanShowVM = (SearchRefreshPredictMobCanShowVM) this.LLJLLIL.getValue();
            if (searchRefreshPredictMobCanShowVM != null) {
                searchRefreshPredictMobCanShowVM.a32();
            }
            SearchRefreshPredictMobCanShowVM searchRefreshPredictMobCanShowVM2 = (SearchRefreshPredictMobCanShowVM) this.LLJLLIL.getValue();
            if (searchRefreshPredictMobCanShowVM2 != null && searchRefreshPredictMobCanShowVM2.a32()) {
                z7 = true;
            } else {
                z7 = false;
            }
            linkedHashMap.put("visibleUnderPredict", Boolean.valueOf(z7));
        }
        linkedHashMap.putAll(LLLFZ(searchMixFeed));
        if (C1839107If.LIZ() && dynamicPatch2.getNearByAuth() != null) {
            SearchLocationCacheData.LIZ.getClass();
            Pair pairLIZIZ = SearchLocationCacheData.LIZIZ();
            if (pairLIZIZ != null) {
                Object first = pairLIZIZ.getFirst();
                if (first != null) {
                    linkedHashMap.put("decrypted_lat", first);
                }
                Object second = pairLIZIZ.getSecond();
                if (second != null) {
                    linkedHashMap.put("decrypted_lng", second);
                }
            }
        }
        C639570P6t.LIZ.getClass();
        if (C639570P6t.LJ(searchMixFeed) || C639570P6t.LIZLLL(searchMixFeed) || C1839407Ii.LIZ()) {
            linkedHashMap.put("pageContextHashCode", String.valueOf(C639570P6t.LIZIZ(this.LLILZIL)));
        }
        DynamicPatch dynamicPatch8 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch8 != null && Integer.valueOf(dynamicPatch8.getOriginType()) != null) {
            linkedHashMap.put("originType", Integer.valueOf(searchMixFeed.getDynamicPatch().getOriginType()));
        }
        DynamicPatch dynamicPatch9 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch9 != null && dynamicPatch9.getTokenType() != null) {
            linkedHashMap.put("tokenType", searchMixFeed.getDynamicPatch().getTokenType());
        }
        DynamicPatch dynamicPatch10 = searchMixFeed.getDynamicPatch();
        if (dynamicPatch10 != null && dynamicPatch10.getNeedGeneralSearchVideos() != null) {
            linkedHashMap.put("needGeneralSearchVideos", searchMixFeed.getDynamicPatch().getNeedGeneralSearchVideos());
        }
        linkedHashMap.put("is_hide_engagement_data", Integer.valueOf(C666750QDh.LIZ() ? 1 : 0));
        C0Q2P c0q2p = (C0Q2P) this.LLJLLL.getValue();
        if (c0q2p != null && (c0q2sLIZJ = c0q2p.LIZJ()) != null && (num2 = c0q2sLIZJ.LIZIZ) != null) {
            num2.intValue();
            i2 = 1;
        } else {
            i2 = 0;
        }
        linkedHashMap.put("search_has_correct", i2);
        if (globalDoodleConfig != null && (backgroundConfig = globalDoodleConfig.getBackgroundConfig()) != null && (num = backgroundConfig.disappearStrategy) != null) {
            linkedHashMap.put("search_background_strategy", Integer.valueOf(num.intValue()));
        }
        if (C650240Pew.LIZ()) {
            int iLIZIZ = C497820Jfg.LIZIZ(this.LL.getContext());
            C650240Pew.LIZ.getClass();
            linkedHashMap.put("double_column_container_height", Integer.valueOf(C679280Qkg.LIZIZ(Double.valueOf((((double) ((iLIZIZ - (C650240Pew.LIZJ * 3)) / 2)) / 0.625d) + ((double) C650240Pew.LIZLLL()) + ((double) C650240Pew.LJFF)))));
        }
        C0PTE.LIZ.getClass();
        C0PTE.LIZJ = j;
        C649470Pdh.LIZ.getClass();
        if (C649470Pdh.LJIIL(searchMixFeed)) {
            IEcomGeneralSearchService iEcomGeneralSearchService = (IEcomGeneralSearchService) ServiceManager.get().getService(IEcomGeneralSearchService.class);
            iEcomGeneralSearchService.LJJIIZ(searchMixFeed, dynamicPatch2, "bind_data", c653660PkS.LJIIJ);
            DynamicPatch dynamicPatch11 = searchMixFeed.getDynamicPatch();
            if (dynamicPatch11 != null && (str6 = dynamicPatch11.schema) != null) {
                iEcomGeneralSearchService.LJIILL(str6, c653660PkS.LJIIJ);
            }
        }
        SearchComponentCenter.TopBarComponent.ISearchTopBarAbility iSearchTopBarAbility = (SearchComponentCenter.TopBarComponent.ISearchTopBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LLILZIL, null), SearchComponentCenter.TopBarComponent.ISearchTopBarAbility.class, null);
        if (iSearchTopBarAbility != null && iSearchTopBarAbility.ni2()) {
            dynamicPatch2.getGlobalProps().put("hasTopBar", bool);
        }
        if (viewHolder instanceof ViewOnAttachStateChangeListenerC648030PbN) {
            if (!this.LLJL && LLLLLLLZIL(searchMixFeed) && C1202704nB.LIZ()) {
                this.LLJL = true;
                SearchTopFragmentAbility searchTopFragmentAbility = (SearchTopFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LLILZIL, null), SearchTopFragmentAbility.class, null);
                if (searchTopFragmentAbility != null) {
                    if (i == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    searchTopFragmentAbility.bH0(z6);
                }
            }
            if (this.LL instanceof C0PPX) {
                dynamicPatch2.getGlobalProps().put("isNullifyCard", 1);
            }
            if (C650240Pew.LIZ()) {
                zLLLLJ2 = LLLLJ(viewHolder);
            } else {
                zLLLLJ2 = false;
            }
            RecyclerView.LayoutManager layoutManager = this.LL.getLayoutManager();
            if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager2 = (GridLayoutManager) layoutManager) != null && (abstractC214823195h2 = gridLayoutManager2.LLIZ) != null && abstractC214823195h2.LJFF(i) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            ViewOnAttachStateChangeListenerC648030PbN viewOnAttachStateChangeListenerC648030PbN = (ViewOnAttachStateChangeListenerC648030PbN) viewHolder;
            z2 = true;
            viewOnAttachStateChangeListenerC648030PbN.I5(this.LLILLJJLI.LIZ(), dynamicPatch2, linkedHashMap, this.LLILLJJLI, searchMixFeed.lynxSSRInfo, this.LLJJI, z5, zLLLLJ2);
            int i6 = i + 1;
            if (getBasicItemViewType(i6) != 1 && getBasicItemViewType(i6) == 5) {
                getBasicItemViewType(i + 2);
            }
            C651640PhC c651640PhC = C651640PhC.LIZIZ;
            Fragment fragment = this.LLILZIL;
            C647830Pb3 c647830Pb3P5 = viewOnAttachStateChangeListenerC648030PbN.P5();
            InterfaceC643430PLp interfaceC643430PLp = this.LLILZLL;
            c651640PhC.getClass();
            String str13 = c647830Pb3P5.LIZLLL;
            if (str13 != null && str13.length() > 0) {
                C651640PhC.LIZJ.put(str13, new C0PLZ(searchMixFeed, searchMixFeed.retrieveIncrementalId(), interfaceC643430PLp));
                C357001a4.LIZ(fragment, new AwS95S1000000_10(str13, 6));
            }
        } else {
            z2 = true;
            if (viewHolder instanceof DynamicViewHolder) {
                if (!this.LLJL && LLLLLLLZIL(searchMixFeed) && C1202704nB.LIZ()) {
                    this.LLJL = true;
                    SearchTopFragmentAbility searchTopFragmentAbility2 = (SearchTopFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LLILZIL, null), SearchTopFragmentAbility.class, null);
                    if (searchTopFragmentAbility2 != null) {
                        if (i == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        searchTopFragmentAbility2.bH0(z4);
                    }
                }
                if (this.LL instanceof C0PPX) {
                    dynamicPatch2.getGlobalProps().put("isNullifyCard", 1);
                }
                if (C650240Pew.LIZ()) {
                    zLLLLJ = LLLLJ(viewHolder);
                } else {
                    zLLLLJ = false;
                }
                RecyclerView.LayoutManager layoutManager2 = this.LL.getLayoutManager();
                if ((layoutManager2 instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager2) != null && (abstractC214823195h = gridLayoutManager.LLIZ) != null && abstractC214823195h.LJFF(i) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                DynamicViewHolder dynamicViewHolder = (DynamicViewHolder) viewHolder;
                dynamicViewHolder.I5(this.LLILLJJLI.LIZ(), dynamicPatch2, linkedHashMap, this.LLILLJJLI, searchMixFeed.lynxSSRInfo, this.LLJJI, zLLLLJ, z3);
                int i7 = i + 1;
                if (getBasicItemViewType(i7) != 1 && getBasicItemViewType(i7) == 5) {
                    getBasicItemViewType(i + 2);
                }
                dynamicViewHolder.LLILLL.getClass();
                C651640PhC c651640PhC2 = C651640PhC.LIZIZ;
                Fragment fragment2 = this.LLILZIL;
                C648160Pba c648160Pba = dynamicViewHolder.LL;
                InterfaceC643430PLp interfaceC643430PLp2 = this.LLILZLL;
                c651640PhC2.getClass();
                C1D66 c1d66LIZ = c648160Pba.LJIIIIZZ.LIZ();
                if (c1d66LIZ != null && (sparkContext = c1d66LIZ.LJFF) != null && (str4 = sparkContext.containerId) != null && str4.length() > 0) {
                    C651640PhC.LIZJ.put(str4, new C0PLZ(searchMixFeed, searchMixFeed.retrieveIncrementalId(), interfaceC643430PLp2));
                    C357001a4.LIZ(fragment2, new AwS95S1000000_10(str4, 7));
                }
            }
        }
        if (!this.LLJL && globalDoodleConfig != null && (ecomSearchInfo = globalDoodleConfig.getEcomSearchInfo()) != null && Intrinsics.LJFF(ecomSearchInfo.shopTabMoveToSecond, bool) && C1202804nC.LIZ()) {
            this.LLJL = z2;
            str5 = null;
            SearchTopFragmentAbility searchTopFragmentAbility3 = (SearchTopFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LLILZIL, null), SearchTopFragmentAbility.class, null);
            if (searchTopFragmentAbility3 != null) {
                searchTopFragmentAbility3.bH0(z2);
            }
        } else {
            str5 = null;
        }
        C660870Pw5.LIZIZ(viewHolder.itemView, c653660PkS);
        if (!this.LLJ) {
            this.LLJ = z2;
            HandlerHook.viewPost(this.LL, new ARunnableS110S0100000_10(this, 144));
        }
        this.LLJJIJIL++;
        if (C287840BPy.LIZ()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.LLJJJ);
            sb.append(",lynx:");
            DynamicPatch dynamicPatch12 = searchMixFeed.getDynamicPatch();
            if (dynamicPatch12 != null) {
                str5 = dynamicPatch12.schema;
            }
            sb.append(C649470Pdh.LJ(str5));
            this.LLJJJ = sb.toString();
        }
    }

    public final void LLLIIIIL(int i, RecyclerView.ViewHolder viewHolder, C653660PkS c653660PkS, SearchMixFeed searchMixFeed) {
        SearchLiveCollectionViewHolderAssemSupport searchLiveCollectionViewHolderAssemSupport;
        C652310PiH c652310PiH;
        if ((viewHolder instanceof C652310PiH) && (c652310PiH = (C652310PiH) viewHolder) != null) {
            c652310PiH.R5(searchMixFeed, c653660PkS, i, this.LLJJI);
        }
        if ((viewHolder instanceof SearchLiveCollectionViewHolderAssemSupport) && (searchLiveCollectionViewHolderAssemSupport = (SearchLiveCollectionViewHolderAssemSupport) viewHolder) != null) {
            searchLiveCollectionViewHolderAssemSupport.LLJLILLLLZIIL.LLJJJJLIIL(i, new C652220Pi8(i, c653660PkS, searchMixFeed), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIILIL(int r27, androidx.recyclerview.widget.RecyclerView.ViewHolder r28, X.C653660PkS r29, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r30) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645130PSd.LLLIILIL(int, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.0PkS, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLILZ(int r26, androidx.recyclerview.widget.RecyclerView.ViewHolder r27, X.C653660PkS r28, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r29) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645130PSd.LLLILZ(int, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.0PkS, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed):void");
    }

    public void LLLZ(long j, long j2, Aweme aweme, String str, boolean z) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        String strLIZ;
        if (C651290Pgd.LJII(this.LL.getContext(), this.LLIZ)) {
            String aid = aweme.getAid();
            if (!Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "SearchLyricsVideo") && !Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "SearchHotSpot") && !Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "search_horizontal_tab_lynx") && !Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "searchBrandZoneCard")) {
                strLIZ = C0P7S.LIZ(this.LLILLJJLI.getIdentifier(), aid);
            } else {
                SAFHelper sAFHelper = SAFHelper.LIZ;
                Fragment parentFragment = this.LLILZIL;
                Context context = parentFragment.getContext();
                InterfaceC214902198i interfaceC214902198i = null;
                if (context != null) {
                    componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                } else {
                    componentCallbacks2LJFF = null;
                }
                if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                    while (true) {
                        if (parentFragment instanceof InterfaceC214902198i) {
                            interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                            break;
                        } else {
                            parentFragment = parentFragment.getParentFragment();
                            if (parentFragment == null) {
                                break;
                            }
                        }
                    }
                }
                Activity activityLIZ = C1388190mED.LIZ(this.LL.getContext());
                sAFHelper.getClass();
                Integer numLJJIJIIJI = SAFHelper.LJJIJIIJI(interfaceC214902198i, activityLIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SearchVideoForLynx_");
                sbLIZ.append(numLJJIJIIJI);
                strLIZ = C0P7S.LIZ(C2188811AlT.LIZIZ(sbLIZ), aid);
            }
            C661510Px7.LIZ.getClass();
            C661510Px7.LIZJ(j, j2, aweme, strLIZ, z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0221  */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.1AtR] */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.1AtR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C645130PSd(androidx.recyclerview.widget.RecyclerView r17, X.InterfaceC641090PCp r18, X.InterfaceC659300PtY r19, X.C0P6P r20, androidx.fragment.app.Fragment r21, X.InterfaceC643430PLp r22) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645130PSd.<init>(androidx.recyclerview.widget.RecyclerView, X.0PCp, X.0PtY, X.0P6P, androidx.fragment.app.Fragment, X.0PLp):void");
    }
}

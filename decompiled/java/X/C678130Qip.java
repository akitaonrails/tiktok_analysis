package X;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0HA4;
import X.C138800fy;
import X.C1396605dM;
import X.C1397505dV;
import X.C1537480q70;
import X.C1537720q7O;
import X.C1540620qC4;
import X.C15WQ;
import X.C189200o6;
import X.C19EG;
import X.C293720BfG;
import X.C678130Qip;
import X.C678140Qiq;
import X.C678150Qir;
import X.C786410Ut5;
import X.InterfaceC676520QgE;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.arch.BackgroundStyle;
import com.ss.android.ugc.aweme.ecommerce.arch.EComSearchBffResp;
import com.ss.android.ugc.aweme.ecommerce.arch.MixAssemPowerCell;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import com.ss.android.ugc.aweme.ecommerce.arch.MixStyle;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.FilterSortNoResultCell;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.GuessULikeTitleCell;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixLoadingFooterCell;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MultiSparkItemCell;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.NoResultJumpGSCell;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.RefreshBallLoadingCell;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.SearchCorrectWordCell;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixJSBAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchMixApi;
import com.ss.android.ugc.aweme.ecommerce.search.vision.request.MixPhotoSearchPreload;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS32S2200000_10;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.AwS659S0100000_10;
import kotlin.jvm.internal.AwS78S1300000_10;
import kotlin.jvm.internal.AwS95S1000000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678130Qip {
    public final C19EG LIZ;
    public final Fragment LIZIZ;
    public final ViewGroup LIZJ;
    public final LinearLayout LIZLLL;
    public final MixShopSearchBizVM LJ;
    public C0HA4 LJI;
    public C678140Qiq LJII;
    public C1540620qC4 LJIIIIZZ;
    public LifecycleOwner LJIIIZ;
    public C677400Qhe LJIIJ;
    public final List<InterfaceC676500QgC> LJFF = new ArrayList();
    public final C678200Qiw LJIIJJI = new C678200Qiw();
    public final C678220Qiy LJIIL = new C678220Qiy();
    public final MixJSBAbility LJIILIIL = new MixJSBAbility();
    public final C677480Qhm LJIILJJIL = new C677480Qhm();
    public final C678150Qir LJIILL = new C678150Qir();
    public final C677390Qhd LJIILLIIL = new C677390Qhd();

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0HA4, android.view.View, androidx.recyclerview.widget.RecyclerView] */
    public final void LIZJ() {
        final int i = 0;
        if (this.LIZJ.getChildAt(0) instanceof C0HA4) {
            C786410Ut5.LJJLIL(0, this.LIZJ);
        }
        final Context context = this.LIZJ.getContext();
        final AttributeSet attributeSet = null;
        ?? r2 = new ViewOnAttachStateChangeListenerC20604515jv(context, attributeSet, i) { // from class: X.0HA4
            {
                addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
            }
        };
        r2.setId(R.id.ohx);
        r2.setItemViewCacheSize(0);
        this.LJI = r2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C0HA4 c0ha4 = this.LJI;
        if (c0ha4 != null) {
            this.LIZJ.addView(c0ha4, 0, layoutParams);
        }
        C786410Ut5.LJZL(0, this.LIZLLL);
    }

    public final void LIZLLL() {
        C20600815jK<InterfaceC1891350zJl> state;
        C1540620qC4 c1540620qC4;
        Iterator it2 = ((ArrayList) this.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC676500QgC) it2.next()).onDestroy();
        }
        if (C293720BfG.LIZ() && (c1540620qC4 = this.LJIIIIZZ) != null) {
            c1540620qC4.LJIIIIZZ();
        }
        C1540620qC4 c1540620qC42 = this.LJIIIIZZ;
        if (c1540620qC42 != null) {
            c1540620qC42.LJII();
        }
        C0HA4 c0ha4 = this.LJI;
        if (c0ha4 != null && (state = c0ha4.getState()) != null) {
            state.LJFF(null);
        }
        if (this.LIZJ.getChildAt(0) instanceof C0HA4) {
            C786410Ut5.LJJLIL(0, this.LIZJ);
        }
        ((ArrayList) this.LJFF).clear();
    }

    public final void LJFF() {
        Map<String, Object> linkedHashMap;
        C678140Qiq c678140Qiq;
        C678230Qiz c678230Qiz;
        Map<String, Object> map;
        C677970QiZ c677970QiZ;
        InterfaceC621800OaA interfaceC621800OaA;
        C20600815jK<InterfaceC1891350zJl> state;
        C1540620qC4 c1540620qC4;
        C678140Qiq c678140Qiq2 = this.LJII;
        if (c678140Qiq2 != null) {
            MixPageViewModel mixPageViewModel = c678140Qiq2.LJIIL;
            if (mixPageViewModel != null) {
                mixPageViewModel.LL = "";
            }
            c678140Qiq2.LJFF();
        }
        InterfaceC676520QgE interfaceC676520QgE = this.LJIILL.LL;
        if (interfaceC676520QgE != null) {
            interfaceC676520QgE.reset();
        }
        this.LJIILL.LLILZIL = true;
        this.LJ.reset();
        if (this.LIZ != null) {
            if (C293720BfG.LIZ() && (c1540620qC4 = this.LJIIIIZZ) != null) {
                c1540620qC4.LJIIIIZZ();
            }
            C1540620qC4 c1540620qC42 = this.LJIIIIZZ;
            if (c1540620qC42 != null) {
                c1540620qC42.LJII();
            }
            C0HA4 c0ha4 = this.LJI;
            if (c0ha4 != null && (state = c0ha4.getState()) != null) {
                state.LJFF(null);
            }
            if (this.LIZJ.getChildAt(0) instanceof C0HA4) {
                C786410Ut5.LJJLIL(0, this.LIZJ);
            }
            LIZJ();
            C677400Qhe c677400Qhe = this.LJIIJ;
            if (c677400Qhe == null || (c677970QiZ = c677400Qhe.LJ) == null || (interfaceC621800OaA = c677970QiZ.LIZ) == null || (linkedHashMap = interfaceC621800OaA.Aj()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            Object jSONObject = linkedHashMap.get("searchInitParams");
            Pair[] pairArr = new Pair[1];
            if (jSONObject == null && (c677400Qhe == null || (c678230Qiz = c677400Qhe.LIZ) == null || (map = c678230Qiz.LIZJ) == null || (jSONObject = map.get("searchInitParams")) == null)) {
                jSONObject = new JSONObject();
            }
            pairArr[0] = new Pair("searchInitParams", jSONObject);
            Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            C1540620qC4 c1540620qC4LIZ = c677400Qhe != null ? LIZ(c677400Qhe) : null;
            this.LJIIIIZZ = c1540620qC4LIZ;
            C0HA4 c0ha42 = this.LJI;
            if (c0ha42 != null && c1540620qC4LIZ != null && (c678140Qiq = this.LJII) != null) {
                c678140Qiq.LJ = mapLJIIJ;
                if (!mapLJIIJ.isEmpty()) {
                    MixPageViewModel mixPageViewModel2 = c678140Qiq.LJIIL;
                    if (mixPageViewModel2 == null) {
                        mixPageViewModel2 = null;
                    }
                    ((LinkedHashMap) mixPageViewModel2.LLILLL).clear();
                    mixPageViewModel2.LLILLL.putAll(mapLJIIJ);
                }
                c678140Qiq.LJIIZILJ = c1540620qC4LIZ;
                MixPageViewModel mixPageViewModel3 = c678140Qiq.LJIIL;
                if (mixPageViewModel3 == null) {
                    mixPageViewModel3 = null;
                }
                mixPageViewModel3.LLJILLL = c1540620qC4LIZ;
                c678140Qiq.LIZJ = c0ha42;
                LinearLayout linearLayout = c678140Qiq.LIZLLL;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                C786410Ut5.hd(linearLayout, 0.0f);
                c678140Qiq.LJIJ = null;
                C15WQ c15wq = c678140Qiq.LJIILJJIL;
                if (c15wq != null) {
                    c15wq.LJIIL();
                }
                c678140Qiq.LJIILJJIL = null;
                c678140Qiq.LIZJ();
            }
            for (C0DXR c0dxr : this.LJIIL.LIZ()) {
                C0HA4 c0ha43 = this.LJI;
                if (c0ha43 != null) {
                    c0ha43.addItemDecoration(c0dxr);
                }
            }
            this.LJIIJJI.LIZIZ();
            C07OE.LIZ.getClass();
            String strLIZ = C07OE.LIZ();
            int iHashCode = strLIZ.hashCode();
            if (iHashCode == -1298848381) {
                if (strLIZ.equals("enable")) {
                    this.LJIILL.LIZIZ();
                }
            } else if (iHashCode == 109935) {
                strLIZ.equals("off");
            } else if (iHashCode == 1671308008 && strLIZ.equals("disable")) {
                this.LJIILL.LIZIZ();
                this.LJIILL.LLILZIL = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r3
      0x0048: PHI (r3v33 X.0lX0) = (r3v15 X.0lX0), (r3v38 X.0lX0) binds: [B:60:0x0178, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1540620qC4 LIZ(X.C677400Qhe r28) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C678130Qip.LIZ(X.0Qhe):X.0qC4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel] */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel] */
    /* JADX WARN: Type inference failed for: r2v31, types: [com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel] */
    /* JADX WARN: Type inference failed for: r2v34, types: [com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r5v15, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r5v19, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    public final void LIZIZ(C677400Qhe c677400Qhe) {
        C676680QgU c676680QgU;
        C678230Qiz c678230Qiz;
        InterfaceC678050Qih interfaceC678050Qih;
        C676510QgD c676510QgD;
        final AwS659S0100000_10 awS659S0100000_10;
        AbstractC677500Qho abstractC677500Qho;
        final Function0<C675270QeD> function0LIZJ;
        AwS624S0100000_10 awS624S0100000_10;
        AwS554S0100000_10 awS554S0100000_10;
        C676510QgD c676510QgD2;
        AbstractC677510Qhp abstractC677510Qhp;
        C676510QgD c676510QgD3;
        InterfaceC675320QeI interfaceC675320QeI;
        InterfaceC676520QgE interfaceC676520QgEM;
        C678140Qiq c678140Qiq;
        LifecycleOwner lifecycleOwner;
        SearchResultParam searchResultParam;
        String enterSearchFrom;
        C678130Qip c678130Qip;
        LifecycleOwner lifecycleOwner2;
        MixPageViewModel mixPageViewModel;
        AssemVMLazy assemVMLazy;
        List<InterfaceC677850QiN<? extends AbstractC677870QiP, ? extends AbstractC677840QiM>> list;
        Iterable iterable;
        List<Class<? extends MixAssemPowerCell<?, ?>>> list2;
        Iterable iterable2;
        final Function0<C675270QeD> function0LIZJ2;
        AwS624S0100000_10 awS624S0100000_102;
        AwS554S0100000_10 awS554S0100000_102;
        C676510QgD c676510QgD4;
        C676510QgD c676510QgD5;
        InterfaceC675320QeI interfaceC675320QeI2;
        final AwS659S0100000_10 awS659S0100000_102;
        LifecycleOwner lifecycleOwner3;
        MixShopSearchBizVM mixShopSearchBizVM;
        NextLiveData<Boolean> nextLiveData;
        C676490QgB c676490QgB;
        final C678510QjR c678510QjR;
        this.LJIIJ = c677400Qhe;
        this.LJIIIZ = c677400Qhe.LIZ.LIZ;
        LIZJ();
        LJ(this.LJIIJJI);
        LJ(this.LJIIL);
        LJ(this.LJIILIIL);
        LJ(this.LJIILLIIL);
        LJ(this.LJIILJJIL);
        LJ(this.LJIILL);
        C678200Qiw c678200Qiw = this.LJIIJJI;
        c678200Qiw.getClass();
        C677400Qhe c677400Qhe2 = this.LJIIJ;
        if (c677400Qhe2 != null) {
            c676680QgU = c677400Qhe2.LJFF;
        } else {
            c676680QgU = null;
        }
        c678200Qiw.LLILLJJLI = c676680QgU;
        c678200Qiw.LL = this;
        c678200Qiw.LIZIZ();
        C678220Qiy c678220Qiy = this.LJIIL;
        c678220Qiy.LLILLJJLI = this;
        C677400Qhe c677400Qhe3 = this.LJIIJ;
        if (c677400Qhe3 != null) {
            c678230Qiz = c677400Qhe3.LIZ;
        } else {
            c678230Qiz = null;
        }
        c678220Qiy.LL = c678230Qiz;
        MixShopSearchBizVM mixShopSearchBizVM2 = this.LJ;
        c678220Qiy.LLILLL = mixShopSearchBizVM2;
        if (mixShopSearchBizVM2 != null && (c678510QjR = mixShopSearchBizVM2.LLJL) != null) {
            C20684815ws.LIZ(new InterfaceC20685415wy() { // from class: X.0Qj6
                @Override // X.InterfaceC20685415wy
                public final void LIZ(String str, Map<String, String> map) {
                }

                @Override // X.InterfaceC20685415wy
                public void onEvent(String str) {
                }

                @Override // X.InterfaceC20685415wy
                public final void onEvent(String str, JSONObject jSONObject) {
                    if (str == null) {
                        return;
                    }
                    try {
                        c678510QjR.LIZIZ(str, jSONObject);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
        }
        MixJSBAbility mixJSBAbility = this.LJIILIIL;
        mixJSBAbility.getClass();
        C677400Qhe c677400Qhe4 = this.LJIIJ;
        if (c677400Qhe4 != null && (c676490QgB = c677400Qhe4.LJII) != null) {
            interfaceC678050Qih = c676490QgB.LIZ;
        } else {
            interfaceC678050Qih = null;
        }
        mixJSBAbility.LLILLJJLI = interfaceC678050Qih;
        mixJSBAbility.LL = this;
        C677390Qhd c677390Qhd = this.LJIILLIIL;
        c677390Qhd.LLILZIL = this;
        if (c677400Qhe4 != null) {
            c676510QgD = c677400Qhe4.LJI;
        } else {
            c676510QgD = null;
        }
        c677390Qhd.LL = c676510QgD;
        c677390Qhd.LLILZ = this.LJ;
        C1DFH c1dfh = C0PEM.LIZ;
        c677390Qhd.LLILLJJLI = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
        C678130Qip c678130Qip2 = c677390Qhd.LLILZIL;
        if (c678130Qip2 != null && (lifecycleOwner3 = c678130Qip2.LJIIIZ) != null && (mixShopSearchBizVM = c677390Qhd.LLILZ) != null && (nextLiveData = mixShopSearchBizVM.LLJILLL) != null) {
            nextLiveData.observe(lifecycleOwner3, new AObserverS214S0100000_10(c677390Qhd, 114));
        }
        this.LJIILJJIL.LL = this;
        this.LJIIIIZZ = LIZ(c677400Qhe);
        EnumC675760Qf0 enumC675760Qf0 = c677400Qhe.LIZJ;
        int[] iArr = C675780Qf2.LIZ;
        int i = iArr[enumC675760Qf0.ordinal()];
        if (i != 1) {
            if (i == 2) {
                final MixShopSearchBizVM mixShopSearchBizVM3 = this.LJ;
                C677390Qhd c677390Qhd2 = this.LJIILLIIL;
                if (c677390Qhd2 != null) {
                    awS659S0100000_102 = c677390Qhd2.LLILZLL;
                } else {
                    awS659S0100000_102 = null;
                }
                final AwS624S0100000_10 awS624S0100000_103 = this.LJIILL.LLJ;
                final C677400Qhe c677400Qhe5 = this.LJIIJ;
                abstractC677500Qho = new AbstractC677500Qho(mixShopSearchBizVM3, c677400Qhe5, awS624S0100000_103, awS659S0100000_102) { // from class: X.0Qdx
                    public final EnumC675160Qe2 LJIIIZ = EnumC675160Qe2.PHOTO_SEARCH;

                    @Override // X.AbstractC677500Qho
                    public final String LJIIJ() {
                        return "/aweme/v1/search/photo/bff/ecom/";
                    }

                    @Override // X.AbstractC677500Qho
                    public final EnumC675160Qe2 LJIIJJI() {
                        return this.LJIIIZ;
                    }

                    @Override // X.AbstractC677500Qho
                    public final Map<String, String> LJIIIIZZ(C675150Qe1 c675150Qe1) {
                        C674850QdX c674850QdX = c675150Qe1.LJII;
                        if (c674850QdX == null) {
                            c674850QdX = new C674850QdX(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String str = c674850QdX.apiVersion;
                        if (str != null) {
                            linkedHashMap.put("x-api-version", str);
                        }
                        return linkedHashMap;
                    }

                    @Override // X.AbstractC677500Qho
                    public final Map<String, Object> LJIIIZ(C675150Qe1 c675150Qe1) {
                        C674850QdX c674850QdX = c675150Qe1.LJII;
                        if (c674850QdX != null) {
                            return C674840QdW.LIZIZ(c674850QdX, c675150Qe1);
                        }
                        return new LinkedHashMap();
                    }

                    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.lang.String] */
                    @Override // X.AbstractC677500Qho
                    public final C15O7<C1515820pY4<n>> LJ(List<C080U> list3, C675150Qe1 c675150Qe1) {
                        String str;
                        C674850QdX c674850QdX = c675150Qe1.LJII;
                        if (c674850QdX == null) {
                            c674850QdX = new C674850QdX(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                        }
                        String str2 = c675150Qe1.LJ;
                        C674890Qdb c674890Qdb = MixPhotoSearchPreload.Companion;
                        Integer numValueOf = Integer.valueOf(c675150Qe1.LJIIIZ);
                        c674890Qdb.getClass();
                        final C674940Qdg c674940QdgLIZ = C674890Qdb.LIZ(c674850QdX, numValueOf);
                        final String strValueOf = String.valueOf(c674940QdgLIZ.hashCode());
                        final long jCurrentTimeMillis = System.currentTimeMillis();
                        final C259800zU c259800zU = new C259800zU();
                        System.currentTimeMillis();
                        Thread threadU3 = C786410Ut5.u3();
                        threadU3.getName();
                        threadU3.getId();
                        ConcurrentHashMap<String, C674980Qdk> concurrentHashMap = C674810QdT.LIZJ;
                        C674980Qdk c674980Qdk = concurrentHashMap.get("/aweme/v1/search/photo/bff/ecom/");
                        if (c674980Qdk != null) {
                            C674790QdR.LIZ.getClass();
                            if (System.currentTimeMillis() - c674980Qdk.LIZJ > C1208504o7.LIZ) {
                                concurrentHashMap.remove("/aweme/v1/search/photo/bff/ecom/");
                            } else {
                                c259800zU.element = C675070Qdt.LIZ("/aweme/v1/search/photo/bff/ecom/", new InterfaceC675210Qe7() { // from class: X.0QdY
                                    @Override // X.InterfaceC675210Qe7
                                    public final void LIZ(String str3, boolean z, boolean z2) {
                                        if (!z2) {
                                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                                            String str4 = strValueOf;
                                            C674940Qdg c674940Qdg = c674940QdgLIZ;
                                            long j = jCurrentTimeMillis;
                                            try {
                                                ConcurrentHashMap<String, C674980Qdk> concurrentHashMap2 = C674810QdT.LIZJ;
                                                C674980Qdk c674980Qdk2 = concurrentHashMap2.get("/aweme/v1/search/photo/bff/ecom/");
                                                if (c674980Qdk2 != null) {
                                                    C674790QdR.LIZ.getClass();
                                                    if (System.currentTimeMillis() - c674980Qdk2.LIZJ > C1208504o7.LIZ) {
                                                        concurrentHashMap2.remove("/aweme/v1/search/photo/bff/ecom/");
                                                    } else {
                                                        concurrentHashMap2.remove("/aweme/v1/search/photo/bff/ecom/");
                                                        Intrinsics.LJFF(c674980Qdk2.LIZ, str4);
                                                        Map mapLIZ = C674810QdT.LIZ(c674980Qdk2.LIZIZ, c674940Qdg);
                                                        long j2 = jCurrentTimeMillis2 - c674980Qdk2.LIZJ;
                                                        long j3 = jCurrentTimeMillis2 - j;
                                                        long j4 = j2 - j3;
                                                        if (z) {
                                                            C674940Qdg c674940Qdg2 = c674980Qdk2.LIZIZ;
                                                            C674810QdT.LJI("/aweme/v1/search/photo/bff/ecom/", mapLIZ, j2, j3, j4, c674940Qdg2.LJIIIZ, c674940Qdg2.LJ, c674940Qdg2.LJI, "photo_search");
                                                        } else {
                                                            C674940Qdg c674940Qdg3 = c674980Qdk2.LIZIZ;
                                                            C674810QdT.LJII("/aweme/v1/search/photo/bff/ecom/", mapLIZ, j2, j3, j4, c674940Qdg3.LJIIIZ, c674940Qdg3.LJ, c674940Qdg3.LJI, "photo_search");
                                                        }
                                                    }
                                                }
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                            String str5 = c259800zU.element;
                                            if (str5 != null) {
                                                C675070Qdt.LIZ.remove(str5);
                                            }
                                        }
                                    }
                                });
                            }
                        }
                        AwS78S1300000_10 awS78S1300000_10 = new AwS78S1300000_10(c674850QdX, c675150Qe1, c674940QdgLIZ, str2, 1);
                        if (C04UK.LIZ()) {
                            C675130Qdz c675130QdzLJIILIIL = C2191431Aph.LIZ.LJIILIIL(C675190Qe5.LIZ, C2097908Jt.LIZJ(new Pair("key_preload_hash", String.valueOf(C674890Qdb.LIZ(c674850QdX, Integer.valueOf(c675150Qe1.LJIIIZ)).hashCode()))), Collections.singletonList("key_preload_hash"));
                            C674810QdT.LIZLLL(c675130QdzLJIILIIL.LIZIZ, "/aweme/v1/search/photo/bff/ecom/", c674850QdX.rootEnterFromType, c674850QdX.enterFrom, c674850QdX.searchSource, "photo_search", c675130QdzLJIILIIL.LIZ);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[photo][consume] AB=ON framework=chunk_deferred hit=");
                            sbLIZ.append(c675130QdzLJIILIIL.LIZIZ.LIZ);
                            sbLIZ.append(" use=");
                            if (c675130QdzLJIILIIL.LIZ != null) {
                                str = "preloadCache";
                            } else {
                                str = "fallback";
                            }
                            sbLIZ.append(str);
                            C2188811AlT.LIZIZ(sbLIZ);
                            C15O7 c15o7 = c675130QdzLJIILIIL.LIZ;
                            if (c15o7 == null) {
                                return (C15O7) awS78S1300000_10.invoke();
                            }
                            return c15o7;
                        }
                        return (C15O7) awS78S1300000_10.invoke();
                    }

                    @Override // X.AbstractC677500Qho
                    public final n LJIIZILJ(Map map, Map map2) {
                        return ((EcSearchMixApi.RealApi) EcSearchMixApi.LIZIZ.getValue()).refreshPhotoContentListPost(map, map2).get();
                    }

                    @Override // X.AbstractC677500Qho
                    public final void LJIIL(n nVar, C1422405hW c1422405hW, C675150Qe1 c675150Qe1, boolean z) {
                        C676510QgD c676510QgD6;
                        InterfaceC675320QeI interfaceC675320QeI3;
                        C677400Qhe c677400Qhe6 = this.LIZIZ;
                        if (c677400Qhe6 != null && (c676510QgD6 = c677400Qhe6.LJI) != null && (interfaceC675320QeI3 = c676510QgD6.LIZ) != null) {
                            interfaceC675320QeI3.LIZLLL(c1422405hW, c675150Qe1, z);
                        }
                    }

                    @Override // X.AbstractC677500Qho
                    public final Object LJIJ(Context context, C675270QeD c675270QeD, C677540Qhs c677540Qhs, MixPageViewModel mixPageViewModel2, InterfaceC346701Wf<? super AbstractC677910QiT<C1422405hW>> interfaceC346701Wf, InterfaceC1364105Vn<? super C1422405hW> interfaceC1364105Vn) {
                        LJI(c677540Qhs, mixPageViewModel2, c675270QeD);
                        return null;
                    }
                };
            } else {
                throw new C1954807lC();
            }
        } else {
            final MixShopSearchBizVM mixShopSearchBizVM4 = this.LJ;
            C677390Qhd c677390Qhd3 = this.LJIILLIIL;
            if (c677390Qhd3 != null) {
                awS659S0100000_10 = c677390Qhd3.LLILZLL;
            } else {
                awS659S0100000_10 = null;
            }
            final AwS624S0100000_10 awS624S0100000_104 = this.LJIILL.LLJ;
            final C677400Qhe c677400Qhe6 = this.LJIIJ;
            abstractC677500Qho = new AbstractC677500Qho(mixShopSearchBizVM4, c677400Qhe6, awS624S0100000_104, awS659S0100000_10) { // from class: X.0Qdy
                public final EnumC675160Qe2 LJIIIZ = EnumC675160Qe2.SHOP_SEARCH_RESULT;

                @Override // X.AbstractC677500Qho
                public final String LJIIJ() {
                    return "/aweme/v1/search/stream/bff/ecom/";
                }

                @Override // X.AbstractC677500Qho
                public final EnumC675160Qe2 LJIIJJI() {
                    return this.LJIIIZ;
                }

                @Override // X.AbstractC677500Qho
                public final Map<String, String> LJIIIIZZ(C675150Qe1 c675150Qe1) {
                    Map<String, Object> mapLIZ = C674840QdW.LIZ(c675150Qe1.LJFF);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZ.size()));
                    for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                    return linkedHashMap;
                }

                @Override // X.AbstractC677500Qho
                public final Map<String, Object> LJIIIZ(C675150Qe1 c675150Qe1) {
                    return C674840QdW.LIZJ(c675150Qe1.LJFF);
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.AbstractC677500Qho
                public final C15O7<C1515820pY4<n>> LJ(List<C080U> list3, C675150Qe1 c675150Qe1) {
                    String str;
                    C674800QdS c674800QdS = c675150Qe1.LJFF;
                    AwS32S2200000_10 awS32S2200000_10 = new AwS32S2200000_10(c674800QdS, (C674800QdS) c675150Qe1.LIZLLL, c675150Qe1.LJ, (String) list3, (List<C080U>) 1);
                    if (!C04UK.LIZ()) {
                        return (C15O7) awS32S2200000_10.invoke();
                    }
                    C675130Qdz c675130QdzLJIILIIL = C2191431Aph.LIZ.LJIILIIL(C675180Qe4.LIZ, C2097908Jt.LIZJ(new Pair("key_preload_hash", String.valueOf(c674800QdS.hashCode()))), Collections.singletonList("key_preload_hash"));
                    if (((Boolean) C1105004Tw.LIZ.getValue()).booleanValue()) {
                        final C674880Qda c674880Qda = c675130QdzLJIILIIL.LIZIZ;
                        final Integer num = c674800QdS.rootEnterFromType;
                        final String str2 = c674800QdS.enterFrom;
                        final String str3 = c674800QdS.searchSource;
                        C15O7<C1515820pY4<T>> c15o7 = c675130QdzLJIILIIL.LIZ;
                        try {
                            final C674990Qdl c674990QdlLIZJ = C674810QdT.LIZJ("/aweme/v1/search/stream/bff/ecom/");
                            if (c674990QdlLIZJ != null) {
                                if (c674880Qda.LIZ && c15o7 != 0) {
                                    c15o7.LIZLLL((InterfaceC2385309Wh<C1515820pY4<T>, TContinuationResult>) new InterfaceC2385309Wh() { // from class: X.0Qdc
                                        public final /* synthetic */ String LIZIZ = "/aweme/v1/search/stream/bff/ecom/";
                                        public final /* synthetic */ String LJFF = "goods_search";

                                        @Override // X.InterfaceC2385309Wh
                                        public final Object then(C15O7 c15o72) {
                                            C1C7U.LIZ("PreloadCacheHitRateTracker@5e37.recordShopActualRequestByMonitor$1");
                                            C674810QdT.LJFF(c674880Qda, this.LIZIZ, num, str2, str3, this.LJFF, System.currentTimeMillis(), Long.valueOf(c674990QdlLIZJ.LIZJ));
                                            C1C7U.LIZIZ("PreloadCacheHitRateTracker@5e37.recordShopActualRequestByMonitor$1");
                                            return c15o72;
                                        }
                                    });
                                } else {
                                    C674810QdT.LJFF(c674880Qda, "/aweme/v1/search/stream/bff/ecom/", num, str2, str3, "goods_search", c674880Qda.LJI, Long.valueOf(c674990QdlLIZJ.LIZJ));
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else {
                        C674810QdT.LIZLLL(c675130QdzLJIILIIL.LIZIZ, "/aweme/v1/search/stream/bff/ecom/", c674800QdS.rootEnterFromType, c674800QdS.enterFrom, c674800QdS.searchSource, "goods_search", c675130QdzLJIILIIL.LIZ);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[shop][consume] AB=ON framework=chunk_deferred hit=");
                    sbLIZ.append(c675130QdzLJIILIIL.LIZIZ.LIZ);
                    sbLIZ.append(" use=");
                    if (c675130QdzLJIILIIL.LIZ != 0) {
                        str = "preloadCache";
                    } else {
                        str = "fallback";
                    }
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C15O7<C1515820pY4<T>> c15o72 = c675130QdzLJIILIIL.LIZ;
                    if (c15o72 == 0) {
                        return (C15O7) awS32S2200000_10.invoke();
                    }
                    return c15o72;
                }

                @Override // X.AbstractC677500Qho
                public final n LJIIZILJ(Map map, Map map2) {
                    return EcSearchMixApi.LIZIZ(map, map2);
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.AbstractC677500Qho
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJIIL(com.google.gson.n r4, X.C1422405hW r5, X.C675150Qe1 r6, boolean r7) {
                    /*
                        r3 = this;
                        java.lang.String r0 = "skin_type"
                        com.google.gson.k r0 = r4.LJJIIZ(r0)
                        if (r0 == 0) goto L5f
                        int r1 = r0.LJIIJJI()
                        if (r1 == 0) goto L44
                        r0 = 1
                        if (r1 == r0) goto L2d
                        r0 = 2
                        if (r1 != r0) goto L5f
                        java.lang.String r0 = "big_sale_skin"
                        com.google.gson.k r2 = r4.LJJIIZ(r0)     // Catch: java.lang.Exception -> L5b
                        if (r2 == 0) goto L5f
                        com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()     // Catch: java.lang.Exception -> L5b
                        com.google.gson.Gson r1 = r0.getGson()     // Catch: java.lang.Exception -> L5b
                        java.lang.Class<com.ss.android.ugc.aweme.search.result.PromotionSkin> r0 = com.ss.android.ugc.aweme.search.result.PromotionSkin.class
                        java.lang.Object r0 = r1.LIZJ(r2, r0)     // Catch: java.lang.Exception -> L5b
                        com.ss.android.ugc.aweme.search.result.PromotionSkin r0 = (com.ss.android.ugc.aweme.search.result.PromotionSkin) r0     // Catch: java.lang.Exception -> L5b
                        goto L60
                    L2d:
                        java.lang.String r0 = "shop_card_skin"
                        com.google.gson.k r2 = r4.LJJIIZ(r0)
                        if (r2 == 0) goto L5f
                        com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()
                        com.google.gson.Gson r1 = r0.getGson()
                        java.lang.Class<com.ss.android.ugc.aweme.search.result.ShopCardSkin> r0 = com.ss.android.ugc.aweme.search.result.ShopCardSkin.class
                        java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)
                        goto L60
                    L44:
                        java.lang.String r0 = "brand_skin"
                        com.google.gson.k r2 = r4.LJJIIZ(r0)
                        if (r2 == 0) goto L5f
                        com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()
                        com.google.gson.Gson r1 = r0.getGson()
                        java.lang.Class<com.ss.android.ugc.aweme.search.result.BrandSkin> r0 = com.ss.android.ugc.aweme.search.result.BrandSkin.class
                        java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)
                        goto L60
                    L5b:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    L5f:
                        r0 = 0
                    L60:
                        if (r7 == 0) goto L71
                        if (r0 != 0) goto L73
                        com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM r0 = r3.LIZ
                        com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<X.0QOD> r1 = r0.LLJILJILJ
                        X.0QVA r0 = new X.0QVA
                        r0.<init>()
                        r1.postValue(r0)
                    L70:
                        return
                    L71:
                        if (r0 == 0) goto L70
                    L73:
                        com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM r1 = r3.LIZ
                        com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<X.0QOD> r1 = r1.LLJILJILJ
                        r1.postValue(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C675120Qdy.LJIIL(com.google.gson.n, X.05hW, X.0Qe1, boolean):void");
                }

                @Override // X.AbstractC677500Qho
                public final Object LJIJ(Context context, C675270QeD c675270QeD, C677540Qhs c677540Qhs, MixPageViewModel mixPageViewModel2, InterfaceC346701Wf<? super AbstractC677910QiT<C1422405hW>> interfaceC346701Wf, InterfaceC1364105Vn<? super C1422405hW> interfaceC1364105Vn) {
                    return LJFF(c675270QeD, c677540Qhs, mixPageViewModel2, interfaceC346701Wf, interfaceC1364105Vn);
                }
            };
        }
        int i2 = iArr[c677400Qhe.LIZJ.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                final MixShopSearchBizVM mixShopSearchBizVM5 = this.LJ;
                C677400Qhe c677400Qhe7 = this.LJIIJ;
                if (c677400Qhe7 != null && (c676510QgD5 = c677400Qhe7.LJI) != null && (interfaceC675320QeI2 = c676510QgD5.LIZ) != null) {
                    function0LIZJ2 = interfaceC675320QeI2.LIZJ();
                } else {
                    function0LIZJ2 = null;
                }
                C677390Qhd c677390Qhd4 = this.LJIILLIIL;
                if (c677390Qhd4 != null) {
                    awS624S0100000_102 = c677390Qhd4.LLIZ;
                    awS554S0100000_102 = c677390Qhd4.LLIZLLLIL;
                } else {
                    awS624S0100000_102 = null;
                    awS554S0100000_102 = null;
                }
                C677400Qhe c677400Qhe8 = this.LJIIJ;
                if (c677400Qhe8 != null) {
                    c676510QgD4 = c677400Qhe8.LJI;
                } else {
                    c676510QgD4 = null;
                }
                final C676510QgD c676510QgD6 = c676510QgD4;
                final AwS624S0100000_10 awS624S0100000_105 = awS624S0100000_102;
                final AwS554S0100000_10 awS554S0100000_103 = awS554S0100000_102;
                abstractC677510Qhp = new AbstractC677510Qhp(mixShopSearchBizVM5, function0LIZJ2, c676510QgD6, awS624S0100000_105, awS554S0100000_103) { // from class: X.0Qe8
                    public final C676510QgD LJFF;

                    @Override // X.AbstractC677510Qhp
                    public final Map<String, String> LJII(C675150Qe1 c675150Qe1) {
                        C674850QdX c674850QdX = c675150Qe1.LJII;
                        if (c674850QdX == null) {
                            c674850QdX = new C674850QdX(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String str = c674850QdX.apiVersion;
                        if (str != null) {
                            linkedHashMap.put("x-api-version", str);
                        }
                        return linkedHashMap;
                    }

                    @Override // X.AbstractC677510Qhp
                    public final Map<String, Object> LJIIIIZZ(C675150Qe1 c675150Qe1) {
                        C674850QdX c674850QdX = c675150Qe1.LJII;
                        if (c674850QdX != null) {
                            return C674840QdW.LIZIZ(c674850QdX, c675150Qe1);
                        }
                        return new LinkedHashMap();
                    }

                    @Override // X.AbstractC677510Qhp
                    public final C15O7<C1515820pY4<n>> LIZLLL(Map<String, String> map, Map<String, String> map2) {
                        EcSearchMixApi.RealApi realApi = (EcSearchMixApi.RealApi) ((InterfaceC2661011f) C452501pT.LIZIZ(new AwS95S1000000_10(EcSearchMixApi.LIZ, 13)).getValue()).create(EcSearchMixApi.RealApi.class);
                        if (realApi != null) {
                            return realApi.loadMorePhotoMixListByChunkPost(map, map2);
                        }
                        return null;
                    }

                    @Override // X.AbstractC677510Qhp
                    public final void LJIIIZ(n nVar, C1422405hW c1422405hW, C675150Qe1 c675150Qe1, boolean z) {
                        InterfaceC675320QeI interfaceC675320QeI3;
                        C676510QgD c676510QgD7 = this.LJFF;
                        if (c676510QgD7 != null && (interfaceC675320QeI3 = c676510QgD7.LIZ) != null) {
                            interfaceC675320QeI3.LIZIZ();
                        }
                    }

                    {
                        this.LJFF = c676510QgD6;
                    }
                };
            } else {
                throw new C1954807lC();
            }
        } else {
            final MixShopSearchBizVM mixShopSearchBizVM6 = this.LJ;
            C677400Qhe c677400Qhe9 = this.LJIIJ;
            if (c677400Qhe9 != null && (c676510QgD3 = c677400Qhe9.LJI) != null && (interfaceC675320QeI = c676510QgD3.LIZ) != null) {
                function0LIZJ = interfaceC675320QeI.LIZJ();
            } else {
                function0LIZJ = null;
            }
            C677390Qhd c677390Qhd5 = this.LJIILLIIL;
            if (c677390Qhd5 != null) {
                awS624S0100000_10 = c677390Qhd5.LLIZ;
                awS554S0100000_10 = c677390Qhd5.LLIZLLLIL;
            } else {
                awS624S0100000_10 = null;
                awS554S0100000_10 = null;
            }
            C677400Qhe c677400Qhe10 = this.LJIIJ;
            if (c677400Qhe10 != null) {
                c676510QgD2 = c677400Qhe10.LJI;
            } else {
                c676510QgD2 = null;
            }
            final C676510QgD c676510QgD7 = c676510QgD2;
            final AwS624S0100000_10 awS624S0100000_106 = awS624S0100000_10;
            final AwS554S0100000_10 awS554S0100000_104 = awS554S0100000_10;
            abstractC677510Qhp = new AbstractC677510Qhp(mixShopSearchBizVM6, function0LIZJ, c676510QgD7, awS624S0100000_106, awS554S0100000_104) { // from class: X.0QeA
                public final C676510QgD LJFF;

                @Override // X.AbstractC677510Qhp
                public final Map<String, Object> LJ(C675150Qe1 c675150Qe1) {
                    Map<String, Object> mapLIZJ = C674840QdW.LIZJ(c675150Qe1.LJFF);
                    mapLIZJ.put("landing_page", 0);
                    mapLIZJ.put("count", Integer.valueOf(C675250QeB.LIZ()));
                    mapLIZJ.put("section_cursor", Long.valueOf(c675150Qe1.LIZIZ));
                    String strLIZJ = C2399609ak.LIZJ(this.LIZ.LLJI.getValue(), "search_id");
                    if (strLIZJ != null) {
                        mapLIZJ.put("search_id", strLIZJ);
                    }
                    String strLIZJ2 = C2399609ak.LIZJ(this.LIZ.LLJI.getValue(), "pre_search_id");
                    if (strLIZJ2 != null) {
                        mapLIZJ.put("last_search_id", strLIZJ2);
                    }
                    String str = this.LIZ.LLILZLL;
                    if (str != null) {
                        mapLIZJ.put("filter_origin_search_id", str);
                    }
                    Map<String, String> map = c675150Qe1.LJIIJJI;
                    if (map != null) {
                        mapLIZJ.putAll(map);
                    }
                    mapLIZJ.put("cursor", Long.valueOf(c675150Qe1.LIZ));
                    mapLIZJ.put("user_interaction_type", Integer.valueOf(EnumC676230Qfl.USER_INTERACTION_TYPE_LOAD_MORE.getValue()));
                    Map<String, String> map2 = c675150Qe1.LJFF.apiParamsInCurrentSearch;
                    Object obj = "";
                    if (map2 != null && map2.containsKey("pre_keyword")) {
                        String str2 = map2.get("pre_keyword");
                        if (str2 == null) {
                            str2 = "";
                        }
                        mapLIZJ.put("pre_keyword", str2);
                    }
                    if (!this.LIZ.LLILZIL.isEmpty()) {
                        Map<String, Object> map3 = this.LIZ.LLILZIL;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((LinkedHashMap) map3).entrySet()) {
                            if (!Intrinsics.LJFF(entry.getKey(), "last_search_pid_list")) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        mapLIZJ.putAll(linkedHashMap);
                        Object obj2 = ((LinkedHashMap) mapLIZJ).get("search_id");
                        if ((obj2 instanceof String) && obj2 != null && !this.LJ.containsKey(obj2) && Intrinsics.LJFF(((LinkedHashMap) this.LIZ.LLILZIL).get("is_hit_cache"), "1")) {
                            Object obj3 = ((LinkedHashMap) this.LIZ.LLILZIL).get("bizVM.backPassParamsMap");
                            if (obj3 != null) {
                                obj = obj3;
                            }
                            mapLIZJ.put("last_search_pid_list", obj);
                        }
                    }
                    return mapLIZJ;
                }

                @Override // X.AbstractC677510Qhp
                public final Map<String, String> LJII(C675150Qe1 c675150Qe1) {
                    Map<String, Object> mapLIZ = C674840QdW.LIZ(c675150Qe1.LJFF);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZ.size()));
                    for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                    return linkedHashMap;
                }

                @Override // X.AbstractC677510Qhp
                public final Map<String, Object> LJIIIIZZ(C675150Qe1 c675150Qe1) {
                    return C674840QdW.LIZJ(c675150Qe1.LJFF);
                }

                @Override // X.AbstractC677510Qhp
                public final C15O7<C1515820pY4<n>> LIZLLL(Map<String, String> map, Map<String, String> map2) {
                    C15O7<C1515820pY4<n>> c15o7DoMixSingleSearchChunkPost;
                    String str = EcSearchMixApi.LIZ;
                    boolean zLJI = MethodIDManager.LJI(137879);
                    EcSearchMixApi.RealApi realApi = (EcSearchMixApi.RealApi) ((InterfaceC2661011f) C452501pT.LIZIZ(new AwS95S1000000_10(EcSearchMixApi.LIZ, 13)).getValue()).create(EcSearchMixApi.RealApi.class);
                    if (realApi != null) {
                        c15o7DoMixSingleSearchChunkPost = realApi.doMixSingleSearchChunkPost(map, map2);
                    } else {
                        c15o7DoMixSingleSearchChunkPost = null;
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return c15o7DoMixSingleSearchChunkPost;
                }

                @Override // X.AbstractC677510Qhp
                public final n LJI(Map<String, Object> map, C675150Qe1 c675150Qe1) {
                    String str = EcSearchMixApi.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                    Iterator<T> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                    Map<String, Object> mapLIZ = C674840QdW.LIZ(c675150Qe1.LJFF);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZ.size()));
                    for (Map.Entry entry2 : ((LinkedHashMap) mapLIZ).entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
                    }
                    return EcSearchMixApi.LIZIZ(linkedHashMap, linkedHashMap2);
                }

                @Override // X.AbstractC677510Qhp
                public final void LJIIIZ(n nVar, C1422405hW c1422405hW, C675150Qe1 c675150Qe1, boolean z) {
                    InterfaceC675320QeI interfaceC675320QeI3;
                    C676510QgD c676510QgD8 = this.LJFF;
                    if (c676510QgD8 != null && (interfaceC675320QeI3 = c676510QgD8.LIZ) != null) {
                        interfaceC675320QeI3.LIZIZ();
                    }
                }

                {
                    this.LJFF = c676510QgD7;
                }
            };
        }
        C1540620qC4 c1540620qC4 = this.LJIIIIZZ;
        if (c1540620qC4 != null) {
            C678180Qiu c678180Qiu = new C678180Qiu();
            SAFHelper sAFHelper = SAFHelper.LIZ;
            ViewGroup viewGroup = this.LIZJ;
            C19EG c19eg = this.LIZ;
            sAFHelper.getClass();
            Context contextLJFF = SAFHelper.LJFF(viewGroup, c19eg);
            if (contextLJFF == null) {
                contextLJFF = this.LIZ;
            }
            c678180Qiu.LIZ = contextLJFF;
            C678230Qiz c678230Qiz2 = c677400Qhe.LIZ;
            c678180Qiu.LIZIZ = c678230Qiz2.LIZ;
            c678180Qiu.LJ = c678230Qiz2.LIZJ;
            C0HA4 c0ha4 = this.LJI;
            if (c0ha4 != null) {
                c678180Qiu.LIZJ = c0ha4;
                c678180Qiu.LIZLLL = this.LIZLLL;
                C678220Qiy c678220Qiy2 = this.LJIIL;
                c678220Qiy2.getClass();
                List<? extends Class<? extends MixAssemPowerCell<?, ?>>> listLJIIJJI = C1697810uHb.LJIIJJI(RefreshBallLoadingCell.class, FilterSortNoResultCell.class, GuessULikeTitleCell.class, NoResultJumpGSCell.class, SearchCorrectWordCell.class, MixLoadingFooterCell.class);
                C678230Qiz c678230Qiz3 = c678220Qiy2.LL;
                if (c678230Qiz3 != null && (list2 = c678230Qiz3.LJI) != null && !list2.isEmpty()) {
                    C678230Qiz c678230Qiz4 = c678220Qiy2.LL;
                    if (c678230Qiz4 == null || (iterable2 = c678230Qiz4.LJI) == null) {
                        iterable2 = C13BV.INSTANCE;
                    }
                    listLJIIJJI = C13LP.LJLIL(iterable2, listLJIIJJI);
                }
                c678180Qiu.LJI = listLJIIJJI;
                this.LJIIL.getClass();
                c678180Qiu.LJII = MultiSparkItemCell.class;
                C678220Qiy c678220Qiy3 = this.LJIIL;
                c678220Qiy3.getClass();
                List<InterfaceC677850QiN<AbstractC677870QiP, AbstractC677840QiM>> listLJIIJJI2 = C1697810uHb.LJIIJJI(new InterfaceC677850QiN<C678240Qj0, C677470Qhl>() { // from class: X.0Qj7
                    @Override // X.InterfaceC677850QiN
                    public final int getType() {
                        return -1;
                    }

                    @Override // X.InterfaceC677850QiN
                    public final AbstractC677870QiP LIZ(k kVar) {
                        return new C678240Qj0(kVar);
                    }

                    @Override // X.InterfaceC677850QiN
                    public final AbstractC677840QiM LIZIZ(AbstractC677870QiP abstractC677870QiP) {
                        return new C677470Qhl(abstractC677870QiP.LIZIZ + 50000);
                    }
                }, new InterfaceC677850QiN<C678850Qjz, C678830Qjx>() { // from class: X.0Qjy
                    @Override // X.InterfaceC677850QiN
                    public final int getType() {
                        return 1001;
                    }

                    @Override // X.InterfaceC677850QiN
                    public final AbstractC677870QiP LIZ(k kVar) {
                        return new C678850Qjz(kVar);
                    }

                    @Override // X.InterfaceC677850QiN
                    public final AbstractC677840QiM LIZIZ(AbstractC677870QiP abstractC677870QiP) {
                        return new AbstractC677840QiM() { // from class: X.0Qjx
                            @Override // X.AbstractC677840QiM, X.InterfaceC1891350zJl
                            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                if (interfaceC1891350zJl instanceof C678830Qjx) {
                                    AbstractC677870QiP abstractC677870QiP2 = this.LL;
                                    if (abstractC677870QiP2 instanceof C678850Qjz) {
                                        AbstractC677870QiP abstractC677870QiP3 = ((AbstractC677840QiM) interfaceC1891350zJl).LL;
                                        if (abstractC677870QiP3 instanceof C678850Qjz) {
                                            return Intrinsics.LJFF(((C678850Qjz) abstractC677870QiP2).LJI, ((C678850Qjz) abstractC677870QiP3).LJI);
                                        }
                                    }
                                }
                                return false;
                            }

                            @Override // X.AbstractC677840QiM, X.InterfaceC1891350zJl
                            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                AbstractC677870QiP abstractC677870QiP2;
                                Integer numValueOf;
                                String str;
                                if (!(interfaceC1891350zJl instanceof C678830Qjx) || (abstractC677870QiP2 = this.LL) == null) {
                                    return false;
                                }
                                AbstractC677840QiM abstractC677840QiM = (AbstractC677840QiM) interfaceC1891350zJl;
                                if (abstractC677840QiM.LL == null) {
                                    return false;
                                }
                                String str2 = null;
                                Integer numValueOf2 = Integer.valueOf(abstractC677870QiP2.LIZIZ);
                                AbstractC677870QiP abstractC677870QiP3 = abstractC677840QiM.LL;
                                if (abstractC677870QiP3 != null) {
                                    numValueOf = Integer.valueOf(abstractC677870QiP3.LIZIZ);
                                } else {
                                    numValueOf = null;
                                }
                                if (!Intrinsics.LJFF(numValueOf2, numValueOf)) {
                                    return false;
                                }
                                AbstractC677870QiP abstractC677870QiP4 = this.LL;
                                if (abstractC677870QiP4 != null) {
                                    str = abstractC677870QiP4.LIZJ;
                                } else {
                                    str = null;
                                }
                                AbstractC677870QiP abstractC677870QiP5 = abstractC677840QiM.LL;
                                if (abstractC677870QiP5 != null) {
                                    str2 = abstractC677870QiP5.LIZJ;
                                }
                                if (!Intrinsics.LJFF(str, str2)) {
                                    return false;
                                }
                                return true;
                            }
                        };
                    }
                }, new InterfaceC677850QiN<C678320Qj8, C678450QjL>() { // from class: X.0Qj4
                    @Override // X.InterfaceC677850QiN
                    public final int getType() {
                        return 1006;
                    }

                    @Override // X.InterfaceC677850QiN
                    public final AbstractC677870QiP LIZ(k kVar) {
                        return new C678320Qj8(kVar);
                    }

                    @Override // X.InterfaceC677850QiN
                    public final AbstractC677840QiM LIZIZ(AbstractC677870QiP abstractC677870QiP) {
                        AbstractC677840QiM abstractC677840QiM = new AbstractC677840QiM() { // from class: X.0QjL
                        };
                        abstractC677840QiM.LL = abstractC677870QiP;
                        abstractC677840QiM.LLILLJJLI = new MixStyle(0.0f, null, null, null, 1, false);
                        return abstractC677840QiM;
                    }
                }, new InterfaceC677850QiN<C678800Qju, C678740Qjo>() { // from class: X.0Qjv
                    @Override // X.InterfaceC677850QiN
                    public final int getType() {
                        return 1007;
                    }

                    @Override // X.InterfaceC677850QiN
                    public final AbstractC677870QiP LIZ(k kVar) {
                        return new C678800Qju(kVar);
                    }

                    @Override // X.InterfaceC677850QiN
                    public final AbstractC677840QiM LIZIZ(AbstractC677870QiP abstractC677870QiP) {
                        return new AbstractC677840QiM() { // from class: X.0Qjo
                            @Override // X.AbstractC677840QiM, X.InterfaceC1891350zJl
                            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                if (!(interfaceC1891350zJl instanceof C678740Qjo)) {
                                    return false;
                                }
                                AbstractC677870QiP abstractC677870QiP2 = this.LL;
                                if (!(abstractC677870QiP2 instanceof C678800Qju)) {
                                    return false;
                                }
                                AbstractC677840QiM abstractC677840QiM = (AbstractC677840QiM) interfaceC1891350zJl;
                                AbstractC677870QiP abstractC677870QiP3 = abstractC677840QiM.LL;
                                if (!(abstractC677870QiP3 instanceof C678800Qju) || !Intrinsics.LJFF(((C678800Qju) abstractC677870QiP2).LJI, ((C678800Qju) abstractC677870QiP3).LJI) || !Intrinsics.LJFF(((C678800Qju) this.LL).LJII, ((C678800Qju) abstractC677840QiM.LL).LJII)) {
                                    return false;
                                }
                                return true;
                            }

                            @Override // X.AbstractC677840QiM, X.InterfaceC1891350zJl
                            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                AbstractC677870QiP abstractC677870QiP2;
                                Integer numValueOf;
                                String str;
                                if (!(interfaceC1891350zJl instanceof C678740Qjo) || (abstractC677870QiP2 = this.LL) == null) {
                                    return false;
                                }
                                AbstractC677840QiM abstractC677840QiM = (AbstractC677840QiM) interfaceC1891350zJl;
                                if (abstractC677840QiM.LL == null) {
                                    return false;
                                }
                                String str2 = null;
                                Integer numValueOf2 = Integer.valueOf(abstractC677870QiP2.LIZIZ);
                                AbstractC677870QiP abstractC677870QiP3 = abstractC677840QiM.LL;
                                if (abstractC677870QiP3 != null) {
                                    numValueOf = Integer.valueOf(abstractC677870QiP3.LIZIZ);
                                } else {
                                    numValueOf = null;
                                }
                                if (!Intrinsics.LJFF(numValueOf2, numValueOf)) {
                                    return false;
                                }
                                AbstractC677870QiP abstractC677870QiP4 = this.LL;
                                if (abstractC677870QiP4 != null) {
                                    str = abstractC677870QiP4.LIZJ;
                                } else {
                                    str = null;
                                }
                                AbstractC677870QiP abstractC677870QiP5 = abstractC677840QiM.LL;
                                if (abstractC677870QiP5 != null) {
                                    str2 = abstractC677870QiP5.LIZJ;
                                }
                                if (!Intrinsics.LJFF(str, str2)) {
                                    return false;
                                }
                                return true;
                            }
                        };
                    }
                }, new InterfaceC677850QiN<C678760Qjq, C678780Qjs>() { // from class: X.0Qjt
                    @Override // X.InterfaceC677850QiN
                    public final int getType() {
                        return 1003;
                    }

                    @Override // X.InterfaceC677850QiN
                    public final AbstractC677870QiP LIZ(k kVar) {
                        return new C678760Qjq(kVar);
                    }

                    @Override // X.InterfaceC677850QiN
                    public final AbstractC677840QiM LIZIZ(AbstractC677870QiP abstractC677870QiP) {
                        return new AbstractC677840QiM() { // from class: X.0Qjs
                            @Override // X.AbstractC677840QiM, X.InterfaceC1891350zJl
                            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                if (!(interfaceC1891350zJl instanceof C678780Qjs)) {
                                    return false;
                                }
                                AbstractC677870QiP abstractC677870QiP2 = this.LL;
                                if (!(abstractC677870QiP2 instanceof C678760Qjq)) {
                                    return false;
                                }
                                AbstractC677840QiM abstractC677840QiM = (AbstractC677840QiM) interfaceC1891350zJl;
                                AbstractC677870QiP abstractC677870QiP3 = abstractC677840QiM.LL;
                                if (!(abstractC677870QiP3 instanceof C678760Qjq) || !Intrinsics.LJFF(((C678760Qjq) abstractC677870QiP2).LJI, ((C678760Qjq) abstractC677870QiP3).LJI) || !Intrinsics.LJFF(((C678760Qjq) this.LL).LJIIIIZZ, ((C678760Qjq) abstractC677840QiM.LL).LJIIIIZZ)) {
                                    return false;
                                }
                                return true;
                            }

                            @Override // X.AbstractC677840QiM, X.InterfaceC1891350zJl
                            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                AbstractC677870QiP abstractC677870QiP2;
                                Integer numValueOf;
                                String str;
                                if (!(interfaceC1891350zJl instanceof C678780Qjs) || (abstractC677870QiP2 = this.LL) == null) {
                                    return false;
                                }
                                AbstractC677840QiM abstractC677840QiM = (AbstractC677840QiM) interfaceC1891350zJl;
                                if (abstractC677840QiM.LL == null) {
                                    return false;
                                }
                                String str2 = null;
                                Integer numValueOf2 = Integer.valueOf(abstractC677870QiP2.LIZIZ);
                                AbstractC677870QiP abstractC677870QiP3 = abstractC677840QiM.LL;
                                if (abstractC677870QiP3 != null) {
                                    numValueOf = Integer.valueOf(abstractC677870QiP3.LIZIZ);
                                } else {
                                    numValueOf = null;
                                }
                                if (!Intrinsics.LJFF(numValueOf2, numValueOf)) {
                                    return false;
                                }
                                AbstractC677870QiP abstractC677870QiP4 = this.LL;
                                if (abstractC677870QiP4 != null) {
                                    str = abstractC677870QiP4.LIZJ;
                                } else {
                                    str = null;
                                }
                                AbstractC677870QiP abstractC677870QiP5 = abstractC677840QiM.LL;
                                if (abstractC677870QiP5 != null) {
                                    str2 = abstractC677870QiP5.LIZJ;
                                }
                                if (!Intrinsics.LJFF(str, str2)) {
                                    return false;
                                }
                                return true;
                            }
                        };
                    }
                });
                C678230Qiz c678230Qiz5 = c678220Qiy3.LL;
                if (c678230Qiz5 != null && (list = c678230Qiz5.LJII) != null && !list.isEmpty()) {
                    C678230Qiz c678230Qiz6 = c678220Qiy3.LL;
                    if (c678230Qiz6 == null || (iterable = c678230Qiz6.LJII) == null) {
                        iterable = C13BV.INSTANCE;
                    }
                    listLJIIJJI2 = C13LP.LJLIL(iterable, listLJIIJJI2);
                }
                for (InterfaceC677850QiN<AbstractC677870QiP, AbstractC677840QiM> interfaceC677850QiN : listLJIIJJI2) {
                    c678180Qiu.LJFF.put(Integer.valueOf(interfaceC677850QiN.getType()), interfaceC677850QiN);
                }
                c678180Qiu.LJIIJ = abstractC677500Qho;
                c678180Qiu.LJIIJJI = abstractC677510Qhp;
                c678180Qiu.LJIIL = c1540620qC4;
                c678140Qiq = new C678140Qiq();
                Context context = c678180Qiu.LIZ;
                if (context == null) {
                    context = null;
                }
                c678140Qiq.LIZ = context;
                LifecycleOwner lifecycleOwner4 = c678180Qiu.LIZIZ;
                if (lifecycleOwner4 == null) {
                    lifecycleOwner4 = null;
                }
                c678140Qiq.LIZIZ = lifecycleOwner4;
                C1540620qC4 c1540620qC42 = c678180Qiu.LJIIL;
                if (c1540620qC42 == null) {
                    c1540620qC42 = null;
                }
                c678140Qiq.LJIIZILJ = c1540620qC42;
                C0HA4 c0ha42 = c678180Qiu.LIZJ;
                if (c0ha42 == null) {
                    c0ha42 = null;
                }
                c678140Qiq.LIZJ = c0ha42;
                LinearLayout linearLayout = c678180Qiu.LIZLLL;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                c678140Qiq.LIZLLL = linearLayout;
                List<? extends Class<? extends MixAssemPowerCell<?, ?>>> list3 = c678180Qiu.LJI;
                if (list3 == null) {
                    list3 = null;
                }
                c678140Qiq.LJI = list3;
                Class<? extends PowerCell<? extends C14NM>> cls = c678180Qiu.LJII;
                if (cls == null) {
                    cls = null;
                }
                c678140Qiq.LJII = cls;
                c678140Qiq.LJIIIIZZ = c678180Qiu.LJIIIIZZ;
                AbstractC677860QiO abstractC677860QiO = c678180Qiu.LJIIJ;
                if (abstractC677860QiO == null) {
                    abstractC677860QiO = null;
                }
                c678140Qiq.LJIILL = abstractC677860QiO;
                AbstractC677860QiO abstractC677860QiO2 = c678180Qiu.LJIIJJI;
                if (abstractC677860QiO2 == null) {
                    abstractC677860QiO2 = null;
                }
                c678140Qiq.LJIILLIIL = abstractC677860QiO2;
                c678140Qiq.LJ = c678180Qiu.LJ;
                c678140Qiq.LJFF = c678180Qiu.LJFF;
                c678140Qiq.LJIIJ = c678180Qiu.LJIIIZ;
                c678140Qiq.LJIIIZ = true;
                if (lifecycleOwner4 == null) {
                    lifecycleOwner4 = null;
                }
                Fragment fragmentLIZIZ = C680780Qn6.LIZIZ(lifecycleOwner4);
                if (fragmentLIZIZ != null) {
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixPageViewModel.class);
                    C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 178);
                    AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(399);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZIZ, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragmentLIZIZ, true), new C338490DOt(fragmentLIZIZ, true), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) fragmentLIZIZ, 930), aFwS241S0000000_10, new C451460Hn6(fragmentLIZIZ, true), new C451620HnM(fragmentLIZIZ, true), new C987103tV(fragmentLIZIZ, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(fragmentLIZIZ, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragmentLIZIZ, c19719912DlLIZ), c5182020e, new AwS554S0100000_10(fragmentLIZIZ, 931), aFwS241S0000000_10, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZIZ, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragmentLIZIZ), C724750Sbp.LJIIIZ(fragmentLIZIZ), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) fragmentLIZIZ, 927), aFwS241S0000000_10, new C451460Hn6(fragmentLIZIZ, false), new C451620HnM(fragmentLIZIZ, false), new C987103tV(fragmentLIZIZ, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C678140Qiq.LJJI;
                    mixPageViewModel = (MixPageViewModel) assemVMLazy.getValue();
                } else {
                    C19EG c19egLIZ = C680780Qn6.LIZ(lifecycleOwner4);
                    if (c19egLIZ != null) {
                        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MixPageViewModel.class);
                        AssemVMLazy assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(c19egLIZ, c19719912DlLIZ2), new C5182020e((C13IQ) c19719912DlLIZ2, 172), new C452070Ho5(), C724750Sbp.LJII(c19egLIZ), C724750Sbp.LJIIIZ(c19egLIZ), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) c19egLIZ, 928), AFwS241S0000000_10.get$arr$(396));
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C678140Qiq.LJJI;
                        mixPageViewModel = (MixPageViewModel) assemVMLazy2.getValue();
                    } else {
                        throw new IllegalStateException("lifecycleOwner must be Fragment or FragmentActivity.");
                    }
                }
                c678140Qiq.LJIIL = mixPageViewModel;
                Map<String, Object> map = c678140Qiq.LJ;
                if (map != null && (!map.isEmpty())) {
                    MixPageViewModel mixPageViewModel2 = c678140Qiq.LJIIL;
                    if (mixPageViewModel2 == null) {
                        mixPageViewModel2 = null;
                    }
                    ((LinkedHashMap) mixPageViewModel2.LLILLL).clear();
                    mixPageViewModel2.LLILLL.putAll(map);
                }
                MixPageViewModel mixPageViewModel3 = c678140Qiq.LJIIL;
                if (mixPageViewModel3 == null) {
                    mixPageViewModel3 = null;
                }
                LifecycleOwner lifecycleOwner5 = c678140Qiq.LIZIZ;
                if (lifecycleOwner5 == null) {
                    lifecycleOwner5 = null;
                }
                Map<Integer, InterfaceC677850QiN<AbstractC677870QiP, AbstractC677840QiM>> map2 = c678140Qiq.LJFF;
                C1540620qC4 c1540620qC43 = c678140Qiq.LJIIZILJ;
                if (c1540620qC43 == null) {
                    c1540620qC43 = null;
                }
                mixPageViewModel3.getClass();
                mixPageViewModel3.LLILZ = new C1396605dM(lifecycleOwner5, mixPageViewModel3.LLILZLL, mixPageViewModel3.LLILZIL, map2);
                mixPageViewModel3.LLJILLL = c1540620qC43;
                mixPageViewModel3.xQ2(C678030Qif.LIZ);
                c678140Qiq.LIZJ();
                LifecycleOwner lifecycleOwner6 = c678140Qiq.LIZIZ;
                if (lifecycleOwner6 == null) {
                    lifecycleOwner6 = null;
                }
                Fragment fragmentLIZIZ2 = C680780Qn6.LIZIZ(lifecycleOwner6);
                if (fragmentLIZIZ2 != null) {
                    interfaceC676520QgEM = null;
                    C723850SaN.LIZ(fragmentLIZIZ2, false, null, new AwS368S0200000_2(c678140Qiq, fragmentLIZIZ2, 75), 3);
                } else {
                    interfaceC676520QgEM = null;
                    C19EG c19egLIZ2 = C680780Qn6.LIZ(lifecycleOwner6);
                    if (c19egLIZ2 != null) {
                        C723850SaN.LIZIZ(c19egLIZ2, new AwS368S0200000_2(c678140Qiq, c19egLIZ2, 76));
                    } else {
                        throw new IllegalStateException("lifecycleOwner must be Fragment or FragmentActivity.");
                    }
                }
                MixPageViewModel mixPageViewModel4 = c678140Qiq.LJIIL;
                ?? r2 = mixPageViewModel4;
                if (mixPageViewModel4 == null) {
                    r2 = interfaceC676520QgEM;
                }
                MutableLiveData<C1397905dZ> mutableLiveData = r2.LLILZIL;
                LifecycleOwner lifecycleOwner7 = c678140Qiq.LIZIZ;
                ?? r5 = lifecycleOwner7;
                if (lifecycleOwner7 == null) {
                    r5 = interfaceC676520QgEM;
                }
                mutableLiveData.observe(r5, new AObserverS214S0100000_10(c678140Qiq, 89));
                MixPageViewModel mixPageViewModel5 = c678140Qiq.LJIIL;
                ?? r22 = mixPageViewModel5;
                if (mixPageViewModel5 == null) {
                    r22 = interfaceC676520QgEM;
                }
                NextLiveData<C678110Qin> nextLiveData2 = r22.LLJI;
                LifecycleOwner lifecycleOwner8 = c678140Qiq.LIZIZ;
                ?? r52 = lifecycleOwner8;
                if (lifecycleOwner8 == null) {
                    r52 = interfaceC676520QgEM;
                }
                nextLiveData2.observe(r52, new AObserverS214S0100000_10(c678140Qiq, 90));
                MixPageViewModel mixPageViewModel6 = c678140Qiq.LJIIL;
                ?? r23 = mixPageViewModel6;
                if (mixPageViewModel6 == null) {
                    r23 = interfaceC676520QgEM;
                }
                NextLiveData<Integer> nextLiveData3 = r23.LLJILJIL;
                LifecycleOwner lifecycleOwner9 = c678140Qiq.LIZIZ;
                ?? r53 = lifecycleOwner9;
                if (lifecycleOwner9 == null) {
                    r53 = interfaceC676520QgEM;
                }
                nextLiveData3.observe(r53, new AObserverS214S0100000_10(c678140Qiq, 91));
                MixPageViewModel mixPageViewModel7 = c678140Qiq.LJIIL;
                ?? r24 = mixPageViewModel7;
                if (mixPageViewModel7 == null) {
                    r24 = interfaceC676520QgEM;
                }
                NextLiveData<Boolean> nextLiveData4 = r24.LLIZLLLIL;
                LifecycleOwner lifecycleOwner10 = c678140Qiq.LIZIZ;
                ?? r54 = lifecycleOwner10;
                if (lifecycleOwner10 == null) {
                    r54 = interfaceC676520QgEM;
                }
                nextLiveData4.observe(r54, new AObserverS214S0100000_10(c678140Qiq, 92));
            } else {
                "mixPowerList should be initialized".toString();
                throw new IllegalStateException("mixPowerList should be initialized");
            }
        } else {
            interfaceC676520QgEM = null;
            c678140Qiq = null;
        }
        this.LJII = c678140Qiq;
        for (C0DXR c0dxr : this.LJIIL.LIZ()) {
            C0HA4 c0ha43 = this.LJI;
            if (c0ha43 != null) {
                c0ha43.addItemDecoration(c0dxr);
            }
        }
        C678140Qiq c678140Qiq2 = this.LJII;
        if (c678140Qiq2 != null) {
            this.LJIIL.getClass();
            ((List) c678140Qiq2.LJIJI.getValue()).add(new InterfaceC678410QjH(this) { // from class: X.0Qis
                public final C678130Qip LIZ;
                public final C678140Qiq LIZIZ;
                public final C678230Qiz LIZJ;
                public final MixShopSearchBizVM LIZLLL;
                public C678430QjJ LJ;

                {
                    C678230Qiz c678230Qiz7;
                    this.LIZ = this;
                    this.LIZIZ = this.LJII;
                    C677400Qhe c677400Qhe11 = this.LJIIJ;
                    if (c677400Qhe11 != null) {
                        c678230Qiz7 = c677400Qhe11.LIZ;
                    } else {
                        c678230Qiz7 = null;
                    }
                    this.LIZJ = c678230Qiz7;
                    this.LIZLLL = this.LJ;
                    C678430QjJ c678430QjJ = new C678430QjJ();
                    c678430QjJ.LL = new C678440QjK();
                    c678430QjJ.LLILLJJLI = new MixStyle(0.0f, null, null, null, 1, false);
                    this.LJ = c678430QjJ;
                }

                @Override // X.InterfaceC678410QjH
                public final void LIZ(C1397905dZ c1397905dZ) {
                    EComSearchBffResp eComSearchBffResp;
                    MixStyle mixStyle;
                    BackgroundStyle backgroundStyle;
                    C0HA4 c0ha44;
                    Context context2;
                    C0HA4 c0ha45;
                    InterfaceC678420QjI interfaceC678420QjI;
                    StaggeredGridLayoutManager staggeredGridLayoutManager;
                    if (c1397905dZ.LIZLLL == EnumC1396905dP.REFRESH_CONTENT.getValue()) {
                        C0HA4 c0ha46 = this.LIZ.LJI;
                        RecyclerView.LayoutManager layoutManager = null;
                        if (c0ha46 != null) {
                            layoutManager = c0ha46.getLayoutManager();
                        }
                        if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
                            staggeredGridLayoutManager.scrollToPositionWithOffset(0, 0);
                        }
                        C678230Qiz c678230Qiz7 = this.LIZJ;
                        if (c678230Qiz7 != null && (interfaceC678420QjI = c678230Qiz7.LIZIZ) != null) {
                            interfaceC678420QjI.LIZ();
                        }
                    }
                    try {
                        C1422405hW c1422405hW = c1397905dZ.LIZJ;
                        if (c1422405hW != null && (eComSearchBffResp = c1422405hW.LIZ) != null && (mixStyle = eComSearchBffResp.style) != null && (backgroundStyle = mixStyle.bgStyle) != null && backgroundStyle.lightColor.length() > 0 && backgroundStyle.darkColor.length() > 0 && (c0ha44 = this.LIZ.LJI) != null && (context2 = c0ha44.getContext()) != null && (c0ha45 = this.LIZ.LJI) != null) {
                            int itemDecorationCount = c0ha45.getItemDecorationCount();
                            boolean z = false;
                            for (int i3 = 0; i3 < itemDecorationCount && !z; i3++) {
                                C0DXR itemDecorationAt = c0ha45.getItemDecorationAt(i3);
                                if (itemDecorationAt != null && (itemDecorationAt instanceof C0HA2)) {
                                    ((C0HA2) itemDecorationAt).LJFF(context2, backgroundStyle.lightColor, backgroundStyle.darkColor);
                                    z = true;
                                }
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.List<X.0QiM>] */
                /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Collection, java.util.List] */
                /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r5v8 */
                /* JADX WARN: Type inference failed for: r5v9 */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.InterfaceC678410QjH
                public final List<AbstractC677840QiM> LIZIZ(List<AbstractC677840QiM> list4) {
                    ?? arrayList;
                    List<Integer> list5;
                    C15WQ c15wq;
                    Integer numValueOf;
                    MixPageViewModel mixPageViewModel8;
                    C1396605dM c1396605dM;
                    C1397505dV c1397505dV;
                    MixPageViewModel mixPageViewModel9;
                    C1396605dM c1396605dM2;
                    C1397505dV c1397505dV2;
                    CopyOnWriteArrayList<C1397705dX> copyOnWriteArrayList;
                    AbstractC677870QiP abstractC677870QiP;
                    ?? r25;
                    list4.remove(this.LJ);
                    if (!list4.isEmpty()) {
                        h hVar = new h();
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            AbstractC677870QiP abstractC677870QiP2 = ((AbstractC677840QiM) it2.next()).LL;
                            if (abstractC677870QiP2 != null) {
                                n nVar = new n();
                                nVar.LJJIII(Integer.valueOf(abstractC677870QiP2.LIZIZ), "biz_type");
                                nVar.LJJIIJ("item_id", abstractC677870QiP2.LIZJ);
                                hVar.LJJIFFI(nVar);
                            }
                        }
                        C678140Qiq c678140Qiq3 = this.LIZIZ;
                        if (c678140Qiq3 != null && (r25 = c678140Qiq3.LJIIL) != 0) {
                            n nVar2 = new n();
                            nVar2.LJJIFFI("itemList", hVar);
                            r25.wQ2(nVar2, "flatten_info");
                        }
                    }
                    C678140Qiq c678140Qiq4 = this.LIZIZ;
                    if (c678140Qiq4 != null && (mixPageViewModel9 = c678140Qiq4.LJIIL) != null && (c1396605dM2 = mixPageViewModel9.LLILZ) != null && (c1397505dV2 = c1396605dM2.LIZLLL) != null && (copyOnWriteArrayList = c1397505dV2.LIZ) != null && !copyOnWriteArrayList.isEmpty()) {
                        Iterator<C1397705dX> it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            long j = it3.next().LIZIZ;
                            if (j == 4 || j == 9 || j == 20) {
                                AbstractC677840QiM abstractC677840QiM = (AbstractC677840QiM) C13LP.LJJLIIIJL(list4);
                                if (abstractC677840QiM == null || (abstractC677870QiP = abstractC677840QiM.LL) == null || abstractC677870QiP.LIZIZ != 1006) {
                                    C678430QjJ c678430QjJ = new C678430QjJ();
                                    c678430QjJ.LL = new C678440QjK();
                                    c678430QjJ.LLILLJJLI = new MixStyle(0.0f, null, null, null, 1, false);
                                    this.LJ = c678430QjJ;
                                    list4.add(c678430QjJ);
                                }
                            }
                        }
                    }
                    C678140Qiq c678140Qiq5 = this.LIZIZ;
                    if (c678140Qiq5 != null && (mixPageViewModel8 = c678140Qiq5.LJIIL) != null && (c1396605dM = mixPageViewModel8.LLILZ) != null && (c1397505dV = c1396605dM.LIZLLL) != null) {
                        arrayList = c1397505dV.LIZ();
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    arrayList.isEmpty();
                    if (arrayList.isEmpty()) {
                        arrayList = new ArrayList();
                        int i3 = 0;
                        for (Object obj : list4) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                Integer numValueOf2 = Integer.valueOf(i3);
                                numValueOf2.intValue();
                                Set<Integer> set = C07NY.LIZ;
                                AbstractC677870QiP abstractC677870QiP3 = ((AbstractC677840QiM) obj).LL;
                                if (abstractC677870QiP3 != null) {
                                    numValueOf = Integer.valueOf(abstractC677870QiP3.LIZIZ);
                                } else {
                                    numValueOf = null;
                                }
                                if (C13LP.LJJJJ(numValueOf, set)) {
                                    arrayList.add(numValueOf2);
                                }
                                i3 = i4;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        C678140Qiq c678140Qiq6 = this.LIZIZ;
                        if (c678140Qiq6 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (((Number) obj2).intValue() >= 0) {
                                    arrayList2.add(obj2);
                                }
                            }
                            if (!arrayList2.isEmpty() && (c15wq = c678140Qiq6.LJIILJJIL) != null) {
                                c15wq.LJI(arrayList2);
                            }
                        }
                        MixShopSearchBizVM mixShopSearchBizVM7 = this.LIZLLL;
                        if (mixShopSearchBizVM7 != null && (list5 = mixShopSearchBizVM7.LLJJJ) != null) {
                            ArrayList arrayList3 = (ArrayList) list5;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                        }
                    }
                    return list4;
                }
            });
        }
        C678140Qiq c678140Qiq3 = this.LJII;
        if (c678140Qiq3 != null) {
            this.LJIIL.getClass();
            ((List) c678140Qiq3.LJIJJ.getValue()).add(new C15WS(this) { // from class: X.0Qiv
                public final C678130Qip LIZ;

                @Override // X.C15WS
                public final void LIZ(int i3) {
                }

                {
                    this.LIZ = this;
                }

                @Override // X.C15WS
                public final void LIZJ(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
                    Integer numValueOf;
                    C21681819tI c21681819tI;
                    int i3;
                    C0HA4 c0ha44 = this.LIZ.LJI;
                    if (c0ha44 != null && (numValueOf = Integer.valueOf(c0ha44.getChildCount())) != null && numValueOf.intValue() > 0) {
                        int iIntValue = numValueOf.intValue();
                        for (int i4 = 0; i4 < iIntValue; i4++) {
                            View childAt = c0ha44.getChildAt(i4);
                            if (childAt.getLeft() > 0) {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null && !c21681819tI.LLILLJJLI) {
                                    Rect rect = new Rect();
                                    RecyclerView.LayoutManager layoutManager = c0ha44.getLayoutManager();
                                    if (layoutManager != null) {
                                        layoutManager.calculateItemDecorationsForChild(childAt, rect);
                                    }
                                    int iLIZ = c21681819tI.LIZ();
                                    if (iLIZ != 0) {
                                        if (iLIZ == 1 && (i3 = rect.right) > 0 && rect.left > i3 && c0ha44.getRight() - childAt.getRight() <= rect.right) {
                                            childAt.layout(childAt.getLeft() - rect.right, childAt.getTop(), childAt.getRight() - rect.right, childAt.getBottom());
                                        }
                                    } else {
                                        int i5 = rect.left;
                                        if (i5 > 0 && rect.right > i5 && childAt.getLeft() <= rect.left) {
                                            childAt.layout(childAt.getLeft() + rect.left, childAt.getTop(), childAt.getRight() + rect.left, childAt.getBottom());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                @Override // X.C15WS
                public final int LIZIZ(int i3, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
                    C678230Qiz c678230Qiz7;
                    InterfaceC678420QjI interfaceC678420QjI;
                    C677400Qhe c677400Qhe11 = this.LIZ.LJIIJ;
                    if (c677400Qhe11 != null && (c678230Qiz7 = c677400Qhe11.LIZ) != null && (interfaceC678420QjI = c678230Qiz7.LIZIZ) != null) {
                        return interfaceC678420QjI.LIZIZ(i3);
                    }
                    return 0;
                }
            });
        }
        C678140Qiq c678140Qiq4 = this.LJII;
        if (c678140Qiq4 != null) {
            C678220Qiy c678220Qiy4 = this.LJIIL;
            c678220Qiy4.getClass();
            MixPageViewModel mixPageViewModel8 = c678140Qiq4.LJIIL;
            if (mixPageViewModel8 != null && (c678130Qip = c678220Qiy4.LLILLJJLI) != null && (lifecycleOwner2 = c678130Qip.LJIIIZ) != null) {
                mixPageViewModel8.LLJIJIL.observe(lifecycleOwner2, new AObserverS214S0100000_10(c678220Qiy4, 112));
                mixPageViewModel8.LLJILJIL.observe(lifecycleOwner2, new AObserverS214S0100000_10(c678220Qiy4, 113));
            }
        }
        C678140Qiq c678140Qiq5 = this.LJII;
        if (c678140Qiq5 != null) {
            this.LJIILLIIL.LLILLL = c678140Qiq5;
        }
        final C678150Qir c678150Qir = this.LJIILL;
        LinearLayout linearLayout2 = this.LIZLLL;
        C19EG c19eg2 = this.LIZ;
        if (this.LJI != null) {
            C676670QgT c676670QgT = c677400Qhe.LIZLLL;
            c678150Qir.getClass();
            c676670QgT.getClass();
            ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, interfaceC676520QgEM);
            if (iSearchService != null) {
                interfaceC676520QgEM = iSearchService.M();
            }
            c678150Qir.LL = interfaceC676520QgEM;
            c678150Qir.LLILLJJLI = linearLayout2;
            c678150Qir.LLILLL = this;
            if (((Boolean) C138800fy.LIZ.getValue()).booleanValue()) {
                c19eg2.registerComponentCallbacks(c678150Qir.LLJI);
            }
            C677400Qhe c677400Qhe11 = this.LJIIJ;
            if (c677400Qhe11 != null && (searchResultParam = c677400Qhe11.LIZIZ) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
                if (searchEnterParam != null && (enterSearchFrom = searchEnterParam.getEnterSearchFrom()) != null) {
                    linkedHashMap.put("enter_from", enterSearchFrom);
                }
                String keyword = searchResultParam.getKeyword();
                if (keyword != null) {
                    linkedHashMap.put("search_keyword", keyword);
                }
                InterfaceC676520QgE interfaceC676520QgE = c678150Qir.LL;
                if (interfaceC676520QgE != null) {
                    interfaceC676520QgE.LIZLLL(linkedHashMap);
                }
            }
            LifecycleOwner lifecycleOwner11 = this.LJIIIZ;
            if (lifecycleOwner11 != null) {
                this.LJ.LLJI.observe(lifecycleOwner11, new AObserverS214S0100000_10(c678150Qir, 110));
                this.LJ.LLJ.observe(lifecycleOwner11, new AObserverS214S0100000_10(c678150Qir, 111));
            }
            C678130Qip c678130Qip3 = c678150Qir.LLILLL;
            if (c678130Qip3 != null && (lifecycleOwner = c678130Qip3.LJIIIZ) != null) {
                lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixAutoPlayAbility$setupLifecycleObserver$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner12, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_RESUME) {
                            onResume();
                        } else if (event == Lifecycle.Event.ON_PAUSE) {
                            onPause();
                        } else if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void onDestroy() {
                        C19EG c19eg3;
                        InterfaceC676520QgE interfaceC676520QgE2 = c678150Qir.LL;
                        if (interfaceC676520QgE2 != null) {
                            interfaceC676520QgE2.reset();
                        }
                        C678150Qir c678150Qir2 = c678150Qir;
                        C678130Qip c678130Qip4 = c678150Qir2.LLILLL;
                        if (c678130Qip4 != null) {
                            C678140Qiq c678140Qiq6 = c678130Qip4.LJII;
                            if (c678140Qiq6 != null) {
                                c678140Qiq6.LJIIIZ = false;
                                AnonymousClass0956 anonymousClass0956 = c678140Qiq6.LJIL;
                                if (anonymousClass0956 != null) {
                                    anonymousClass0956.LIZIZ(null);
                                }
                                c678140Qiq6.LJIL = null;
                                C15WQ c15wq = c678140Qiq6.LJIILJJIL;
                                if (c15wq != null) {
                                    c15wq.LJIIL();
                                }
                                c678140Qiq6.LJIILJJIL = null;
                                MixPageViewModel mixPageViewModel9 = c678140Qiq6.LJIIL;
                                (mixPageViewModel9 == null ? null : mixPageViewModel9).LL = "";
                                if (mixPageViewModel9 == null) {
                                    mixPageViewModel9 = null;
                                }
                                C1396605dM c1396605dM = mixPageViewModel9.LLILZ;
                                if (c1396605dM == null) {
                                    c1396605dM = null;
                                }
                                C1397505dV c1397505dV = c1396605dM.LIZLLL;
                                c1397505dV.LIZ.clear();
                                c1397505dV.LIZIZ.clear();
                                c1397505dV.LIZJ = -1;
                                c1397505dV.LIZLLL = -1L;
                                c1397505dV.LJ = 0;
                                c1397505dV.LJFF = null;
                                c1397505dV.LJI = null;
                            }
                            if (C293720BfG.LIZ()) {
                                try {
                                    C1540620qC4 c1540620qC44 = c678130Qip4.LJIIIIZZ;
                                    if (c1540620qC44 != null) {
                                        c1540620qC44.LJIIIIZZ();
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            C1540620qC4 c1540620qC45 = c678130Qip4.LJIIIIZZ;
                            if (c1540620qC45 != null) {
                                c1540620qC45.LJII();
                            }
                            MixShopSearchBizVM mixShopSearchBizVM7 = c678130Qip4.LJ;
                            mixShopSearchBizVM7.reset();
                            try {
                                C189200o6.m2constructorimpl(Boolean.valueOf(mixShopSearchBizVM7.LLJJJJJIL.quit()));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                            C786410Ut5.LJJJJI(c678130Qip4.LIZJ);
                            if (c678130Qip4.LIZJ.getParent() != null && (c678130Qip4.LIZJ.getParent() instanceof ViewGroup)) {
                                C786410Ut5.LJJJLZIJ(c678130Qip4.LIZJ, (ViewGroup) c678130Qip4.LIZJ.getParent());
                            }
                            c678150Qir2.LLIZLLLIL = null;
                            if (!((Boolean) C138800fy.LIZ.getValue()).booleanValue() || (c19eg3 = c678130Qip4.LIZ) == null) {
                                return;
                            }
                            c19eg3.registerComponentCallbacks(c678150Qir2.LLJI);
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                    public final void onPause() {
                        C1540620qC4 c1540620qC44;
                        C678130Qip c678130Qip4 = c678150Qir.LLILLL;
                        if (c678130Qip4 != null && (c1540620qC44 = c678130Qip4.LJIIIIZZ) != null) {
                            c1540620qC44.LJJIII("viewDisappeared", null);
                        }
                        InterfaceC676520QgE interfaceC676520QgE2 = c678150Qir.LL;
                        if (interfaceC676520QgE2 != null) {
                            interfaceC676520QgE2.LJIIIZ();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                    public final void onResume() {
                        C0HA4 c0ha44;
                        C1540620qC4 c1540620qC44;
                        C1537480q70 hybridContext;
                        String str;
                        C678130Qip c678130Qip4 = c678150Qir.LLILLL;
                        if (c678130Qip4 != null && (c1540620qC44 = c678130Qip4.LJIIIIZZ) != null) {
                            Iterator<Map.Entry<String, CopyOnWriteArrayList<C1537720q7O>>> it2 = c1540620qC44.LJIIZILJ.entrySet().iterator();
                            while (it2.hasNext()) {
                                for (C1537720q7O c1537720q7O : it2.next().getValue()) {
                                    if (c1537720q7O != null && (hybridContext = c1537720q7O.getHybridContext()) != null && (str = hybridContext.containerId) != null) {
                                        c1540620qC44.LJJIJL.add(str);
                                    }
                                }
                            }
                            c1540620qC44.LJJIII("viewAppeared", null);
                        }
                        C678150Qir c678150Qir2 = c678150Qir;
                        C678130Qip c678130Qip5 = c678150Qir2.LLILLL;
                        if (c678130Qip5 == null || (c0ha44 = c678130Qip5.LJI) == null) {
                            return;
                        }
                        HandlerHook.viewPost(c0ha44, new ARunnableS110S0100000_10(c678150Qir2, 22));
                    }
                });
            }
            c678150Qir.LIZIZ();
            return;
        }
        "mixPowerList should be initialized".toString();
        throw new IllegalStateException("mixPowerList should be initialized");
    }

    public final void LJ(InterfaceC676500QgC interfaceC676500QgC) {
        ((ArrayList) this.LJFF).add(interfaceC676500QgC);
    }

    public C678130Qip(C19EG c19eg, Fragment fragment, ViewGroup viewGroup, LinearLayout linearLayout, MixShopSearchBizVM mixShopSearchBizVM) {
        this.LIZ = c19eg;
        this.LIZIZ = fragment;
        this.LIZJ = viewGroup;
        this.LIZLLL = linearLayout;
        this.LJ = mixShopSearchBizVM;
    }
}

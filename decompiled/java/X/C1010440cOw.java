package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS132S1200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010440cOw implements C0Q18 {
    public InterfaceC1010450cOx LL;
    public Integer LLILLJJLI;
    public Aweme LLILZIL;
    public Context LLILZLL;
    public IAnoleManager LLIZ;
    public ViewGroup LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC1009890cO3 LLJIJIL;
    public InterfaceC1003440cDe LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public IVideoPlayTaskManager LLJJ;
    public View LLJJIII;
    public n LLJJIJI;
    public InterfaceC1009900cO4 LLJJIJIIJIL;
    public final C1004580cFU LLILLL = new C1004580cFU(0);
    public final C1010490cP1 LLILZ = new InterfaceC1010250cOd(this) { // from class: X.0cP1
        public final C01GW LIZ;
        public final C01GW LIZIZ;

        @Override // X.InterfaceC1010250cOd
        public final Aweme getAweme() {
            return (Aweme) this.LIZ.getValue();
        }

        @Override // X.InterfaceC1010250cOd
        public final Context getContext() {
            return (Context) this.LIZIZ.getValue();
        }

        {
            this.LIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 927));
            this.LIZIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 928));
        }
    };
    public final Set<String> LLJI = new LinkedHashSet();
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 932));

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC660150Puv
    public final InterfaceC1011430cQX vQ0() {
        return null;
    }

    public final boolean LIZJ() {
        Aweme aweme = this.LLILZIL;
        if (aweme != null && C1010120cOQ.LJIL(aweme)) {
            return true;
        }
        Aweme aweme2 = this.LLILZIL;
        return aweme2 != null && C1010120cOQ.LJJIFFI(aweme2);
    }

    public final void LJIIJ() {
        IAnoleManager iAnoleManager = this.LLIZ;
        if (iAnoleManager != null) {
            C995850c1P c995850c1P = C995850c1P.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("postEventToAnole,AnoleFromBusinessEvent= ");
            sbLIZ.append(c995850c1P);
            C2188811AlT.LIZIZ(sbLIZ);
            iAnoleManager.LJIIZILJ(c995850c1P);
        }
        this.LLJILLL = true;
    }

    @Override // X.InterfaceC1002830cCf
    public final void LJIJI() {
        Set<EnumC1010840cPa> linkedHashSet;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        AwemeSearchAdModel searchAdInfo;
        AwemeRawAd awemeRawAdLJJIJLIJ2;
        AwemeSearchAdModel searchAdInfo2;
        Aweme aweme = this.LLILZIL;
        String str = null;
        Integer num = (aweme == null || (awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme)) == null || (searchAdInfo2 = awemeRawAdLJJIJLIJ2.getSearchAdInfo()) == null) ? null : searchAdInfo2.feedType;
        Aweme aweme2 = this.LLILZIL;
        if (aweme2 != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme2)) != null && (searchAdInfo = awemeRawAdLJJIJLIJ.getSearchAdInfo()) != null) {
            str = searchAdInfo.searchAdCacheKey;
        }
        InterfaceC1010450cOx interfaceC1010450cOx = this.LL;
        if (interfaceC1010450cOx == null || (linkedHashSet = interfaceC1010450cOx.OG0()) == null) {
            linkedHashSet = new LinkedHashSet<>();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("beforeEnterDetailPage feedType=");
        sbLIZ.append(num);
        sbLIZ.append(", cacheKey=");
        sbLIZ.append(str);
        sbLIZ.append(", outSideEventList=");
        sbLIZ.append(linkedHashSet);
        sbLIZ.append(", outSideEventList size = ");
        sbLIZ.append(linkedHashSet.size());
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        if (num == null || num.intValue() != 116) {
            return;
        }
        C1004580cFU c1004580cFU = this.LLILLL;
        c1004580cFU.LIZJ = linkedHashSet;
        InterfaceC1010450cOx interfaceC1010450cOx2 = this.LL;
        c1004580cFU.LIZIZ = interfaceC1010450cOx2 != null ? interfaceC1010450cOx2.s2() : 0;
    }

    @Override // X.C0Q18
    public final void Tm2() {
        IAnoleManager iAnoleManager = this.LLIZ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIZILJ(new C990000bry());
        }
    }

    @Override // X.C0PPF
    public final void bind() {
        AwemeSearchAdModel searchAdInfo;
        AwemeSearchAdModel searchAdInfo2;
        AwemeSearchAdModel searchAdInfo3;
        AwemeSearchAdModel searchAdInfo4;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        if (this.LLJ) {
            return;
        }
        Context context = this.LLILZLL;
        Aweme aweme = this.LLILZIL;
        C1007900cKq c1007900cKqLJI = null;
        AwemeRawAd awemeRawAd = aweme != null ? aweme.getAwemeRawAd() : null;
        Aweme aweme2 = this.LLILZIL;
        String aid = aweme2 != null ? aweme2.getAid() : null;
        if (context != null && aweme != null && awemeRawAd != null && aid != null) {
            if (((Boolean) C132700ez.LIZ.getValue()).booleanValue() && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null) {
                InterfaceC2044707zh<EnumC656000PoE> entries = EnumC656000PoE.getEntries();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(entries, 10));
                Iterator<EnumC656000PoE> it2 = entries.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getValue());
                }
                Set setLLIIJI = C13LP.LLIIJI(arrayList);
                Collection<AnoleComponentModel> collectionValues = map.values();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionValues) {
                    if (setLLIIJI.contains(((AnoleComponentModel) obj).slotID)) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    try {
                        ((AnoleComponentModel) it3.next()).setScene("search_outflow");
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((AnoleComponentModel) it4.next()).type);
                }
            }
            Set setSingleton = ((Boolean) C132700ez.LIZ.getValue()).booleanValue() ? Collections.singleton("search_outflow") : C13LQ.LJLIIL(new String[]{"feed", "search_outflow"});
            C1009340cNA c1009340cNA = new C1009340cNA(aid, aweme.getGroupId(), aweme, awemeRawAd, this.LLJJIJI, null, null, 96);
            this.LLJ = true;
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && (((searchAdInfo = awemeRawAd2.getSearchAdInfo()) != null && (num4 = searchAdInfo.feedType) != null && num4.intValue() == 106) || (((searchAdInfo2 = awemeRawAd2.getSearchAdInfo()) != null && (num3 = searchAdInfo2.searchFormatType) != null && num3.intValue() == 23) || (((searchAdInfo3 = awemeRawAd2.getSearchAdInfo()) != null && (num2 = searchAdInfo3.feedType) != null && num2.intValue() == 115) || ((searchAdInfo4 = awemeRawAd2.getSearchAdInfo()) != null && (num = searchAdInfo4.feedType) != null && num.intValue() == 116))))) {
                C1015470cX3.LIZ((IAnoleService) ServiceManager.get().getService(IAnoleService.class), c1009340cNA);
            }
            IAnoleService iAnoleService = (IAnoleService) ServiceManager.get().getService(IAnoleService.class);
            final ViewGroup viewGroup = this.LLIZLLLIL;
            c1007900cKqLJI = iAnoleService.LJI(context, setSingleton, c1009340cNA, new InterfaceC1007910cKr() { // from class: X.0cO2
                @Override // X.InterfaceC1007910cKr
                public final void LJJLIIJ() {
                }

                @Override // X.InterfaceC1007910cKr
                public final long LJJLIL() {
                    return 0L;
                }

                @Override // X.InterfaceC1007910cKr
                public final int LLJILLL() {
                    return 0;
                }

                @Override // X.InterfaceC1007910cKr
                public final void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
                }

                @Override // X.InterfaceC1007910cKr
                public final C1014390cVJ LLJJIJIIJIL() {
                    return null;
                }

                @Override // X.InterfaceC1007910cKr
                public final void P() {
                }

                @Override // X.InterfaceC1007910cKr
                public final void U2() {
                }

                @Override // X.InterfaceC1007910cKr
                public final JSONObject V2() {
                    return null;
                }

                @Override // X.InterfaceC1007910cKr
                public final void X2(String str, ViewOnLayoutChangeListenerC1014330cVD viewOnLayoutChangeListenerC1014330cVD) {
                }

                @Override // X.InterfaceC1007910cKr
                public final HashMap<String, Object> Z2() {
                    return null;
                }

                @Override // X.InterfaceC1007910cKr
                public final ViewGroup b3() {
                    return null;
                }

                @Override // X.InterfaceC1007910cKr
                public final boolean d3() {
                    return true;
                }

                @Override // X.InterfaceC1007910cKr
                public final boolean e3() {
                    return false;
                }

                @Override // X.InterfaceC1007910cKr
                public final void f3(long j, String str, String str2, AwS81S0100100_16 awS81S0100100_16) {
                }

                @Override // X.InterfaceC1007910cKr
                public final Integer i3() {
                    return null;
                }

                @Override // X.InterfaceC1007910cKr
                public final void o0() {
                }

                @Override // X.InterfaceC1007910cKr
                public final void pauseVideo() {
                }

                @Override // X.InterfaceC1007910cKr
                public final long r1() {
                    return 0L;
                }

                @Override // X.InterfaceC1007910cKr
                public final C1014390cVJ Y2() {
                    double width = viewGroup != null ? r0.getWidth() : 0.0d;
                    double height = viewGroup != null ? r0.getHeight() : 0.0d;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getDisplayInfo  width= ");
                    sbLIZ.append(width);
                    sbLIZ.append(" height= ");
                    sbLIZ.append(height);
                    sbLIZ.append(" width= ");
                    sbLIZ.append(width);
                    C2188811AlT.LIZIZ(sbLIZ);
                    double d = 2;
                    return new C1014390cVJ(new C1009390cNF(width, height), new PointF((float) (width / d), (float) (height / d)));
                }

                @Override // X.InterfaceC1007910cKr
                public final C1008080cL8 c3() {
                    C1010440cOw c1010440cOw = this.LIZ;
                    Context context2 = c1010440cOw.LLILZLL;
                    Aweme aweme3 = c1010440cOw.LLILZIL;
                    if (context2 == null || aweme3 == null) {
                        return null;
                    }
                    return ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIIJ(context2, aweme3);
                }

                @Override // X.InterfaceC1007910cKr
                public final C1014410cVL LLJJIJI(String str) {
                    View view;
                    if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_SEARCH_CONTENT_AREA.getInteractName()) && (view = viewGroup) != null) {
                        int[] iArr = new int[2];
                        view.getLocationInWindow(iArr);
                        return new C1014410cVL(view.getWidth(), view.getHeight(), new int[]{0, iArr[1]});
                    }
                    return null;
                }

                @Override // X.InterfaceC1007910cKr
                public final C1009390cNF W2(String str) {
                    return C1008220cLM.LIZ();
                }

                @Override // X.InterfaceC1007910cKr
                public final void g3(int i) {
                    InterfaceC1009900cO4 interfaceC1009900cO4 = this.LIZ.LLJJIJIIJIL;
                    if (interfaceC1009900cO4 != null) {
                        interfaceC1009900cO4.O8(i);
                    }
                }

                @Override // X.InterfaceC1007910cKr
                public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
                    String str;
                    AnoleComponentModel anoleComponentModelAk;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleEvent event= ");
                    sbLIZ.append(abstractC991850bux);
                    sbLIZ.append(", component type ");
                    if (interfaceC1007930cKt != null && (anoleComponentModelAk = interfaceC1007930cKt.Ak()) != null) {
                        str = anoleComponentModelAk.type;
                    } else {
                        str = null;
                    }
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2510609se.LIZ;
                    InterfaceC1009890cO3 interfaceC1009890cO3 = this.LIZ.LLJIJIL;
                    if (interfaceC1009890cO3 != null) {
                        interfaceC1009890cO3.LIZIZ(abstractC991850bux, interfaceC1007930cKt);
                    }
                }

                @Override // X.InterfaceC1007910cKr
                public final boolean a3(String str, Runnable runnable, int i) {
                    Video video;
                    if (this.LIZ.LIZJ()) {
                        View view = this.LIZ.LLJJIII;
                        if (view != null) {
                            HandlerHook.viewPostDelay(view, runnable, i);
                        }
                        int i2 = C2510609se.LIZ;
                        return true;
                    }
                    Aweme aweme3 = this.LIZ.LLILZIL;
                    if (aweme3 == null || (video = aweme3.getVideo()) == null) {
                        return false;
                    }
                    long duration = video.getDuration();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("registerPlayProgressObserver  progress= ");
                    sbLIZ.append(i);
                    sbLIZ.append(" videoDuration= ");
                    sbLIZ.append(duration);
                    C2188811AlT.LIZIZ(sbLIZ);
                    IVideoPlayTaskManager iVideoPlayTaskManager = this.LIZ.LLJJ;
                    if (iVideoPlayTaskManager != null) {
                        C988300bpE c988300bpE = new C988300bpE(str);
                        c988300bpE.LIZIZ(duration);
                        c988300bpE.LIZJ = i;
                        c988300bpE.LIZLLL = runnable;
                        c988300bpE.LJ = false;
                        iVideoPlayTaskManager.LLIFFJFJJ(c988300bpE.LIZ());
                    }
                    IVideoPlayTaskManager iVideoPlayTaskManager2 = this.LIZ.LLJJ;
                    if (iVideoPlayTaskManager2 != null) {
                        iVideoPlayTaskManager2.LL();
                    }
                    return true;
                }

                @Override // X.InterfaceC1007910cKr
                public final boolean h3(String str, InterfaceC1007930cKt interfaceC1007930cKt, AnoleComponentAppearModel anoleComponentAppearModel) {
                    C0Q17 c0q17LJIIJ;
                    if (Intrinsics.LJFF(interfaceC1007930cKt.getType(), EnumC1008920cMU.SEARCH_EASTER_EGG.getType())) {
                        Context context2 = this.LIZ.LLILZLL;
                        if (context2 == null) {
                            View view = viewGroup;
                            if (view != null) {
                                context2 = view.getContext();
                            } else {
                                context2 = null;
                            }
                        }
                        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
                        if (interfaceC657510PqfLIZLLL == null || (c0q17LJIIJ = interfaceC657510PqfLIZLLL.LJIIJ()) == null || !c0q17LJIIJ.LIZ(context2)) {
                            return false;
                        }
                    }
                    return true;
                }
            }, new C1008160cLG(this.LLJILJIL, null, null, null, null, 30));
        }
        this.LLIZ = c1007900cKqLJI;
    }

    @Override // X.C0PPF
    public final void onViewAttachedToWindow() {
        if (this.LLJILJILJ) {
            return;
        }
        IAnoleManager iAnoleManager = this.LLIZ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIZILJ(new C692050RCp(true));
        }
        LJIIIZ(true);
        this.LLJILJILJ = true;
    }

    @Override // X.C0PPF
    public final void onViewDetachedFromWindow() {
        if (this.LLJILJILJ) {
            IAnoleManager iAnoleManager = this.LLIZ;
            if (iAnoleManager != null) {
                iAnoleManager.LJIIZILJ(new C692050RCp(false));
            }
            LJIIIZ(false);
            this.LLJILJILJ = false;
        }
    }

    @Override // X.C0PPF
    public final void onDestroy() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onDestroy] aid = ");
        Aweme aweme = this.LLILZIL;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        sbLIZ.append(" reqid = ");
        Aweme aweme2 = this.LLILZIL;
        sbLIZ.append(aweme2 != null ? aweme2.getRequestId() : null);
        sbLIZ.append(", ");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJILJILJ) {
            IAnoleManager iAnoleManager = this.LLIZ;
            if (iAnoleManager != null) {
                iAnoleManager.LJIIZILJ(new C692050RCp(false));
            }
            LJIIIZ(false);
            this.LLJILJILJ = false;
        }
        IAnoleManager iAnoleManager2 = this.LLIZ;
        if (iAnoleManager2 != null) {
            iAnoleManager2.LIZ();
        }
        for (String str : this.LLJI) {
            IAnoleManager iAnoleManager3 = this.LLIZ;
            if (iAnoleManager3 != null) {
                iAnoleManager3.LJIIJJI(str);
            }
        }
        IAnoleManager iAnoleManager4 = this.LLIZ;
        if (iAnoleManager4 != null) {
            iAnoleManager4.LJFF();
        }
        this.LLJI.clear();
        this.LLJJIII = null;
        this.LLJILJILJ = false;
        this.LLJ = false;
    }

    @Override // X.C0Q18
    public final void ra() {
        if (LIZJ()) {
            LJIIJ();
        }
    }

    @Override // X.InterfaceC1002870cCj
    public final Integer LJIIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1010250cOd Mh() {
        return this.LLILZ;
    }

    @Override // X.C0Q18
    public final IAnoleManager Ri() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1002830cCf
    public final C1004580cFU getShareInfo() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC658610PsR
    public final InterfaceC1010450cOx ne() {
        return this.LL;
    }

    @Override // X.C0Q18
    public final void FH2(InterfaceC1009900cO4 interfaceC1009900cO4) {
        this.LLJJIJIIJIL = interfaceC1009900cO4;
    }

    @Override // X.C0Q18
    public final void Jt2(C1010460cOy c1010460cOy) {
        this.LLILZIL = c1010460cOy.LIZ;
        this.LLILZLL = c1010460cOy.LIZIZ;
        this.LLIZLLLIL = c1010460cOy.LJ;
        this.LLJIJIL = c1010460cOy.LIZJ;
        this.LLJILJIL = c1010460cOy.LIZLLL;
        this.LLJJIJI = c1010460cOy.LJFF;
    }

    @Override // X.InterfaceC658610PsR
    public final void LIZIZ(InterfaceC1010860cPc interfaceC1010860cPc) {
        Ms(ik(interfaceC1010860cPc));
    }

    @Override // X.InterfaceC1002830cCf
    public final void LJFF(String str) {
        LJIIJ();
    }

    public final void LJIIIZ(boolean z) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        AwemeSearchAdModel searchAdInfo;
        Integer num;
        String str;
        List<String> list;
        InterfaceC660150Puv interfaceC660150PuvLJJII;
        Aweme aweme = this.LLILZIL;
        if (aweme != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null && (searchAdInfo = awemeRawAdLJJIJLIJ.getSearchAdInfo()) != null && (num = searchAdInfo.feedType) != null && 116 == num.intValue()) {
            try {
                Map<String, String> searchAdExtraParams = awemeRawAdLJJIJLIJ.getSearchAdExtraParams();
                if (searchAdExtraParams != null && (str = searchAdExtraParams.get("search_ad_brand_zone_dynamic_cache_list")) != null && str.length() != 0 && (list = (List) C309390CAv.LIZ(str, new TypeToken<List<String>>() { // from class: X.0cP0
                }.getType())) != null && !list.isEmpty()) {
                    for (String str2 : list) {
                        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
                        if (interfaceC657510PqfLIZLLL != null && (interfaceC660150PuvLJJII = interfaceC657510PqfLIZLLL.LJJII(str2)) != null) {
                            if (z) {
                                InterfaceC1010450cOx interfaceC1010450cOxNe = interfaceC660150PuvLJJII.ne();
                                if (interfaceC1010450cOxNe != null) {
                                    interfaceC1010450cOxNe.onViewAttachedToWindow();
                                }
                            } else {
                                InterfaceC1010450cOx interfaceC1010450cOxNe2 = interfaceC660150PuvLJJII.ne();
                                if (interfaceC1010450cOxNe2 != null) {
                                    interfaceC1010450cOxNe2.onViewDetachedFromWindow();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC1002870cCj
    public final void LJIJJ(Integer num) {
        this.LLILLJJLI = null;
        C0DHT.LIZ = null;
    }

    @Override // X.InterfaceC658610PsR
    public final void Ms(InterfaceC1010450cOx interfaceC1010450cOx) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initObservers playerModule=");
        sbLIZ.append(interfaceC1010450cOx);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        this.LLJJ = interfaceC1010450cOx.g70();
        C1009940cO8.LIZIZ(interfaceC1010450cOx, (LifecycleOwner) this.LLJJI.getValue(), C2097608Jq.LJIIIIZZ(new Pair(C1010930cPj.LIZ, new AwS560S0100000_16(this, 929)), new Pair(C1010900cPg.LIZ, new AwS560S0100000_16(this, 930)), new Pair(C1010920cPi.LIZ, new AwS560S0100000_16(this, 931))));
    }

    @Override // X.InterfaceC658610PsR
    public final InterfaceC1010450cOx ik(InterfaceC1010860cPc interfaceC1010860cPc) {
        int i = C2510609se.LIZ;
        C1010790cPV c1010790cPVLIZ = C1010810cPX.LIZ(interfaceC1010860cPc);
        this.LL = c1010790cPVLIZ;
        c1010790cPVLIZ.LIZ(new C1010640cPG(null, new C1010630cPF(true, C2097908Jt.LIZJ(new Pair(EnumC1010840cPa.BREAK, Boolean.FALSE)), null, null)));
        Ms(c1010790cPVLIZ);
        return c1010790cPVLIZ;
    }

    @Override // X.C0Q18
    public final void Xq2(String str, ViewGroup viewGroup) {
        C013C c013c = new C013C();
        if (viewGroup != null && viewGroup.getChildCount() == 0 && this.LLJI.contains(str)) {
            this.LLJI.remove(str);
        }
        if (!this.LLJI.contains(str)) {
            if (viewGroup != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
            IAnoleManager iAnoleManager = this.LLIZ;
            if (iAnoleManager != null) {
                iAnoleManager.mount(viewGroup, str, null);
            }
            c013c.element = true;
            this.LLJJIII = viewGroup;
            this.LLJI.add(str);
            IAnoleManager iAnoleManager2 = this.LLIZ;
            if (iAnoleManager2 != null) {
                iAnoleManager2.LIZJ();
            }
        }
        C301090Br9.LIZIZ(new AwS132S1200000_16(this, str, c013c, 9));
    }
}

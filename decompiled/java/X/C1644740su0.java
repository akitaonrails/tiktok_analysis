package X;

import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0su0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644740su0 extends AbstractC2255721DQs<InterfaceC1644750su1> implements InterfaceC1644750su1, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final C1DRG LL;
    public final boolean LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), C1645380sv2.class, "lazyBeautyFilter");
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1642510sqP.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1644770su3.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1644760su2.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC578600Mmg.class, null);
    public final C11NJ LLJIJIL = new C11NJ();
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1632360sa2.class, null);
    public boolean LLJILJILJ = true;

    public InterfaceC1644750su1 Z1() {
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1644740su0.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1644740su0.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1644740su0.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1644740su0.class, "filterPanelApi", "getFilterPanelApi()Lcom/bytedance/creativex/recorder/filter/api/FilterPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1644740su0.class, "filterApi", "getFilterApi()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1644740su0.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1644740su0.class, "beautyPanelApiComponent", "getBeautyPanelApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1644740su0.class, "countDownApi", "getCountDownApi()Lcom/ss/android/ugc/aweme/shortvideo/countdown/CountDownApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1644740su0.class, "recordGreenScreenUIApi", "getRecordGreenScreenUIApi()Lcom/ss/android/ugc/gamora/recorder/greenscreen/RecordGreenScreenUIApi;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
        LLJJ = 8;
    }

    private final InterfaceC578600Mmg G2() {
        return (InterfaceC578600Mmg) this.LLJI.getValue(this, LLJILLL[7]);
    }

    private final InterfaceC1644770su3 H2() {
        return (InterfaceC1644770su3) this.LLIZ.getValue(this, LLJILLL[4]);
    }

    private final InterfaceC1642510sqP T2() {
        return (InterfaceC1642510sqP) this.LLILZLL.getValue(this, LLJILLL[3]);
    }

    private final C1645380sv2 W2() {
        return (C1645380sv2) this.LLILLL.getValue(this, LLJILLL[0]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLIZLLLIL.getValue(this, LLJILLL[5]);
    }

    private final InterfaceC1644760su2 w2() {
        return (InterfaceC1644760su2) this.LLJ.getValue(this, LLJILLL[6]);
    }

    public final void H3() {
        C1653260t7k.LIZIZ("click_timer_entrance");
    }

    public final void H4() {
        C1650550t3N c1650550t3N = C1650550t3N.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        c1650550t3N.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("content_source", shortVideoContext.LJ().getContentSource());
        c0lab.LJ("content_type", shortVideoContext.LJ().getContentType());
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("scene_id", "1004");
        c0lab.LJ("shoot_page", "video_shoot_page");
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        C20684815ws.LJIILLIIL("click_modify_entrance", c0lab.LIZ);
    }

    public final InterfaceC1632360sa2 c3() {
        return (InterfaceC1632360sa2) this.LLJILJIL.getValue(this, LLJILLL[8]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLJILLL[1]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLILZIL.getValue(this, LLJILLL[2]);
    }

    public final void m3() {
        C1653260t7k.LIZJ("click_beauty_entrance", true);
    }

    private final void K4() {
        InterfaceC1651080t4E interfaceC1651080t4E = (InterfaceC1651080t4E) getDiContainer().LJIIL(null, InterfaceC1651080t4E.class);
        if (interfaceC1651080t4E == null) {
            return;
        }
        C0MFK c0mfk = (C0MFK) getDiContainer().LJIIL(null, C0MFK.class);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS426S0200000_25(this, interfaceC1651080t4E, 60));
        if (c0mfk != null) {
            c0mfk.ig(O4(c01gwLIZIZ));
        }
    }

    private final void O3() {
        LiveData<EnumC1159880gHy> liveDataP4;
        if (C1622090sJT.LIZ(W2())) {
            whenReady(this, InterfaceC1644760su2.class, new AwS604S0100000_25(this, 177));
            return;
        }
        InterfaceC1644760su2 interfaceC1644760su2W2 = w2();
        if (interfaceC1644760su2W2 == null || (liveDataP4 = interfaceC1644760su2W2.p4()) == null) {
            return;
        }
        liveDataP4.observe(this, new AObserverS227S0100000_25(this, 17));
    }

    private final AVETParameter o2() {
        return getShortVideoContext().LJ();
    }

    private final void o4() {
        LiveData<EnumC1159880gHy> liveDataP4;
        if (C1647240sy2.LIZ().lazyLoadComponentV2) {
            if (getDiContainer().LIZJ(InterfaceC578600Mmg.class)) {
                whenReadyOrThrowInternal(getDiContainer(), InterfaceC578600Mmg.class, new AwS604S0100000_25(this, 178));
            }
        } else {
            InterfaceC578600Mmg interfaceC578600MmgG2 = G2();
            if (interfaceC578600MmgG2 == null || (liveDataP4 = interfaceC578600MmgG2.p4()) == null) {
                return;
            }
            liveDataP4.observe(this, new AObserverS227S0100000_25(this, 22));
        }
    }

    public final void Q3() {
        InterfaceC1623190sLF interfaceC1623190sLFU;
        MutableLiveData mutableLiveDataAG;
        InterfaceC1623190sLF interfaceC1623190sLFU2;
        InterfaceC1635930sfn interfaceC1635930sfnFq;
        C19475711Hn c19475711HnLIZIZ;
        InterfaceC1623190sLF interfaceC1623190sLFU3;
        InterfaceC1635930sfn interfaceC1635930sfnFq2;
        MutableLiveData mutableLiveDataLIZ;
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (interfaceC1623190sLFU3 = stickerApiComponent.U()) != null && (interfaceC1635930sfnFq2 = interfaceC1623190sLFU3.Fq()) != null && (mutableLiveDataLIZ = interfaceC1635930sfnFq2.LIZ()) != null) {
            mutableLiveDataLIZ.observe(this, new AObserverS227S0100000_25(this, 18));
        }
        InterfaceC1635660sfM interfaceC1635660sfM = (InterfaceC1635660sfM) getDiContainer().LJII(InterfaceC1635660sfM.class, null);
        if (interfaceC1635660sfM.get("sticker_category:search") instanceof C1635790sfZ) {
            C1635790sfZ c1635790sfZ = (C1635790sfZ) interfaceC1635660sfM.get("sticker_category:search");
            ((SearchStickerViewContainer) c1635790sfZ.LJII.getValue()).LLJJL.observe(this, new AObserverS227S0100000_25(this, 19));
            this.LLJIJIL.LIZ(((SearchStickerViewContainer) c1635790sfZ.LJII.getValue()).LIZIZ().LJJLJLI(new AfS194S0100000_25(this, 22)));
        }
        q stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (interfaceC1623190sLFU2 = stickerApiComponent2.U()) != null && (interfaceC1635930sfnFq = interfaceC1623190sLFU2.Fq()) != null && (c19475711HnLIZIZ = interfaceC1635930sfnFq.LIZIZ()) != null) {
            this.LLJIJIL.LIZ(c19475711HnLIZIZ.LJJLJLI(new AfS194S0100000_25(this, 23)));
        }
        q stickerApiComponent3 = getStickerApiComponent();
        if (stickerApiComponent3 == null || (interfaceC1623190sLFU = stickerApiComponent3.U()) == null || (mutableLiveDataAG = interfaceC1623190sLFU.AG()) == null) {
            return;
        }
        mutableLiveDataAG.observe(this, new AObserverS227S0100000_25(this, 20));
    }

    public final void i3() {
        ((InterfaceC1635700sfQ) getDiContainer().LJII(InterfaceC1635700sfQ.class, null)).show();
        ShortVideoContext shortVideoContext = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        c0lab.LJ("enter_method", "click");
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        C20684815ws.LJIILLIIL("click_prop_discover_entrance", c0lab.LIZ);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C11NZ<C1644670stt> c11nzSP0;
        LiveData<EnumC992840bwY> liveDataVm2;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLJ;
        LiveEvent<Boolean> liveEventDN1;
        super.onCreate();
        if (!this.LLILLJJLI) {
            InterfaceC1642510sqP interfaceC1642510sqPT2 = T2();
            if (interfaceC1642510sqPT2 != null && (liveDataVm2 = interfaceC1642510sqPT2.Vm2()) != null) {
                liveDataVm2.observe(this, new AObserverS227S0100000_25(this, 24));
            }
            InterfaceC1642510sqP interfaceC1642510sqPT22 = T2();
            if (interfaceC1642510sqPT22 != null && (c11nzSP0 = interfaceC1642510sqPT22.sP0()) != null) {
                this.LLJIJIL.LIZ(c11nzSP0.LJJLL(new AfS194S0100000_25(this, 25), C09HN.LIZ));
            }
        } else if (getDiContainer().LIZJ(InterfaceC1642510sqP.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1642510sqP.class, new AwS604S0100000_25(this, 179));
        }
        InitialFilterConfig initialFilterConfig = getShortVideoContext().creativeModel.initialModel.filterConfig;
        if (C123100dR.LIZ(initialFilterConfig != null ? initialFilterConfig.getFilterId() : null)) {
            InterfaceC1642510sqP interfaceC1642510sqPT23 = T2();
            if (interfaceC1642510sqPT23 != null) {
                interfaceC1642510sqPT23.of(true);
            }
            InterfaceC1644780su4 interfaceC1644780su4 = (InterfaceC1644780su4) getDiContainer().LJIIL(null, InterfaceC1644780su4.class);
            if (interfaceC1644780su4 != null) {
                interfaceC1644780su4.Ny1();
            }
            InterfaceC1644770su3 interfaceC1644770su3H2 = H2();
            if (interfaceC1644770su3H2 != null) {
                interfaceC1644770su3H2.bU();
            }
            K4();
        }
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (liveEventDN1 = stickerApiComponent.dN1()) != null) {
            liveEventDN1.LIZ(this, new AObjectS246S0100000_25(this, 195));
        }
        q stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (interfaceC1624480sNKC0 = stickerApiComponent2.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) != null && (mutableLiveDataLJ = interfaceC1625470sOvLJII.LJ()) != null) {
            mutableLiveDataLJ.observe(this, new Observer() { // from class: X.0noH
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    String adRawData;
                    Effect effect;
                    C1449000noI c1449000noI = (C1449000noI) obj;
                    ICommerceToolsStickerService iCommerceToolsStickerService = (ICommerceToolsStickerService) ServiceManager.get().getService(ICommerceToolsStickerService.class);
                    if (c1449000noI != null && (effect = c1449000noI.LIZ) != null) {
                        adRawData = effect.getAdRawData();
                    } else {
                        adRawData = null;
                    }
                    iCommerceToolsStickerService.LJI(adRawData);
                }
            });
        }
        O3();
        o4();
    }

    public final void q3() {
        AVETParameter aVETParameterO2 = o2();
        if (aVETParameterO2 != null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LJ("shoot_way", aVETParameterO2.getShootWay());
            c0lab.LJ("creation_id", aVETParameterO2.getCreationId());
            c0lab.LJ("filter_id", "-1");
            C20684815ws.LJIILLIIL("filter_deleted", c0lab.LIZ);
        }
    }

    public final void v3() {
        InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        interfaceC1637880siwLIZJ.LJIIIIZZ("click_filter_box", c0lab.LIZ);
    }

    public final void z4() {
        LiveData<C1643870ssb> liveDataRT;
        C1643870ssb value;
        C385670FAf<FilterBean> c385670FAfI70;
        InterfaceC1644770su3 interfaceC1644770su3LIZJ;
        FilterBean filterBeanLIZJ;
        LiveData<C1643870ssb> liveDataRT2;
        C1643870ssb value2;
        C385670FAf<InterfaceC1644770su3> c385670FAfTn2;
        C385670FAf<FilterBean> c385670FAfI702;
        InterfaceC1452660nuC interfaceC1452660nuC = null;
        if (!C1622090sJT.LIZ(W2())) {
            InterfaceC1644770su3 interfaceC1644770su3H2 = H2();
            FilterBean filterBeanLIZJ2 = (interfaceC1644770su3H2 == null || (c385670FAfI70 = interfaceC1644770su3H2.i70()) == null) ? null : c385670FAfI70.LIZJ();
            InterfaceC1644770su3 interfaceC1644770su3H22 = H2();
            if (interfaceC1644770su3H22 != null && (liveDataRT = interfaceC1644770su3H22.RT()) != null && (value = liveDataRT.getValue()) != null) {
                interfaceC1452660nuC = value.LIZJ;
            }
            F4(filterBeanLIZJ2, interfaceC1452660nuC);
            return;
        }
        InterfaceC1647420syK recordAdapterApi = getRecordAdapterApi();
        if (recordAdapterApi != null && (c385670FAfTn2 = recordAdapterApi.tn2()) != null) {
            interfaceC1644770su3LIZJ = c385670FAfTn2.LIZJ();
            if (interfaceC1644770su3LIZJ != null && (c385670FAfI702 = interfaceC1644770su3LIZJ.i70()) != null) {
                filterBeanLIZJ = c385670FAfI702.LIZJ();
            }
            liveDataRT2 = interfaceC1644770su3LIZJ.RT();
            if (liveDataRT2 != null && (value2 = liveDataRT2.getValue()) != null) {
                interfaceC1452660nuC = value2.LIZJ;
            }
            F4(filterBeanLIZJ, interfaceC1452660nuC);
        }
        interfaceC1644770su3LIZJ = null;
        filterBeanLIZJ = null;
        if (interfaceC1644770su3LIZJ != null) {
            liveDataRT2 = interfaceC1644770su3LIZJ.RT();
            if (liveDataRT2 != null) {
                interfaceC1452660nuC = value2.LIZJ;
            }
        }
        F4(filterBeanLIZJ, interfaceC1452660nuC);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public static final C1654410t9b O4(C01GW<C1654410t9b> c01gw) {
        return c01gw.getValue();
    }

    public final void E3(EffectCategoryResponse effectCategoryResponse) {
        AVETParameter aVETParameterO2 = o2();
        if (aVETParameterO2 != null) {
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", aVETParameterO2.getCreationId());
            c0lab.LJ("shoot_way", aVETParameterO2.getShootWay());
            c0lab.LJ("tab_name", effectCategoryResponse.getName());
            c0lab.LJ("content_source", aVETParameterO2.getContentSource());
            c0lab.LJ("content_type", aVETParameterO2.getContentType());
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LJ("scene_id", "1002");
            c0lab.LJ("shoot_page", "video_shoot_page");
            c0lab.LJ("shoot_tab_name", getShortVideoContext().LJIJJLI());
            c0lab.LJ("tab_key", effectCategoryResponse.getKey());
            C2341909Fp.LIZ("click_filter_tab", c0lab.LIZ);
        }
    }

    public final void X1(AbstractC1406770miB abstractC1406770miB) {
        if (abstractC1406770miB instanceof C1406800miE) {
            B3("click_prop_search", new AwS423S0200000_22(abstractC1406770miB, this, 34));
            return;
        }
        if (abstractC1406770miB instanceof C1406810miF) {
            B3("prop_search", new AwS566S0100000_22(abstractC1406770miB, 338));
            return;
        }
        if (abstractC1406770miB instanceof C1422010n6l) {
            B3("prop_show", new AwS423S0200000_22(abstractC1406770miB, this, 35));
            return;
        }
        if (abstractC1406770miB instanceof C1406330mhT) {
            B3("clear_prop_search_text", new AwS566S0100000_22(abstractC1406770miB, 339));
            return;
        }
        if (abstractC1406770miB instanceof C1406760miA) {
            B3("prop_search_cancel", new AwS566S0100000_22(abstractC1406770miB, 340));
            return;
        }
        if (abstractC1406770miB instanceof C1406780miC) {
            B3("click_prop_search_frame", null);
        } else if (abstractC1406770miB instanceof C1406790miD) {
            B3("prop_search_keyboard", new AwS566S0100000_22(abstractC1406770miB, 341));
        } else {
            if (!(abstractC1406770miB instanceof C1406600mhu)) {
                return;
            }
            B3("leave_prop_search", new AwS566S0100000_22(abstractC1406770miB, 342));
        }
    }

    public final void e4(boolean z) {
        String strLJIIJ;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (interfaceC1624480sNKC0 = stickerApiComponent.C0()) != null) {
            strLJIIJ = interfaceC1624480sNKC0.LJIIJ();
        } else {
            strLJIIJ = null;
        }
        if (Intrinsics.LJFF(strLJIIJ, "sticker_category:search")) {
            X1(new C1406600mhu("close_prop_panel"));
        }
    }

    public C1644740su0(C1DRG c1drg, boolean z) {
        this.LL = c1drg;
        this.LLILLJJLI = z;
    }

    private final void B3(String str, Function0<? extends HashMap<String, String>> function0) {
        String musicId;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getShortVideoContext().getCreationId());
        c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
        MusicObject musicObject = getShortVideoContext().creativeModel.musicBuzModel.music;
        if (musicObject == null || (musicId = MusicBeanUtilKt.getMusicId(musicObject)) == null) {
            musicId = "";
        }
        c0lab.LJ("music_id", musicId);
        c0lab.LJ("shoot_tab_name", getShortVideoContext().LJIJJLI());
        c0lab.LJ("enter_from", "video_shoot_page");
        if (function0 != null) {
            c0lab.LJI(function0.invoke());
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ(str, c0lab.LIZ);
    }

    private final void F4(FilterBean filterBean, InterfaceC1452660nuC interfaceC1452660nuC) {
        Float fValueOf;
        if (filterBean != null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LJ("creation_id", getShortVideoContext().getCreationId());
            c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
            c0lab.LIZ(getShortVideoContext().draftId, "draft_id");
            c0lab.LJ("filter_id", filterBean.getId());
            c0lab.LJ("filter_name", filterBean.getEnName());
            if (interfaceC1452660nuC != null) {
                fValueOf = Float.valueOf(interfaceC1452660nuC.LIZIZ(filterBean));
            } else {
                fValueOf = null;
            }
            c0lab.LIZJ(fValueOf, "value");
            C20684815ws.LJIILLIIL("adjust_filter_complete", c0lab.LIZ);
        }
    }

    public final void W1(HashMap<String, String> map, Effect effect) {
        String str;
        List<String> music = effect.getMusic();
        if (music == null || (str = (String) C13LP.LJJJLL(music)) == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (C1624200sMs.LJIILL(effect)) {
            map.put("music_selected_from", "prop_music_bind");
        } else {
            map.put("music_selected_from", "prop_music_soft_bind");
        }
    }
}

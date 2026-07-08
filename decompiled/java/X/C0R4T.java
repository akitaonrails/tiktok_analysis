package X;

import X.C830490Whz;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateData;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.ab.ECSearchResultFoldTopBarExperimentV2;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddleAIFragment;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopContainerVerticalAssem;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.LiveVerticalAssem;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.RoomProductsVerticalAssem;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.StoreVerticalAssem;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.ECSearchSuggestAssem;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.EcSearchSuggestAssemNew;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.ui.SearchTopBarAssem;
import com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.ui.DynamicSearchMusicFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0R4T, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4T extends AbstractC1542100qES {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (15 - this.$t != 0) {
            super.LJJZZIII(interfaceC1541990qEH, str);
        } else {
            LJJZZIII$0(this, interfaceC1541990qEH, str);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        switch (this.$t) {
            case 4:
                LJLI$0(this, interfaceC1541990qEH, str, str2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJLI$1(this, interfaceC1541990qEH, str, str2);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJLI$2(this, interfaceC1541990qEH, str, str2);
                break;
            default:
                super.LJLI(interfaceC1541990qEH, str, str2);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 1:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            case 2:
                LJLIIIL$2(this, interfaceC1541990qEH);
                break;
            case 3:
            case 5:
            case 6:
            case 14:
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
            case 4:
                LJLIIIL$3(this, interfaceC1541990qEH);
                break;
            case 7:
                LJLIIIL$4(this, interfaceC1541990qEH);
                break;
            case 8:
                LJLIIIL$5(this, interfaceC1541990qEH);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJLIIIL$6(this, interfaceC1541990qEH);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJLIIIL$7(this, interfaceC1541990qEH);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJLIIIL$8(this, interfaceC1541990qEH);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJLIIIL$9(this, interfaceC1541990qEH);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LJLIIIL$10(this, interfaceC1541990qEH);
                break;
            case 15:
                LJLIIIL$11(this, interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 0:
                LJLIIL$0(this, interfaceC1541990qEH, str);
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case BdTuring.TYPE_ECAF /* 9 */:
            default:
                super.LJLIIL(interfaceC1541990qEH, str);
                break;
            case 4:
                LJLIIL$1(this, interfaceC1541990qEH, str);
                break;
            case 8:
                LJLIIL$2(this, interfaceC1541990qEH, str);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJLIIL$3(this, interfaceC1541990qEH, str);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJLIIL$4(this, interfaceC1541990qEH, str);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJLIIL$5(this, interfaceC1541990qEH, str);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LJLIIL$6(this, interfaceC1541990qEH, str);
                break;
            case 14:
                LJLIIL$7(this, interfaceC1541990qEH, str);
                break;
            case 15:
                LJLIIL$8(this, interfaceC1541990qEH, str);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLJI$0(this, interfaceC1541990qEH);
                break;
            case 4:
                LJLJI$1(this, interfaceC1541990qEH);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJLJI$2(this, interfaceC1541990qEH);
                break;
            case 15:
                LJLJI$3(this, interfaceC1541990qEH);
                break;
            default:
                super.LJLJI(interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJI() {
        switch (this.$t) {
            case 0:
                LJLJJI$0(this);
                break;
            case 4:
                LJLJJI$1(this);
                break;
            case 15:
                LJLJJI$2(this);
                break;
            default:
                super.LJLJJI();
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
        switch (this.$t) {
            case 0:
                LJLJJLL$0(this, enumC1067640dtC);
                break;
            case 4:
                LJLJJLL$1(this, enumC1067640dtC);
                break;
            case 5:
                LJLJJLL$2(this, enumC1067640dtC);
                break;
            case 6:
                LJLJJLL$3(this, enumC1067640dtC);
                break;
            case 15:
                LJLJJLL$4(this, enumC1067640dtC);
                break;
            default:
                super.LJLJJLL(enumC1067640dtC);
                break;
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLILLLL(SparkContext sparkContext, String str) throws Throwable {
        switch (this.$t) {
            case 3:
                LJLLILLLL$0(this, sparkContext, str);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJLLILLLL$1(this, sparkContext, str);
                break;
            default:
                super.LJLLILLLL(sparkContext, str);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        switch (this.$t) {
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onDestroy$0(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onDestroy$1(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            default:
                super.onDestroy();
                break;
            case 15:
                onDestroy$2(this);
                break;
        }
    }

    public static final void LJLJJI$0(C0R4T c0r4t) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((StoreVerticalAssem) c0r4t.l0).LLJJLIIIJLLLLLLLZ.put("container_inited", Long.valueOf(jCurrentTimeMillis));
        Long l = (Long) ((LinkedHashMap) ((StoreVerticalAssem) c0r4t.l0).LLJJLIIIJLLLLLLLZ).get("start_navigation");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((StoreVerticalAssem) c0r4t.l0).So(jCurrentTimeMillis - jLongValue, "init_container");
    }

    public static final void LJLJJI$1(C0R4T c0r4t) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((MixShopContainerVerticalAssem) c0r4t.l0).LLJJJJLIIL.put("container_inited", Long.valueOf(jCurrentTimeMillis));
        Long l = (Long) ((LinkedHashMap) ((MixShopContainerVerticalAssem) c0r4t.l0).LLJJJJLIIL).get("start_navigation");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((MixShopContainerVerticalAssem) c0r4t.l0).bp(-1, "init_container", jCurrentTimeMillis - jLongValue, null);
    }

    public static final void LJLJJI$2(C0R4T c0r4t) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SparkViewContainer", "onPreKitCreate");
        AbstractC1542100qES abstractC1542100qES = ((C675430QeT) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLJJI();
        }
    }

    public static final void onDestroy$0(C0R4T c0r4t) {
        AbstractC1542100qES abstractC1542100qES = ((C0QCO) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.onDestroy();
        }
        ((C0QCO) c0r4t.l0).LJ();
    }

    public static final void onDestroy$1(C0R4T c0r4t) {
        AbstractC1542100qES abstractC1542100qES = ((C649290PdP) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.onDestroy();
        }
        ((C649290PdP) c0r4t.l0).LJIIIIZZ();
    }

    public static final void onDestroy$2(C0R4T c0r4t) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SparkViewContainer", "onDestroy");
        AbstractC1542100qES abstractC1542100qES = ((C675430QeT) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.onDestroy();
        }
        ((C675430QeT) c0r4t.l0).LJ();
    }

    public C0R4T(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        long jLongValue;
        ISearchVerticalContext iSearchVerticalContext;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((StoreVerticalAssem) c0r4t.l0).LLJJLIIIJLLLLLLLZ.put("template_loaded", Long.valueOf(jCurrentTimeMillis));
        Long l = (Long) ((LinkedHashMap) ((StoreVerticalAssem) c0r4t.l0).LLJJLIIIJLLLLLLLZ).get("template_prepared");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((StoreVerticalAssem) c0r4t.l0).So(jCurrentTimeMillis - jLongValue, "load_template");
        if (C106800ao.LIZ() || ECSearchResultFoldTopBarExperimentV2.LIZ()) {
            ((StoreVerticalAssem) c0r4t.l0).LLJ = new C2229651COl(interfaceC1541990qEH);
            C2229651COl c2229651COl = ((StoreVerticalAssem) c0r4t.l0).LLJ;
            if (c2229651COl != null && (iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL((StoreVerticalAssem) c0r4t.l0), ISearchVerticalContext.class, null)) != null) {
                iSearchVerticalContext.Yt1(c2229651COl);
            }
        }
    }

    public static final void LJLIIIL$1(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        C642000PGc c642000PGc = ((SearchTopBarAssem) c0r4t.l0).LLJL;
        if (c642000PGc != null) {
            c642000PGc.invoke(interfaceC1541990qEH);
        }
        ((SearchTopBarAssem) c0r4t.l0).LLJL = null;
    }

    public static final void LJLIIIL$10(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        C673430QbF c673430QbF = ((ECSearchSuggestAssem) c0r4t.l0).LLJZIJLIL;
        if (c673430QbF != null) {
            c673430QbF.LJII = true;
        }
    }

    public static final void LJLIIIL$11(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadFinish");
        sbLIZ.append(interfaceC1541990qEH);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SparkViewContainer", C2188811AlT.LIZIZ(sbLIZ));
        ((C675430QeT) c0r4t.l0).LIZLLL = new C0QCX(interfaceC1541990qEH);
        ((C675430QeT) c0r4t.l0).LJFF();
        AbstractC1542100qES abstractC1542100qES = ((C675430QeT) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLIIIL(interfaceC1541990qEH);
        }
    }

    public static final void LJLIIIL$2(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        ((C648830Pcf) c0r4t.l0).setContainerId(interfaceC1541990qEH.getHybridContext().containerId);
    }

    public static final void LJLIIIL$3(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        long jLongValue;
        ISearchVerticalContext iSearchVerticalContext;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((MixShopContainerVerticalAssem) c0r4t.l0).LLJJJJLIIL.put("template_loaded", Long.valueOf(jCurrentTimeMillis));
        Long l = (Long) ((LinkedHashMap) ((MixShopContainerVerticalAssem) c0r4t.l0).LLJJJJLIIL).get("template_prepared");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((MixShopContainerVerticalAssem) c0r4t.l0).bp(-1, "load_template", jCurrentTimeMillis - jLongValue, null);
        if (C106800ao.LIZ() || ECSearchResultFoldTopBarExperimentV2.LIZ()) {
            ((MixShopContainerVerticalAssem) c0r4t.l0).LLJJL = new C2229651COl(interfaceC1541990qEH);
            C2229651COl c2229651COl = ((MixShopContainerVerticalAssem) c0r4t.l0).LLJJL;
            if (c2229651COl != null && (iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL((MixShopContainerVerticalAssem) c0r4t.l0), ISearchVerticalContext.class, null)) != null) {
                iSearchVerticalContext.Yt1(c2229651COl);
            }
        }
    }

    public static final void LJLIIIL$4(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        ISearchVerticalContext iSearchVerticalContext;
        if (C106800ao.LIZ() || ECSearchResultFoldTopBarExperimentV2.LIZ()) {
            ((LiveVerticalAssem) c0r4t.l0).LLJILJIL = new C2229651COl(interfaceC1541990qEH);
            C2229651COl c2229651COl = ((LiveVerticalAssem) c0r4t.l0).LLJILJIL;
            if (c2229651COl != null && (iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL((LiveVerticalAssem) c0r4t.l0), ISearchVerticalContext.class, null)) != null) {
                iSearchVerticalContext.Yt1(c2229651COl);
            }
        }
    }

    public static final void LJLIIIL$5(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        ISearchVerticalContext iSearchVerticalContext;
        if (C106800ao.LIZ() || ECSearchResultFoldTopBarExperimentV2.LIZ()) {
            ((RoomProductsVerticalAssem) c0r4t.l0).LLJILJIL = new C2229651COl(interfaceC1541990qEH);
            C2229651COl c2229651COl = ((RoomProductsVerticalAssem) c0r4t.l0).LLJILJIL;
            if (c2229651COl != null && (iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL((RoomProductsVerticalAssem) c0r4t.l0), ISearchVerticalContext.class, null)) != null) {
                iSearchVerticalContext.Yt1(c2229651COl);
            }
        }
    }

    public static final void LJLIIIL$6(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1537720q7O c1537720q7O;
        if ((interfaceC1541990qEH instanceof C1537720q7O) && (c1537720q7O = (C1537720q7O) interfaceC1541990qEH) != null) {
            ((SearchHubVM) c0r4t.l0).LLJILJILJ = c1537720q7O;
        }
    }

    public static final void LJLIIIL$7(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        String str;
        C0QCU c0qcu;
        boolean z;
        String str2;
        ((C0QCO) c0r4t.l0).LIZLLL = new C0QCX(interfaceC1541990qEH);
        ((C0QCO) c0r4t.l0).LJFF();
        AbstractC1542100qES abstractC1542100qES = ((C0QCO) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLIIIL(interfaceC1541990qEH);
        }
        C0QCO c0qco = (C0QCO) c0r4t.l0;
        C0Q7A c0q7a = c0qco.LJIILLIIL;
        DynamicPatch dynamicPatch = c0qco.LJIIJJI;
        boolean z2 = c0qco.LJIILL;
        c0q7a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - c0q7a.LIZ;
        if (dynamicPatch == null || (str = dynamicPatch.schema) == null) {
            str = "";
        }
        C0QCV.LIZ.getClass();
        int iLIZ = C0QCV.LIZ(dynamicPatch);
        if (a0.LJJJIL(str) || (c0qcu = C0QCW.LIZ.get(str)) == null) {
            c0qcu = C0QCU.UNUSED;
        }
        C0Q76 c0q76 = new C0Q76();
        c0q76.LJIILLIIL("type", "load_success");
        c0q76.LJIILLIIL("schema", str);
        c0q76.LJIILLIIL("load_time", String.valueOf(jCurrentTimeMillis));
        int i = 0;
        if (c0qcu == C0QCU.USED) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "1";
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0q76.LJIILLIIL("is_forecast", str2);
        if (!z2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0q76.LJIILLIIL("preload", str3);
        if (iLIZ == 1) {
            i = 1;
        }
        c0q76.LJIILLIIL("is_built_in", String.valueOf(i));
        c0q76.LJIJ(2);
        c0q76.LJIILJJIL();
    }

    public static final void LJLIIIL$8(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        C648850Pch c648840Pcg;
        C1075770e6J c1075770e6J;
        String str;
        InterfaceC1541990qEH interfaceC1541990qEH2;
        C1537480q70 hybridContext;
        InterfaceC1541990qEH interfaceC1541990qEH3;
        View viewE1;
        C649290PdP c649290PdP = (C649290PdP) c0r4t.l0;
        if (interfaceC1541990qEH instanceof C1539250q9r) {
            c648840Pcg = new C648860Pci(interfaceC1541990qEH);
        } else {
            c648840Pcg = new C648840Pcg(interfaceC1541990qEH);
        }
        c649290PdP.LIZLLL = c648840Pcg;
        C649290PdP c649290PdP2 = (C649290PdP) c0r4t.l0;
        Iterator it2 = ((C830490Whz.a) c649290PdP2.LJI.entrySet()).iterator();
        while (true) {
            C830520Wi2 c830520Wi2 = (C830520Wi2) it2;
            if (!c830520Wi2.hasNext()) {
                break;
            }
            c830520Wi2.next();
            c649290PdP2.sendEvent((String) c830520Wi2.getKey(), (JSONObject) c830520Wi2.getValue());
        }
        for (Object obj : c649290PdP2.LJII) {
            if (obj instanceof TemplateData) {
                c649290PdP2.LIZLLL((TemplateData) obj);
            } else if (obj instanceof String) {
                c649290PdP2.LIZJ((String) obj);
            } else if (obj instanceof DynamicPatch) {
                DynamicPatch dynamicPatch = (DynamicPatch) obj;
                if (c649290PdP2.LIZLLL != null) {
                    AbstractC649410Pdb abstractC649410Pdb = c649290PdP2.LJFF;
                    if (abstractC649410Pdb != null) {
                        abstractC649410Pdb.LIZIZ(dynamicPatch);
                    }
                    C648850Pch c648850Pch = c649290PdP2.LIZLLL;
                    if (c648850Pch != null) {
                        c648850Pch.LIZJ(dynamicPatch);
                    }
                    AbstractC649410Pdb abstractC649410Pdb2 = c649290PdP2.LJFF;
                    if (abstractC649410Pdb2 != null) {
                        abstractC649410Pdb2.LIZ(dynamicPatch);
                    }
                } else {
                    c649290PdP2.LJII.add(dynamicPatch);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateData:");
                    sbLIZ.append(dynamicPatch);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        c649290PdP2.LJIIIIZZ();
        for (AbstractC649370PdX abstractC649370PdX : c649290PdP2.LJIIIIZZ) {
            C648850Pch c648850Pch2 = c649290PdP2.LIZLLL;
            C648850Pch c648850Pch3 = abstractC649370PdX.LLILLJJLI;
            if (c648850Pch3 != null && (interfaceC1541990qEH3 = c648850Pch3.LIZ) != null && (viewE1 = interfaceC1541990qEH3.e1()) != null) {
                viewE1.removeOnAttachStateChangeListener(abstractC649370PdX.LLILLL);
            }
            View viewE12 = c648850Pch2.LIZ.e1();
            if (viewE12 != null) {
                viewE12.addOnAttachStateChangeListener(abstractC649370PdX.LLILLL);
            }
            abstractC649370PdX.LIZIZ();
            abstractC649370PdX.LLILLJJLI = c648850Pch2;
        }
        C648850Pch c648850Pch4 = c649290PdP2.LIZLLL;
        if (c648850Pch4 != null && (interfaceC1541990qEH2 = c648850Pch4.LIZ) != null && (hybridContext = interfaceC1541990qEH2.getHybridContext()) != null) {
            c1075770e6J = (C1075770e6J) hybridContext.LJFF(C1075770e6J.class);
        } else {
            c1075770e6J = null;
        }
        String str2 = "";
        if (c1075770e6J != null) {
            for (final AbstractC648910Pcn abstractC648910Pcn : c649290PdP2.LJIIIZ) {
                abstractC648910Pcn.getClass();
                C650250Pex c650250Pex = new C650250Pex();
                c650250Pex.LIZ = abstractC648910Pcn.LIZ();
                c650250Pex.LIZJ = "";
                c650250Pex.LIZIZ = EnumC1062400dkk.PUBLIC;
                c650250Pex.LIZLLL = new C1543340qGS() { // from class: X.0PdY
                    @Override // X.C1543340qGS
                    public final void LIZLLL() {
                        abstractC648910Pcn.getClass();
                    }

                    @Override // X.C1543340qGS
                    public final void LIZIZ(Object obj2, C1543350qGT c1543350qGT) {
                        if (!(obj2 instanceof String)) {
                            return;
                        }
                        abstractC648910Pcn.LIZIZ(new JSONObject((String) obj2), new C651960Phi(c1543350qGT));
                    }
                };
                c1075770e6J.LJIILJJIL(c650250Pex);
            }
        }
        AbstractC1542100qES abstractC1542100qES = ((C649290PdP) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLIIIL(interfaceC1541990qEH);
        }
        C649290PdP c649290PdP3 = (C649290PdP) c0r4t.l0;
        C649250PdL c649250PdL = c649290PdP3.LJIJI;
        DynamicPatch dynamicPatch2 = c649290PdP3.LJIIJJI;
        boolean z = c649290PdP3.LJIILJJIL;
        c649250PdL.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c649250PdL.LIZIZ = jCurrentTimeMillis;
        long j = jCurrentTimeMillis - c649250PdL.LIZ;
        if (dynamicPatch2 != null && (str = dynamicPatch2.schema) != null) {
            str2 = str;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C0PYT(dynamicPatch2, str2, j, z, null), 3);
    }

    public static final void LJLIIIL$9(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        C673430QbF c673430QbF = ((EcSearchSuggestAssemNew) c0r4t.l0).LLJJIII;
        if (c673430QbF != null) {
            c673430QbF.LJII = true;
        }
    }

    public static final void LJLJI$0(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((StoreVerticalAssem) c0r4t.l0).LLJJLIIIJLLLLLLLZ.put("view_inited", Long.valueOf(jCurrentTimeMillis));
        Long l = (Long) ((LinkedHashMap) ((StoreVerticalAssem) c0r4t.l0).LLJJLIIIJLLLLLLLZ).get("container_inited");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((StoreVerticalAssem) c0r4t.l0).So(jCurrentTimeMillis - jLongValue, "init_view");
    }

    public static final void LJLJI$1(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((MixShopContainerVerticalAssem) c0r4t.l0).LLJJJJLIIL.put("view_inited", Long.valueOf(jCurrentTimeMillis));
        Long l = (Long) ((LinkedHashMap) ((MixShopContainerVerticalAssem) c0r4t.l0).LLJJJJLIIL).get("container_inited");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((MixShopContainerVerticalAssem) c0r4t.l0).bp(-1, "init_view", jCurrentTimeMillis - jLongValue, null);
    }

    public static final void LJLJI$2(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1537720q7O c1537720q7O;
        if ((interfaceC1541990qEH instanceof C1537720q7O) && (c1537720q7O = (C1537720q7O) interfaceC1541990qEH) != null) {
            ((SearchHubVM) c0r4t.l0).LLJILJILJ = c1537720q7O;
        }
    }

    public static final void LJLJI$3(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPostKitCreated:");
        sbLIZ.append(interfaceC1541990qEH);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SparkViewContainer", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1542100qES abstractC1542100qES = ((C675430QeT) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLJI(interfaceC1541990qEH);
        }
    }

    public static final void LJLJJLL$0(C0R4T c0r4t, EnumC1067640dtC enumC1067640dtC) {
        long jLongValue;
        InterfaceC1541990qEH kitView;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((StoreVerticalAssem) c0r4t.l0).LLJJLIIIJLLLLLLLZ.put("app_loaded", Long.valueOf(jCurrentTimeMillis));
        Long l = (Long) ((LinkedHashMap) ((StoreVerticalAssem) c0r4t.l0).LLJJLIIIJLLLLLLLZ).get("template_prepared");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((StoreVerticalAssem) c0r4t.l0).So(jCurrentTimeMillis - jLongValue, "load_app");
        StoreVerticalAssem storeVerticalAssem = (StoreVerticalAssem) c0r4t.l0;
        if (storeVerticalAssem.LLJJLIIIJLLLLLLLZ.containsKey("app_loaded") && storeVerticalAssem.LLJJLIIIJLLLLLLLZ.containsKey("draw_done")) {
            C675430QeT c675430QeT = ((StoreVerticalAssem) c0r4t.l0).LLJJJJJIL;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
            if (c675430QeT != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT.LJIILIIL;
            }
            if ((sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.updateData(C2097908Jt.LIZJ(new Pair("searchShopContainerPerf", ((StoreVerticalAssem) c0r4t.l0).LLJJLIIIJLLLLLLLZ)));
            }
        }
    }

    public static final void LJLJJLL$1(C0R4T c0r4t, EnumC1067640dtC enumC1067640dtC) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((MixShopContainerVerticalAssem) c0r4t.l0).LLJJJJLIIL.put("app_loaded", Long.valueOf(jCurrentTimeMillis));
        Long l = (Long) ((LinkedHashMap) ((MixShopContainerVerticalAssem) c0r4t.l0).LLJJJJLIIL).get("template_prepared");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((MixShopContainerVerticalAssem) c0r4t.l0).bp(-1, "load_app", jCurrentTimeMillis - jLongValue, null);
    }

    public static final void LJLJJLL$2(C0R4T c0r4t, EnumC1067640dtC enumC1067640dtC) {
        Function0<Unit> function0;
        C647530PaZ c647530PaZ = (C647530PaZ) c0r4t.l0;
        c647530PaZ.LJIILIIL = true;
        if (c647530PaZ.LJIIL != null && (function0 = c647530PaZ.LJIIL) != null) {
            function0.invoke();
        }
    }

    public static final void LJLJJLL$3(C0R4T c0r4t, EnumC1067640dtC enumC1067640dtC) {
        Function0<Unit> function0;
        C647530PaZ c647530PaZ = (C647530PaZ) c0r4t.l0;
        c647530PaZ.LJIILIIL = true;
        if (c647530PaZ.LJIIL != null && (function0 = c647530PaZ.LJIIL) != null) {
            function0.invoke();
        }
    }

    public static final void LJLJJLL$4(C0R4T c0r4t, EnumC1067640dtC enumC1067640dtC) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SparkViewContainer", "onRuntimeReady");
        AbstractC1542100qES abstractC1542100qES = ((C675430QeT) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLJJLL(enumC1067640dtC);
        }
    }

    public static final void LJJZZIII$0(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadFailed");
        sbLIZ.append(str);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SparkViewContainer", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1542100qES abstractC1542100qES = ((C675430QeT) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJJZZIII(interfaceC1541990qEH, str);
        }
        ((C675430QeT) c0r4t.l0).LJ();
    }

    public static final void LJLIIL$0(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((StoreVerticalAssem) c0r4t.l0).LLJJLIIIJLLLLLLLZ.put("template_prepared", Long.valueOf(jCurrentTimeMillis));
        Long l = (Long) ((LinkedHashMap) ((StoreVerticalAssem) c0r4t.l0).LLJJLIIIJLLLLLLLZ).get("view_inited");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((StoreVerticalAssem) c0r4t.l0).So(jCurrentTimeMillis - jLongValue, "prepare_template");
    }

    public static final void LJLIIL$1(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((MixShopContainerVerticalAssem) c0r4t.l0).LLJJJJLIIL.put("template_prepared", Long.valueOf(jCurrentTimeMillis));
        Long l = (Long) ((LinkedHashMap) ((MixShopContainerVerticalAssem) c0r4t.l0).LLJJJJLIIL).get("view_inited");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((MixShopContainerVerticalAssem) c0r4t.l0).bp(-1, "prepare_template", jCurrentTimeMillis - jLongValue, null);
    }

    public static final void LJLIIL$2(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        ((RoomProductsVerticalAssem) c0r4t.l0).Go();
    }

    public static final void LJLIIL$3(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        AbstractC1542100qES abstractC1542100qES = ((C0QCO) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLIIL(interfaceC1541990qEH, str);
        }
    }

    public static final void LJLIIL$4(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        AbstractC1542100qES abstractC1542100qES = ((C649290PdP) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLIIL(interfaceC1541990qEH, str);
        }
    }

    public static final void LJLIIL$5(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        ((EcSearchSuggestAssemNew) c0r4t.l0).hp();
    }

    public static final void LJLIIL$6(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        ((ECSearchSuggestAssem) c0r4t.l0).hp();
    }

    public static final void LJLIIL$7(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        ((EcSearchMiddleAIFragment) c0r4t.l0).MR();
    }

    public static final void LJLIIL$8(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadStart:");
        sbLIZ.append(str);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SparkViewContainer", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1542100qES abstractC1542100qES = ((C675430QeT) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLIIL(interfaceC1541990qEH, str);
        }
    }

    public static final void LJLLILLLL$0(C0R4T c0r4t, SparkContext sparkContext, String str) throws Throwable {
        ((DynamicSearchMusicFragment) c0r4t.l0).LLLIZZ = true;
        DynamicSearchMusicFragment dynamicSearchMusicFragment = (DynamicSearchMusicFragment) c0r4t.l0;
        dynamicSearchMusicFragment.GS(dynamicSearchMusicFragment.LLLILZJ, dynamicSearchMusicFragment.LLLILZLLLI);
    }

    public static final void LJLLILLLL$1(C0R4T c0r4t, SparkContext sparkContext, String str) {
        C649290PdP c649290PdP = (C649290PdP) c0r4t.l0;
        c649290PdP.LJIIIIZZ();
        c649290PdP.LIZLLL = null;
        AbstractC1542100qES abstractC1542100qES = ((C649290PdP) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLLILLLL(sparkContext, str);
        }
    }

    public static final void LJLI$0(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        long jLongValue;
        Long l = (Long) ((LinkedHashMap) ((MixShopContainerVerticalAssem) c0r4t.l0).LLJJJJLIIL).get("template_prepared");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ((MixShopContainerVerticalAssem) c0r4t.l0).bp(0, "init_fail", System.currentTimeMillis() - jLongValue, str2);
    }

    public static final void LJLI$1(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        String str3;
        int i;
        AbstractC1542100qES abstractC1542100qES = ((C0QCO) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJJZZIII(interfaceC1541990qEH, str);
        }
        C0QCO c0qco = (C0QCO) c0r4t.l0;
        C0Q7A c0q7a = c0qco.LJIILLIIL;
        DynamicPatch dynamicPatch = c0qco.LJIIJJI;
        c0q7a.getClass();
        if (dynamicPatch == null || (str3 = dynamicPatch.schema) == null) {
            str3 = "";
        }
        C0QCV.LIZ.getClass();
        int iLIZ = C0QCV.LIZ(dynamicPatch);
        C0Q76 c0q76 = new C0Q76();
        c0q76.LJIILLIIL("type", "load_failed");
        c0q76.LJIILLIIL("schema", str3);
        c0q76.LJIILLIIL("error", str2);
        if (iLIZ == 1) {
            i = 1;
        } else {
            i = 0;
        }
        c0q76.LJIILLIIL("is_built_in", String.valueOf(i));
        c0q76.LJIJ(1);
        c0q76.LJIILJJIL();
        if (!a0.LJJJIL(str3)) {
            C0Q76.LJIIZILJ.remove(str3);
        }
        ((C0QCO) c0r4t.l0).LJ();
    }

    public static final void LJLI$2(C0R4T c0r4t, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        String str3;
        AbstractC1542100qES abstractC1542100qES = ((C649290PdP) c0r4t.l0).LJ;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJJZZIII(interfaceC1541990qEH, str);
        }
        C649290PdP c649290PdP = (C649290PdP) c0r4t.l0;
        C649250PdL c649250PdL = c649290PdP.LJIJI;
        DynamicPatch dynamicPatch = c649290PdP.LJIIJJI;
        c649250PdL.getClass();
        if (dynamicPatch == null || (str3 = dynamicPatch.schema) == null) {
            str3 = "";
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C0PYU(dynamicPatch, str3, str2, null), 3);
        C647880Pb8.LIZIZ(str3);
        ((C649290PdP) c0r4t.l0).LJIIIIZZ();
    }
}

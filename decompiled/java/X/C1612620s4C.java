package X;

import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.iap.component.api.PaymentComponentResponse;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.model.PaywallInfoModel;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import com.ss.android.ugc.aweme.model.VipSubscriptionCycleType;
import com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption;
import com.ss.android.ugc.aweme.service.IPaidContentPanelAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0s4C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612620s4C implements InterfaceC1615720s9C, InterfaceC1613260s5E {
    public final AbstractC738140SxQ LL;
    public View LLILLJJLI;
    public FrameLayout LLILLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILZ;
    public C11NJ LLILZIL;
    public Aweme LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1806));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1909));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1907));
    public EnumC1612690s4J LLJIJIL;

    @Override // X.InterfaceC1615720s9C
    public final void LIZ() {
    }

    @Override // X.InterfaceC1615720s9C
    public final int LIZLLL() {
        return R.layout.bhf;
    }

    public final Map<String, Object> LJI() {
        IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ = LJIIIIZZ();
        return iPaidContentPanelAbilityLJIIIIZZ == null ? C2097608Jq.LJ() : LJII(iPaidContentPanelAbilityLJIIIIZZ.getPurchaseOption(), iPaidContentPanelAbilityLJIIIIZZ.RS1(), iPaidContentPanelAbilityLJIIIIZZ.Tw(), iPaidContentPanelAbilityLJIIIIZZ.Am1(), true, false);
    }

    @Override // X.InterfaceC1615720s9C
    public final void LIZIZ() {
        String strLJFF;
        ViewGroup viewGroup;
        CollectionDetailModel collectionDetailModelZl0;
        String str;
        ArrayList arrayList;
        List<VipSubscriptionPurchaseOption> list;
        String cycleString;
        CollectionDetailModel collectionDetailModelZl02;
        List<PurchaseOption> purchaseOption;
        Aweme awemeLJIIIIZZ;
        Aweme awemeLJIIIIZZ2;
        Aweme aweme = this.LLILZLL;
        if (aweme != null) {
            String aid = aweme.getAid();
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJ.getValue();
            if (!Intrinsics.LJFF(aid, (iViewPagerComponentAbility == null || (awemeLJIIIIZZ2 = iViewPagerComponentAbility.LJIIIIZZ()) == null) ? null : awemeLJIIIIZZ2.getAid())) {
                return;
            }
        }
        if (this.LLIZ) {
            return;
        }
        C1606520ruM.LIZ.getClass();
        if (C1606520ruM.LIZ()) {
            Aweme aweme2 = this.LLILZLL;
            if (aweme2 != null) {
                String aid2 = aweme2.getAid();
                IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) this.LLJ.getValue();
                if (!Intrinsics.LJFF(aid2, (iViewPagerComponentAbility2 == null || (awemeLJIIIIZZ = iViewPagerComponentAbility2.LJIIIIZZ()) == null) ? null : awemeLJIIIIZZ.getAid())) {
                    return;
                }
            }
            Context context = this.LL.getContext();
            if (context == null) {
                return;
            } else {
                C1606650ruZ.LIZIZ.LIZ("short_drama_paywall", this.LLILLL, LJI(), context, AFwS213S0000000_24.get$arr$(693), new AwS568S0100000_24(this, 1908));
            }
        } else {
            Context context2 = this.LL.getContext();
            if (context2 == null) {
                return;
            }
            IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ = LJIIIIZZ();
            Long lValueOf = (iPaidContentPanelAbilityLJIIIIZZ == null || (collectionDetailModelZl0 = iPaidContentPanelAbilityLJIIIIZZ.zl0()) == null) ? null : Long.valueOf(collectionDetailModelZl0.collectionId);
            LinkedHashMap linkedHashMap = new LinkedHashMap(LJI());
            if (lValueOf != null) {
                linkedHashMap.putAll(C1616810sAx.LIZIZ.LJIIJ(lValueOf.toString()));
            }
            if (C517260KQi.LIZ()) {
                C1612800s4U c1612800s4U = C1612800s4U.LIZ;
                EnumC1616780sAu enumC1616780sAu = EnumC1616780sAu.SHORT_DRAMA;
                String string = lValueOf != null ? lValueOf.toString() : null;
                c1612800s4U.getClass();
                strLJFF = C1612800s4U.LJFF(enumC1616780sAu, string);
            } else {
                strLJFF = "aweme://roma_redirect/?spark_page=short_drama_iap_paywall";
            }
            C1612800s4U.LIZ.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII = C1612800s4U.LJII(context2, strLJFF, linkedHashMap);
            this.LLILZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII;
            SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII.getSparkContext();
            if (sparkContext != null) {
                sparkContext.LJJJJJ(new InterfaceC1059280dfi() { // from class: X.0r57
                    @Override // X.InterfaceC1059280dfi
                    public final void m3(boolean z) {
                    }

                    @Override // X.InterfaceC1051240dSk
                    public final void refresh() {
                    }

                    @Override // X.InterfaceC1059280dfi
                    public final void close() {
                        Fragment fragmentLJI = C724240Sb0.LJI(this.LL.LL);
                        if (fragmentLJI != null) {
                            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IFeedFragmentAbility.class, null);
                            IDetailBaseAbility iDetailBaseAbility = (IDetailBaseAbility) (interfaceC494301wDLIZ instanceof IDetailPageAbility ? interfaceC494301wDLIZ : null);
                            if (iDetailBaseAbility != null) {
                                iDetailBaseAbility.yF(-1, "click");
                            }
                        }
                    }
                });
            }
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII.LJIIIIZZ();
            FrameLayout frameLayout = this.LLILLL;
            if (frameLayout != null) {
                C786410Ut5.LJJJJI(frameLayout);
                ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII, viewGroup);
                }
                frameLayout.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII, new ViewGroup.LayoutParams(-1, -1));
                C786410Ut5.LJLZ(0, frameLayout);
            }
        }
        if (this.LLILLL != null) {
            IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ2 = LJIIIIZZ();
            if (iPaidContentPanelAbilityLJIIIIZZ2 != null) {
                iPaidContentPanelAbilityLJIIIIZZ2.Lf2(this);
            }
            View view = this.LLILLJJLI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            this.LLIZ = true;
            IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ3 = LJIIIIZZ();
            C1612770s4R c1612770s4RCJ2 = iPaidContentPanelAbilityLJIIIIZZ3 != null ? iPaidContentPanelAbilityLJIIIIZZ3.cJ2() : null;
            IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ4 = LJIIIIZZ();
            PaywallInfoModel paywallInfoModelTw = iPaidContentPanelAbilityLJIIIIZZ4 != null ? iPaidContentPanelAbilityLJIIIIZZ4.Tw() : null;
            if (c1612770s4RCJ2 != null) {
                C1612490s3z c1612490s3z = C1612490s3z.LJI;
                IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ5 = LJIIIIZZ();
                CollectionDetailModel collectionDetailModelZl03 = iPaidContentPanelAbilityLJIIIIZZ5 != null ? iPaidContentPanelAbilityLJIIIIZZ5.zl0() : null;
                Boolean boolValueOf = Boolean.valueOf(c1612770s4RCJ2.LIZ);
                Boolean boolValueOf2 = Boolean.valueOf(c1612770s4RCJ2.LIZIZ);
                Boolean boolValueOf3 = Boolean.valueOf(c1612770s4RCJ2.LIZJ);
                Boolean boolValueOf4 = Boolean.valueOf(c1612770s4RCJ2.LIZLLL);
                String str2 = c1612770s4RCJ2.LJ;
                EnumC1612690s4J enumC1612690s4J = this.LLJIJIL;
                String key = enumC1612690s4J != null ? enumC1612690s4J.getKey() : null;
                Integer numValueOf = Integer.valueOf(c1612770s4RCJ2.LJI);
                Boolean boolValueOf5 = Boolean.valueOf(this.LLJIJIL != EnumC1612690s4J.EPISODE_SELECTION_CLICK_LOCKED_VIDEO);
                String str3 = c1612770s4RCJ2.LJIIIIZZ;
                IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ6 = LJIIIIZZ();
                if (iPaidContentPanelAbilityLJIIIIZZ6 == null || (purchaseOption = iPaidContentPanelAbilityLJIIIIZZ6.getPurchaseOption()) == null || purchaseOption.isEmpty()) {
                    str = CardStruct.IStatusCode.DEFAULT;
                } else {
                    Iterator<PurchaseOption> it2 = purchaseOption.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().discountId != null) {
                            str = "1";
                            break;
                        }
                    }
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ7 = LJIIIIZZ();
                SeriesCategory seriesCategory = (iPaidContentPanelAbilityLJIIIIZZ7 == null || (collectionDetailModelZl02 = iPaidContentPanelAbilityLJIIIIZZ7.zl0()) == null) ? null : collectionDetailModelZl02.category;
                C1612600s4A c1612600s4A = c1612770s4RCJ2.LJIIIZ;
                Boolean bool = c1612770s4RCJ2.LJIIJ;
                Boolean bool2 = c1612770s4RCJ2.LJIIJJI;
                String str4 = c1612770s4RCJ2.LJIIL;
                C1612570s47 c1612570s47 = c1612770s4RCJ2.LJIILIIL;
                IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ8 = LJIIIIZZ();
                String seriesEnterEntrance = iPaidContentPanelAbilityLJIIIIZZ8 != null ? iPaidContentPanelAbilityLJIIIIZZ8.getSeriesEnterEntrance() : null;
                if (paywallInfoModelTw == null || (list = paywallInfoModelTw.subsOptions) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    Iterator<VipSubscriptionPurchaseOption> it3 = list.iterator();
                    while (it3.hasNext()) {
                        VipSubscriptionCycleType vipSubscriptionCycleType = it3.next().cycleType;
                        if (vipSubscriptionCycleType != null && (cycleString = vipSubscriptionCycleType.toCycleString()) != null) {
                            arrayList.add(cycleString);
                        }
                    }
                }
                C1612560s46 c1612560s46 = new C1612560s46("full", false, arrayList, C2097608Jq.LJ());
                DramaExtraTrackingParams dramaExtraTrackingParams = c1612770s4RCJ2.LJIILLIIL;
                c1612490s3z.getClass();
                C1612490s3z.LJJJLL(collectionDetailModelZl03, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, str2, key, numValueOf, boolValueOf5, str3, str, seriesCategory, c1612600s4A, bool, bool2, str4, c1612570s47, seriesEnterEntrance, "full", c1612560s46, dramaExtraTrackingParams);
            }
        }
    }

    @Override // X.InterfaceC1615720s9C
    public final void LJFF() {
        View view;
        if (this.LLIZ && (view = this.LLILLJJLI) != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        this.LLIZ = false;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = this.LLILLL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ = LJIIIIZZ();
        if (iPaidContentPanelAbilityLJIIIIZZ != null) {
            iPaidContentPanelAbilityLJIIIIZZ.S20(this);
        }
        this.LLILZ = null;
    }

    public final IPaidContentPanelAbility LJIIIIZZ() {
        return (IPaidContentPanelAbility) this.LLJI.getValue();
    }

    @Override // X.InterfaceC1615720s9C
    public final void LJJIIJ() {
        C11NJ c11nj = this.LLILZIL;
        if (c11nj != null) {
            c11nj.LJ();
        }
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            HandlerHook.viewPost(frameLayout, new ARunnableS124S0100000_24(this, 175));
        }
    }

    @Override // X.InterfaceC1615720s9C
    public final void LLIIIZ() {
        LJFF();
    }

    public C1612620s4C(BaseCellSlotComponent baseCellSlotComponent) {
        this.LL = baseCellSlotComponent;
    }

    @Override // X.InterfaceC1615720s9C
    public final void LIZJ(C11NJ c11nj) {
        this.LLILZIL = c11nj;
    }

    @Override // X.InterfaceC1615720s9C
    public final void onBind(Aweme aweme) {
        this.LLILZLL = aweme;
    }

    @Override // X.InterfaceC1615720s9C
    public final void onViewCreated(View view) {
        FrameLayout frameLayout;
        DetailPageComponent detailPageComponentDn1;
        View view2 = null;
        if (view instanceof FrameLayout) {
            frameLayout = (FrameLayout) view;
        } else {
            frameLayout = null;
        }
        this.LLILLL = frameLayout;
        Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
        if (fragmentLJI != null) {
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IFeedFragmentAbility.class, null);
            if (!(interfaceC494301wDLIZ instanceof IDetailPageAbility)) {
                interfaceC494301wDLIZ = null;
            }
            IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) interfaceC494301wDLIZ;
            if (iDetailPageAbility != null && (detailPageComponentDn1 = iDetailPageAbility.Dn1()) != null) {
                view2 = detailPageComponentDn1.LLJJIJIIJIL;
            }
        }
        this.LLILLJJLI = view2;
    }

    @Override // X.InterfaceC1613260s5E
    public final void LJ(List<PurchaseOption> list, List<C1613030s4r> list2, PaywallInfoModel paywallInfoModel, C1613030s4r c1613030s4r) {
        Map<String, ? extends Object> mapLJII = LJII(list, list2, paywallInfoModel, c1613030s4r, false, true);
        C1606520ruM.LIZ.getClass();
        if (C1606520ruM.LIZ()) {
            if (this.LL.getContext() != null) {
                C1606650ruZ.LIZIZ.LIZIZ(null, "short_drama_paywall", mapLJII);
            }
        } else {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
                return;
            }
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.U0(mapLJII);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public final Map<String, Object> LJII(List<PurchaseOption> list, List<C1613030s4r> list2, PaywallInfoModel paywallInfoModel, C1613030s4r c1613030s4r, boolean z, boolean z2) {
        CollectionDetailModel collectionDetailModelZl0;
        JSONObject jSONObjectLIZ;
        C1612770s4R c1612770s4RCJ2;
        EnumC1612690s4J enumC1612690s4J;
        boolean z3;
        List<VipSubscriptionPurchaseOption> list3;
        ?? LJ;
        Map<String, String> mapLJ;
        Map<String, String> mapLJ2;
        Map<String, Object> map;
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty() && paywallInfoModel != null && c1613030s4r != null) {
            IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ = LJIIIIZZ();
            if (iPaidContentPanelAbilityLJIIIIZZ != null && (collectionDetailModelZl0 = iPaidContentPanelAbilityLJIIIIZZ.zl0()) != null) {
                long j = collectionDetailModelZl0.collectionId;
                if (C286700BLo.LIZ() && (list3 = paywallInfoModel.subsOptions) != null && !list3.isEmpty()) {
                    C1612800s4U.LIZ.getClass();
                    JSONObject jSONObjectLIZ2 = C1612800s4U.LIZ(j, collectionDetailModelZl0, list, list2, paywallInfoModel, c1613030s4r);
                    C1612750s4P c1612750s4PI90 = iPaidContentPanelAbilityLJIIIIZZ.i90();
                    if (c1612750s4PI90 != null && (map = c1612750s4PI90.LIZJ) != null) {
                        LJ = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                        Iterator it2 = map.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (!(value instanceof IapSubscriptionProduct)) {
                                value = null;
                            }
                            LJ.put(key, value);
                        }
                    } else {
                        LJ = C2097608Jq.LJ();
                    }
                    if (c1612750s4PI90 == null || (mapLJ = c1612750s4PI90.LIZ) == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    if (c1612750s4PI90 == null || (mapLJ2 = c1612750s4PI90.LIZIZ) == null) {
                        mapLJ2 = C2097608Jq.LJ();
                    }
                    List listLIZJ = C1612810s4V.LIZJ(list3, mapLJ, mapLJ2, LJ);
                    C1612800s4U.LIZ.getClass();
                    jSONObjectLIZ = C1612800s4U.LJ(listLIZJ, jSONObjectLIZ2);
                } else {
                    C1612800s4U.LIZ.getClass();
                    jSONObjectLIZ = C1612800s4U.LIZ(j, collectionDetailModelZl0, list, list2, paywallInfoModel, c1613030s4r);
                }
                Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("iap_biz_data", jSONObjectLIZ));
                PaymentComponentResponse paymentComponentResponseRQ1 = iPaidContentPanelAbilityLJIIIIZZ.rQ1();
                if (paymentComponentResponseRQ1 != null) {
                    mapLJIIJ.put("iap_schema_config", new JSONObject(GsonProtectorUtils.toJson((Gson) this.LLIZLLLIL.getValue(), paymentComponentResponseRQ1)));
                }
                if (z) {
                    c1612770s4RCJ2 = iPaidContentPanelAbilityLJIIIIZZ.g02();
                    this.LLJIJIL = c1612770s4RCJ2.LJFF;
                } else {
                    c1612770s4RCJ2 = iPaidContentPanelAbilityLJIIIIZZ.cJ2();
                }
                if (z2) {
                    EnumC1612690s4J enumC1612690s4J2 = this.LLJIJIL;
                    if (enumC1612690s4J2 == null) {
                        enumC1612690s4J = EnumC1612690s4J.UNKNOWN;
                    } else {
                        enumC1612690s4J = enumC1612690s4J2;
                    }
                    if (enumC1612690s4J2 != EnumC1612690s4J.EPISODE_SELECTION_CLICK_LOCKED_VIDEO) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c1612770s4RCJ2 = new C1612770s4R(c1612770s4RCJ2.LIZ, c1612770s4RCJ2.LIZIZ, c1612770s4RCJ2.LIZJ, c1612770s4RCJ2.LIZLLL, c1612770s4RCJ2.LJ, enumC1612690s4J, c1612770s4RCJ2.LJI, z3, c1612770s4RCJ2.LJIIIIZZ, c1612770s4RCJ2.LJIIIZ, c1612770s4RCJ2.LJIIJ, c1612770s4RCJ2.LJIIJJI, c1612770s4RCJ2.LJIIL, c1612770s4RCJ2.LJIILIIL, c1612770s4RCJ2.LJIILJJIL, c1612770s4RCJ2.LJIILL, c1612770s4RCJ2.LJIILLIIL);
                }
                C1612800s4U c1612800s4U = C1612800s4U.LIZ;
                Long lValueOf = Long.valueOf(j);
                c1612800s4U.getClass();
                mapLJIIJ.put("iap_tracking_data", C1612800s4U.LIZIZ(lValueOf, collectionDetailModelZl0, c1612770s4RCJ2, null));
                return mapLJIIJ;
            }
            return C2097608Jq.LJ();
        }
        return C2097608Jq.LJ();
    }
}

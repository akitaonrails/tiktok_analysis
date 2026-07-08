package X;

import Y.AObserverS23S0310000_24;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.wallet.model.IapProductGetParam;
import com.bytedance.android.live.wallet.model.IapProductGetResult;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorExtraModel;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorLogExtraModel;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentCustomAnchorViewModel;
import com.ss.android.ugc.aweme.service.ISeriesPricingService;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0s6F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.paid.content.consumption.CustomPaidContentSingleAnchorView$bindData$1", f = "CustomPaidContentSingleAnchorView.kt", l = {}, m = "invokeSuspend")
public final class C1613890s6F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1613880s6E LL;
    public final /* synthetic */ AnchorCommonStruct LLILLJJLI;
    public final /* synthetic */ InterfaceC1392640mLO LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1613890s6F(C1613880s6E c1613880s6E, AnchorCommonStruct anchorCommonStruct, InterfaceC1392640mLO interfaceC1392640mLO, boolean z, int i, InterfaceC1364105Vn<? super C1613890s6F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1613880s6E;
        this.LLILLJJLI = anchorCommonStruct;
        this.LLILLL = interfaceC1392640mLO;
        this.LLILZ = z;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1613890s6F(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String extra;
        String logExtra;
        Aweme awemeLJJLIIIJJIZ;
        C1215180hjA c1215180hjA;
        String str;
        C1215180hjA c1215180hjA2;
        String str2;
        final boolean z;
        String str3;
        PaidContentAnchorExtraModel paidContentAnchorExtraModel;
        String str4;
        IapProductGetResult.Item item;
        String str5;
        String id;
        String str6;
        String id2;
        String str7;
        String str8;
        PriceInfo priceInfo;
        String str9;
        String str10;
        String strValueOf;
        long jLongValue;
        String str11;
        String strValueOf2;
        Character chLJLLILLLL;
        Character chLJLLILLLL2;
        String str12;
        String strValueOf3;
        Character chLJLLILLLL3;
        String keyword;
        String str13;
        String schema;
        String schema2;
        C1C7U.LIZ("CustomPaidContentSingleAnchorView@606f.bindData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PaidContentCustomAnchorViewModel viewModel = this.LL.getViewModel();
        AnchorCommonStruct anchorCommonStruct = this.LLILLJJLI;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILLL;
        int i = this.LLILZIL;
        viewModel.LL = interfaceC1392640mLO;
        viewModel.LLILLJJLI = anchorCommonStruct;
        viewModel.LLILZ = i;
        PaidContentCustomAnchorViewModel viewModel2 = this.LL.getViewModel();
        AnchorCommonStruct anchorCommonStruct2 = viewModel2.LLILLJJLI;
        String str14 = null;
        if (anchorCommonStruct2 != null) {
            extra = anchorCommonStruct2.getExtra();
        } else {
            extra = null;
        }
        AnchorCommonStruct anchorCommonStruct3 = viewModel2.LLILLJJLI;
        if (anchorCommonStruct3 != null) {
            logExtra = anchorCommonStruct3.getLogExtra();
        } else {
            logExtra = null;
        }
        try {
            PaidContentAnchorExtraModel paidContentAnchorExtraModel2 = (PaidContentAnchorExtraModel) ((Gson) viewModel2.LLJIJIL.getValue()).LJII(extra, PaidContentAnchorExtraModel.class);
            viewModel2.LLILLL = paidContentAnchorExtraModel2;
            if (paidContentAnchorExtraModel2 != null) {
                if (paidContentAnchorExtraModel2.isSchemaEncoded) {
                    AnchorCommonStruct anchorCommonStruct4 = viewModel2.LLILLJJLI;
                    if (anchorCommonStruct4 != null) {
                        schema2 = anchorCommonStruct4.getSchema();
                    } else {
                        schema2 = null;
                    }
                    schema = Uri.decode(schema2);
                } else {
                    AnchorCommonStruct anchorCommonStruct5 = viewModel2.LLILLJJLI;
                    if (anchorCommonStruct5 != null) {
                        schema = anchorCommonStruct5.getSchema();
                    } else {
                        schema = null;
                    }
                }
                viewModel2.LLILZLL = schema;
            }
            viewModel2.LLILZIL = ((PaidContentAnchorLogExtraModel) ((Gson) viewModel2.LLJIJIL.getValue()).LJII(logExtra, PaidContentAnchorLogExtraModel.class)).collectionID;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20684815ws.LJIILLIIL("paid_content_anchor_extra_model_failed", new C2344009Gk().LIZ);
        }
        PaidContentCustomAnchorViewModel viewModel3 = this.LL.getViewModel();
        InterfaceC1392640mLO interfaceC1392640mLO2 = viewModel3.LL;
        if (interfaceC1392640mLO2 != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        Long l = viewModel3.LLILZIL;
        if (awemeLJJLIIIJJIZ != null && l != null && (str13 = viewModel3.LLILZLL) != null && str13.length() != 0 && C718480SGg.LIZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str13), "category")) == SeriesCategory.MINI_DRAMA) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(viewModel3), null, null, new C05DX(viewModel3, awemeLJJLIIIJJIZ, l, null), 3);
        }
        C1613930s6J c1613930s6J = this.LL.LLIZ;
        if (c1613930s6J != null) {
            C1215180hjA c1215180hjA3 = new C1215180hjA(c1613930s6J.LIZ.getContext());
            c1613930s6J.LIZIZ = c1215180hjA3;
            c1613930s6J.LIZ.addView(c1215180hjA3);
        }
        C1613930s6J c1613930s6J2 = this.LL.LLIZ;
        if (c1613930s6J2 != null) {
            final PaidContentCustomAnchorViewModel viewModel4 = c1613930s6J2.LIZ.getViewModel();
            C1215180hjA c1215180hjA4 = c1613930s6J2.LIZIZ;
            if (c1215180hjA4 != null) {
                AnchorCommonStruct anchorCommonStruct6 = viewModel4.LLILLJJLI;
                if (anchorCommonStruct6 != null) {
                    keyword = anchorCommonStruct6.getKeyword();
                } else {
                    keyword = null;
                }
                c1215180hjA4.setTitle$anchor_business_release(keyword);
            }
            final C1215180hjA c1215180hjA5 = c1613930s6J2.LIZIZ;
            Context context = c1613930s6J2.LIZ.getContext();
            PaidContentAnchorExtraModel paidContentAnchorExtraModel3 = viewModel4.LLILLL;
            if (paidContentAnchorExtraModel3 != null && (str2 = paidContentAnchorExtraModel3.iapID) != null && str2.length() != 0) {
                PaidContentAnchorExtraModel paidContentAnchorExtraModel4 = viewModel4.LLILLL;
                if (paidContentAnchorExtraModel4 != null && paidContentAnchorExtraModel4.enableSingleVideoPurchase) {
                    z = true;
                } else {
                    z = false;
                }
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("paid_content_anchor_pricing_manager_setting", false)) {
                    Long l2 = viewModel4.LLILZIL;
                    PaidContentAnchorExtraModel paidContentAnchorExtraModel5 = viewModel4.LLILLL;
                    if (paidContentAnchorExtraModel5 != null) {
                        str7 = paidContentAnchorExtraModel5.discountedUSDPrice;
                        str8 = paidContentAnchorExtraModel5.discountedIapID;
                    } else {
                        str7 = null;
                        str8 = null;
                    }
                    if (C123100dR.LIZ(str8)) {
                        PaidContentAnchorExtraModel paidContentAnchorExtraModel6 = viewModel4.LLILLL;
                        if (paidContentAnchorExtraModel6 != null) {
                            str12 = paidContentAnchorExtraModel6.discountedIapID;
                        } else {
                            str12 = null;
                        }
                        String strValueOf4 = String.valueOf(str12);
                        if (str7 != null && (chLJLLILLLL3 = C13LN.LJLLILLLL(str7)) != null && chLJLLILLLL3.charValue() == '$') {
                            strValueOf3 = C13LN.LJLJLJ(1, str7);
                        } else {
                            strValueOf3 = String.valueOf(str7);
                        }
                        priceInfo = new PriceInfo(0L, strValueOf4, strValueOf3, "", "");
                    } else {
                        priceInfo = null;
                    }
                    PaidContentAnchorExtraModel paidContentAnchorExtraModel7 = viewModel4.LLILLL;
                    if (paidContentAnchorExtraModel7 != null) {
                        str9 = paidContentAnchorExtraModel7.singleVideoOriginalUsdPrice;
                    } else {
                        str9 = null;
                    }
                    if (paidContentAnchorExtraModel7 != null) {
                        str10 = paidContentAnchorExtraModel7.singleVideoIapId;
                    } else {
                        str10 = null;
                    }
                    String strValueOf5 = String.valueOf(str10);
                    if (str9 != null && (chLJLLILLLL2 = C13LN.LJLLILLLL(str9)) != null && chLJLLILLLL2.charValue() == '$') {
                        strValueOf = C13LN.LJLJLJ(1, str9);
                    } else {
                        strValueOf = String.valueOf(str9);
                    }
                    PriceInfo priceInfo2 = new PriceInfo(0L, strValueOf5, strValueOf, "", "");
                    PaidContentAnchorExtraModel paidContentAnchorExtraModel8 = viewModel4.LLILLL;
                    if (paidContentAnchorExtraModel8 != null) {
                        str14 = paidContentAnchorExtraModel8.originalUSDPrice;
                    }
                    ISeriesPricingService iSeriesPricingService = (ISeriesPricingService) c1613930s6J2.LIZJ.getValue();
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    if (l2 != null) {
                        jLongValue = l2.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    PaidContentAnchorExtraModel paidContentAnchorExtraModel9 = viewModel4.LLILLL;
                    if (paidContentAnchorExtraModel9 != null) {
                        str11 = paidContentAnchorExtraModel9.iapID;
                    } else {
                        str11 = null;
                    }
                    String strValueOf6 = String.valueOf(str11);
                    if (str14 != null && (chLJLLILLLL = C13LN.LJLLILLLL(str14)) != null && chLJLLILLLL.charValue() == '$') {
                        strValueOf2 = C13LN.LJLJLJ(1, str14);
                    } else {
                        strValueOf2 = String.valueOf(str14);
                    }
                    iSeriesPricingService.LIZJ(contextLIZ, Collections.singletonList(new C1617190sBZ(jLongValue, new PriceInfo(0L, strValueOf6, strValueOf2, "", ""), priceInfo, priceInfo2))).observe((C19FO) context, new AObserverS23S0310000_24(l2, z, c1215180hjA5, viewModel4, 1));
                } else {
                    PaidContentAnchorExtraModel paidContentAnchorExtraModel10 = viewModel4.LLILLL;
                    if (paidContentAnchorExtraModel10 != null && C123100dR.LIZ(paidContentAnchorExtraModel10.iapID)) {
                        C1613910s6H c1613910s6H = viewModel4.LLIZLLLIL;
                        MutableLiveData<AbstractC1556250qbH> mutableLiveData = viewModel4.LLIZ;
                        PaidContentAnchorExtraModel paidContentAnchorExtraModel11 = viewModel4.LLILLL;
                        if (paidContentAnchorExtraModel11 != null) {
                            str3 = paidContentAnchorExtraModel11.iapID;
                        } else {
                            str3 = null;
                        }
                        c1613910s6H.getClass();
                        C1613910s6H.LJI = System.currentTimeMillis();
                        if (!C1613910s6H.LIZLLL) {
                            C1613910s6H.LJ = mutableLiveData;
                            C1613910s6H.LJFF = String.valueOf(str3);
                            InterfaceC1807610x8h interfaceC1807610x8h = (InterfaceC1807610x8h) C1613910s6H.LJIIIIZZ.getValue();
                            if (interfaceC1807610x8h != null) {
                                IapProductGetParam iapProductGetParam = new IapProductGetParam();
                                List<String> list = C1613910s6H.LIZJ;
                                if (list == null) {
                                    list = null;
                                }
                                iapProductGetParam.productIdList = list;
                                interfaceC1807610x8h.GL1(context, iapProductGetParam);
                            }
                        }
                        viewModel4.LLIZ.observe((C19FO) context, new Observer() { // from class: X.0qnv
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj2) {
                                C1215180hjA c1215180hjA6;
                                String str15;
                                AbstractC1556250qbH abstractC1556250qbH = (AbstractC1556250qbH) obj2;
                                String str16 = null;
                                if (Intrinsics.LJFF(abstractC1556250qbH, C1556260qbI.LIZ)) {
                                    C1215180hjA c1215180hjA7 = c1215180hjA5;
                                    if (c1215180hjA7 != null) {
                                        PaidContentAnchorExtraModel paidContentAnchorExtraModel12 = viewModel4.LLILLL;
                                        if (paidContentAnchorExtraModel12 != null) {
                                            str15 = paidContentAnchorExtraModel12.postTitle;
                                        } else {
                                            str15 = null;
                                        }
                                        boolean z2 = z;
                                        if (paidContentAnchorExtraModel12 != null) {
                                            str16 = paidContentAnchorExtraModel12.subtitle;
                                        }
                                        c1215180hjA7.LIZ(str15, str16, z2);
                                        return;
                                    }
                                    return;
                                }
                                if (abstractC1556250qbH instanceof C1556240qbG) {
                                    C1215180hjA c1215180hjA8 = c1215180hjA5;
                                    if (c1215180hjA8 == null) {
                                        return;
                                    }
                                    String str17 = ((C1556240qbG) abstractC1556250qbH).LIZ;
                                    boolean z3 = z;
                                    PaidContentAnchorExtraModel paidContentAnchorExtraModel13 = viewModel4.LLILLL;
                                    if (paidContentAnchorExtraModel13 != null) {
                                        str16 = paidContentAnchorExtraModel13.subtitle;
                                    }
                                    c1215180hjA8.LIZ(str17, str16, z3);
                                    return;
                                }
                                if (!(abstractC1556250qbH instanceof C1556230qbF) || (c1215180hjA6 = c1215180hjA5) == null) {
                                    return;
                                }
                                String str18 = ((C1556230qbF) abstractC1556250qbH).LIZ;
                                boolean z4 = z;
                                PaidContentAnchorExtraModel paidContentAnchorExtraModel14 = viewModel4.LLILLL;
                                if (paidContentAnchorExtraModel14 != null) {
                                    str16 = paidContentAnchorExtraModel14.subtitle;
                                }
                                c1215180hjA6.LIZ(str18, str16, z4);
                            }
                        });
                        viewModel4.LLIZLLLIL.getClass();
                        if (C1613910s6H.LIZLLL && (paidContentAnchorExtraModel = viewModel4.LLILLL) != null && (str4 = paidContentAnchorExtraModel.iapID) != null) {
                            viewModel4.LLIZLLLIL.getClass();
                            Map<String, IapProductGetResult.Item> map = C1613910s6H.LIZIZ;
                            if (map != null) {
                                item = map.get(str4);
                            } else {
                                item = null;
                            }
                            if (item == null) {
                                viewModel4.LLIZ.postValue(C1556260qbI.LIZ);
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LIZJ(0, "is_success");
                                PaidContentAnchorExtraModel paidContentAnchorExtraModel12 = viewModel4.LLILLL;
                                if (paidContentAnchorExtraModel12 != null) {
                                    str6 = paidContentAnchorExtraModel12.iapID;
                                } else {
                                    str6 = null;
                                }
                                c2344009Gk.LJIIIIZZ("iap_id", str6);
                                AnchorCommonStruct anchorCommonStruct7 = viewModel4.LLILLJJLI;
                                if (anchorCommonStruct7 != null) {
                                    id2 = anchorCommonStruct7.getId();
                                } else {
                                    id2 = null;
                                }
                                c2344009Gk.LJIIIIZZ("anchor_id", id2);
                                C20684815ws.LJIILLIIL("paid_content_anchor_prefetch_price", c2344009Gk.LIZ);
                            } else {
                                viewModel4.LLIZ.postValue(new C1556230qbF(item.price));
                                C2344009Gk c2344009Gk2 = new C2344009Gk();
                                c2344009Gk2.LIZJ(1, "is_success");
                                PaidContentAnchorExtraModel paidContentAnchorExtraModel13 = viewModel4.LLILLL;
                                if (paidContentAnchorExtraModel13 != null) {
                                    str5 = paidContentAnchorExtraModel13.iapID;
                                } else {
                                    str5 = null;
                                }
                                c2344009Gk2.LJIIIIZZ("iap_id", str5);
                                AnchorCommonStruct anchorCommonStruct8 = viewModel4.LLILLJJLI;
                                if (anchorCommonStruct8 != null) {
                                    id = anchorCommonStruct8.getId();
                                } else {
                                    id = null;
                                }
                                c2344009Gk2.LJIIIIZZ("anchor_id", id);
                                C20684815ws.LJIILLIIL("paid_content_anchor_prefetch_price", c2344009Gk2.LIZ);
                            }
                        }
                    }
                }
            }
            PaidContentAnchorExtraModel paidContentAnchorExtraModel14 = viewModel4.LLILLL;
            if ((paidContentAnchorExtraModel14 == null || !paidContentAnchorExtraModel14.enableSingleVideoPurchase) && (c1215180hjA = c1613930s6J2.LIZIZ) != null) {
                if (paidContentAnchorExtraModel14 != null) {
                    str = paidContentAnchorExtraModel14.subtitle;
                } else {
                    str = null;
                }
                c1215180hjA.setSubtitle$anchor_business_release(str);
            }
            InterfaceC1392640mLO interfaceC1392640mLO3 = viewModel4.LL;
            if ((interfaceC1392640mLO3 == null || !interfaceC1392640mLO3.LJIIIIZZ()) && !C715400S4k.LIZIZ() && (c1215180hjA2 = c1613930s6J2.LIZIZ) != null) {
                float f = C715390S4j.LIZ;
                C715390S4j.LIZ(c1215180hjA2.getAnchorContentFromXml());
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CustomPaidContentSingleAnchorView@606f.bindData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

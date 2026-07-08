package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.page.StellarPageRequest;
import com.bytedance.pipo.stellar.base.page.StellarPageRequestWrapper;
import com.bytedance.pipo.stellar.base.resourceloader.StellarChunk;
import com.bytedance.pipo.stellar.base.resourceloader.StellarSection;
import com.bytedance.pipo.ttpay.landing.WelcomePageViewModel;
import com.bytedance.pipo.ttpay.network.TTPayApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS59S0500000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0uqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.ttpay.landing.WelcomePageViewModel$getInitData$2", f = "WelcomePageViewModel.kt", l = {105}, m = "invokeSuspend")
public final class C1719730uqx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ WelcomePageViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1719730uqx(WelcomePageViewModel welcomePageViewModel, InterfaceC1364105Vn<? super C1719730uqx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = welcomePageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1719730uqx c1719730uqx = new C1719730uqx(this.LLILZ, interfaceC1364105Vn);
        c1719730uqx.LLILLL = obj;
        return c1719730uqx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        String str;
        Unit unit;
        Unit unit2;
        boolean z;
        CardDO cardDO;
        List<StellarSection> list;
        Map<String, Object> map;
        Object welcomePage = obj;
        C1C7U.LIZ("WelcomePageViewModel@b227.getInitData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        StellarChunk stellarChunkLIZ = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    jCurrentTimeMillis = this.LL;
                    C155000ia.LIZIZ(welcomePage);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(welcomePage);
                final WelcomePageViewModel welcomePageViewModel = this.LLILZ;
                try {
                    List<String> listLIZIZ = C1716650ulz.LIZIZ();
                    if (listLIZIZ != null) {
                        for (final String str2 : listLIZIZ) {
                            if (str2 != null) {
                                welcomePageViewModel.getClass();
                                WelcomePageViewModel.wQ2(2, str2);
                                C1292030jj7<C1294720jnS> c1292030jj7LJIIJJI = C1294250jmh.LJIIJJI(C1717770unn.LIZJ().getApplicationContext(), str2);
                                c1292030jj7LJIIJJI.LIZ(new InterfaceC1292040jj8() { // from class: X.0uqy
                                    @Override // X.InterfaceC1292040jj8
                                    public final void onResult(Object obj2) {
                                        WelcomePageViewModel welcomePageViewModel2 = welcomePageViewModel;
                                        String str3 = str2;
                                        welcomePageViewModel2.getClass();
                                        WelcomePageViewModel.wQ2(1, str3);
                                    }
                                });
                                c1292030jj7LJIIJJI.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0uqz
                                    @Override // X.InterfaceC1292040jj8
                                    public final void onResult(Object obj2) {
                                        WelcomePageViewModel welcomePageViewModel2 = welcomePageViewModel;
                                        String str3 = str2;
                                        welcomePageViewModel2.getClass();
                                        WelcomePageViewModel.wQ2(0, str3);
                                    }
                                });
                            }
                        }
                        unit2 = Unit.LIZ;
                    } else {
                        unit2 = null;
                    }
                    C189200o6.m2constructorimpl(unit2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                try {
                    List<String> listLIZ = C1716650ulz.LIZ();
                    if (listLIZ != null) {
                        for (String str3 : listLIZ) {
                            if (str3 != null) {
                                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str3);
                                c1331670kl3LJIIIZ.LJJIJL(C1717770unn.LIZJ().getApplicationContext());
                                c1331670kl3LJIIIZ.LIZLLL("tt_pay");
                                c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
                                c1331670kl3LJIIIZ.LJIILJJIL(new AbstractC2350809Ja() { // from class: X.0ur0
                                    @Override // X.InterfaceC605070NoH
                                    public final void LIZ(File file) {
                                    }

                                    @Override // X.InterfaceC605070NoH
                                    public final void onFailed(Throwable th2) {
                                    }
                                });
                            }
                        }
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                C1505700pHk c1505700pHk = TTPayApi.LIZ;
                String str4 = C1505710pHl.LIZ;
                C1719770ur1 c1719770ur1 = (C1719770ur1) this.LLILZ.LL.getValue();
                if (c1719770ur1 == null || (str = c1719770ur1.LL) == null) {
                    str = "";
                }
                String currentRegionCode = C1717770unn.LJIIIIZZ().getCurrentRegionCode();
                String currentLocaleStr = C1717770unn.LIZLLL().getCurrentLocaleStr(C1717770unn.LIZJ().getApplicationContext());
                C1718110uoL.LIZ.getClass();
                String strLIZ = C1718110uoL.LIZ("");
                C1488000opC c1488000opC = C1488000opC.LIZ;
                Context applicationContext = C1717770unn.LIZJ().getApplicationContext();
                c1488000opC.getClass();
                StellarPageRequestWrapper stellarPageRequestWrapper = new StellarPageRequestWrapper(new StellarPageRequest(null, null, null, currentRegionCode, currentLocaleStr, null, null, new ArrayList(), str, null, strLIZ, null, C1488000opC.LIZ(applicationContext), null, null, null, null));
                this.LL = jCurrentTimeMillis;
                this.LLILLJJLI = 1;
                c1505700pHk.getClass();
                TTPayApi tTPayApiLIZ = C1505700pHk.LIZ();
                if (tTPayApiLIZ != null) {
                    welcomePage = tTPayApiLIZ.getWelcomePage(str4, stellarPageRequestWrapper, this);
                } else {
                    welcomePage = null;
                }
                if (welcomePage == objLJFF) {
                    C1C7U.LIZIZ("WelcomePageViewModel@b227.getInitData$2");
                    return objLJFF;
                }
            }
            C0X52 c0x52 = (C0X52) welcomePage;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            WelcomePageViewModel welcomePageViewModel2 = this.LLILZ;
            String strValueOf = String.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis);
            Map<String, String> map2 = welcomePageViewModel2.LLILLJJLI;
            if (map2 != null) {
                map2.put("interface_return_cost", strValueOf);
            }
            if (c0x52 != null && c0x52.LIZJ()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (((BaseResponse) c0x52.LIZIZ).LIZ()) {
                    StellarChunk stellarChunk = (StellarChunk) ((BaseResponse) c0x52.LIZIZ).data;
                    if (stellarChunk != null) {
                        stellarChunkLIZ = C1719870urB.LIZ(stellarChunk, this.LLILZ.LLILLL);
                    }
                    WelcomePageViewModel welcomePageViewModel3 = this.LLILZ;
                    welcomePageViewModel3.LLILLL = stellarChunkLIZ;
                    if (stellarChunkLIZ != null && (map = stellarChunkLIZ.trackingParams) != null) {
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            String key = entry.getKey();
                            String string = entry.getValue().toString();
                            Map<String, String> map3 = welcomePageViewModel3.LLILLJJLI;
                            if (map3 != null) {
                                map3.put(key, string);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    if (stellarChunkLIZ != null && (list = stellarChunkLIZ.sections) != null) {
                        Iterator<StellarSection> it2 = list.iterator();
                        while (it2.hasNext()) {
                            List<CardDO> list2 = it2.next().cardList;
                            if (list2 != null) {
                                arrayList.addAll(list2);
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (stellarChunkLIZ != null && (cardDO = stellarChunkLIZ.header) != null) {
                        Boolean.valueOf(arrayList2.add(cardDO));
                    }
                    WelcomePageViewModel welcomePageViewModel4 = this.LLILZ;
                    welcomePageViewModel4.withState(new AwS59S0500000_26(welcomePageViewModel4, (WelcomePageViewModel) stellarChunkLIZ, (StellarChunk) arrayList2, (List<CardDO>) arrayList, (List<CardDO>) stellarChunk, (StellarChunk) 1));
                } else {
                    WelcomePageViewModel welcomePageViewModel5 = this.LLILZ;
                    welcomePageViewModel5.withState(new AwS392S0200000_26(welcomePageViewModel5, (WelcomePageViewModel) c0x52, (C0X52<BaseResponse<StellarChunk>>) 104));
                }
            } else {
                WelcomePageViewModel welcomePageViewModel6 = this.LLILZ;
                welcomePageViewModel6.withState(new AwS605S0100000_26(welcomePageViewModel6, 504));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            WelcomePageViewModel welcomePageViewModel7 = this.LLILZ;
            welcomePageViewModel7.withState(new AwS605S0100000_26(welcomePageViewModel7, 505));
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("WelcomePageViewModel@b227.getInitData$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.ECMixMallCardConfig;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.ECMixMallCardModelV2;
import com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil;
import com.tiktok.myna.preload.MynaGeckoChannelPreloadInfo;
import com.tiktok.myna.preload.MynaTemplatePreloadInfo;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0w7Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.tools.MixMallUtils$executePreloadV2$1", f = "MixMallUtils.kt", l = {}, m = "invokeSuspend")
public final class C1768460w7Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<ECMixMallCardModelV2> LL;
    public final /* synthetic */ AbstractC21321718cJ LLILLJJLI;
    public final /* synthetic */ C1772750wET LLILLL;
    public final /* synthetic */ InterfaceC599750Nfh LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768460w7Y(List<ECMixMallCardModelV2> list, AbstractC21321718cJ abstractC21321718cJ, C1772750wET c1772750wET, InterfaceC599750Nfh interfaceC599750Nfh, InterfaceC1364105Vn<? super C1768460w7Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = abstractC21321718cJ;
        this.LLILLL = c1772750wET;
        this.LLILZ = interfaceC599750Nfh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768460w7Y(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixMallUtils@2261.executePreloadV2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<ECMixMallCardModelV2> list = this.LL;
        AbstractC21321718cJ abstractC21321718cJ = this.LLILLJJLI;
        C1772750wET c1772750wET = this.LLILLL;
        InterfaceC599750Nfh interfaceC599750Nfh = this.LLILZ;
        for (ECMixMallCardModelV2 eCMixMallCardModelV2 : list) {
            String str = eCMixMallCardModelV2.action;
            switch (str.hashCode()) {
                case -1368289953:
                    if (!str.equals("precreate")) {
                        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("executePreloadV2, unknown config = ");
                        sbLIZ.append(eCMixMallCardModelV2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c599820Nfo.getClass();
                        C599820Nfo.LIZIZ();
                    } else {
                        C1770900wBU c1770900wBU = C1770900wBU.LIZ;
                        String str2 = eCMixMallCardModelV2.type;
                        String str3 = eCMixMallCardModelV2.containerType;
                        c1770900wBU.getClass();
                        String strLJIIJ = C1770900wBU.LJIIJ(str2, str3);
                        if (strLJIIJ != null) {
                            if (Intrinsics.LJFF(eCMixMallCardModelV2.containerType, "gec_card")) {
                                List listSingletonList = Collections.singletonList(new MynaTemplatePreloadInfo(eCMixMallCardModelV2.type, strLJIIJ, eCMixMallCardModelV2.count));
                                if (!C1770900wBU.LJIJJ.get()) {
                                    C21320518c7.LIZ.LIZ();
                                    C1770900wBU.LJIILJJIL.set(true);
                                }
                                C21322218cO c21322218cO = C21322218cO.LIZ;
                                C844470XAv.LIZ.getClass();
                                Context contextLIZ = C844470XAv.LIZ();
                                MynaGeckoChannelPreloadInfo mynaGeckoChannelPreloadInfo = new MynaGeckoChannelPreloadInfo(listSingletonList);
                                c21322218cO.getClass();
                                C21322218cO.LJI("MixMall", contextLIZ, mynaGeckoChannelPreloadInfo, true, abstractC21321718cJ);
                            } else if (Intrinsics.LJFF(eCMixMallCardModelV2.containerType, "lynx")) {
                                C1770900wBU.LJIILL(Collections.singletonList(new ECMixMallCardConfig(eCMixMallCardModelV2.type, eCMixMallCardModelV2.count, strLJIIJ)), EnumC1768470w7Z.BEFORE_MALL, c1772750wET, interfaceC599750Nfh);
                            }
                        }
                    }
                    break;
                case -1351713199:
                    if (!str.equals("predecode")) {
                        C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("executePreloadV2, unknown config = ");
                        sbLIZ2.append(eCMixMallCardModelV2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        c599820Nfo2.getClass();
                        C599820Nfo.LIZIZ();
                    } else {
                        C1770900wBU c1770900wBU2 = C1770900wBU.LIZ;
                        String str4 = eCMixMallCardModelV2.type;
                        String str5 = eCMixMallCardModelV2.containerType;
                        c1770900wBU2.getClass();
                        String strLJIIJ2 = C1770900wBU.LJIIJ(str4, str5);
                        if (strLJIIJ2 != null) {
                            if (Intrinsics.LJFF(eCMixMallCardModelV2.containerType, "gec_card")) {
                                List listSingletonList2 = Collections.singletonList(new MynaTemplatePreloadInfo(eCMixMallCardModelV2.type, strLJIIJ2, eCMixMallCardModelV2.count));
                                if (!C1770900wBU.LJIJJ.get()) {
                                    C21320518c7.LIZ.LIZ();
                                    C1770900wBU.LJIILJJIL.set(true);
                                }
                                C21322218cO c21322218cO2 = C21322218cO.LIZ;
                                MynaGeckoChannelPreloadInfo mynaGeckoChannelPreloadInfo2 = new MynaGeckoChannelPreloadInfo(listSingletonList2);
                                c21322218cO2.getClass();
                                C21322218cO.LJIIIIZZ("MixMall", mynaGeckoChannelPreloadInfo2, true, abstractC21321718cJ);
                            } else if (Intrinsics.LJFF(eCMixMallCardModelV2.containerType, "lynx")) {
                                C1770900wBU.LJIILLIIL(Collections.singletonList(new ECMixMallCardConfig(eCMixMallCardModelV2.type, eCMixMallCardModelV2.count, strLJIIJ2)), EnumC1768470w7Z.BEFORE_MALL, c1772750wET);
                            }
                        }
                    }
                    break;
                case -440178916:
                    if (!str.equals("preload_mall_cache_data")) {
                        C599820Nfo c599820Nfo22 = C599820Nfo.LIZ;
                        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                        sbLIZ22.append("executePreloadV2, unknown config = ");
                        sbLIZ22.append(eCMixMallCardModelV2);
                        C2188811AlT.LIZIZ(sbLIZ22);
                        c599820Nfo22.getClass();
                        C599820Nfo.LIZIZ();
                    } else {
                        C1770900wBU c1770900wBU3 = C1770900wBU.LIZ;
                        String str6 = "";
                        String strLIZIZ = MMKStorageUtil.LIZ.LIZIZ("mix_mall_homepage_cache", "");
                        if (strLIZIZ != null) {
                            str6 = strLIZIZ;
                        }
                        c1770900wBU3.getClass();
                        C1770900wBU.LJIJ(str6, null);
                    }
                    break;
                case 441799437:
                    if (!str.equals("preload_global_props_no_deps")) {
                        C599820Nfo c599820Nfo222 = C599820Nfo.LIZ;
                        StringBuilder sbLIZ222 = C2188811AlT.LIZ();
                        sbLIZ222.append("executePreloadV2, unknown config = ");
                        sbLIZ222.append(eCMixMallCardModelV2);
                        C2188811AlT.LIZIZ(sbLIZ222);
                        c599820Nfo222.getClass();
                        C599820Nfo.LIZIZ();
                    } else {
                        C1770900wBU.LIZ.getClass();
                        C1770900wBU.LJIL.getValue();
                        C1770900wBU.LJJ.getValue();
                    }
                    break;
                default:
                    C599820Nfo c599820Nfo2222 = C599820Nfo.LIZ;
                    StringBuilder sbLIZ2222 = C2188811AlT.LIZ();
                    sbLIZ2222.append("executePreloadV2, unknown config = ");
                    sbLIZ2222.append(eCMixMallCardModelV2);
                    C2188811AlT.LIZIZ(sbLIZ2222);
                    c599820Nfo2222.getClass();
                    C599820Nfo.LIZIZ();
                    break;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixMallUtils@2261.executePreloadV2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

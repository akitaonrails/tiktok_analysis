package Y;

import X.AbstractC1769090w8Z;
import X.C013C;
import X.C09JN;
import X.C1018703yb;
import X.C10287040n;
import X.C1054004Ag;
import X.C11JF;
import X.C1749710vdJ;
import X.C1756150vnh;
import X.C1756210vnn;
import X.C1758040vqk;
import X.C1758120vqs;
import X.C1C7U;
import X.C2097608Jq;
import X.C2341109Fh;
import X.C672920QaQ;
import X.EnumC1756190vnl;
import X.EnumC1756220vno;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.BadgeBackgroundClearCfg;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS396S0200000_30;

/* JADX INFO: loaded from: classes27.dex */
public class AfS160S0200000_26 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
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
        }
    }

    public static final void accept$0(AfS160S0200000_26 afS160S0200000_26, Object obj) {
        C1C7U.LIZ("PdpStarterOptimized@4303.jump2PdpInterceptor$1$1$requestTask$2");
        C672920QaQ.LIZ("wait error 2", ((IPdpStarter.PdpEnterParam) afS160S0200000_26.l0).trackParams);
        ((C013C) afS160S0200000_26.l1).element = true;
        C1C7U.LIZIZ("PdpStarterOptimized@4303.jump2PdpInterceptor$1$1$requestTask$2");
    }

    public static final void accept$1(AfS160S0200000_26 afS160S0200000_26, Object obj) {
        C1C7U.LIZ("DiskManagerSettingsVM@985e.clickCleanCache$clickAction$1$invoke$3");
        DiskManagerSettingsVM diskManagerSettingsVM = (DiskManagerSettingsVM) afS160S0200000_26.l0;
        diskManagerSettingsVM.setState(new AwS396S0200000_30((Context) afS160S0200000_26.l1, diskManagerSettingsVM, 15));
        C1C7U.LIZIZ("DiskManagerSettingsVM@985e.clickCleanCache$clickAction$1$invoke$3");
    }

    public static final void accept$2(AfS160S0200000_26 afS160S0200000_26, Object obj) {
        C1C7U.LIZ("DiskManagerSettingsVM@985e.clickCleanCache$clickAction$1$invoke$4");
        DiskManagerSettingsVM diskManagerSettingsVM = (DiskManagerSettingsVM) afS160S0200000_26.l0;
        diskManagerSettingsVM.setState(new AwS396S0200000_30((Context) afS160S0200000_26.l1, diskManagerSettingsVM, 16));
        C1C7U.LIZIZ("DiskManagerSettingsVM@985e.clickCleanCache$clickAction$1$invoke$4");
    }

    public static final void accept$3(AfS160S0200000_26 afS160S0200000_26, Object obj) {
        C1C7U.LIZ("DiskManagerSettingsVM@985e.clickCleanDownload$clickAction$1$invoke$3");
        DiskManagerSettingsVM diskManagerSettingsVM = (DiskManagerSettingsVM) afS160S0200000_26.l0;
        diskManagerSettingsVM.setState(new AwS396S0200000_30((Context) afS160S0200000_26.l1, diskManagerSettingsVM, 17));
        C1C7U.LIZIZ("DiskManagerSettingsVM@985e.clickCleanDownload$clickAction$1$invoke$3");
    }

    public static final void accept$4(AfS160S0200000_26 afS160S0200000_26, Object obj) {
        C1C7U.LIZ("DiskManagerSettingsVM@985e.clickCleanDownload$clickAction$1$invoke$4");
        DiskManagerSettingsVM diskManagerSettingsVM = (DiskManagerSettingsVM) afS160S0200000_26.l0;
        diskManagerSettingsVM.setState(new AwS396S0200000_30((Context) afS160S0200000_26.l1, diskManagerSettingsVM, 18));
        C1C7U.LIZIZ("DiskManagerSettingsVM@985e.clickCleanDownload$clickAction$1$invoke$4");
    }

    public static final void accept$5(AfS160S0200000_26 afS160S0200000_26, Object obj) {
        long jLongValue;
        C1C7U.LIZ("BadgeTaskBase@2182.tryAddAppBackgroundObserver$1$1");
        if (((Boolean) obj).booleanValue()) {
            long j = ((AbstractC1769090w8Z) afS160S0200000_26.l0).LJIIZILJ;
            Long l = ((BadgeBackgroundClearCfg) afS160S0200000_26.l1).interval;
            if (l != null) {
                jLongValue = l.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            } else {
                jLongValue = 3600000;
            }
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("ShopByteSync BadgeTask===== try clear badge by server");
            if (j > 0 && System.currentTimeMillis() - j > jLongValue) {
                C2341109Fh.LIZ("ShopByteSync BadgeTask===== clear badge by server");
                ((AbstractC1769090w8Z) afS160S0200000_26.l0).LIZIZ.Ck1();
            }
        }
        C1C7U.LIZIZ("BadgeTaskBase@2182.tryAddAppBackgroundObserver$1$1");
    }

    public static final void accept$6(AfS160S0200000_26 afS160S0200000_26, Object obj) {
        C1C7U.LIZ("SeaPdpStarterOptimized@3f18.jump2PdpInterceptor$1$1$requestTask$2");
        C672920QaQ.LIZ("wait error 2", ((IPdpStarter.PdpEnterParam) afS160S0200000_26.l0).trackParams);
        ((C013C) afS160S0200000_26.l1).element = true;
        C1C7U.LIZIZ("SeaPdpStarterOptimized@3f18.jump2PdpInterceptor$1$1$requestTask$2");
    }

    public static final void accept$7(AfS160S0200000_26 afS160S0200000_26, Object obj) {
        boolean z;
        C1758040vqk c1758040vqkLIZ;
        C1C7U.LIZ("SeaPdpFragment@244c.initData$7");
        Throwable th = (Throwable) obj;
        C11JF c11jf = ((SeaPdpFragment) afS160S0200000_26.l0).LLJJJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        SeaPdpFragment seaPdpFragment = (SeaPdpFragment) afS160S0200000_26.l0;
        seaPdpFragment.LLJJJIL = null;
        if (th instanceof C1758120vqs) {
            C1758120vqs c1758120vqs = (C1758120vqs) th;
            z = false;
            SeaPdpViewModel.SS2(seaPdpFragment.FS(), null, Integer.valueOf(c1758120vqs.getCode()), false, false, true, false, false, false, false, false, 2016);
            C1756210vnn.LIZJ((IPdpStarter.PdpEnterParam) afS160S0200000_26.l1, c1758120vqs.getCode());
        } else {
            z = false;
            SeaPdpViewModel.SS2(seaPdpFragment.FS(), null, null, false, false, false, false, false, false, false, false, 2044);
            String str = ((IPdpStarter.PdpEnterParam) afS160S0200000_26.l1).trackId;
            if (str != null && (c1758040vqkLIZ = C10287040n.LIZ(str)) != null) {
                c1758040vqkLIZ.LIZLLL(EnumC1756220vno.OTHER_ERROR);
            }
        }
        C1756210vnn.LIZ((IPdpStarter.PdpEnterParam) afS160S0200000_26.l1, z);
        C1C7U.LIZIZ("SeaPdpFragment@244c.initData$7");
    }

    public static final void accept$8(AfS160S0200000_26 afS160S0200000_26, Object obj) {
        String str;
        Map<String, Object> map;
        C1C7U.LIZ("PdpFragment@ab0c.initData$4");
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        C1756150vnh c1756150vnhWS = ((PdpFragment) afS160S0200000_26.l0).wS();
        if (c1756150vnhWS != null) {
            c1756150vnhWS.LIZJ(productPackStruct, EnumC1756190vnl.AFTER_PAGE_CREATE);
        }
        Map<String, Object> mapLJ = ((IPdpStarter.PdpEnterParam) afS160S0200000_26.l1).trackParams;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        HashMap map2 = new HashMap(mapLJ);
        if (((PdpFragment) afS160S0200000_26.l0).JS().LLJLILLLLZIIL != null) {
            C1054004Ag.LJJJJZ(new AwS270S0300000_26((PdpFragment) afS160S0200000_26.l0, (PdpFragment) productPackStruct, (ProductPackStruct) map2, (HashMap<String, Object>) 129), false);
        }
        ((PdpFragment) afS160S0200000_26.l0).JS().mS2(((IPdpStarter.PdpEnterParam) afS160S0200000_26.l1).bizType);
        ((PdpFragment) afS160S0200000_26.l0).JS().LLLZIL = true;
        ((PdpFragment) afS160S0200000_26.l0).JS().LLLLIIL = true;
        PdpViewModel.zS2(((PdpFragment) afS160S0200000_26.l0).JS(), productPackStruct, null, false, false, true, false, false, false, false, false, 992);
        ((PdpFragment) afS160S0200000_26.l0).JS().kS2(productPackStruct, productPackStruct.productId);
        C11JF c11jf = ((PdpFragment) afS160S0200000_26.l0).LLJLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        PdpFragment pdpFragment = (PdpFragment) afS160S0200000_26.l0;
        pdpFragment.LLJLIL = null;
        PopUp popUp = productPackStruct.popUp;
        if (popUp != null && (map = ((IPdpStarter.PdpEnterParam) afS160S0200000_26.l1).trackParams) != null) {
            C1749710vdJ c1749710vdJ = pdpFragment.JS().LLLLLLJ;
            Context contextRequireContext = pdpFragment.requireContext();
            c1749710vdJ.getClass();
            C1749710vdJ.LJ(contextRequireContext, popUp, map);
        }
        String str2 = ((IPdpStarter.PdpEnterParam) afS160S0200000_26.l1).chainKey;
        if ((str2 == null || str2.length() == 0) && (str = productPackStruct.chainKey) != null && str.length() > 0) {
            C1018703yb.LIZLLL("tiktokec_pdp_chainkey_source", AFwS268S0000000_26.get$arr$(640));
            Map<String, Object> map3 = ((IPdpStarter.PdpEnterParam) afS160S0200000_26.l1).visitReportParams;
            if (map3 != null) {
                map3.put("chain_key", productPackStruct.chainKey);
            }
            ((IPdpStarter.PdpEnterParam) afS160S0200000_26.l1).setChainKey(productPackStruct.chainKey);
        }
        C1C7U.LIZIZ("PdpFragment@ab0c.initData$4");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$9(Y.AfS160S0200000_26 r12, java.lang.Object r13) {
        /*
            java.lang.String r5 = "RegionListViewModel@b145.getRegionList$1"
            X.C1C7U.LIZ(r5)
            com.ss.android.ugc.aweme.changeregion.api.RegionListAPI$RegionListAPIResponse r13 = (com.ss.android.ugc.aweme.changeregion.api.RegionListAPI.RegionListAPIResponse) r13
            com.ss.android.ugc.aweme.changeregion.api.RegionListAPI$RegionList r2 = r13.data
            if (r2 == 0) goto L63
            java.util.List<com.ss.android.ugc.aweme.changeregion.sdk.model.Country> r0 = r2.regionList
            if (r0 != 0) goto L24
            if (r2 == 0) goto L63
            java.lang.String r0 = r2.description
            if (r0 == 0) goto L63
            java.lang.Object r0 = r12.l0
            com.ss.android.ugc.aweme.changeregion.ui.RegionListViewModel r0 = (com.ss.android.ugc.aweme.changeregion.ui.RegionListViewModel) r0
            androidx.lifecycle.MutableLiveData<java.lang.String> r1 = r0.LLILLJJLI
            java.lang.String r0 = r2.description
            r1.postValue(r0)
        L20:
            X.C1C7U.LIZIZ(r5)
            return
        L24:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Class<com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService> r6 = com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService.class
            r7 = 0
            r10 = 14
            r11 = 0
            r8 = r7
            r9 = r7
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService r0 = (com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService) r0
            if (r0 == 0) goto L52
            java.lang.String r3 = r0.LJFF()
            if (r3 == 0) goto L52
            com.ss.android.ugc.aweme.changeregion.sdk.model.Country r2 = new com.ss.android.ugc.aweme.changeregion.sdk.model.Country
            java.lang.Object r1 = r12.l1
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131845932(0x7f11632c, float:1.9325299E38)
            java.lang.String r0 = r1.getString(r0)
            r2.<init>(r0, r3)
            r4.add(r2)
        L52:
            com.ss.android.ugc.aweme.changeregion.api.RegionListAPI$RegionList r0 = r13.data
            java.util.List<com.ss.android.ugc.aweme.changeregion.sdk.model.Country> r0 = r0.regionList
            r4.addAll(r0)
            java.lang.Object r0 = r12.l0
            com.ss.android.ugc.aweme.changeregion.ui.RegionListViewModel r0 = (com.ss.android.ugc.aweme.changeregion.ui.RegionListViewModel) r0
            androidx.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.changeregion.sdk.model.Country>> r0 = r0.LL
            r0.postValue(r4)
            goto L20
        L63:
            java.lang.Object r0 = r12.l0
            com.ss.android.ugc.aweme.changeregion.ui.RegionListViewModel r0 = (com.ss.android.ugc.aweme.changeregion.ui.RegionListViewModel) r0
            androidx.lifecycle.MutableLiveData<java.lang.String> r2 = r0.LLILLJJLI
            java.lang.Object r1 = r12.l1
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131845937(0x7f116331, float:1.932531E38)
            java.lang.String r0 = r1.getString(r0)
            r2.postValue(r0)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS160S0200000_26.accept$9(Y.AfS160S0200000_26, java.lang.Object):void");
    }

    public AfS160S0200000_26(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}

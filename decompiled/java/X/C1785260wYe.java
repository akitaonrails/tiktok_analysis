package X;

import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2$onSkuItemExposed$1", f = "PcsServiceBioVMV2.kt", l = {}, m = "invokeSuspend")
public final class C1785260wYe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1785270wYf LL;
    public final /* synthetic */ PcsServiceBioVMV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785260wYe(InterfaceC1785270wYf interfaceC1785270wYf, PcsServiceBioVMV2 pcsServiceBioVMV2, InterfaceC1364105Vn<? super C1785260wYe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1785270wYf;
        this.LLILLJJLI = pcsServiceBioVMV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1785260wYe(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        int i;
        C1C7U.LIZ("PcsServiceBioVMV2@fd39.onSkuItemExposed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jLIZ = this.LL.LIZ();
        if (this.LLILLJJLI.LLILZ.contains(C2286608xc.LJFF(jLIZ))) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PcsServiceBioVMV2@fd39.onSkuItemExposed$1");
            return unit;
        }
        this.LLILLJJLI.LLILZ.add(C2286608xc.LJFF(jLIZ));
        String skuFeatureName = this.LL.getItemType().getSkuFeatureName();
        InterfaceC1785270wYf interfaceC1785270wYf = this.LL;
        C1822330xWR c1822330xWRVQ2 = this.LLILLJJLI.vQ2();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_audience_service_item");
        String str3 = null;
        if (c1822330xWRVQ2 != null) {
            str = c1822330xWRVQ2.LLJ;
        } else {
            str = null;
        }
        c474500IjALIZ.LJJII(str, "anchor_id");
        if (c1822330xWRVQ2 != null) {
            str2 = c1822330xWRVQ2.LLJI;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "user_id");
        if (c1822330xWRVQ2 != null) {
            str3 = c1822330xWRVQ2.LL;
        }
        c474500IjALIZ.LJJII(str3, "show_entrance");
        c474500IjALIZ.LJJII(skuFeatureName, "feature");
        if (interfaceC1785270wYf instanceof C1781880wTC) {
            C1781880wTC c1781880wTC = (C1781880wTC) interfaceC1785270wYf;
            SMBCourse sMBCourse = c1781880wTC.LLILLL;
            if (sMBCourse != null && sMBCourse.isPurchased) {
                i = 3;
            } else {
                i = 2;
            }
            String strLIZ = C518500KVc.LIZ();
            c474500IjALIZ.LJJII(Long.valueOf(c1781880wTC.LL), "course_id");
            c474500IjALIZ.LJJII(Integer.valueOf(i), Scene.SCENE_SERVICE);
            c474500IjALIZ.LJJII(strLIZ, "iap_country_code");
            c474500IjALIZ.LJJII(Integer.valueOf(c1781880wTC.LLILZIL), "course_index");
        }
        if (interfaceC1785270wYf instanceof C1782030wTR) {
            c474500IjALIZ.LJJII(((C1782030wTR) interfaceC1785270wYf).LLJIJIL, "third_party_service_name");
        }
        c474500IjALIZ.LIZ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PcsServiceBioVMV2@fd39.onSkuItemExposed$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

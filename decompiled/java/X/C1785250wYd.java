package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.viewmodel.PcsServiceBioVM;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.viewmodel.PcsServiceBioVM$onServicePlusItemVisible$1", f = "PcsServiceBioVM.kt", l = {}, m = "invokeSuspend")
public final class C1785250wYd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PcsServiceBioVM LL;
    public final /* synthetic */ InterfaceC1822900xXM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785250wYd(PcsServiceBioVM pcsServiceBioVM, InterfaceC1822900xXM interfaceC1822900xXM, InterfaceC1364105Vn<? super C1785250wYd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pcsServiceBioVM;
        this.LLILLJJLI = interfaceC1822900xXM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1785250wYd(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        int i;
        C1C7U.LIZ("PcsServiceBioVM@5117.onServicePlusItemVisible$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LLJILJILJ.contains(this.LLILLJJLI)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PcsServiceBioVM@5117.onServicePlusItemVisible$1");
            return unit;
        }
        this.LL.LLJILJILJ.add(this.LLILLJJLI);
        PcsServiceBioVM pcsServiceBioVM = this.LL;
        InterfaceC1822900xXM interfaceC1822900xXM = this.LLILLJJLI;
        pcsServiceBioVM.getClass();
        String key = interfaceC1822900xXM.getKey();
        String str4 = null;
        switch (key.hashCode()) {
            case -1499838031:
                str = !key.equals("direct_message") ? null : "dm";
                break;
            case -1354571749:
                str = "course";
                if (!key.equals("course")) {
                    str = null;
                }
                break;
            case -1116288512:
                str = !key.equals("fill_form") ? null : "form";
                break;
            case -262183029:
                str = !key.equals("third_party_link") ? null : "third_party_service";
                break;
            case 1448769636:
                str = !key.equals("booking_calendar") ? null : "calendar";
                break;
            default:
                str = null;
                break;
        }
        if (str == null) {
            str = "";
        }
        InterfaceC1822900xXM interfaceC1822900xXM2 = this.LLILLJJLI;
        C1822330xWR c1822330xWRZQ2 = this.LL.zQ2();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_audience_service_item");
        if (c1822330xWRZQ2 != null) {
            str2 = c1822330xWRZQ2.LLJ;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "anchor_id");
        if (c1822330xWRZQ2 != null) {
            str3 = c1822330xWRZQ2.LLJI;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "user_id");
        if (c1822330xWRZQ2 != null) {
            str4 = c1822330xWRZQ2.LL;
        }
        c474500IjALIZ.LJJII(str4, "show_entrance");
        c474500IjALIZ.LJJII(str, "feature");
        if (interfaceC1822900xXM2 instanceof C1782070wTV) {
            C1782070wTV c1782070wTV = (C1782070wTV) interfaceC1822900xXM2;
            if (c1782070wTV.LJIIJJI) {
                i = 3;
            } else {
                i = 2;
            }
            String strLIZ = C518500KVc.LIZ();
            c474500IjALIZ.LJJII(Long.valueOf(c1782070wTV.LJIIIZ), "course_id");
            c474500IjALIZ.LJJII(Integer.valueOf(i), Scene.SCENE_SERVICE);
            c474500IjALIZ.LJJII(strLIZ, "iap_country_code");
            c474500IjALIZ.LJJII(Integer.valueOf(c1782070wTV.LJIIL), "course_index");
        }
        if (interfaceC1822900xXM2 instanceof C1782040wTS) {
            c474500IjALIZ.LJJII(((C1782040wTS) interfaceC1822900xXM2).LJIILL, "third_party_service_name");
        }
        c474500IjALIZ.LIZ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PcsServiceBioVM@5117.onServicePlusItemVisible$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

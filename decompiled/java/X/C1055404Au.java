package X;

import com.bytedance.goda.v2.model.dto.GodaV2Data;
import com.bytedance.goda.v2.model.dto.GodaV2Feature;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.04Au, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$clearUnreadMsgCountInGodaProtocolCache$1", f = "SeaPdpViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1055404Au extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SeaPdpViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055404Au(SeaPdpViewModel seaPdpViewModel, String str, InterfaceC1364105Vn<? super C1055404Au> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = seaPdpViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1055404Au(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        GodaV2Data godaV2Data;
        n nVar;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        k kVarLJJIIZ3;
        k kVarLJJIIZ4;
        k kVarLJJIIZ5;
        k kVarLJJIIZ6;
        String strLJIL;
        C1C7U.LIZ("SeaPdpViewModel@98e7.clearUnreadMsgCountInGodaProtocolCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProductPackStruct productPackStructLIZJ = C1757830vqP.LIZJ(this.LL.LLIZ);
        if (productPackStructLIZJ != null) {
            GodaV2Protocol<?> godaV2Protocol = productPackStructLIZJ.godaV2Protocol;
            if (godaV2Protocol != null) {
                C1055504Av c1055504Av = C1055504Av.LIZ;
                String str = this.LLILLJJLI;
                c1055504Av.getClass();
                Map<String, GodaV2Data> map = godaV2Protocol.data;
                if (map != null && (godaV2Data = map.get("bottom_bar")) != null) {
                    GodaV2Feature godaV2Feature = godaV2Data.features;
                    String str2 = null;
                    if (godaV2Feature != null) {
                        str2 = godaV2Feature.type;
                    }
                    if (Intrinsics.LJFF(str2, "pdp_sea_bottom_style_1") && (nVar = godaV2Data.itemData) != null && (kVarLJJIIZ = nVar.LJJIIZ("data")) != null) {
                        n nVarLJIILIIL = kVarLJJIIZ.LJIILIIL();
                        k kVarLJJIIZ7 = nVar.LJJIIZ("template");
                        if (kVarLJJIIZ7 != null && (kVarLJJIIZ2 = kVarLJJIIZ7.LJIILIIL().LJJIIZ("content")) != null) {
                            n nVarLJIILIIL2 = kVarLJJIIZ2.LJIILIIL();
                            HashSet hashSet = new HashSet();
                            Iterator<T> it2 = nVarLJIILIIL.LJJIJIL().iterator();
                            while (it2.hasNext()) {
                                k kVarLJJIIZ8 = nVarLJIILIIL.LJJIIZ((String) it2.next());
                                if (kVarLJJIIZ8 != null && (kVarLJJIIZ4 = kVarLJJIIZ8.LJIILIIL().LJJIIZ("button")) != null && (kVarLJJIIZ5 = kVarLJJIIZ4.LJIILIIL().LJJIIZ(str)) != null && (kVarLJJIIZ6 = kVarLJJIIZ5.LJIILIIL().LJJIIZ("content")) != null && (strLJIL = kVarLJJIIZ6.LJIL()) != null) {
                                    hashSet.add(strLJIL);
                                }
                            }
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext()) {
                                k kVarLJJIIZ9 = nVarLJIILIIL2.LJJIIZ((String) it3.next());
                                if (kVarLJJIIZ9 != null && (kVarLJJIIZ3 = kVarLJJIIZ9.LJIILIIL().LJJIIZ("tips")) != null) {
                                    kVarLJJIIZ3.LJIILIIL().LJJIJL("unread_message_count");
                                }
                            }
                        }
                    }
                }
            }
            this.LL.uS2(productPackStructLIZJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.clearUnreadMsgCountInGodaProtocolCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

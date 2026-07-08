package X;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vB7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1732230vB7 extends AbstractC1732180vB2 {
    public C1732260vBA LLJJIII;

    @Override // X.AbstractC1732180vB2, X.AbstractC1732690vBr, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLJJIII != null) {
            C596950NbB.LIZ.clear();
            C596970NbD.LIZIZ.LIZIZ(EnumC1733330vCt.EC_LIVE_BILLBOARD_DISPLAY);
        }
        C596970NbD.LIZIZ.LIZIZ(EnumC1733330vCt.EC_LIVE_BILLBOARD_DISPLAY_NEW);
        C1732020vAm.LIZ.getClass();
        C054G c054g = C1732020vAm.LJFF;
        if (c054g != null) {
            C2296808zG.LIZLLL(c054g, "");
        }
        C1732020vAm.LJFF = null;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_PREVIEW;
    }

    public C1732230vB7(Context context) {
        super(context, 0);
    }

    @Override // X.InterfaceC1733000vCM
    public final void LJI(List<ECBillboard> list, Map<String, ? extends Object> map) {
        Map<String, String> map2 = C1729240v6I.LIZ;
        C1729240v6I.LIZIZ(map, LJJIL(), C1729240v6I.LJFF(this.LLILZ), AbstractC1732180vB2.LJJIJLIJ(), C13LP.LJJLIIIJ(list, ";", null, null, 0, null, AFwS268S0000000_26.get$arr$(510), 30), null, null, null, list.size());
    }

    @Override // X.AbstractC1732690vBr
    /* JADX INFO: renamed from: LJJIIZI */
    public final void LLIZ(IFrameSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        super.LLIZ(slotViewModel, interfaceC21213717zz);
        C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C1732240vB8(this, AbstractC1732180vB2.LJJIJLIJ(), null), 3);
    }

    @Override // X.AbstractC1732180vB2, X.AbstractC1732690vBr, X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        super.prepareToShow(map, interfaceC756140TlM);
        Object obj = map.get("param_is_hidden_ec_widget");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        interfaceC756140TlM.LIZ(!Intrinsics.LJFF(obj, Boolean.TRUE));
    }

    @Override // X.InterfaceC1733000vCM
    public final void LJIIL(List<ECBillboard> list, Map<String, ? extends Object> map, ECBillboard eCBillboard) {
        Integer num;
        Map<String, String> map2 = C1729240v6I.LIZ;
        String strLJJIL = LJJIL();
        String strLJFF = C1729240v6I.LJFF(this.LLILZ);
        String strLJJIJLIJ = AbstractC1732180vB2.LJJIJLIJ();
        if (eCBillboard != null) {
            num = eCBillboard.billboardType;
        } else {
            num = null;
        }
        C1729240v6I.LIZ(list.size(), strLJJIL, strLJFF, strLJJIJLIJ, String.valueOf(num), "2", map);
    }

    @Override // X.InterfaceC1733000vCM
    public final void LJIJJ(List<ECBillboard> list, Map<String, ? extends Object> map, boolean z, ECBillboard eCBillboard) {
        Map<String, String> map2 = C1729240v6I.LIZ;
        C1729240v6I.LIZ(list.size(), LJJIL(), C1729240v6I.LJFF(this.LLILZ), AbstractC1732180vB2.LJJIJLIJ(), C13LP.LJJLIIIJ(list, ";", null, null, 0, null, AFwS268S0000000_26.get$arr$(511), 30), "1", map);
    }
}

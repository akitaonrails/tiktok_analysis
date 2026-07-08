package X;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vB4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1732200vB4 extends AbstractC1732180vB2 {
    public C1729220v6G LLJJIII;

    @Override // X.AbstractC1732180vB2, X.AbstractC1732690vBr, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        super.onDestroy();
        C1728980v5s.LIZ.getClass();
        if (C1728980v5s.LIZLLL()) {
            C1729220v6G c1729220v6G = this.LLJJIII;
            if (c1729220v6G != null) {
                Room room = this.LLILZIL;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1729190v6D(c1729220v6G, room != null ? Long.valueOf(room.getId()) : null, null), 3);
            }
        } else {
            C1733010vCN c1733010vCN = this.LLIZ.LL;
            List<ECBillboard> currentBillboards = c1733010vCN != null ? c1733010vCN.getCurrentBillboards() : null;
            C1733010vCN c1733010vCN2 = this.LLIZ.LL;
            LJJIJIIJI(this.LLIZ.LIZ(), currentBillboards, c1733010vCN2 != null ? c1733010vCN2.getCurrentDaInfo() : null, true);
        }
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_BROADCAST;
    }

    public C1732200vB4(Context context) {
        super(context, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0243  */
    @Override // X.AbstractC1732690vBr, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(final com.ss.ugc.live.sdk.message.data.IMessage r26) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732200vB4.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @C14EU
    public final void onShowScriptWidget(C7838034i c7838034i) {
        if (c7838034i.LIZ) {
            C1733010vCN c1733010vCN = this.LLIZ.LL;
            if (c1733010vCN != null) {
                C786410Ut5.T4(c1733010vCN, 0.6f);
                return;
            }
            return;
        }
        C1733010vCN c1733010vCN2 = this.LLIZ.LL;
        if (c1733010vCN2 == null) {
            return;
        }
        C786410Ut5.T4(c1733010vCN2, 1.0f);
    }

    @Override // X.InterfaceC1733000vCM
    public final void LJI(List<ECBillboard> list, Map<String, ? extends Object> map) {
        Map<String, String> map2 = C1729240v6I.LIZ;
        C1729240v6I.LIZIZ(map, LJJIL(), C1729240v6I.LJFF(this.LLILZ), AbstractC1732180vB2.LJJIJLIJ(), C13LP.LJJLIIIJ(list, ";", null, null, 0, null, AFwS268S0000000_26.get$arr$(507), 30), null, null, null, list.size());
    }

    @Override // X.AbstractC1732690vBr
    /* JADX INFO: renamed from: LJJIIZI */
    public final void LLIZ(IFrameSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        super.LLIZ(slotViewModel, interfaceC21213717zz);
        C622680Oba.LIZJ(this);
        this.LLJJIII = new C1729220v6G();
        C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C1731860vAW(this, null), 3);
    }

    @Override // X.AbstractC1732180vB2, X.AbstractC1732690vBr, X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        boolean z;
        CommerceStruct commerceStruct;
        super.prepareToShow(map, interfaceC756140TlM);
        Object obj = map.get("param_is_hidden_ec_widget");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Room room = this.LLILZIL;
        boolean z2 = true;
        if (room != null && (commerceStruct = room.getCommerceStruct()) != null && commerceStruct.commercePermission == 1) {
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.LJFF(obj, Boolean.TRUE) || !z) {
            z2 = false;
        }
        interfaceC756140TlM.LIZ(z2);
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

    public static final void LJJJIL(int i, String str, String str2, String str3) {
        C1729270v6L.LIZ(str, str2, "old_msg", "anchor", null, str3, "", i, 0, 0, 272);
    }

    @Override // X.InterfaceC1733000vCM
    public final void LJIJJ(List<ECBillboard> list, Map<String, ? extends Object> map, boolean z, ECBillboard eCBillboard) {
        Map<String, String> map2 = C1729240v6I.LIZ;
        C1729240v6I.LIZ(list.size(), LJJIL(), C1729240v6I.LJFF(this.LLILZ), AbstractC1732180vB2.LJJIJLIJ(), C13LP.LJJLIIIJ(list, ";", null, null, 0, null, AFwS268S0000000_26.get$arr$(508), 30), "1", map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2 A[PHI: r6
      0x00f2: PHI (r6v3 java.lang.Integer) = (r6v2 java.lang.Integer), (r6v7 java.lang.Integer) binds: [B:62:0x00ee, B:22:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r21v0, types: [kotlin.jvm.functions.Function1] */
    @Override // X.AbstractC1732690vBr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(long r24, java.util.List r26, java.util.Map r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732200vB4.LJJIJIIJI(long, java.util.List, java.util.Map, boolean):void");
    }

    public static final void LJJJI(Integer num, int i, String str, String str2, String str3, String str4, String str5) {
        int iIntValue;
        String str6 = str5;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (str6 == null) {
            str6 = "";
        }
        C1729270v6L.LIZ(str, str2, str4, "anchor", null, str3, str6, iIntValue, 0, i, 272);
    }
}

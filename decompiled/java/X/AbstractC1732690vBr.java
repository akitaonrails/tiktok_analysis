package X;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.GetBillboardResp;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0vBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1732690vBr extends AbstractC21206917yt implements InterfaceC1733000vCM {
    public final Context LLILLL;
    public final int LLILZ;
    public Room LLILZIL;
    public IFrameSlot.SlotViewModel LLILZLL;
    public final C1733020vCO LLIZ;
    public C054G LLIZLLLIL = C2296808zG.LIZ(C2126308Ur.LJFF);
    public boolean LLJ;
    public long LLJI;
    public long LLJIJIL;
    public long LLJILJIL;

    public static final String LJJIJL(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "undefined" : "timer_msg" : "pc_msg" : "app_msg";
    }

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "ec_shop";
    }

    @Override // X.InterfaceC1733000vCM
    public void LJIJJLI(Map map, ECBillboard eCBillboard) {
    }

    public void LJJ(List<ECBillboard> list, Number number, InterfaceC1731950vAf interfaceC1731950vAf) {
    }

    public void LJJIFFI(List<ECBillboard> list, Number number, InterfaceC1731950vAf interfaceC1731950vAf) {
    }

    public void LJJIIZ(GetBillboardResp getBillboardResp) {
    }

    public void LJJIJIIJI(long j, List list, Map map, boolean z) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final boolean LLIZLLLIL() {
        return true;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return C21182917v1.LIZ(4);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onDestroy() {
        C1732220vB6.LIZ = null;
        C2296808zG.LIZJ(this.LLIZLLLIL, null);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ecbillboard", "scope cancelled");
        this.LLJI = 0L;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onMessage(IMessage iMessage) {
    }

    public final String LJJIJ() {
        int i = this.LLILZ;
        return i != 0 ? i != 1 ? i != 2 ? "" : "audience" : "anchor" : "guide";
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return this.LLIZ;
    }

    public AbstractC1732690vBr(Context context, int i) {
        this.LLILLL = context;
        this.LLILZ = i;
        this.LLIZ = new C1733020vCO(this, i);
    }

    public final void LJJII(String str, List list) {
        int iIntValue;
        String idStr;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ECBillboard eCBillboard = (ECBillboard) it2.next();
            String strLJJIJ = LJJIJ();
            Integer num = eCBillboard.billboardType;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            Room room = this.LLILZIL;
            Long lValueOf = null;
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
            Room room2 = this.LLILZIL;
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.getOwnerUserId());
            }
            C1729270v6L.LIZ("billboard_get", null, str, strLJJIJ, idStr, String.valueOf(lValueOf), String.valueOf(eCBillboard.billboardId), iIntValue, 0, 0, 770);
        }
    }

    public final void LJJIIJ(String str, List list) {
        int iIntValue;
        String idStr;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ECBillboard eCBillboard = (ECBillboard) it2.next();
            String strLJJIJ = LJJIJ();
            Integer num = eCBillboard.billboardType;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            Room room = this.LLILZIL;
            Long lValueOf = null;
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
            Room room2 = this.LLILZIL;
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.getOwnerUserId());
            }
            C1729270v6L.LIZ("billboard_on_screen", null, str, strLJJIJ, idStr, String.valueOf(lValueOf), String.valueOf(eCBillboard.billboardId), iIntValue, 0, 0, 770);
        }
    }

    public final void LJJIIJZLJL(String str, String str2) {
        String idStr;
        String strLJJIJ = LJJIJ();
        Room room = this.LLILZIL;
        Long lValueOf = null;
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        Room room2 = this.LLILZIL;
        if (room2 != null) {
            lValueOf = Long.valueOf(room2.getOwnerUserId());
        }
        C1729270v6L.LIZ(str, str2, null, strLJJIJ, idStr, String.valueOf(lValueOf), "", 0, 0, 0, 900);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    /* JADX INFO: renamed from: LJJIIZI, reason: merged with bridge method [inline-methods] */
    public void LLIZ(IFrameSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ecbillboard", "onSlotCreated");
        this.LLILZLL = slotViewModel;
        C1732220vB6.LIZ = new WeakReference<>(this);
        this.LLIZLLLIL = C2296808zG.LIZ(C2126308Ur.LJFF);
        int i2 = this.LLILZ;
        int i3 = 1;
        if (i2 != 2) {
            if (i2 != 1) {
                return;
            }
        } else {
            i3 = 2;
        }
        LJJIIJZLJL("billboard_get_request", "api_start ");
        LJJIJIL(i3, new AwS605S0100000_26(this, 816));
    }

    public final void LJJIJIL(int i, Function1<? super GetBillboardResp, Unit> function1) {
        if (C2296808zG.LJI(this.LLIZLLLIL)) {
            C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C598430NdZ(this, i, function1, null), 3);
        } else {
            LJJIIJZLJL("billboard_get_request_fail", "scope is cancelled");
        }
    }

    @Override // X.InterfaceC1124060fMC
    public void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Room room;
        Object obj = map.get("param_room");
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LLILZIL = room;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ecbillboard", "prepareToShow");
    }

    @Override // X.InterfaceC1733000vCM
    public String LJIJ(ECBillboard eCBillboard, Map<String, ? extends Object> map, int i) {
        return eCBillboard.LIZJ(i);
    }

    public final void LJJIII(String str, String str2, List list) {
        int iIntValue;
        String idStr;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ECBillboard eCBillboard = (ECBillboard) it2.next();
            String strLJJIJ = LJJIJ();
            Integer num = eCBillboard.billboardType;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            Room room = this.LLILZIL;
            Long lValueOf = null;
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
            Room room2 = this.LLILZIL;
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.getOwnerUserId());
            }
            C1729270v6L.LIZ("billboard_show_fail", str2, str, strLJJIJ, idStr, String.valueOf(lValueOf), String.valueOf(eCBillboard.billboardId), iIntValue, 0, 0, 768);
        }
    }

    public void LJJI(List<ECBillboard> list, Number number, InterfaceC1731950vAf interfaceC1731950vAf, Map<String, ? extends Object> map) {
        if (C2296808zG.LJI(this.LLIZLLLIL)) {
            C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C1732700vBs(number, this, list, map, interfaceC1731950vAf, null), 3);
        } else {
            interfaceC1731950vAf.LIZ("scope cancelled");
        }
    }
}

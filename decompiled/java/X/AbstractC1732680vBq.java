package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model.SeaLiveBillboard;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1732680vBq extends AbstractC21206917yt implements InterfaceC1733210vCh {
    public final Context LLILLL;
    public final int LLILZ;
    public Room LLILZIL;
    public IFrameSlot.SlotViewModel LLILZLL;
    public final C1733030vCP LLIZ = new C1733030vCP(this);
    public C054G LLIZLLLIL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C2126308Ur.LJFF));
    public boolean LLJ;
    public long LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public ISeaLiveContextAbility LLJILJILJ;

    public static final String LJJIIZI(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "undefined" : "timer_msg" : "pc_msg" : "app_msg";
    }

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "ec_shop";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final boolean LLIZLLLIL() {
        return true;
    }

    public void LLLLLLZZ(List list, Number number, C1733430vD3 c1733430vD3) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return C21182917v1.LIZ(4);
    }

    public void n(List<SeaLiveBillboard> list, Number number, InterfaceC1732650vBn interfaceC1732650vBn) {
    }

    public final String LJJIIJZLJL() {
        int i = this.LLILZ;
        return i != 0 ? i != 1 ? i != 2 ? "" : "3" : "1" : CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onDestroy() {
        C1732870vC9 c1732870vC9JC2;
        C1732860vC8 c1732860vC8LIZ;
        ISeaLiveContextAbility iSeaLiveContextAbility = this.LLJILJILJ;
        if (iSeaLiveContextAbility != null && (c1732870vC9JC2 = iSeaLiveContextAbility.JC2()) != null && (c1732860vC8LIZ = c1732870vC9JC2.LIZ()) != null) {
            c1732860vC8LIZ.LIZJ(InterfaceC1733210vCh.class, this);
        }
        C2296808zG.LIZJ(this.LLIZLLLIL, null);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ecbillboard", "scope cancelled");
        this.LLJI = 0L;
        this.LLIZ.LL.LIZIZ();
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1733210vCh
    public final void LLILLIZIL(boolean z) {
        if (C2296808zG.LJI(this.LLIZLLLIL)) {
            C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C598460Ndc(this, z, null), 3);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onMessage(IMessage iMessage) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        String strLJIIIIZZ = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("billboard onMessage: ");
            if (iMessage != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(iMessage);
            }
            sbLIZ.append(strLJIIIIZZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
        }
    }

    public AbstractC1732680vBq(Context context, int i) {
        this.LLILLL = context;
        this.LLILZ = i;
    }

    public final void LJJI(String str, List list) {
        int iIntValue;
        String idStr;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SeaLiveBillboard seaLiveBillboard = (SeaLiveBillboard) it2.next();
            String strLJJIIJZLJL = LJJIIJZLJL();
            Integer num = seaLiveBillboard.billboardType;
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
            C1729260v6K.LIZ("billboard_get", null, str, strLJJIIJZLJL, idStr, String.valueOf(lValueOf), String.valueOf(seaLiveBillboard.billboardId), iIntValue, 0, 770);
        }
    }

    public final void LJJII(String str, List list) {
        int iIntValue;
        String idStr;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SeaLiveBillboard seaLiveBillboard = (SeaLiveBillboard) it2.next();
            String strLJJIIJZLJL = LJJIIJZLJL();
            Integer num = seaLiveBillboard.billboardType;
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
            C1729260v6K.LIZ("billboard_on_screen", null, str, strLJJIIJZLJL, idStr, String.valueOf(lValueOf), String.valueOf(seaLiveBillboard.billboardId), iIntValue, 0, 770);
        }
    }

    public final void LJJIII(String str, String str2) {
        String idStr;
        String strLJJIIJZLJL = LJJIIJZLJL();
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
        C1729260v6K.LIZ(str, str2, null, strLJJIIJZLJL, idStr, String.valueOf(lValueOf), "", 0, 0, 900);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    /* JADX INFO: renamed from: LJJIIJ, reason: merged with bridge method [inline-methods] */
    public void LLIZ(IFrameSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        ISeaLiveContextAbility iSeaLiveContextAbility = this.LLJILJILJ;
        if (iSeaLiveContextAbility != null) {
            C1732860vC8 c1732860vC8LIZ = iSeaLiveContextAbility.JC2().LIZ();
            if (c1732860vC8LIZ != null) {
                c1732860vC8LIZ.LIZIZ(InterfaceC1733210vCh.class, this);
            }
            C1733170vCd c1733170vCd = this.LLIZ.LL;
            if ((c1733170vCd instanceof C1733170vCd) && c1733170vCd != null) {
                c1733170vCd.setContextAbility(iSeaLiveContextAbility);
            }
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSlotCreated");
        sbLIZ.append(this);
        C1720106oR.LJI("jingjie ecbillboard", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL = slotViewModel;
        C2296808zG.LIZJ(this.LLIZLLLIL, null);
        this.LLIZLLLIL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C2126308Ur.LJFF));
        int i2 = this.LLILZ;
        int i3 = 1;
        if (i2 != 2) {
            if (i2 != 1) {
                return;
            }
        } else {
            i3 = 2;
        }
        LJJIII("billboard_get_request", "api_start ");
        LJJIIZ(i3, new AwS605S0100000_26(this, 6));
    }

    public final void LJJIIZ(int i, Function1<? super n, Unit> function1) {
        if (C2296808zG.LJI(this.LLIZLLLIL)) {
            C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C598420NdY(this, i, function1, null), 3);
        } else {
            LJJIII("billboard_get_request_fail", "scope is cancelled");
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
        this.LLJILJILJ = C1732830vC5.LIZ(map);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ecbillboard", "prepareToShow");
    }

    public final void LJJIFFI(String str, String str2, List list) {
        int iIntValue;
        String idStr;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SeaLiveBillboard seaLiveBillboard = (SeaLiveBillboard) it2.next();
            String strLJJIIJZLJL = LJJIIJZLJL();
            Integer num = seaLiveBillboard.billboardType;
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
            C1729260v6K.LIZ("billboard_show_fail", str2, str, strLJJIIJZLJL, idStr, String.valueOf(lValueOf), String.valueOf(seaLiveBillboard.billboardId), iIntValue, 0, 768);
        }
    }

    public final void LJJ(List list, EnumC1732850vC7 enumC1732850vC7, Object obj, Number number, InterfaceC1732650vBn interfaceC1732650vBn, C1733200vCg c1733200vCg) {
        if (C2296808zG.LJI(this.LLIZLLLIL)) {
            if (Intrinsics.LJFF(number, 0)) {
                C1733030vCP c1733030vCP = this.LLIZ;
                c1733030vCP.LL.LIZLLL(list.size(), enumC1732850vC7, obj, c1733200vCg, null, interfaceC1732650vBn);
                return;
            }
            C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C598470Ndd(this, list, number, interfaceC1732650vBn, null), 3);
            return;
        }
        interfaceC1732650vBn.LIZ("scope cancelled");
    }

    public void w(int i, EnumC1732850vC7 enumC1732850vC7, Object obj, C1733200vCg c1733200vCg, Integer num, InterfaceC1732650vBn interfaceC1732650vBn) {
        this.LLIZ.LL.LIZLLL(i, enumC1732850vC7, obj, c1733200vCg, num, interfaceC1732650vBn);
    }
}

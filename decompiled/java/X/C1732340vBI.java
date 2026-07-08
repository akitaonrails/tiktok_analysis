package X;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vBI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1732340vBI extends AbstractC1732350vBJ {
    public C1729170v6B LLJJIJI;

    @Override // X.AbstractC1732350vBJ, X.AbstractC1732680vBq, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        super.onDestroy();
        C1728970v5r.LIZ.getClass();
        if (C1728970v5r.LIZJ()) {
            C1729170v6B c1729170v6B = this.LLJJIJI;
            if (c1729170v6B != null) {
                Room room = this.LLILZIL;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1729150v69(c1729170v6B, room != null ? Long.valueOf(room.getId()) : null, null), 3);
            }
        } else {
            this.LLIZ.LL.getCurrentBillboards();
            this.LLIZ.LL.getCurrentDaInfo();
            this.LLIZ.LL.getShowTime();
        }
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_BROADCAST;
    }

    public C1732340vBI(Context context) {
        super(context, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0308  */
    @Override // X.AbstractC1732680vBq, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r26) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732340vBI.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @C14EU
    public final void onShowScriptWidget(C7838034i c7838034i) {
        if (c7838034i.LIZ) {
            C1733170vCd c1733170vCd = this.LLIZ.LL;
            if (c1733170vCd != null) {
                C786410Ut5.T4(c1733170vCd, 0.6f);
                return;
            }
            return;
        }
        C1733170vCd c1733170vCd2 = this.LLIZ.LL;
        if (c1733170vCd2 == null) {
            return;
        }
        C786410Ut5.T4(c1733170vCd2, 1.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0v6B] */
    @Override // X.AbstractC1732350vBJ, X.AbstractC1732680vBq
    /* JADX INFO: renamed from: LJJIIJ */
    public final void LLIZ(IFrameSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        super.LLIZ(slotViewModel, interfaceC21213717zz);
        C622680Oba.LIZJ(this);
        this.LLJJIJI = new Object() { // from class: X.0v6B
            public final C1728680v5O LIZ = new C1728680v5O();
        };
        C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C598580Ndo(this, null), 3);
    }

    @Override // X.AbstractC1732350vBJ, X.AbstractC1732680vBq, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final /* bridge */ /* synthetic */ void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        LLIZ((IFrameSlot.SlotViewModel) viewModel, interfaceC21213717zz);
    }

    @Override // X.AbstractC1732350vBJ, X.AbstractC1732680vBq, X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        boolean z;
        CommerceStruct commerceStruct;
        boolean z2 = false;
        if (!((Boolean) C288770BTn.LIZIZ.getValue()).booleanValue()) {
            interfaceC756140TlM.LIZ(false);
            return;
        }
        super.prepareToShow(map, interfaceC756140TlM);
        Object obj = map.get("param_is_hidden_ec_widget");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Room room = this.LLILZIL;
        if (room != null && (commerceStruct = room.getCommerceStruct()) != null && commerceStruct.commercePermission == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!Intrinsics.LJFF(obj, Boolean.TRUE) && z) {
            z2 = true;
        }
        interfaceC756140TlM.LIZ(z2);
    }

    public static final void LJJIJL(int i, String str, String str2, String str3) {
        C1729260v6K.LIZ(str, str2, "old_msg", "1", null, str3, "", i, 0, 272);
    }
}

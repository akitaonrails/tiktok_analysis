package X;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IFrameSlot;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vBP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1732410vBP extends AbstractC1732350vBJ {
    public C1732330vBH LLJJIJI;

    @Override // X.AbstractC1732350vBJ, X.AbstractC1732680vBq, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLJJIJI != null) {
            C596950NbB.LIZ.clear();
            C596970NbD.LIZIZ.LIZIZ(EnumC1733330vCt.EC_LIVE_BILLBOARD_DISPLAY);
        }
        C596970NbD.LIZIZ.LIZIZ(EnumC1733330vCt.EC_LIVE_BILLBOARD_DISPLAY_NEW);
        C1732390vBN.LIZ.getClass();
        C054G c054g = C1732390vBN.LJFF;
        if (c054g != null) {
            C2296808zG.LIZLLL(c054g, "");
        }
        C1732390vBN.LJFF = null;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_PREVIEW;
    }

    public C1732410vBP(Context context) {
        super(context, 0);
    }

    @Override // X.AbstractC1732350vBJ, X.AbstractC1732680vBq
    /* JADX INFO: renamed from: LJJIIJ */
    public final void LLIZ(IFrameSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        super.LLIZ(slotViewModel, interfaceC21213717zz);
        C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C1732370vBL(this, AbstractC1732350vBJ.LJJIJ(), null), 3);
    }

    @Override // X.AbstractC1732350vBJ, X.AbstractC1732680vBq, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final /* bridge */ /* synthetic */ void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        LLIZ((IFrameSlot.SlotViewModel) viewModel, interfaceC21213717zz);
    }

    @Override // X.AbstractC1732350vBJ, X.AbstractC1732680vBq, X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        if (!((Boolean) C288770BTn.LIZIZ.getValue()).booleanValue()) {
            interfaceC756140TlM.LIZ(false);
            return;
        }
        super.prepareToShow(map, interfaceC756140TlM);
        Object obj = map.get("param_is_hidden_ec_widget");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        interfaceC756140TlM.LIZ(!Intrinsics.LJFF(obj, Boolean.TRUE));
    }
}

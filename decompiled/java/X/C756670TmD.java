package X;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0TmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756670TmD implements InterfaceC1123960fM2 {
    @Override // X.InterfaceC1123960fM2
    public final String LIZ() {
        return "game_partnership";
    }

    @Override // X.InterfaceC1123960fM2
    public final List<EnumC756810TmR> LIZIZ() {
        return C1697810uHb.LJIILJJIL(EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR, EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR);
    }

    @Override // X.InterfaceC1123960fM2
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1123960fM2
    public final InterfaceC1124060fMC<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> LJFF(Context context, EnumC1124020fM8 enumC1124020fM8) {
        return null;
    }

    @Override // X.InterfaceC1123960fM2
    public final List<EnumC1124020fM8> LIZJ() {
        return new ArrayList();
    }

    @Override // X.InterfaceC1123960fM2
    public final InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LJ(Context context, EnumC756810TmR enumC756810TmR) {
        if (enumC756810TmR != null) {
            int i = C756680TmE.LIZ[enumC756810TmR.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new C01SI(context);
                }
                return null;
            }
            return new C01SE(context);
        }
        return null;
    }
}

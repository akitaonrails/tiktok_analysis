package X;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.android.live.slot.ISlotService;

/* JADX INFO: renamed from: X.0UlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C781610UlL {
    public static final C781600UlK LIZ = new InterfaceC756790TmP() { // from class: X.0UlK
        @Override // X.InterfaceC756790TmP
        public final void registerAggregateSlot(InterfaceC756730TmJ interfaceC756730TmJ) {
            ISlotService iSlotService = (ISlotService) C1161920gLG.LIZJ(ISlotService.class);
            if (iSlotService == null) {
                return;
            }
            iSlotService.registerAggregateSlot(interfaceC756730TmJ);
        }

        @Override // X.InterfaceC756790TmP
        public final void registerSlot(InterfaceC1123960fM2 interfaceC1123960fM2) {
            ISlotService iSlotService = (ISlotService) C1161920gLG.LIZJ(ISlotService.class);
            if (iSlotService == null) {
                return;
            }
            if (!iSlotService.isBizTypeRegistered(interfaceC1123960fM2.LIZ())) {
                iSlotService.registerSlot(interfaceC1123960fM2);
                return;
            }
            throw new IllegalStateException("The bizType can not register to LiveSlot twice!");
        }

        @Override // X.InterfaceC756790TmP
        public final Rect getIconSlotLocation(Context context, EnumC756810TmR enumC756810TmR) {
            ISlotService iSlotService = (ISlotService) C1161920gLG.LIZJ(ISlotService.class);
            if (iSlotService == null) {
                return null;
            }
            return iSlotService.getIconSlotLocation(context, enumC756810TmR);
        }
    };
}

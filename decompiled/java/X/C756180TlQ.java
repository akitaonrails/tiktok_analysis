package X;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.slot.IIconSlot;
import com.ss.android.ugc.aweme.live.slot.LiveShopBagBusinessSlotWidget;

/* JADX INFO: renamed from: X.0TlQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756180TlQ implements IIconSlot {
    public LiveShopBagBusinessSlotWidget.ShopBagSlotsBottomSheetDialog LIZ;
    public final /* synthetic */ LiveShopBagBusinessSlotWidget LIZIZ;

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener LIZ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final void getScheme() {
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final InterfaceC752610Tff LIZJ() {
        final LiveShopBagBusinessSlotWidget liveShopBagBusinessSlotWidget = this.LIZIZ;
        return new InterfaceC752610Tff() { // from class: X.0TlP
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
                InterfaceC21213717zz interfaceC21213717zz;
                Context context;
                FragmentManager fragmentManagerLJIL;
                C756180TlQ c756180TlQ;
                LiveShopBagBusinessSlotWidget.ShopBagSlotsBottomSheetDialog shopBagSlotsBottomSheetDialog;
                C756180TlQ c756180TlQ2 = this.LIZ;
                if (c756180TlQ2.LIZ == null) {
                    LiveShopBagBusinessSlotWidget.ShopBagSlotsBottomSheetDialog shopBagSlotsBottomSheetDialog2 = new LiveShopBagBusinessSlotWidget.ShopBagSlotsBottomSheetDialog();
                    shopBagSlotsBottomSheetDialog2.LL = liveShopBagBusinessSlotWidget.LLILZIL;
                    c756180TlQ2.LIZ = shopBagSlotsBottomSheetDialog2;
                }
                LiveShopBagBusinessSlotWidget.ShopBagSlotsBottomSheetDialog shopBagSlotsBottomSheetDialog3 = this.LIZ.LIZ;
                if ((shopBagSlotsBottomSheetDialog3 != null && shopBagSlotsBottomSheetDialog3.isShowing()) || (interfaceC21213717zz = liveShopBagBusinessSlotWidget.LLILZ) == null || (context = interfaceC21213717zz.getContext()) == null || (fragmentManagerLJIL = C520010KaN.LJIL(context, false)) == null || (shopBagSlotsBottomSheetDialog = (c756180TlQ = this.LIZ).LIZ) == null) {
                    return;
                }
                shopBagSlotsBottomSheetDialog.show(fragmentManagerLJIL, c756180TlQ.getClass().getSimpleName());
            }
        };
    }

    public C756180TlQ(LiveShopBagBusinessSlotWidget liveShopBagBusinessSlotWidget) {
        this.LIZIZ = liveShopBagBusinessSlotWidget;
    }
}

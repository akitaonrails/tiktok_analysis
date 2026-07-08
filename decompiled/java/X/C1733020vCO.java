package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.bytedance.android.live.slot.IFrameSlot;

/* JADX INFO: renamed from: X.0vCO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733020vCO implements IFrameSlot {
    public final C1733010vCN LL;

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LJIIZILJ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LJIJ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void LJIJJ(String str) {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final String getScheme() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void onHide() {
    }

    public final long LIZ() {
        C1733010vCN c1733010vCN = this.LL;
        if (c1733010vCN != null) {
            return c1733010vCN.getShowTime();
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final InterfaceC752610Tff LIZJ() {
        return new InterfaceC752610Tff() { // from class: X.0vCS
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
            }
        };
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final View LJIJI(Context context) {
        return this.LL;
    }

    public C1733020vCO(AbstractC1732690vBr abstractC1732690vBr, int i) {
        this.LL = new C1733010vCN(abstractC1732690vBr.LLILLL, i, abstractC1732690vBr);
    }
}

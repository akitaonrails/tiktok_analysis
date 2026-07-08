package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.bytedance.android.live.slot.IFrameSlot;

/* JADX INFO: renamed from: X.0vCP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733030vCP implements IFrameSlot {
    public final C1733170vCd LL;

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

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final InterfaceC752610Tff LIZJ() {
        return new InterfaceC752610Tff() { // from class: X.0vCR
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
            }
        };
    }

    public C1733030vCP(AbstractC1732680vBq abstractC1732680vBq) {
        this.LL = new C1733170vCd(abstractC1732680vBq.LLILLL);
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final View LJIJI(Context context) {
        return this.LL;
    }
}

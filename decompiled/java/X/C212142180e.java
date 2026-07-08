package X;

import Y.ALAdapterS6S0000000_32;
import android.animation.Animator;
import com.bytedance.android.live.slot.IIconSlot;

/* JADX INFO: renamed from: X.180e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C212142180e implements IIconSlot {
    public final InterfaceC752610Tff LIZ;

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final void getScheme() {
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener LIZ() {
        return new ALAdapterS6S0000000_32(2);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final InterfaceC752610Tff LIZJ() {
        return this.LIZ;
    }

    public C212142180e(C180Q c180q) {
        this.LIZ = c180q;
    }
}

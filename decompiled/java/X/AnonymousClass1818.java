package X;

import Y.ALAdapterS6S0000000_32;
import android.animation.Animator;
import com.bytedance.android.live.slot.IIconSlot;

/* JADX INFO: renamed from: X.1818, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1818 implements IIconSlot {
    public final InterfaceC752610Tff LIZ;

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final void getScheme() {
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener LIZ() {
        return new ALAdapterS6S0000000_32(0);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final InterfaceC752610Tff LIZJ() {
        return this.LIZ;
    }

    public AnonymousClass1818(InterfaceC752610Tff interfaceC752610Tff) {
        this.LIZ = interfaceC752610Tff;
    }
}

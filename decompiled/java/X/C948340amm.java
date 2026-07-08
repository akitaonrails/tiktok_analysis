package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import java.util.List;

/* JADX INFO: renamed from: X.0amm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948340amm extends AbstractC20085213iM {
    public final C941180abE LLJ;
    public InterfaceC937090aUd LLJI;
    public final C01GW LLJIJIL;

    private final C937670aVZ getLinkMicAbilityStateChangeListener() {
        return (C937670aVZ) this.LLJIJIL.getValue();
    }

    public final List<C941240abK> getCurrentVisiblePlayToolListItem() {
        return this.LLJ.LJFF.LIZIZ;
    }

    @Override // X.AbstractC20085213iM, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        LifecycleCoroutineScope lifecycleScope;
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwnerLJJII = C520010KaN.LJJII(this, false);
        if (lifecycleOwnerLJJII != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLJJII)) != null) {
            C01KE.LIZIZ(lifecycleScope, new C942720adi(this, null));
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LIZ(getLinkMicAbilityStateChangeListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJ.LJII.LJ();
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIIJJI(getLinkMicAbilityStateChangeListener());
        }
    }

    public C948340amm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJ = new C941180abE(context);
        this.LLJIJIL = C452501pT.LIZIZ(new C937690aVb(this));
    }

    @Override // X.AbstractC20085213iM
    public final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-562830711);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1669670tYD.LIZ(48, 1, c13zcLJIIJ, null, C13Z4.LIZJ(1451020559, new C951470arp(this), c13zcLJIIJ));
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C951440arm(this, i);
        }
    }
}

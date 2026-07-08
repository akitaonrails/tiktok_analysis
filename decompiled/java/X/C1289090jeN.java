package X;

import com.lynx.animax.AnimaXPlayer;
import java.lang.ref.WeakReference;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: X.0jeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289090jeN {
    public final PriorityQueue<C1289100jeO> LIZ = new PriorityQueue<>();
    public WeakReference<AnimaXPlayer> LIZIZ;

    public final void LIZ(InterfaceC1289150jeT interfaceC1289150jeT) {
        LIZIZ(interfaceC1289150jeT, EnumC1289080jeM.DEFAULT);
    }

    public final void LIZIZ(InterfaceC1289150jeT interfaceC1289150jeT, EnumC1289080jeM enumC1289080jeM) {
        this.LIZ.add(new C1289100jeO(interfaceC1289150jeT, enumC1289080jeM));
    }
}

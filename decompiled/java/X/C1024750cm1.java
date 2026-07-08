package X;

import Y.AfS185S0100000_16;
import android.content.Context;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0cm1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024750cm1 implements InterfaceC1024740cm0 {
    public final List<WeakReference<InterfaceC1024730clz>> LIZ = new CopyOnWriteArrayList();

    public C1024750cm1() {
        C783060Ung.LIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS185S0100000_16(this, 16));
    }

    public final void LIZ(Context context, String str, boolean z) {
        if (!C1474810oTv.LJJIJIIJIL()) {
            return;
        }
        if (z) {
            C582130MsN.LIZ().LJ();
            C1476910oXJ.LJ(true, str);
            for (Reference reference : (CopyOnWriteArrayList) this.LIZ) {
                if (reference.get() != null) {
                    ((InterfaceC1024730clz) reference.get()).LIZIZ();
                }
            }
            C582130MsN.LIZ().LJ().getClass();
            if (C582130MsN.LIZ().getConfig().getPlayerGlobalConfig().getAutoAudioFocus()) {
                C19DA.LIZ(context, true);
                return;
            }
            return;
        }
        C582130MsN.LIZ().LJ();
        C1476910oXJ.LJ(false, str);
        C582130MsN.LIZ().LJ().getClass();
        if (!C582130MsN.LIZ().getConfig().getPlayerGlobalConfig().getAutoAudioFocus()) {
            C19DA.LIZ(context, false);
        }
    }
}

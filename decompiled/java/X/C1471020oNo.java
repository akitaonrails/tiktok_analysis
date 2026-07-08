package X;

import com.ss.ttm.player.TTPlayer;

/* JADX INFO: renamed from: X.0oNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1471020oNo implements InterfaceC1471120oNy {
    public final /* synthetic */ TTPlayer LIZ;

    public C1471020oNo(TTPlayer tTPlayer) {
        this.LIZ = tTPlayer;
    }

    public final void LIZ(int i, int i2, int i3, boolean z) {
        long j = this.LIZ.LIZ;
        if (j != 0) {
            TTPlayer._notifyReparent(j, i, i2, i3, z);
        }
    }
}

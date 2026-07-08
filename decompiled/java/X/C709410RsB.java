package X;

import Y.ARunnableS16S1200000_11;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobComponent;

/* JADX INFO: renamed from: X.0RsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709410RsB implements InterfaceC703970RjP {
    public final /* synthetic */ InteractAreaSizeMobComponent LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.InterfaceC703970RjP
    public final void LIZ(ViewGroup viewGroup) {
        C01GW c01gw = C709340Rs4.LIZ;
        C709340Rs4.LIZIZ(new ARunnableS16S1200000_11(viewGroup, this.LIZIZ, this.LIZ, 4));
    }

    @Override // X.InterfaceC703970RjP
    public final void LIZIZ(ViewGroup viewGroup) {
        C01GW c01gw = C709340Rs4.LIZ;
        C709340Rs4.LIZIZ(new ARunnableS16S1200000_11(viewGroup, this.LIZIZ, this.LIZ, 3));
    }

    @Override // X.InterfaceC703970RjP
    public final void LIZJ(ViewGroup viewGroup) {
        C01GW c01gw = C709340Rs4.LIZ;
        C709340Rs4.LIZIZ(new ARunnableS16S1200000_11(viewGroup, this.LIZIZ, this.LIZ, 5));
    }

    public C709410RsB(InteractAreaSizeMobComponent interactAreaSizeMobComponent, String str) {
        this.LIZ = interactAreaSizeMobComponent;
        this.LIZIZ = str;
    }
}

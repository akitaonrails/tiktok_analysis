package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutFullScreenEnd;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.AFwS203S0000000_15;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0aaX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940750aaX implements InterfaceC923120a86, InterfaceC940760aaY {
    public static final C01GW<C940750aaX> LIZLLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(73));
    public final C920190a3N LIZ;
    public final C937850aVr LIZIZ;
    public final ConcurrentLinkedQueue<InterfaceC940760aaY> LIZJ;

    public C940750aaX() {
        this(null);
    }

    @Override // X.InterfaceC923120a86
    public final C937830aVp LIZIZ() {
        return new C937830aVp();
    }

    @Override // X.InterfaceC923120a86
    public final C920190a3N getAction() {
        return this.LIZ;
    }

    @Override // X.InterfaceC923120a86
    public final InterfaceC920220a3Q getDataSource() {
        return this.LIZIZ;
    }

    public C940750aaX(EnumC940090aZT enumC940090aZT) {
        this.LIZ = new C920190a3N();
        C937850aVr c937850aVr = new C937850aVr(enumC940090aZT);
        this.LIZIZ = c937850aVr;
        this.LIZJ = new ConcurrentLinkedQueue<>();
        LJIIZILJ(c937850aVr);
    }

    @Override // X.InterfaceC923120a86
    public final void LJIIZILJ(InterfaceC940760aaY interfaceC940760aaY) {
        if (!this.LIZJ.contains(interfaceC940760aaY)) {
            this.LIZJ.add(interfaceC940760aaY);
        }
    }

    @Override // X.InterfaceC923120a86
    public final void LJJ(InterfaceC940760aaY interfaceC940760aaY) {
        this.LIZJ.remove(interfaceC940760aaY);
    }

    @Override // X.InterfaceC940760aaY
    public final void LJJI(String str) {
        Iterator<InterfaceC940760aaY> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJI(str);
        }
    }

    @Override // X.InterfaceC940760aaY
    public final void LJJII(String str) {
        Iterator<InterfaceC940760aaY> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJII(str);
        }
    }

    @Override // X.InterfaceC940760aaY
    public final void LJJIII(List<C957020b0m> list) {
        Iterator<InterfaceC940760aaY> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIII(list);
        }
    }

    @Override // X.InterfaceC940760aaY
    public final void LJJIIJZLJL(C942080acg c942080acg) {
        Iterator<InterfaceC940760aaY> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIJZLJL(c942080acg);
        }
    }

    @Override // X.InterfaceC940760aaY
    public final void LJJIJ(String str) {
        if (LinkMicLayoutFullScreenEnd.INSTANCE.isEnable()) {
            this.LIZIZ.LIZIZ = null;
        }
        Iterator<InterfaceC940760aaY> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIJ(str);
        }
    }

    @Override // X.InterfaceC940760aaY
    public final void LJJIJIIJIL(String str) {
        Iterator<InterfaceC940760aaY> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIJIIJIL(str);
        }
    }

    @Override // X.InterfaceC940760aaY
    public final void LJFF(int i, String str) {
        Iterator<InterfaceC940760aaY> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(i, str);
        }
    }

    @Override // X.InterfaceC940760aaY
    public final void LJIJI(LayoutState layoutState, List<SpotInfo> list, MultiGuestLayoutExtra multiGuestLayoutExtra) {
        this.LIZIZ.LIZIZ = multiGuestLayoutExtra;
        Iterator<InterfaceC940760aaY> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIJI(layoutState, list, multiGuestLayoutExtra);
        }
    }
}

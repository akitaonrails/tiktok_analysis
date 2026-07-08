package X;

import com.bytedance.android.livesdk.model.BannerInRoom;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ego, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098400ego extends AbstractC712240Rwk {
    public final List<BannerInRoom> LL;
    public final InterfaceC1098410egp LLILLJJLI;
    public final Map<Long, C1098390egn> LLILLL;
    public int LLILZ;
    public EnumC1098310egf LLILZIL = EnumC1098310egf.AUTO_SCROLL;

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        if (this.LL.size() != 1 && i == 1) {
            this.LLILZIL = EnumC1098310egf.DRAG;
            InterfaceC1098410egp interfaceC1098410egp = this.LLILLJJLI;
            if (interfaceC1098410egp != null) {
                int i2 = this.LLILZ;
                interfaceC1098410egp.m0(i2, (BannerInRoom) C13LP.LJJJLZIJ(i2, this.LL));
            }
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        Long lValueOf;
        C1098390egn c1098390egn;
        InterfaceC1098410egp interfaceC1098410egp;
        String str;
        int size = this.LLILZ % this.LL.size();
        BannerInRoom bannerInRoom = (BannerInRoom) C13LP.LJJJLZIJ(size, this.LL);
        boolean z = true;
        if (bannerInRoom != null && (c1098390egn = this.LLILLL.get(Long.valueOf(bannerInRoom.id))) != null && (interfaceC1098410egp = this.LLILLJJLI) != null) {
            int i2 = C1098350egj.LIZ[this.LLILZIL.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        str = "";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str = "slide";
                }
            } else {
                str = "rotation";
            }
            interfaceC1098410egp.LJJJJZI(size, bannerInRoom, str, c1098390egn.LIZ, c1098390egn.LIZLLL, c1098390egn.LIZJ);
        }
        int size2 = i % this.LL.size();
        BannerInRoom bannerInRoom2 = (BannerInRoom) C13LP.LJJJLZIJ(size2, this.LL);
        this.LLILZ = size2;
        if (bannerInRoom2 != null) {
            lValueOf = Long.valueOf(bannerInRoom2.id);
            if (lValueOf != null) {
                C1098390egn c1098390egn2 = this.LLILLL.get(lValueOf);
                if (c1098390egn2 != null) {
                    c1098390egn2.LIZ = System.currentTimeMillis();
                    c1098390egn2.LIZIZ++;
                    c1098390egn2.LIZJ = 0;
                    c1098390egn2.LIZLLL = -1L;
                } else {
                    Map<Long, C1098390egn> map = this.LLILLL;
                    C1098390egn c1098390egn3 = new C1098390egn();
                    c1098390egn3.LIZ = System.currentTimeMillis();
                    c1098390egn3.LIZIZ++;
                    c1098390egn3.LIZJ = 0;
                    c1098390egn3.LIZLLL = -1L;
                    map.put(lValueOf, c1098390egn3);
                }
            }
        } else {
            lValueOf = null;
        }
        C1098390egn c1098390egn4 = this.LLILLL.get(lValueOf);
        InterfaceC1098410egp interfaceC1098410egp2 = this.LLILLJJLI;
        if (interfaceC1098410egp2 != null) {
            EnumC1098310egf enumC1098310egf = this.LLILZIL;
            if (c1098390egn4 == null || c1098390egn4.LIZIZ != 1) {
                z = false;
            }
            interfaceC1098410egp2.LLLILZ(size2, bannerInRoom2, enumC1098310egf, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1098400ego(List<? extends BannerInRoom> list, InterfaceC1098410egp interfaceC1098410egp, Map<Long, C1098390egn> map) {
        this.LL = list;
        this.LLILLJJLI = interfaceC1098410egp;
        this.LLILLL = map;
    }
}

package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: renamed from: X.0yd7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864910yd7 implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C1864910yd7 c1864910yd7, C09AJ c09aj) {
        C207245167v c207245167v = (C207245167v) c1864910yd7.l0;
        C1812120xFy c1812120xFy = (C1812120xFy) c1864910yd7.l1;
        C1812150xG1 c1812150xG1 = (C1812150xG1) c1864910yd7.l2;
        c207245167v.getClass();
        C1C7U.LIZ("UserCenter@ffac.handleUnFollow$1L");
        c207245167v.LIZLLL.unFollowWithConfirm(c1812120xFy.LIZJ, c1812120xFy.LIZIZ, c1812120xFy.LIZ, new C1812160xG2(c1812150xG1, c1812120xFy, c207245167v, (C19482611Ke) c09aj));
        C1C7U.LIZIZ("UserCenter@ffac.handleUnFollow$1L");
    }

    public static final void subscribe$1(C1864910yd7 c1864910yd7, C09AJ c09aj) {
        C1C7U.LIZ("LowerCostPendant@671.loadImageViewResourceOb$observable$1");
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ((UrlModel) c1864910yd7.l0));
        ((AbstractC1912190zrN) c1864910yd7.l1).LJII(c1331670kl3LJIIIIZZ);
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) c1864910yd7.l2);
        c1331670kl3LJIIIIZZ.LIZLLL("NewPendant");
        c1331670kl3LJIIIIZZ.LJIIJ(new C1864440ycM((C19482611Ke) c09aj, 2));
        C1C7U.LIZIZ("LowerCostPendant@671.loadImageViewResourceOb$observable$1");
    }

    public C1864910yd7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

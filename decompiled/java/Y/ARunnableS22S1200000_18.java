package Y;

import X.C0COU;
import X.C1165940gRk;
import X.C1176580giu;
import X.C1176900gjQ;
import X.C118300cf;
import X.C1184350gvR;
import X.C1188640h2M;
import X.C197039127h;
import X.C1C7U;
import X.InterfaceC1177250gjz;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailMapAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS7S3100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS22S1200000_18 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Boolean bool;
        TuxIconView tuxIconView;
        Object obj = this.l1;
        if (obj != null) {
            String str = this.s0;
            MixVideosDialog mixVideosDialog = (MixVideosDialog) this.l2;
            if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
                return;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (Intrinsics.LJFF(str, mixVideosDialog.LLJJJJLIIL)) {
                boolean zLIZ = C0COU.LIZ();
                int i = R.raw.icon_bookmark_fill;
                if (!zLIZ) {
                    View viewLJII = mixVideosDialog.SR().LJII("favorite_icon");
                    if (!(viewLJII instanceof TuxIconView) || (tuxIconView = (TuxIconView) viewLJII) == null) {
                        return;
                    }
                    if (!zBooleanValue) {
                        i = R.raw.icon_bookmark;
                    }
                    tuxIconView.setIconRes(i);
                    return;
                }
                C197039127h c197039127hRR = mixVideosDialog.RR();
                if (c197039127hRR != null) {
                    if (zBooleanValue) {
                        c197039127hRR.setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark_fill));
                        c197039127hRR.setText(2131824972);
                    } else {
                        c197039127hRR.setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark));
                        c197039127hRR.setText(2131824971);
                    }
                }
            }
        }
    }

    public static final void run$0(ARunnableS22S1200000_18 aRunnableS22S1200000_18) {
        boolean zLIZ;
        C1176580giu c1176580giu;
        C1165940gRk c1165940gRkLJJIJIIJIL;
        C1C7U.LIZ("PoiMapDetailMapAssem@dde8.handleHighLightMarker$1");
        try {
            InterfaceC1177250gjz interfaceC1177250gjz = ((PoiMapDetailMapAssem) aRunnableS22S1200000_18.l1).LLJILJILJ;
            Float fValueOf = null;
            if (interfaceC1177250gjz != null && (c1165940gRkLJJIJIIJIL = interfaceC1177250gjz.LJJIJIIJIL()) != null) {
                c1176580giu = c1165940gRkLJJIJIIJIL.bounds;
            } else {
                c1176580giu = null;
            }
            InterfaceC1177250gjz interfaceC1177250gjz2 = ((PoiMapDetailMapAssem) aRunnableS22S1200000_18.l1).LLJILJILJ;
            if (interfaceC1177250gjz2 != null) {
                fValueOf = Float.valueOf(interfaceC1177250gjz2.LJIJJ());
            }
            PoiMapDetailMapAssem poiMapDetailMapAssem = (PoiMapDetailMapAssem) aRunnableS22S1200000_18.l1;
            C1176900gjQ c1176900gjQ = poiMapDetailMapAssem.LLJJJ;
            if (c1176900gjQ != null) {
                c1176900gjQ.LJIIL(aRunnableS22S1200000_18.s0, poiMapDetailMapAssem.Vo((List) aRunnableS22S1200000_18.l2, c1176580giu, fValueOf));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMapDetailMapAssem@dde8.handleHighLightMarker$1");
    }

    public static final void run$1(ARunnableS22S1200000_18 aRunnableS22S1200000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiMapDetailMapAssem@dde8.updateMarkerList$1$1");
        try {
            ((PoiMapDetailMapAssem) aRunnableS22S1200000_18.l1).cp(aRunnableS22S1200000_18.s0, (List) aRunnableS22S1200000_18.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMapDetailMapAssem@dde8.updateMarkerList$1$1");
    }

    public static final void run$2(ARunnableS22S1200000_18 aRunnableS22S1200000_18) {
        boolean zLIZ;
        C1C7U.LIZ("MixVideosDialog@fefc.motaCacheSubscriber$1");
        try {
            aRunnableS22S1200000_18.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixVideosDialog@fefc.motaCacheSubscriber$1");
    }

    public static final void run$3(ARunnableS22S1200000_18 aRunnableS22S1200000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiCollectStatusBaseActivityAssem@9a90.onViewCreated$3$2$onResultOK$1");
        try {
            ((PoiCollectStatusBaseActivityAssem) aRunnableS22S1200000_18.l1).Gp(aRunnableS22S1200000_18.s0);
            PoiCollectStatusBaseActivityAssem poiCollectStatusBaseActivityAssem = (PoiCollectStatusBaseActivityAssem) aRunnableS22S1200000_18.l1;
            String str = aRunnableS22S1200000_18.s0;
            C1188640h2M c1188640h2M = (C1188640h2M) aRunnableS22S1200000_18.l2;
            poiCollectStatusBaseActivityAssem.Bp().vQ2(str, new AwS7S3100000_18(str, c1188640h2M.LIZIZ, c1188640h2M.LIZJ, poiCollectStatusBaseActivityAssem, 1), null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiCollectStatusBaseActivityAssem@9a90.onViewCreated$3$2$onResultOK$1");
    }

    public static final void run$4(ARunnableS22S1200000_18 aRunnableS22S1200000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiCollectStatusBaseAssem@e27a.onCollectContainerClick$2$onResultOK$1");
        try {
            ((PoiCollectStatusBaseAssem) aRunnableS22S1200000_18.l1).Ip(aRunnableS22S1200000_18.s0);
            PoiCollectStatusBaseAssem poiCollectStatusBaseAssem = (PoiCollectStatusBaseAssem) aRunnableS22S1200000_18.l1;
            String str = aRunnableS22S1200000_18.s0;
            C1184350gvR c1184350gvR = (C1184350gvR) aRunnableS22S1200000_18.l2;
            poiCollectStatusBaseAssem.Bp().vQ2(str, new AwS7S3100000_18(str, c1184350gvR.LIZIZ, c1184350gvR.LIZJ, poiCollectStatusBaseAssem, 2), null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiCollectStatusBaseAssem@e27a.onCollectContainerClick$2$onResultOK$1");
    }

    public static final void run$5(ARunnableS22S1200000_18 aRunnableS22S1200000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiDetailSlashFragment@9df6.scrollerToModule$2$1");
        try {
            ((PoiDetailSlashFragment) aRunnableS22S1200000_18.l1).K40(aRunnableS22S1200000_18.s0, ((C118300cf) aRunnableS22S1200000_18.l2).element);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiDetailSlashFragment@9df6.scrollerToModule$2$1");
    }

    public ARunnableS22S1200000_18(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}

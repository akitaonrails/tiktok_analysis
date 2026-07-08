package X;

import com.bytedance.hybrid.spark.raven.component.builtin.spark.SparkRavenUIAssem;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.poi.detail.lynx.PoiDetailLynxAssem;
import com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizAnswerCardAssem;
import com.ss.android.ugc.aweme.poi.search.assem.PoiSearchCreatorBannerAssem;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.LynxViewData;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity;
import com.ss.android.ugc.aweme.slash.component.lynx.icon.BaseLynxComponent;

/* JADX INFO: renamed from: X.0hZL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1209090hZL extends AbstractC1539010q9T {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
        switch (this.$t) {
            case 0:
                LJJJLL$0(this, interfaceC1531560pxS);
                break;
            case 1:
                LJJJLL$1(this, interfaceC1531560pxS);
                break;
            case 2:
                LJJJLL$2(this, interfaceC1531560pxS);
                break;
            case 3:
                LJJJLL$3(this, interfaceC1531560pxS);
                break;
            case 4:
                LJJJLL$4(this, interfaceC1531560pxS);
                break;
            case 5:
                LJJJLL$5(this, interfaceC1531560pxS);
                break;
            case 6:
                LJJJLL$6(this, interfaceC1531560pxS);
                break;
            case 7:
                LJJJLL$7(this, interfaceC1531560pxS);
                break;
            case 8:
                LJJJLL$8(this, interfaceC1531560pxS);
                break;
            default:
                super.LJJJLL(interfaceC1531560pxS);
                break;
        }
    }

    public C1209090hZL(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJJLL$0(C1209090hZL c1209090hZL, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIJJ = (TemplateData) c1209090hZL.l0;
        }
    }

    public static final void LJJJLL$1(C1209090hZL c1209090hZL, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if (interfaceC1531560pxS.getType() == EnumC1067640dtC.LYNX && (interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIIIIZZ(new C1208690hYh((PoiSearchCreatorBannerAssem) c1209090hZL.l0, 0));
        }
    }

    public static final void LJJJLL$2(C1209090hZL c1209090hZL, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if (interfaceC1531560pxS.getType() == EnumC1067640dtC.LYNX && (interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIIIIZZ(new C1208690hYh((BaseLynxComponent) c1209090hZL.l0, 1));
        }
    }

    public static final void LJJJLL$3(C1209090hZL c1209090hZL, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if (interfaceC1531560pxS.getType() == EnumC1067640dtC.LYNX && (interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIIIIZZ(new C1208690hYh((SparkRavenUIAssem) c1209090hZL.l0, 2));
        }
    }

    public static final void LJJJLL$4(C1209090hZL c1209090hZL, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        String str = null;
        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            LynxViewData lynxViewData = (LynxViewData) ((PoiGalleryActivity) c1209090hZL.l0).LLJL.getValue();
            if (lynxViewData != null) {
                str = lynxViewData.businessData;
            }
            c1537910q7h.LJIJJ = TemplateData.LJIIIIZZ(str);
        }
    }

    public static final void LJJJLL$5(C1209090hZL c1209090hZL, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if (interfaceC1531560pxS.getType() == EnumC1067640dtC.LYNX && (interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIIIIZZ(new C1208690hYh((PoiQuizAnswerCardAssem) c1209090hZL.l0, 3));
        }
    }

    public static final void LJJJLL$6(C1209090hZL c1209090hZL, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if (interfaceC1531560pxS.getType() == EnumC1067640dtC.LYNX && (interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIIIIZZ(new C1208690hYh((PoiDetailLynxAssem) c1209090hZL.l0, 4));
        }
    }

    public static final void LJJJLL$7(C1209090hZL c1209090hZL, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if (interfaceC1531560pxS.getType() == EnumC1067640dtC.LYNX && (interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIIIIZZ(new C1208690hYh((C1187730h0t) c1209090hZL.l0, 6));
        }
    }

    public static final void LJJJLL$8(C1209090hZL c1209090hZL, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if (interfaceC1531560pxS.getType() == EnumC1067640dtC.LYNX && (interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIIIIZZ(new C1208690hYh((C1189570h3r) c1209090hZL.l0, 7));
        }
    }
}

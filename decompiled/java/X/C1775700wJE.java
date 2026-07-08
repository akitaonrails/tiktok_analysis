package X;

import android.view.TextureView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselPageViewerAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselVideoReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.IPdpImagePreloadService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS38S0001000_26;

/* JADX INFO: renamed from: X.0wJE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775700wJE extends AbstractC712240Rwk {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$1(C1775700wJE c1775700wJE, int i) {
    }

    public static final void onPageScrollStateChanged$2(C1775700wJE c1775700wJE, int i) {
    }

    public static final void onPageScrolled$0(C1775700wJE c1775700wJE, int i, float f, int i2) {
    }

    public static final void onPageScrolled$2(C1775700wJE c1775700wJE, int i, float f, int i2) {
    }

    public static final void onPageSelected$3(C1775700wJE c1775700wJE, int i) {
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
            case 2:
            default:
                super.onPageScrollStateChanged(i);
                break;
            case 3:
                onPageScrollStateChanged$1(this, i);
                break;
            case 4:
                onPageScrollStateChanged$2(this, i);
                break;
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
            case 2:
            default:
                super.onPageScrolled(i, f, i2);
                break;
            case 3:
                onPageScrolled$1(this, i, f, i2);
                break;
            case 4:
                onPageScrolled$2(this, i, f, i2);
                break;
            case 5:
                onPageScrolled$3(this, i, f, i2);
                break;
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
            case 3:
                onPageSelected$3(this, i);
                break;
            case 4:
                onPageSelected$4(this, i);
                break;
            default:
                super.onPageSelected(i);
                break;
        }
    }

    public C1775700wJE(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(C1775700wJE c1775700wJE, int i) {
        if (i == 1) {
            ((PdpCarouselPageViewerAssem) c1775700wJE.l0).LLLFF = false;
        }
    }

    public static final void onPageSelected$0(C1775700wJE c1775700wJE, int i) {
        String str;
        Object obj;
        String str2;
        String uri;
        String str3;
        Object obj2;
        Object obj3;
        PdpCarouselPageViewerAssem pdpCarouselPageViewerAssem = (PdpCarouselPageViewerAssem) c1775700wJE.l0;
        if (pdpCarouselPageViewerAssem.LLLFF) {
            return;
        }
        PdpCarouselViewModel pdpCarouselViewModelZp = pdpCarouselPageViewerAssem.zp();
        pdpCarouselViewModelZp.getClass();
        pdpCarouselViewModelZp.setState(new AwS38S0001000_26(i, 14));
        CarouselElement carouselElement = (CarouselElement) C13LP.LJJJLZIJ(i, ((C1762010vx9) C631370Opb.LIZ((PdpCarouselPageViewerAssem) c1775700wJE.l0)).LL);
        if (carouselElement != null) {
            PdpCarouselPageViewerAssem pdpCarouselPageViewerAssem2 = (PdpCarouselPageViewerAssem) c1775700wJE.l0;
            IPdpImagePreloadService iPdpImagePreloadService = (IPdpImagePreloadService) pdpCarouselPageViewerAssem2.LLJLIL.getValue();
            if (iPdpImagePreloadService != null) {
                C054G c054g = pdpCarouselPageViewerAssem2.tp().lX().LLLZL;
                String str4 = carouselElement.elementId;
                if (str4 == null) {
                    str4 = "";
                }
                C724270Sb3 c724270Sb3 = pdpCarouselPageViewerAssem2.LLJI;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                } else {
                    obj3 = null;
                }
                iPdpImagePreloadService.LIZ(c054g, new C1406860miK(str4, ((C1762010vx9) obj3).LL));
            }
        }
        PdpCarouselPageViewerAssem pdpCarouselPageViewerAssem3 = (PdpCarouselPageViewerAssem) c1775700wJE.l0;
        pdpCarouselPageViewerAssem3.LLJLLL = i;
        pdpCarouselPageViewerAssem3.Ap().LLLILZLLLI = Integer.valueOf(i);
        ((PdpCarouselPageViewerAssem) c1775700wJE.l0).Bp(i);
        PdpCarouselPageViewerAssem pdpCarouselPageViewerAssem4 = (PdpCarouselPageViewerAssem) c1775700wJE.l0;
        InterfaceC1763030vyn interfaceC1763030vyn = pdpCarouselPageViewerAssem4.LLLIZZ;
        if (interfaceC1763030vyn == null) {
            synchronized (pdpCarouselPageViewerAssem4) {
                interfaceC1763030vyn = pdpCarouselPageViewerAssem4.LLLIZZ;
                if (interfaceC1763030vyn == null) {
                    C0QSJ c0qsjOp = pdpCarouselPageViewerAssem4.op();
                    if (c0qsjOp != null) {
                        interfaceC1763030vyn = (InterfaceC1763030vyn) c0qsjOp.getAbility(InterfaceC1763030vyn.class);
                    } else {
                        interfaceC1763030vyn = null;
                    }
                    pdpCarouselPageViewerAssem4.LLLIZZ = interfaceC1763030vyn;
                }
            }
        }
        boolean z = false;
        if (interfaceC1763030vyn != null && interfaceC1763030vyn.D9()) {
            str = "viewer";
        } else {
            str = "main";
        }
        C724270Sb3 c724270Sb32 = pdpCarouselPageViewerAssem4.LLJI;
        if (c724270Sb32 != null) {
            obj = c724270Sb32.LL;
        } else {
            obj = null;
        }
        CarouselElement carouselElement2 = (CarouselElement) C13LP.LJJJLZIJ(i, ((C1762010vx9) obj).LL);
        if (carouselElement2 != null) {
            CarouselWidget carouselWidgetUp = pdpCarouselPageViewerAssem4.up(i);
            if (carouselWidgetUp != null) {
                str2 = carouselWidgetUp.daInfo;
            } else {
                str2 = null;
            }
            C1054004Ag c1054004Ag = pdpCarouselPageViewerAssem4.Ap().LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                boolean z2 = pdpCarouselPageViewerAssem4.Ap().LLJIJIL;
                Image image = carouselElement2.image;
                if (image == null || (uri = image.getUri()) == null) {
                    uri = "";
                }
                Integer num = carouselElement2.elementType;
                int value = C0HAU.VIDEO.getValue();
                if (num != null && num.intValue() == value) {
                    z = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                Video video = carouselElement2.video;
                if (video != null) {
                    str3 = video.id;
                } else {
                    str3 = null;
                }
                C724270Sb3 c724270Sb33 = pdpCarouselPageViewerAssem4.LLJI;
                if (c724270Sb33 != null) {
                    obj2 = c724270Sb33.LL;
                } else {
                    obj2 = null;
                }
                C1054004Ag.LJJII(c1054004Ag, str, z2, uri, null, boolValueOf, str3, "head_pic", String.valueOf(((C1762010vx9) obj2).LL.size()), pdpCarouselPageViewerAssem4.Ap().iH1(null), carouselElement2.daInfo, str2, 24);
            }
        }
        ((PdpCarouselPageViewerAssem) c1775700wJE.l0).Ap().KR2();
        Image image2 = (Image) C13LP.LJJJLZIJ(i, ((C1762010vx9) C631370Opb.LIZ((PdpCarouselPageViewerAssem) c1775700wJE.l0)).LLILLJJLI);
        if (image2 == null) {
            return;
        }
        ((PdpCarouselPageViewerAssem) c1775700wJE.l0).Ap().LLLILZ = image2;
        C1765290w2R c1765290w2R = ((PdpCarouselPageViewerAssem) c1775700wJE.l0).Ap().KR2().LIZ;
        image2.getUri();
        c1765290w2R.getClass();
    }

    public static final void onPageSelected$1(C1775700wJE c1775700wJE, int i) {
        TextureView videoView;
        if (((C1761890vwx) C631370Opb.LIZ((PdpCarouselVideoReusedAssem) c1775700wJE.l0)).LLILLJJLI == i) {
            C1765580w2u c1765580w2u = ((PdpCarouselVideoReusedAssem) c1775700wJE.l0).LLJJLIIIJLLLLLLLZ;
            if (c1765580w2u != null && (videoView = c1765580w2u.getVideoView()) != null) {
                C786410Ut5.LLIIIILZ(videoView, 0);
            }
            ((PdpCarouselVideoReusedAssem) c1775700wJE.l0).Bp().LIZJ((PdpCarouselVideoReusedAssem) c1775700wJE.l0);
            TextureView textureView = ((PdpCarouselVideoReusedAssem) c1775700wJE.l0).LLJL;
            if (textureView != null && textureView.isAvailable()) {
                ((PdpCarouselVideoReusedAssem) c1775700wJE.l0).op();
                return;
            }
            return;
        }
        ((PdpCarouselVideoReusedAssem) c1775700wJE.l0).Bp().LJIIIZ((PdpCarouselVideoReusedAssem) c1775700wJE.l0);
        if (((PdpCarouselVideoReusedAssem) c1775700wJE.l0).Bp().LJIILLIIL == EnumC1508950pMz.PLAYER_START) {
            ((PdpCarouselVideoReusedAssem) c1775700wJE.l0).Fp();
            ((PdpCarouselVideoReusedAssem) c1775700wJE.l0).Ap().OM2(EnumC1508600pMQ.HEADER_VIDEO, false);
        }
        C1765580w2u c1765580w2u2 = ((PdpCarouselVideoReusedAssem) c1775700wJE.l0).LLJJLIIIJLLLLLLLZ;
        if (c1765580w2u2 == null) {
            return;
        }
        c1765580w2u2.LIZJ();
    }

    public static final void onPageSelected$2(C1775700wJE c1775700wJE, int i) {
        C421980Gge c421980Gge = ((C1735500vGO) c1775700wJE.l0).LLILLJJLI;
        if (c421980Gge != null) {
            c421980Gge.setSelectedIndex(i);
        }
        Function1<? super Integer, Unit> function1 = ((C1735500vGO) c1775700wJE.l0).LLJI;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$4(X.C1775700wJE r6, int r7) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1775700wJE.onPageSelected$4(X.0wJE, int):void");
    }

    public static final void onPageScrolled$1(C1775700wJE c1775700wJE, int i, float f, int i2) {
        List<ECBillboard> currentBillboards;
        if (f == 0.0f && i2 == 0 && (currentBillboards = ((C1733010vCN) c1775700wJE.l0).getCurrentBillboards()) != null) {
            C1733010vCN c1733010vCN = (C1733010vCN) c1775700wJE.l0;
            ECBillboard eCBillboard = (ECBillboard) C13LP.LJJJLZIJ(i, currentBillboards);
            c1733010vCN.LLILLJJLI.LJIJJLI(c1733010vCN.getCurrentDaInfo(), eCBillboard);
            Boolean bool = c1733010vCN.LLJJIJI;
            if (bool != null) {
                c1733010vCN.LLILLJJLI.LJIJJ(currentBillboards, c1733010vCN.getCurrentDaInfo(), bool.booleanValue(), eCBillboard);
            }
        }
    }

    public static final void onPageScrolled$3(C1775700wJE c1775700wJE, int i, float f, int i2) {
        int i3;
        C1773130wF5 c1773130wF5;
        C1773450wFb c1773450wFb = (C1773450wFb) c1775700wJE.l0;
        C1773710wG1 c1773710wG1 = (C1773710wG1) c1773450wFb.LLILLL;
        if (c1773710wG1 == null) {
            return;
        }
        int i4 = c1773710wG1.LJJIFFI;
        if (i == i4) {
            i3 = i + 1;
        } else {
            i3 = i;
        }
        RecyclerView recyclerViewV6 = c1773450wFb.v6();
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = null;
        if (recyclerViewV6 != null) {
            viewHolderFindViewHolderForAdapterPosition = recyclerViewV6.findViewHolderForAdapterPosition(i3);
        }
        if ((viewHolderFindViewHolderForAdapterPosition instanceof C1773130wF5) && (c1773130wF5 = (C1773130wF5) viewHolderFindViewHolderForAdapterPosition) != null) {
            c1773130wF5.T5();
        }
        if (f == 0.0f && i2 == 0 && i4 != i) {
            ((C1773450wFb) c1775700wJE.l0).w6(i);
        }
    }
}

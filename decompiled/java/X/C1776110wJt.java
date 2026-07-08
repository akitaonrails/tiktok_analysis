package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.header.SeaPdpHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776110wJt implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(C1776110wJt c1776110wJt, int i) {
    }

    public static final void onPageScrollStateChanged$1(C1776110wJt c1776110wJt, int i) {
    }

    public static final void onPageScrolled$0(C1776110wJt c1776110wJt, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C1776110wJt c1776110wJt, int i, float f, int i2) {
    }

    public static final void onPageScrolled$2(C1776110wJt c1776110wJt, int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
            case 2:
                onPageScrollStateChanged$2(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
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
        }
    }

    public C1776110wJt(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$2(C1776110wJt c1776110wJt, int i) {
        ShopMallMixFragment shopMallMixFragment = (ShopMallMixFragment) c1776110wJt.l0;
        if (shopMallMixFragment.LLJJIJI) {
            Iterator it2 = ((ArrayList) shopMallMixFragment.LLJJ.LL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1768080w6w) it2.next()).LJ(i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onPageSelected$0(C1776110wJt c1776110wJt, int i) {
        String str;
        String str2;
        boolean z;
        int size;
        String str3;
        Video video;
        C04DA c04da;
        C1764030w0P c1764030w0P;
        C1764030w0P c1764030w0P2;
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ;
        SeaPdpHeadViewHolder seaPdpHeadViewHolder = (SeaPdpHeadViewHolder) c1776110wJt.l0;
        if (i > seaPdpHeadViewHolder.LLJLILLLLZIIL) {
            str = "left";
        } else {
            str = "right";
        }
        if (seaPdpHeadViewHolder.w6().LLJJIII) {
            str2 = "viewer";
        } else {
            str2 = "main";
        }
        Boolean bool = ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLJZIJLIL;
        Boolean bool2 = Boolean.TRUE;
        boolean z2 = false;
        if (Intrinsics.LJFF(bool, bool2) && Intrinsics.LJFF(((SeaPdpHeadViewHolder) c1776110wJt.l0).LLJLLIL, bool2) && i == ((C1762030vxB) ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLILLJJLI).LLILZLL.size()) {
            ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLJJLIIIJLLLLLLLZ.setMoreVisible(true);
            C1054104Ah c1054104Ah = ((SeaPdpHeadViewHolder) c1776110wJt.l0).w6().LLJLIL;
            if (c1054104Ah != null && (interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ()) != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C1747960vaU(), AFwS268S0000000_26.get$arr$(537));
            }
            C1054104Ah c1054104Ah2 = ((SeaPdpHeadViewHolder) c1776110wJt.l0).w6().LLJLIL;
            if (c1054104Ah2 != null) {
                C1054104Ah.LJJIIJZLJL(c1054104Ah2, str2, ((SeaPdpHeadViewHolder) c1776110wJt.l0).w6().LLIZLLLIL, "", "similar_items_page", str, null, null, 96);
            }
        } else {
            ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLJJLIIIJLLLLLLLZ.setMoreVisible(false);
        }
        if (((SeaPdpHeadViewHolder) c1776110wJt.l0).q6() > 0) {
            if (i != ((SeaPdpHeadViewHolder) c1776110wJt.l0).u6()) {
                if (((SeaPdpHeadViewHolder) c1776110wJt.l0).v6().LJI()) {
                    ((SeaPdpHeadViewHolder) c1776110wJt.l0).v6().pause();
                }
                C786410Ut5.LJLLLLLL(8, ((SeaPdpHeadViewHolder) c1776110wJt.l0).i6());
                if (((SeaPdpHeadViewHolder) c1776110wJt.l0).LLLIIIL && ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLLIIL) {
                    SeaPdpHeadViewHolder seaPdpHeadViewHolder2 = (SeaPdpHeadViewHolder) c1776110wJt.l0;
                    if (seaPdpHeadViewHolder2.LLJLILLLLZIIL == seaPdpHeadViewHolder2.u6() && ((SeaPdpHeadViewHolder) c1776110wJt.l0).v6().LJIILLIIL == EnumC1508950pMz.PLAYER_PAUSE && ((SeaPdpHeadViewHolder) c1776110wJt.l0).v6().LJIJ && (c1764030w0P2 = ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLLIIII) != null) {
                        c1764030w0P2.LIZLLL();
                    }
                }
            } else {
                EnumC1508950pMz enumC1508950pMz = ((SeaPdpHeadViewHolder) c1776110wJt.l0).v6().LJIILLIIL;
                EnumC1508950pMz enumC1508950pMz2 = EnumC1508950pMz.PLAYER_PAUSE;
                if (enumC1508950pMz == enumC1508950pMz2 && !((SeaPdpHeadViewHolder) c1776110wJt.l0).v6().LJIJ) {
                    ((SeaPdpHeadViewHolder) c1776110wJt.l0).v6().resume();
                    C786410Ut5.LJLLLLLL(0, ((SeaPdpHeadViewHolder) c1776110wJt.l0).i6());
                }
                if (((SeaPdpHeadViewHolder) c1776110wJt.l0).v6().LJIILLIIL == enumC1508950pMz2 && ((SeaPdpHeadViewHolder) c1776110wJt.l0).v6().LJIJ && (c1764030w0P = ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLLIIII) != null) {
                    C1764030w0P.LJ(c1764030w0P, true, false, 2);
                }
            }
        }
        MediaItem mediaItem = (MediaItem) C13LP.LJJJLZIJ(i, ((C1762030vxB) ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLILLJJLI).LLILZLL);
        if (mediaItem != null) {
            SeaPdpHeadViewHolder seaPdpHeadViewHolder3 = (SeaPdpHeadViewHolder) c1776110wJt.l0;
            seaPdpHeadViewHolder3.z6(mediaItem, i);
            if (mediaItem.type != 3) {
                seaPdpHeadViewHolder3.w6().tR2(seaPdpHeadViewHolder3.f6(), ((C1762030vxB) seaPdpHeadViewHolder3.LLILLJJLI).LL, i);
            }
        }
        Image image = (Image) C13LP.LJJJLZIJ(i, ((C1762030vxB) ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLILLJJLI).LL);
        if (image == null) {
            return;
        }
        ((SeaPdpHeadViewHolder) c1776110wJt.l0).w6().LLLILZJ = image;
        SeaPdpHeadViewHolder seaPdpHeadViewHolder4 = (SeaPdpHeadViewHolder) c1776110wJt.l0;
        seaPdpHeadViewHolder4.LLJLILLLLZIIL = i;
        if (i < seaPdpHeadViewHolder4.LLJZ) {
            z = true;
        } else {
            z = false;
        }
        C786410Ut5.LJLLLLLL(8, seaPdpHeadViewHolder4.LLJL);
        if (z) {
            size = -1;
        } else {
            C1762030vxB c1762030vxB = (C1762030vxB) ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLILLJJLI;
            size = (((C1762030vxB) ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLILLJJLI).LLILLL ? 1 : 0) + ((c1762030vxB.LLILLJJLI + i) - c1762030vxB.LL.size());
        }
        SeaPdpHeadViewHolder seaPdpHeadViewHolder5 = (SeaPdpHeadViewHolder) c1776110wJt.l0;
        if (seaPdpHeadViewHolder5.LLJLLL != size) {
            if (z) {
                c04da = C04DA.PRODUCT;
            } else {
                c04da = C04DA.SKU;
            }
            seaPdpHeadViewHolder5.w6().LLLILZ.hR2(new ImageSelectData(image, C04DB.HEAD_PAGER, c04da, size));
            ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLJLLL = size;
        }
        C1054104Ah c1054104Ah3 = ((SeaPdpHeadViewHolder) c1776110wJt.l0).w6().LLJLIL;
        if (c1054104Ah3 != null) {
            String uri = image.getUri();
            if (uri == null) {
                c1054104Ah3.LJIL = 0;
            } else {
                c1054104Ah3.LJIL = 1;
                c1054104Ah3.LJI.add(uri);
            }
        }
        ((SeaPdpHeadViewHolder) c1776110wJt.l0).w6().AR2("picture");
        C1054104Ah c1054104Ah4 = ((SeaPdpHeadViewHolder) c1776110wJt.l0).w6().LLJLIL;
        if (c1054104Ah4 != null) {
            boolean z3 = ((SeaPdpHeadViewHolder) c1776110wJt.l0).w6().LLIZLLLIL;
            String uri2 = image.getUri();
            if (uri2 == null) {
                uri2 = "";
            }
            if (i == ((SeaPdpHeadViewHolder) c1776110wJt.l0).u6()) {
                z2 = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            MediaItem mediaItem2 = (MediaItem) C13LP.LJJJLZIJ(i, ((C1762030vxB) ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLILLJJLI).LLILZLL);
            if (mediaItem2 != null && (video = mediaItem2.video) != null) {
                str3 = video.id;
            } else {
                str3 = null;
            }
            C1054104Ah.LJJIIJZLJL(c1054104Ah4, str2, z3, uri2, str, null, boolValueOf, str3, 16);
        }
        C1762780vyO c1762780vyO = ((SeaPdpHeadViewHolder) c1776110wJt.l0).LLLFFI;
        if (c1762780vyO != null && c1762780vyO.LIZ()) {
            c1762780vyO.LIZJ.setTabPosition(i);
        }
    }

    public static final void onPageSelected$1(C1776110wJt c1776110wJt, int i) {
        C1066100dqi c1066100dqi = (C1066100dqi) ((LinkedHashMap) ((C1762410vxn) c1776110wJt.l0).LLJZ).get(Integer.valueOf(i));
        if (c1066100dqi != null) {
            c1066100dqi.LJIIL = SystemClock.uptimeMillis();
        }
    }

    public static final void onPageSelected$2(C1776110wJt c1776110wJt, int i) {
        ShopMallMixFragment shopMallMixFragment = (ShopMallMixFragment) c1776110wJt.l0;
        if (shopMallMixFragment.LLJJIJI) {
            Iterator it2 = ((ArrayList) shopMallMixFragment.LLJJ.LL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1768080w6w) it2.next()).LIZJ();
            }
        }
    }
}

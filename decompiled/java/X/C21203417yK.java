package X;

import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17yK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21203417yK extends AbstractC21197217xK implements InterfaceC21204817yY {
    public final Context LLJJJ;

    @Override // X.InterfaceC21181817uq, X.InterfaceC21204817yY
    public final void LIZIZ(int i) {
    }

    @Override // X.InterfaceC212166181c
    public final void LIZLLL(Map<String, String> map) {
    }

    @Override // X.InterfaceC212166181c
    public final void LJII(int i) {
    }

    @Override // X.InterfaceC212166181c
    public final void LJIIIZ(int i) {
    }

    @Override // X.InterfaceC212166181c
    public final void LJIILIIL(Map<String, String> map) {
    }

    @Override // X.InterfaceC212166181c
    public final void LJIILJJIL(Product product) {
    }

    @Override // X.AbstractC21198517xX
    public final Animation LJJIFFI() {
        return null;
    }

    @Override // X.AbstractC21197217xK
    public final boolean LJJJ() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // X.InterfaceC212166181c
    public final void LJ() {
        UsPopupCardVO usPopupCardVO = this.LL;
        String string = usPopupCardVO != null ? Long.valueOf(usPopupCardVO.productId).toString() : null;
        C1743900vTw c1743900vTw = this.LLIZLLLIL;
        String strLIZJ = c1743900vTw != null ? c1743900vTw.LIZJ("room_id") : null;
        C1743900vTw c1743900vTw2 = this.LLIZLLLIL;
        String strLIZJ2 = c1743900vTw2 != null ? c1743900vTw2.LIZJ("live_role") : null;
        C1743900vTw c1743900vTw3 = this.LLIZLLLIL;
        String strLIZJ3 = c1743900vTw3 != null ? c1743900vTw3.LIZJ("author_id") : null;
        UsPopupCardVO usPopupCardVO2 = this.LL;
        boolean zIsFromMessage = usPopupCardVO2 != null ? usPopupCardVO2.isFromMessage() : false;
        C1743900vTw c1743900vTw4 = this.LLIZLLLIL;
        boolean zLIZLLL = c1743900vTw4 != null ? c1743900vTw4.LIZLLL("is_page_visible") : false;
        C1743900vTw c1743900vTw5 = this.LLIZLLLIL;
        boolean zLIZLLL2 = c1743900vTw5 != null ? c1743900vTw5.LIZLLL("has_permission") : false;
        C1743900vTw c1743900vTw6 = this.LLIZLLLIL;
        boolean zLIZLLL3 = c1743900vTw6 != null ? c1743900vTw6.LIZLLL("is_keyboard_showing") : false;
        UsPopupCardVO usPopupCardVO3 = this.LL;
        Integer numValueOf = usPopupCardVO3 != null ? Integer.valueOf(usPopupCardVO3.cardType) : null;
        C1743900vTw c1743900vTw7 = this.LLIZLLLIL;
        if (c1743900vTw7 != null) {
            c1743900vTw7.LIZJ("source_page_type");
        }
        if (C21194017wo.LIZIZ(this.LL)) {
            return;
        }
        UsPopupCardVO usPopupCardVO4 = this.LL;
        C21198317xV.LJIIJ(string, strLIZJ, usPopupCardVO4 != null ? usPopupCardVO4.fromMessageId : null, strLIZJ3, strLIZJ2);
        EnumC21192917wd enumC21192917wd = EnumC21192917wd.SHOW_TO_USER;
        if (strLIZJ2 == null) {
            strLIZJ2 = "";
        }
        C21192417wY.LJI(enumC21192917wd, strLIZJ2, strLIZJ, string, zLIZLLL, zLIZLLL3, zLIZLLL2, zIsFromMessage, numValueOf, null);
        C1743900vTw c1743900vTw8 = this.LLIZLLLIL;
        String strLIZJ4 = c1743900vTw8 != null ? c1743900vTw8.LIZJ("product_id") : null;
        C1743900vTw c1743900vTw9 = this.LLIZLLLIL;
        String strLIZJ5 = c1743900vTw9 != null ? c1743900vTw9.LIZJ("product_source") : null;
        C1743900vTw c1743900vTw10 = this.LLIZLLLIL;
        String strLIZJ6 = c1743900vTw10 != null ? c1743900vTw10.LIZJ("source_from") : null;
        C1743900vTw c1743900vTw11 = this.LLIZLLLIL;
        String strLIZJ7 = c1743900vTw11 != null ? c1743900vTw11.LIZJ("source") : null;
        C1743900vTw c1743900vTw12 = this.LLIZLLLIL;
        String strLIZJ8 = c1743900vTw12 != null ? c1743900vTw12.LIZJ("is_fans_price") : null;
        UsPopupCardVO usPopupCardVO5 = this.LL;
        C1744070vUD.LIZJ(strLIZJ3, Integer.valueOf((int) (usPopupCardVO5 != null ? Intrinsics.LJFF(usPopupCardVO5.assistantSwitch, Boolean.TRUE) : 0)), strLIZJ, strLIZJ4, strLIZJ5, strLIZJ6, strLIZJ7, strLIZJ8);
        Map mapLIZ = C1733940vDs.LIZ(numValueOf, null, strLIZJ, strLIZJ3, null, null, false);
        System.currentTimeMillis();
        C1421105hJ.LIZJ("livesdk_tiktokec_module_show", mapLIZ);
    }

    @Override // X.InterfaceC21181817uq, X.InterfaceC21204817yY
    public final void LJI() {
        InterfaceC21204817yY interfaceC21204817yY;
        T t = this.LLILZIL;
        if (!(t instanceof InterfaceC21204817yY) || (interfaceC21204817yY = (InterfaceC21204817yY) t) == null) {
            return;
        }
        interfaceC21204817yY.LJI();
    }

    @Override // X.InterfaceC21184217vE
    public final boolean LLLLLZ() {
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        if (abstractC21202917yF != null) {
            return abstractC21202917yF.LLLLLZ();
        }
        return false;
    }

    @Override // X.InterfaceC21184217vE
    public final List<String> getProductShowIds() {
        List<String> productShowIds;
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        return (abstractC21202917yF == null || (productShowIds = abstractC21202917yF.getProductShowIds()) == null) ? C13BV.INSTANCE : productShowIds;
    }

    @Override // X.AbstractC21198517xX
    public final Animation LJIL() {
        ScaleAnimation scaleAnimation = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).j6().getIconSlotLocation(this.LLJJJ, EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR) == null ? new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 1.0f) : new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 0, (r0.right + r0.left) / 2, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(new C19LR(this, 4));
        return animationSet;
    }

    @Override // X.AbstractC21198517xX
    public final Animation LJJ() {
        ScaleAnimation scaleAnimation = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).j6().getIconSlotLocation(this.LLJJJ, EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR) == null ? new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 1.0f) : new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, (r0.right + r0.left) / 2, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // X.InterfaceC21181817uq
    public final void LJFF(boolean z) {
        T t = this.LLILZIL;
        if (t != 0 && t.getParent() != null && t.isAttachedToWindow()) {
            this.LLJJIJIL.LJFF(z);
        }
    }

    @Override // X.InterfaceC212166181c
    public final void LJIIIIZZ(Map<String, String> map) {
        String strLIZJ;
        C1743900vTw c1743900vTw = this.LLIZLLLIL;
        if (c1743900vTw != null && (strLIZJ = c1743900vTw.LIZJ("live_role")) != null) {
            map = C2097608Jq.LJIILIIL(map, new Pair("live_role", strLIZJ));
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIL = C2097608Jq.LJIIL(this.LLJJI, map);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_label_show", mapLJIIL);
    }

    @Override // X.InterfaceC21181817uq
    public final void LJIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock) {
        this.LLJJIJIL.LJIIL(flashSaleAtmosphereStock);
    }

    @Override // X.InterfaceC21181817uq
    public final void LJIILL(FlashSaleAtmosphere flashSaleAtmosphere) {
        this.LLJJIJIL.LJIILL(flashSaleAtmosphere);
    }

    @Override // X.AbstractC21197217xK, X.AbstractC21198517xX
    public final void LJIJJLI(String str) {
        super.LJIJJLI(str);
        this.LLJJIJIL.LIZJ();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [DATA, X.17yf] */
    @Override // X.AbstractC21197217xK, X.AbstractC21198517xX
    public final void LJJIJ(boolean z) {
        T t;
        FlashSaleAtmosphere flashSaleAtmosphere;
        Integer numValueOf;
        FlashSaleAtmosphere flashSaleAtmosphere2;
        this.LLJJIJIL.LIZJ();
        UsPopupCardVO usPopupCardVO = this.LL;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock = null;
        if (usPopupCardVO != null) {
            C21203917yP c21203917yP = this.LLJJIJIL;
            ?? c21205517yf = new C21205517yf();
            c21205517yf.LIZJ = usPopupCardVO.createTime;
            c21205517yf.LIZLLL = usPopupCardVO.serverTime;
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = usPopupCardVO.flashSaleAtmosphereInfo;
            if (flashSaleAtmosphereInfo != null) {
                flashSaleAtmosphere2 = flashSaleAtmosphereInfo.flashSaleAtmosphere;
            } else {
                flashSaleAtmosphere2 = null;
            }
            c21205517yf.LIZ = flashSaleAtmosphere2;
            if (flashSaleAtmosphereInfo != null) {
                flashSaleAtmosphereStock = flashSaleAtmosphereInfo.flashSaleAtmosphereStock;
            }
            c21205517yf.LIZIZ = flashSaleAtmosphereStock;
            if (!c21203917yP.LLILZ) {
                c21203917yP.LLILZ = true;
                c21203917yP.LLILLL = c21205517yf;
            }
        }
        super.LJJIJ(z);
        if (z && (t = this.LLILZIL) != 0 && t.getParent() != null && t.isAttachedToWindow()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("onProductChanged refresh status");
            UsPopupCardVO usPopupCardVO2 = this.LL;
            if (usPopupCardVO2 != null) {
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2 = usPopupCardVO2.flashSaleAtmosphereInfo;
                if (flashSaleAtmosphereInfo2 != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo2.flashSaleAtmosphere) != null && (numValueOf = Integer.valueOf(flashSaleAtmosphere.status)) != null) {
                    if (numValueOf.intValue() == 2) {
                        this.LLJJIJIL.LIZ(1);
                        return;
                    } else if (numValueOf.intValue() == 3) {
                        this.LLJJIJIL.LIZ(2);
                        return;
                    }
                }
                this.LLJJIJIL.LIZ(-1);
            }
        }
    }

    @Override // X.InterfaceC21184217vE
    public final void LJIIJJI(GetMoreActionResp getMoreActionResp, Function0<Unit> function0) {
        String strLIZJ;
        String strLIZJ2;
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        if (abstractC21202917yF != null) {
            abstractC21202917yF.LJIIJJI(getMoreActionResp, function0);
        }
        C1743900vTw c1743900vTw = this.LLIZLLLIL;
        Integer numValueOf = null;
        if (c1743900vTw != null) {
            strLIZJ = c1743900vTw.LIZJ("room_id");
        } else {
            strLIZJ = null;
        }
        C1743900vTw c1743900vTw2 = this.LLIZLLLIL;
        if (c1743900vTw2 != null) {
            strLIZJ2 = c1743900vTw2.LIZJ("author_id");
        } else {
            strLIZJ2 = null;
        }
        UsPopupCardVO usPopupCardVO = this.LL;
        if (usPopupCardVO != null) {
            numValueOf = Integer.valueOf(usPopupCardVO.cardType);
        }
        Map mapLIZ = C1733940vDs.LIZ(numValueOf, getMoreActionResp.LIZIZ, strLIZJ, strLIZJ2, getMoreActionResp.LIZ, "smart_pin", true);
        System.currentTimeMillis();
        C1421105hJ.LIZJ("livesdk_tiktokec_module_show", mapLIZ);
    }

    @Override // X.InterfaceC21204817yY
    public final void LJJI(int i, long j) {
        InterfaceC21204817yY interfaceC21204817yY;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204817yY) && (interfaceC21204817yY = (InterfaceC21204817yY) t) != null) {
            interfaceC21204817yY.LJJI(i, j);
        }
    }

    @Override // X.InterfaceC21204817yY
    public final void LJJIIJ(int i, boolean z) {
        InterfaceC21204817yY interfaceC21204817yY;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204817yY) && (interfaceC21204817yY = (InterfaceC21204817yY) t) != null) {
            interfaceC21204817yY.LJJIIJ(i, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.09AY, kotlin.jvm.functions.Function1] */
    @Override // X.InterfaceC21204817yY
    public final void LJJJLZIJ(int i, Integer num) {
        ?? r0;
        InterfaceC21204817yY interfaceC21204817yY;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204817yY) && (interfaceC21204817yY = (InterfaceC21204817yY) t) != null) {
            interfaceC21204817yY.LJJJLZIJ(i, num);
        }
        if (i != 0) {
            if ((i != 1 && i != 2) || (r0 = this.LLJILJIL) == 0) {
                return;
            }
            r0.invoke();
            return;
        }
        ?? r1 = this.LLJILJILJ;
        if (r1 == 0) {
            return;
        }
        r1.invoke(Boolean.TRUE);
    }

    public C21203417yK(Context context, Map<String, String> map, C21194917wx c21194917wx) {
        super(map, c21194917wx);
        this.LLJJJ = context;
        this.LLJJIJIL.LIZLLL(new C21204717yX(this));
        this.LLJJIJIL.LIZLLL(new C21204517yV(this));
        this.LLJJIJIL.LIZLLL(new C21206317yn(this));
        this.LLJJIJIL.LIZLLL(new C21206117yl(this));
        C21181317ul c21181317ul = (C21181317ul) this.LLJJIJIIJIL.getValue();
        c21181317ul.LIZLLL(1, new C21212517zn(this), false);
        c21181317ul.LIZLLL(2, new C594090NRv(this), true);
    }

    @Override // X.InterfaceC212166181c
    public final void LIZ(String str, Product product, Integer num) {
        ((C21181317ul) this.LLJJIJIIJIL.getValue()).LIZ(str, product, num);
    }

    @Override // X.InterfaceC21204817yY
    public final void LJJJLIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock, boolean z, boolean z2) {
        InterfaceC21204817yY interfaceC21204817yY;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204817yY) && (interfaceC21204817yY = (InterfaceC21204817yY) t) != null) {
            interfaceC21204817yY.LJJJLIIL(flashSaleAtmosphereStock, z, z2);
        }
    }

    @Override // X.AbstractC21197217xK, X.InterfaceC21184217vE
    public final void u(UsPopupCardVO usPopupCardVO, String str, Map<String, ? extends Object> map) {
        if (C292450BdD.LIZ() || !this.LLJJIJIL.LJIIJ()) {
            this.LL = usPopupCardVO;
            super.u(usPopupCardVO, str, map);
        }
    }
}

package X;

import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.data.oec_msg.ProductItem;

/* JADX INFO: renamed from: X.17yN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21203717yN extends AbstractC21197117xJ implements InterfaceC21204917yZ {
    public final Context LLJJJJ;

    @Override // X.InterfaceC21181717up, X.InterfaceC21204917yZ
    public final void LIZIZ(int i) {
    }

    @Override // X.C181I
    public final void LIZLLL(Map<String, String> map) {
    }

    @Override // X.C181I
    public final void LJII(int i) {
    }

    @Override // X.C181I
    public final void LJIIIZ(int i) {
    }

    @Override // X.C181I
    public final void LJIILIIL(Map<String, String> map) {
    }

    @Override // X.C181I
    public final void LJIILJJIL(Product product) {
    }

    @Override // X.AbstractC21198617xY
    public final Animation LJJIIJZLJL() {
        return null;
    }

    @Override // X.AbstractC21197117xJ
    public final boolean LJJJ() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // X.AbstractC21197117xJ, X.C181I
    public final void LJ() {
        LiveVoucher liveVoucher;
        PopupCardVO popupCardVO = this.LL;
        String string = popupCardVO != null ? Long.valueOf(popupCardVO.productId).toString() : null;
        C1743900vTw c1743900vTw = this.LLIZLLLIL;
        String strLIZJ = c1743900vTw != null ? c1743900vTw.LIZJ("room_id") : null;
        C1743900vTw c1743900vTw2 = this.LLIZLLLIL;
        String strLIZJ2 = c1743900vTw2 != null ? c1743900vTw2.LIZJ("live_role") : null;
        C1743900vTw c1743900vTw3 = this.LLIZLLLIL;
        String strLIZJ3 = c1743900vTw3 != null ? c1743900vTw3.LIZJ("author_id") : null;
        PopupCardVO popupCardVO2 = this.LL;
        boolean zIsFromMessage = popupCardVO2 != null ? popupCardVO2.isFromMessage() : false;
        C1743900vTw c1743900vTw4 = this.LLIZLLLIL;
        boolean zLIZLLL = c1743900vTw4 != null ? c1743900vTw4.LIZLLL("is_page_visible") : false;
        C1743900vTw c1743900vTw5 = this.LLIZLLLIL;
        boolean zLIZLLL2 = c1743900vTw5 != null ? c1743900vTw5.LIZLLL("has_permission") : false;
        C1743900vTw c1743900vTw6 = this.LLIZLLLIL;
        boolean zLIZLLL3 = c1743900vTw6 != null ? c1743900vTw6.LIZLLL("is_keyboard_showing") : false;
        PopupCardVO popupCardVO3 = this.LL;
        Integer numValueOf = popupCardVO3 != null ? Integer.valueOf(popupCardVO3.cardType) : null;
        C1743900vTw c1743900vTw7 = this.LLIZLLLIL;
        String strLIZJ4 = c1743900vTw7 != null ? c1743900vTw7.LIZJ("source_page_type") : null;
        C21193917wn c21193917wn = C21193917wn.LIZ;
        PopupCardVO popupCardVO4 = this.LL;
        c21193917wn.getClass();
        if (((Boolean) C21193917wn.LIZJ(popupCardVO4).getFirst()).booleanValue()) {
            C21192717wb.LIZ(EnumC21193117wf.DID_SHOW, strLIZJ2 != null ? strLIZJ2 : "", strLIZJ, string, zLIZLLL, zLIZLLL3, zLIZLLL2, zIsFromMessage, numValueOf, null, null, null, 3584);
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 3) {
            PopupCardVO popupCardVO5 = this.LL;
            C21198417xW.LJIIIZ(string, strLIZJ, popupCardVO5 != null ? popupCardVO5.fromMessageId : null, strLIZJ3, strLIZJ2);
            Integer num = numValueOf;
            String str = strLIZJ;
            C21192717wb.LIZ(EnumC21193117wf.DID_SHOW, strLIZJ2 != null ? strLIZJ2 : "", strLIZJ, string, zLIZLLL, zLIZLLL3, zLIZLLL2, zIsFromMessage, numValueOf, null, null, null, 3584);
            C1743900vTw c1743900vTw8 = this.LLIZLLLIL;
            String strLIZJ5 = c1743900vTw8 != null ? c1743900vTw8.LIZJ("product_id") : null;
            C1743900vTw c1743900vTw9 = this.LLIZLLLIL;
            String strLIZJ6 = c1743900vTw9 != null ? c1743900vTw9.LIZJ("product_source") : null;
            C1743900vTw c1743900vTw10 = this.LLIZLLLIL;
            String strLIZJ7 = c1743900vTw10 != null ? c1743900vTw10.LIZJ("source_from") : null;
            C1743900vTw c1743900vTw11 = this.LLIZLLLIL;
            String strLIZJ8 = c1743900vTw11 != null ? c1743900vTw11.LIZJ("source") : null;
            C1743900vTw c1743900vTw12 = this.LLIZLLLIL;
            String strLIZJ9 = c1743900vTw12 != null ? c1743900vTw12.LIZJ("is_fans_price") : null;
            PopupCardVO popupCardVO6 = this.LL;
            C1744070vUD.LIZJ(strLIZJ3, Integer.valueOf((int) (popupCardVO6 != null ? Intrinsics.LJFF(popupCardVO6.assistantSwitch, Boolean.TRUE) : 0)), str, strLIZJ5, strLIZJ6, strLIZJ7, strLIZJ8, strLIZJ9);
            Map mapLIZ = C1733950vDt.LIZ(num, str, strLIZJ3, string);
            System.currentTimeMillis();
            C1421105hJ.LIZJ("livesdk_tiktokec_module_show", mapLIZ);
            return;
        }
        PopupCardVO popupCardVO7 = this.LL;
        Map<String, String> map = (popupCardVO7 == null || (liveVoucher = popupCardVO7.popVoucher) == null) ? null : liveVoucher.daInfo;
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            jSONObject.put("author_id", strLIZJ3);
            jSONObject.put("room_id", strLIZJ);
            if (strLIZJ4 == null) {
                strLIZJ4 = "live";
            }
            jSONObject.put("source_page_type", strLIZJ4);
            jSONObject.put("page_name", "live");
            jSONObject.put("module_name", "on_screen_live_coupon");
            jSONObject.put("user_type", "author");
            jSONObject.put("live_status", "during_live");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("livesdk_tiktokec_module_show", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC21181717up, X.InterfaceC21204917yZ
    public final void LJI() {
        InterfaceC21204917yZ interfaceC21204917yZ;
        T t = this.LLILZIL;
        if (!(t instanceof InterfaceC21204917yZ) || (interfaceC21204917yZ = (InterfaceC21204917yZ) t) == null) {
            return;
        }
        interfaceC21204917yZ.LJI();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // X.C181I
    public final void LJIL() {
        ?? r0 = this.LLJILJILJ;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    @Override // X.InterfaceC21184317vF
    public final void LLLLLLIL() {
        AbstractC21202217y8 abstractC21202217y8 = (AbstractC21202217y8) this.LLILZIL;
        if (abstractC21202217y8 != null) {
            abstractC21202217y8.LLLLLLIL();
        }
    }

    @Override // X.InterfaceC21184117vD
    public final List<String> getProductShowIds() {
        List<String> productShowIds;
        AbstractC21202217y8 abstractC21202217y8 = (AbstractC21202217y8) this.LLILZIL;
        return (abstractC21202217y8 == null || (productShowIds = abstractC21202217y8.getProductShowIds()) == null) ? C13BV.INSTANCE : productShowIds;
    }

    @Override // X.AbstractC21198617xY
    public final Animation LJJII() {
        ScaleAnimation scaleAnimation = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).j6().getIconSlotLocation(this.LLJJJJ, EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR) == null ? new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 1.0f) : new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 0, (r0.right + r0.left) / 2, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(new C19LR(this, 8));
        return animationSet;
    }

    @Override // X.AbstractC21198617xY
    public final Animation LJJIII() {
        ScaleAnimation scaleAnimation = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).j6().getIconSlotLocation(this.LLJJJJ, EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR) == null ? new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 1.0f) : new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, (r0.right + r0.left) / 2, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // X.InterfaceC21181717up
    public final void LJFF(boolean z) {
        T t = this.LLILZIL;
        if (t != 0 && t.getParent() != null && t.isAttachedToWindow()) {
            this.LLJJIJIL.LJFF(z);
        }
    }

    @Override // X.C181I
    public final void LJIIIIZZ(Map<String, String> map) {
        String strLIZJ;
        C1743900vTw c1743900vTw = this.LLIZLLLIL;
        if (c1743900vTw != null && (strLIZJ = c1743900vTw.LIZJ("live_role")) != null) {
            map = C2097608Jq.LJIILIIL(map, new Pair("live_role", strLIZJ));
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIL = C2097608Jq.LJIIL(this.LLJJIII, map);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_label_show", mapLJIIL);
    }

    @Override // X.InterfaceC21181717up
    public final void LJIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock) {
        this.LLJJIJIL.LJIIL(flashSaleAtmosphereStock);
    }

    @Override // X.InterfaceC21181717up
    public final void LJIILL(FlashSaleAtmosphere flashSaleAtmosphere) {
        this.LLJJIJIL.LJIILL(flashSaleAtmosphere);
    }

    @Override // X.AbstractC21197117xJ, X.AbstractC21198617xY
    public final void LJJIFFI(String str) {
        super.LJJIFFI(str);
        this.LLJJIJIL.LIZJ();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [DATA, X.17ye] */
    @Override // X.AbstractC21197117xJ, X.AbstractC21198617xY
    public final void LJJIJIIJIL(boolean z) {
        T t;
        FlashSaleAtmosphere flashSaleAtmosphere;
        Integer numValueOf;
        FlashSaleAtmosphere flashSaleAtmosphere2;
        this.LLJJIJIL.LIZJ();
        PopupCardVO popupCardVO = this.LL;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock = null;
        if (popupCardVO != null) {
            C21203817yO c21203817yO = this.LLJJIJIL;
            ?? c21205417ye = new C21205417ye();
            c21205417ye.LIZJ = popupCardVO.createTime;
            c21205417ye.LIZLLL = popupCardVO.serverTime;
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo;
            if (flashSaleAtmosphereInfo != null) {
                flashSaleAtmosphere2 = flashSaleAtmosphereInfo.flashSaleAtmosphere;
            } else {
                flashSaleAtmosphere2 = null;
            }
            c21205417ye.LIZ = flashSaleAtmosphere2;
            if (flashSaleAtmosphereInfo != null) {
                flashSaleAtmosphereStock = flashSaleAtmosphereInfo.flashSaleAtmosphereStock;
            }
            c21205417ye.LIZIZ = flashSaleAtmosphereStock;
            if (!c21203817yO.LLILZ) {
                c21203817yO.LLILZ = true;
                c21203817yO.LLILLL = c21205417ye;
            }
        }
        super.LJJIJIIJIL(z);
        if (z && (t = this.LLILZIL) != 0 && t.getParent() != null && t.isAttachedToWindow()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("onProductChanged refresh status");
            PopupCardVO popupCardVO2 = this.LL;
            if (popupCardVO2 != null) {
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2 = popupCardVO2.flashSaleAtmosphereInfo;
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

    @Override // X.InterfaceC21184317vF
    public final void LLLLLLJ(int i) {
        AbstractC21202217y8 abstractC21202217y8 = (AbstractC21202217y8) this.LLILZIL;
        if (abstractC21202217y8 != null) {
            abstractC21202217y8.LLLLLLJ(i);
        }
    }

    @Override // X.AbstractC21197117xJ, X.InterfaceC21184117vD
    public final void b0(ProductItem productItem) {
        super.b0(productItem);
    }

    @Override // X.InterfaceC21204917yZ
    public final void LJJI(int i, long j) {
        InterfaceC21204917yZ interfaceC21204917yZ;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204917yZ) && (interfaceC21204917yZ = (InterfaceC21204917yZ) t) != null) {
            interfaceC21204917yZ.LJJI(i, j);
        }
    }

    @Override // X.InterfaceC21204917yZ
    public final void LJJIIJ(int i, boolean z) {
        InterfaceC21204917yZ interfaceC21204917yZ;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204917yZ) && (interfaceC21204917yZ = (InterfaceC21204917yZ) t) != null) {
            interfaceC21204917yZ.LJJIIJ(i, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.09AY, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // X.InterfaceC21204917yZ
    public final void LJJJLZIJ(int i, Integer num) {
        ?? r0;
        InterfaceC21204917yZ interfaceC21204917yZ;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204917yZ) && (interfaceC21204917yZ = (InterfaceC21204917yZ) t) != null) {
            interfaceC21204917yZ.LJJJLZIJ(i, num);
        }
        if (i != 0) {
            if ((i != 1 && i != 2) || (r0 = this.LLJILJIL) == 0) {
                return;
            }
            r0.invoke();
            return;
        }
        ?? r02 = this.LLJILJILJ;
        if (r02 == 0) {
            return;
        }
        r02.invoke();
    }

    @Override // X.AbstractC21197117xJ, X.InterfaceC21184117vD
    public final void LJJLIIIJLJLI(PopupCardVO popupCardVO, String str) {
        if (C292450BdD.LIZ()) {
            this.LL = popupCardVO;
            super.LJJLIIIJLJLI(popupCardVO, str);
        } else {
            if (this.LLJJIJIL.LJIIJ()) {
                return;
            }
            this.LL = popupCardVO;
            super.LJJLIIIJLJLI(popupCardVO, str);
        }
    }

    public C21203717yN(Context context, Map<String, String> map, C21194817ww c21194817ww) {
        super(map, c21194817ww);
        this.LLJJJJ = context;
        this.LLJJIJIL.LIZLLL(new C21204617yW(this));
        this.LLJJIJIL.LIZLLL(new C21204417yU(this));
        this.LLJJIJIL.LIZLLL(new C21206217ym(this));
        this.LLJJIJIL.LIZLLL(new C21206017yk(this));
        C594220NSi c594220NSi = (C594220NSi) this.LLJJIJIIJIL.getValue();
        c594220NSi.LIZLLL(1, new C21212617zo(this), false);
        c594220NSi.LIZLLL(2, new C594060NRs(this), true);
    }

    @Override // X.AbstractC21197117xJ, X.C181I
    public final void LIZ(String str, Product product, Integer num) {
        ((C594220NSi) this.LLJJIJIIJIL.getValue()).LIZ(str, product, num);
    }

    @Override // X.InterfaceC21204917yZ
    public final void LJJJLIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock, boolean z, boolean z2) {
        InterfaceC21204917yZ interfaceC21204917yZ;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204917yZ) && (interfaceC21204917yZ = (InterfaceC21204917yZ) t) != null) {
            interfaceC21204917yZ.LJJJLIIL(flashSaleAtmosphereStock, z, z2);
        }
    }
}

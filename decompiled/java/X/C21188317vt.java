package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommercelive.audience.us.lifecycle.UsEcommerceRoomLifecycleObserver;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS241S0300000_32;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.17vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21188317vt extends C09AY implements Function1<InterfaceC497601wk, Unit> {
    public final /* synthetic */ OecInitData LL;
    public final /* synthetic */ Room LLILLJJLI;
    public final /* synthetic */ UsEcommerceRoomLifecycleObserver LLILLL;
    public final /* synthetic */ HashMap<String, String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Fragment LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21188317vt(OecInitData oecInitData, Room room, UsEcommerceRoomLifecycleObserver usEcommerceRoomLifecycleObserver, HashMap map, String str, boolean z, String str2, LivePlayFragment livePlayFragment) {
        super(1);
        this.LL = oecInitData;
        this.LLILLJJLI = room;
        this.LLILLL = usEcommerceRoomLifecycleObserver;
        this.LLILZ = map;
        this.LLILZIL = str;
        this.LLILZLL = z;
        this.LLIZ = str2;
        this.LLIZLLLIL = livePlayFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC497601wk interfaceC497601wk) {
        boolean zBooleanValue;
        C21213017zs c21213017zsLIZ;
        String str;
        String str2;
        Boolean boolLJLI;
        String str3;
        InterfaceC497601wk interfaceC497601wk2 = interfaceC497601wk;
        C21213117zt.LIZ.getClass();
        C21213117zt.LIZJ();
        OecInitData oecInitData = this.LL;
        int i = oecInitData.productNum;
        int i2 = oecInitData.displayProductNum;
        if (i > 0 || i2 > 0) {
            if (C294630Bgj.LIZ()) {
                C23250099c.LIZLLL(interfaceC497601wk2, C2126308Ur.LIZ, null, new C21165117s9(this.LLILLJJLI, this.LLILLL, this.LLIZLLLIL, null), 2);
            }
            if (C1513700pUe.LIZIZ()) {
                C1513700pUe.LIZ(this.LLILLJJLI.getId()).LIZ(new C21177517u9(this.LLILLL, this.LLILLJJLI, this.LLILZ, this.LLIZLLLIL));
            } else if (!C294630Bgj.LIZ()) {
                C21196417xC.LIZ(EnumC21192817wc.REQUEST_PREVIEW_ASSEMBLE, this.LLILLL.LIZLLL, null, null, null, false, null, null, 252);
                UsEcommerceRoomLifecycleObserver usEcommerceRoomLifecycleObserver = this.LLILLL;
                C598650Ndv c598650Ndv = usEcommerceRoomLifecycleObserver.LIZ;
                if (c598650Ndv != null) {
                    Room room = this.LLILLJJLI;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C598630Ndt(c598650Ndv, room, usEcommerceRoomLifecycleObserver.LIZIZ, new AwS241S0300000_32(room, usEcommerceRoomLifecycleObserver, this.LLIZLLLIL, 18), this.LLILZ, null), 3);
                }
            }
            HashMap<String, String> map = this.LLILZ;
            if (map != null && (str2 = map.get("has_shown_ec_feed_shopping_bag_card")) != null && (boolLJLI = a0.LJLI(str2)) != null) {
                zBooleanValue = boolLJLI.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (C20340514iR.LJ()) {
                String idStr = this.LLILLJJLI.getIdStr();
                String strValueOf = String.valueOf(this.LLILLJJLI.getOwnerUserId());
                OecInitData oecInitData2 = this.LL;
                Product product = oecInitData2.product;
                if (product == null || (str = product.productId) == null) {
                    str = oecInitData2.popProductId;
                }
                C20340514iR.LJIIIZ(idStr, strValueOf, str);
                AtomicBoolean atomicBoolean = C19516211Xc.LIZ;
                C19516211Xc.LIZIZ(this.LLILLJJLI.getId(), this.LLILLJJLI.getOwnerUserId(), zBooleanValue, EnumC598510Ndh.ROOM_ENTER);
            } else {
                String str4 = this.LL.bagAnimation;
                if ((str4 == null || str4.length() == 0) && (c21213017zsLIZ = C21213217zu.LIZ.LIZ(Long.valueOf(this.LLILLJJLI.getId()))) != null) {
                    C21213017zs.LIZ(c21213017zsLIZ, Long.valueOf(this.LLILLJJLI.getId()), Long.valueOf(this.LLILLJJLI.getOwnerUserId()), this.LL.productNum, this.LLILLL.LIZIZ, this.LLILZIL, this.LLILZLL, zBooleanValue, this.LLIZ, EnumC598510Ndh.ROOM_ENTER, 32);
                } else {
                    AtomicBoolean atomicBoolean2 = C19516211Xc.LIZ;
                    C19516211Xc.LIZIZ(this.LLILLJJLI.getId(), this.LLILLJJLI.getOwnerUserId(), zBooleanValue, EnumC598510Ndh.ROOM_ENTER);
                }
            }
            ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).onEnterEcommerceLiveRoom(this.LLIZLLLIL);
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C21189917w9(this.LL, this.LLILLJJLI, this.LLILLL, null), 3);
        }
        if (!C20160313uT.LIZJ("/self_define/eclive/room/enter")) {
            if (this.LLIZLLLIL.getContext() != null) {
                C21194717wv.LJIIIIZZ(this.LL);
            }
        } else {
            CommerceStruct commerceStruct = this.LLILLJJLI.getCommerceStruct();
            if (commerceStruct != null && !commerceStruct.asyncLoad && (str3 = commerceStruct.oecInitDataString) != null) {
                Map mapLJIIJ = C1741890vQh.LJIIJ(str3);
                if (mapLJIIJ == null) {
                    mapLJIIJ = C2097608Jq.LJ();
                }
                EcomResourceBystander.LIZ.getClass();
                EcomResourceBystander.LJIILLIIL(mapLJIIJ, "/self_define/eclive/room/enter", null, null, null);
            }
        }
        return Unit.LIZ;
    }
}

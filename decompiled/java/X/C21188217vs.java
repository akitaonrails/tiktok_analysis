package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS241S0300000_32;

/* JADX INFO: renamed from: X.17vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21188217vs extends C09AY implements Function1<InterfaceC497601wk, Unit> {
    public final /* synthetic */ OecInitData LL;
    public final /* synthetic */ C21186517vb LLILLJJLI;
    public final /* synthetic */ Room LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Fragment LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21188217vs(OecInitData oecInitData, C21186517vb c21186517vb, Room room, String str, boolean z, boolean z2, String str2, LivePlayFragment livePlayFragment) {
        super(1);
        this.LL = oecInitData;
        this.LLILLJJLI = c21186517vb;
        this.LLILLL = room;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = str2;
        this.LLIZLLLIL = livePlayFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC497601wk interfaceC497601wk) {
        C21213017zs c21213017zsLIZ;
        String str;
        C21186517vb c21186517vb;
        C598640Ndu c598640Ndu;
        InterfaceC497601wk interfaceC497601wk2 = interfaceC497601wk;
        C21213117zt.LIZ.getClass();
        C21213117zt.LIZJ();
        OecInitData oecInitData = this.LL;
        int i = oecInitData.productNum;
        int i2 = oecInitData.displayProductNum;
        if (i > 0 || i2 > 0) {
            if (C294630Bgj.LIZ()) {
                C23250099c.LIZLLL(interfaceC497601wk2, C2126308Ur.LIZ, null, new C21165217sA(this.LLILLL, this.LLILLJJLI, this.LLIZLLLIL, null), 2);
            }
            if (C0A14.LIZ() != 2 && C0A14.LIZ() != 3) {
                if (C1513700pUe.LIZIZ()) {
                    C1513700pUe.LIZ(this.LLILLL.getId()).LIZ(new AwS241S0300000_32(this.LLIZLLLIL, this.LLILLL, this.LLILLJJLI, 8));
                } else if (!C294630Bgj.LIZ() && (c598640Ndu = (c21186517vb = this.LLILLJJLI).LIZ) != null) {
                    Room room = this.LLILLL;
                    c598640Ndu.LIZ(room, c21186517vb.LIZIZ, new AwS241S0300000_32(this.LLIZLLLIL, room, c21186517vb, 9));
                }
            } else {
                C21186517vb c21186517vb2 = this.LLILLJJLI;
                C598640Ndu c598640Ndu2 = c21186517vb2.LIZ;
                if (c598640Ndu2 != null) {
                    Room room2 = this.LLILLL;
                    c598640Ndu2.LIZ(room2, c21186517vb2.LIZIZ, new AwS241S0300000_32(this.LLIZLLLIL, room2, c21186517vb2, 6));
                }
            }
            if (C20340514iR.LJ()) {
                String idStr = this.LLILLL.getIdStr();
                String strValueOf = String.valueOf(this.LLILLL.getOwnerUserId());
                OecInitData oecInitData2 = this.LL;
                Product product = oecInitData2.product;
                if (product == null || (str = product.productId) == null) {
                    str = oecInitData2.popProductId;
                }
                C20340514iR.LJIIIZ(idStr, strValueOf, str);
            } else {
                String str2 = this.LL.bagAnimation;
                if ((str2 == null || str2.length() == 0) && (c21213017zsLIZ = C21213217zu.LIZ.LIZ(Long.valueOf(this.LLILLL.getId()))) != null) {
                    C21213017zs.LIZ(c21213017zsLIZ, Long.valueOf(this.LLILLL.getId()), Long.valueOf(this.LLILLL.getOwnerUserId()), this.LL.productNum, this.LLILLJJLI.LIZIZ, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, EnumC598510Ndh.ROOM_ENTER, 32);
                }
            }
            ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).onEnterEcommerceLiveRoom(this.LLIZLLLIL);
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C21190017wA(this.LL, this.LLILLL, this.LLILLJJLI, null), 3);
        }
        if (this.LLIZLLLIL.getContext() != null) {
            C21194717wv.LJIIIIZZ(this.LL);
        }
        return Unit.LIZ;
    }
}

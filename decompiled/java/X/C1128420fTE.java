package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fTE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$requestMultiGuestGalleryIfNeeded$1", f = "GiftPanelLeafV2.kt", l = {1669}, m = "invokeSuspend")
public final class C1128420fTE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1128710fTh LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128420fTE(C1128710fTh c1128710fTh, long j, InterfaceC1364105Vn<? super C1128420fTE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1128710fTh;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1128420fTE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long id;
        long ownerUserId;
        C1C7U.LIZ("GiftPanelLeafV2@f893.requestMultiGuestGalleryIfNeeded$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1128430fTF galleryRepository = GiftManager.inst().getGalleryRepository();
            Room room = this.LLILLJJLI.LLLI;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            EnumC994180byi enumC994180byi = EnumC994180byi.MULTI_GUEST;
            Room room2 = this.LLILLJJLI.LLLI;
            if (room2 != null) {
                ownerUserId = room2.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            long j = this.LLILLL;
            this.LL = 1;
            if (galleryRepository.LIZ(id, enumC994180byi, ownerUserId, currentUserId, j, this) == objLJFF) {
                C1C7U.LIZIZ("GiftPanelLeafV2@f893.requestMultiGuestGalleryIfNeeded$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.requestMultiGuestGalleryIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

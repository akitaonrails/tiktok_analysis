package X;

import com.ss.android.ugc.aweme.im.common.experiment.RecentActivitySticker;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.messagelist.RecentActivityCardUISlot;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z4K, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.RecentActivityCardUISlot$onViewCreated$1", f = "RecentActivityMessageListProtocol.kt", l = {146}, m = "invokeSuspend")
public final class C0Z4K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1722406oo LLILLJJLI;
    public final /* synthetic */ RecentActivityCardUISlot LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z4K(C1722406oo c1722406oo, RecentActivityCardUISlot recentActivityCardUISlot, InterfaceC1364105Vn<? super C0Z4K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1722406oo;
        this.LLILLL = recentActivityCardUISlot;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z4K(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        StickerItem stickerItem;
        SetSticker setStickerLJIIJJI;
        Object objLJIIIZ = obj;
        C1C7U.LIZ("RecentActivityCardUISlot@768d.onViewCreated$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(objLJIIIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIIZ);
            if (IMStickerApi.LIZ.LIZIZ().getImStickerMessageService().LJI(null, String.valueOf(C0Z4L.LIZIZ(this.LLILLJJLI.activityType))) == null) {
                InterfaceC447740Hh6 interfaceC447740Hh6 = (InterfaceC447740Hh6) this.LLILLL.LLLFF.getValue();
                int i3 = C892490Yzn.LIZ[this.LLILLJJLI.activityType.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        RecentActivitySticker recentActivitySticker = C0Z4L.LIZ().repost;
                        if (recentActivitySticker == null) {
                            recentActivitySticker = new RecentActivitySticker("❤️", 44538807299L, 44142529795L, 2, "", 7176841825176847366L);
                        }
                        i = recentActivitySticker.stickerType;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    RecentActivitySticker recentActivitySticker2 = C0Z4L.LIZ().post;
                    if (recentActivitySticker2 == null) {
                        recentActivitySticker2 = new RecentActivitySticker("❤️", 44538807299L, 44142529795L, 2, "", 7176841825176847366L);
                    }
                    i = recentActivitySticker2.stickerType;
                }
                List listSingletonList = Collections.singletonList(C2286608xc.LJFF(C0Z4L.LIZIZ(this.LLILLJJLI.activityType)));
                C0Z4J c0z4j = new C0Z4J(C0Z4I.LIZ);
                this.LL = 1;
                objLJIIIZ = interfaceC447740Hh6.LJIIIZ(i, listSingletonList, this, c0z4j);
                if (objLJIIIZ == objLJFF) {
                    C1C7U.LIZIZ("RecentActivityCardUISlot@768d.onViewCreated$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RecentActivityCardUISlot@768d.onViewCreated$1");
            return unit;
        }
        List list = (List) objLJIIIZ;
        if (list != null && (stickerItem = (StickerItem) C13LP.LJJJLL(list)) != null && (setStickerLJIIJJI = C453550HqT.LJIIJJI(stickerItem)) != null) {
            this.LLILLL.LLLFFI = setStickerLJIIJJI;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecentActivityCardUISlot@768d.onViewCreated$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

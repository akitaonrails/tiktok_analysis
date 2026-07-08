package X;

import com.bytedance.android.livesdk.dataChannel.DeleteStickerChannel;
import com.bytedance.android.livesdk.dataChannel.InsertStickerChannel;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.sticker.FansLynxStickerExtra;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.sticker.FansStickerViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.revenue.level.impl.fansclub.sticker.FansStickerViewModel$setSticker$1", f = "FansStickerViewModel.kt", l = {31}, m = "invokeSuspend")
public final class C1847230yAb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FansStickerViewModel LLILLJJLI;
    public final /* synthetic */ FansLynxStickerExtra LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1847230yAb(FansStickerViewModel fansStickerViewModel, FansLynxStickerExtra fansLynxStickerExtra, InterfaceC1364105Vn<? super C1847230yAb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fansStickerViewModel;
        this.LLILLL = fansLynxStickerExtra;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1847230yAb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FansStickerViewModel@3034.setSticker$1");
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
            FansStickerViewModel fansStickerViewModel = this.LLILLJJLI;
            if (fansStickerViewModel.LL != null) {
                DataChannel dataChannel = fansStickerViewModel.getDataChannel();
                if (dataChannel != null) {
                    dataChannel.zW(DeleteStickerChannel.class, C2286608xc.LJ(13));
                }
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                    C1C7U.LIZIZ("FansStickerViewModel@3034.setSticker$1");
                    return objLJFF;
                }
            }
        }
        DataChannel dataChannel2 = this.LLILLJJLI.getDataChannel();
        if (dataChannel2 != null) {
            RoomSticker roomSticker = new RoomSticker(false, null, null, 0, 0, 0, 0, "", "", 0, false, null, "", false, "", "", false);
            FansLynxStickerExtra fansLynxStickerExtra = this.LLILLL;
            roomSticker.type = 13;
            roomSticker.xPosition = C439101nJ.LIZ(12) + (C439101nJ.LIZ(fansLynxStickerExtra.maxWidth) / 2);
            roomSticker.yPosition = C439101nJ.LIZ(12) + (C439101nJ.LIZ(fansLynxStickerExtra.maxHeight) / 2);
            roomSticker.id = fansLynxStickerExtra.stickerId;
            roomSticker.extra = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, fansLynxStickerExtra);
            dataChannel2.zW(InsertStickerChannel.class, roomSticker);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FansStickerViewModel@3034.setSticker$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.DonationStickerWrapperWidget;
import com.bytedance.android.livesdk.model.RoomDecoration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2177341AJg extends C2217421BqW implements Function1<RoomDecoration, Unit> {
    public C2177341AJg(Object obj) {
        super(1, obj, DonationStickerWrapperWidget.class, "selectDonationSticker", "selectDonationSticker(Lcom/bytedance/android/livesdk/model/RoomDecoration;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomDecoration roomDecoration) {
        ((DonationStickerWrapperWidget) this.receiver).B1(roomDecoration);
        return Unit.LIZ;
    }
}

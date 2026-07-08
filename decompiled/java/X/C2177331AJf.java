package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.DonationStickerWrapperWidget;
import com.bytedance.android.livesdk.model.RoomDecoration;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AJf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2177331AJf extends C2217421BqW implements Function1<List<? extends RoomDecoration>, Unit> {
    public C2177331AJf(Object obj) {
        super(1, obj, DonationStickerWrapperWidget.class, "updateDonationDecoration", "updateDonationDecoration(Ljava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends RoomDecoration> list) {
        ((DonationStickerWrapperWidget) this.receiver).Ii0(list);
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.android.livesdk.base.widget.StickerContainerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2177311AJd extends C2217421BqW implements Function1<EnumC464630IJx, Unit> {
    public C2177311AJd(Object obj) {
        super(1, obj, StickerContainerWidget.class, "paidEventStatusChange", "paidEventStatusChange(Lcom/bytedance/android/livesdk/event/PaidEventPreviewStatus;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC464630IJx enumC464630IJx) {
        StickerContainerWidget stickerContainerWidget = (StickerContainerWidget) this.receiver;
        stickerContainerWidget.getClass();
        if (enumC464630IJx == EnumC464630IJx.MASK) {
            stickerContainerWidget.C1(EnumC1847310yAj.PAID_EVENT);
        } else if (enumC464630IJx == EnumC464630IJx.PAY_SUCCESS) {
            stickerContainerWidget.D1(EnumC1847310yAj.PAID_EVENT);
        }
        return Unit.LIZ;
    }
}

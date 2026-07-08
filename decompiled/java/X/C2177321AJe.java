package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AJe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2177321AJe extends C2217421BqW implements Function1<EnumC464630IJx, Unit> {
    public C2177321AJe(Object obj) {
        super(1, obj, DecorationWrapperWidget.class, "paidEventStatusChange", "paidEventStatusChange(Lcom/bytedance/android/livesdk/event/PaidEventPreviewStatus;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC464630IJx enumC464630IJx) {
        DecorationWrapperWidget decorationWrapperWidget = (DecorationWrapperWidget) this.receiver;
        decorationWrapperWidget.getClass();
        if (enumC464630IJx == EnumC464630IJx.MASK) {
            decorationWrapperWidget.LLJI = true;
            decorationWrapperWidget.A1();
        } else if (enumC464630IJx == EnumC464630IJx.PAY_SUCCESS) {
            decorationWrapperWidget.LLJI = false;
            decorationWrapperWidget.A1();
        }
        return Unit.LIZ;
    }
}

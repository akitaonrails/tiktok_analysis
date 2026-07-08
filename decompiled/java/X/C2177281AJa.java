package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2177281AJa extends C2217421BqW implements Function1<Boolean, Unit> {
    public C2177281AJa(Object obj) {
        super(1, obj, DecorationWrapperWidget.class, "onPauseLive", "onPauseLive(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        DecorationWrapperWidget decorationWrapperWidget = (DecorationWrapperWidget) this.receiver;
        if (zBooleanValue) {
            decorationWrapperWidget.LLJ = true;
            decorationWrapperWidget.A1();
        } else {
            decorationWrapperWidget.LLJ = false;
            decorationWrapperWidget.A1();
        }
        return Unit.LIZ;
    }
}

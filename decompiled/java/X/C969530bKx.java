package X;

import com.bytedance.android.live.liveinteract.linkroom.widget.AudienceBottomLeftLinkWidget;
import com.bytedance.android.widget.Widget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C969530bKx extends C2217421BqW implements Function1<Boolean, Unit> {
    public C969530bKx(Object obj) {
        super(1, obj, AudienceBottomLeftLinkWidget.class, "setVisible", "setVisible(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        Widget widget = (Widget) this.receiver;
        if (zBooleanValue) {
            widget.show();
        } else {
            widget.hide();
        }
        return Unit.LIZ;
    }
}

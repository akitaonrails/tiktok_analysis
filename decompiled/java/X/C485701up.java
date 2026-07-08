package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewInviteGuestWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01up, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C485701up extends C2217421BqW implements Function1<Boolean, Unit> {
    public C485701up(Object obj) {
        super(1, obj, PreviewInviteGuestWidget.class, "onVisibilityChange", "onVisibilityChange(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((PreviewInviteGuestWidget) this.receiver).G1(bool.booleanValue());
        return Unit.LIZ;
    }
}

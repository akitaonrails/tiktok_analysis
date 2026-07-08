package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817590xOn extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PreviewBulletinEditWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817590xOn(PreviewBulletinEditWidget previewBulletinEditWidget) {
        super(1);
        this.LL = previewBulletinEditWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        PreviewBulletinEditWidget previewBulletinEditWidget = this.LL;
        if (zBooleanValue) {
            C500260Jjc.LLFFF(previewBulletinEditWidget.LLILZIL);
            C500260Jjc.LLFFF(previewBulletinEditWidget.LLILZ);
        } else {
            C500260Jjc.LJIILIIL(previewBulletinEditWidget.LLILZIL);
            C500260Jjc.LJIILIIL(previewBulletinEditWidget.LLILZ);
        }
        return Unit.LIZ;
    }
}

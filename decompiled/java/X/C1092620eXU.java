package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eXU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092620eXU extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PreviewBulletinEditWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092620eXU(PreviewBulletinEditWidget previewBulletinEditWidget) {
        super(1);
        this.LL = previewBulletinEditWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        PreviewBulletinEditWidget previewBulletinEditWidget = this.LL;
        if (zBooleanValue) {
            View view = previewBulletinEditWidget.LLIZLLLIL;
            if (view != null) {
                C500260Jjc.LLFFF(view);
            }
        } else {
            View view2 = previewBulletinEditWidget.LLIZLLLIL;
            if (view2 != null) {
                C500260Jjc.LJIILIIL(view2);
            }
        }
        return Unit.LIZ;
    }
}

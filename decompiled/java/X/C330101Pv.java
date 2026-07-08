package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01Pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C330101Pv extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PreviewBulletinEditWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330101Pv(PreviewBulletinEditWidget previewBulletinEditWidget) {
        super(1);
        this.LL = previewBulletinEditWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.LL.LLJILJIL.setValue(Boolean.valueOf(bool.booleanValue()));
        return Unit.LIZ;
    }
}

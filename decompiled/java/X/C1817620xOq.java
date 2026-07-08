package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.SmbLiveKickstarterSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xOq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817620xOq extends C09AY implements Function1<Unit, Unit> {
    public final /* synthetic */ PreviewBulletinEditWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817620xOq(PreviewBulletinEditWidget previewBulletinEditWidget) {
        super(1);
        this.LL = previewBulletinEditWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        if (!this.LL.LLJILJILJ && SmbLiveKickstarterSetting.INSTANCE.isEnabled()) {
            this.LL.LLJILJILJ = true;
        }
        return Unit.LIZ;
    }
}

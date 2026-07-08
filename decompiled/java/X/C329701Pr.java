package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01Pr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C329701Pr extends C09AY implements Function1<C048900Fr, Unit> {
    public final /* synthetic */ PreviewBulletinEditWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329701Pr(PreviewBulletinEditWidget previewBulletinEditWidget) {
        super(1);
        this.LL = previewBulletinEditWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C048900Fr c048900Fr) {
        PreviewBulletinEditWidget previewBulletinEditWidget = this.LL;
        previewBulletinEditWidget.LLJILJILJ = false;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(previewBulletinEditWidget), null, null, new C329801Ps(this.LL, c048900Fr, null), 3);
        return Unit.LIZ;
    }
}

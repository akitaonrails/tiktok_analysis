package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01XO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01XO extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ PreviewBulletinEditWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01XO(PreviewBulletinEditWidget previewBulletinEditWidget) {
        super(1);
        this.LL = previewBulletinEditWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        C062P<InterfaceC111300bX> c062p2 = c062p;
        PreviewBulletinEditWidget previewBulletinEditWidget = this.LL;
        c062p2.LIZ = new C291301Ax(previewBulletinEditWidget.LLJ, previewBulletinEditWidget.dataChannel, 4);
        c062p2.LIZIZ = "save_data";
        return Unit.LIZ;
    }
}

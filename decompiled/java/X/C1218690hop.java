package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218690hop extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ PreviewBulletinEditWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218690hop(PreviewBulletinEditWidget previewBulletinEditWidget) {
        super(1);
        this.LL = previewBulletinEditWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        C062P<InterfaceC111300bX> c062p2 = c062p;
        c062p2.LIZ = new C1120090fFn((C1817550xOj) this.LL.LLJI.getValue());
        c062p2.LIZIZ = "DecorationEditData";
        return Unit.LIZ;
    }
}

package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.IntelligentBoardTemplateForYouSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hoy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218780hoy extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ IntelligentBoardTemplateForYouSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218780hoy(IntelligentBoardTemplateForYouSheet intelligentBoardTemplateForYouSheet) {
        super(1);
        this.LL = intelligentBoardTemplateForYouSheet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        boolean z;
        C062P<InterfaceC111300bX> c062p2 = c062p;
        String str = this.LL.LLJZIJLIL;
        if (!TextUtils.equals(str, "live_detail") && this.LL.LLL == null) {
            z = true;
        } else {
            z = false;
        }
        c062p2.LIZ = new C1218790hoz(str, z, this.LL.LLL);
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513160KAo extends C09AY implements Function1<C514600KGc, Unit> {
    public final /* synthetic */ C513170KAp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C513160KAo(C513170KAp c513170KAp) {
        super(1);
        this.LL = c513170KAp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C514600KGc c514600KGc) {
        long j;
        C0KH1 c0kh1;
        TemplateListData templateListData;
        C514600KGc c514600KGc2 = c514600KGc;
        User user = null;
        if (c514600KGc2 != null && (c0kh1 = c514600KGc2.LIZLLL) != null && (templateListData = c0kh1.LIZ) != null) {
            user = templateListData.anchorDetail;
            j = templateListData.subscriberCount;
        } else {
            j = 0;
        }
        C474270Iin.LIZ(64, user, this.LL.LL);
        this.LL.LLILLJJLI.setText(C497740JfY.LJIJJ(2131830326, C0KVU.LIZ(user)));
        if (j < 5) {
            C16F5 c16f5 = this.LL.LLILLL;
            if (c16f5 != null) {
                C500260Jjc.LJIILIIL(c16f5);
            }
            C513170KAp c513170KAp = this.LL;
            C513170KAp.P5(c513170KAp.LLILZ, c513170KAp.LLILLJJLI, c513170KAp.LLILLL);
        } else {
            C16F5 c16f52 = this.LL.LLILLL;
            if (c16f52 != null) {
                C500260Jjc.LLFFF(c16f52);
            }
            C16F5 c16f53 = this.LL.LLILLL;
            String strLJIIL = C497740JfY.LJIIL(2131755214, (int) j, Long.valueOf(j));
            if (strLJIIL == null) {
                strLJIIL = "";
            }
            c16f53.setText(strLJIIL);
            C513170KAp c513170KAp2 = this.LL;
            C513170KAp.P5(c513170KAp2.LLILZ, c513170KAp2.LLILLJJLI, c513170KAp2.LLILLL);
        }
        return Unit.LIZ;
    }
}

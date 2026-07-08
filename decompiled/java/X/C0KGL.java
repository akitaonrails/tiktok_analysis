package X;

import com.bytedance.android.livesdk.chatroom.api.UpdateTips;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageDialog;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KGL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KGL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubPackagePageDialog LL;
    public final /* synthetic */ C514900KHg LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KGL(SubPackagePageDialog subPackagePageDialog, C514900KHg c514900KHg, long j) {
        super(0);
        this.LL = subPackagePageDialog;
        this.LLILLJJLI = c514900KHg;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<UpdateTips> list;
        SubPackagePageDialog subPackagePageDialog = this.LL;
        String str = subPackagePageDialog.LLIZ.LJII;
        Map<String, String> map = subPackagePageDialog.LLJJ;
        SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo = (SubscriptionProductDetailWithTemplateInfo) C13LP.LJJJLZIJ(0, this.LLILLJJLI.LIZ);
        TemplateInfo templateInfo = subscriptionProductDetailWithTemplateInfo != null ? subscriptionProductDetailWithTemplateInfo.getTemplateInfo() : null;
        float f = this.LLILLL;
        C0KH1 c0kh1 = this.LLILLJJLI.LIZJ;
        boolean z = c0kh1 != null && c0kh1.LIZIZ;
        SubPackagePageDialog subPackagePageDialog2 = this.LL;
        String str2 = subPackagePageDialog2.LLILZIL.LIZ;
        String str3 = subPackagePageDialog2.LLIZ.LJIIIIZZ;
        boolean z2 = (c0kh1 == null || (list = c0kh1.LJI) == null) ? false : !list.isEmpty();
        C0KH1 c0kh12 = this.LLILLJJLI.LIZJ;
        List<UpdateTips> list2 = c0kh12 != null ? c0kh12.LJI : null;
        C0KCF c0kcf = this.LL.LLIZ;
        C0KDR.LJIIIZ(str, map, templateInfo, f, z, str2, str3, z2, list2, c0kcf != null ? c0kcf.LJIIJJI : null);
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ == null) {
            return null;
        }
        interfaceC517590KRpLIZJ.LJI(new C517500KRg(this.LL.hashCode(), 0, (String) null, (Map) null, 28));
        return Unit.LIZ;
    }
}

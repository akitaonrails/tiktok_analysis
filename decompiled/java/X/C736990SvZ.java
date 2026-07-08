package X;

import com.bytedance.touchpoint.api.model.SharePanelInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736990SvZ extends C09AY implements Function1<Long, Unit> {
    public C736990SvZ() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        l.longValue();
        C1895820zQy.LL.getClass();
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        SharePanelInfo sharePanelInfo = (SharePanelInfo) C2178808gE.LIZ().LJ(33);
        if (sharePanelInfo != null) {
            String str = sharePanelInfo.shareButtonIcon;
            String str2 = sharePanelInfo.sharePanelIcon;
            C1895820zQy.LJIIJJI("shareButton", str);
            C1895820zQy.LJIIJJI("sharePanelIcon", str2);
        }
        return Unit.LIZ;
    }
}

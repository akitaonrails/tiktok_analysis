package Y;

import X.C013C;
import X.C893580Z3s;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import kotlin.Unit;

/* JADX INFO: loaded from: classes15.dex */
public class AgS78S1200000_14 implements InterfaceC346701Wf {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS78S1200000_14 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS78S1200000_14.emit$0(Y.AgS78S1200000_14, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$1(AgS78S1200000_14 agS78S1200000_14, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String strLIZ;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((BaseActionViewModel) agS78S1200000_14.l1).nw(zBooleanValue);
        if (zBooleanValue) {
            C013C c013c = (C013C) agS78S1200000_14.l2;
            if (!c013c.element) {
                c013c.element = true;
                IIMAnalyticsUtil.LIZ.getClass();
                IIMAnalyticsUtil iIMAnalyticsUtilLIZ = C893580Z3s.LIZ();
                if (iIMAnalyticsUtilLIZ == null || (strLIZ = iIMAnalyticsUtilLIZ.LIZ(agS78S1200000_14.s0)) == null) {
                    strLIZ = "";
                }
                PushFeature pushFeatureLIZ = PushFeature.LIZ.LIZ();
                if (pushFeatureLIZ != null) {
                    pushFeatureLIZ.LJIIL(agS78S1200000_14.s0, strLIZ);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS78S1200000_14(String str, String str2, BaseActionViewModel<?> baseActionViewModel, C013C c013c) {
        this.$t = c013c;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = baseActionViewModel;
    }
}

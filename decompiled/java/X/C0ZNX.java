package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable.IUnavailableMessageCheck;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0ZNX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZNX implements IUnavailableMessageCheck {
    public static final C0ZNX LIZ = new C0ZNX();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(355));

    public static boolean LIZIZ(C869590Y9l c869590Y9l) {
        Integer num;
        String str = c869590Y9l.getLocalExt().get("s:send_response_check_msg");
        if (str != null) {
            Object localCache = c869590Y9l.getLocalCache(515);
            if (localCache instanceof Integer) {
                num = (Integer) localCache;
            } else {
                num = null;
            }
            if (num != null) {
                if (num.intValue() == 7279) {
                    return true;
                }
                return false;
            }
            try {
                CheckMessage checkMessage = (CheckMessage) C051M.LIZIZ(CheckMessage.class, str);
                if (checkMessage != null) {
                    Integer numValueOf = Integer.valueOf(checkMessage.getStatusCode());
                    if (numValueOf != null) {
                        numValueOf.intValue();
                        c869590Y9l.putLocalCache(515, numValueOf);
                        if (numValueOf.intValue() == 7279) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }

    public static boolean LIZJ(C2242281CpW c2242281CpW) {
        IconTypeComponent iconTypeComponent;
        if (c2242281CpW == null || (iconTypeComponent = c2242281CpW.LIZ.iconType) == IconTypeComponent.LOADING || iconTypeComponent == IconTypeComponent.DEFAULT) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x01f5  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable.IUnavailableMessageCheck
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(X.C869590Y9l r9) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZNX.LIZ(X.0Y9l):boolean");
    }
}

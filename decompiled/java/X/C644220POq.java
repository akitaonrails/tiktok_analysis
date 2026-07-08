package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.IOException;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0POq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644220POq extends C644230POr {
    public String LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL = -2;
    public Integer LJ;
    public Integer LJFF;
    public Integer LJI;
    public String LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchChainStatus(status=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", errorDesc=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZLLL(Throwable th) {
        Class<?> cls;
        String message;
        C644210POp.LIZ.getClass();
        C644210POp.LJFF.LIZJ();
        if (th instanceof C1494450ozb) {
            LJII(2);
            LJFF(1);
            LJI(th.getMessage());
        } else {
            int i = 100;
            if (th instanceof C1494690ozz) {
                C1494690ozz c1494690ozz = (C1494690ozz) th;
                int statusCode = c1494690ozz.getStatusCode();
                if (statusCode > 0) {
                    LJII(3);
                    LJFF(statusCode);
                } else {
                    LJII(2);
                    LJFF(100);
                }
                String message2 = c1494690ozz.getMessage();
                if (message2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('(');
                    sbLIZ.append(statusCode);
                    sbLIZ.append(')');
                    int length = message2.length();
                    if (length <= 100) {
                        i = length;
                    }
                    sbLIZ.append(message2.substring(0, i));
                    LJI(C2188811AlT.LIZIZ(sbLIZ));
                    if (a0.LJJIIZI(message2, "PROXY_CONNECTION_FAILED", false)) {
                        LJFF(2);
                    } else if (a0.LJJIIZI(message2, "HTTP2_PROTOCOL_ERROR", false)) {
                        LJFF(3);
                    } else if (a0.LJJIIZI(message2, "TTNET_APP_TIMED_OUT", false)) {
                        LJFF(4);
                    }
                }
            } else {
                if (th != null) {
                    cls = th.getClass();
                } else {
                    cls = null;
                }
                if (Intrinsics.LJFF(cls, IOException.class)) {
                    String message3 = th.getMessage();
                    if (message3 != null) {
                        if (a0.LJJIIZI(message3, "missing CR", false)) {
                            LJII(4);
                            LJFF(3);
                        } else if (a0.LJJIIZI(message3, "Premature EOF", false)) {
                            LJII(4);
                            LJFF(2);
                        } else {
                            LJII(2);
                            LJFF(101);
                        }
                    }
                    LJI(th.getMessage());
                } else if (th instanceof C2329809Ay) {
                    LJII(4);
                    LJFF(1);
                    LJI(th.getMessage());
                } else if (th instanceof C0XIR) {
                    LJII(5);
                    C0XIR c0xir = (C0XIR) th;
                    LJFF(c0xir.getErrorCode());
                    LJI(c0xir.getMessage());
                } else {
                    LJII(2);
                    if (th != null && (message = th.getMessage()) != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(th.getClass().getName());
                        sbLIZ2.append('(');
                        int length2 = message.length();
                        if (length2 <= 100) {
                            i = length2;
                        }
                        sbLIZ2.append(message.substring(0, i));
                        sbLIZ2.append(')');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        LJI(strLIZIZ);
                        if (a0.LJJIIZI(strLIZIZ, "TTNET_APP_TIMED_OUT", false)) {
                            LJII(4);
                        }
                    }
                }
            }
        }
        Integer num = this.LJFF;
        if (num == null || num.intValue() != 0) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SearchChainEventTrackerV2", "markThrowableStatus");
            C644210POp.LJI();
        }
    }

    public final void LJ(Integer num) {
        int iIntValue;
        if (this.LIZLLL == null) {
            this.LIZLLL = num;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -2;
            }
            LIZ(Integer.valueOf(iIntValue), "is_hit_trunk");
        }
    }

    public final void LJFF(int i) {
        int iIntValue;
        Integer numValueOf = Integer.valueOf(i);
        this.LJI = numValueOf;
        HashMap<String, Object> map = this.LIZ;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        map.put("error_code", Integer.valueOf(iIntValue));
    }

    public final void LJI(String str) {
        this.LJII = str;
        HashMap<String, Object> map = this.LIZ;
        if (str == null) {
            str = "";
        }
        map.put("error_desc", str);
    }

    public final void LJII(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.LJFF = numValueOf;
        HashMap<String, Object> map = this.LIZ;
        Object obj = numValueOf;
        if (numValueOf == null) {
            obj = "";
        }
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, obj);
    }

    public final void LIZJ(int i, String str) {
        C644210POp.LIZ.getClass();
        C0POF c0pof = C644210POp.LJFF;
        if (c0pof.LIZLLL == -1 && !c0pof.LJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cancel, from: ");
            sbLIZ.append(str);
            LIZIZ(1, i, C2188811AlT.LIZIZ(sbLIZ));
        } else {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SearchChainEventTrackerV2", "markCanceled: isFinishNetwork");
            C644210POp.LJI();
        }
        C644210POp.LIZJ = true;
    }

    public final void LIZIZ(int i, int i2, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mark: status = ");
        sbLIZ.append(i);
        sbLIZ.append(", errorCode = ");
        sbLIZ.append(i2);
        sbLIZ.append(", errorDesc: ");
        sbLIZ.append(str);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SearchChainEventTrackerV2", C2188811AlT.LIZIZ(sbLIZ));
        LJII(i);
        LJFF(i2);
        if (str == null) {
            str = "not define";
        }
        LJI(str);
        if (i != 0) {
            C644210POp.LIZ.getClass();
            C644210POp.LJI();
        }
    }
}

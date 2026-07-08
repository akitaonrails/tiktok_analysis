package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246460iXc {
    public static final C1246460iXc LIZ = new C1246460iXc();

    public static void LIZ(MusNotice musNotice, String str, String str2) {
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("error_type", str);
        c2344009Gk.LJIIIIZZ("account_type", musNotice.getAccountType());
        if (musNotice.templateNotice != null) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_template");
        if (str2 != null) {
            c2344009Gk.LJFF("error_detail_reason", str2);
        }
        C20684815ws.LJIILLIIL("official_notification_error", c2344009Gk.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0iXd] */
    public static C1246470iXd LIZIZ(MusNotice musNotice, final EnumC1246450iXb enumC1246450iXb, final Throwable th, final String str) {
        BaseResponse baseResponse;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        String str2;
        final String str3 = null;
        if (str == null) {
            if (musNotice != null) {
                str = musNotice.getTemplateId();
            } else {
                str = null;
            }
        }
        if (enumC1246450iXb == EnumC1246450iXb.PARSE) {
            try {
                HashSet hashSet = new HashSet();
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        break;
                    }
                    if (!hashSet.add(cause)) {
                        break;
                    }
                    if (cause instanceof C0XIR) {
                        Object rawResponse = ((C0XIR) cause).getRawResponse();
                        if ((rawResponse instanceof BaseResponse) && (baseResponse = (BaseResponse) rawResponse) != null && (serverTimeExtra = baseResponse.extra) != null && (str2 = serverTimeExtra.logid) != null && str2.length() != 0) {
                            str3 = str2;
                            break;
                        }
                    }
                    cause = cause.getCause();
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        if (th instanceof C1246470iXd) {
            C1246470iXd c1246470iXd = (C1246470iXd) th;
            if (c1246470iXd.getStage() == enumC1246450iXb && Intrinsics.LJFF(c1246470iXd.getTemplateId(), str) && Intrinsics.LJFF(c1246470iXd.getLogid(), str3)) {
                return c1246470iXd;
            }
        }
        return new RuntimeException(str, enumC1246450iXb, str3, th) { // from class: X.0iXd
            public static final int $stable = 8;
            public final String LL;
            public final EnumC1246450iXb LLILLJJLI;
            public final String LLILLL;

            public final String getLogid() {
                return this.LLILLL;
            }

            public final EnumC1246450iXb getStage() {
                return this.LLILLJJLI;
            }

            public final String getTemplateId() {
                return this.LL;
            }

            {
                String strLIZIZ;
                ArrayList arrayList = new ArrayList();
                if (str != null && str.length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("templateId=");
                    sbLIZ.append(str);
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (str3 != null && str3.length() != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("logid=");
                    sbLIZ2.append(str3);
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (arrayList.isEmpty()) {
                    strLIZIZ = "";
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(", ");
                    sbLIZ3.append(C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("SystemNotification[");
                sbLIZ4.append(enumC1246450iXb.getValue());
                sbLIZ4.append("] failed");
                sbLIZ4.append(strLIZIZ);
                super(C2188811AlT.LIZIZ(sbLIZ4), th);
                this.LL = str;
                this.LLILLJJLI = enumC1246450iXb;
                this.LLILLL = str3;
            }
        };
    }
}

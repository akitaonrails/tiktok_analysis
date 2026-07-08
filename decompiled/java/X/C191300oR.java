package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.00oR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C191300oR {
    public static final C11KQ LIZJ(C11KQ c11kq) {
        return c11kq.LJIIL(new C09JN() { // from class: X.00oQ
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("TemplateManagerKt@e8aa.toastPromptIfApiError$1");
                Throwable th = (Throwable) obj;
                if ((th instanceof C477520Io2) && C500260Jjc.LJJIIZ(((C501470JlZ) th).getPrompt())) {
                    C176600m4.LIZJ(new C5182020e(th, 18));
                }
                C1C7U.LIZIZ("TemplateManagerKt@e8aa.toastPromptIfApiError$1");
            }
        });
    }

    public static final C11KQ LIZ(AbstractC19484711Kz abstractC19484711Kz, final String str, final String str2) {
        return abstractC19484711Kz.LJIILL(new C09JN() { // from class: X.00R3
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("TemplateManagerKt@e8aa.logApiCall$1");
                String str3 = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(" success logId=");
                sbLIZ.append(((BaseResponse) obj).LIZIZ);
                C20441214yg.LJIIIZ(str3, C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("TemplateManagerKt@e8aa.logApiCall$1");
            }
        }).LJIIL(new C09JN() { // from class: X.00Sr
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("TemplateManagerKt@e8aa.logApiCall$2");
                Throwable th = (Throwable) obj;
                if (th instanceof C477520Io2) {
                    String str3 = str;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append(" fail logId=");
                    sbLIZ.append(((C477520Io2) th).getxTtLogId());
                    C20441214yg.LJ(str3, C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    String str4 = str;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str2);
                    sbLIZ2.append(" fail");
                    C20441214yg.LJ(str4, C2188811AlT.LIZIZ(sbLIZ2));
                }
                C1C7U.LIZIZ("TemplateManagerKt@e8aa.logApiCall$2");
            }
        });
    }

    public static final C11KQ LIZIZ(AbstractC19484711Kz abstractC19484711Kz, final String str, final String str2) {
        return abstractC19484711Kz.LJIIL(new C09JN() { // from class: X.00m5
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("TemplateManagerKt@e8aa.toastDetailIfLocalTest$1");
                Throwable th = (Throwable) obj;
                String str3 = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(" doOnError throwable=");
                sbLIZ.append(th);
                C20441214yg.LJ(str3, C2188811AlT.LIZIZ(sbLIZ));
                if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                    C176600m4.LIZJ(new C020Q(th, str2, 1));
                }
                C1C7U.LIZIZ("TemplateManagerKt@e8aa.toastDetailIfLocalTest$1");
            }
        });
    }
}

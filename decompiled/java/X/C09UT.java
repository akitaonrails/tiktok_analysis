package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: renamed from: X.09UT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09UT extends AbstractC199488133m<Object> {
    public final /* synthetic */ ListenableFuture LLILZIL;
    public final /* synthetic */ C09UN LLILZLL;

    public C09UT(C09UN c09un, ListenableFuture listenableFuture) {
        this.LLILZLL = c09un;
        this.LLILZIL = listenableFuture;
        C09UU.LIZ(listenableFuture, new C11U6<C0X52>() { // from class: X.09UW
            @Override // X.C11U6
            public final void onFailure(Throwable th) {
                this.LIZ.LJIJ(th);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C11U6
            public final void onSuccess(C0X52 c0x52) {
                C2175508fh c2175508fh;
                String str;
                C0X52 c0x522 = c0x52;
                if (c0x522.LIZJ()) {
                    T t = c0x522.LIZIZ;
                    if (t instanceof C0X12) {
                        C0X12 c0x12 = (C0X12) t;
                        C09UN c09un2 = this.LIZ.LLILZLL;
                        List<C080U> list = c0x522.LIZ.LIZLLL;
                        c09un2.getClass();
                        if (list != null) {
                            for (C080U c080u : list) {
                                if ("X-TT-LOGID".equalsIgnoreCase(c080u.LIZ)) {
                                    str = c080u.LIZIZ;
                                    break;
                                }
                            }
                            str = null;
                            c0x12.setRequestId(str);
                        } else {
                            str = null;
                            c0x12.setRequestId(str);
                        }
                    }
                    if ((t instanceof InterfaceC1201180hMa) && (c2175508fh = c0x522.LIZ) != null) {
                        Object obj = c2175508fh.LJFF;
                        if (obj instanceof C1494600ozq) {
                            try {
                                ((InterfaceC1201180hMa) t).setRequestInfo((C1494600ozq) obj);
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                    if (t instanceof BaseResponse) {
                        BaseResponse baseResponse = (BaseResponse) t;
                        if (c0x522.LIZ != null) {
                            if (((Number) C09UX.LIZ.getValue()).intValue() == 1) {
                                C846790XJt.LIZIZ(baseResponse.status_code, baseResponse, c0x522.LIZ.LIZ);
                            } else {
                                C846790XJt.LIZ(baseResponse.status_code, c0x522.LIZ.LIZ, baseResponse.toString());
                            }
                        }
                    }
                    this.LIZ.LJIIZILJ(t);
                    return;
                }
                this.LIZ.LJIJ(new RuntimeException("HttpException"));
            }
        }, EnumC2272608vM.LL);
    }
}

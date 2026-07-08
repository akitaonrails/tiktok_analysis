package X;

import com.ss.android.ugc.aweme.trace.TraceLogNetApi;
import com.ss.android.ugc.aweme.trace.TraceLogUploadRequest;
import com.ss.android.ugc.aweme.trace.TraceLogUploadResponse;
import com.ss.android.ugc.aweme.trace.model.TraceItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Vjk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.trace.impl.TraceLogImpl$uploadRightNowWith4kbLimit$2$1$1", f = "TraceLogImpl.kt", l = {293}, m = "invokeSuspend")
public final class C806100Vjk extends C09AX implements Function1<InterfaceC1364105Vn<? super TraceLogUploadResponse>, Object> {
    public int LL;
    public final /* synthetic */ List<TraceItem> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806100Vjk(List<TraceItem> list, InterfaceC1364105Vn<? super C806100Vjk> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C806100Vjk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super TraceLogUploadResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TraceLogImpl@8707.uploadRightNowWith4kbLimit$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            TraceLogNetApi.TraceLogService value = TraceLogNetApi.LIZ.getValue();
            if (value != null) {
                TraceLogUploadRequest traceLogUploadRequest = new TraceLogUploadRequest(this.LLILLJJLI);
                this.LL = 1;
                obj = value.uploadTraceLogs(traceLogUploadRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TraceLogImpl@8707.uploadRightNowWith4kbLimit$2$1$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("TraceLogImpl@8707.uploadRightNowWith4kbLimit$2$1$1");
        return obj;
    }
}

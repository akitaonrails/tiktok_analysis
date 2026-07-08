package X;

import com.ss.android.ugc.aweme.trace.TraceLogNetApi;
import com.ss.android.ugc.aweme.trace.TraceLogUploadRequest;
import com.ss.android.ugc.aweme.trace.model.TraceItem;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vjh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.trace.impl.TraceLogImpl$directUpload$1", f = "TraceLogImpl.kt", l = {203}, m = "invokeSuspend")
public final class C806070Vjh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806070Vjh(String str, String str2, String str3, String str4, String str5, Map<String, String> map, long j, String str6, InterfaceC1364105Vn<? super C806070Vjh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = map;
        this.LLIZLLLIL = j;
        this.LLJ = str6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C806070Vjh(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TraceLogImpl@8707.directUpload$1");
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
                TraceLogUploadRequest traceLogUploadRequest = new TraceLogUploadRequest(Collections.singletonList(new TraceItem(UUID.randomUUID().toString(), this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, C2286608xc.LJFF(this.LLIZLLLIL), this.LLJ)));
                this.LL = 1;
                if (value.uploadTraceLogs(traceLogUploadRequest, this) == objLJFF) {
                    C1C7U.LIZIZ("TraceLogImpl@8707.directUpload$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TraceLogImpl@8707.directUpload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

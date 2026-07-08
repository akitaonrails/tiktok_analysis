package X;

import com.ss.android.ugc.aweme.client.experiment.UploadVidApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10TL, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10TL extends C09AY implements Function1<UploadVidApi.UploadVidResponse, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10TL(long j, AwS572S0100000_28 awS572S0100000_28, Function0 function0) {
        super(1);
        this.LL = awS572S0100000_28;
        this.LLILLJJLI = function0;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UploadVidApi.UploadVidResponse uploadVidResponse) {
        UploadVidApi.UploadVidResponse uploadVidResponse2 = uploadVidResponse;
        String str = uploadVidResponse2.vid;
        if (str != null) {
            C0C5P.LIZJ().getClass();
            C0C5P.LIZ(str);
        }
        if (uploadVidResponse2.statusCode == 0) {
            this.LL.invoke();
        } else {
            this.LLILLJJLI.invoke();
        }
        C10TK c10tk = C10TK.LIZ;
        long j = this.LLILLL;
        int i = uploadVidResponse2.statusCode;
        c10tk.getClass();
        C10TK.LIZIZ(i, j);
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.android.livesdk.guide.model.TaskReportResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0hbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210580hbk extends C09AY implements Function2<Integer, Throwable, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, String, TaskReportResponse.Data, Unit> LLILZ;
    public final /* synthetic */ Function2<Integer, Throwable, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1210580hbk(String str, long j, long j2, InterfaceC1631620sYq<? super Integer, ? super String, ? super TaskReportResponse.Data, Unit> interfaceC1631620sYq, Function2<? super Integer, ? super Throwable, Unit> function2) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = interfaceC1631620sYq;
        this.LLILZIL = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Throwable th) {
        int iIntValue = num.intValue();
        if (iIntValue > 0) {
            C1219670hqP.LJII(this.LL, this.LLILLJJLI, this.LLILLL, iIntValue, this.LLILZ, this.LLILZIL);
        } else {
            this.LLILZIL.invoke(Integer.valueOf(iIntValue), th);
        }
        return Unit.LIZ;
    }
}

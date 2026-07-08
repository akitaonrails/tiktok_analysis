package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.bytedance.android.livesdk.guide.model.TaskUtilExtra;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134600fdC extends C09AY implements InterfaceC1631620sYq<Integer, String, TaskInfoResponse.Data, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C05XL<TaskInfoResponse.Data> LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134600fdC(int i, long j, long j2, String str, C099F c099f, boolean z) {
        super(3);
        this.LL = str;
        this.LLILLJJLI = c099f;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = z;
        this.LLILZLL = i;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, String str, TaskInfoResponse.Data data) {
        TaskUtilExtra taskUtilExtra;
        int iIntValue = num.intValue();
        String str2 = str;
        TaskInfoResponse.Data data2 = data;
        if (!Intrinsics.LJFF(this.LL, EnumC1134590fdB.NEXT_DAY_TASK_INFO.getScene()) && data2 != null && (taskUtilExtra = data2.taskUtilExtra) != null) {
            long j = taskUtilExtra.endOfDayTs;
            C1134560fd8 c1134560fd8 = C1134560fd8.LIZ;
            C1134560fd8.LIZ(j);
        }
        this.LLILLJJLI.LJIIZILJ(data2);
        C1134320fck.LIZLLL(C1134320fck.LIZ, this.LL, true, SystemClock.elapsedRealtime() - this.LLILLL, iIntValue, this.LLILZ, str2, 0, true, data2, this.LLILZIL, this.LLILZLL);
        return Unit.LIZ;
    }
}

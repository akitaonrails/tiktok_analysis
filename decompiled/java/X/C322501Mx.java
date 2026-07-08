package X;

import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.TaskApiUtilsKt$requestTaskInfoInternal$finalReject$1", f = "TaskApiUtils.kt", l = {146}, m = "invokeSuspend")
public final class C322501Mx extends C09AX implements InterfaceC1631620sYq<Integer, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Long LLJILJIL;
    public final /* synthetic */ HashMap<String, Object> LLJILJILJ;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, String, TaskInfoResponse.Data, Unit> LLJILLL;
    public final /* synthetic */ Function2<Integer, Throwable, Unit> LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C322501Mx(long j, int i, int i2, int i3, long j2, int i4, String str, String str2, Long l, HashMap<String, Object> map, InterfaceC1631620sYq<? super Integer, ? super String, ? super TaskInfoResponse.Data, Unit> interfaceC1631620sYq, Function2<? super Integer, ? super Throwable, Unit> function2, InterfaceC1364105Vn<? super C322501Mx> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = j;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = i3;
        this.LLIZLLLIL = j2;
        this.LLJ = i4;
        this.LLJI = str;
        this.LLJIJIL = str2;
        this.LLJILJIL = l;
        this.LLJILJILJ = map;
        this.LLJILLL = interfaceC1631620sYq;
        this.LLJJ = function2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskApiUtilsKt@ac6a.requestTaskInfoInternal$finalReject$1");
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
            int i2 = this.LLILLJJLI;
            Object obj2 = this.LLILLL;
            if (i2 > 0) {
                long j = this.LLILZ;
                int i3 = this.LLILZIL;
                int i4 = this.LLILZLL;
                int i5 = this.LLIZ;
                long j2 = this.LLIZLLLIL;
                int i6 = this.LLJ - 1;
                String str = this.LLJI;
                String str2 = this.LLJIJIL;
                Long l = this.LLJILJIL;
                HashMap<String, Object> map = this.LLJILJILJ;
                InterfaceC1631620sYq<Integer, String, TaskInfoResponse.Data, Unit> interfaceC1631620sYq = this.LLJILLL;
                Function2<Integer, Throwable, Unit> function2 = this.LLJJ;
                this.LL = 1;
                if (C1219670hqP.LJFF(j, i3, i4, i5, j2, i6, str, str2, false, l, map, interfaceC1631620sYq, function2, this) == objLJFF) {
                    C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskInfoInternal$finalReject$1");
                    return objLJFF;
                }
            } else {
                this.LLJJ.invoke(C2286608xc.LJ(i2), (Throwable) obj2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskInfoInternal$finalReject$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Integer num, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        C322501Mx c322501Mx = new C322501Mx(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
        c322501Mx.LLILLJJLI = iIntValue;
        c322501Mx.LLILLL = th;
        return c322501Mx.invokeSuspend(Unit.LIZ);
    }
}

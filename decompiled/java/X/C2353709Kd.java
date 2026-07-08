package X;

import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.TaskApiUtilsKt$requestTaskInfo$2", f = "TaskApiUtils.kt", l = {70, 119}, m = "invokeSuspend")
public final class C2353709Kd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends TaskInfoResponse.Data>>, Object> {
    public C099F LL;
    public int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ Long LLJILJIL;
    public final /* synthetic */ HashMap<String, Object> LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ boolean LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2353709Kd(int i, int i2, int i3, int i4, long j, long j2, Long l, String str, String str2, String str3, HashMap map, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
        this.LLIZ = j2;
        this.LLIZLLLIL = i4;
        this.LLJ = str;
        this.LLJI = str2;
        this.LLJIJIL = z;
        this.LLJILJIL = l;
        this.LLJILJILJ = map;
        this.LLJILLL = str3;
        this.LLJJ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        long j = this.LLILLL;
        int i = this.LLILZ;
        int i2 = this.LLILZIL;
        int i3 = this.LLILZLL;
        long j2 = this.LLIZ;
        int i4 = this.LLIZLLLIL;
        String str = this.LLJ;
        String str2 = this.LLJI;
        boolean z = this.LLJIJIL;
        return new C2353709Kd(i, i2, i3, i4, j, j2, this.LLJILJIL, str, str2, this.LLJILLL, this.LLJILJILJ, interfaceC1364105Vn, z, this.LLJJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2353709Kd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends TaskInfoResponse.Data>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

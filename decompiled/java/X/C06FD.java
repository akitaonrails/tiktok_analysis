package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06FD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakFakeWriteDataSource$onReceiveFakeWriteData$1", f = "StreakFakeWriteDataSource.kt", l = {}, m = "invokeSuspend")
public final class C06FD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<?, ?> LL;
    public final /* synthetic */ C06FA LLILLJJLI;
    public final /* synthetic */ Object LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<StreakData, String, Boolean, Unit> LLILZ;
    public final /* synthetic */ Function1<String, StreakData> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C06FD(Map<?, ?> map, C06FA c06fa, Object obj, InterfaceC1631620sYq<? super StreakData, ? super String, ? super Boolean, Unit> interfaceC1631620sYq, Function1<? super String, StreakData> function1, InterfaceC1364105Vn<? super C06FD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = c06fa;
        this.LLILLL = obj;
        this.LLILZ = interfaceC1631620sYq;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06FD(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r52) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06FD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

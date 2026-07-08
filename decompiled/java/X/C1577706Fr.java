package X;

import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakServerDataSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakServerDataSource$onReceiveCmdMsg$1", f = "StreakServerDataSource.kt", l = {}, m = "invokeSuspend")
public final class C1577706Fr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BusinessCommandMessage LLILLJJLI;
    public final /* synthetic */ Object LLILLL;
    public final /* synthetic */ InterfaceC1631630sYr<StreakData, String, Boolean, Integer, Unit> LLILZ;
    public final /* synthetic */ StreakServerDataSource LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1577706Fr(BusinessCommandMessage businessCommandMessage, Object obj, InterfaceC1631630sYr<? super StreakData, ? super String, ? super Boolean, ? super Integer, Unit> interfaceC1631630sYr, StreakServerDataSource streakServerDataSource, InterfaceC1364105Vn<? super C1577706Fr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = businessCommandMessage;
        this.LLILLL = obj;
        this.LLILZ = interfaceC1631630sYr;
        this.LLILZIL = streakServerDataSource;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1577706Fr c1577706Fr = new C1577706Fr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1577706Fr.LL = obj;
        return c1577706Fr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:3:0x0019, B:5:0x001f, B:7:0x003c, B:8:0x0040, B:10:0x009b, B:11:0x009f, B:14:0x00c5, B:13:0x00b7), top: B:207:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARN: Type inference failed for: r15v1, types: [T, com.bytedance.im.core.common.statusmsg.BusinessCommandMessage] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1577706Fr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakServerDataSource$onReceiveCmdMsg$handleResultInner$1", f = "StreakServerDataSource.kt", l = {}, m = "invokeSuspend")
public final class C1576106Fb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StreakData LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ BusinessCommandMessage LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1576106Fb(StreakData streakData, boolean z, String str, BusinessCommandMessage businessCommandMessage, int i, InterfaceC1364105Vn<? super C1576106Fb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = streakData;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = businessCommandMessage;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1576106Fb(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1576106Fb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

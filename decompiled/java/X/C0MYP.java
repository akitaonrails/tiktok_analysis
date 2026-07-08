package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MYP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftMusicRestoreHandler$restoreWithNet$2", f = "DraftMusicRestoreHandler.kt", l = {149}, m = "invokeSuspend")
public final class C0MYP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DraftFileRestoreResult>>, Object> {
    public int LL;
    public final /* synthetic */ C389010FNb LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MYP(C389010FNb c389010FNb, InterfaceC1364105Vn<? super C0MYP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c389010FNb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MYP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MYP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DraftFileRestoreResult>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

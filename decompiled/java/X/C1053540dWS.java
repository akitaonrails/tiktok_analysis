package X;

import com.ss.android.ugc.aweme.history.AdWebHistoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dWS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryViewModel$loadHistory$1", f = "AdWebHistoryViewModel.kt", l = {64, 66, 69, 70}, m = "invokeSuspend")
public final class C1053540dWS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ AdWebHistoryViewModel LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053540dWS(AdWebHistoryViewModel adWebHistoryViewModel, long j, InterfaceC1364105Vn<? super C1053540dWS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = adWebHistoryViewModel;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1053540dWS(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082 A[Catch: Exception -> 0x00a6, TRY_ENTER, TryCatch #0 {Exception -> 0x00a6, blocks: (B:8:0x001a, B:47:0x0093, B:48:0x0096, B:40:0x0082, B:43:0x0087), top: B:65:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053540dWS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

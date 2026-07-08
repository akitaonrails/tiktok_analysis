package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.sharedar.viewmodel.SessionShareViewModel$realQueryFollowingFriendsV1$2", f = "SessionShareViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2385609Wk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<C2386409Ws>>, Object> {
    public final /* synthetic */ C2385709Wl LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2385609Wk(C2385709Wl c2385709Wl, long j, InterfaceC1364105Vn<? super C2385609Wk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2385709Wl;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2385609Wk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2385609Wk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<C2386409Ws>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

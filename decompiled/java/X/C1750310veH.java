package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PageLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0veH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$openShareDialog$1", f = "PdpViewModel.kt", l = {4027}, m = "invokeSuspend")
public final class C1750310veH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PageLinkInfo LL;
    public int LLILLJJLI;
    public final /* synthetic */ PdpViewModel LLILLL;
    public final /* synthetic */ Activity LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750310veH(PdpViewModel pdpViewModel, Activity activity, InterfaceC1364105Vn<? super C1750310veH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = pdpViewModel;
        this.LLILZ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1750310veH(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0373 A[PHI: r5
      0x0373: PHI (r5v7 java.lang.String) = (r5v3 java.lang.String), (r5v8 java.lang.String) binds: [B:193:0x0371, B:191:0x036d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037b A[PHI: r5
      0x037b: PHI (r5v4 java.lang.String) = (r5v3 java.lang.String), (r5v7 java.lang.String), (r5v7 java.lang.String) binds: [B:193:0x0371, B:195:0x0375, B:197:0x0379] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[PHI: r20
      0x0054: PHI (r20v3 java.lang.String) = (r20v0 java.lang.String), (r20v4 java.lang.String) binds: [B:20:0x0052, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[PHI: r20
      0x005e: PHI (r20v1 java.lang.String) = (r20v0 java.lang.String), (r20v3 java.lang.String), (r20v3 java.lang.String) binds: [B:20:0x0052, B:22:0x0056, B:24:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1750310veH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

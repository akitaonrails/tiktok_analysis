package X;

import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0whK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment$onViewCreated$5$1$1$1", f = "CreatorRankingPageDialogFragment.kt", l = {}, m = "invokeSuspend")
public final class C1790640whK extends C09AX implements Function2<InterfaceC1785530wZ5, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreatorRankingPageDialogFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1790640whK(CreatorRankingPageDialogFragment creatorRankingPageDialogFragment, InterfaceC1364105Vn<? super C1790640whK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingPageDialogFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1790640whK c1790640whK = new C1790640whK(this.LLILLJJLI, interfaceC1364105Vn);
        c1790640whK.LL = obj;
        return c1790640whK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0468 A[PHI: r13
      0x0468: PHI (r13v3 long) = (r13v2 long), (r13v5 long) binds: [B:201:0x0464, B:122:0x0305] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b1  */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.07xC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 2337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1790640whK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1785530wZ5 interfaceC1785530wZ5, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1785530wZ5, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

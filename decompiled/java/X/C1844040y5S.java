package X;

import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.Review;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0y5S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel$deleteReview$1", f = "ReviewViewModel.kt", l = {231}, m = "invokeSuspend")
public final class C1844040y5S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Review LLILLJJLI;
    public final /* synthetic */ ReviewViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1844040y5S(Review review, ReviewViewModel reviewViewModel, InterfaceC1364105Vn<? super C1844040y5S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = review;
        this.LLILLL = reviewViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1844040y5S(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d1  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1844040y5S.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFirstlyCommentListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS46S0100100_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0OYK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel$onFirstlyCommentListRefresh$1", f = "BulletinCommentListViewModel.kt", l = {136}, m = "invokeSuspend")
public final class C0OYK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ BulletinCommentListViewModel LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C0OYR>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0OYK(BulletinCommentListViewModel bulletinCommentListViewModel, InterfaceC1364105Vn<? super AbstractC316870CbV<C0OYR>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C0OYK> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = bulletinCommentListViewModel;
        this.LLILZ = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OYK(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        AbstractC316870CbV<C0OYR> c316640Cb8;
        boolean zBooleanValue;
        Object objN = obj;
        C1C7U.LIZ("BulletinCommentListViewModel@38e.onFirstlyCommentListRefresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean zBooleanValue2 = false;
        if (i != 0) {
            if (i == 1) {
                j = this.LL;
                C155000ia.LIZIZ(objN);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objN);
            BulletinCommentListViewModel bulletinCommentListViewModel = this.LLILLL;
            j = bulletinCommentListViewModel.LLILLL;
            List<? extends InterfaceC1891350zJl> list = BulletinCommentListViewModel.LLJILLL;
            AbstractC316870CbV<C0OYR> abstractC316870CbV = BulletinCommentListViewModel.LLJJ;
            if (bulletinCommentListViewModel.LLJIJIL && j == BulletinCommentListViewModel.LLJILJILJ && list != null && abstractC316870CbV != null) {
                InterfaceC1364105Vn<AbstractC316870CbV<C0OYR>> interfaceC1364105Vn = this.LLILZ;
                C189200o6.m2constructorimpl(abstractC316870CbV);
                interfaceC1364105Vn.resumeWith(abstractC316870CbV);
                this.LLILLL.setState(new AwS46S0100100_9(list, (List<? extends InterfaceC1891350zJl>) j, 1));
                if (list.isEmpty()) {
                    this.LLILLL.wQ2(true, false, null, false);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BulletinCommentListViewModel@38e.onFirstlyCommentListRefresh$1");
                return unit;
            }
            bulletinCommentListViewModel.xQ2(C0OY7.LOADING, null);
            C0OTP c0otp = (C0OTP) this.LLILLL.LLJILJIL.getValue().getOperator();
            String strValueOf = String.valueOf(j);
            this.LL = j;
            this.LLILLJJLI = 1;
            objN = c0otp.N(0, strValueOf, 8, 0, this);
            if (objN == objLJFF) {
                C1C7U.LIZIZ("BulletinCommentListViewModel@38e.onFirstlyCommentListRefresh$1");
                return objLJFF;
            }
        }
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) objN;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            BulletinFirstlyCommentListResponse bulletinFirstlyCommentListResponse = (BulletinFirstlyCommentListResponse) ((C1623606Xi) abstractC1623806Xk).LIZ;
            List<InterfaceC1891350zJl> listVQ2 = this.LLILLL.vQ2(bulletinFirstlyCommentListResponse.comments);
            if (Intrinsics.LJFF(bulletinFirstlyCommentListResponse.hasMore, true)) {
                c316640Cb8 = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, new C0OYR(C1527905yX.LIZ(bulletinFirstlyCommentListResponse.cursor), false), listVQ2, 1);
            } else {
                AbstractC316870CbV.LIZ.getClass();
                c316640Cb8 = new C316640Cb8<>(listVQ2);
            }
            InterfaceC1364105Vn<AbstractC316870CbV<C0OYR>> interfaceC1364105Vn2 = this.LLILZ;
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn2.resumeWith(c316640Cb8);
            this.LLILLL.setState(new AwS46S0100100_9(listVQ2, (List<? extends InterfaceC1891350zJl>) j, 2));
            BulletinCommentListViewModel.LLJILJILJ = j;
            BulletinCommentListViewModel.LLJILLL = listVQ2;
            BulletinCommentListViewModel.LLJJ = c316640Cb8;
            BulletinCommentListViewModel bulletinCommentListViewModel2 = this.LLILLL;
            if (j == bulletinCommentListViewModel2.LLILLL) {
                boolean zIsEmpty = listVQ2.isEmpty();
                Boolean bool = bulletinFirstlyCommentListResponse.hasMore;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                Boolean bool2 = bulletinFirstlyCommentListResponse.hasFoldComment;
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                }
                bulletinCommentListViewModel2.wQ2(zIsEmpty, zBooleanValue, C2286608xc.LJ(C1527905yX.LIZ(bulletinFirstlyCommentListResponse.foldCommentCursor)), zBooleanValue2);
            }
        } else {
            InterfaceC1364105Vn<AbstractC316870CbV<C0OYR>> interfaceC1364105Vn3 = this.LLILZ;
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            Exception exc = new Exception();
            c317290CcB.getClass();
            C316650Cb9 c316650Cb9 = new C316650Cb9(exc);
            C189200o6.m2constructorimpl(c316650Cb9);
            interfaceC1364105Vn3.resumeWith(c316650Cb9);
            BulletinCommentListViewModel bulletinCommentListViewModel3 = this.LLILLL;
            if (j == bulletinCommentListViewModel3.LLILLL) {
                bulletinCommentListViewModel3.xQ2(C0OY7.REFRESH_ERR, null);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinCommentListViewModel@38e.onFirstlyCommentListRefresh$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

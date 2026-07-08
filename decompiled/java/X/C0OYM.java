package X;

import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFirstlyCommentListResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0OYM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel$onFoldCommentListLoadMore$1", f = "BulletinCommentListViewModel.kt", l = {187}, m = "invokeSuspend")
public final class C0OYM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinCommentListViewModel LLILLJJLI;
    public final /* synthetic */ C0OYR LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C0OYR>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0OYM(BulletinCommentListViewModel bulletinCommentListViewModel, C0OYR c0oyr, InterfaceC1364105Vn<? super AbstractC316870CbV<C0OYR>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C0OYM> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLJJLI = bulletinCommentListViewModel;
        this.LLILLL = c0oyr;
        this.LLILZ = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OYM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        boolean zBooleanValue;
        C1C7U.LIZ("BulletinCommentListViewModel@38e.onFoldCommentListLoadMore$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.xQ2(C0OY7.DEFAULT, null);
            C0OTP c0otp = (C0OTP) this.LLILLJJLI.LLJILJIL.getValue().getOperator();
            String strValueOf = String.valueOf(this.LLILLJJLI.LLILLL);
            int i2 = this.LLILLL.LIZ;
            this.LL = 1;
            obj = c0otp.N(i2, strValueOf, 20, 4, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinCommentListViewModel@38e.onFoldCommentListLoadMore$1");
                return objLJFF;
            }
        }
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            BulletinFirstlyCommentListResponse bulletinFirstlyCommentListResponse = (BulletinFirstlyCommentListResponse) ((C1623606Xi) abstractC1623806Xk).LIZ;
            List<InterfaceC1891350zJl> listVQ2 = this.LLILLJJLI.vQ2(bulletinFirstlyCommentListResponse.comments);
            if (Intrinsics.LJFF(bulletinFirstlyCommentListResponse.hasMore, true)) {
                InterfaceC1364105Vn<AbstractC316870CbV<C0OYR>> interfaceC1364105Vn = this.LLILZ;
                C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, new C0OYR(C1527905yX.LIZ(bulletinFirstlyCommentListResponse.cursor), true), listVQ2, 1);
                C189200o6.m2constructorimpl(c323380Cm0LJ);
                interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
            } else {
                InterfaceC1364105Vn<AbstractC316870CbV<C0OYR>> interfaceC1364105Vn2 = this.LLILZ;
                AbstractC316870CbV.LIZ.getClass();
                C316640Cb8 c316640Cb8 = new C316640Cb8(listVQ2);
                C189200o6.m2constructorimpl(c316640Cb8);
                interfaceC1364105Vn2.resumeWith(c316640Cb8);
            }
            List<? extends InterfaceC1891350zJl> listLIZ = this.LLILLJJLI.getState().LL.LIZ();
            if (listLIZ != null) {
                arrayList = new ArrayList(listLIZ);
            } else {
                arrayList = new ArrayList();
            }
            arrayList.addAll(listVQ2);
            this.LLILLJJLI.setState(new AwS588S0100000_9(arrayList, (List<InterfaceC1891350zJl>) 660));
            BulletinCommentListViewModel bulletinCommentListViewModel = this.LLILLJJLI;
            boolean zIsEmpty = arrayList.isEmpty();
            Boolean bool = bulletinFirstlyCommentListResponse.hasMore;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            bulletinCommentListViewModel.wQ2(zIsEmpty, false, C2286608xc.LJ(C1527905yX.LIZ(bulletinFirstlyCommentListResponse.cursor)), zBooleanValue);
        } else {
            this.LLILLJJLI.xQ2(C0OY7.LOAD_MORE_ERR, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinCommentListViewModel@38e.onFoldCommentListLoadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

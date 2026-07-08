package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountCheckResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS123S1100000_9;
import kotlin.jvm.internal.AwS60S1000000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ONd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel$setName$1", f = "BulletinAccountEditViewModel.kt", l = {119, 125}, m = "invokeSuspend")
public final class C618350ONd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ BulletinBoardEditViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C618350ONd(BulletinBoardEditViewModel bulletinBoardEditViewModel, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = bulletinBoardEditViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C618350ONd(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardEditViewModel@acc0.setName$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLL.setState(new AwS123S1100000_9((BulletinAccountCheckResponse) obj, this.LLILLJJLI, 1));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BulletinBoardEditViewModel@acc0.setName$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.length() == 0) {
                this.LLILLL.setState(AFwS240S0000000_9.get$arr$(339));
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("BulletinBoardEditViewModel@acc0.setName$1");
                return unit2;
            }
            if (Intrinsics.LJFF(this.LLILLL.LLILZ, this.LLILLJJLI)) {
                this.LLILLL.setState(new AwS60S1000000_9(this.LLILLJJLI, 3));
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("BulletinBoardEditViewModel@acc0.setName$1");
                return unit3;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinBoardEditViewModel@acc0.setName$1");
                return objLJFF;
            }
        }
        this.LLILLL.setState(AFwS240S0000000_9.get$arr$(340));
        C0OIU c0oiu = (C0OIU) this.LLILLL.vQ2().getOperator();
        String str = this.LLILLJJLI;
        this.LL = 2;
        obj = c0oiu.LLF(str, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("BulletinBoardEditViewModel@acc0.setName$1");
            return objLJFF;
        }
        this.LLILLL.setState(new AwS123S1100000_9((BulletinAccountCheckResponse) obj, this.LLILLJJLI, 1));
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinBoardEditViewModel@acc0.setName$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel$updateCareModeAndFilterAllParallel$2$1", f = "CreatorCareModeNewDesignViewModel.kt", l = {54}, m = "invokeSuspend")
public final class C1414805gI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends String>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CreatorCareModeNewDesignViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1414805gI(CreatorCareModeNewDesignViewModel creatorCareModeNewDesignViewModel, InterfaceC1364105Vn<? super C1414805gI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = creatorCareModeNewDesignViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1414805gI c1414805gI = new C1414805gI(this.LLILLL, interfaceC1364105Vn);
        c1414805gI.LLILLJJLI = obj;
        return c1414805gI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorCareModeNewDesignViewModel@4e58.updateCareModeAndFilterAllParallel$2$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AnonymousClass0957[] anonymousClass0957Arr = {C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1414605gG(this.LLILLL, null), 3), C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1414705gH(this.LLILLL, null), 3)};
            this.LL = 1;
            obj = C1D9F.LIZIZ(anonymousClass0957Arr, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CreatorCareModeNewDesignViewModel@4e58.updateCareModeAndFilterAllParallel$2$1");
                return objLJFF;
            }
        }
        String statusMsg = ((BaseResponse) ListProtector.get((List) obj, 0)).getStatusMsg();
        C189200o6.m2constructorimpl(statusMsg);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(statusMsg);
        C1C7U.LIZIZ("CreatorCareModeNewDesignViewModel@4e58.updateCareModeAndFilterAllParallel$2$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.base.share.QuickShareCandidate;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.065X, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareUtilsKt$acceptedCandidateKeys$quickShareData$1$1", f = "QuickShareUtils.kt", l = {215}, m = "invokeSuspend")
public final class C065X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMContact>>, Object> {
    public int LL;
    public final /* synthetic */ List<QuickShareCandidate> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C065X(List<QuickShareCandidate> list, InterfaceC1364105Vn<? super C065X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C065X(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickShareUtilsKt@56be.acceptedCandidateKeys$quickShareData$1$1");
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
            C1365990leP c1365990leP = C1365990leP.LIZ;
            List<QuickShareCandidate> list = this.LLILLJJLI;
            this.LL = 1;
            obj = C1365990leP.LIZ(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("QuickShareUtilsKt@56be.acceptedCandidateKeys$quickShareData$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("QuickShareUtilsKt@56be.acceptedCandidateKeys$quickShareData$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMContact>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

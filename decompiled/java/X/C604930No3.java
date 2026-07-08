package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinSettingsChildViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0No3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinSettingsChildViewModel$updateAutoSharePostState$1", f = "BulletinSettingsChildViewModel.kt", l = {430}, m = "invokeSuspend")
public final class C604930No3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ BulletinSettingsChildViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C604930No3(BulletinSettingsChildViewModel bulletinSettingsChildViewModel, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = bulletinSettingsChildViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604930No3(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinSettingsChildViewModel@3de0.updateAutoSharePostState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C604750Nnl c604750Nnl = C604750Nnl.LIZ;
                boolean z = this.LLILLJJLI;
                this.LL = 1;
                obj = c604750Nnl.LJII(z, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BulletinSettingsChildViewModel@3de0.updateAutoSharePostState$1");
                    return objLJFF;
                }
            }
            AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj;
            if (abstractC1623806Xk instanceof C1623606Xi) {
                this.LLILLL.LLJ = Boolean.valueOf(this.LLILLJJLI);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BulletinSettingsChildViewModel updateAutoSharePostsState to ");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(" success, perform update ui");
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BulletinSettingsChildViewModel updateAutoSharePostsState to ");
                sbLIZ2.append(this.LLILLJJLI);
                sbLIZ2.append(" failed, result ");
                sbLIZ2.append(abstractC1623806Xk);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("BulletinSettingsChildViewModel updateAutoSharePostsState to ");
            sbLIZ3.append(this.LLILLJJLI);
            sbLIZ3.append(" failed, exception ");
            sbLIZ3.append(e);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
        }
        this.LLILLL.manualListRefresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinSettingsChildViewModel@3de0.updateAutoSharePostState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

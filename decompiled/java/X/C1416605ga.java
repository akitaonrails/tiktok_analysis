package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeNewDesignFragment;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeNewDesignFragment$onViewCreated$5$1$1", f = "CreatorCareModeNewDesignFragment.kt", l = {215}, m = "invokeSuspend")
public final class C1416605ga extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreatorCareModeNewDesignFragment LLILLJJLI;
    public final /* synthetic */ C197039127h LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1416605ga(CreatorCareModeNewDesignFragment creatorCareModeNewDesignFragment, C197039127h c197039127h, InterfaceC1364105Vn<? super C1416605ga> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorCareModeNewDesignFragment;
        this.LLILLL = c197039127h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1416605ga(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objVQ2;
        C632200Oqw c632200Oqw;
        String errorMsg;
        boolean z;
        C1C7U.LIZ("CreatorCareModeNewDesignFragment@f434.onViewCreated$5$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                objVQ2 = ((C189200o6) obj).m10unboximpl();
            } else {
                C155000ia.LIZIZ(obj);
                CreatorCareModeNewDesignViewModel creatorCareModeNewDesignViewModelVR = this.LLILLJJLI.VR();
                boolean z3 = this.LLILLJJLI.LLJJIJIIJIL;
                this.LL = 1;
                objVQ2 = creatorCareModeNewDesignViewModelVR.vQ2(z3, this);
                if (objVQ2 == objLJFF) {
                    C1C7U.LIZIZ("CreatorCareModeNewDesignFragment@f434.onViewCreated$5$1$1");
                    return objLJFF;
                }
            }
            C197039127h c197039127h = this.LLILLL;
            CreatorCareModeNewDesignFragment creatorCareModeNewDesignFragment = this.LLILLJJLI;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objVQ2);
            if (thM5exceptionOrNullimpl == null) {
                String string = (String) objVQ2;
                c197039127h.setLoading(false);
                C1389890mGx c1389890mGx = new C1389890mGx(creatorCareModeNewDesignFragment);
                if (string.length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    string = creatorCareModeNewDesignFragment.getString(2131829164);
                }
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            } else {
                c197039127h.setLoading(false);
                String string2 = null;
                if (thM5exceptionOrNullimpl instanceof C632200Oqw) {
                    c632200Oqw = (C632200Oqw) thM5exceptionOrNullimpl;
                } else {
                    c632200Oqw = null;
                }
                if (c632200Oqw != null && (errorMsg = c632200Oqw.getErrorMsg()) != null) {
                    if (errorMsg.length() <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        string2 = errorMsg;
                    }
                }
                C1389890mGx c1389890mGx2 = new C1389890mGx(creatorCareModeNewDesignFragment);
                if (string2 != null && string2.length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    string2 = creatorCareModeNewDesignFragment.getString(2131835079);
                }
                c1389890mGx2.LJIIJ(string2);
                c1389890mGx2.LJIIJJI();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CreatorCareModeNewDesignFragment@f434.onViewCreated$5$1$1");
            return unit;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.setLoading(false);
            throw e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

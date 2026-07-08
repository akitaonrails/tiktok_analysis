package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS271S0000000_28;
import njp.a;

/* JADX INFO: renamed from: X.0zYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel$requestNotice$1", f = "NotificationFragmentV2ViewModel.kt", l = {177}, m = "invokeSuspend")
public final class C1900770zYx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NotificationFragmentV2ViewModel LLILLJJLI;
    public final /* synthetic */ EnumC1900710zYr LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1900770zYx(NotificationFragmentV2ViewModel notificationFragmentV2ViewModel, EnumC1900710zYr enumC1900710zYr, InterfaceC1364105Vn<? super C1900770zYx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = notificationFragmentV2ViewModel;
        this.LLILLL = enumC1900710zYr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1900770zYx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLIZIZ;
        C491001vg c491001vg;
        Throwable th;
        C1C7U.LIZ("NotificationFragmentV2ViewModel@a7ac.requestNotice$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            if (!zLIZIZ) {
                NotificationFragmentV2ViewModel notificationFragmentV2ViewModel = this.LLILLJJLI;
                if (!notificationFragmentV2ViewModel.LLILZLL) {
                    notificationFragmentV2ViewModel.setState(AFwS271S0000000_28.get$arr$(401));
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("NotificationFragmentV2ViewModel@a7ac.requestNotice$1");
                return unit;
            }
            C1901380zZw.LIZ.getClass();
            if (C1901380zZw.LIZ()) {
                EnumC1901370zZv.LLIZ.LJI();
                EnumC1901370zZv.LLIZLLLIL.LJI();
            }
            NotificationFragmentV2ViewModel notificationFragmentV2ViewModel2 = this.LLILLJJLI;
            if (!notificationFragmentV2ViewModel2.LLILZLL) {
                notificationFragmentV2ViewModel2.setState(AFwS271S0000000_28.get$arr$(402));
            }
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("NotificationFragmentV2ViewModel", "FirstInit: Creator request");
            this.LLILLJJLI.LLILZ.getValue().getClass();
            C1901030zZN c1901030zZN = new C1901030zZN();
            C1901040zZO.LIZ.getClass();
            String strLIZ = C1901040zZO.LIZ();
            boolean needMarkRead = this.LLILLL.getNeedMarkRead();
            boolean needMarkReadAll = this.LLILLL.getNeedMarkReadAll();
            EnumC1900710zYr enumC1900710zYr = this.LLILLL;
            this.LL = 1;
            obj = C1900780zYy.LIZ(c1901030zZN, strLIZ, needMarkRead, needMarkReadAll, enumC1900710zYr, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NotificationFragmentV2ViewModel@a7ac.requestNotice$1");
                return objLJFF;
            }
        }
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj;
        C1901380zZw.LIZ.getClass();
        if (C1901380zZw.LIZ()) {
            EnumC1901370zZv.LLIZLLLIL.LJFF();
        }
        String message = null;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            C1623606Xi c1623606Xi = (C1623606Xi) abstractC1623806Xk;
            if (((CreatorNoticeResponse) c1623606Xi.LIZ).tabDataModel != null && (!r0.isEmpty())) {
                z = true;
            }
            if (z) {
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LJI("NotificationFragmentV2ViewModel", "NoticeResponse is Success");
                if (C1900730zYt.LIZJ.contains(this.LLILLL)) {
                    C1901150zZZ c1901150zZZ = C1901150zZZ.LIZJ;
                    T t = c1623606Xi.LIZ;
                    synchronized (c1901150zZZ) {
                        C1900900zZA c1900900zZALJ = c1901150zZZ.LJ();
                        if (c1900900zZALJ != null) {
                            c1900900zZALJ.LJ(t);
                            c1900900zZALJ.LIZJ = true;
                        }
                    }
                }
                this.LLILLJJLI.vQ2();
                this.LLILLJJLI.yQ2(null, (CreatorNoticeResponse) c1623606Xi.LIZ);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("NotificationFragmentV2ViewModel@a7ac.requestNotice$1");
                return unit2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FirstInit: Creator request, Request Error ");
        if (abstractC1623806Xk instanceof C491001vg) {
            c491001vg = (C491001vg) abstractC1623806Xk;
        } else {
            c491001vg = null;
        }
        if (c491001vg != null && (th = c491001vg.LIZ) != null) {
            message = th.getMessage();
        }
        sbLIZ.append(message);
        C1720106oR.LIZ("NotificationFragmentV2ViewModel", C2188811AlT.LIZIZ(sbLIZ));
        NotificationFragmentV2ViewModel notificationFragmentV2ViewModel3 = this.LLILLJJLI;
        if (!notificationFragmentV2ViewModel3.LLILZLL) {
            notificationFragmentV2ViewModel3.setState(AFwS271S0000000_28.get$arr$(401));
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("NotificationFragmentV2ViewModel@a7ac.requestNotice$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

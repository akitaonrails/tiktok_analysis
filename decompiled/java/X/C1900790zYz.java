package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel$preloadCreatorNotice$1", f = "MultiViewModel.kt", l = {1666}, m = "invokeSuspend")
public final class C1900790zYz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public EnumC1900710zYr LL;
    public int LLILLJJLI;
    public final /* synthetic */ MultiViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1900790zYz(MultiViewModel multiViewModel, InterfaceC1364105Vn<? super C1900790zYz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = multiViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1900790zYz(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1900710zYr enumC1900710zYr;
        C1C7U.LIZ("MultiViewModel@a25.preloadCreatorNotice$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                enumC1900710zYr = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            enumC1900710zYr = EnumC1900710zYr.PRELOAD;
            this.LLILLL.LLJJIII.getValue().getClass();
            C1901030zZN c1901030zZN = new C1901030zZN();
            C1901040zZO.LIZ.getClass();
            String strLIZ = C1901040zZO.LIZ();
            boolean needMarkRead = enumC1900710zYr.getNeedMarkRead();
            boolean needMarkReadAll = enumC1900710zYr.getNeedMarkReadAll();
            this.LL = enumC1900710zYr;
            this.LLILLJJLI = 1;
            obj = C1900780zYy.LIZ(c1901030zZN, strLIZ, needMarkRead, needMarkReadAll, enumC1900710zYr, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MultiViewModel@a25.preloadCreatorNotice$1");
                return objLJFF;
            }
        }
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Preload：");
        sbLIZ.append(enumC1900710zYr);
        sbLIZ.append(" NoticeResponse is ");
        sbLIZ.append(abstractC1623806Xk);
        C1720106oR.LJI("Creators_Inbox", C2188811AlT.LIZIZ(sbLIZ));
        if (abstractC1623806Xk instanceof C1623606Xi) {
            C1901150zZZ c1901150zZZ = C1901150zZZ.LIZJ;
            C1623606Xi c1623606Xi = (C1623606Xi) abstractC1623806Xk;
            T t = c1623606Xi.LIZ;
            synchronized (c1901150zZZ) {
                C1900900zZA c1900900zZALJ = c1901150zZZ.LJ();
                if (c1900900zZALJ != null) {
                    c1900900zZALJ.LJ(t);
                    c1900900zZALJ.LIZJ = false;
                }
            }
            if (C297160Bko.LIZ()) {
                C611500Nye.LIZ.LIZLLL(((CreatorNoticeResponse) c1623606Xi.LIZ).notices);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiViewModel@a25.preloadCreatorNotice$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

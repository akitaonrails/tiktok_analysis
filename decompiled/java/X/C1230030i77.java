package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i77, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.invitation.newdesign.utils.JoinGroupHelper$openJoinGroupPanel$2$1", f = "JoinGroupHelper.kt", l = {349}, m = "invokeSuspend")
public final class C1230030i77 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ DialogC1389620mGW LLILLL;
    public final /* synthetic */ C1230060i7A LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230030i77(DialogC1389620mGW dialogC1389620mGW, C1230060i7A c1230060i7A, String str, InterfaceC1364105Vn<? super C1230030i77> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = dialogC1389620mGW;
        this.LLILZ = c1230060i7A;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1230030i77 c1230030i77 = new C1230030i77(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1230030i77.LLILLJJLI = obj;
        return c1230030i77;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C23112093u c23112093u;
        int errorCode;
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("JoinGroupHelper@86ca.openJoinGroupPanel$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        C0YMW c0ymw = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C1DFB c1dfb = C0PEM.LIZJ;
                C1230040i78 c1230040i78 = new C1230040i78(this.LLILZ, null);
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c1230040i78);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("JoinGroupHelper@86ca.openJoinGroupPanel$2$1");
                    return objLJFF;
                }
            }
            GroupInvitePopupResponse groupInvitePopupResponse = (GroupInvitePopupResponse) obj;
            C1229320i5y.LIZ.LJI = System.currentTimeMillis();
            C786410Ut5.LJIIJ(this.LLILLL);
            C2296808zG.LJFF(interfaceC497601wk);
            int i2 = (int) groupInvitePopupResponse.toastMeta.statusCode;
            if (i2 != 0) {
                C1229320i5y.LIZLLL(new C1229340i60(i2, 0, C0ZBV.BUSINESS_FAIL, 2));
                String str = groupInvitePopupResponse.toastMeta.text;
                if (C123100dR.LIZ(str)) {
                    C1229780i6i.LIZ(this.LLILZ.LJIIIZ, str);
                }
                InterfaceC1229620i6S interfaceC1229620i6S = this.LLILZ.LJIIJJI;
                if (interfaceC1229620i6S != null) {
                    interfaceC1229620i6S.LIZ(null);
                }
            } else {
                String strLIZJ = C1229100i5c.LIZ.LIZJ(this.LLILZ.LJI);
                String strLJFF = C1229100i5c.LJFF(this.LLILZ.LJI);
                C1229330i5z c1229330i5z = C1229320i5y.LIZ;
                c1229330i5z.LIZLLL = strLIZJ;
                c1229330i5z.LJ = strLJFF;
                C1229320i5y.LIZLLL(new C1229340i60(0, groupInvitePopupResponse.popupMeta.userGroupStatus, C0ZBV.SUCCESS, 1));
                this.LLILZ.LIZIZ(C1229780i6i.LIZLLL(groupInvitePopupResponse.popupMeta));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1229320i5y.LIZ.LJI = System.currentTimeMillis();
            boolean z = e instanceof C0XIR;
            if (z) {
                c23112093u = (C23112093u) e;
            } else {
                c23112093u = null;
            }
            if (c23112093u != null) {
                errorCode = c23112093u.getErrorCode();
            } else {
                errorCode = -1;
            }
            C1229320i5y.LIZLLL(new C1229340i60(errorCode, 0, C0ZBV.ABNORMAL_FAIL, 2));
            C786410Ut5.LJIIJ(this.LLILLL);
            C1229780i6i.LIZ(this.LLILZ.LJIIIZ, this.LLILZIL);
            if (z) {
                C0YMX c0ymxNewBuilder = C0YMW.newBuilder();
                C0XIR c0xir = (C0XIR) e;
                c0ymxNewBuilder.LIZ.status = c0xir.getErrorCode();
                String errorMsg = c0xir.getErrorMsg();
                c0ymw = c0ymxNewBuilder.LIZ;
                c0ymw.statusMsg = errorMsg;
            }
            InterfaceC1229620i6S interfaceC1229620i6S2 = this.LLILZ.LJIIJJI;
            if (interfaceC1229620i6S2 != null) {
                interfaceC1229620i6S2.LIZ(c0ymw);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("JoinGroupHelper@86ca.openJoinGroupPanel$2$1");
        return unit;
    }
}

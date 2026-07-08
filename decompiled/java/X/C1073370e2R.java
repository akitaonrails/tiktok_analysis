package X;

import Y.AgS297S0100000_16;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS130S1100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0e2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.PermissionPopupChecker$newAuthDialogCenter$1", f = "PermissionPopupChecker.kt", l = {59}, m = "invokeSuspend")
public final class C1073370e2R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ Aweme LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1073370e2R(C19EG c19eg, Aweme aweme, InterfaceC1364105Vn<? super C1073370e2R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c19eg;
        this.LLILZ = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1073370e2R c1073370e2R = new C1073370e2R(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1073370e2R.LLILLJJLI = obj;
        return c1073370e2R;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        C095D c095dLIZIZ;
        C1C7U.LIZ("PermissionPopupChecker@5af3.newAuthDialogCenter$1");
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
            C849850XVn c849850XVn = C849850XVn.LIZIZ;
            if (c849850XVn.LIZJ().LJJIIJ()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PermissionPopupChecker@5af3.newAuthDialogCenter$1");
                return unit;
            }
            String strLIZIZ = C1073380e2S.LIZIZ(this.LLILLL);
            Aweme aweme = this.LLILZ;
            Intent intent = this.LLILLL.getIntent();
            if (!intent.getBooleanExtra("is_start_by_login", false) && !intent.getBooleanExtra("from_new_user_journey", false) && !intent.getBooleanExtra("is_start_by_switch_account", false)) {
                z = false;
            } else {
                z = true;
            }
            boolean zLIZJ = C1076010e6h.LIZJ.LJFF().LIZJ();
            if (aweme != null && !C1017070cZd.LLIZLLLIL(aweme) && !aweme.isAd()) {
                z2 = false;
            } else {
                z2 = true;
            }
            c849850XVn.LIZJ();
            C1910890zpH c1910890zpH = (C1910890zpH) C1073380e2S.LIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("after permission popup: ");
            sbLIZ.append(zLIZJ);
            c1910890zpH.LIZ("permission_popup_checker", C2188811AlT.LIZIZ(sbLIZ));
            if (!z && !z2 && !zLIZJ && C740400T2o.LIZ) {
                InterfaceC1264610j0t interfaceC1264610j0tLIZ = C1072350e0n.LIZ(this.LLILLL, new AwS130S1100000_16(strLIZIZ, interfaceC497601wk, 26));
                if (interfaceC1264610j0tLIZ != null && (c095dLIZIZ = ((C1073210e2B) interfaceC1264610j0tLIZ).LIZIZ()) != null) {
                    AgS297S0100000_16 agS297S0100000_16 = new AgS297S0100000_16(this.LLILLL, 27);
                    this.LL = 1;
                    if (c095dLIZIZ.collect(agS297S0100000_16, this) == objLJFF) {
                        C1C7U.LIZIZ("PermissionPopupChecker@5af3.newAuthDialogCenter$1");
                        return objLJFF;
                    }
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PermissionPopupChecker@5af3.newAuthDialogCenter$1");
            return unit2;
        }
        C1076010e6h.LIZJ.LJFF().LIZIZ();
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("PermissionPopupChecker@5af3.newAuthDialogCenter$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

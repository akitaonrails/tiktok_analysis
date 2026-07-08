package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01oD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.statemachine.PNSUserStateManager$trackKidsLoginEvent$1", f = "PNSUserStateManager.kt", l = {113}, m = "invokeSuspend")
public final class C444701oD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C444701oD(InterfaceC1364105Vn<? super C444701oD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C444701oD(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSUserStateManager@f27e.trackKidsLoginEvent$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("PNSUserStateManager@f27e.trackKidsLoginEvent$1");
                return objLJFF;
            }
        }
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("kids_df_load", "kid_change_did", "state_machine_restart_app", "user_mode_data_invalid");
        Keva repo = KevaImpl.getRepo("kids_login_keva", 1);
        for (String str : listLJIIJJI) {
            if (repo.contains(str)) {
                String string = repo.getString(str, "");
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("description", string);
                C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
                repo.erase(str);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PNSUserStateManager@f27e.trackKidsLoginEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C444701oD(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$tryShowCleanStorageUI$1$2$1", f = "DraftFragment.kt", l = {}, m = "invokeSuspend")
public final class C561490M0l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561490M0l(DraftFragment draftFragment, InterfaceC1364105Vn<? super C561490M0l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561490M0l(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C19EG activity;
        C1C7U.LIZ("DraftFragment@975a.tryShowCleanStorageUI$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DraftFragment draftFragment = this.LL;
        if (!draftFragment.LLJILLL && (activity = draftFragment.getActivity()) != null) {
            try {
                C20515215Pi c20515215Pi = new C20515215Pi(activity);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_exclamation_mark_circle;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c20515215Pi.LJFF(c419910GdJ);
                c20515215Pi.LIZJ(2131828225);
                c20515215Pi.LIZ.LIZIZ = 86400000L;
                int iLIZJ = (int) C12ES.LIZJ(12.0f, activity);
                C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                c1057450dcl.LJIIIZ = iLIZJ;
                c1057450dcl.LJIIJ = 0;
                draftFragment.LLLFZ = c20515215Pi;
                c20515215Pi.LIZLLL();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "draft");
                c2344009Gk.LJIIIIZZ("type", "draft_storage");
                C20684815ws.LJIILLIIL("clean_storage_toast", c2344009Gk.LIZ);
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from", "draft");
                c2344009Gk2.LJIIIIZZ("type", "draft_storage");
                C20684815ws.LJIILLIIL("storage_toast_clean", c2344009Gk2.LIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C0CHQ.LIZ().isDebugConfigOpen();
                C0MAY c0may = C0MAY.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showCleanStorageUI error ");
                sbLIZ.append(e.getLocalizedMessage());
                C201955140j.LJIIJ(c0may, C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftFragment@975a.tryShowCleanStorageUI$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

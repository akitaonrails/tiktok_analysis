package X;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.components.DraftBoxCleanStorageHintComponent$tryShowCleanStorageUI$1$1$1", f = "DraftBoxCleanStorageHintComponent.kt", l = {}, m = "invokeSuspend")
public final class C561530M0p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ C561580M0u LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561530M0p(Activity activity, C561580M0u c561580M0u, InterfaceC1364105Vn<? super C561530M0p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = c561580M0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561530M0p(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int iIntValue;
        int iIntValue2;
        View decorView;
        C20246014Ju c20246014JuLIZ;
        C20244914Jj c20244914JjLIZ;
        Integer numValueOf;
        C1C7U.LIZ("DraftBoxCleanStorageHintComponent@1396.tryShowCleanStorageUI$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isFinishing()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftBoxCleanStorageHintComponent@1396.tryShowCleanStorageUI$1$1$1");
            return unit;
        }
        C561580M0u c561580M0u = this.LLILLJJLI;
        Activity activity = this.LL;
        c561580M0u.getClass();
        if (activity != null) {
            try {
                int iLIZJ = (int) C12ES.LIZJ(12.0f, activity);
                if (Build.VERSION.SDK_INT >= 35) {
                    Object obj2 = null;
                    try {
                        Window window = activity.getWindow();
                        if (window != null && (decorView = window.getDecorView()) != null && (c20246014JuLIZ = C14K4.LIZ(decorView)) != null && (c20244914JjLIZ = c20246014JuLIZ.LIZ(2)) != null && (numValueOf = Integer.valueOf(c20244914JjLIZ.LIZLLL)) != null) {
                            iIntValue2 = numValueOf.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        c098200Yq = Integer.valueOf(iIntValue2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                        obj2 = c098200Yq;
                    }
                    Integer num = (Integer) obj2;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    iLIZJ += iIntValue;
                }
                C20515215Pi c20515215Pi = new C20515215Pi(activity);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_exclamation_mark_circle;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c20515215Pi.LJFF(c419910GdJ);
                c20515215Pi.LIZJ(2131828225);
                C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                c1057450dcl.LIZIZ = 86400000L;
                c1057450dcl.LJIIIZ = iLIZJ;
                c1057450dcl.LJIIJ = 0;
                c561580M0u.LIZ = c20515215Pi;
                c20515215Pi.LIZLLL();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "draft");
                c2344009Gk.LJIIIIZZ("type", "draft_storage");
                C20684815ws.LJIILLIIL("clean_storage_toast", c2344009Gk.LIZ);
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from", "draft");
                c2344009Gk2.LJIIIIZZ("type", "draft_storage");
                C20684815ws.LJIILLIIL("storage_toast_clean", c2344009Gk2.LIZ);
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                C0CHQ.LIZ().isDebugConfigOpen();
                C0MAY c0may = C0MAY.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showCleanStorageUI error ");
                sbLIZ.append(e.getLocalizedMessage());
                C201955140j.LJIIJ(c0may, C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxCleanStorageHintComponent@1396.tryShowCleanStorageUI$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

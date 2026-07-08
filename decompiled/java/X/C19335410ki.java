package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupViewModel;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.10ki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19335410ki implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C19335410ki c19335410ki, C15O7 c15o7) {
        C1C7U.LIZ("UniversalPopupViewModel@524.ackDialog$1$1");
        List<String> list = ((UniversalPopupAction) c19335410ki.l0).customizedActions;
        UniversalPopupViewModel universalPopupViewModel = (UniversalPopupViewModel) c19335410ki.l1;
        C1519370pdn c1519370pdn = (C1519370pdn) c19335410ki.l2;
        for (String str : list) {
            InterfaceC1914220zue interfaceC1914220zue = universalPopupViewModel.LLILZ;
            if (interfaceC1914220zue != null) {
                interfaceC1914220zue.LIZIZ(str, c1519370pdn);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UniversalPopupViewModel@524.ackDialog$1$1");
        return unit;
    }

    public static final Object then$1(C19335410ki c19335410ki, C15O7 c15o7) {
        Activity activity;
        C1C7U.LIZ("PraiseDialogHelper@da9c.tryShowIncentiveDialog$2");
        if (((Boolean) c15o7.LJIIL()).booleanValue() && (activity = (Activity) c19335410ki.l0) != null) {
            C1909230zmb c1909230zmb = C1909230zmb.LIZ;
            C1909110zmP c1909110zmP = new C1909110zmP(activity, EnumC1909250zmd.INCENTIVE, (InterfaceC1875070ytV) c19335410ki.l1);
            c1909230zmb.getClass();
            C1909230zmb.LIZLLL(c1909110zmP);
            ((InterfaceC1875060ytU) c19335410ki.l2).show();
        } else {
            ((InterfaceC1875060ytU) c19335410ki.l2).show();
        }
        C1C7U.LIZIZ("PraiseDialogHelper@da9c.tryShowIncentiveDialog$2");
        return null;
    }

    public C19335410ki(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

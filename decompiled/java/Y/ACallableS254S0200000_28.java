package Y;

import X.C19269410a4;
import X.C1C7U;
import X.C785410UrT;
import X.C816490W1f;
import X.DialogInterfaceOnDismissListenerC19333210kM;
import X.ViewOnClickListenerC19269010a0;
import android.content.Context;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.banappeal.ComplianceBusinessActivityAssem;
import com.ss.android.ugc.aweme.profile.model.AGSWarningPopupWindow;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public class ACallableS254S0200000_28 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS254S0200000_28 aCallableS254S0200000_28) {
        C1C7U.LIZ("ComplianceBusinessActivityAssem@bd02.checkAGSLastWarningDialogShow$1");
        ComplianceBusinessActivityAssem.bo((BaseActivity) ((ComplianceBusinessActivityAssem) aCallableS254S0200000_28.l0).LL.getValue(), (AGSWarningPopupWindow) aCallableS254S0200000_28.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComplianceBusinessActivityAssem@bd02.checkAGSLastWarningDialogShow$1");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$1(Y.ACallableS254S0200000_28 r12) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS254S0200000_28.call$1(Y.ACallableS254S0200000_28):java.lang.Object");
    }

    public static final Object call$2(ACallableS254S0200000_28 aCallableS254S0200000_28) {
        ViewOnClickListenerC19269010a0 viewOnClickListenerC19269010a0;
        C1C7U.LIZ("ContentLanguageGuideManager@9c78.showDialog$1");
        ((C19269410a4) aCallableS254S0200000_28.l0).LIZLLL = new ViewOnClickListenerC19269010a0((Context) aCallableS254S0200000_28.l1, ((C19269410a4) aCallableS254S0200000_28.l0).LIZJ);
        C19269410a4 c19269410a4 = (C19269410a4) aCallableS254S0200000_28.l0;
        ViewOnClickListenerC19269010a0 viewOnClickListenerC19269010a02 = c19269410a4.LIZLLL;
        if (viewOnClickListenerC19269010a02 != null) {
            viewOnClickListenerC19269010a02.setOnDismissListener(new DialogInterfaceOnDismissListenerC19333210kM(c19269410a4, 22));
        }
        ViewOnClickListenerC19269010a0 viewOnClickListenerC19269010a03 = ((C19269410a4) aCallableS254S0200000_28.l0).LIZLLL;
        if (viewOnClickListenerC19269010a03 != null && !viewOnClickListenerC19269010a03.isShowing() && (viewOnClickListenerC19269010a0 = ((C19269410a4) aCallableS254S0200000_28.l0).LIZLLL) != null) {
            viewOnClickListenerC19269010a0.show();
            C785410UrT.LIZIZ(viewOnClickListenerC19269010a0);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(viewOnClickListenerC19269010a0);
            C816490W1f.LIZ(viewOnClickListenerC19269010a0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContentLanguageGuideManager@9c78.showDialog$1");
        return unit;
    }

    public ACallableS254S0200000_28(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

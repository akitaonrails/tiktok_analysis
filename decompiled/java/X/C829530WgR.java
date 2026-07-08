package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.common.MobClick;

/* JADX INFO: renamed from: X.0WgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829530WgR extends AbstractC813050Vux<Boolean> {
    @Override // X.AbstractC813050Vux
    public final Boolean LIZIZ() {
        return Boolean.FALSE;
    }

    public static final void LIZJ(String str) {
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setLabelName(str);
        mobClickObtain.setEventName("recall_popup");
        C20684815ws.onEvent(mobClickObtain);
    }

    @Override // X.AbstractC813050Vux
    public final boolean LIZ(Boolean bool) {
        Boolean bool2 = bool;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        C19259110Wf c19259110Wf = C746350TPl.LIZ;
        if (c19259110Wf.LJIIJJI == null) {
            c19259110Wf.LJIIJJI = new C2230608oa<>("attract_user_without_login", Boolean.FALSE);
        }
        if (c19259110Wf.LJIIJJI.LIZ().booleanValue() || !bool2.booleanValue()) {
            return false;
        }
        final Activity activityLJFF = C2214201BlK.LJFF();
        final AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (activityLJFF == null) {
            return false;
        }
        C21566919al c21566919al = new C21566919al(activityLJFF);
        c21566919al.LIZIZ = activityLJFF.getString(2131826720);
        c21566919al.LJIIIIZZ(new DialogInterface.OnClickListener() { // from class: X.0WgS
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ComponentCallbacks2 componentCallbacks2 = activityLJFF;
                if (componentCallbacks2 != null && (componentCallbacks2 instanceof InterfaceC1603190roz)) {
                    AbstractC1387200mCc abstractC1387200mCc = abstractC1387200mCcLIZIZ;
                    if (abstractC1387200mCc != null && !(abstractC1387200mCc.LIZ instanceof InterfaceC1603190roz)) {
                        return;
                    }
                    InterfaceC1570710qyb mainHelper = ((InterfaceC1603190roz) componentCallbacks2).getMainHelper();
                    if (mainHelper != null) {
                        mainHelper.LIZJ();
                    }
                    C829530WgR.LIZJ("cancel");
                }
            }
        }, activityLJFF.getString(2131836452), false);
        c21566919al.LJIIJJI(new DialogInterface.OnClickListener() { // from class: X.0WgT
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Activity activity = activityLJFF;
                if (activity != null && (activity instanceof InterfaceC1603190roz)) {
                    C0XPD.LIZIZ(activity, "recall_popup", "click", null, null);
                    C829530WgR.LIZJ("confirm");
                }
            }
        }, activityLJFF.getString(2131836794), false);
        new C21566519ah(c21566919al).LIZLLL();
        LIZJ("show");
        if (c19259110Wf.LJIIJJI == null) {
            c19259110Wf.LJIIJJI = new C2230608oa<>("attract_user_without_login", Boolean.FALSE);
        }
        c19259110Wf.LJIIJJI.LJ(Boolean.TRUE);
        return true;
    }
}

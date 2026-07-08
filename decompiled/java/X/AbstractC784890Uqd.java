package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;

/* JADX INFO: renamed from: X.0Uqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC784890Uqd implements InterfaceC201999142b {
    public abstract String LIZJ(Activity activity, String... strArr);

    public abstract String LIZLLL(Activity activity);

    public abstract String LJ(Activity activity);

    public void LJFF() {
    }

    public void LJI() {
    }

    public String LIZIZ(Activity activity) {
        return activity.getString(2131851524);
    }

    @Override // X.InterfaceC201999142b
    public final void LIZ(Activity activity, InterfaceC784910Uqf interfaceC784910Uqf, String[] strArr) {
        C19GO c19go = new C19GO(activity);
        c19go.LIZLLL = LIZLLL(activity);
        c19go.LJII = LIZJ(activity, strArr);
        c19go.LJFF(new DialogInterfaceOnClickListenerC785930UsJ(this, interfaceC784910Uqf, 6), LJ(activity), false);
        c19go.LIZLLL(new DialogInterfaceOnClickListenerC785890UsF(1), LIZIZ(activity), false);
        c19go.LJJIJ = new DialogInterface.OnKeyListener() { // from class: X.0Uqe
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i == 4) {
                    if (keyEvent.getAction() == 1) {
                        dialogInterface.cancel();
                    }
                    return true;
                }
                return false;
            }
        };
        c19go.LJJIIJ = false;
        c19go.LJJIJIIJI = new DialogInterfaceOnCancelListenerC785950UsL(this, interfaceC784910Uqf, 2);
        C19GN c19gnLIZ = c19go.LIZ();
        C1391850mK7.LIZIZ(c19gnLIZ, "555");
        C786410Ut5.M4(c19gnLIZ);
    }
}

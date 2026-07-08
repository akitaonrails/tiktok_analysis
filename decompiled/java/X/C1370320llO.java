package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: renamed from: X.0llO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370320llO {
    public static int LIZJ(EnumC1369720lkQ enumC1369720lkQ) {
        if (enumC1369720lkQ == EnumC1369720lkQ.VERTICAL) {
            return R.attr.s4;
        }
        return R.attr.s5;
    }

    public static void LJ(InterfaceC1370310llN interfaceC1370310llN, TextView textView) {
        String string;
        Context applicationContext;
        if (interfaceC1370310llN.label().length() == 0) {
            if (interfaceC1370310llN.LJJLIIIJJIZ() == 0) {
                textView.setText("");
                return;
            }
            try {
                InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
                if (interfaceC1370110ll3 != null && (applicationContext = interfaceC1370110ll3.getApplicationContext()) != null) {
                    string = applicationContext.getString(interfaceC1370310llN.LJJLIIIJJIZ());
                } else {
                    string = null;
                }
                textView.setText(string);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                textView.setText("");
                return;
            }
        }
        textView.setText(interfaceC1370310llN.label());
    }

    public static void LIZ(InterfaceC1370310llN interfaceC1370310llN, View view, BaseSharePackage baseSharePackage) {
        InterfaceC1370360llS interfaceC1370360llS = C1370370llT.LJFF;
        if (interfaceC1370360llS != null && interfaceC1370360llS.LIZIZ(view, interfaceC1370310llN, baseSharePackage, new AwS633S0100000_19(interfaceC1370310llN, 260))) {
            interfaceC1370310llN.LJJLIIIIJ(view, baseSharePackage);
        }
    }

    public static void LIZIZ(InterfaceC1370310llN interfaceC1370310llN, View view, BaseSharePackage baseSharePackage) {
        int i = C563200M7a.LIZ[interfaceC1370310llN.LJIIJ().ordinal()];
        if (i != 1) {
            if (i == 2) {
                interfaceC1370310llN.LJJIIZI(view, baseSharePackage);
                return;
            }
            throw new C1954807lC();
        }
        interfaceC1370310llN.LJJLIIIJILLIZJL(view.getContext(), baseSharePackage);
    }

    public static void LIZLLL(Context context, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
        C017X c017x;
        InterfaceC1370110ll3 interfaceC1370110ll3;
        InterfaceC1370110ll3 interfaceC1370110ll32;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null || ((interfaceC1370110ll32 = C1370370llT.LIZ) != null && (activityLIZ = interfaceC1370110ll32.getCurrentActivity()) != null)) {
            if (!activityLIZ.isDestroyed() && !activityLIZ.isFinishing()) {
                if (!interfaceC1370310llN.LJJJJL() || ((interfaceC1370110ll3 = C1370370llT.LIZ) != null && interfaceC1370110ll3.LJII())) {
                    interfaceC1370310llN.LJIILIIL(context, baseSharePackage);
                    c017x = C017X.SUCCESS;
                } else {
                    InterfaceC1370110ll3 interfaceC1370110ll33 = C1370370llT.LIZ;
                    if (interfaceC1370110ll33 != null) {
                        interfaceC1370110ll33.LJIIJJI(activityLIZ);
                    }
                    c017x = C017X.NETWORK_ERROR;
                }
            } else {
                c017x = C017X.ACTIVITY_STATUS_ERROR;
            }
        } else {
            c017x = C017X.ACTIVITY_IS_NULL;
        }
        InterfaceC1370360llS interfaceC1370360llS = C1370370llT.LJFF;
        if (interfaceC1370360llS != null) {
            interfaceC1370360llS.LJFF(c017x.getValue());
        }
    }
}

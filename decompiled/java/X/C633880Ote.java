package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.poplayer.core.PopupManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS149S0101000_9;
import kotlin.jvm.internal.AwS94S1200000_9;

/* JADX INFO: renamed from: X.0Ote, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633880Ote {
    public static C20515215Pi LIZIZ;
    public static C20656615sK LIZLLL;
    public static InterfaceC633930Otj LJ;
    public static final C633880Ote LIZ = new C633880Ote();
    public static String LIZJ = "cross";

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        C632210Oqx.LIZ.getClass();
        sbLIZ.append(C632210Oqx.LIZIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(AwS149S0101000_9 awS149S0101000_9, AFwS195S0000000_9 aFwS195S0000000_9, View view, final C0TGX c0tgx) {
        LIZJ = "cross";
        if (view instanceof ViewGroup) {
            final C633900Otg c633900Otg = new C633900Otg(view, awS149S0101000_9);
            PopupManager.LJIJI(new AbstractC20660815t0(c0tgx, c633900Otg) { // from class: X.0Oth
                public final Function1<C20656615sK, Unit> LL;

                @Override // X.AbstractC20656215sG
                public final boolean canShow() {
                    return true;
                }

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 444;
                }

                {
                    this.LL = c633900Otg;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    this.LL.invoke(c20656615sK);
                }
            }, true);
        } else {
            if (aFwS195S0000000_9 == null) {
                return;
            }
            aFwS195S0000000_9.invoke();
        }
    }

    public static void LIZIZ(AwS149S0101000_9 awS149S0101000_9, AFwS195S0000000_9 aFwS195S0000000_9, C19EG c19eg, final InterfaceC20660615sy interfaceC20660615sy) {
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("new_release_guide_url", "");
        if (strLJI != null && strLJI.length() != 0) {
            final AwS94S1200000_9 awS94S1200000_9 = new AwS94S1200000_9(awS149S0101000_9, c19eg, strLJI, 3);
            PopupManager.LJIJI(new AbstractC20660815t0(interfaceC20660615sy, awS94S1200000_9) { // from class: X.0Oti
                public final Function1<C20656615sK, Unit> LL;

                @Override // X.AbstractC20656215sG
                public final boolean canShow() {
                    return true;
                }

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 444;
                }

                {
                    this.LL = awS94S1200000_9;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    this.LL.invoke(c20656615sK);
                }
            }, true);
        } else {
            if (aFwS195S0000000_9 == null) {
                return;
            }
            aFwS195S0000000_9.invoke();
        }
    }
}

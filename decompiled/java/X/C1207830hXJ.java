package X;

import X.C1207400hWc;
import X.C1207450hWh;
import X.C1207520hWo;
import X.C20489080x;
import X.InterfaceC1207030hW1;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.tiktok.location.utils.PoiExpLocationPopupManager$getLifecycleEventObserver$1;
import java.util.Map;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0hXJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207830hXJ extends C12Q8 {
    public final InterfaceC1207030hW1 LIZ;
    public final /* synthetic */ C1207850hXL LIZIZ;

    @Override // X.C12Q8
    public final void LIZ() {
    }

    public C1207830hXJ(C1207850hXL c1207850hXL, InterfaceC1207030hW1 interfaceC1207030hW1) {
        this.LIZIZ = c1207850hXL;
        this.LIZ = interfaceC1207030hW1;
    }

    @Override // X.C12Q8
    public final void LIZLLL(C12QB c12qb, C12QB c12qb2, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        FragmentManager supportFragmentManager;
        String string = str2;
        String string2 = str;
        Map<String, ? extends Object> map = null;
        if (C13LP.LJJJJ(this.LIZIZ.LIZJ.certToken(), C1201430hMz.LIZIZ().openSettingsCertTokenList)) {
            C1207850hXL c1207850hXL = this.LIZIZ;
            InterfaceC1207030hW1 interfaceC1207030hW1 = this.LIZ;
            LifecycleEventObserver lifecycleEventObserver = c1207850hXL.LIZLLL;
            if (lifecycleEventObserver != null) {
                ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(lifecycleEventObserver);
                c1207850hXL.LIZLLL = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c1207850hXL, 2609);
            C1207870hXN c1207870hXN = new C1207870hXN(c1207850hXL, jCurrentTimeMillis, interfaceC1207030hW1);
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(c1207850hXL, 2608);
            if (C1201580hNE.LIZ[C1201430hMz.LJ().ordinal()] == 1) {
                C1201470hN3 c1201470hN3 = C1201470hN3.LIZ;
                Activity activity = c1207850hXL.LIZ;
                c1201470hN3.getClass();
                TuxSheet tuxSheetLIZJ = C1201470hN3.LIZJ(activity, awS562S0100000_18, c1207870hXN, awS562S0100000_182);
                if (tuxSheetLIZJ == null) {
                    if (interfaceC1207030hW1 != null) {
                        interfaceC1207030hW1.LIZIZ(0, "open settings dialog fail");
                        return;
                    }
                    return;
                } else {
                    c1207850hXL.LIZLLL = new PoiExpLocationPopupManager$getLifecycleEventObserver$1(c1207850hXL.LIZ, c1207850hXL.LIZIZ, jCurrentTimeMillis, new AwS262S0300000_18(tuxSheetLIZJ, interfaceC1207030hW1, c1207850hXL, 19));
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(c1207850hXL.LIZ);
                    if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                        tuxSheetLIZJ.show(supportFragmentManager, "open_settings_intro");
                    }
                }
            } else {
                C1201470hN3 c1201470hN32 = C1201470hN3.LIZ;
                Activity activity2 = c1207850hXL.LIZ;
                c1201470hN32.getClass();
                C1397510mTF c1397510mTFLIZLLL = C1201470hN3.LIZLLL(activity2, awS562S0100000_18, c1207870hXN, awS562S0100000_182);
                if (c1397510mTFLIZLLL == null) {
                    if (interfaceC1207030hW1 == null) {
                        return;
                    }
                    interfaceC1207030hW1.LIZIZ(0, "open settings dialog fail");
                    return;
                }
                c1207850hXL.LIZLLL = new PoiExpLocationPopupManager$getLifecycleEventObserver$1(c1207850hXL.LIZ, c1207850hXL.LIZIZ, jCurrentTimeMillis, new AwS262S0300000_18(c1397510mTFLIZLLL, interfaceC1207030hW1, c1207850hXL, 20));
                c1397510mTFLIZLLL.LIZLLL();
            }
            LifecycleEventObserver lifecycleEventObserver2 = c1207850hXL.LIZLLL;
            if (lifecycleEventObserver2 != null) {
                ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(lifecycleEventObserver2);
            }
            C1207400hWc c1207400hWc = C1207400hWc.LIZ;
            C1207520hWo c1207520hWo = c1207850hXL.LIZIZ;
            if (c1207520hWo != null) {
                str7 = c1207520hWo.LIZ;
                str8 = c1207520hWo.LIZIZ;
                str9 = c1207520hWo.LIZLLL;
                map = c1207520hWo.LIZJ;
            } else {
                str7 = null;
                str8 = null;
                str9 = null;
            }
            c1207400hWc.getClass();
            C1207400hWc.LJIILL(str7, str8, str9, map);
            return;
        }
        C1207850hXL c1207850hXL2 = this.LIZIZ;
        LifecycleEventObserver lifecycleEventObserver3 = c1207850hXL2.LIZLLL;
        if (lifecycleEventObserver3 != null) {
            ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(lifecycleEventObserver3);
            c1207850hXL2.LIZLLL = null;
        }
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (string2 == null || string2.length() == 0) {
            string2 = this.LIZIZ.LIZ.getResources().getString(2131826364);
        }
        C1207850hXL c1207850hXL3 = this.LIZIZ;
        C21566919al c21566919al = new C21566919al(c1207850hXL3.LIZ);
        c21566919al.LIZIZ = string2;
        if (string.length() == 0) {
            string = c1207850hXL3.LIZ.getResources().getString(2131837942);
        }
        c21566919al.LIZJ = string;
        c21566919al.LJIIJJI(new DialogInterfaceOnClickListenerC1208800hYs(c12qb, 2), this.LIZIZ.LIZ.getResources().getString(2131826361), true);
        String string3 = this.LIZIZ.LIZ.getResources().getString(2131826362);
        final C1207850hXL c1207850hXL4 = this.LIZIZ;
        c21566919al.LJIIJ = new C21566819ak(new DialogInterface.OnClickListener() { // from class: X.0hXP
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                String str10;
                String str11;
                C1207400hWc c1207400hWc2 = C1207400hWc.LIZ;
                C1207520hWo c1207520hWo2 = c1207850hXL4.LIZIZ;
                String str12 = null;
                if (c1207520hWo2 != null) {
                    str10 = c1207520hWo2.LIZ;
                    str11 = c1207520hWo2.LIZIZ;
                    str12 = c1207520hWo2.LIZLLL;
                } else {
                    str10 = null;
                    str11 = null;
                }
                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(c1207850hXL4, 626);
                c1207400hWc2.getClass();
                C1207400hWc.LJIILJJIL(0, jCurrentTimeMillis3, str10, str11, str12, awS597S0100000_18);
                InterfaceC1207030hW1 interfaceC1207030hW12 = this.LIZ;
                if (interfaceC1207030hW12 != null) {
                    interfaceC1207030hW12.LIZIZ(1, "cancel in open settings dialog");
                }
            }
        }, string3, false);
        c21566919al.LJII = false;
        c21566919al.LIZLLL(new AwS597S0100000_18(c1207850hXL4, 627));
        final C21566519ah c21566519ah = new C21566519ah(c21566919al);
        final C1207850hXL c1207850hXL5 = this.LIZIZ;
        LifecycleEventObserver lifecycleEventObserver4 = new LifecycleEventObserver() { // from class: com.ss.android.ugc.tiktok.location.permission.core.LocationPermissionFetcherV2$GotoSettingsDialog$show$6$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                String str10;
                String str11;
                String str12;
                if (event == Lifecycle.Event.ON_RESUME && C1207450hWh.LIZ.LJII(0, c1207850hXL5.LIZ)) {
                    C1207400hWc c1207400hWc2 = C1207400hWc.LIZ;
                    C1207520hWo c1207520hWo2 = c1207850hXL5.LIZIZ;
                    if (c1207520hWo2 != null) {
                        str10 = c1207520hWo2.LIZ;
                        str11 = c1207520hWo2.LIZIZ;
                        str12 = c1207520hWo2.LIZLLL;
                    } else {
                        str10 = null;
                        str11 = null;
                        str12 = null;
                    }
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                    AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(c1207850hXL5, 624);
                    c1207400hWc2.getClass();
                    C1207400hWc.LJIILJJIL(1, jCurrentTimeMillis3, str10, str11, str12, awS597S0100000_18);
                    c21566519ah.LIZIZ(null);
                    C20489080x.LIZ.getClass();
                    C20489080x.LIZLLL().storeBoolean("location_permission_is_allow", true);
                    InterfaceC1207030hW1 interfaceC1207030hW12 = this.LIZ;
                    if (interfaceC1207030hW12 != null) {
                        interfaceC1207030hW12.LIZ();
                    }
                    ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(this);
                    c1207850hXL5.LIZLLL = null;
                }
            }
        };
        c1207850hXL5.LIZLLL = lifecycleEventObserver4;
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(lifecycleEventObserver4);
        C1207400hWc c1207400hWc2 = C1207400hWc.LIZ;
        C1207520hWo c1207520hWo2 = c1207850hXL5.LIZIZ;
        if (c1207520hWo2 != null) {
            str4 = c1207520hWo2.LIZ;
            str5 = c1207520hWo2.LIZIZ;
            str6 = c1207520hWo2.LIZLLL;
            map = c1207520hWo2.LIZJ;
        } else {
            str4 = null;
            str5 = null;
            str6 = null;
        }
        c1207400hWc2.getClass();
        C1207400hWc.LJIILL(str4, str5, str6, map);
        c21566519ah.LIZLLL();
    }
}

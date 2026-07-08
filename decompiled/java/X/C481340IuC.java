package X;

import Y.AObjectS283S0200000_7;
import Y.AObjectS350S0100000_7;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0IuC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C481340IuC implements InterfaceC1372610lp5 {
    public final C1106210etP LIZ;
    public final AbstractC481350IuD LIZIZ;
    public AObjectS283S0200000_7 LIZJ;
    public AObjectS350S0100000_7 LIZLLL;
    public final /* synthetic */ C1106110etF LJ;

    @Override // X.InterfaceC1372610lp5
    public final void LIZ(Throwable th) {
    }

    @Override // X.InterfaceC1372610lp5
    public final /* synthetic */ void LJII() {
    }

    @Override // X.InterfaceC1372610lp5
    public final void onDismiss() {
        AObjectS283S0200000_7 aObjectS283S0200000_7 = this.LIZJ;
        if (aObjectS283S0200000_7 != null) {
            aObjectS283S0200000_7.invoke();
        }
    }

    @Override // X.InterfaceC1372610lp5
    public final void LIZIZ(HashMap<String, String> map) {
        C481180Itw.LJ(this.LJ.LLJIJIL, map);
    }

    @Override // X.InterfaceC1372610lp5
    public final void LIZLLL(HashMap<String, String> map) {
        Bundle bundle;
        C1106210etP c1106210etP = this.LIZ;
        if (c1106210etP != null && (bundle = c1106210etP.LJJJJIZL) != null) {
            String string = bundle.getString("bizTrackParams");
            if (!TextUtils.isEmpty(string)) {
                map.put("biz_track_params", string);
            }
        }
        C481180Itw.LJI(this.LJ.LLJIJIL, map);
    }

    @Override // X.InterfaceC1372610lp5
    public final void LJ(HashMap<String, String> map) {
        C481180Itw.LJFF(this.LJ.LLJIJIL, map);
    }

    @Override // X.InterfaceC1372610lp5
    public final void LJFF(Dialog dialog) {
        C464800IKo.LIZ.LJIILLIIL(dialog);
    }

    @Override // X.InterfaceC1372610lp5
    public final void LJI(Dialog dialog) {
        C464800IKo.LIZ.LIZ(dialog);
    }

    @Override // X.InterfaceC1372610lp5
    public final void onShow(int i) {
        AObjectS350S0100000_7 aObjectS350S0100000_7 = this.LIZLLL;
        if (aObjectS350S0100000_7 != null) {
            aObjectS350S0100000_7.invoke(Integer.valueOf(i));
        }
    }

    public C481340IuC(C1106110etF c1106110etF, C1106210etP c1106210etP, C481360IuE c481360IuE) {
        this.LJ = c1106110etF;
        this.LIZ = c1106210etP;
        this.LIZIZ = c481360IuE;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0207  */
    @Override // X.InterfaceC1372610lp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r14, java.lang.String r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C481340IuC.LIZJ(java.lang.String, java.lang.String, android.os.Bundle):void");
    }
}

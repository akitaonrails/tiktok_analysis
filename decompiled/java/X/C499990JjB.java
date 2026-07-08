package X;

import com.bytedance.android.livesdk.broadcast.settingpage.SettingsViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfigLocalTest;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0JjB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499990JjB {
    public final SettingsViewModel LIZ;
    public int LIZIZ = R.id.mzm;

    public C499990JjB(SettingsViewModel settingsViewModel) {
        this.LIZ = settingsViewModel;
    }

    public final void LIZ(int i, Function1 function1) {
        int i2 = this.LIZIZ;
        this.LIZIZ = i;
        try {
            function1.invoke(this);
            this.LIZIZ = i2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZIZ = i2;
            throw th;
        }
    }

    public static void LIZIZ(C499990JjB c499990JjB, int i, InterfaceC1631620sYq interfaceC1631620sYq, Function0 function0) {
        AFwS193S0000000_7 aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(386);
        AFwS193S0000000_7 aFwS193S0000000_72 = AFwS193S0000000_7.get$arr$(387);
        if (((Boolean) function0.invoke()).booleanValue() || LiveHostSettingsUIConfigLocalTest.localTest()) {
            C385801ei c385801ei = new C385801ei(i, interfaceC1631620sYq, aFwS193S0000000_7, aFwS193S0000000_72);
            SettingsViewModel settingsViewModel = c499990JjB.LIZ;
            settingsViewModel.LL.put(Integer.valueOf(i), c385801ei);
            ((ArrayList) settingsViewModel.LLILLL).add(c385801ei);
            if (settingsViewModel.LLILZ) {
                settingsViewModel.LLIZ.setValue(C13LP.LLIIII(settingsViewModel.LLILLL));
            }
        }
    }

    public static void LIZJ(C499990JjB c499990JjB, int i, InterfaceC1631620sYq interfaceC1631620sYq, Function0 function0, int i2) {
        AFwS193S0000000_7 aFwS193S0000000_7;
        if ((i2 & 4) != 0) {
            function0 = AFwS193S0000000_7.get$arr$(388);
        }
        AFwS193S0000000_7 aFwS193S0000000_72 = null;
        if ((i2 & 8) != 0) {
            aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(389);
        } else {
            aFwS193S0000000_7 = null;
        }
        if ((i2 & 16) != 0) {
            aFwS193S0000000_72 = AFwS193S0000000_7.get$arr$(390);
        }
        c499990JjB.getClass();
        if (((Boolean) function0.invoke()).booleanValue() || LiveHostSettingsUIConfigLocalTest.localTest()) {
            c499990JjB.LIZ.wQ2(i, c499990JjB.LIZIZ, new C385801ei(i, interfaceC1631620sYq, aFwS193S0000000_7, aFwS193S0000000_72));
        }
    }
}

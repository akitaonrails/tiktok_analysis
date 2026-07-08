package X;

import com.ss.android.ugc.aweme.setting.serverpush.compose.unlogin.PushSettingsUnLoginVM;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.14dD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20308114dD implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public static final void run$0(C20308114dD c20308114dD) {
        ((C20296814bO) c20308114dD.l0).LIZIZ();
        C500260Jjc.LJJLIIIJJIZ(new AwS574S0100000_30((C20296814bO) c20308114dD.l0, 18));
    }

    public static final void run$1(C20308114dD c20308114dD) {
        PushSettingsUnLoginVM pushSettingsUnLoginVM = (PushSettingsUnLoginVM) c20308114dD.l0;
        for (Runnable runnable : (ArrayList) pushSettingsUnLoginVM.LLILLL) {
            runnable.run();
            ((ArrayList) pushSettingsUnLoginVM.LLILLL).remove(runnable);
        }
    }

    public static final void run$2(C20308114dD c20308114dD) {
        ((PushSettingsUnLoginVM) c20308114dD.l0).LLILZIL = false;
    }

    public C20308114dD(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

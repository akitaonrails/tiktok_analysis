package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcershortcut.ab.FeedLauncherShortcutAddSettingsModelItem;
import com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS151S1200000_7;
import kotlin.jvm.internal.AwS95S1300000_13;

/* JADX INFO: renamed from: X.0Vzn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816050Vzn implements InterfaceC435390H5l {
    public final InterfaceC815880VzW LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(401));

    public final Map<String, Object> LIZJ() {
        FeedLauncherShortcutAddSettingsModelItem feedLauncherShortcutAddSettingsModelItem = (FeedLauncherShortcutAddSettingsModelItem) ((LinkedHashMap) C816080Vzq.LIZ).get(this.LIZ.getType());
        if (feedLauncherShortcutAddSettingsModelItem != null) {
            return feedLauncherShortcutAddSettingsModelItem.extra;
        }
        return null;
    }

    public final boolean LIZLLL() {
        return this.LIZ.isEnable();
    }

    @Override // X.InterfaceC435390H5l
    public final boolean LIZIZ() {
        return ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LIZIZ(this.LIZ.LIZLLL());
    }

    public C816050Vzn(InterfaceC815880VzW interfaceC815880VzW) {
        this.LIZ = interfaceC815880VzW;
    }

    public final void LJ(Function2<? super Bitmap, ? super Throwable, Unit> function2) {
        C1331660kl2.LJIIIZ(this.LIZ.LJFF()).LJJII(new C0ID3(function2, 7));
    }

    public final void LJFF(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("add_status", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("panel_type", this.LIZ.getType());
        C20684815ws.LJIILLIIL("home_screen_icon_add_status", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC435390H5l
    public final void LIZ(Context context, String str, Function2<? super Boolean, ? super Throwable, Unit> function2) {
        AwS151S1200000_7 awS151S1200000_7;
        if (function2 == null) {
            awS151S1200000_7 = null;
        } else {
            awS151S1200000_7 = new AwS151S1200000_7(this, str, function2, 1);
        }
        LJ(new C815830VzR(new AwS95S1300000_13(this, str, awS151S1200000_7, context, 2), this));
    }
}

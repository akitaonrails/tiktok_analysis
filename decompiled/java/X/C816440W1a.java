package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgShortcutInfo;
import com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0W1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@InterfaceC1294060jmO
public final class C816440W1a implements InterfaceC815930Vzb {
    public boolean LIZ;

    public static String LIZ() {
        UgShortcutInfo shortcutInfo;
        try {
            UgAwemeActivitySetting awemeActivitySetting = C0CLW.LIZIZ.LIZ.getAwemeActivitySetting();
            if (awemeActivitySetting == null || (shortcutInfo = awemeActivitySetting.getShortcutInfo()) == null) {
                return null;
            }
            return shortcutInfo.getH5Link();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public C816440W1a() {
        SettingsManagerProxy.inst().registerSettingsWatcher(new InterfaceC2194071Atx() { // from class: X.0W1b
            @Override // X.InterfaceC2194071Atx
            public final void LIZ(IESSettingsProxy iESSettingsProxy) {
                Object c098200Yq;
                C816440W1a c816440W1a = this.LL;
                try {
                    UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
                    c816440W1a.getClass();
                    if (C816440W1a.LIZIZ(awemeActivitySetting)) {
                        if (c816440W1a.LIZ) {
                            return;
                        }
                        c816440W1a.LIZ = true;
                        ((IShortcutService) ServiceManager.get().getService(IShortcutService.class)).LJIIJ("setting on ", true);
                    } else if (c816440W1a.LIZ) {
                        c816440W1a.LIZ = false;
                        ((IShortcutService) ServiceManager.get().getService(IShortcutService.class)).LJIIJ("setting off ", true);
                    } else {
                        return;
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }
        }, false);
    }

    public static boolean LIZIZ(UgAwemeActivitySetting ugAwemeActivitySetting) {
        boolean zBooleanValue;
        boolean z;
        if (ugAwemeActivitySetting == null) {
            try {
                ugAwemeActivitySetting = C0CLW.LIZIZ.LIZ.getAwemeActivitySetting();
                if (ugAwemeActivitySetting == null) {
                    return false;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        Boolean overallSwitch = ugAwemeActivitySetting.getOverallSwitch();
        if (overallSwitch != null) {
            zBooleanValue = overallSwitch.booleanValue();
        } else {
            zBooleanValue = false;
            if (ugAwemeActivitySetting != null) {
            }
            z = false;
            if (!zBooleanValue && z) {
                return true;
            }
        }
        if (ugAwemeActivitySetting.getShortcutInfo() != null) {
            z = true;
        } else {
            z = false;
        }
        return !zBooleanValue ? false : false;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    @Override // X.InterfaceC815930Vzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set<X.C815900VzY> LIZJ(android.content.Context r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C816440W1a.LIZJ(android.content.Context, boolean):java.util.Set");
    }
}

package X;

import com.bytedance.pia.core.setting.Settings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203961BNq {
    public static Settings LIZ() {
        Settings value;
        Boolean bool;
        if (!Settings.LJIIIIZZ) {
            return Settings.LJII.getValue();
        }
        Settings settings = Settings.LJIIIZ;
        if (settings != null && !Intrinsics.LJFF(settings, Settings.LJI.getValue())) {
            return settings;
        }
        InterfaceC1549120qPm interfaceC1549120qPm = C1542560qFC.LIZJ;
        if (interfaceC1549120qPm == null || (value = (Settings) interfaceC1549120qPm.LIZ("pia_global_config", Settings.class, Settings.LJI.getValue())) == null) {
            value = Settings.LJI.getValue();
        }
        InterfaceC1549120qPm interfaceC1549120qPm2 = C1542560qFC.LIZJ;
        value.LIZ = (interfaceC1549120qPm2 == null || (bool = (Boolean) interfaceC1549120qPm2.LIZ("spark_iab_optimize_pia", Boolean.TYPE, Boolean.FALSE)) == null) ? false : bool.booleanValue();
        Settings.LJIIIZ = value;
        return value;
    }
}

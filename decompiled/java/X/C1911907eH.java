package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.probe.ab.PipoProbeObserverConfigModel;

/* JADX INFO: renamed from: X.07eH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1911907eH {
    public static final PipoProbeObserverConfigModel LIZ = new PipoProbeObserverConfigModel(false, null, 0.0d, false, false, 31, null);

    public static final PipoProbeObserverConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoProbeObserverConfigModel pipoProbeObserverConfigModel = LIZ;
        PipoProbeObserverConfigModel pipoProbeObserverConfigModel2 = (PipoProbeObserverConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_probe_observer_config", PipoProbeObserverConfigModel.class, pipoProbeObserverConfigModel);
        return pipoProbeObserverConfigModel2 != null ? pipoProbeObserverConfigModel2 : pipoProbeObserverConfigModel;
    }
}

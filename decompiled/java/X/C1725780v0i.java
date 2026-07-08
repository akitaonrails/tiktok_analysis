package X;

import android.os.Debug;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.pipo.settings.PipoContainerAddAppMemory;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0v0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.hybrid.memory.MemoryTrack$getAppMemory$2", f = "MemoryTrack.kt", l = {}, m = "invokeSuspend")
public final class C1725780v0i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Float>, Object> {
    public C1725780v0i(InterfaceC1364105Vn<? super C1725780v0i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1725780v0i(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        C1C7U.LIZ("MemoryTrack@a4d4.getAppMemory$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - C1725770v0h.LIZJ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoContainerAddAppMemory.PipoContainerAddAppMemoryConfig pipoContainerAddAppMemoryConfig = PipoContainerAddAppMemory.LIZ;
        PipoContainerAddAppMemory.PipoContainerAddAppMemoryConfig pipoContainerAddAppMemoryConfig2 = (PipoContainerAddAppMemory.PipoContainerAddAppMemoryConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_container_add_app_memory", PipoContainerAddAppMemory.PipoContainerAddAppMemoryConfig.class, pipoContainerAddAppMemoryConfig);
        if (pipoContainerAddAppMemoryConfig2 != null) {
            pipoContainerAddAppMemoryConfig = pipoContainerAddAppMemoryConfig2;
        }
        Long l = pipoContainerAddAppMemoryConfig.cacheTime;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        if (j > jLongValue) {
            C1725770v0h.LIZIZ = Debug.getPss() / 1000.0f;
            C1725770v0h.LIZJ = jCurrentTimeMillis;
        }
        Float fLIZLLL = C2286608xc.LIZLLL(C1725770v0h.LIZIZ);
        C1C7U.LIZIZ("MemoryTrack@a4d4.getAppMemory$2");
        return fLIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Float> interfaceC1364105Vn) {
        return new C1725780v0i(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

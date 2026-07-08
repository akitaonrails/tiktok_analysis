package X;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Uab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774950Uab {
    public static AbstractC1273900jFs LIZIZ;
    public static boolean LIZJ;
    public static Method LJ;
    public static C775030Uaj LJFF;
    public static C775020Uai LJI;
    public static final C774950Uab LIZ = new C774950Uab();
    public static boolean LIZLLL = true;
    public static final ArrayList<InterfaceC775040Uak> LJII = new ArrayList<>();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Uaj] */
    public static void LIZ() {
        if (Build.VERSION.SDK_INT >= 28) {
            LJFF = new AudioManager.AudioRecordingCallback() { // from class: X.0Uaj
                @Override // android.media.AudioManager.AudioRecordingCallback
                public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) throws Throwable {
                    if (list != null && list.size() == 1) {
                        try {
                            if (C774950Uab.LJ == null) {
                                C774950Uab.LJ = AudioRecordingConfiguration.class.getMethod("isClientSilenced", new Class[0]);
                            }
                            Method method = C774950Uab.LJ;
                            Object objA0 = null;
                            if (method != null) {
                                objA0 = C2204961BRm.a0(method, ListProtector.get(list, 0), new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5Kt9lP0Hf23rV1vA7yGPxVgWDHwx5C5BY6FOKY5JCv53bjlTXRhkTJIGHsGgBJA==", null));
                            }
                            boolean z = !((Boolean) objA0).booleanValue();
                            Map<String, Object> map = C1338270kvh.LIZ;
                            if (C774950Uab.LIZJ && z != C774950Uab.LIZLLL) {
                                if (z) {
                                    Iterator<InterfaceC775040Uak> it2 = C774950Uab.LJII.iterator();
                                    while (it2.hasNext()) {
                                        it2.next().LIZ();
                                    }
                                } else if (!z) {
                                    Iterator<InterfaceC775040Uak> it3 = C774950Uab.LJII.iterator();
                                    while (it3.hasNext()) {
                                        it3.next().LIZIZ();
                                    }
                                } else {
                                    throw new C1954807lC();
                                }
                            }
                            C774950Uab.LIZLLL = z;
                        } catch (NoSuchMethodException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJI("AudioRecordFocusManager", e);
                        } catch (SecurityException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C20441214yg.LJI("AudioRecordFocusManager", e2);
                        }
                    }
                }
            };
        }
        AbstractC1273900jFs abstractC1273900jFs = LIZIZ;
        if (abstractC1273900jFs != null) {
            C775030Uaj c775030Uaj = LJFF;
            CertProviderManagerKt.findCert("bpea-game_audio_recording_callback", 1476788233);
            abstractC1273900jFs.LLJJJJLIIL(c775030Uaj);
        }
    }

    public static void LIZIZ() {
        C775030Uaj c775030Uaj = LJFF;
        if (c775030Uaj != null) {
            try {
                AbstractC1273900jFs abstractC1273900jFs = LIZIZ;
                if (abstractC1273900jFs != null) {
                    abstractC1273900jFs.LJJIIZI(c775030Uaj);
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("AudioRecordFocusManager", e);
            }
        }
        LJFF = null;
    }
}

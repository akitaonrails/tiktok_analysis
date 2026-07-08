package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.broadcast.utils.LiveAudioDevicesDetector;
import com.bytedance.android.livesdk.live.model.VolumeDetectConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveVolumeDetectSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptGoLiveBluetoothPermissionRequestSetting;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Uao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775080Uao {
    public static boolean LIZJ;
    public static volatile int LJFF;
    public static C11JF LJI;
    public static C11JF LJII;
    public static C11JF LJIIIIZZ;
    public static C11JF LJIIIZ;
    public static final C775080Uao LIZ = new C775080Uao();
    public static boolean LIZLLL = true;
    public static volatile int LJ = -1;
    public static C775130Uat LJIIJ = new InterfaceC779560Ui2() { // from class: X.0Uat
        @Override // X.InterfaceC779560Ui2
        public final void LJFF(boolean z) {
        }

        @Override // X.InterfaceC779560Ui2
        public final void LJIIIZ() {
        }

        @Override // X.InterfaceC779560Ui2
        public final void LIZJ() {
            C775080Uao c775080Uao = C775080Uao.LIZ;
            C775080Uao.LIZ();
        }

        @Override // X.InterfaceC779560Ui2
        public final void LJIIIIZZ() {
            C775080Uao c775080Uao = C775080Uao.LIZ;
            C775080Uao.LIZIZ();
        }
    };
    public static VolumeDetectConfig LIZIZ = LiveVolumeDetectSetting.INSTANCE.getValue();

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Uat] */
    static {
        IBroadcastService iBroadcastService;
        InterfaceC775040Uak interfaceC775040Uak = new InterfaceC775040Uak() { // from class: X.0Uan
            @Override // X.InterfaceC775040Uak
            public final void LIZ() {
                C775080Uao c775080Uao = C775080Uao.LIZ;
                C775080Uao.LIZ();
            }

            @Override // X.InterfaceC775040Uak
            public final void LIZIZ() {
                C775080Uao c775080Uao = C775080Uao.LIZ;
                C775080Uao.LIZIZ();
            }
        };
        ArrayList<InterfaceC775040Uak> arrayList = C774950Uab.LJII;
        if (!arrayList.contains(interfaceC775040Uak)) {
            arrayList.add(interfaceC775040Uak);
        }
        if (!OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable()) {
            C775130Uat c775130Uat = LJIIJ;
            if (c775130Uat != null) {
                C779660UiC.LIZ.LIZLLL(c775130Uat);
                return;
            }
            return;
        }
        C775130Uat c775130Uat2 = LJIIJ;
        if (c775130Uat2 == null || (iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)) == null || iBroadcastService.getLiveAudioDevicesDetector() == null) {
            return;
        }
        CopyOnWriteArrayList<InterfaceC779560Ui2> copyOnWriteArrayList = LiveAudioDevicesDetector.LJIIIIZZ;
        if (copyOnWriteArrayList.contains(c775130Uat2)) {
            return;
        }
        if (LiveAudioDevicesDetector.LIZIZ || LiveAudioDevicesDetector.LIZJ) {
            c775130Uat2.LJIIIIZZ();
        } else {
            c775130Uat2.LIZJ();
        }
        copyOnWriteArrayList.add(c775130Uat2);
    }

    public static final void LIZ() {
        if (LIZJ) {
            C11JF c11jf = LJI;
            if (c11jf != null) {
                c11jf.dispose();
            }
            LJI = (C11JF) C784440Upu.LIZ().LJ(C775170Uax.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0Uaq
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("VolumeDetector@4b8a.start$1");
                    C775080Uao c775080Uao = C775080Uao.LIZ;
                    obj.getClass();
                    C775080Uao.LJ = 0;
                    C1C7U.LIZIZ("VolumeDetector@4b8a.start$1");
                }
            });
            C11JF c11jf2 = LJII;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            VolumeDetectConfig volumeDetectConfig = LIZIZ;
            if (volumeDetectConfig == null) {
                volumeDetectConfig = null;
            }
            LJII = (C11JF) new C19488911Mp(C11NZ.LJLJJLL(volumeDetectConfig.getDetectIntervalSeconds(), TimeUnit.SECONDS)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0Uap
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("VolumeDetector@4b8a.start$2");
                    C775080Uao c775080Uao = C775080Uao.LIZ;
                    if (C775080Uao.LJ != -1) {
                        int i = C775080Uao.LJ;
                        VolumeDetectConfig volumeDetectConfig2 = C775080Uao.LIZIZ;
                        VolumeDetectConfig volumeDetectConfig3 = null;
                        if (volumeDetectConfig2 == null) {
                            volumeDetectConfig2 = null;
                        }
                        if (i >= volumeDetectConfig2.getVolumeThreshold()) {
                            C784440Upu.LIZ().LIZIZ(new Object() { // from class: X.0Uaw
                            });
                            C775080Uao.LJFF = 0;
                        } else {
                            C775080Uao.LJFF++;
                            int i2 = C775080Uao.LJFF;
                            VolumeDetectConfig volumeDetectConfig4 = C775080Uao.LIZIZ;
                            if (volumeDetectConfig4 == null) {
                                volumeDetectConfig4 = null;
                            }
                            if (i2 >= volumeDetectConfig4.getCountThreshold() && C775080Uao.LIZLLL) {
                                C775080Uao.LIZLLL = false;
                                VolumeDetectConfig volumeDetectConfig5 = C775080Uao.LIZIZ;
                                if (volumeDetectConfig5 != null) {
                                    volumeDetectConfig3 = volumeDetectConfig5;
                                }
                                C775080Uao.LJIIIZ = (C11JF) C11NZ.LJLJJLL(volumeDetectConfig3.getPausePromptDurationMinutes(), TimeUnit.MINUTES).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0Uas
                                    @Override // X.C09JN
                                    public final void accept(Object obj2) {
                                        C1C7U.LIZ("VolumeDetector@4b8a.onLowVolume$1");
                                        C775080Uao.LIZLLL = true;
                                        C1C7U.LIZIZ("VolumeDetector@4b8a.onLowVolume$1");
                                    }
                                }, new C09JN() { // from class: X.00MZ
                                    @Override // X.C09JN
                                    public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                        C1C7U.LIZ("VolumeDetector@4b8a.onLowVolume$2");
                                        C1C7U.LIZIZ("VolumeDetector@4b8a.onLowVolume$2");
                                    }
                                });
                                C784440Upu.LIZ().LIZIZ(new Object() { // from class: X.0Uav
                                });
                                C775080Uao.LJFF = 0;
                            }
                        }
                    }
                    C1C7U.LIZIZ("VolumeDetector@4b8a.start$2");
                }
            }, new C09JN() { // from class: X.0Uar
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("VolumeDetector@4b8a.start$3");
                    C1C7U.LIZIZ("VolumeDetector@4b8a.start$3");
                }
            });
        }
    }

    public static final void LIZIZ() {
        C11JF c11jf = LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LJI = null;
        C11JF c11jf2 = LJII;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        LJII = null;
        LJFF = 0;
    }
}

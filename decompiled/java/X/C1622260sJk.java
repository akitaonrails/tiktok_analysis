package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.music.service.IMusicStreamDownloadService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622260sJk implements InterfaceC1629550sVV {
    public static final C1622260sJk LIZ = new C1622260sJk();

    @Override // X.InterfaceC1629550sVV
    public final void LIZIZ() {
    }

    public static void LIZJ(final AVMusic aVMusic, final Function0 function0, final Function1 function1, final Function2 function2) {
        C0CHQ.LIZ().LJJJJL().LJ("sticker_music", C0CHQ.LIZ, aVMusic, 0, false, new InterfaceC1416880myU() { // from class: X.0sJg
            @Override // X.InterfaceC1416880myU
            public final void LIZJ(boolean z) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onStart() {
            }

            @Override // X.InterfaceC1416880myU
            public final void onProgress(int i) {
                function1.invoke(Integer.valueOf(i));
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZ(Integer num, String str) {
                function0.invoke();
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZIZ(String str, MusicWaveBean musicWaveBean) {
                function2.invoke(aVMusic, str);
            }
        }, false);
    }

    @Override // X.InterfaceC1629550sVV
    public final void LIZ(final String str, final Function0 function0, final Function1 function1, final Function2 function2, final boolean z) {
        C0CHQ.LIZ().LJJJJL().requestMusic(str, new InterfaceC1416890myV() { // from class: X.0sJm
            @Override // X.InterfaceC1416890myV
            public final void LIZIZ(Exception exc) {
                function0.invoke();
            }

            @Override // X.InterfaceC1416890myV
            public final void LIZLLL(final AVMusic aVMusic) {
                boolean z2;
                if (aVMusic == null) {
                    function0.invoke();
                    return;
                }
                if (AVCommerceServiceImpl.LJIIJ().LJ() && !aVMusic.isCommerceMusic()) {
                    function0.invoke();
                    return;
                }
                String strLIZ = C1629700sVk.LIZ(str);
                if (!C0CHQ.LIZ().LJJJJL().LJFF(aVMusic, C786410Ut5.M3(C0CHQ.LIZ))) {
                    function0.invoke();
                    return;
                }
                if (strLIZ != null && strLIZ.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 && FileUtils.INSTANCE.checkFileExists(strLIZ)) {
                    function1.invoke(100);
                    function2.invoke(aVMusic, strLIZ);
                    return;
                }
                if (!z) {
                    function1.invoke(100);
                    function2.invoke(aVMusic, null);
                    return;
                }
                if (C1662170tM7.LIZ().isEnable) {
                    C1622260sJk c1622260sJk = C1622260sJk.LIZ;
                    final Function1<Integer, Unit> function12 = function1;
                    final Function2<InterfaceC1629560sVW, String, Unit> function22 = function2;
                    final Function0<Unit> function02 = function0;
                    c1622260sJk.getClass();
                    IMusicStreamDownloadService iMusicStreamDownloadService = (IMusicStreamDownloadService) PluggableExtentionKt.pluggableSpi$default(IMusicStreamDownloadService.class, false, false, false, 14, null);
                    if (iMusicStreamDownloadService != null) {
                        iMusicStreamDownloadService.LIZ(aVMusic, false, true, new C1622290sJn("sticker_music"), new InterfaceC202048143y() { // from class: X.0sJl
                            @Override // X.InterfaceC202048143y
                            public final void LJJJLIIL(String str2) {
                            }

                            @Override // X.InterfaceC202048143y
                            public final void LIZIZ() {
                                C1622260sJk c1622260sJk2 = C1622260sJk.LIZ;
                                AVMusic aVMusic2 = aVMusic;
                                Function1<Integer, Unit> function13 = function12;
                                Function2<InterfaceC1629560sVW, String, Unit> function23 = function22;
                                Function0<Unit> function03 = function02;
                                c1622260sJk2.getClass();
                                C1622260sJk.LIZJ(aVMusic2, function03, function13, function23);
                            }

                            @Override // X.InterfaceC202048143y
                            public final void LIZ(int i, String str2) {
                                function02.invoke();
                            }

                            @Override // X.InterfaceC202048143y
                            public final void LIZJ(String str2, boolean z3) {
                                function22.invoke(aVMusic, str2);
                            }
                        }, C1662170tM7.LIZ().startPlayProgress, C1662170tM7.LIZ().netLevelThreshold);
                        return;
                    } else {
                        C1622260sJk.LIZJ(aVMusic, function02, function12, function22);
                        return;
                    }
                }
                C1622260sJk c1622260sJk2 = C1622260sJk.LIZ;
                Function1<Integer, Unit> function13 = function1;
                Function2<InterfaceC1629560sVW, String, Unit> function23 = function2;
                Function0<Unit> function03 = function0;
                c1622260sJk2.getClass();
                C1622260sJk.LIZJ(aVMusic, function03, function13, function23);
            }
        });
    }
}

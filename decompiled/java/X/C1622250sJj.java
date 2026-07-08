package X;

import android.app.Application;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622250sJj implements InterfaceC1629550sVV {
    public static final C1622250sJj LIZ = new C1622250sJj();

    @Override // X.InterfaceC1629550sVV
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1629550sVV
    public final void LIZ(final String str, final Function0 function0, final Function1 function1, final Function2 function2, final boolean z) {
        C0CHQ.LIZ().LJJJJL().requestMusic(str, new InterfaceC1416890myV() { // from class: X.0sJi
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
                if (!z2) {
                    function1.invoke(100);
                    function2.invoke(aVMusic, strLIZ);
                } else {
                    if (!z) {
                        function1.invoke(100);
                        function2.invoke(aVMusic, null);
                        return;
                    }
                    InterfaceC1623990sMX interfaceC1623990sMXLJJJJL = C0CHQ.LIZ().LJJJJL();
                    Application application = C0CHQ.LIZ;
                    final Function1<Integer, Unit> function12 = function1;
                    final Function2<InterfaceC1629560sVW, String, Unit> function22 = function2;
                    final Function0<Unit> function02 = function0;
                    interfaceC1623990sMXLJJJJL.LJ("ftc_sticker_music", application, aVMusic, 0, false, new InterfaceC1416880myU() { // from class: X.0sJh
                        @Override // X.InterfaceC1416880myU
                        public final void LIZJ(boolean z3) {
                        }

                        @Override // X.InterfaceC1416880myU
                        public final void onStart() {
                        }

                        @Override // X.InterfaceC1416880myU
                        public final void onProgress(int i) {
                            function12.invoke(Integer.valueOf(i));
                        }

                        @Override // X.InterfaceC1416880myU
                        public final void LIZ(Integer num, String str2) {
                            function02.invoke();
                        }

                        @Override // X.InterfaceC1416880myU
                        public final void LIZIZ(String str2, MusicWaveBean musicWaveBean) {
                            function22.invoke(aVMusic, str2);
                        }
                    }, false);
                }
            }
        });
    }
}

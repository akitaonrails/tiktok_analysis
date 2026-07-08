package X;

import Y.ARunnableS98S0000000_23;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.mediabox.bgplay.notification.BgPlayService;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ooB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487370ooB {
    public static Context LIZIZ;
    public static boolean LIZJ;
    public static InterfaceC2179601ARy LIZLLL;
    public static final C1487370ooB LIZ = new C1487370ooB();
    public static final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public static final C1487450ooJ LJFF = new C1487450ooJ();
    public static final C1487360ooA LJI = new C1487360ooA();
    public static final C1487410ooF LJII = new C1487410ooF();
    public static final C1487400ooE LJIIIIZZ = new InterfaceC1487460ooK() { // from class: X.0ooE
        @Override // X.InterfaceC1487460ooK
        public final void LIZ() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LIZIZ(Integer num, Long l) {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LIZJ() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LIZLLL(int i) {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJ() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJFF() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJI(int i) {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJII() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJIIIIZZ() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJIIIZ() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJIIJ() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJIIL() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJIIJJI(int i) {
            C1487370ooB c1487370ooB = C1487370ooB.LIZ;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            C1487370ooB.LIZIZ(z);
        }
    };

    public static final void LIZLLL() {
        if (LIZJ) {
            LIZIZ(true);
            LJFF.LJIIJJI(3);
        }
    }

    public static final void LIZ(InterfaceC1487460ooK interfaceC1487460ooK) {
        C1487450ooJ c1487450ooJ = LJFF;
        if (!c1487450ooJ.LIZ.contains(interfaceC1487460ooK)) {
            c1487450ooJ.LIZ.add(interfaceC1487460ooK);
        }
    }

    public static void LIZIZ(boolean z) {
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        String str;
        C1479510obV c1479510obVLIZJ;
        InterfaceC1483670oiD interfaceC1483670oiD;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ2;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ3;
        C1479510obV c1479510obVLIZJ2;
        if (!LIZJ) {
            return;
        }
        C1487410ooF c1487410ooF = LJII;
        c1487410ooF.getClass();
        try {
            C1ASD c1asd = c1487410ooF.LIZ;
            if (c1asd != null) {
                c1asd.LL.LIZLLL();
            }
            Context context = LIZIZ;
            if (context != null) {
                context.unbindService(c1487410ooF.LIZLLL);
                context.stopService(new Intent(context, (Class<?>) BgPlayService.class));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1487360ooA c1487360ooA = LJI;
        c1487360ooA.LJIIIIZZ = false;
        c1487360ooA.LJ = false;
        c1487360ooA.LJIIIZ = false;
        c1487360ooA.LJIIJ = false;
        InterfaceC1483670oiD interfaceC1483670oiD2 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD2 != null) {
            interfaceC1483670oiD2.LJIIL(c1487360ooA.LJIILIIL);
        }
        InterfaceC1483670oiD interfaceC1483670oiD3 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD3 != null) {
            interfaceC1483670oiD3.LIZ(false);
        }
        InterfaceC1483670oiD interfaceC1483670oiD4 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD4 != null) {
            interfaceC1483670oiD4.setLoop(true);
        }
        InterfaceC1483670oiD interfaceC1483670oiD5 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD5 != null) {
            interfaceC1483670oiD5.LIZIZ(new C1472370oPz(false));
        }
        InterfaceC1483670oiD interfaceC1483670oiD6 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD6 != null && (interfaceC1481730of5LJIIIZ3 = interfaceC1483670oiD6.LJIIIZ()) != null && (c1479510obVLIZJ2 = interfaceC1481730of5LJIIIZ3.LIZJ()) != null) {
            c1479510obVLIZJ2.LLJJJJLIIL = false;
            c1479510obVLIZJ2.LLJIJIL = false;
        }
        InterfaceC1483670oiD interfaceC1483670oiD7 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD7 != null && (interfaceC1481730of5LJIIIZ2 = interfaceC1483670oiD7.LJIIIZ()) != null) {
            interfaceC1481730of5LJIIIZ2.getCurrentPosition();
        }
        if (z && (interfaceC1483670oiD = c1487360ooA.LIZ) != null) {
            interfaceC1483670oiD.resume();
        }
        InterfaceC1483670oiD interfaceC1483670oiD8 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD8 != null) {
            InterfaceC1481730of5 interfaceC1481730of5LJIIIZ4 = interfaceC1483670oiD8.LJIIIZ();
            if (interfaceC1481730of5LJIIIZ4 != null && (c1479510obVLIZJ = interfaceC1481730of5LJIIIZ4.LIZJ()) != null) {
                str = c1479510obVLIZJ.LJIIIZ;
            } else {
                str = null;
            }
            interfaceC1483670oiD8.LJJLIIIJJIZ(str, c1487360ooA.LJI);
        }
        InterfaceC1483670oiD interfaceC1483670oiD9 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD9 != null && (interfaceC1481730of5LJIIIZ = interfaceC1483670oiD9.LJIIIZ()) != null) {
            interfaceC1481730of5LJIIIZ.LJJIJIL();
        }
        C1487420ooG c1487420ooG = c1487360ooA.LIZJ;
        c1487420ooG.getClass();
        C582130MsN.LIZ().LJ().getClass();
        C1484570ojf c1484570ojfLJ = C1484570ojf.LJ();
        C1487380ooC c1487380ooC = c1487420ooG.LIZIZ;
        if (c1487380ooC != null) {
            ((ArrayList) c1484570ojfLJ.LJIIIZ).remove(c1487380ooC);
        } else {
            c1484570ojfLJ.getClass();
        }
        C1487390ooD c1487390ooD = c1487360ooA.LIZLLL;
        if (c1487390ooD.LIZIZ) {
            try {
                Context context2 = c1487390ooD.LIZJ;
                if (context2 != null) {
                    C786410Ut5.LJJIFFI(context2, c1487390ooD.LJFF);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            c1487390ooD.LIZIZ = false;
        }
        c1487360ooA.LJIIJJI.removeCallbacksAndMessages(c1487360ooA.LJIIL);
        LIZJ = false;
        LIZLLL = null;
        C786410Ut5.LJJZZIII(LJ, new ARunnableS98S0000000_23(19));
    }

    public static final void LIZJ(C1513680pUc c1513680pUc) {
        boolean z;
        long duration;
        InterfaceC1484080ois playState;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ2;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ3;
        C1479510obV c1479510obVLIZJ;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ4;
        C1479510obV c1479510obVLIZJ2;
        if (LIZJ) {
            return;
        }
        LIZLLL = c1513680pUc;
        if (LIZIZ == null) {
            LIZIZ = C786410Ut5.N3(c1513680pUc.LIZ);
        }
        C1487450ooJ c1487450ooJ = LJFF;
        C1487400ooE c1487400ooE = LJIIIIZZ;
        if (!c1487450ooJ.LIZ.contains(c1487400ooE)) {
            c1487450ooJ.LIZ.add(c1487400ooE);
        }
        C1487360ooA c1487360ooA = LJI;
        c1487360ooA.getClass();
        c1487360ooA.LIZIZ = c1487450ooJ;
        if (!Intrinsics.LJFF(c1513680pUc.LJI(), c1487360ooA.LIZ)) {
            InterfaceC1483670oiD interfaceC1483670oiD = c1487360ooA.LIZ;
            if (interfaceC1483670oiD != null) {
                interfaceC1483670oiD.LJIIL(c1487360ooA.LJIILIIL);
            }
            c1487360ooA.LIZ = c1513680pUc.LJI();
        }
        InterfaceC1483670oiD interfaceC1483670oiD2 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD2 != null) {
            interfaceC1483670oiD2.LJJIJIIJIL(c1487360ooA.LJIILIIL);
        }
        InterfaceC1483670oiD interfaceC1483670oiD3 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD3 != null) {
            interfaceC1483670oiD3.LIZ(true);
        }
        InterfaceC1483670oiD interfaceC1483670oiD4 = c1487360ooA.LIZ;
        boolean z2 = false;
        if (interfaceC1483670oiD4 != null) {
            interfaceC1483670oiD4.setLoop(false);
        }
        InterfaceC1483670oiD interfaceC1483670oiD5 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD5 != null) {
            interfaceC1483670oiD5.LIZIZ(new C1472370oPz(true));
        }
        InterfaceC1483670oiD interfaceC1483670oiD6 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD6 != null && (interfaceC1481730of5LJIIIZ4 = interfaceC1483670oiD6.LJIIIZ()) != null && (c1479510obVLIZJ2 = interfaceC1481730of5LJIIIZ4.LIZJ()) != null && c1479510obVLIZJ2.LJIILJJIL) {
            z = true;
        } else {
            z = false;
        }
        c1487360ooA.LJI = z;
        InterfaceC1483670oiD interfaceC1483670oiD7 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD7 != null && (interfaceC1481730of5LJIIIZ3 = interfaceC1483670oiD7.LJIIIZ()) != null && (c1479510obVLIZJ = interfaceC1481730of5LJIIIZ3.LIZJ()) != null) {
            c1479510obVLIZJ.LJIILJJIL = true;
            c1479510obVLIZJ.LLJILJIL = true;
            c1479510obVLIZJ.LLJIJIL = true;
            c1479510obVLIZJ.LLJJJJLIIL = true;
        }
        InterfaceC1483670oiD interfaceC1483670oiD8 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD8 != null && (interfaceC1481730of5LJIIIZ2 = interfaceC1483670oiD8.LJIIIZ()) != null) {
            interfaceC1481730of5LJIIIZ2.LJJIJIL();
        }
        InterfaceC1483670oiD interfaceC1483670oiD9 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD9 != null && (interfaceC1481730of5LJIIIZ = interfaceC1483670oiD9.LJIIIZ()) != null) {
            duration = interfaceC1481730of5LJIIIZ.getDuration();
        } else {
            duration = 0;
        }
        c1487360ooA.LJFF = duration;
        InterfaceC1483670oiD interfaceC1483670oiD10 = c1487360ooA.LIZ;
        if (interfaceC1483670oiD10 != null && (playState = interfaceC1483670oiD10.getPlayState()) != null && playState.isPlaying()) {
            z2 = true;
        }
        c1487360ooA.LJII = z2;
        C1487420ooG c1487420ooG = c1487360ooA.LIZJ;
        c1487420ooG.getClass();
        C582130MsN.LIZ().LJ().getClass();
        C1484570ojf c1484570ojfLJ = C1484570ojf.LJ();
        C1487380ooC c1487380ooC = c1487420ooG.LIZIZ;
        if (c1487380ooC != null) {
            ((ArrayList) c1484570ojfLJ.LJIIIZ).add(c1487380ooC);
        } else {
            c1484570ojfLJ.getClass();
        }
        C582130MsN.LIZ().LJ().getClass();
        C1484570ojf.LJ().LJIIIIZZ("bg_audio_play", null, null);
        C1487390ooD c1487390ooD = c1487360ooA.LIZLLL;
        c1487390ooD.getClass();
        try {
            if (!c1487390ooD.LIZIZ) {
                c1487390ooD.LIZJ = LIZIZ;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
                intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                int iLIZIZ = C1468400oJa.LIZIZ();
                if (iLIZIZ != 2) {
                    if (iLIZIZ == 4) {
                        c1487390ooD.LIZLLL = true;
                    }
                } else {
                    c1487390ooD.LJ = true;
                }
                Context context = c1487390ooD.LIZJ;
                if (context != null) {
                    C786410Ut5.LJIJJ(context, c1487390ooD.LJFF, intentFilter);
                }
                c1487390ooD.LIZIZ = true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1487410ooF c1487410ooF = LJII;
        c1487410ooF.LIZIZ = LJI;
        try {
            Context context2 = LIZIZ;
            Intent intent = new Intent(context2, (Class<?>) BgPlayService.class);
            intent.putExtra("bg_play_info", C1487440ooI.LIZ(c1513680pUc));
            if (Build.VERSION.SDK_INT >= 34) {
                if (context2 != null) {
                    C2204961BRm.LJJJJ(context2, intent, c1487410ooF.LIZLLL, 513, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3U8eG4yZOWwLZ3JzD5llRZ6dXV0sHJ+tf8W8saS3ElpXaI0LEZ2U7isL5uxMA==", null));
                }
            } else if (context2 != null) {
                C2204961BRm.LJJJJ(context2, intent, c1487410ooF.LIZLLL, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3U8eG4yZOWwLZ3JzD5llRZ6dXV0sHJ+tf8W8saS3ElpXaI0LEZ2U7isL5uxMA==", null));
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        LJFF.LIZ();
        LIZJ = true;
    }

    public static final void LJ(InterfaceC1487460ooK interfaceC1487460ooK) {
        LJFF.LIZ.remove(interfaceC1487460ooK);
    }
}

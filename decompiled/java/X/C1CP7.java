package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.1CP7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CP7 {
    public static EnumC856530Xit LIZIZ;
    public static InterfaceC1452170ntP LJFF;
    public static final C1CP7 LIZ = new C1CP7();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(120));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(44));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(45));
    public static C1CP8 LJI = C1CP8.UNINITIALIZED;

    public static ArrayList LIZ() {
        return (ArrayList) LIZJ.getValue();
    }

    public static void LIZJ() {
        if (LJI != C1CP8.RUNNING) {
            C2216241Boc.LIZ.LIZ("EditToPublishAudioPlayer pause but do nothing");
            return;
        }
        EnumC856530Xit enumC856530Xit = LIZIZ;
        if (enumC856530Xit == null) {
            enumC856530Xit = null;
        }
        EnumC856530Xit enumC856530Xit2 = EnumC856530Xit.AUDIO_FADEOUT;
        if (enumC856530Xit == enumC856530Xit2) {
            LIZ.getClass();
            EnumC856530Xit enumC856530Xit3 = LIZIZ;
            if (enumC856530Xit3 == null) {
                enumC856530Xit3 = null;
            }
            if (enumC856530Xit3 == enumC856530Xit2) {
                C2219091BtD.LIZLLL().d("AudioFadeout || EditToPublishAudioPlayer pause success");
                InterfaceC1452170ntP interfaceC1452170ntP = LJFF;
                if (interfaceC1452170ntP != null) {
                    C391360FWc.LIZLLL("", interfaceC1452170ntP, AFwS234S0000000_5.get$arr$(28));
                    interfaceC1452170ntP.pause();
                }
            }
            LIZIZ(C1CP8.FADEOUT_ENDED);
        }
        EnumC856530Xit enumC856530Xit4 = LIZIZ;
        if ((enumC856530Xit4 != null ? enumC856530Xit4 : null) == EnumC856530Xit.AUDIO_LOOP) {
            InterfaceC1452170ntP interfaceC1452170ntP2 = LJFF;
            if (interfaceC1452170ntP2 != null) {
                interfaceC1452170ntP2.pause();
            }
            C1CP7 c1cp7 = LIZ;
            C1CP8 c1cp8 = C1CP8.LOOP_PAUSED;
            c1cp7.getClass();
            LIZIZ(c1cp8);
        }
    }

    public static void LIZIZ(C1CP8 c1cp8) {
        LJI = c1cp8;
        int i = C1CP9.LIZ[c1cp8.ordinal()];
        EnumC856530Xit enumC856530Xit = null;
        if (i != 3) {
            if (i == 4) {
                EnumC856530Xit enumC856530Xit2 = LIZIZ;
                if (enumC856530Xit2 != null) {
                    enumC856530Xit = enumC856530Xit2;
                }
                if (enumC856530Xit == EnumC856530Xit.AUDIO_FADEOUT) {
                    LIZ.getClass();
                    Iterator it2 = LIZ().iterator();
                    while (it2.hasNext()) {
                        ((C1CPA) it2.next()).LJLLLLLL();
                    }
                    LIZ.getClass();
                    LIZ().clear();
                    return;
                }
                return;
            }
            return;
        }
        EnumC856530Xit enumC856530Xit3 = LIZIZ;
        if (enumC856530Xit3 != null) {
            enumC856530Xit = enumC856530Xit3;
        }
        if (enumC856530Xit == EnumC856530Xit.AUDIO_FADEOUT) {
            LIZ.getClass();
            Iterator it3 = LIZ().iterator();
            while (it3.hasNext()) {
                ((C1CPA) it3.next()).LL();
            }
        }
    }

    public static void LIZLLL(int i) {
        InterfaceC1452170ntP interfaceC1452170ntP;
        int i2 = C1CP9.LIZ[LJI.ordinal()];
        EnumC856530Xit enumC856530Xit = null;
        if (i2 != 1) {
            if (i2 != 2) {
                C2216241Boc.LIZ.LIZ("EditToPublishAudioPlayer start but do nothing");
                return;
            }
            EnumC856530Xit enumC856530Xit2 = LIZIZ;
            if (enumC856530Xit2 != null) {
                enumC856530Xit = enumC856530Xit2;
            }
            if (enumC856530Xit == EnumC856530Xit.AUDIO_LOOP && (interfaceC1452170ntP = LJFF) != null) {
                interfaceC1452170ntP.play();
            }
            LIZIZ(C1CP8.RUNNING);
            return;
        }
        EnumC856530Xit enumC856530Xit3 = LIZIZ;
        if (enumC856530Xit3 != null) {
            enumC856530Xit = enumC856530Xit3;
        }
        if (enumC856530Xit == EnumC856530Xit.AUDIO_FADEOUT) {
            LIZ.getClass();
            InterfaceC1452170ntP interfaceC1452170ntP2 = LJFF;
            if (interfaceC1452170ntP2 != null) {
                ((ArrayList) LIZLLL.getValue()).clear();
                ((LinkedHashMap) LJ.getValue()).clear();
                int iLLL = interfaceC1452170ntP2.LLL();
                int i3 = iLLL + i;
                int duration = interfaceC1452170ntP2.getDuration();
                if (i3 > duration) {
                    i3 = duration;
                }
                C391360FWc.LIZLLL("", interfaceC1452170ntP2, new C346980Diy(iLLL, i3, i, interfaceC1452170ntP2));
            }
        }
        LIZIZ(C1CP8.RUNNING);
    }
}

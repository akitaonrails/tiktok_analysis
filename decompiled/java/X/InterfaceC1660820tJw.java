package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.algorithm.VEAudioAlgorithmParam;

/* JADX INFO: renamed from: X.0tJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1660820tJw {
    void LIZ(boolean z, boolean z2, boolean z3, boolean z4);

    void LIZIZ();

    void LIZJ(Cert cert);

    void LIZLLL();

    VEAudioCapture LJ();

    boolean LJFF();

    int LJI(VEAudioAlgorithmParam vEAudioAlgorithmParam);

    void LJII(C1621410sIN c1621410sIN);

    String LJIIIIZZ();

    void LJIIIZ(Cert cert, boolean z);

    void init(String str);

    void release(Cert cert);

    int removeTrackAlgorithm(int i);

    void setAudioDevice(C1621480sIU c1621480sIU);

    void setControllerCallback(InterfaceC2240011Clr interfaceC2240011Clr);

    void setSensitiveApiCallback(InterfaceC1660900tK4 interfaceC1660900tK4);
}

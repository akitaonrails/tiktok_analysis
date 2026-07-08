package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.s;
import com.ss.ttm.player.x;
import cxo.s0;
import fyo.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oHK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1467000oHK extends C1467790oIb {
    public int LIZLLL;
    public Context LJI;
    public InterfaceC1467090oHT LJII;
    public InterfaceC1467950oIr LJIIIIZZ;
    public C1467280oHm LJIIIZ;
    public int LJIIJ;
    public HashMap<Integer, Integer> LJIIJJI;
    public Surface LJIIL;
    public SurfaceHolder LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public s LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJJI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public long LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public int LJJIJIL;
    public long LJJIJLIJ;
    public s0 LJJIL;
    public int LJJIZ;
    public boolean LJJJ;
    public boolean LJJJJ;
    public int LJJJJI;
    public C1467010oHL LJJJJIZL;
    public int LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public int LJJJJLL;
    public int LJJJJZI;
    public long LJJJLIIL;
    public int LJJJLL;
    public String LJJLI;
    public int LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public boolean LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public e LJJLIIIJLLLLLLLZ;
    public C1467730oIV LJJLIIJ;
    public C1467730oIV LJJLIL;
    public C1467460oI4 LJJLJ;
    public C1467840oIg LJJLJLI;
    public InterfaceC1467440oI2 LJJLL;
    public boolean LJJZ;
    public boolean LJJZZI;
    public boolean LJJZZIII;
    public String LJL;
    public String LJLI;
    public String LJLIIIL;
    public C1467070oHR LJLIIL;
    public String LJ = "";
    public String LJFF = "";
    public int LJIJJ = -1;
    public int LJIJJLI = -1;
    public InterfaceC1467290oHn LJIL = InterfaceC1467290oHn.LIZ;
    public final int LJJ = 1;
    public int LJJIFFI = -1;
    public boolean LJJIJL = true;
    public float LJJJI = -1.0f;
    public float LJJJIL = -1.0f;
    public boolean LJJJJLI = true;
    public int LJJJJZ = 30;
    public int LJJJLZIJ = -1;
    public int LJJJZ = -1;
    public int LJJL = -1;
    public int LJJLIIIIJ = -1;
    public int LJJLIIIJ = -1;

    public final boolean LJJIJIIJIL() {
        return LJJIJL(0) || LJJIJL(1) || LJJIJL(3) || LJJIJL(4);
    }

    public final boolean LJJIJIL() {
        return LJJIJL(2);
    }

    public void LJJIL(int i) {
    }

    public void LJJIZ(InterfaceC1470080oMI interfaceC1470080oMI) {
    }

    public boolean LJJJ(InterfaceC1470080oMI interfaceC1470080oMI, int i, int i2) {
        return false;
    }

    public void LJJJI(InterfaceC1470080oMI interfaceC1470080oMI, int i, int i2) {
    }

    public void LJJJIL(InterfaceC1470080oMI interfaceC1470080oMI) {
    }

    public void LJJJJ(int i, int i2) {
    }

    public void LJJJJI() {
    }

    public void LJJJJIZL(int i, int i2) {
    }

    public final boolean LJIIIZ() {
        C1467070oHR c1467070oHR = this.LJLIIL;
        if (c1467070oHR.LIZIZ != 3 || (!c1467070oHR.LJIJ && this.LJIILL != 2)) {
            return this.LJJJJ;
        }
        boolean z = this.LJJJJ;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        return interfaceC1467950oIr != null ? ((C1470430oMr) interfaceC1467950oIr).LJIIZILJ() : z;
    }

    public final int LJIILIIL() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null) {
            return ((C1470430oMr) interfaceC1467950oIr).getVideoHeight();
        }
        return 0;
    }

    public final int LJIILJJIL() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null) {
            return ((C1470430oMr) interfaceC1467950oIr).getVideoWidth();
        }
        return 0;
    }

    public final int LJJIJIIJI() {
        C1467010oHL c1467010oHL = this.LJJJJIZL;
        if (c1467010oHL != null) {
            return c1467010oHL.LIZ.LIZIZ();
        }
        return 0;
    }

    public final boolean LJJIJLIJ() {
        return ((C1470430oMr) this.LJIIIIZZ).getPlayerType() == 0 || ((C1470430oMr) this.LJIIIIZZ).getPlayerType() == 5 || ((C1470430oMr) this.LJIIIIZZ).getPlayerType() == 3 || ((C1470430oMr) this.LJIIIIZZ).getPlayerType() == 4;
    }

    public final void LJJJJJ() {
        if (this.LJII == null) {
            return;
        }
        C1467280oHm c1467280oHm = new C1467280oHm(this);
        this.LJIIIZ = c1467280oHm;
        this.LJII.setOnPreparedListener(c1467280oHm);
        this.LJII.setOnInfoListener(this.LJIIIZ);
        this.LJII.setOnBufferingUpdateListener(this.LJIIIZ);
        this.LJII.setOnCompletionListener(this.LJIIIZ);
        this.LJII.setOnErrorListener(this.LJIIIZ);
        this.LJII.setOnSeekCompleteListener(this.LJIIIZ);
        this.LJII.setOnVideoSizeChangedListener(this.LJIIIZ);
        this.LJII.setOnSARChangedListener(this.LJIIIZ);
    }

    public void LJJJJJL() {
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(325, 1);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(94, this.LJJJJL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(98, this.LJJJLL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(261, this.LJJJJZI);
        LJJJJL(this.LJJJJ);
        float f = this.LJJJI;
        if (f >= 0.0f) {
            float f2 = this.LJJJIL;
            if (f2 >= 0.0f) {
                LJJJJLI(f, f2);
            }
        }
        if (this.LJLIIL.LIZLLL == 1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(182, this.LJJJJJ);
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(181, this.LJJJJJL);
        }
        if (this.LJIIJ == 5) {
            String str = this.LJJLI;
            if (str != null) {
                ((C1470430oMr) this.LJIIIIZZ).LIZ(5000, str);
            }
            int i = this.LJJLIIIIJ;
            if (i >= 0) {
                ((C1470430oMr) this.LJIIIIZZ).LIZJ(5001, i);
            }
            int i2 = this.LJJLIIIJ;
            if (i2 >= 0) {
                ((C1470430oMr) this.LJIIIIZZ).LIZJ(5002, i2);
            }
            int i3 = this.LJJLIIIJILLIZJL;
            if (i3 >= 0) {
                ((C1470430oMr) this.LJIIIIZZ).LIZJ(5003, i3);
            }
            int i4 = this.LJJLIIIJJI;
            if (i4 >= 0) {
                ((C1470430oMr) this.LJIIIIZZ).LIZJ(5004, i4);
            }
            int i5 = this.LJJLIIIJJIZ;
            if (i5 >= 0) {
                ((C1470430oMr) this.LJIIIIZZ).LIZJ(5005, i5);
            }
        }
    }

    public AbstractC1467000oHK() {
        C1467730oIV c1467730oIV = InterfaceC1467720oIU.LIZ;
        this.LJJLIIJ = c1467730oIV;
        this.LJJLIL = c1467730oIV;
        this.LJL = "";
        this.LJLI = "";
        this.LJLIIIL = "";
    }

    public boolean isMute() {
        return LJIIIZ();
    }

    public void LJ(boolean z) {
        C1471660oOq.LIZJ("TTVideoEngine", C786410Ut5.j4("setIsMute:%s", new Object[]{Boolean.valueOf(z)}));
        this.LJJJJ = z;
        LJJJJL(z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011 A[PHI: r1
      0x0011: PHI (r1v23 int) = (r1v0 int), (r1v0 int), (r1v17 int), (r1v0 int), (r1v20 int), (r1v0 int) binds: [B:7:0x000e, B:21:0x0033, B:25:0x0041, B:14:0x001f, B:18:0x002d, B:10:0x0014] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int LJIIJ(int r6) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1467000oHK.LJIIJ(int):int");
    }

    public final float LJIIJJI(float f) {
        if (this.LJJZZI) {
            getClass();
            return 0.0f;
        }
        return f;
    }

    public final String LJIIL(String str) {
        if (this.LJJZZIII) {
            getClass();
            return null;
        }
        return str;
    }

    public final boolean LJJIJL(int i) {
        int i2;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null) {
            int playerType = ((C1470430oMr) interfaceC1467950oIr).getPlayerType();
            i2 = 2;
            if (playerType != 0) {
                if (playerType != 1) {
                    if (playerType != 2) {
                        i2 = 3;
                        if (playerType != 3) {
                            i2 = 4;
                            if (playerType != 4) {
                                i2 = 5;
                                if (playerType != 5) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("unknown internal player type: ");
                                    sbLIZ.append(playerType);
                                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                                }
                            }
                        }
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = 0;
                }
            }
        } else {
            i2 = this.LJIIJ;
        }
        if (i2 != i) {
            return false;
        }
        return true;
    }

    public final void LJJJJL(boolean z) {
        float f;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null) {
            C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
            if (c1470430oMr.LIZ instanceof C20547315ah) {
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                try {
                    ((C1470430oMr) interfaceC1467950oIr).LJIILLIIL(f, f);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            c1470430oMr.LJ(z);
        }
    }

    public final void LJJJJLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSubTag: ");
        sbLIZ.append(str);
        C1471660oOq.LIZJ("TTVideoEngine", C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF = str;
    }

    public final void LJJJJZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTag: ");
        sbLIZ.append(str);
        C1471660oOq.LIZJ("TTVideoEngine", C2188811AlT.LIZIZ(sbLIZ));
        this.LJ = str;
    }

    public final void LJJJJZI(Map<Integer, Integer> map) {
        int i;
        int i2;
        if (map == null) {
            return;
        }
        int i3 = 0;
        if (this.LJIIJ == 1) {
            i = 1;
        } else {
            i = 0;
        }
        map.put(2, Integer.valueOf(i));
        int i4 = this.LJIIJ;
        if (i4 != 2 && i4 != 5) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        map.put(1, Integer.valueOf(i2));
        HashMap<Integer, Integer> map2 = this.LJIIJJI;
        if (this.LJIIJ == 5) {
            i3 = 1;
        }
        map2.put(26, Integer.valueOf(i3));
        map.put(11, Integer.valueOf(this.LJJI));
        map.put(100, Integer.valueOf(this.LJJ));
        if (this.LJJIFFI >= 0) {
            map.put(27, Integer.valueOf(this.LJJIFFI));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LIZJ(int i, int i2) {
        if (i != 3) {
            if (i != 7) {
                if (i != 85) {
                    boolean z = 0;
                    boolean z2 = false;
                    if (i != 100) {
                        if (i != 117) {
                            if (i != 340) {
                                if (i != 415) {
                                    if (i != 480) {
                                        if (i != 5010) {
                                            if (i != 27) {
                                                if (i != 28) {
                                                    switch (i) {
                                                        case 5001:
                                                            this.LJJLIIIIJ = i2;
                                                            InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
                                                            if (interfaceC1467950oIr != null && ((C1470430oMr) interfaceC1467950oIr).getPlayerType() == 5) {
                                                                ((C1470430oMr) this.LJIIIIZZ).LIZJ(5001, i2);
                                                                break;
                                                            }
                                                            break;
                                                        case 5002:
                                                            this.LJJLIIIJ = i2;
                                                            InterfaceC1467950oIr interfaceC1467950oIr2 = this.LJIIIIZZ;
                                                            if (interfaceC1467950oIr2 != null && ((C1470430oMr) interfaceC1467950oIr2).getPlayerType() == 5) {
                                                                ((C1470430oMr) this.LJIIIIZZ).LIZJ(5002, i2);
                                                                break;
                                                            }
                                                            break;
                                                        case 5003:
                                                            this.LJJLIIIJILLIZJL = i2;
                                                            InterfaceC1467950oIr interfaceC1467950oIr3 = this.LJIIIIZZ;
                                                            if (interfaceC1467950oIr3 != null && ((C1470430oMr) interfaceC1467950oIr3).getPlayerType() == 5) {
                                                                ((C1470430oMr) this.LJIIIIZZ).LIZJ(5003, i2);
                                                                break;
                                                            }
                                                            break;
                                                        case 5004:
                                                            this.LJJLIIIJJI = i2;
                                                            InterfaceC1467950oIr interfaceC1467950oIr4 = this.LJIIIIZZ;
                                                            if (interfaceC1467950oIr4 != null && ((C1470430oMr) interfaceC1467950oIr4).getPlayerType() == 5) {
                                                                ((C1470430oMr) this.LJIIIIZZ).LIZJ(5004, i2);
                                                                break;
                                                            }
                                                            break;
                                                        case 5005:
                                                            this.LJJLIIIJJIZ = i2;
                                                            InterfaceC1467950oIr interfaceC1467950oIr5 = this.LJIIIIZZ;
                                                            if (interfaceC1467950oIr5 != null && ((C1470430oMr) interfaceC1467950oIr5).getPlayerType() == 5) {
                                                                ((C1470430oMr) this.LJIIIIZZ).LIZJ(5005, i2);
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                    return;
                                                }
                                                this.LJJJJZ = i2;
                                                return;
                                            }
                                            this.LJJJJLL = i2;
                                            return;
                                        }
                                        if (i2 != 0) {
                                            z2 = true;
                                        }
                                        this.LJJLIIIJL = z2;
                                        return;
                                    }
                                    this.LJJJJZI = i2;
                                    this.LJJJLIIL = System.currentTimeMillis();
                                    InterfaceC1467950oIr interfaceC1467950oIr6 = this.LJIIIIZZ;
                                    if (interfaceC1467950oIr6 == null) {
                                        return;
                                    }
                                    ((C1470430oMr) interfaceC1467950oIr6).LIZJ(261, i2);
                                    return;
                                }
                                this.LJJJJL = i2;
                                InterfaceC1467950oIr interfaceC1467950oIr7 = this.LJIIIIZZ;
                                if (interfaceC1467950oIr7 == null) {
                                    return;
                                }
                                ((C1470430oMr) interfaceC1467950oIr7).LIZJ(94, i2);
                                return;
                            }
                            this.LJJJLL = i2;
                            InterfaceC1467950oIr interfaceC1467950oIr8 = this.LJIIIIZZ;
                            if (interfaceC1467950oIr8 == null) {
                                return;
                            }
                            ((C1470430oMr) interfaceC1467950oIr8).LIZJ(98, i2);
                            return;
                        }
                        x.LJI(4, i2);
                        return;
                    }
                    if (i2 != 0) {
                        z = 1;
                    }
                    this.LJJJJLI = z;
                    InterfaceC1467950oIr interfaceC1467950oIr9 = this.LJIIIIZZ;
                    if (interfaceC1467950oIr9 == null) {
                        return;
                    }
                    ((C1470430oMr) interfaceC1467950oIr9).LIZJ(196, !z);
                    return;
                }
                this.LJJIFFI = i2;
                return;
            }
            this.LJLIIL.LIZLLL = i2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hardware enable = ");
            sbLIZ.append(this.LJLIIL.LIZLLL);
            C1471660oOq.LIZJ("TTVideoEngine", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1467950oIr interfaceC1467950oIr10 = this.LJIIIIZZ;
            if (interfaceC1467950oIr10 == null) {
                return;
            }
            ((C1470430oMr) interfaceC1467950oIr10).LIZJ(59, i2);
            return;
        }
        this.LJJI = i2;
        x.LJI(11, i2);
    }

    public void LJIILLIIL(float f, float f2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVolume left:");
        sbLIZ.append(f);
        sbLIZ.append(" right:");
        sbLIZ.append(f2);
        C1471660oOq.LIZJ("TTVideoEngine", C2188811AlT.LIZIZ(sbLIZ));
        this.LJJJI = f;
        this.LJJJIL = f2;
        LJJJJLI(f, f2);
    }

    public final void LJJJJLI(float f, float f2) {
        float f3;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr == null) {
            return;
        }
        if (this.LJJJJL == 0 && !LJJIJIIJIL()) {
            if (f != 0.0f) {
                f3 = 1.0f;
                f2 = 1.0f;
            } else {
                f3 = f;
            }
            AudioManager audioManager = (AudioManager) C786410Ut5.H2(this.LJI, "audio");
            if (audioManager != null) {
                audioManager.setStreamVolume(3, (int) f, 0);
            }
            f = f3;
        }
        ((C1470430oMr) interfaceC1467950oIr).LJIILLIIL(f, f2);
    }
}
